package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;

public class FamilyVisitSteps extends BaseClass {

	@When("^navigate to center menu and click Family social worker assignment submenu$")
	public void navigate_to_center_menu_and_click_Family_social_worker_assignment_submenu() throws Throwable {
		helper();

		fv.CenterMenu();
	}

	@When("^select the socialworker from the dropdown and search the student and click assign student family button$")
	public void select_the_socialworker_from_the_dropdown_and_search_the_student_and_click_assign_student_family_button()
			throws Throwable {

		fv.SelectSocialWorker();
	}

	@When("^select parent social worker from the dropdown and click save button and click ok to the alert button$")
	public void select_parent_social_worker_from_the_dropdown_and_click_save_button_and_click_ok_to_the_alert_button()
			throws Throwable {

		fv.SelectParentSocialWorker();
		fv.submit();

	}

	@When("^logout as headteacher$")
	public void logout_as_headteacher() throws Throwable {
		hta.logout();
	}

	@When("^navigate to the student menu and click and click family visit submenu$")
	public void navigate_to_the_student_menu_and_click_and_click_family_visit_submenu() throws Throwable {
		helper();
		fv.SelectFamilyVisitFromStudentMenu();
	}

	@When("^enter the student and fill the family visit form and click save button$")
	public void enter_the_student_and_fill_the_family_visit_form_and_click_save_button() throws Throwable {

		fv.searchTheStudentToFillTheForm();
	}

	@When("^click Yes and click the icon to view history of the family visit form$")
	public void click_Yes_and_click_the_icon_to_view_history_of_the_family_visit_form() throws Throwable {
		fv.Yes();
	}

	@When("^Choose No and click print button$")
	public void select_No_and_click_print() throws Throwable {
		helper();
		// fv = new FamilyVisit(driver);
		fv.No();
	}

	@When("^navigate to centre menu and click family social worker assignement submenu as sw$")
	public void navigate_to_centre_menu_and_click_family_social_worker_assignement_submenu_as_sw() throws Throwable {

		fv.centermenusw();
	}

	@When("^enter the student name and click edit the family visit form and click save and gives yes$")
	public void enter_the_student_name_and_click_edit_the_family_visit_form_and_click_save_and_gives_yes()
			throws Throwable {
		fv.EnterStudentName();
	}

	// Family visit transfer alert

	@When("^click the alert and assign social worker when students get transferred to another center$")
	public void click_the_alert_and_assign_social_worker_when_students_get_transferred_to_another_center()
			throws Throwable {
		helper();
		// fv = new pageObject.FamilyVisit(driver);
		// hta = new pageObject.HeadTeacherApproval(driver);
		fv.familyvisitwhenstudentsgettransferredtotheircenter();
		fv.EntertransferChildName();

	}

	@When("^Search The Student Wth CMF id$")
	public void search_The_Student_Wth_CMF_id() throws Throwable {

		fv.SelectSocialWorkerforTransferStudent();
	}

	@When("^search the student to assign social worker and click on the social worker assignment icon$")
	public void search_the_student_to_assign_social_worker_and_click_on_the_social_worker_assignment_icon()
			throws Throwable {

		fv.SelectStudentforTransfer();

	}

	/*
	 * @When("^select the socialworker from the dropdown and search the transferd student and click assign student family button$"
	 * ) public void
	 * select_the_socialworker_from_the_dropdown_and_search_the_transferd_student_and_click_assign_student_family_button
	 * () throws Throwable {
	 * 
	 * }
	 */

	@When("^select parent and assigned social worker from the dropdown and click save button and click ok to the alert button$")
	public void select_parent_and_assigned_social_worker_from_the_dropdown_and_click_save_button_and_click_ok_to_the_alert_button()
			throws Throwable {

		fv.SelectassingnedSocialWorker();

		fv.SelectParentSocialWorker();
		fv.submit();
	}

	@When("^logout as headteacher for the transfered student$")
	public void logout_as_headteacher_for_the_transfered_student() throws Throwable {
		hta.logout();
	}

	@When("^navigate to the student menu and click family visit submenu$")

	public void navigate_to_the_student_menu_and_click_family_visit_submenu() throws Throwable {
		fv.SelectFamilyVisitFromStudentMenu();
		fv.searchTheTransferStudentToFillTheFormassw();
		fv.Yes();
	}

}
