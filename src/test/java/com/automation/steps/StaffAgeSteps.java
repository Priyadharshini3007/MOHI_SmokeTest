package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;


public class StaffAgeSteps extends BaseClass{
	
	@When("^generate report$")
	public void generate_report() throws Throwable {
		helper();
		staffage.calendarFn();
	}

}
