package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.And;

public class GiftSteps extends BaseClass{
	
	@And("^Navigate to Active Students$")
	public void navigate_to_Active_Students() throws Throwable {
		helper();
	    gift.ActiveStudent();
	}

	@And("^Get the CMFID of the Active Student$")
	public void get_the_CMFID_of_the_Active_Student() throws Throwable {
	     gift.getStudent();
	}
	
	@And("^Get the CMFID of the Active Student1$")
	public void get_the_CMFID_of_the_Active_Student1() throws Throwable {
	     gift.getStudent1();
	}
	
	@And("^Get the CMFID of the Active Student2$")
	public void get_the_CMFID_of_the_Active_Student2() throws Throwable {
	     gift.getStudent2();
	}
	

	@And("^Get the CMFID of the Active Student3$")
	public void get_the_CMFID_of_the_Active_Student3() throws Throwable {
	     gift.getStudent3();
	}
	
	@And("^Get the CMFID of the Active Student4$")
	public void get_the_CMFID_of_the_Active_Student4() throws Throwable {
	     gift.getStudent4();
	}

	@And("^Navigate to student gift$")
	public void navigate_to_student_gift() throws Throwable {
		helper();
	    gift.giftMenu();
	}

	@And("^Click Add Gift icon$")
	public void click_Add_Gift_icon() throws Throwable {
	    gift.addGift();
	}

	@And("^Select the Gift type as Cash Gift$")
	public void select_the_Gift_type_as_Cash_Gift() throws Throwable {
		helper();
	   gift.giftType();
	}

	@And("^Pass the CMFID of the Active Student$")
	public void pass_the_CMFID_of_the_Active_Student() throws Throwable {
	   gift.selectChild();
	}
	
	@And("^Pass the CMFID of the Active Student1$")
	public void pass_the_CMFID_of_the_Active_Student1() throws Throwable {
	   gift.selectChild1();
	}
	
	@And("^Pass the CMFID of the Active Student2$")
	public void pass_the_CMFID_of_the_Active_Student2() throws Throwable {
	   gift.selectChild2();
	}
	
	@And("^Pass the CMFID of the Active Student3$")
	public void pass_the_CMFID_of_the_Active_Student3() throws Throwable {
	   gift.selectChild3();
	}
	
	@And("^Pass the CMFID of the Active Student4$")
	public void pass_the_CMFID_of_the_Active_Student4() throws Throwable {
	   gift.selectChild4();
	}

	@And("^Select Gift from the dropdown$")
	public void select_Gift_from_the_dropdown() throws Throwable {
	  gift.selectGift();
	  gift.giftDescription();
	}

	@And("^Enter the Donor name$")
	public void enter_the_Donor_name() throws Throwable {
	    gift.donarName();
	}
	
	@And("^Enter the Comments for gift$")
	public void enter_the_Comments_for_gift() throws Throwable {
	    gift.Comments();
	}

	@And("^Click save to save the gift$")
	public void click_save_to_save_the_gift() throws Throwable {
	  gift.saveAddedGift();
	}
	
	//Gift Processing
	
	@And("^Search Child$")
	public void search_Child() throws Throwable {
		gift.searchChild();
	}
	
	@And("^Search Child1$")
	public void search_Child1() throws Throwable {
		gift.searchChild1();
	}
	
	@And("^Search Child2$")
	public void search_Child2() throws Throwable {
		gift.searchChild2();
	}
	
	@And("^Search Child3$")
	public void search_Child3() throws Throwable {
		gift.searchChild3();
	}
	
	@And("^Search Child4$")
	public void search_Child4() throws Throwable {
		gift.searchChild4();
	}

	@And("^Choose Action CheckBox$")
	public void choose_Action_CheckBox() throws Throwable {
	 gift.checkBox();
	}

	@And("^Click Mark As Processing Button$")
	public void click_Mark_As_Processing_Button() throws Throwable {
	    gift.MarkProcessing();
	}

	@And("^Click Ok for the popup$")
	public void click_Ok_for_the_popup() throws Throwable {
	   gift.popup();
	}

	@And("^Choose the Status dropdown to Order Processing$")
	public void choose_the_Status_dropdown_to_Order_Processing() throws Throwable {
	 gift.StatusDrpDwn();
	}

	@And("^Verify the latest gift which we processed recently$")
	public void verify_the_latest_gift_which_we_processed_recently() throws Throwable {
	 gift.verifyrecentlyaddedGift();
	}
	
