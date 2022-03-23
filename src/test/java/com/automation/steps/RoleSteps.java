package com.automation.steps;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;

import cucumber.api.java.en.Given;

public class RoleSteps extends BaseClass {

//Add Role
	
	@Given("^Navigate to Admin and Click Role submenu$")
	public void navigate_to_Admin_and_Click_Role_submenu() throws Throwable {
	  helper();
	  role.AddRole();
	}

	@Given("^Click Add Role Link$")
	public void click_Add_Role_Link() throws Throwable {
	  
		role.addRoleLink();
	}

	@Given("^Enter the Role required fields$")
	public void enter_the_Role_required_fields() throws Throwable {
	   
		role.addRoleRequiredFilelds();
		
	}

	@Given("^Click save button to save the newly added Role$")
	public void click_save_button_to_save_the_newly_added_Role() throws Throwable {
		
		role.saveRole();
	}
	
//EditExistingRole

	@Given("^Click Edit icon to edit the existing Role$")
	public void click_Edit_icon_to_edit_the_existing_Role() throws Throwable {
	   
		role.editRolebutton();
	}

	@Given("^Edit the Role required fields$")
	public void edit_the_Role_required_fields() throws Throwable {
	
		role.editRoleRequiredFilelds();
	}

	@Given("^Click save button to save the edited Role changes$")
	public void click_save_button_to_save_the_edited_Role_changes() throws Throwable {
	  
		role.saveRole();
	}
	
//DeleteRole

	@Given("^Click Delete icon to Delete the existing Role$")
	public void click_Delete_icon_to_Delete_the_existing_Role() throws Throwable {
	
		role.DeleteRolebutton();
	}
	
//NotGetDeletedWhenAssociatedWithSystemDetails

	@Given("^Click Delete icon to Delete and ensure that the Role not get Deleted$")
	public void click_Delete_icon_to_Delete_and_ensure_that_the_Role_not_get_Deleted() throws Throwable {
	    
		role.deleteWhenAssociatedWithSystemDetails();
		
	}
	
//InactiveRole

	@Given("^Click Inactive Checkbox to inactive the Role$")
	public void click_Inactive_Checkbox_to_inactive_the_Role() throws Throwable {
	 
		role.addRoleLink();
		
		role.addRoleRequiredFilelds();
		
		role.saveRole();
      LoginPage lg= new LoginPage();
		
		hta.logout();
		lg.excelusername("siteadmin");
		lg.submit();
	    lg.secquestion();
	    lg.submit();
	    lg.password();
	    lg.submit();
	    role.AddRole();
		
		role.InactiveRole();
	}
	
//RoleReturnToList

	@Given("^Click Add Role Link and click ReturnToListButton$")
	public void click_Add_Role_Link_and_click_ReturnToListButton() throws Throwable {
	  
		role.addRoleReturnToList();
	}

	@Given("^Click Edit Role and click ReturnToListButton$")
	public void click_Edit_Role_and_click_ReturnToListButton() throws Throwable {
	  
		role.editRoleReturnToList();
	}

//MenuAssociatedToRole
	
	@Given("^Click Manage Menu Link to Associate menu to the Role$")
	public void click_Manage_Menu_Link_to_Associate_menu_to_the_Role() throws Throwable {
	  
		role.ManageMenuLink();
		
		role.saveRole();
	}
	
//PrevilageAssociatedToRole

	@Given("^Click Previlege Menu Link to Associate Previlege to the Role$")
	public void click_Previlege_Menu_Link_to_Associate_Previlege_to_the_Role() throws Throwable {
	    
		role.ManagePrevilegesLink();
		
		role.saveRole();
		
		
	}
	
	
}
