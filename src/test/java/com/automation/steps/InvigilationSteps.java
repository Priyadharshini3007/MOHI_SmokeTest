package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;
import com.automation.pages.InvigilationReport;

public class InvigilationSteps extends BaseClass{
	
	@Given("^select report menu and invigilation submenu$")
	public void select_report_menu_and_invigilation_submenu() throws Throwable {
		helper();
		ir.InvigilationReportmenu();
	}

	@Given("^filter the invigilation assignment and choose edit and make the changes$")
	public void filter_the_invigilation_assignment_and_choose_edit_and_make_the_changes() throws Throwable {
		ir.searchExaminvigilator();
		ir.editinvigilator();
		ir.InvigilationReportmenu();
	}

	@Given("^filter the invigilation assignment and choose delete$")
	public void filter_the_invigilation_assignment_and_choose_delete() throws Throwable {
		ir.searchExaminvigilator();
		ir.deleteinvigilation();
	   
	}


}
