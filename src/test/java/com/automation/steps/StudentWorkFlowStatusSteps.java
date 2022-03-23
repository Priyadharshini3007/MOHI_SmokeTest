package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class StudentWorkFlowStatusSteps extends BaseClass{
	
	@Given("^Navigate to student and select StudentWorkFlowStatus submenu$")
	public void navigate_to_student_and_select_StudentWorkFlowStatus_submenu() throws Throwable {
		 helper();
		 sws.studentWorkflowStatusmenu();
	}

	@Given("^Enter CMF ID or Student name and click Go Button to view By student$")
	public void enter_CMF_ID_or_Student_name_and_click_Go_Button_to_view_By_student() throws Throwable {
		sws.CMFID();
	}

	@Given("^Filter the records with column header search criteria for a student$")
	public void filter_the_records_with_column_header_search_criteria_for_a_student() throws Throwable {
		
		sws.searchColumnHeader();
	}

	@Given("^Click the toggle button to view t By center$")
	public void click_the_toggle_button_to_view_t_By_center() throws Throwable {
	   
		sws.toggleButton();
	}

	@Given("^Select Center, Workflow Type & Workflow Step and click Go$")
	public void select_Center_Workflow_Type_Workflow_Step_and_click_Go() throws Throwable {
	
		sws.filterDropdown();
	}

	@Given("^Filter the records with column header search criteria$")
	public void filter_the_records_with_column_header_search_criteria() throws Throwable {
	   
		sws.searchbycenter();
	}


}