	@And("^Verify the latest gift which we processed recently1$")
	public void verify_the_latest_gift_which_we_processed_recently1() throws Throwable {
	 gift.verifyrecentlyaddedGift1();
	}
	
	@And("^Verify the latest gift which we processed recently2$")
	public void verify_the_latest_gift_which_we_processed_recently2() throws Throwable {
	 gift.verifyrecentlyaddedGift2();
	}
	
	@And("^Verify the latest gift which we processed recently3$")
	public void verify_the_latest_gift_which_we_processed_recently3() throws Throwable {
	 gift.verifyrecentlyaddedGift3();
	}
	
	@And("^Verify the latest gift which we processed recently4$")
	public void verify_the_latest_gift_which_we_processed_recently4() throws Throwable {
	 gift.verifyrecentlyaddedGift4();
	}

	@And("^Click Mark as Ready for pickup button$")
	public void click_Mark_as_Ready_for_pickup_button() throws Throwable {
	   gift.ReadyForPickup();
	}

	@And("^Choose the Status dropdown to Order Ready for Pickup$")
	public void choose_the_Status_dropdown_to_Order_Ready_for_Pickup() throws Throwable {
	  gift.OrderReadyStatusDrpDwn();
	}

	@And("^click Mark as picked up$")
	public void click_Mark_as_picked_up() throws Throwable {
	  gift.markAsPickupbutton();
	}

	@And("^Verify Store admin receives an alert says xx order as picked up today which is non clickable$")
	public void verify_Store_admin_receives_an_alert_says_xx_order_as_picked_up_today_which_is_non_clickable() throws Throwable {
	  gift.VerifyPickedUpTdyAlert();
	}

	@And("^Click checkout icon$")
	public void click_checkout_icon() throws Throwable {
	  gift.CheckOutButton();
	}

	@And("^Choose the status dropdown to Checked out$")
	public void choose_the_status_dropdown_to_Checked_out() throws Throwable {
	  gift.checkedOutStatusDrpDwn();
	}

	@And("^click download excel$")
	public void click_download_excel() throws Throwable {
	   gift.DwnldExcel();
	}

//	@And("^click download barcode pdf$")
//	public void click_download_barcode_pdf() throws Throwable {
//	  
//	}

	@And("^click Mark as delivered$")
	public void click_Mark_as_delivered() throws Throwable {
	   gift.DeliveredButton();
	}

	@And("^UploadImage$")
	public void uploadimage() throws Throwable {
	   gift.UploadImage();
	}

//	@And("^Save Thankyou Note$")
//	public void save_Thankyou_Note() throws Throwable {
//	    gift.SaveDeliveredGift();
//	}

	@And("^Choose status dropdown as delivered$")
	public void choose_status_dropdown_as_delivered() throws Throwable {
	   gift.deliveredStatusDrpDwn();
	}

	@And("^Select Mark Gift as Complete$")
	public void select_Mark_Gift_as_Complete() throws Throwable {
		gift.MarkComplete();
	}

	@And("^Choose status dropdown as Completed$")
	public void choose_status_dropdown_as_Completed() throws Throwable {
	  gift.completedStsdp();
	}

	//Gift not delivered when student is not available
	
	@And("^Get the Checkedout student$")
	public void get_the_Checkedout_student() throws Throwable {
	   gift.getCheckedOutStudent();
	}

	@And("^Click Undelivered$")
	public void click_Undelivered() throws Throwable {
	  gift.uneliverdbutton();
	}

	@And("^Select the Reason$")
	public void select_the_Reason() throws Throwable {
	   gift.Reasondp();
	}

	@And("^Give the comments$")
	public void give_the_comments() throws Throwable {
	    gift.comentss();
	}

	@And("^Save Undelivered$")
	public void save_Undelivered() throws Throwable {
	   gift.saveUndelivered();
	}

	@And("^Choose Undelivered from the status dropdown$")
	public void choose_Undelivered_from_the_status_dropdown() throws Throwable {
	  gift.undeliveredStsdp();
	}

	@And("^Verify the undelivered student record displayed$")
	public void verify_the_undelivered_student_record_displayed() throws Throwable {
	  gift.chkoutChild();
	}
	
	@And("^Click Comments Icon$")
	public void click_Comments_Icon() throws Throwable {
		gift.UndeliveredNotes();
	 
	}
	
//Gift By Mail
	
	@And("^Select the Gift type as Gift by mail$")
	public void select_the_Gift_type_as_Gift_by_mail() throws Throwable {
	  gift.giftByMailType();
	}

