package com.automation.steps;


import com.automation.pages.BaseClass;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class DashboardPageSteps extends BaseClass {
	
		//DashboardPage dashboardpage=new DashboardPage();
		
		@And("^Navigate to Dashboard menu$")
		public void clickondashboardmenu(){
			helper();
			dashboardpage.navigatetodashboardmenu();
		}
		
		@Then("^Click on My dashboard link$")
		public void navigatetodashboardpage(){
			
		}

}
