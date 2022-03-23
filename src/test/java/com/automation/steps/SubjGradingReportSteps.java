/*package com.automation.steps;
import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;


public class SubjGradingReportSteps extends BaseClass {


@Given("^navigate to the subject grading report page$")
public void navigate_to_the_subject_grading_report_page() throws Throwable {
	helper();
	sgreport.navigation();
    Thread.sleep(100);
}

@Given("^select the class for search as \"([^\"]*)\"$")
public void select_the_class_for_search_as(String classname) throws Throwable {
	sgreport.select_class(classname);
	Thread.sleep(100);
}

@Given("^select the subject for search as \"([^\"]*)\"$")
public void select_the_subject_for_search_as(String subj) throws Throwable {
	sgreport.select_subject(subj);
	Thread.sleep(100);
}

@Given("^enter the start percentage for grade points for search as \"([^\"]*)\"$")
public void enter_the_start_percentage_for_grade_points_for_search_as(String stperc) throws Throwable {
	sgreport.Perc_start(stperc);
	Thread.sleep(100);
}

@Given("^enter the end percentage for grade points for search as \"([^\"]*)\"$")
public void enter_the_end_percentage_for_grade_points_for_search_as(String edperc) throws Throwable {
	sgreport.Perc_end(edperc);
	Thread.sleep(100);
}

@Given("^enter the grade for search as \"([^\"]*)\"$")
public void enter_the_grade_for_search_as(String grade) throws Throwable {
	sgreport.grade(grade);
	Thread.sleep(100);
}

@Given("^enter the points for search as \"([^\"]*)\"$")
public void enter_the_points_for_search_as(String points) throws Throwable {
	sgreport.points(points);
	Thread.sleep(100);
}

@Given("^click the search button$")
public void click_the_search_button() throws Throwable {
	sgreport.submit();
	Thread.sleep(100);
}
}
*/