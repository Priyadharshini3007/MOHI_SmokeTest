package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;

public class StudentEntrySteps extends BaseClass {

	@When("^Select student menu and click student entry submenu$")
	public void Select_student_menu_and_click_student_entry_submenu() throws Throwable {
		helper();

		se.studentmenu();

	}

	@When("^Enter the Student name$")
	public void Enter_the_Student_name() throws Throwable {

		se.studentname();

	}

	
	@When("^Enter the student dob$")
	public void enter_the_student_dob() throws Throwable {
		helper();
		se.studentdob();
	}

	@When("^Enter the student Gender$")
	public void enter_the_student_Gender() throws Throwable {
		helper();
		se.studentgender();
	}

	@When("^Enter the Student details$")
	public void enter_the_Student_details() throws Throwable {
		helper();
		se.studentdetails();
	}
	
	@When("^Enter the sibling details$")
	public void enter_the_sibling_details() throws Throwable {
		helper();
		se.Sibling();
	}

	@When("^Enter the Family member Info and other details$")
	public void enter_the_Family_member_Info_and_other_details() throws Throwable {
		helper();
		se.ParentInfo();
	}

	@When("^Enter the Student name for send for clarification$")
	public void Enter_the_Student_name_for_send_for_clarification() throws Throwable {

		se.studentnamehtsendforClarification();
	}

	@When("^Enter the Student name for CSC send for clarification$")
	public void Enter_the_Student_name_for_CSC_send_for_clarification() throws Throwable {

		se.studentnamecscsendforClarification();
	}
	
	@When("^Enter the Student name for CSC send for clarification to sw$")
	public void Enter_the_Student_name_for_CSC_send_for_clarification_to_sw() throws Throwable {

		se.studentnamecscsendforClarificationtosw();
	}
	
	@When("^Enter the Student name for CSM send for clarification to sw$")
	public void Enter_the_Student_name_for_CSM_send_for_clarification_to_sw() throws Throwable {

		se.studentnamecsmsendforClarificationtosw();
	}
	
	@When("^Enter the Student name for CSM send for clarification$")
	public void Enter_the_Student_name_for_CSM_send_for_clarification() throws Throwable {

		se.studentnamecsmsendforClarification();
	}
	
	@When("^Enter the Student name for HT Denied$")
	public void Enter_the_Student_name_for_HT_Denied() throws Throwable {

		se.studentnameHTDenied();
	}
	
	@When("^Enter the Student name for CSC Denied$")
	public void Enter_the_Student_name_for_CSC_Denied() throws Throwable {

		se.studentnameCSCDenied();
	}
	
	@When("^Enter the Student name for CSM Denied$")
	public void Enter_the_Student_name_for_CSM_Denied() throws Throwable {

		se.studentnameCSMDenied();
	}
	
	
}
