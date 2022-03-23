package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;

public class EditFamilyVisitForm extends BaseClass{
	
	@When("^Select No and click print$")
	public void select_No_and_click_print() throws Throwable {
		
		//fv = new FamilyVisit(driver);
		fv.No();
	}

	/*@When("^navigate to centre menu and click family social worker assignement submenu as sw$")
	public void navigate_to_centre_menu_and_click_family_social_worker_assignement_submenu_as_sw() throws Throwable {
		
		fv.centermenusw();
	}
*/
	/*@When("^enter the student name and click edit the family visit form and click save and gives yes$")
	public void enter_the_student_name_and_click_edit_the_family_visit_form_and_click_save_and_gives_yes() throws Throwable {
		fv.EnterStudentName();
	}*/



}
