package com.automation.steps;
import com.automation.pages.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookassignmentSteps extends BaseClass{
	
	@Then("^Choose the centre \"([^\"]*)\"$")
	public void choosethecentre(String centre){
		helper();
		bookassignment.selectcentrename(centre);
		
	}
	
	@And("^select the classname \"([^\"]*)\"$")
	public void selecttheclass(String schoolname){
		bookassignment.selectschoolname(schoolname);
	}
	@Then("^select the class section \"([^\"]*)\"$")
	public void selectheclasssection(String classsection){
		bookassignment.selectclasssection(classsection);
	}
	
	@Then("^select the subject \"([^\"]*)\"$")
	public void selectthesubject(String subject){
		bookassignment.selectsubjectfield(subject);
	}
	@And("^choose the child subject \"([^\"]*)\"$")
	public void choosethechildsubject(String childsubject){
		bookassignment.selectchildsubjectfield(childsubject);
	}
	
	@When("^search with the bookname \"([^\"]*)\"$")
	public void selectwiththebookname(String bookname) throws InterruptedException{
		bookassignment.searchwithbookname(bookname);
	}
	@Then("^enter the bookratio for the books$")
	public void enterthebookratio(){
		bookassignment.assignbookratio();
	}
	@And("^click on assign book$")
	public void clickassignbook(){
		bookassignment.assignbook();
	}

}
