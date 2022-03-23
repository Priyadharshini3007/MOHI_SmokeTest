package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class StudentDeleteDeniedSteps extends BaseClass{
	
	
	
	@Given("^Enter CMF ID and click on Search button to deny delete the student$")
	public void enter_CMF_ID_and_click_on_Search_button_to_deny_delete_the_student() throws Throwable {
		helper();
		
		sd.EnterCMFIDToDenyDelete();
	}
	
	@Given("^Enter the comments and click Deny button$")
	public void enter_the_comments_and_click_Deny_button() throws Throwable {
	 
		sd.deleteStudentdenied();
	}

}
