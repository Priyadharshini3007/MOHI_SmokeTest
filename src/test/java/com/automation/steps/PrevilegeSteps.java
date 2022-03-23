package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class PrevilegeSteps extends BaseClass {

//Add Previlege
	
	@Given("^Navigate to Admin and Click previlege submenu$")
	public void navigate_to_Admin_and_Click_previlege_submenu() throws Throwable {
		
		helper();
		
		previlege.previlege();
	}

	@Given("^Click Add Previlege Link$")
	public void click_Add_Previlege_Link() throws Throwable {
		
		previlege.addPrevilegeLink();
	}
	
	@Given("^Enter the Previlege required fields$")
	public void enter_the_Previlege_required_fields() throws Throwable {

		previlege.addPrevilegeRequiredFilelds();
	}


	@Given("^Click save button to save the newly added previlege$")
	public void click_save_button_to_save_the_newly_added_previlege() throws Throwable {

		previlege.savePrevilege();
	}

//Edit Previlege
	
	
	@Given("^Click Edit icon to edit the existing previlege$")
	public void click_Edit_icon_to_edit_the_existing_previlege() throws Throwable {
		
		previlege.editbutton();
	}

	@Given("^Edit the Previlege required fields$")
	public void edit_the_Previlege_required_fields() throws Throwable {
	
		previlege.editTheExistingPrevilegeDetails();
	}

	@Given("^Click save button to save the edited previlege changes$")
	public void click_save_button_to_save_the_edited_previlege_changes() throws Throwable {
	
		previlege.savePrevilege();
	}
	
//Previlege return to List
	

	@Given("^Click Add Previlege Link and click ReturnToListButton$")
	public void click_Add_Previlege_Link_and_click_ReturnToListButton() throws Throwable {
    
		previlege.addPrevilegeReturnToList();
}

	@Given("^Click Edit Previlege and click ReturnToListButton$")
	public void click_Edit_Previlege_and_click_ReturnToListButton() throws Throwable {
  
		previlege.editPrevilegeReturnToList();
}
	
//Previlege List Can be Viewed
	
	@Given("^Ensure that Previlege list can be Viewed$")
	public void ensure_that_Previlege_list_can_be_Viewed() throws Throwable {
	
		previlege.PrevilegeListCanBeViewed();
	}
}
