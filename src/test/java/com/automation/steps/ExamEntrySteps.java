package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ExamEntrySteps extends BaseClass {
	
	@Given("^navigate to the exam entry page$")
	public void navigate_to_the_exam_entry_page() throws Throwable {
		helper();
	    ee.navigation();
	    Thread.sleep(1000);
	}

	@Given("^enter the examination name as \"([^\"]*)\"$")
	public void enter_the_examination_name_as(String examname) throws Throwable {
		ee.Exam_name(examname);
		Thread.sleep(1000);
	}

	@Given("^select the year of examination as \"([^\"]*)\"$")
	public void select_the_year_of_examination_as(String examyear) throws Throwable {
		ee.Exam_year(examyear);
		Thread.sleep(1000);
	}

	@Given("^select the term of examination as \"([^\"]*)\"$")
	public void select_the_term_of_examination_as(String examterm) throws Throwable {
		ee.select_term(examterm);
		Thread.sleep(1000);
	}

	@Given("^select the class for which exam is scheduled as \"([^\"]*)\"$")
	public void select_the_class_for_which_exam_is_scheduled_as(String classname) throws Throwable {
		ee.select_class(classname);
		Thread.sleep(1000);
	}

	@Given("^click on save button$")
	public void click_on_save_button() throws Throwable {
		Thread.sleep(2000);
	    ee.submit();
	}
	
	@Then("^verify the message$")
	public void verify_the_message() throws Throwable {
		ee.Checkmessage();
	}
	
}
