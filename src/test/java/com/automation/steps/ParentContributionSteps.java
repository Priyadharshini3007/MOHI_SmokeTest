package com.automation.steps;

import cucumber.api.java.en.Given;

import com.automation.pages.BaseClass;


public class ParentContributionSteps extends BaseClass {
	
	@Given("^Select Reports menu and select parent contribution submenu$")
	public void select_Reports_menu_and_select_parent_contribution_submenu() throws Throwable {
		//pc= new pageObject.ParentContribution(driver);
		helper();
		pc.ReportMenu();
		
		
	}

	@Given("^Filter the grid with valid search criteria$")
	public void filter_the_grid_with_valid_search_criteria() throws Throwable {
		
		helper();
		pc.Paidfromdate();
	}

	

	@Given("^Search the name and add bank deposit number$")
	public void search_the_name_and_add_bank_deposit_number() throws Throwable {
		pc.addbankdepositnumber();
	}

	@Given("^edit bank deposit number$")
	public void edit_bank_deposit_number() throws Throwable {
	
		pc.editaddbankdepositnumber();
	}
	
	
	
	

}
