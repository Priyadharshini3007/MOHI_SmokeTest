package com.automation.steps;
import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;

public class FeeDepositSteps extends BaseClass{
	
	@When("^Select student menu and click Fee Deposit submenu$")
	public void select_student_menu_and_click_Fee_Deposit_submenu() throws Throwable {
		//hta = new pageObject.HeadTeacherApproval(driver);
		//aa = new AdminAssistantFeeDeposit(driver);
		helper();
		aa.aafeedepositmenuselection();
	}

	@When("^Enter the student name$")
	public void enter_the_student_name() throws Throwable {
		aa.EnterTheStudentNameForFeepayment();
	}

	@When("^Click on the student AdmissionFee Deposit icon$")
	public void click_on_the_student_AdmissionFee_Deposit_icon() throws Throwable {
		helper();
		aa.SelectAdmissionFeePaymentIcon();
	}

	@When("^Click on save button to do the AdmissionFeeDeposit$")
	public void click_on_save_button_to_do_the_AdmissionFeeDeposit() throws Throwable {
		helper();
		aa.AdmissionFeepaymentSaveButton();
	}

	@When("^Click on the student DevelopmentFee Deposit icon$")
	public void click_on_the_student_DevelopmentFee_Deposit_icon() throws Throwable {
		aa.SelectDevelopmentFeePaymentIcon();
	}

	@When("^Click on save button to do the DevelopmentFeeDeposit$")
	public void click_on_save_button_to_do_the_DevelopmentFeeDeposit() throws Throwable {
		aa.DevelopmentFeepaymentSaveButton();
	}

	@When("^Click view recent transaction button results to view the recent transactions$")
	public void click_view_recent_transaction_button_results_to_view_the_recent_transactions() throws Throwable {
	   aa.ViewRecentTransactions();
	   //hta.logout();
	}
	@When("^Adminassistant click on the fee scheduled today link$")
	public void adminassistant_click_on_the_fee_scheduled_today_link() throws Throwable {
		helper();
		//aa = new AdminAssistantFeeDeposit(driver);
		aa.FeeScheduledtodaylink();
	}

	@When("^Adminassistant enter the student name and click on payment icon$")
	public void adminassistant_enter_the_student_name_and_click_on_payment_icon() throws Throwable {
	
		aa.enterthestudentname();
	}

	@When("^Adminassistant Click on the student AdmissionFee Deposit icon$")
	public void adminassistant_Click_on_the_student_AdmissionFee_Deposit_icon() throws Throwable {
		aa.SelectscheduledAdmissionFeePaymentIcon();
	}

	@When("^Adminassistant Click on save button to do the AdmissionFeeDeposit$")
	public void adminassistant_Click_on_save_button_to_do_the_AdmissionFeeDeposit() throws Throwable {
	   aa.AdmissionscheduledFeepaymentSaveButton();
	}

	@When("^Adminassistant Click on the student DevelopmentFee Deposit icon$")
	public void adminassistant_Click_on_the_student_DevelopmentFee_Deposit_icon() throws Throwable {
	   aa.SelectDevelopmentFeePaymentIcon();
	}

	@When("^Adminassistant Click on save button to do the DevelopmentFeeDeposit$")
	public void adminassistant_Click_on_save_button_to_do_the_DevelopmentFeeDeposit() throws Throwable {
	    aa.DevelopmentFeepaymentSaveButton();
	}

	@When("^Select checkbox and click print combined receipt button results to view combined receipt$")
	public void adminassistant_Select_checkbox_and_click_print_combined_receipt_button_results_to_view_combined_receipt() throws Throwable {
	  //aa. AdmissionFeeCheckBox();
		aa.AdmissionFeeCheckBoxbeforeactive();
	}

	@When("^Adminassistant Click view recent transaction button results to view the recent transactions$")
	public void adminassistant_Click_view_recent_transaction_button_results_to_view_the_recent_transactions() throws Throwable {
		aa.ViewRecentTransactions();
	}
	@When("^Click on the student ExaminationFee Deposit icon$")
	public void click_on_the_student_ExaminationFee_Deposit_icon() throws Throwable {
		helper();
		//hta = new pageObject.HeadTeacherApproval(driver);
		//aa = new AdminAssistantFeeDeposit();
		aa.examinationfee();
	 
	}

	

	@When("^Click on the student TransportFee Deposit icon$")
	public void click_on_the_student_TransportFee_Deposit_icon() throws Throwable {
	
		aa.transportfee();
	    
	}

	@When("^Click on the student TuitionFee Deposit icon$")
	public void click_on_the_student_TuitionFee_Deposit_icon() throws Throwable {
		aa.tutionfee();
		
	
	}

	@When("^Select checkbox and click print combined receipt button after active results to view combined receipt$")
	public void select_checkbox_and_click_print_combined_receipt_button_results_to_view_combined_receipt() throws Throwable {
	  aa.AdmissionFeeCheckBox();
	  Thread.sleep(3000);
	}
	/*@When("^Click on save button to do the TuitionFeeDeposit$")
	public void click_on_save_button_to_do_the_TuitionFeeDeposit() throws Throwable {
	    
	}*/
}
