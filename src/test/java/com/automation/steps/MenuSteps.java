package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class MenuSteps extends BaseClass {
	
	@Given("^Navigate to Admin and Click Menu submenu$")
	public void navigate_to_Admin_and_Click_Menu_submenu() throws Throwable {
		
		helper();
		
		menu.menu();
	}

	@Given("^Click Add Menu Link$")
	public void click_Add_Menu_Link() throws Throwable {
	   
		menu.AddmenuLink();
	}

	@Given("^Enter the required fields$")
	public void enter_the_required_fields() throws Throwable {
	
		menu.enterTheFields();
	}

	@Given("^Click save button to save the newly added menu$")
	public void click_save_button_to_save_the_newly_added_menu() throws Throwable {
	  
		menu.saveTheMenu();
	}

	@Given("^Navigate to Admin and click Role submenu$")
	public void navigate_to_Admin_and_click_Role_submenu() throws Throwable {
	   
		menu.roleMenu();
	}

	@Given("^Filter the Role and select Manage menu Link$")
	public void filter_the_Role_and_select_Manage_menu_Link() throws Throwable {
	  
		menu.filterRole();
	}

	@Given("^Select the newly created menu and save$")
	public void select_the_newly_created_menu_and_save() throws Throwable {
		
		menu.newAddedMenu();
		menu.saveTheMenu();
		menu.verifyAddedMenu();
	}
	
//EditExistingMenu
	
	@Given("^Click Edit icon$")
	public void click_Edit_icon() throws Throwable {
		menu.editExistingMenu();
	}

	@Given("^Click save button to save the edited menu$")
	public void click_save_button_to_save_the_edited_menu() throws Throwable {
	    
		menu.saveTheMenu();
	}

//AdminMenuReturnToList
	
	@Given("^Click Add menu link and select ReturnToList Button$")
	public void click_Add_menu_link_and_select_ReturnToList_Button() throws Throwable {
	    
		menu.addMenuReturnToList();
	}

	@Given("^Click EditButton And select ReturnToList Button$")
	public void click_EditButton_And_select_ReturnToList_Button() throws Throwable {
	   
		menu.editReturnToList();
	}

//MenuInactive
	

	@Given("^click Edit button on any menu and uncheck Is Active Button and Click save$")
	public void click_Edit_button_on_any_menu_and_uncheck_Is_Active_Button_and_Click_save() throws Throwable {
		
		menu.menuActive();
		//menu.saveTheMenu();

}
	
//Application Defaulted To SiteAdmin
	
	@Given("^Verify Appication is defaulted to SiteAdmin$")
	public void verify_Appication_is_defaulted_to_SiteAdmin() throws Throwable {
	 
		menu.defaultToSiteAdmin();
	}

//InActive Menu not get displayed in the site
	
	@Given("^Verify the inactive element not displayed in the associated center$")
	public void verify_the_inactive_element_not_displayed_in_the_associated_center() throws Throwable {
		
		    menu.inActiveElementnotDisplayed();
	}

	
	
}
