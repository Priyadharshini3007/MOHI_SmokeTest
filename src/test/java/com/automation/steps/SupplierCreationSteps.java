package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;

public class SupplierCreationSteps extends BaseClass {
	
	@When("^Click Add Supplier icon$")
	public void click_Add_Supplier_icon(){
		helper();
		suppliercreate.addIconFn();
	}

	@When("^Enter the Supplier Code as \"(.*?)\"$")
	public void enter_the_Supplier_Code_as(String Scode) {
		suppliercreate.codeFn(Scode);
	}

	@When("^Enter the Supplier Name as \"(.*?)\"$")
	public void enter_the_Supplier_Name_as(String Sname) {
		suppliercreate.nameFn(Sname);
	}

	@When("^Enter the Address as \"(.*?)\"$")
	public void enter_the_Address_as(String Address) {
		suppliercreate.Address1Fn(Address);
	}

	@When("^Enter the City as \"(.*?)\"$")
	public void enter_the_City_as(String Scity) {
		suppliercreate.CityFn(Scity);
	}

	@When("^Enter the Contact Person Name as \"(.*?)\"$")
	public void enter_the_Contact_Person_Name_as(String person) {
		suppliercreate.ContactPerson1Fn(person);
	}

	@When("^Enter the Contact Person Phone as \"(.*?)\"$")
	public void enter_the_Contact_Person_Phone_as(String phone) {
		suppliercreate.PhoneNo1Fn(phone);
	}

	@When("^Enter the Contact Person Email as \"(.*?)\"$")
	public void enter_the_Contact_Person_Email_as(String email) {
		suppliercreate.Email1Fn(email);
	}

	@When("^Click the Add Supplier Save button$")
	public void click_the_Add_Supplier_Save_button() {
		suppliercreate.saveBtn();
	}
	
	@When("^Verify the user intimation after saving supplier details$")
	public void verify_the_user_intimation_after_saving_supplier_details() {
		suppliercreate.UserIntMgSaveFn();
	}
	
	@When("^Click the edit icon$")
	public void click_the_edit_icon() {
		suppliercreate.editIconFn();
	}
	
	@When("^Enter the supplier name in search box as \"(.*?)\"$")
	public void enter_the_supplier_name_in_search_box_as(String Sname) {
		helper();
		suppliercreate.searchFn(Sname);
	}

	@When("^Edit the name field as \"(.*?)\"$")
	public void edit_the_name_field_as(String editName) {
		suppliercreate.editNameFn(editName);
	}

	@When("^Edit the email field as \"(.*?)\"$")
	public void edit_the_email_field_as(String editEmail) {
		suppliercreate.editEmailFn(editEmail);
	}
	
	@When("^Click the delete icon$")
	public void click_the_delete_icon() {
		suppliercreate.deleteIconFn();
	}

	@When("^Verify the user intimation after deleting supplier$")
	public void verify_the_user_intimation_after_deleting_supplier() {
		suppliercreate.UserIntMgDeleteFn();
	}
	
	@When("^Click the Refresh icon$")
	public void click_the_Refresh_icon() {
		suppliercreate.refreshBtn();
	}

	@When("^Navigate to the next page of the list$")
	public void navigate_to_the_next_page_of_the_list() {
		suppliercreate.nextPageFn();
	}

	@When("^Navigate to the last page of the list$")
	public void navigate_to_the_last_page_of_the_list() {
		suppliercreate.lastPageFn();
	}

	@When("^Increase the page size by \"(.*?)\"$")
	public void increase_the_page_size_by(String size) {
		suppliercreate.pageSizeFn(size);
	}


}
