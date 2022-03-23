package com.automation.steps;
import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class RankingReportSteps extends BaseClass {

	@Given("^navigate to the ranking report$")
	public void navigate_to_the_ranking_report() throws Throwable {
		helper();
	    rr.navigation();
	    Thread.sleep(100);
	    
	}
	
	@Given("^select the parameters for viewing the ranking report$")
	public void select_the_parameters_for_viewing_the_ranking_report() throws Throwable {
		rr.Select_Category();
	}
	
	@Then("^download the export$")
	public void download_the_export() throws Throwable {
		rr.switchtoDefault();
	}
}

