package com.automation.steps;

	import cucumber.api.java.en.*;
	import com.automation.pages.BaseClass;

	public class Ct_ReportSteps extends BaseClass {
	
	@Given("^navigate to report$")
	public void navigate_to_report() throws Throwable {
		helper();
		CtReport.navigation();
	}
	
	@Given("^click the center for search as \"([^\"]*)\"$")
	public void click_the_center_for_search_as(String center) throws Throwable {
		CtReport.select_center(center);
	}

	@Given("^click the class for search as \"([^\"]*)\"$")
	public void click_the_class_for_search_as(String classname) throws Throwable {
		CtReport.select_class(classname);
	}

	@Given("^click the section for search as \"([^\"]*)\"$")
	public void click_the_section_for_search_as(String section) throws Throwable {
		CtReport.select_section(section);
	}
	
	@Given("^click the teacher for search as \"([^\"]*)\"$")
	public void click_the_teacher_for_search_as(String teacher) throws Throwable {
		CtReport.select_teacher(teacher);
	}
	
	@Given("^click on search button$")
	public void click_on_search_button() throws Throwable {
		CtReport.search();
	}
}
		