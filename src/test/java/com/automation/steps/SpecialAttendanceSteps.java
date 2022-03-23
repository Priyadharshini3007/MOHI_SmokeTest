package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;


public class SpecialAttendanceSteps extends BaseClass{
	
	@When("^Select the center$")
	public void select_the_center() throws Throwable {
		helper();
		Spa.centerNameFn();
	}

	@When("^Select the school$")
	public void select_School_Name_as_() throws Throwable {
		helper();
		Spa.schoolNameFn();
	}
	
	@When("^Select the class$")
	public void select_the_class() throws Throwable {
		Spa.classNameFn();
	}

	@When("^Select the class section$")
	public void select_the_class_section() throws Throwable {
		Spa.sectionNameFn();
	}

	@When("^Select the Term$")
	public void select_the_Term() throws Throwable {
	    Spa.termFn();
	}
	
	@When("^Click Get Class Roaster button$")
	public void click_Get_Class_Roaster_button() throws Throwable {
		helper();
		Spa.classRoasterFn();
	}

	@When("^Mark as Not Received for the student$")
	public void mark_as_Not_Received_for_the_student() throws Throwable {
		Spa.notReceived1Fn();
		Spa.notReceived7Fn();
	}

	@When("^Click Save Attendance$")
	public void click_Save_Attendance() throws Throwable {
		Spa.submitButtonFn();
	}

	@When("^Verify the user intimation message$")
	public void verify_the_user_intimation_message() throws Throwable {
		Spa.splAttUserIntMgFn();
		Spa.notReceived1NameFn();
	}
	
	@When("^log out$")
	public void log_out() throws Throwable {
		helper();
		Spa.outOfFrame();
		Spa.logOutFn();
	}	

	@When("^Select the student type and click GO button$")
	public void Select_the_student_type_and_click_GO_button() throws Throwable {
		Spa.StudentTypeFn();
	}

	@When("^Enter the child name in search box and click search$")
	public void enter_the_child_name_in_search_box_and_click_search() throws Throwable {
		Spa.searchBoxFn();
	}

	@When("^verify the pull out icon for the student$")
	public void verify_the_pull_out_icon_for_the_student() throws Throwable {
		Spa.pullOutIconFn();
	}

}
