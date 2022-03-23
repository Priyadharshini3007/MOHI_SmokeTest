package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class OrganizationSteps extends BaseClass {
	
//Add Organization
	
	@Given("^Navigate to Admin and Click Organization submenu$")
	public void navigate_to_Admin_and_Click_Organization_submenu() throws Throwable {
		helper();
		organization.organizationmenu();
		
	}

	@Given("^Click Add Button$")
	public void click_Add_Button() throws Throwable {
	    
		organization.addButton();
	}

	@Given("^Enter the Organization required fields$")
	public void enter_the_Organization_required_fields() throws Throwable {
	   
		organization.OraganizationRequiredFields();
	}

	@Given("^Click save button to save the newly added Organization$")
	public void click_save_button_to_save_the_newly_added_Organization() throws Throwable {
	   
		organization.saveOrganization();
	}

//Edit Organization
	
	@Given("^Click Edit to edit the Organization required fields$")
	public void click_Edit_to_edit_the_Organization_required_fields() throws Throwable {
	
		organization.editOrganization();
	}

	@Given("^Click save button to save the edited Organization details$")
	public void click_save_button_to_save_the_edited_Organization_details() throws Throwable {
	   
		organization.saveOrganization();
	}

//Assign Role to organization
	
	@Given("^Click Assign role to organization icon$")
	public void click_Assign_role_to_organization_icon() throws Throwable {
	
		organization.RoleToOrganization();
	}

	@Given("^Select Designation and Role and click add new role button$")
	public void select_Designation_and_Role_and_click_add_new_role_button() throws Throwable {
	       
		organization.addNewRole();
	}
	
//To View Organization List
	
	@Given("^Ensure that organization list can be Viewed$")
	public void ensure_that_organization_list_can_be_Viewed() throws Throwable {
	    
		organization.organizationListCanBeViewed();
	}
	
//Organization Search 
	
	@Given("^enter the name and Select Search icon$")
	public void enter_the_name_and_Select_Search_icon() throws Throwable {
			
		organization.organizationSearch();
	}

	@Given("^click on Organization Hierarchy Tab and enter the name and click search$")
	public void click_on_Organization_Hierarchy_Tab_and_enter_the_name_and_click_search() throws Throwable {
	  
		organization.organizationHierarchySearch();
	}

	@Given("^click on Designation tab and enter the name and click search$")
	public void click_on_Designation_tab_and_enter_the_name_and_click_search() throws Throwable {
	 
		organization.designationSearch();
	}
	
// Organization Hierarchy Sort

	@Given("^Ensure that search and sort working properly$")
	public void ensure_that_search_and_sort_working_properly() throws Throwable {
			organization.organizationHierarchySortAsc();
			organization.organizationHierarchySortDesc();
			organization.organizationHierarchyCodeSortAsc();
			organization.organizationHierarchyCodeSortDesc();
			organization.organizationHierarchySortOrderSortAsc();
			organization.organizationHierarchySortOrderSortDesc();
			//organization.designationSortAsc();
			//organization.designationSortDesc();
			
	}
	
//To Add Organization Hierarchy
	
	@Given("^Select Organization Hierarchy Tab$")
	public void select_Organization_Hierarchy_Tab() throws Throwable {
	   
		organization.addOrganizationHierarchyTab();
	}

	@Given("^Click Add symbol and enter the required details$")
	public void click_Add_symbol_and_enter_the_required_details() throws Throwable {
		
		organization.addOrganizationHierarchyRequiredDetails();
	}

	@Given("^Click save Button to save the Organization Hierarchy$")
	public void click_save_Button_to_save_the_Organization_Hierarchy() throws Throwable {
		
		organization.saveOrganization();
	}
	
//To verify Organization Hierarchy List can be viewed
	
	@Given("^Ensure that Organization Hierarchy List can be Viewed$")
	public void ensure_that_Organization_Hierarchy_List_can_be_Viewed() throws Throwable {
	  
		organization.organizationHierarchyListCanBeViewed();
	}
	
//To Edit Organization Hierarchy
	
	@Given("^Edit the Organization Hierarchy Required fields$")
	public void edit_the_Organization_Hierarchy_Required_fields() throws Throwable {
	  
		organization.editOrganizationHierarchyRequiredDetails();
	}
	
	@Given("^Click save Button to save the Edited Organization Hierarchy$")
	public void click_save_Button_to_save_the_Edited_Organization_Hierarchy() throws Throwable {
		
		organization.saveOrganization();
	}
	
//To delete Organization Hierarchy
	
	@Given("^Search the name to delete from orgnization Hierarchy$")
	public void search_the_name_to_delete_from_orgnization_Hierarchy() throws Throwable {
	   
		organization.searchNameToDelete();
	}

	@Given("^Click Delete icon Button to delete the Edited Organization Hierarchy$")
	public void click_Delete_icon_Button_to_delete_the_Edited_Organization_Hierarchy() throws Throwable {
	
		organization.deleteOrganizationHierarchy();
	}
	

//Add designation
	
	@Given("^Select Designation Tab$")
	public void select_Designation_Tab() throws Throwable {
	 
		organization.designationTab();
	}

	@Given("^Click Add Button and enter the Designation required field$")
	public void click_Add_Button_and_enter_the_Designation_required_field() throws Throwable {
	 
		organization.addDesignation();
	
	}

	@Given("^Click save button to save the Designation details$")
	public void click_save_button_to_save_the_Designation_details() throws Throwable {
	  
		organization.saveOrganization();
	}
	
//Delete Role Mapped To Organization
	
	@Given("^Select Assign role to organization icon and delete the role mapped to the Organization$")
	public void select_Assign_role_to_organization_icon_and_delete_the_role_mapped_to_the_Organization() throws Throwable {
	 
		organization.deleteRole();
	}

}
