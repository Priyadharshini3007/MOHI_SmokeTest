package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;

public class GRNProcessSteps extends BaseClass{
	
	@When("^Click GRN icon$")
	public void click_GRN_icon() throws Throwable {
		helper();
		Grn.GrnIconFn();
	}
	
	@When("^Enter the Item Quantity Received$")
	public void enter_the_Item_Quantity_Received() throws Throwable {
		Grn.ItmQtyRcvdFn();
	}
	
	@When("^Enter the Receiving Comment$")
	public void enter_the_Receiving_Comment() throws Throwable {
		Grn.RCmntsFn();
	}

	@When("^Enter the Invoice Number$")
	public void enter_the_Invoice_Number() throws Throwable {
		Grn.InvNoFn();
	}

	@When("^Enter the Delivery Number$")
	public void enter_the_Delivery_Number() throws Throwable {
		Grn.DelvryNoFn();
	}

	@When("^Click Save button to save GRN details$")
	public void click_Save_button_to_save_GRN_details() throws Throwable {
		Grn.SaveBtnFn();
	}
	
	@When("^Verify the user intimation for saving GRN$")
	public void verify_the_user_intimation_for_saving_GRN() throws Throwable {
		Grn.GRNUserIntMgFn();
	}

}
