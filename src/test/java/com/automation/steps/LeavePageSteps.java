package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeavePageSteps extends BaseClass {
	
	@When("^select the addnewicon$")
	public void selectaddnewicon(){
		helper();
		leavepage.addnewholiday();
	}
	
	@Then("^enter the holiday name \"(.*?)\"$")
	public void addnewholiday(String holidayname){
		leavepage.addholidayname(holidayname);
	}
	@And("^select the from date \"(.*?)\"$")
	public void selectfromdate(String Fromdate){
		leavepage.selectingfromdate(Fromdate);
		
	}
	@Then("^select the to date \"(.*?)\"$")
	public void selecttodate(String Todate){
		leavepage.selecttodate(Todate);
	}
	@And("^click repeat checkbox$")
	public void clickrepeatcheckbox(){
		leavepage.selectrepeatcheckbox();
	}
	@Then("^save the Holiday$")
	public void savetheholiday(){
		leavepage.saveholiday();
	}
	

}
