package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.*;

public class EmployeeListsteps extends BaseClass {

	@Given("^After login select Employee list from Menu$")
	public void after_login_select_Employee_list_from_Menu() throws Throwable {
		
	   Thread.sleep(1000);
	   helper();
	 
	   el.navigateemplist();
	   
	   
	}

	@Given("^perform task$")
	public void perform_task() throws Throwable {
	   
		el.perfomrtask();
		
	}
	
}
