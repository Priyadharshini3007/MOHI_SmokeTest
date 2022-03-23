package com.automation.steps;
import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class SubjectGradingSteps extends BaseClass {

	
	@Given("^navigate to the subject grading page$")
	public void navigate_to_the_subject_grading_page() throws Throwable {
		helper();
	    sg.navigation();
	    Thread.sleep(100);
	}

	@Given("^select the class as \"([^\"]*)\"$")
	public void select_the_class_as(String classname) throws Throwable {
		sg.select_class(classname);
		Thread.sleep(100);
	}

	@Given("^select the subject as \"([^\"]*)\"$")
	public void select_the_subject_as(String subj) throws Throwable {
		sg.select_subject(subj);
		Thread.sleep(100);
	}

	@Given("^enter the start percentage for grade points as \"([^\"]*)\"$")
	public void enter_the_start_percentage_for_grade_points_as(String stperc) throws Throwable {
		sg.Perc_start(stperc);
		Thread.sleep(100);
	}

	@Given("^enter the end percentage for grade points as \"([^\"]*)\"$")
	public void enter_the_end_percentage_for_grade_points_as(String edperc) throws Throwable {
		sg.Perc_end(edperc);
		Thread.sleep(100);
	}
		
	@Given("^enter the grade as \"([^\"]*)\"$")
	public void enter_the_grade_as(String grade) throws Throwable {
		sg.grade(grade);
		Thread.sleep(100);
	}

	@Given("^enter the points as \"([^\"]*)\"$")
	public void enter_the_points_as(String points) throws Throwable {
		sg.points(points);
		Thread.sleep(100);
	}

	@Given("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
		sg.submit();
		Thread.sleep(100);
	}
	
	@Then("^verify the text message on the page$")
	public void verify_the_text_message_on_the_page() throws Throwable {
		sg.Checkmessage();
	}
}
