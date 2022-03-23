package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PromotionPageSteps extends BaseClass {
	
	@Then("^Click In-SchoolPromotion sub menu$")
	public void click_In_SchoolPromotion_sub_menu() throws Throwable {
		helper();
		promotionpage.InSchlPromotionSubMenu();
	}
	
	@Then("^Select the centrename and Schoolname")
	public void selecthecentreandschool(){
		promotionpage.choosecentreandschool();
	}
	
	@And("^select center name and school to transfer the student$")
	public void select_center_name_and_school_to_transfer_the_student() throws Throwable {
		promotionpage.choosecentreandschoolfortransfer();
	}
	
	@Then("^choose the class and section for \"([^\"]*)\"$")
	public void choose_the_class_and_section_for(String promotionType) throws Throwable {
		promotionpage.selectclassandsection(promotionType);
	}
	
	@Then("^get the students list$")
	public void get_the_students(){
		promotionpage.getclassroaster();
	}
	
	@Then("^Select the student for \"([^\"]*)\"$")
	public void select_the_student_for(String promotionType) throws Throwable{
		promotionpage.selectStudentPromotionType(promotionType);
	}
	
	@Then("^Submit the student for approval$")
	public void submitthestudent(){
		promotionpage.submitforapproval();
	}
	
	@Then("^Verify the user intimation after submission$")
	public void verify_the_user_intimation_after_submission() throws Throwable {
		promotionpage.verificationMsg();
	}
	
	@Then("^select the student promotion alert from dashboard$")
	public void select_student_promotion_alert_from_dashboard(){
		promotionpage.promotionDashboardAlert();
	}
	
	@Then("^Click on promotion approval icon for \"([^\"]*)\"$")
	public void click_on_promotion_approval_for(String promotionType) throws InterruptedException{
		promotionpage.ApprovalBtnFn(promotionType);
	}
	
	@Then("^Verify All the fees related to the transfered class get reflected$")
	public void verify_All_the_fees_related_to_the_transfered_class_get_reflected() throws Throwable {
		helper();
		feeMasterEntry.getTextfromHTTransfer();
	}
	
	@When("^headteacher should able to enter the fee due date$")
	public void headteacher_should_able_to_enter_the_fee_due_date() throws Throwable {

		promotionpage.Promotionfeeinfo();
	}
	
	@Then("^Click on transfer approval icon$")
	public void click_on_transfer_approval() throws InterruptedException{
		promotionpage.transApprovalBtnFn();
	}
	
	
	
	@Then("^Select the Centre and schooltype")
	public void selectcentreandschooltype(){
		promotionpage.selectCentreForApproval();
	}
	
	@Then("^Select the school and section$")
	public void select_the_school_and_section() throws Throwable {
		promotionpage.selectSchoolSectionForApproval();
	}
	
	@Then("^get the fees listed in the page$")
	public void get_the_fees_listed_in_the_page() throws Throwable {
		helper();
		feeMasterEntry.httransferlist();
	}
	
	@Then("^Choose the headteacher$")
	public void chooseheadteacher(){
		promotionpage.selectheadteacher();
	}
	
	
	@Then("^Click approve and send to Next page$")
	public void clickandapprove() throws InterruptedException{
		promotionpage.approveandproceed();
	}
	
	@Then("^Verify the class details after \"([^\"]*)\" process is approved$")
	public void verify_the_class_details_after_process_is_approved(String promotionType) throws Throwable {
		promotionpage.approveVerification(promotionType);
	}
	
	@Then("^Verify the \"([^\"]*)\" alert for manual class change$")
	public void verify_the_alert_for_manual_class_change(String promotionType) throws Throwable {
		promotionpage.manualClassChangeAlertVerifn(promotionType);
	}
	
	@Then("^select the student section change alert from dashboard$")
	public void select_student_section_change_alert_from_dashboard(){
		promotionpage.sectionChangeDashboardAlert();
	}
	
	@Then("^select the student detainment alert from dashboard$")
	public void select_student_Detainment_alert_from_dashboard(){
		promotionpage.detainmentDashboardAlert();
	}
	
	@Then("^Select the student transfer alert from dashboard$")
	public void select_the_student_transfer_alert_from_dashboard(){
		promotionpage.studentTransferDashboardAlert();
	}
	
	@Then("^select the student high school promotion alert from dashboard$")
	public void select_student_high_school_promotion_alert_from_dashboard(){
		promotionpage.highSchoolPromotionAlert();
	}
	
	@Then("^Click Transfer Students to another Center link from dashboard$")
	public void click_Transfer_Students_to_another_Center_link_from_dashboard() throws Throwable {
		helper();
		promotionpage.TransferAndPromotionalDashbordFn();
	}
	
	
	
}
