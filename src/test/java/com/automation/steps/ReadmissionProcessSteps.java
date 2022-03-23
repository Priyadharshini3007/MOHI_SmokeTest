package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;


public class ReadmissionProcessSteps extends BaseClass{
	
	@When("^Enter the CMFID as \"(.*?)\" in search box$")
	public void enter_the_CMFID_as_in_search_box(String CmfID) throws Throwable {
		helper();
		R.searchBoxFn(CmfID);
	}

	@When("^Click the Re-admission icon$")
	public void click_the_Re_admission_icon() throws InterruptedException {
		R.readmissionIconFn();
	}

	@When("^Enter the Re-admission Date$")
	public void enter_the_Re_admission_Date() throws InterruptedException {
		R.dateclickFn();
	}

	@When("^Enter the Reason for Re-admission$")
	public void enter_the_Reason_for_Re_admission() {
		R.readmissionReason();
	}

	@When("^Click the Submit button for Re-admission$")
	public void click_the_Submit_button_for_Re_admission() {
		R.readmissionSubmit();	 
	}
	
	@When("^Click the waiting for Re-admission approval alert$")
	public void click_the_waiting_for_Re_admission_approval_alert() throws InterruptedException {
		helper();
		R.approvalAlertFn();
	}

	@When("^Click the 'Approve' button$")
	public void click_the_Approve_button() {
		R.readmissionApproveBtn();
	}
	
	@When("^Verify the child status after Re-admission$")
	public void verify_the_child_status_after_Re_admission() {
		R.statusCheck();
	}
	
	@When("^Select the class as \"(.*?)\" and section as \"(.*?)\"$")
	public void select_the_class_as_and_section_as(String classes, String sections) throws Throwable {
		R.classSectionFn(classes, sections);
	}
	
	@When("^Click the Re-admission need clarification button$")
	public void click_the_Re_admission_need_clarification_button() throws Throwable {
		R.readmissionNeedInfoBtn();
	}

	@When("^Click the requests need more information alert$")
	public void click_the_requests_need_more_information_alert() throws Throwable {
		R.needInfoAlertFn();
	}

	@When("^Click the Re-admission Send Clarification button$")
	public void click_the_Re_admission_Send_Clarification_button() throws Throwable {
		R.readmissionSendClarFnBtn();
	}

	@When("^Click the received more information alert$")
	public void click_the_received_more_information_alert() throws Throwable {
		R.receivedInfoAlertFn();
	}

	@When("^Click the 'Deny' button$")
	public void click_the_Deny_button() throws Throwable {
		R.readmissionDenialBtn();
	}
	
	@When("^Click the denied student readmission alert$")
	public void click_the_denied_student_readmission_alert() throws Throwable {
		R.deniedAlertFn();
	}
	
	@When("^Click the yes button to confirm the deny process on readmission$")
	public void click_the_yes_button_to_confirm_the_deny_process_on_readmission() {
		R.DenialConfirmation();
	}
	
	@When("^Enter the new fees structure$")
	public void enter_the_new_fees_structure() throws Throwable {
		R.newfeeStructurefn();
	}
	
	//Newly Added
	
	@When("^Click View Profile$")
	public void click_View_Profile() throws Throwable {
		R.Profileicon();
	}

	@When("^Collect Student Class Information$")
	public void collect_Student_Class_Information() throws Throwable {
	   R.StudentClassInfo();
	}

	@When("^Navigate back$")
	public void navigate_back() throws Throwable {
	  R.backPage();
	}

	@When("^Pass the class information of the student$")
	public void pass_the_class_information_of_the_student() throws Throwable {
		helper();
		feeMasterEntry.getText();
		
	}
	
	@When("^get the text from the selected class and center$")
	public void get_the_text_from_the_selected_class_and_center() throws Throwable {
		helper();
		feeMasterEntry.getAssignedfromFeeMaster();
	}

	@When("^Verify All the fees related to that class get reflected$")
	public void verify_All_the_fees_related_to_that_class_get_reflected() throws Throwable {
		helper();
		feeMasterEntry.getTextfromHT();
	}
	
	
	

}
