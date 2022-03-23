package com.automation.steps;


import com.automation.pages.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminPageSteps extends BaseClass {
	
		//AdminPage adminpage=new AdminPage();

		@And("^Click on the Admin menu$")
	    public void clickontheadminmenu() throws Exception{
			helper();
			adminpage.clickonadminmenu();
		}
		
		@Then("^Click on the User button$")
		public void clickonuserbutton(){
			helper();
			adminpage.userbtn();
		}
		@And("^Navigate to Admin page$")
		public void navigatetoadminpage(){
			
			helper();
			adminpage.navigateadmin();
		}
		
		
	    
}