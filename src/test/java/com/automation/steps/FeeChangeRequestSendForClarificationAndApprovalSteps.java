package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class FeeChangeRequestSendForClarificationAndApprovalSteps extends BaseClass{
	
	@Given("^click Change Fee Structure Link in My Functions$")
	public void click_Change_Fee_Structure_Link_in_My_Functions() throws Throwable {
		helper();
		fcr.ChangeFeeStructure();


	}

	@Given("^Enter the student name to change the  fee structure$")
	public void enter_the_student_name_to_change_the_fee_structure() throws Throwable {
	   
		fcr.EnterStudentNameForFeeChange();
	}

	@Given("^Enter the propose new fee structure details and click submit for approval button and logout$")
	public void enter_the_propose_new_fee_structure_details_and_click_submit_for_approval_button_and_logout() throws Throwable {
	    
		fcr.newFeeStructureDetails();
		hta.logout();
	}

	@Given("^Click fee change request waiting for approval link$")
	public void click_fee_change_request_waiting_for_approval_link() throws Throwable {
	   
		fcr.FeeChangeApprovalLink();
	}

	@Given("^Click Fee change request Approval icon$")
	public void click_Fee_change_request_Approval_icon() throws Throwable {
	   
		fcr.feeChangeApprovalIcon();
	}

	@Given("^Enter the comments and click Send for clarification button and logout$")
	public void enter_the_comments_and_click_Send_for_clarification_button_and_logout() throws Throwable {
	   
		fcr.feeChangeSendForClarification();
		hta.logout();
	}

	@Given("^Click Student fee change request need more information link from My Alerts$")
	public void click_Student_fee_change_request_need_more_information_link_from_My_Alerts() throws Throwable {
		
		fcr.feeChangeNeedMoreInformation();
	}

	@Given("^Click Fee change Approval icon to send more clarification$")
	public void click_Fee_change_Approval_icon_to_send_more_clarification() throws Throwable {
	    
		fcr.feeChangeApprovalIcon();
	}

	@Given("^Enter the comments and click SendClarification button and logout$")
	public void enter_the_comments_and_click_SendClarification_button_and_logout() throws Throwable {
		
		fcr.feeChangeSendClarification();
		
		hta.logout();
	}

	@Given("^Click Student fee change request received more information link from My Alerts$")
	public void click_Student_fee_change_request_received_more_information_link_from_My_Alerts() throws Throwable {
		
		fcr.feeChangeReceivedMoreInformation();
	}

	@Given("^Click Fee change Approval icon to Approve the received information$")
	public void click_Fee_change_Approval_icon_to_Approve_the_received_information() throws Throwable {
		
		fcr.feeChangeApprovalIcon();
	}

	@Given("^Enter the comments and click Approval Button$")
	public void enter_the_comments_and_click_Approval_Button() throws Throwable {
	  
		fcr.feeChangeApprove();
	}


}
