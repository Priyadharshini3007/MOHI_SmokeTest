package com.automation.steps;
import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;


public class InvigilatorAssignmentReportSteps extends BaseClass{

	
	@Given("^navigate to Invigilator Assignment report page$")
	public void navigate_to_Invigilator_Assignment_report_page() throws Throwable {
		helper();
		iar.navigation();
	    Thread.sleep(100);
	}

	@Given("^select the center for search as \"([^\"]*)\"$")
	public void select_the_center_for_search_as(String center) throws Throwable {
		iar.select_center(center);
		Thread.sleep(100);
	}

	@Given("^select the class name for search as \"([^\"]*)\"$")
	public void select_the_class_name_for_search_as(String classname) throws Throwable {
		iar.select_class(classname);
		Thread.sleep(100);
	}

	@Given("^select the section for search as \"([^\"]*)\"$")
	public void select_the_section_for_search_as(String section) throws Throwable {
		iar.select_section(section);
		Thread.sleep(100);
	}
	
	@Given("^select subject for search as \"([^\"]*)\"$")
	public void select_subject_for_search_as(String subject) throws Throwable {
		iar.select_subject(subject);
		Thread.sleep(100);
	}

	@Given("^select the year for search as \"([^\"]*)\"$")
	public void select_the_year_for_search_as(String year) throws Throwable {
		iar.select_year(year);
		Thread.sleep(100);
	}
	
	@Given("^select term for search as \"([^\"]*)\"$")
	public void select_term_for_search_as(String term) throws Throwable {
		iar.select_term(term);
		Thread.sleep(100);
	}

	@Given("^click on the search button for the details$")
	public void click_on_the_search_button_for_the_details() throws Throwable {
		iar.submit();
	    Thread.sleep(1000);
	}

}