	@And("^Verify the Gift status dropdown defaulted to pickedup$")
	public void verify_the_Gift_status_dropdown_defaulted_to_pickedup() throws Throwable {
	   gift.giftByMailDefaultGiftStatus();
	}

	@And("^Enter the Gift description$")
	public void enter_the_Gift_description() throws Throwable {
	   gift.giftDescription();
	}

//Gift by mail Bulk Upload
	
	@And("^Select the Toggle button$")
	public void select_the_Toggle_button() throws Throwable {
	    gift.ToggleSwitch();
	}

	@And("^Click Download Button$")
	public void click_Download_Button() throws Throwable {
	    gift.downloadTemplate();
	}

	@And("^Enter the valid data and upload the file$")
	public void enter_the_valid_data_and_upload_the_file() throws Throwable {
	   gift.UploadGiftTemplate();
	}

	@And("^Verify the status dropdown is in picked up state$")
	public void verify_the_status_dropdown_is_in_picked_up_state() throws Throwable {
	  gift.VerifyStatusDefaultedToPickedUp();
	}

	@And("^Get the CMF of the student$")
	public void get_the_CMF_of_the_student() throws Throwable {
	  gift.getCheckedOutStudent();
	}

	@And("^Pass the Student CMF ID$")
	public void pass_the_Student_CMF_ID() throws Throwable {
	  gift.chkoutChild();
	}
	
	//Swap Gift
	
	@And("^Click the Swap icon$")
	public void click_the_Swap_icon() throws Throwable {
	gift.swapGiftIcon();
	}

	@And("^Choose the Gift Action Box$")
	public void choose_the_Gift_Action_Box() throws Throwable {
	  gift.swapGiftChkBx();
	}

	@And("^Enter the Comments for Gift Swap$")
	public void enter_the_Comments_for_Gift_Swap() throws Throwable {
	 gift.swapGiftComments();
	}

	@And("^Save the Swaped Gift$")
	public void save_the_Swaped_Gift() throws Throwable {
	  gift.saveSwapGift();
	}
	
	@And("^verify the gift got swaped$")
	public void verify_the_gift_got_swaped() throws Throwable {
	 gift.verifyGiftCode();
	}
	
	//Transfer Gift
	
	@And("^Choose the Status dropdown to Order Received$")
	public void choose_the_Status_dropdown_to_Order_Received() throws Throwable {
	   gift.orderReceivedDrpdwn();
	}

	@And("^Click Hold Student icon$")
	public void click_Hold_Student_icon() throws Throwable {
		gift.holdStudentIcon();
	}

	@And("^Enter the Comments for Gift Hold$")
	public void enter_the_Comments_for_Gift_Hold() throws Throwable {
	  gift.holdGiftComment();
	}

	@And("^Save the Holded Gift$")
	public void save_the_Holded_Gift() throws Throwable {
	   gift.saveHoldGift();
	}

	@And("^Choose the Status dropdown to Gift Hold$")
	public void choose_the_Status_dropdown_to_Gift_Hold() throws Throwable {
	   gift.giftHoldDrpdwn();
	}

	@And("^Click Transfer Child Gift Icon$")
	public void click_Transfer_Child_Gift_Icon() throws Throwable {
	  gift.transferChildGiftIcon();
	}

	@And("^Select Child to transfer the gift$")
	public void select_Child_to_transfer_the_gift() throws Throwable {
		gift.enterStudentToTransferTheGift();
	}

	@And("^Enter the comments for transfer gift$")
	public void enter_the_comments_for_transfer_gift() throws Throwable {
		gift.TransferGiftComment();
	}

	@And("^Save the Transfer gift$")
	public void save_the_Transfer_gift() throws Throwable {
	   gift.saveTransferGift();
	}

	@And("^Pass the TransferToChild CMF ID$")
	public void Pass_the_TransferToChild_CMF_ID() throws Throwable {
	gift.getTransferToChild();
	  
	}
	
	
	@And("^Navigate to student report$")
	public void navigate_to_student_report() throws Throwable {
		helper();
	  gift.studentReportNavigation();
	}
	
	
	@And("^Select Gift icon$")
	public void select_Gift_icon() throws Throwable {
		gift.GiftIcon();
	}

	@And("^verify the Gift History is visible$")
	public void verify_the_Gift_History_is_visible() throws Throwable {
		gift.giftHistory();
	  
	}

	

	
}
