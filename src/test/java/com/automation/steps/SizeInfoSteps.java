package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;

public class SizeInfoSteps extends BaseClass{
	
	@When("^Click on students dress information need to be update Alert$")
	public void click_on_students_dress_information_need_to_be_update_Alert() throws Throwable {
		helper();
	 sizeinfo.dressInfoUpdateAlert();  
	}

	@When("^Enter the student name to update the dress information$")
	public void enter_the_student_name_to_update_the_dress_information() throws Throwable {
		sizeinfo.EnterCMFID();
	}

	@When("^Click on Edit icon$")
	public void click_on_Edit_icon() throws Throwable {
		sizeinfo.editIcon();
	}

	@When("^Navigate to Size info tab$")
	public void navigate_to_Size_info_tab() throws Throwable {
		sizeinfo.sizeInfo();
	}

	@When("^Enter the dress details$")
	public void enter_the_dress_details() throws Throwable {
		sizeinfo.dressDetails();
	}

	@When("^Click Save to save the dress information$")
	public void click_Save_to_save_the_dress_information() throws Throwable {
		sizeinfo.saveDressInfo();
	}
	
	

}
