package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class StudentDeleteSendForClarificationAndApprovalSteps extends BaseClass {
	
	@And("^Navigate to InActive Students$")
	public void navigate_to_InActive_Students() throws Throwable {
		helper();
		sd.InActiveStudent();
	}
	
	@And("^Get the Student CMFId which is deleted$")
	public void Get_the_Student_CMFId_which_is_deleted() throws Throwable {
		sd.getStudent1();
	
	}
	
	@Given("^Click Go Button$")
	public void click_Go_Button() throws Throwable {
		helper();
	  sd.goButton();
	}



	@Given("^Enter CMF ID and click on Search button to delete the student$")
	public void enter_CMF_ID_and_click_on_Search_button_to_delete_the_student() throws Throwable {
	   
		sd.EnterCMFIDToDelete();
	}

	@Given("^click delete icon to delete the student$")
	public void click_delete_icon_to_delete_the_student() throws Throwable {
	
		sd.Deleteicon();
	}
	
	

	@Given("^Enter the comments and click save and click Ok for both alerts and logout$")
	public void enter_the_comments_and_click_save_and_click_Ok_for_both_alerts_and_logout() throws Throwable {
	
		sd.commentsToDelete();
		//hta.logout();
	}
	
//CSM Login	

	@Given("^Click on delete request waiting for approval link$")
	public void click_on_delete_request_waiting_for_approval_link() throws Throwable {
	    
		sd.deleteWaitingforapproval();
	}

	@Given("^Enter the comments and click Send For Clarification to previous step button and logout$")
	public void enter_the_comments_and_click_Send_For_Clarification_to_previous_step_button_and_logout() throws Throwable {
	   
		sd.deleteStudentSendForClarification();
		//hta.logout();
	}
	
	
//CSO
	
	@Given("^Click on student need more info link$")
	public void click_on_student_need_more_info_link() throws Throwable {
	   
		sd.deleteStudentNeedMoreInformation();
	}

	@Given("^Enter the comments and click Send Clarification button to delete the student and logout$")
	public void enter_the_comments_and_click_Send_Clarification_button_to_delete_the_student_and_logout() throws Throwable {
	  
		sd.deleteStudentSendClarification();
	    //hta.logout();
	    
	}

	
//CSM
	
	@Given("^Click on student receive more info link$")
	public void click_on_student_receive_more_info_link() throws Throwable {
	  
		sd.deleteStudentReceivedMoreInformation();
	}
	
	
	@Given("^Enter the comments and click Approve Button to delete the student$")
	public void enter_the_comments_and_click_Approve_Button_to_delete_the_student() throws Throwable {
	   
		sd.deleteStudentReceivedMoreInformationcomments();
	}


	

}
