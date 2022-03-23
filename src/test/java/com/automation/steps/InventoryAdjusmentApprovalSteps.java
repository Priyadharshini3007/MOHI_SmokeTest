package com.automation.steps;

import cucumber.api.java.en.When;
import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;

public class InventoryAdjusmentApprovalSteps extends BaseClass {
	
	@When("^Click on the inventory adjustment request waiting for approval link$")
	public void click_on_the_inventory_adjustment_request_waiting_for_approval_link() throws Throwable {
	    
		helper();
		iaa.inventoryListApproval();
			
	}

	@When("^Search the requisition code and Click Approve Inventory Adjustment icon$")
	public void search_the_requisition_code_and_Click_Approve_Inventory_Adjustment_icon() throws Throwable {
		
		helper();
		iaa.inventoryListApprovalicon();
	   
	}

	@When("^Enter the Comments and click Approve$")
	public void enter_the_Comments_and_click_Approve() throws Throwable {
	    
		iaa.Approval();
	}
	
	@When("^Enter the Comments and click SendForclarification$")
	public void enter_the_Comments_and_click_SendForclarification() throws Throwable {
		
		iaa.SendForClarication();
		
		helper();
		LoginPage lg= new LoginPage();
		
		hta.logout();
		lg.excelusername("procurementmanager");
		lg.submit();
	    lg.secquestion();
	    lg.submit();
	    lg.password();
	    lg.submit();
	    
	    iaa.needmoreinformationlink();
	    
	    hta.logout();
		lg.excelusername("NdoviniHeadTeacher");
		lg.submit();
	    lg.secquestion();
	    lg.submit();
	    lg.password();
	    lg.submit();
	    
	    iaa.receivedmoreinformationlink();
	}

	//Denied
	
	@When("^Enter the Comments and click Denied$")
	public void enter_the_Comments_and_click_Denied() throws Throwable {
		iaa.Denied();
	}
	
	//Approval
	
	@When("^Enter the Comments and click approve$")
	public void enter_the_Comments_and_click_approve() throws Throwable {
		iaa.Approval();
	}
	
	//Submission
	
	@When("^navigate to Procurement menu and select Requisition List Submenu$")
	public void navigate_to_Procurement_menu_and_select_Requisition_List_Submenu() throws Throwable {
	    helper();
	    iaa.inventoryAdjustmentmenu();
	}

	@When("^Enter the Requisition Code to make inventory adjustment and click search button$")
	public void enter_the_Requisition_Code_to_make_inventory_adjustment_and_click_search_button() throws Throwable {
		iaa.filterRequisitionCode();
	}

	@When("^Click Inventory Adjusment Icon and select Adjust item icon$")
	public void click_Inventory_Adjusment_Icon_and_select_Adjust_item_icon() throws Throwable {
		iaa.inventoryAdjustmentIcon();
	}

	@When("^Enter the Quantity to be moved for any one of the center and click submit for approval button$")
	public void enter_the_Quantity_to_be_moved_for_any_one_of_the_center_and_click_submit_for_approval_button() throws Throwable {
		iaa.enterTheQuantity();
	}
	
	@When("^Verify that the Inventory Adjustment Request Status is changed to Approved$")
	public void Verify_that_the_Inventory_Adjustment_Request_Status_is_changed_to_Approved() throws Throwable {
		iaa.InvAdjStatusApproved();
	}
	
	@When("^Verify that the Inventory Adjustment Request Status is changed to Denied$")
	public void Verify_that_the_Inventory_Adjustment_Request_Status_is_changed_to_Denied() throws Throwable {
		iaa.InvAdjStatusDenied();
	}

}
