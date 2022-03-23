package com.automation.steps;
import com.automation.pages.BaseClass;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class ExamResultEntrySteps extends BaseClass {

	@Given("^navigate to the Exam results page$")
	public void navigate_to_the_Exam_results_page() throws Throwable {
		 helper();
		 examresults.navi();
		 Thread.sleep(100);
	}

	@Given("^select center name as \"([^\"]*)\"$")
	public void select_center_name_as(String center) throws Throwable {
		examresults.select_center(center);
		Thread.sleep(100);
	}

	@Given("^select school name as \"([^\"]*)\"$")
	public void select_school_name_as(String school) throws Throwable {
		examresults.select_school(school);
		Thread.sleep(100);
	}

	@Given("^select class as \"([^\"]*)\"$")
	public void select_class_as(String classname) throws Throwable {
		examresults.select_class(classname);
		Thread.sleep(100);
	}

	@Given("^select section name as \"([^\"]*)\"$")
	public void select_section_name_as(String section) throws Throwable {
		examresults.select_section(section);
		Thread.sleep(100);
	}

	@Given("^select year as \"([^\"]*)\"$")
	public void select_year_as(String year) throws Throwable {
		examresults.select_year(year);
		Thread.sleep(100);
	}

	@Given("^select term as \"([^\"]*)\"$")
	public void select_term_as(String term) throws Throwable {
		examresults.select_term(term);
		Thread.sleep(100);
	}

	@Given("^select the exam name as \"([^\"]*)\"$")
	public void select_the_exam_name_as(String exam) throws Throwable {
		examresults.select_exam(exam);
		Thread.sleep(100);
	}

	@Given("^click on the get class roster button$")
	public void click_on_the_get_class_roster_button() throws Throwable {
		examresults.search();
		Thread.sleep(100);
	}

		@Given("^Enter the marks for the students in the class$")
	public void enter_the_marks_for_the_students_in_the_class() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor)getDriver();       
        //js.executeScript("scroll(1000, 0)");      // if the element is on top.       
        js.executeScript("scroll(0, 250)","");     // if the element is on bottom.
		examresults.maths();
		Thread.sleep(100);
		examresults.english();
		Thread.sleep(100);
		examresults.literacy();
		Thread.sleep(100);
		examresults.Kiswahili();
		Thread.sleep(100);
		examresults.kusoma();
		Thread.sleep(100);
		examresults.ES();
		Thread.sleep(100);
		examresults.HNA();
		Thread.sleep(100);
		examresults.RA();
		Thread.sleep(100);
	}

  @Given("^click the save button$")
	public void click_the_save_button() throws Throwable {
		examresults.savedetails();
		Thread.sleep(100);
	} 

	@Then("^verify message displayed$")
	public void verify_message_displayed() throws Throwable {
	   examresults.Checkmessage();
	   //examresults.totals();
	   Thread.sleep(100);
	  // examresults.takeSnapShot() ;
	}
	
	

}
