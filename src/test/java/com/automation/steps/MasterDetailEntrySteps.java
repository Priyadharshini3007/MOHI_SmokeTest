package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class MasterDetailEntrySteps extends BaseClass{

	//Add MasterDetailEntry
	
	@Given("^Navigate to Admin and Click Master Detail Entry submenu$")
	public void navigate_to_Admin_and_Click_Master_Detail_Entry_submenu() throws Throwable {
		helper();
		mde.MasterDetailEntrymenu();
	}

	@Given("^Select the Category$")
	public void select_the_Category() throws Throwable {
	    
		mde.Category();
	}

	@Given("^Click save button to save the details$")
	public void click_save_button_to_save_the_details() throws Throwable {
	    
		mde.SaveCategory();
	}




	
	//Verify Category Dropdown
	
	@Given("^Verify Category Dropdown$")
	public void verify_Category_Dropdown() throws Throwable {
	    
		mde.verifyCategoryDropDown();
	}

//Verify Text Boxes
	
	@Given("^Select the category Dropdown and verify the textboxes$")
	public void select_the_category_Dropdown_and_verify_the_textboxes() throws Throwable {
	    
		mde.verifyTextData();
	}
	
	
//Verification of Newly Added Section Mapped To The Appropriate Center&Class
	
	@Given("^Select Section category from the Dropdown and add new section and Click Save$")
	public void select_Section_category_from_the_Dropdown_and_add_new_section_and_Click_Save() throws Throwable {
	   
		mde.sectionCategory();
		mde.SaveCategory();
	}

	@Given("^Click Add MasterDetail Link and select category as Center, Class & Section Mapping$")
	public void click_Add_MasterDetail_Link_and_select_category_as_Center_Class_Section_Mapping() throws Throwable {
	
		mde.clickAddMasterDetailLink();
	}

	@Given("^Select Center,Class and newly added section and click save$")
	public void select_Center_Class_and_newly_added_section_and_click_save() throws Throwable {
		
		mde.selectNewlyAddedSection();
		mde.SaveCategory();
	}

	@Given("^Filter the newly added record and verify added new section got mapped$")
	public void filter_the_newly_added_record_and_verify_added_new_section_got_mapped() throws Throwable {
	  
		mde.filterTheRecordToVerify();
	}
	
//VerifyReturnToList
	
	@Given("^Click Master Detail List Link$")
	public void click_Master_Detail_List_Link() throws Throwable {
	    
		mde.masterDetailListLink();
	}

	@Given("^Select the category from the drop down$")
	public void select_the_category_from_the_drop_down() throws Throwable {
	    
		mde.selCategory();
	}

	@Given("^Click Edit button and click Return To Report$")
	public void click_Edit_button_and_click_Return_To_Report() throws Throwable {
	    
		mde.selEditAndReturnToList();
	}

	@Given("^Click Add Master Detail link and click Return To Report$")
	public void click_Add_Master_Detail_link_and_click_Return_To_Report() throws Throwable {
	    
		mde.selAddMasterDetailAndReturnToList();
	}
	
}
