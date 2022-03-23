package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Then;

public class InventoryTrackingSteps extends BaseClass{
	
	@Then("^Select the Item as \"(.*?)\"$")
	public void select_the_Item_as(String item) {
		helper();
		It.itemNameFn(item);
	}

	@Then("^Enter the Received Date$")
	public void enter_the_Received_Date() throws InterruptedException {
		It.receivedDateFn();
	}

	@Then("^Enter the Received Balance as \"(.*?)\"$")
	public void enter_the_Received_Balance_as(String ReceivedBalance) throws InterruptedException {
		It.receivedBalanceFn(ReceivedBalance);
	}

	@Then("^Enter the Received Balance Unit as \"(.*?)\"$")
	public void enter_the_Received_Balance_Unit_as(String ReceivedBalQtyUnts) throws InterruptedException {
		It.receivedBalQtyUntsFn(ReceivedBalQtyUnts);
	}

	@Then("^Enter the Received Quantity as \"(.*?)\"$")
	public void enter_the_Received_Quantity_as(String ReceivedQty) {
		It.receivedQtyFn(ReceivedQty);
	}

	@Then("^Enter the Received Quantity Unit as \"(.*?)\"$")
	public void enter_the_Received_Quantity_Unit_as(String ReceivedQtyUnits) throws InterruptedException {
		It.receivedQtyUnitsFn(ReceivedQtyUnits);
	}

	@Then("^Enter the Issued Date$")
	public void enter_the_Issued_Date_as() {
		It.issuedDateFn();
	}

	@Then("^Enter the Issued Quantity as \"(.*?)\"$")
	public void enter_the_Issued_Quantity_as(String IssuedQty) {
		It.issuedQtyFn(IssuedQty);
	}

	@Then("^Enter the Issued Quantity Unit as \"(.*?)\"$")
	public void enter_the_Issued_Quantity_Unit_as(String IssuedQtyUnits) {
		It.issuedQtyUnitsFn(IssuedQtyUnits);
	}

	@Then("^Enter the Balance Date$")
	public void enter_the_Balance_Date_as() {
		It.balanceDateFn();
	}

	@Then("^Enter the Comment as \"(.*?)\" to save tracking$")
	public void enter_the_Comments_as_to_save_tracking(String Comments) {
		It.commentsFn(Comments);
	}

	@Then("^Click Save the track record icon$")
	public void click_Save_the_track_record_icon() throws InterruptedException {
		It.saveTrackRecordFn();
	}
	
	@Then("^Click the Edit track icon$")
	public void click_the_Edit_track_icon() {
	    It.editTrackRecordFn();
	}
	
	@Then("^Verify the user intimation after saving tracking details$")
	public void verify_the_user_intimation_after_saving_tracking_details() throws Throwable {
		It.userVerifn();
	}

}
