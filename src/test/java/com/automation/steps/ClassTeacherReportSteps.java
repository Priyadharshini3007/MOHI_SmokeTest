
package com.automation.steps;
import com.automation.pages.BaseClass;
import cucumber.api.java.en.Given;


public class ClassTeacherReportSteps extends BaseClass {

	@Given("^select report menu and Class teacher submenu$")
	public void select_report_menu_and_Class_teacher_submenu() throws Throwable {

		helper();
		ctr.classTeacherReport();
	}

	@Given("^click Add teacher to add the teacher and click save$")
	public void click_Add_teacher_to_add_the_teacher_and_click_save() throws Throwable {
		ctr.addClassTeacher();

	}

	@Given("^filter the added teacher and choose edit and make the changes$")
	public void filter_the_added_teacher_and_choose_edit_and_make_the_changes() throws Throwable {
		ctr.searchTeacher();
		ctr.editTeacher();
       ctr.editClassTeacher();
	}

	@Given("^filter the edited teacher and choose delete$")
	public void filter_the_edited_teacher_and_choose_delete() throws Throwable {
		ctr.searchTeacher();
        ctr.deleteTeacher();
	}

}
