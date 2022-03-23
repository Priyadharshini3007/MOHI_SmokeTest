package com.automation.steps;


import com.automation.pages.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MessagePageSteps extends BaseClass {
	
	@Then("^search the student \"([^\"]*)\"$")
	public void searchthestudent(String cmforstudent){
		helper();
		messagepage.searchforstudent(cmforstudent);
	}
	@And("^add the message for the selected student$")
	public void addmessageforstudent(){
		helper();
		messagepage.addmessage();
	}
	@Then("^select the student from dashboard$")
	public void selectthestudentlink(){
		messagepage.selectthestudent();
		messagepage.switchthelabel();
		messagepage.editactions();
	}
	@And("^edit the message and approve$")
	public void editandapprovethemessage(){
		messagepage.editandapprovemessage();
	}
	@And("^switch the label of the message$")
	public void switchthelabelofmesage(){
		messagepage.switchthelabel();
	}
	@Then("^click on the print icon$")
	public void clickontheprinticon() throws InterruptedException{
		messagepage.clickonprint();
		 

 		}
	@And("^click on reject message$")
	public void rejectthemessage(){
		messagepage.rejectmessage();
	}
	

}
