package com.automation.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.utils.excelutil;

public class CenterAndDeptBasedRequisitionCreationAndApprovalSteps extends BaseClass {

	@Given("^Click Submit Requisition from My Functions tab$")
	public void click_Submit_Requisition_from_My_Functions_tab() throws Throwable {
		helper();
		rc.requisitionCreation();
	}

	@Given("^Fill the mandatory fields in the \"([^\"]*)\"$")
	public void fill_the_mandatory_fields_in_the(String requisitionType) throws Throwable {
		rc.requisitionCreationdetails(requisitionType);
	}

	@Given("^Select Itemtype,Itemname,ItemQuantity,Units,ItemRate,Items and click Add icon to the items$")
	public void select_Itemtype_Itemname_ItemQuantity_Units_ItemRate_Items_and_click_Add_icon_to_the_items() throws Throwable {
		rc.addItems();
	}

	@Given("^click edit icon to edit the items$")
	public void click_edit_icon_to_edit_the_items() throws Throwable {
		rc.edititem();
	}

	@Given("^click delete icon to delete the items$")
	public void click_delete_icon_to_delete_the_items() throws Throwable {
		rc.deleteitem();
	}

	@Given("^click submit requisition button to submit the requisition$")
	public void click_submit_requisition_button_to_submit_the_requisition() throws Throwable {
		rc.submititem();
		hta.logout();
	}

	@Given("^Click the requisition waiting for \"([^\"]*)\" approval alert and approve$")
	public void click_the_requisition_waiting_for_approval_alert_and_approve(String requisitionType) throws Throwable {
		rc.requisitionApprovalAlert(requisitionType);
	}

	@Given("^Approve based on the KSH in the \"([^\"]*)\"$")
	public void approve_based_on_the_KSH_in_the(String requisitionType) throws Throwable {
		helper();
		LoginPage lg = new LoginPage();
		String[] approver = new String[]{} ;
		int ksh=Integer.parseInt(excelutil.getData(24, 1, 15));
		if(requisitionType.toLowerCase().equals("centre"))
		{
			if(ksh<=200000)
			{
				approver = new String[] {"headteacher", "educationcoordinator"};
			}
			else if(ksh >= 200001 && ksh<=500000)
			{
				approver = new String[] {"headteacher", "educationcoordinator", "educationmanager"};
			}
			else if(ksh >= 500001 && ksh<=999999)
			{
				approver = new String[] {"headteacher", "educationcoordinator", "educationmanager","director"};
			}
			else if(ksh>=1000000)
			{
				approver = new String[] {"headteacher", "educationcoordinator", "educationmanager","director","ceo"};
			}
		}
		else
		{
			if(ksh<=500000)
			{
				approver = new String[] {"headofdepartment"};
			}
			else if(ksh >= 500001 && ksh<=999999)
			{
				approver = new String[] {"headofdepartment","financemanager","director"};
			}
			else if(ksh >999999)
			{
				approver = new String[] {"headofdepartment","financemanager","director","ceo"};
			}
		}
		for (int i = 0; i < approver.length; i++) {

			lg.excelusername(approver[i]);
			lg.submit();
			lg.secquestion();
			lg.submit();
			lg.password();
			lg.submit();

			rc.requisitionApproval(approver[i],requisitionType);
			Thread.sleep(1000);

			if (approver.length-1 != i)
			{
				hta.logout();
			}
		}
	}

	//Send Clarification

	@When("^CEO click on the Requisition Waiting for approval link in the myalerts tab as \"([^\"]*)\"$")
	public void ceo_click_on_the_Requisition_Waiting_for_approval_link_in_the_myalerts_tab_as(
			String SendForClarificationType) throws Throwable {
		helper();
		rc.requisitionWaitingforApprovalLink(SendForClarificationType);
	}

	@When("^CEO enter the RequisitionCode and click on approval icon$")
	public void ceo_enter_the_RequisitionCode_and_click_on_approval_icon() throws Throwable {
		rc.filterRequisitionCode();
	}
	
	@When("^CEO should navigate to finalpage and click sendforclarification as \"([^\"]*)\"$")
	public void ceo_should_navigate_to_finalpage_and_click_sendforclarification_as(String SendForClarificationType)
			throws Throwable {

		helper();
		LoginPage lg =new LoginPage();
		rc.centerBasedSendForClarification();
		hta.logout();
		
		if(SendForClarificationType.toLowerCase().equals("centre")){
			lg.excelusername("missionsdir");
		}
		else{
			lg.excelusername("director");
		}
		lg.submit();
		lg.secquestion();
		lg.submit();
		lg.password();
		lg.submit();

		rc.sendMoreInformationToCEO(SendForClarificationType);

		hta.logout();

		lg.excelusername("ceo");
		lg.submit();
		lg.secquestion();
		lg.submit();
		lg.password();
		lg.submit();

		rc.receivedMoreInformation(SendForClarificationType);
	}

	//Denied

	@When("^CEO should navigate to finalpage and click Denied as \"([^\"]*)\"$")
	public void ceo_should_navigate_to_finalpage_and_click_Denied_as(String Denied) throws Throwable {
		helper();
		rc.ceorequisitionDenied(Denied);
	}

}
