package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.*;

public class CtSteps extends BaseClass {

@Given("^navigate$")
public void navigate() throws Throwable {
    helper();
   ct1.navi();
   
}

@Given("^select the center name as \"([^\"]*)\"$")
public void select_the_center_name_as(String center) throws InterruptedException  {
	ct1.select_center(center);
}

@Given("^select the school name as \"([^\"]*)\"$")
public void select_the_school_name_as(String school) throws Throwable {
	ct1.select_school(school);
}

@Given("^select the Class as \"([^\"]*)\"$")
public void select_the_Class_as(String classname) throws Throwable {
	ct1.select_class(classname);
}

@Given("^select the Section as \"([^\"]*)\"$")
public void select_the_Section_as(String section) throws Throwable {
	ct1.select_section(section);
}

@Given("^select the Teacher as \"([^\"]*)\"$")
public void select_the_Teacher_as(String teacher) throws Throwable {
	ct1.select_teacher(teacher);
}

@Given("^click save$")
public void click_save() throws Throwable {
	ct1.select_save();
	}

@Then("^verify the text message$")
public void verify_the_text_message() throws Throwable {
	ct1.Checkmessage();
}

}
