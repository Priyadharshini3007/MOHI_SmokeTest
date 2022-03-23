package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class EmailTemplateSteps extends BaseClass{
	
	@Given("^Navigate to Admin and Click Email Template submenu$")
	public void navigate_to_Admin_and_Click_Email_Template_submenu() throws Throwable {
		
		helper();
		
		et.AdminMenu();
	}

	@Given("^Click Add Email Config link$")
	public void click_Add_Email_Config_link() throws Throwable {
	 
		et.addEmailConfig();
	}

	@Given("^Enter email type and message$")
	public void enter_email_type_and_message() throws Throwable {

		et.emailTypeAndMessage();
	}

	@Given("^Click save button$")
	public void click_save_button() throws Throwable {
	    
		et.Savemailtype();
		et.Flashmessage();
	}

//EmailTemplateEditSteps
	
	@Given("^Enter the mail type and click search icon to edit$")
	public void enter_the_mail_type_and_click_search_icon_to_edit() throws Throwable {
		
		et.SearchType();

	}

	@Given("^Edit the required fields$")
	public void edit_the_required_fields() throws Throwable {
		
		et.edit();
	
	}
	
	@Given("^Click save button for edited Details$")
	public void Click_sav_button_for_edited_Details() throws Throwable {
		
		et.saveEditedMailType();
	
	}
	
//EmailTemplateDelete


	@Given("^Enter the mail type and click search icon to delete$")
	public void enter_the_mail_type_and_click_search_icon_to_delete() throws Throwable {
		
		et.SearchTypetoDelete();
	}
	
	@Given("^Click Delete icon on the respective mail$")
	public void click_Delete_icon_on_the_respective_mail() throws Throwable {
	 
		et.Deletemail();
	}

//EmailTemplateReturnToList

	@Given("^Click on Add Config Email and select ReturnToList Button$")
	public void click_on_Add_Config_Email_and_select_ReturnToList_Button() throws Throwable {
	  
		et.AddConfigMailReturnToList();
	}

	@Given("^Click on Edit Button And Select ReturnToList Button$")
	public void click_on_Edit_Button_And_Select_ReturnToList_Button() throws Throwable {
	
		et.EditMailReturnToList();
	}

	
	
	
	

}
