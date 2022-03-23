package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;

public class SubjectGradingReportSteps extends BaseClass{
	
	@Given("^click report menu and click subject grading submenu$")
	public void click_report_menu_and_click_subject_grading_submenu() throws Throwable {
		
		helper();
		sgr.SubjectGradingReportmenu();
		
	}

	@Given("^filter the SubjectGrading assignment and choose edit and make the changes$")
	public void filter_the_SubjectGrading_assignment_and_choose_edit_and_make_the_changes() throws Throwable {
	    sgr.searchSubjectGrade();
	    sgr.SubGradingedit();
	}

	@Given("^filter the SubjectGrading assignment and choose delete$")
	public void filter_the_SubjectGrading_assignment_and_choose_delete() throws Throwable {
		sgr.SearcEditedSubgrade();
		sgr.deletegrade();
	}
}
