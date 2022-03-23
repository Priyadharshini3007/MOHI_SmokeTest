package com.automation.steps;
import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;


public class AttendanceSteps extends BaseClass{
	
	@When("^Select Center Name as \"(.*?)\"$")
	public void select_Center_Name_as_(String centerID) throws Throwable {
		helper();
		At.centerNameFn(centerID);
	}

	@When("^Select School Name as \"(.*?)\"$")
	public void select_School_Name_as_(String schoolID) throws Throwable {
		helper();
		At.schoolNameFn(schoolID);
	}

	@When("^Select Class as \"(.*?)\"$")
	public void select_Class_as_(String classID) throws Throwable {
		At.classNameFn(classID);
	}

	@When("^Select Class Section as \"(.*?)\"$")
	public void select_Class_Section_as_(String sectionID) throws Throwable {
		At.sectionNameFn(sectionID);
	}
	
	@When("^Select the Date$")
	public void select_the_Date() throws Throwable {
		helper();
		At.dateclickFn();
	}

	@When("^Mark as Absent for the student$")
	public void mark_as_Absent_for_the_student() throws Throwable {
		At.AbsentFn();
	}
	
	@When("^Click Save Attendance button$")
	public void Click_Save_Attendance_button() throws Throwable {
		At.saveAttendance();
	}
	
	@When("^Verify the user intimation message for attendance$")
	public void verify_the_user_intimation_message_for_attendance() throws Throwable {
		At.AttUserIntMgFn();
		At.AbsentChildNameFn();
	}

	@When("^Click Print Attendance Sheet link$")
	public void click_Print_Attendance_Sheet_link() throws Throwable {
		At.AttendanceSheetFn();
	}
	
//	@When("^Log out the user$")
//	public void log_out_the_profile() throws Throwable {
//		helper();
//		At.logOutFn();
//	}
	
	@When("^Select the student type$")
	public void select_the_student_type() throws Throwable {
		At.StudentTypeFn();
	}

	@When("^Enter the child name in search box$")
	public void enter_the_child_name_in_search_box() throws Throwable {
		At.searchBoxFn();
	}

	@When("^verify the pull out icon for that student$")
	public void verify_the_pull_out_icon_for_that_student() throws Throwable {
		At.pullOutIconFn();
	}	

}
