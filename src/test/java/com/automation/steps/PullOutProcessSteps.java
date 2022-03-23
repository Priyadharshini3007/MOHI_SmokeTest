package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class PullOutProcessSteps extends BaseClass{
	
	@When("^Select the student type to initiate pull out$")
	public void select_the_student_type_to_initiate_pull_out() throws InterruptedException{
		helper();
		p.StudentTypeFn();
	}

	@When("^Enter the CMFID in search$")
	public void enter_the_CMFID_in_search() throws InterruptedException {
		p.searchBoxFn();
	}

	@When("^Click the pull out icon$")
	public void click_the_pull_out_icon() throws InterruptedException{
		p.pullOutInitiateIconFn();
	}

	@When("^Enter the Pull Out Date$")
	public void enter_the_Pull_Out_Date() throws Throwable {
		p.dateclickFn();
	}

	@When("^Enter the Comments$")
	public void enter_the_Comments() throws Throwable {
		helper();
		p.pullOutReason();
	}

	@When("^Click the Submit button$")
	public void click_the_Submit_button() throws Throwable {
		helper();
		p.pullOutSubmit();
	}

	@And("^Click the waiting for approval alert$")
	public void click_the_waiting_for_approval_alert(){
		helper();
		p.approvalAlertFn();
	}
	
	@And("^Click the pull out approve icon$")
	public void click_the_pull_out_approve_icon() throws InterruptedException {
		p.pullOutIconFn();
	}

	@And("^Click the 'Approve and Send to Next Step' button$")
	public void click_the_Approve_and_Send_to_Next_Step_button(){
		p.pullOutApproveBtn();
	}

	@When("^log out the profile$")
	public void log_out_the_user(){
		helper();
		p.logOutFn();
	}
	
	@And("^Verify the child status$")
	public void verify_the_child_status() {
		p.statusCheck();
	}
	
	@And("^Click the 'Deny and Close Application' button$")
	public void click_the_Deny_and_Close_Application_button() {
		p.pullOutDenialBtn();
	}
	
	@And("^Click the yes button to confirm the deny process$")
	public void click_the_yes_button_to_confirm_the_deny_process() {
		p.DenialConfirmation();
	}
	
	@And("^Click the 'Send for Clarification to Previous Step' button$")
	public void click_the_Send_for_Clarification_to_Previous_Step_button() {
		p.pullOutNeedInfoBtn();
	}

	@And("^Click the 'Send for Clarification to Social Worker' button$")
	public void click_the_Send_for_Clarification_to_Social_Worker_button() {
		p.pullOutNeedInfoFrmSWBtn();
	}
	
	@And("^Click the alert - requests need more information$")
	public void click_the_alert_requests_need_more_information()  {
		helper();
		p.needInfoAlertFn();
	}	
	
	@And("^Click the 'Send Clarification' button$")
	public void click_the_Send_Clarification_button() {
		p.pullOutSendClarFnBtn();
	}
	
	@And("^Click the alert - received more information$")
	public void click_the_alert_received_more_information() {
		helper();
		p.receivedInfoAlertFn();
	}
	
	@Given("^Click the denied student pullout alert$")
	public void click_the_denied_student_pullout_alert() {
		helper();
		p.deniedAlertFn();
	}
	
}
