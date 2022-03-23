package com.automation.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import com.automation.pages.BaseClass;

import com.automation.pages.LoginPage;
import com.automation.utils.excelutil;

public class CenterAndDeptBasedReimbursementCreationAndApprovalSteps extends BaseClass {

	@Given("^Click Submit Reimbursement from My Functions tab$")
	public void click_Submit_Reimbursement_from_My_Functions_tab() throws Throwable {
		helper();
		cadbrcaa.reimbursementRedirection();
	}

	@Given("^Fill the reimbursement mandatory fields in the \"([^\"]*)\" and click Add icon to the items$")
	public void fill_the_reimbursement_mandatory_fields_in_the_and_click_Add_icon_to_the_items(String requisitiontype)
			throws Throwable {
		cadbrcaa.reimbursementFieldEnter(requisitiontype);
	}

	@Given("^click delete icon to delete the reimbursement items$")
	public void click_delete_icon_to_delete_the_reimbursement_items() throws Throwable {
		cadbrcaa.reimbursementDelete();
	}

	@Given("^click submit reimbursement button to submit the reimbursement$")
	public void click_submit_reimbursement_button_to_submit_the_reimbursement() throws Throwable {
		cadbrcaa.submitForm();
		hta.logout();
	}

	@Given("^reimbursement Approve based on the KSH in the \"([^\"]*)\"$")
	public void reimbursement_Approve_based_on_the_KSH_in_the(String requisitiontype) throws Throwable {

		helper();
		LoginPage lg =new LoginPage();
		String[] approver = new String[]{} ;
		int ksh=Integer.parseInt(excelutil.getData(26, 1, 4));
		if(requisitiontype.toLowerCase().equals("centre"))
		{
			if(ksh<=200000)
			{
				approver = new String[] {"headteacher", "educationcoordinator","financemanager"};
			}
			else if(ksh >= 200001 && ksh<=500000)
			{
				approver = new String[] {"headteacher", "educationcoordinator", "educationmanager","financemanager"};
			}
			else if(ksh >= 500001 && ksh<=999999)
			{
				approver = new String[] {"headteacher", "educationcoordinator", "educationmanager","missionsdir","financemanager"};
			}
			else if(ksh>=1000000)
			{
				approver = new String[] {"headteacher","educationcoordinator","educationmanager","missionsdir","financemanager","ceo"};
			}
		}
		else
		{
			if(ksh<=500000)
			{
				approver = new String[] {"headofdepartment","financemanager"};
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

			cadbrcaa.approveKSH(approver[i],requisitiontype);
			Thread.sleep(1000);

			if (approver.length-1 != i)
			{
				hta.logout();
			}
		}
	}
	
	@Given("^reimbursement Approve partially based on the KSH in the \"([^\"]*)\"$")
	public void reimbursement_Approve_partially_based_on_the_KSH_in_the(String requisitiontype) throws Throwable {

		helper();
		LoginPage lg =new LoginPage();
		String[] approver = new String[]{} ;
		int ksh=Integer.parseInt(excelutil.getData(26, 1, 4));
		if(requisitiontype.toLowerCase().equals("centre"))
		{
			if(ksh<=200000)
			{
				approver = new String[] {"headteacher", "educationcoordinator","financemanager"};
			}
			else if(ksh >= 200001 && ksh<=500000)
			{
				approver = new String[] {"headteacher", "educationcoordinator", "educationmanager","financemanager"};
			}
			else if(ksh >= 500001)
			{
				approver = new String[] {"headteacher", "educationcoordinator", "educationmanager","missionsdir","financemanager"};
			}
		}
		else
		{
			if(ksh<=500000)
			{
				approver = new String[] {"headofdepartment","financemanager"};
			}
			else if(ksh >= 500001)
			{
				approver = new String[] {"headofdepartment", "financemanager","director"};
			}
		}
		for (int i = 0; i < approver.length; i++) {

			lg.excelusername(approver[i]);
			lg.submit();
			lg.secquestion();
			lg.submit();
			lg.password();
			lg.submit();

			cadbrcaa.approveKSH(approver[i],requisitiontype);
			Thread.sleep(1000);

			if (approver.length-1 != i)
			{
				hta.logout();
			}
		}

	}
	
	@When("^CEO should navigate to finalpage and click sendforclarification as \"([^\"]*)\" for reimbursement approval$")
	public void ceo_should_navigate_to_finalpage_and_click_sendforclarification_as_for_reimbursement_approval(String SendForClarificationType)
			throws Throwable {

		helper();
		LoginPage lg =new LoginPage();
		hta.logout();
		
		if(SendForClarificationType.toLowerCase().equals("centre")){
			lg.excelusername("financemanager");
		}
		else{
			lg.excelusername("director");
		}
		
		lg.submit();
		lg.secquestion();
		lg.submit();
		lg.password();
		lg.submit();

		cadbrcaa.sendMoreInformationToCEO(SendForClarificationType);

		hta.logout();

		lg.excelusername("ceo");
		lg.submit();
		lg.secquestion();
		lg.submit();
		lg.password();
		lg.submit();

		cadbrcaa.receivedMoreInformation(SendForClarificationType);
	}
	
	@When("^CEO click on the Reimbursement Waiting for approval link in the myalerts tab as \"([^\"]*)\"$")
	public void ceo_click_on_the_Reimbursement_Waiting_for_approval_link_in_the_myalerts_tab_as(String arg1) throws Throwable {
		helper();
		cadbrcaa.sendForClarificationreimbursementKSH(arg1);
	}

	@When("^CEO should navigate to finalpage and click send for clarification as  \"([^\"]*)\"$")
	public void ceo_should_navigate_to_finalpage_and_click_send_for_clarification_as(String arg1) throws Throwable {

		helper();
		LoginPage lg = new LoginPage();

		hta.logout();

		if(arg1.toLowerCase().equals("centre"))
		{
			lg.enterusername("financemanager");
			lg.submit();
			lg.secquestion();
			lg.submit();
			lg.password();
			lg.submit();
		}

		else
		{
			lg.enterusername("director");
			lg.submit();
			lg.secquestion();
			lg.submit();
			lg.password();
			lg.submit();
		}

		cadbrcaa.sendMoreClarificationreimbursementKSH(arg1);

		hta.logout();
		lg.enterusername("ceo");
		lg.submit();
		lg.secquestion();
		lg.submit();
		lg.password();
		lg.submit();

		cadbrcaa.receivedMoreClarificationreimbursementKSH(arg1);

		hta.logout();
	}
	
	@When("^CEO click on the Reimbursement Waiting for approval link in the myalerts tab amd filter the claim as \"([^\"]*)\"$")
	public void ceo_click_on_the_Reimbursement_Waiting_for_approval_link_in_the_myalerts_tab_amd_filter_the_claim_as(String arg1) throws Throwable {
		helper();
		cadbrcaa.deniedreimbursementKSH(arg1);
	}

	@When("^CEO should navigate to finalpage and click Denied button as \"([^\"]*)\"$")
	public void ceo_should_navigate_to_finalpage_and_click_Denied_button_as(String arg1) throws Throwable {
		cadbrcaa.CEOdeniedreimbursement(arg1);
	}

}
