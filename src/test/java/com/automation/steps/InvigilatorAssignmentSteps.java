package com.automation.steps;
import com.automation.pages.BaseClass;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class InvigilatorAssignmentSteps extends BaseClass {

	@Given("^navigate to the Invigilator Assignment page$")
	public void navigate_to_the_Invigilator_Assignment_page() throws Throwable {
		helper();
		ie.navigation();
	    Thread.sleep(100);
	}

	@Given("^select the center as \"([^\"]*)\"$")
	public void select_the_center_as(String center) throws Throwable {
		ie.select_center(center);
		Thread.sleep(100);
	}

	@Given("^select the school as \"([^\"]*)\"$")
	public void select_the_school_as(String school) throws Throwable {
		ie.select_school(school);
		Thread.sleep(100);
	}

	@Given("^select the year as \"([^\"]*)\"$")
	public void select_the_year_as(String year) throws Throwable {
		ie.select_year(year);
		Thread.sleep(100);
	}
	
	@Given("^select the class name as \"([^\"]*)\"$")
	public void select_the_class_name_as(String classname) throws Throwable {
		ie.select_class(classname);
		Thread.sleep(100);
	}

	@Given("^select the term as \"([^\"]*)\"$")
	public void select_the_term_as(String term) throws Throwable {
		ie.select_term(term);
		Thread.sleep(100);
	}

	@Given("^select the section as \"([^\"]*)\"$")
	public void select_the_section_as(String section) throws Throwable {
		ie.select_section(section);
		Thread.sleep(100);
	}

	@Given("^select the exam to schedule the dates as \"([^\"]*)\"$")
	public void select_the_exam_to_schedule_the_dates_as(String exam) throws Throwable {
		ie.select_exam(exam);
		Thread.sleep(100);
	}

	@Given("^select the teacher for invigilation as \"([^\"]*)\"$")
	public void select_the_teacher_for_invigilation_as(String teacher) throws Throwable {
		ie.select_teacher(teacher);
		Thread.sleep(100);
	}

	@Given("^click on the add button for scheduling the date for individual subjects$")
	public void click_on_the_add_button_for_scheduling_the_date_for_individual_subjects() throws Throwable {
		ie.AddSubj();
		Thread.sleep(500);
		ie.Subj1();
		Thread.sleep(500);
		ie.AddSubj();
		Thread.sleep(500);
		ie.Subj2();
		Thread.sleep(500);
		ie.AddSubj();
		Thread.sleep(500);
		ie.Subj3();
		Thread.sleep(500);
		ie.AddSubj();
		Thread.sleep(500);
		ie.Subj4();
		Thread.sleep(500);
		ie.AddSubj();
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();       
        //js.executeScript("scroll(1000, 0)");      // if the element is on top.       
        js.executeScript("scroll(0, 1000)","");     // if the element is on bottom.
		ie.Subj5();
		Thread.sleep(500);
		//ie.AddSubj();
		//Thread.sleep(500);
		//ie.Subj6();
		//Thread.sleep(500);
	}
	
	@Given("^save the details$")
	public void save_the_details() throws Throwable {
	    ie.save_details();
	    Thread.sleep(1000);
	}
	
	@Then("^verify the text message displayed$")
	public void verify_the_text_message_displayed() throws Throwable {
		ie.Checkmessage();
	}	

}
