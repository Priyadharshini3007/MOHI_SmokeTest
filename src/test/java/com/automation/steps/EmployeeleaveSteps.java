package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.*;

public class EmployeeleaveSteps extends BaseClass {	
	
	@Given("^After login navigate to employee leave$")
	public void after_login_navigate_to_employee_leave() throws Throwable {
		
		Thread.sleep(1000);
		helper();
		 
		   empl.NavigateLeave();
		
	    
	}

	@Given("^Aplly for Leave$")
	public void aplly_for_Leave() throws Throwable {
		empl.applyleave();
	}
	@Given("^login as HR Manager and Approve leave$")
	public void login_as_HR_Manager_and_Approve_leave() throws Throwable {
		empl.HRmanagerlogin();
	}
}

