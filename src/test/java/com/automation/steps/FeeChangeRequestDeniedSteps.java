package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class FeeChangeRequestDeniedSteps extends BaseClass{
	
	

		@Given("^Enter the comments and click Denied Button$")
		public void enter_the_comments_and_click_Denied_Button() throws Throwable {
			
			helper();
			
			fcr.feeChangeDenied();
		 
		}

	

}
