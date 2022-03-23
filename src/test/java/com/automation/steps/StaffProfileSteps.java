package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;


public class StaffProfileSteps extends BaseClass{
	
	@When("^verify the navigation to the basic profile$")
	public void verify_the_navigation_to_the_basic_profile() throws Throwable {
		helper();
		Se.basicProfileFn();
	}

	@When("^verify the navigation to the Pay Structure Details$")
	public void verify_the_navigation_to_the_Pay_Structure_Details() throws Throwable {
		helper();
		Se.payStructureFn();
	}

	@When("^verify the navigation to the Pay Slip Details$")
	public void verify_the_navigation_to_the_Pay_Slip_Details() throws Throwable {
		helper();
		Se.paySlipDetailFn();
	}

}
