package com.automation.steps;

import com.automation.pages.BaseClass;


import cucumber.api.java.en.Given;

public class StudentDisableSteps extends BaseClass  {

	
	

	@Given("^click disable icon to disable the student$")
	public void click_disable_icon_to_disable_the_student() throws Throwable {
		helper();
		sde.Disableicon();
	}

	@Given("^Enter the disable reason and comments and click save$")
	public void enter_the_disable_reason_and_comments_and_click_save() throws Throwable {
	  
		sde.DisableReason();
	}
	
}
