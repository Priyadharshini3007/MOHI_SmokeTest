package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class WorkFlowSteps extends BaseClass {

	@Given("^Navigate to Admin and Click WorkFlow submenu$")
	public void navigate_to_Admin_and_Click_WorkFlow_submenu() throws Throwable {
	  
		helper();
		workflow.WorkFlowMenu();
	}

	@Given("^Click Edit icon for the respective WorkFlow$")
	public void click_Edit_icon_for_the_respective_WorkFlow() throws Throwable {
	 
		workflow.editWorkFlow();
	}

	@Given("^Select WorkFlow Tab$")
	public void select_WorkFlow_Tab() throws Throwable {
		
		workflow.workFlowTab();
	}

	@Given("^Click Approver Assignment icon$")
	public void click_Approver_Assignment_icon() throws Throwable {
	
		workflow.approverAssignmentIcon();
	}

	@Given("^Enter the User name and click Save$")
	public void enter_the_User_name_and_click_Save() throws Throwable {
	
		workflow.approverName();
	}
	
//WorkFlow list can be viewed
	
	
	@Given("^Ensure that WorkFlow list can be Viewed$")
	public void ensure_that_WorkFlow_list_can_be_Viewed() throws Throwable {
	 
		workflow.workFlowListCanBeViewed();
	}
	
//WorkFlow  Return To List
	
	@Given("^Click Add workflow Step Group icon and select ReturnToList Button$")
	public void click_Add_workflow_Step_Group_icon_and_select_ReturnToList_Button() throws Throwable {
	  
		workflow.addWorkFlowReturnToList();
	}

	@Given("^Click Edit workflow Step Group icon And select ReturnToList Button$")
	public void click_Edit_workflow_Step_Group_icon_And_select_ReturnToList_Button() throws Throwable {
	   
		workflow.editWorkFlowReturnToList();
	}


	//Edit users in the workflow
	
	
	@Given("^Click Edit icon to edit the workflow step and click save icon$")
	public void click_Edit_icon_to_edit_the_workflow_step_and_click_save_icon() throws Throwable {
	    
		workflow.editUserInTheWorkFlow();
	}

}
