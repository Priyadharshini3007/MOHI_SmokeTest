package com.automation.steps;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ProcurementpageSteps extends BaseClass {

	@Then("^enter the requisitioncode$")
	public void verifytherequisitioncode(){
		helper();
		procurementpage.verifytherequisitionlist();
	}

	@Then("^enter the requisitioncode as \"(.*?)\"$")
	public void entertherequisitioncodeas(String requisitioncode){
		helper();
		procurementpage.requisitionlist(requisitioncode);
	}

	@And("^verify the view requisition button$")
	public void verifyviewrequisitionbutton(){
		helper();
		procurementpage.verifyviewrequisitionbutton();
	}

	@When("^navigate to main page$")
	public void navigatetomainpage(){
		helper();
		procurementpage.navigatetomainpage();
	}

	@Then("^click on the approve and deny button$")
	public void verifyapproveanddenybutton(){
		procurementpage.verifyapproveanddenybutton();
	}

	@Then("^verify the clearfilter button$")
	public void verifyclearfilterbutton(){
		helper();
		procurementpage.verifytheclearfilterbutton();
	}

	@And("^verify the lpocode field \"(.*?)\"$")
	public void verifylpocode(String lpocode){
		procurementpage.verifywithlposearch(lpocode);
	}

	@Then("^verify the goods received icon$")
	public void verifygoodsreceivediconbutton(){
		procurementpage.verifygoodsreceivediconbutton();
	}

	@And("^verify the initiate lpo cancellation icon$")
	public void verifyinitiatelpocancellationicon(){
		procurementpage.verifyinitiatelpocancellation();
	}

	@Then("^select the from date field$")
	public void selectthefromdatefield(){
		helper();
		procurementpage.selectafromdate();
	}

	@And("^select the to date field$")
	public void selectthetodatefield(){
		helper();
		procurementpage.selecttodate();
	}

	@Then("^choose the centre field \"(.*?)\"$")
	public void choosethecentrefield(String centre){
		procurementpage.choosecentrefield(centre);
	}

	@When("^submit the search button$")
	public void submitsearchbutton(){
		helper();
		procurementpage.selectgobuttonfield();
	}

	@And("^select the paid status \"(.*?)\"$")
	public void selectpaidstatusfield(String status){
		procurementpage.choosethestatus(status);
	}

	@Then("^click on Find records$")
	public void clickfindrecordds(){
		procurementpage.clickonfindrecords();
	}

	@Then("^search with lpocode field \"(.*?)\"$")
	public void searchwithlpofield(String lpo){
		procurementpage.searchwithlpofield(lpo);
	}

	@When("^Click on the approved requisitions waiting for LPO creation alert$")
	public void ClickontheapprovedrequisitionswaitingforLPOcreationalert(){
		helper();
		procurementpage.createlpolink();
	}

	@And("^proceed with create an LPO$")
	public void createanlpo(){
		procurementpage.createlpoicon();
	}

	@Then("^enter the lpostartdate$")
	public void enterlpostartdate(){
		procurementpage.enterlpostartdate();
	}

	@And("^enter the lpoenddate$")
	public void enterlpoenddate(){
		procurementpage.enterlpoenddate();
	}

	@Then("^fill the cost \"([^\"]*)\" and select \"([^\"]*)\"$")
	public void fillthecostandselect(String item,String supplier) throws InterruptedException{
		procurementpage.selectthechekboxes(item,supplier);
	}

	@And("^click on the createlpo button$")
	public void clickoncreatelpo() throws InterruptedException{
		procurementpage.createlpobutton();
	}

	@Given("^Approve based on the GrandAmount$")
	public void approve_based_on_the_GrandAmount() throws Throwable {

		helper();
		LoginPage lg =new LoginPage();
		String[] approver = new String[]{} ;
		Float ksh=Float.parseFloat(BaseClass.lpoAmt);

		if(ksh<=100000)
		{
			approver = new String[] {"financemanager"};
		}

		else if(ksh>=100000)
		{
			approver = new String[] {"financemanager","director"};
		}
		for (int i = 0; i < approver.length; i++) {

			lg.excelusername(approver[i]);
			lg.submit();
			lg.secquestion();
			lg.submit();
			lg.password();
			lg.submit();

			procurementpage.clicklpoapprovallink();

			procurementpage.searchLPOCode();

			procurementpage.verifyapproveanddenybutton();

			procurementpage.LPOApproval();

			Thread.sleep(1000);

			hta.logout();

		}
	}

	@Then("^click on the lpo approval link$")
	public void clickonlpoapproval(){
		helper();
		procurementpage.clicklpoapprovallink();
	}

	@And("^click on approval denial workflow icon$")
	public void clickonapprovalicon(){
		procurementpage.verifyapproveanddenybutton();
	}

	@Then("^enter comments and deny the application$")
	public void denytheapplication(){
		procurementpage.denialprocess();
	}

	@Then("^Click LPOs ready for payment alert$")
	public void clickonlpopaymentalert(){
		procurementpage.lpopaymentlink();
	}

	@Then("^Click LPO payment requests approved alert$")
	public void clickonlpopaymentrequestsapprovedalert(){
		procurementpage.LPOPayReqApproveAlertFn();
	}

	@And("^Click on Initiate LPO Payment button$")
	public void initiatelpolinkbutton(){
		procurementpage.initiatelpopaymentbutton();
	}

	@Then("^enter comments and save lpo paymenent$")
	public void entercommentsandsavelpopayment(){
		procurementpage.enterlpopaymentcomments();
	}

	@Then("^Click on the LPO payment waiting for approval alert$")
	public void clickonlpopaymentwaitingforapprovalalert(){
		procurementpage.lpoPaymentApprovalAlert();
	}

	@And("^Enter the comments and Click save button$")
	public void EnterthecommentsandClicksavebutton(){
		procurementpage.enterlpopaymentcomments();
	}

	@Then("^Click the LPOs waiting for approval alert$")
	public void click_the_LPO_waiting_for_approval_alert() throws Throwable {
		procurementpage.clicklpoapprovallink();
	}

	@When("^Click the View LPO Approval workflow icon$")
	public void ClicktheViewLPOApprovalworkflowicon() throws Throwable {
		procurementpage.verifyapproveanddenybutton();
	}

	@Then("^Verify the user intimation that LPO is approved$")
	public void Verify_the_user_intimation_that_LPO_is_approved() throws InterruptedException{
		procurementpage.LpoUserIntimationMsg();
	}

	@Then("^Click the LPO need clarification alert$")
	public void click_the_LPO_need_clarification_alert() throws Throwable {
		procurementpage.NeedClarificationAlertFn();
	}

	@Then("^Click the LPO received information alert$")
	public void click_the_LPO_need_information_alert() throws Throwable {
		procurementpage.sendClarAlertFn();
	}
	
	@Then("^Click the LPO payment need clarification alert$")
	public void click_the_LPO_payment_need_clarification_alert() throws Throwable {
		procurementpage.LPOPayNeedInfoAlertFns();
	}

	@Then("^Click the LPO payment received information alert$")
	public void click_the_LPO_payment_need_information_alert() throws Throwable {
		procurementpage.LPOPaySendInfoAlertFns();
	}

	@Then("^Click on deny button$")
	public void click_on_deny_button() throws Throwable {
		procurementpage.denialprocess();
	}

	@Then("^Click on Send for clarification to Previous Step button$")
	public void click_on_Send_for_clarification_to_Previous_Step_button() throws Throwable {
		helper();
		procurementpage.NeedClarificationBtnFn();
	}

	@Then("^Click on Send for Clarification to Procurement Manager button$")
	public void click_on_Send_for_clarification_to_Procurement_Manager_button() throws Throwable {
		procurementpage.NeedClarificationFromPMBtnFn();
	}

	@Then("^Click on Send clarification button$")
	public void click_on_send_clarification_button() throws Throwable {
		procurementpage.sendClarBtnFn();
	}

	@Then("^Click on approve button$")
	public void click_on_approve_button() throws Throwable {
		procurementpage.LPOApproval();
	}

	@Then("^Click the denied LPO alert$")
	public void click_the_denied_LPO_alert() throws Throwable {
		procurementpage.lpoDeniedAlertFn();
	}

	@Then("^Click the denied LPO cancellation alert$")
	public void click_the_denied_LPO_cancellation_alert() throws Throwable {
		procurementpage.lpoDeniedCancellationAlertFn();
	}

	@Then("^Click the denied LPO Payment request alert$")
	public void click_the_denied_LPO_payment_request_alert() throws Throwable {
		procurementpage.LPOPayDenyAlertFn();
	}

	@Then("^verify the LPO code is available in denied alert$")
	public void verify_the_LPO_code_is_available_in_denied_alert() throws Throwable {
		procurementpage.deniedLPO();
	}

	@Then("^verify the LPO code is available in LPO payment denied alert$")
	public void verify_the_LPO_code_is_available_in_LPO_payment_denied_alert() throws Throwable {
		procurementpage.LPOPyamentDeniedStatusFn();
	}

	//LPO Cancellation submission

	@When("^Click LPOs not delivered within the period of performance alert$")
	public void click_LPOs_not_delivered_within_the_period_of_performance_alert() throws Throwable {
		helper();
		procurementpage.LPOsNotDeliveredFn();
	}

	@When("^Click Initiate LPO Cancellation icon$")
	public void click_initiate_LPO_cancellation_icon() throws Throwable {
		procurementpage.LPOCancellationApprovalicon();
	}

	@When("^Enter the comments and Approve Lpo Cancellation$")
	public void enter_the_comments_and_Approve_Lpo_Cancellation() throws Throwable {
		procurementpage.LPOCancellationApproval();
	}

	@When("Verify the LPO status$")
	public void Verify_the_LPO_status() throws Throwable {
		procurementpage.cancelledLPOStatus();		
	}

	@When("Verify the LPO Payment approve status$")
	public void Verify_the_LPO_payment_approve_status() throws Throwable {
		procurementpage.LPOPyamentStatusFn();		
	}

	//LPO Cancellation Approval

	@And("^Click LPO cancellation waiting for approval Alert$")
	public void click_LPO_cancellation_waiting_for_approval_Alert() throws Throwable {
		helper();
		procurementpage.LPOCancelApprAlertFn();
	}

	@And("^Click the LPO cancellation requests need information alert$")
	public void click_LPO_cancellation_requests_need_information_alert() throws Throwable {
		procurementpage.LPOCancelNeedInfoAlertFn();
	}

	@And("^Click the LPO Cancellation requests received more information alert$")
	public void click_LPO_cancellation_requests_received_more_information_alert() throws Throwable {
		procurementpage.LPOCancelSendInfoAlertFn();
	}

	@And("^Click Approve/Deny Lpo Cancellation icon$")
	public void click_Approve_Deny_Lpo_Cancellation_icon() throws Throwable {
		procurementpage.LPOCancellationApprovalicon();
	}

	@When("^Search the LPO Code$")
	public void search_the_LPO_Code() throws Throwable {
		helper();
		procurementpage.searchLPOCode();
	}

	//LPO Cancellation Denied

	@And("^Enter the comments and Deny Lpo Cancellation$")
	public void enter_the_comments_and_Deny_Lpo_Cancellation() throws Throwable {
		procurementpage.denialprocess();
	}

	@And("^Click on Approve/Deny LPO Payment icon$")
	public void ClickonApproveDenyLPOPaymenticon() throws Throwable {
		procurementpage.LPOPaymentIconFn();
	}

	@Given("^Complete the LPO Payment approve process$")
	public void CompletetheLPOPaymentapproveprocess() throws Throwable {

		helper();
		LoginPage lg =new LoginPage();
		String[] approver = new String[]{} ;
		approver = new String[] {"financemanager","directorproc","executivedirectorproc"};

		for (int i = 0; i < approver.length; i++) {

			lg.excelusername(approver[i]);
			lg.submit();
			lg.secquestion();
			lg.submit();
			lg.password();
			lg.submit();

			procurementpage.lpoPaymentApprovalAlert();

			procurementpage.searchLPOCode();

			procurementpage.LPOPaymentIconFn();

			procurementpage.LPOApproval();

			Thread.sleep(1000);

			hta.logout();

		}
	}
	
	@Given("^Complete the LPO Payment approve process for \"([^\"]*)\"$")
	public void CompletetheLPOPaymentapproveprocessfor(String approver) throws Throwable {

		helper();
		LoginPage lg =new LoginPage();
		String[] approvers = new String[]{};
		
		if(approver.trim().toLowerCase().equals("financemanager")){
			approvers = new String[] {"financemanagerproc"};
		}
		else if(approver.trim().toLowerCase().equals("director")){
			approvers = new String[] {"financemanagerproc","directorproc"};
		}
		else if(approver.trim().toLowerCase().equals("executivedirector")){
			approvers = new String[] {"financemanagerproc","directorproc","executivedirectorproc"};
		}
		
		for (int i = 0; i < approvers.length; i++) {

			lg.excelusername(approvers[i]);
			lg.submit();
			lg.secquestion();
			lg.submit();
			lg.password();
			lg.submit();

			procurementpage.lpoPaymentApprovalAlert();
			procurementpage.searchLPOCode();
			procurementpage.LPOPaymentIconFn();
			procurementpage.LPOApproval();
			Thread.sleep(1000);
			hta.logout();
		}
	}

	@When("^Select the checkbox against the record$")
	public void select_the_checkbox_against_the_record() throws Throwable {
		procurementpage.BankDepositNoChckBxFn();
	}

	@When("^Click Add Bank deposit slip number for the chosen LPOs button$")
	public void click_Add_Bank_deposit_slip_number_for_the_chosen_LPOs_button() throws Throwable {
		procurementpage.AddbankDepositSlipNoIconFn();
	}

	@When("^Enter the Bank Deposit Slip Number details and click save button$")
	public void enter_the_Bank_Deposit_Slip_Number_details_and_click_save_button() throws Throwable {
		procurementpage.BankDepositSlipNumberFn();
	}

	@Then("^Verify the user intimation that Bank Deposit Slip Number details are saved$")
	public void verify_the_user_intimation_that_Bank_Deposit_Slip_Number_details_are_saved() throws Throwable {
		procurementpage.LpoBankSlipNoUpdateMsg();
	}

	@When("^Verify the LPO status after saving Bank Deposit Slip Number details$")
	public void verify_the_LPO_status_after_saving_Bank_Deposit_Slip_Number_details() throws Throwable {
		procurementpage.LPOPaidStatusFn();
	}

}
