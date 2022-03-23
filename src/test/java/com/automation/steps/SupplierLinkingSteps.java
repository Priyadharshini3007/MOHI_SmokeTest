package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;

public class SupplierLinkingSteps extends BaseClass{
	
	@When("^Select the Supplier name as \"(.*?)\"$")
	public void select_the_Supplier_name_as(String Supplier) throws Throwable {
		helper();
		supplierlink.supplierFn(Supplier);
	}

	@When("^Select the Item Type as \"(.*?)\" to link$")
	public void select_the_Item_Type_as_to_link(String Itemtype) throws Throwable {
		supplierlink.itemtypeFn(Itemtype);
	}

	@When("^Click Get Suplier Linking button$")
	public void click_Get_Suplier_Linking_button() throws Throwable {
		supplierlink.supplierlinkingFn();
	}

	@When("^Select the Item Information$")
	public void select_the_Item_Information() throws Throwable {
		supplierlink.supplierItemFn();
	}

	@When("^Click Save button$")
	public void click_Save_button() throws Throwable {
		supplierlink.saveBtn();
	}

	@When("^Verify the user intimation after saving supplier linking$")
	public void verify_the_user_intimation_after_saving_supplier_linking() throws Throwable {
		supplierlink.SupLinkMgSaveFn();
	}

}
