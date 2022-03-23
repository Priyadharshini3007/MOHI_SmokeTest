package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InventoryAuditSteps extends BaseClass{
	
	@When("^Enter the Audit Quantity as \"(.*?)\"$")
	public void enter_the_Audit_Quantity_as(String Qty) throws Throwable {
		helper();
		Ia.auditQtyFn(Qty);
	}

	@When("^Enter the Audit Date as \"(.*?)\"$")
	public void enter_the_Audit_Date_as(String aDate) throws Throwable {
		Ia.auditDateFn(aDate);
	}

	@When("^Enter the Auditor Comments as \"(.*?)\"$")
	public void enter_the_Auditor_Comments_as(String comments) throws Throwable {
		Ia.auditComFn(comments);
	}

	@Then("^Click Save icon$")
	public void click_Save_icon() throws Throwable {
		Ia.saveIcnFn();
	}
	
	@Then("^Verify the user intimation after saving audit details$")
	public void verify_the_user_intimation_after_saving_audit_details() throws Throwable {
		Ia.userVerifn();
	}

}
