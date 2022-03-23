package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;

public class InventoryUploadSteps extends BaseClass{
	
	@When("^Select the inventory file and upload$")
	public void select_the_inventory_file_and_upload() throws Throwable {
		helper();
		InvUp.InventoryUploadFn();
	}

	@When("^Verify the confirmation message for inventory upload$")
	public void verify_the_confirmation_message_for_inventory_upload() throws Throwable {
		InvUp.InvUpldUserIntMgFn();
	}

}
