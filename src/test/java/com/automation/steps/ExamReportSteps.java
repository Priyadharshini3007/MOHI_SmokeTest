package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;

public class ExamReportSteps extends BaseClass {
	
//10555-Ensure whether the examination added can be viewed in reports
	
	
	
	
	
	@Given("^select report menu and exam submenu$")
	public void select_report_menu_and_exam_submenu() throws Throwable {
	
		//er = new pageObject.ExamReport(driver);
		helper();
		er.ExamReportmenu();
	}

	@Given("^click Add exam to add the exam and click save$")
	public void click_Add_exam_to_add_the_exam_and_click_save() throws Throwable {
		er.addExam();
	}

	@Given("^filter the added exam and choose edit and make the changes$")
	public void filter_the_added_exam_and_choose_edit_and_make_the_changes() throws Throwable {
	    er.searchExam();
	    er.editExam();
	}

	@Given("^filter the edited exam and choose delete$")
	public void filter_the_edited_exam_and_choose_delete() throws Throwable {
		er.searchExamafterEdit();
		er.deleteexam();
	}

	


}
