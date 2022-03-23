package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Then;

public class InventoryReportSteps extends BaseClass{

	@Then("^Select the Center/Department as \"(.*?)\"$")
	public void select_the_Center_Department_as(String center) {
		helper();
		inventoryrep.centerFn(center);
	}

	@Then("^Click Add new item type icon$")
	public void click_Add_new_item_type_icon() {
		inventoryrep.AddItemTypeFn();
	}

	@Then("^Enter the Item Type Code as \"(.*?)\"$")
	public void enter_the_Item_Type_Code_as(String itemTypeCode) {
		inventoryrep.ItemTypeCodeFn(itemTypeCode);
	}

	@Then("^Enter the Item Type Name as \"(.*?)\"$")
	public void enter_the_Item_Type_Name_as(String itemTypeName) {
		inventoryrep.ItemTypeNameFn(itemTypeName);
	}

	@Then("^Enter the Description as \"(.*?)\"$")
	public void enter_the_Description_as(String itemTypeDesc) {
		inventoryrep.ItemTypeDescFn(itemTypeDesc);
	}

	@Then("^Select the Quantity Unit$")
	public void select_the_Quantity_Unit() {
		inventoryrep.kilogramFn();
	}

	@Then("^Click Save Button$")
	public void click_Save_Button() {
		helper();
		inventoryrep.SaveItemTypeFn();
	}

	@Then("^Verify the user intimation after saving the item type$")
	public void verify_the_user_intimation_after_saving_the_item_type() {
		inventoryrep.itemTypeUserMsgFn();
	}

	@Then("^Select the Item Type as \"(.*?)\"$")
	public void select_the_Item_Type_as(String itemtype) throws Throwable {
		helper();
		inventoryrep.ItemTypeFn(itemtype);
	}

	@Then("^Click the Edit icon of the selected item type$")
	public void click_the_Edit_icon_of_the_selected_item_type() {
		inventoryrep.editItemTypeFn();
	}

	@Then("^Edit the Item Type name as \"(.*?)\"$")
	public void edit_the_Item_Type_name_as(String editItmTyp) {
		inventoryrep.editItemTypeNameFn(editItmTyp);
	}

	@Then("^Click the Add Quantity Unit icon$")
	public void click_the_Add_Quantity_Unit_icon() throws Throwable {
		inventoryrep.quantityAddIconFn();
	}

	@Then("^Enter the Quantity Unit as \"(.*?)\"$")
	public void enter_the_Quantity_Unit_as(String quantity) throws Throwable {
		inventoryrep.quantityAddFn(quantity);
	}

	@Then("^Click Save icon of Quantity Unit$")
	public void click_Save_icon_of_Quantity_Unit() throws Throwable {
		helper();
		inventoryrep.saveQuantityIcon();
	}

	@Then("^Click the Edit Quantity Unit icon$")
	public void click_the_Edit_Quantity_Unit_icon() throws Throwable {
		inventoryrep.quantityEditIconFn();
	}

	@Then("^Click Add item icon$")
	public void click_Add_item_icon() {
		inventoryrep.itemAddFn();
	}

	@Then("^Enter the Item Name as \"(.*?)\"$")
	public void enter_the_Item_Name_as(String itemName) {
		inventoryrep.itemNameFn(itemName);
	}

	@Then("^Enter the Item Description as \"(.*?)\"$")
	public void enter_the_Item_Description_as(String itemDesc) {
		inventoryrep.itemDescFn(itemDesc);
	}

	@Then("^Select the Supplier as \"(.*?)\"$")
	public void select_the_Supplier_as(String Supplier) {
		inventoryrep.supplierFn(Supplier);
	}

	@Then("^Verify the user intimation after saving the item$")
	public void verify_the_user_intimation_after_saving_the_item() {
		inventoryrep.itemUserMsgFn();
	}

	@Then("^Search the Item Name as \"(.*?)\"$")
	public void search_the_Item_Name_as(String itemNameSearch) throws Throwable {
		helper();
		inventoryrep.searchFn(itemNameSearch);		
	}

	@Then("^Click Get Inventory button$")
	public void click_Get_Inventory_button() throws Throwable {
		inventoryrep.btnSearchInventory();
	}

	@Then("^Click Edit item icon$")
	public void click_Edit_item_icon() throws Throwable {
		inventoryrep.editItemFn();
	}

	@Then("^Click Disable item icon$")
	public void click_Disable_item_icon() throws Throwable {
		inventoryrep.disableItemFn();
	}

	@Then("^Verify that the item is disabled$")
	public void verify_that_the_item_is_disabled() throws Throwable {
		inventoryrep.verification();
	}

	@Then("^Click Enable item icon$")
	public void click_Enable_item_icon() throws Throwable {
		inventoryrep.enableItemFn();
	}

	@Then("^Verify that the item is enabled$")
	public void verify_that_the_item_is_enabled() throws Throwable {
		inventoryrep.verification();
	}

	@Then("^Edit the Quantity Unit as \"(.*?)\"$")
	public void edit_the_Quantity_Unit_as(String arg1) throws Throwable {
		
	}

	@Then("^Edit the Item Name as \"(.*?)\"$")
	public void edit_the_Item_Name_as(String arg1) throws Throwable {

	}

}
