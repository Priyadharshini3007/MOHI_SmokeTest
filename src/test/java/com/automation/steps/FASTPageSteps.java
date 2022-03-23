package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FASTPageSteps extends BaseClass {
	
	@Then("^Search the student by name or CMF ID$")
	public void search_the_student_by_name_or_CMF_ID() throws Throwable {
		helper();
		fastpage.searchstudent();
	}
	
	@And("^enter the family visit information$")
	public void enterthefamilyvisitinfo(){
		fastpage.enterfamilyvisitinformation();
	}
	
	@When("^Select the visit date$")
	public void selectvisitdate() throws InterruptedException{
		fastpage.selectvisitdate();
	}
	
	@Then("^select family status$")
	public void selectfamilystatus() throws InterruptedException{
		fastpage.selectfamilychangestatus();
	}
	
	@And("^fill the findings and recommendations$")
	public void fillthefindingsandrecommendation(){
		fastpage.fillfindingsandrecommendations();
	}
	
	@Then("^select the actual assessment date$")
	public void enteractualassessmentdate(){
		fastpage.actualassessmentdate();
	}
	
	@And("^select the family together values$")
	public void selectfamilytogethervalues() throws InterruptedException{
		fastpage.fillfamilytogethervalues();
	}
	
	@Then("^submit the assessment values$")
	public void submittheassessment(){
		helper();
		fastpage.submittheassessment();
	}
	
	@Then("^save the assessment values$")
	public void savetheassessment(){
		fastpage.savetheassessment();
	}
	
	@And("^add the action plan$")
	public void addactionplan() throws InterruptedException{
		helper();
		fastpage.addactionplan();
	}
	
	@And("^add the assessment comment$")
	public void addaassessmentcomment() throws InterruptedException{
		helper();
		fastpage.AddorEditAssessmentCommentFn();
	}
	
	@Then("^search the assessment code$")
	public void searchtheassessmentcode() throws InterruptedException{
		helper();
		fastpage.searchthestudentname();
	}
	
	@And("^click on the View Assessment form Details icon$")
	public void clickontheviewassessmentformdetails() throws InterruptedException{
		Thread.sleep(2000);
		helper();
		fastpage.ViewAssessmentformIcon();
	}
	
	@Then("^verify the print page$")
	public void verify_the_print_page() throws Throwable {
		fastpage.printAssessmentformIcon();
	}
	
	@And("^click on generate assessment icon$")
	public void clickongenerateassessment() throws InterruptedException{
		helper();
		fastpage.clickongenerateassessmenticon();
	}

	@Then("^select the from date$")
	public void selectfromdate() throws InterruptedException{
		helper();
		Thread.sleep(2000);
		fastpage.selectfromdate();
	}
	
	@And("^pick the to date$")
	public void picktodate() throws InterruptedException{
		helper();
		Thread.sleep(2000);
		fastpage.selecttodate();
	}
	
	@Then("^select metric category and metric criteria$")
	public void selectmetricandcategory(){
		fastpage.selectcategoryandcriteria();
	}
	
	@And("^select the score$")
	public void selectscore(){
		fastpage.selectthescore();
	}
	
	@Then("^click on go button$")
	public void clickgobutton(){
		fastpage.submitgobutton();
	}

	@Then("^click on the go button$")
	public void clickongobutton(){
		fastpage.assessmentchartsubmit();		
	}
	
	@And("^proceed to send email$")
	public void proceedtosendemail() throws InterruptedException{
		fastpage.submitsendemail();		
	}
	
	@Then("^enter the email fields$")
	public void entertheemailvalues(){
		fastpage.emailFields();
	}
	
	@And("^click on sendemail button$")
	public void clicksendemail() throws InterruptedException{
		Thread.sleep(2000);
		fastpage.submitsendBtn();
	}
	
	@Then("^select the Assessment from date$")
	public void selectassessmentdate(){
		helper();
		fastpage.selectassessmentfromdate();		
	}
	
	@And("^select the assessment to date$")
	public void selectassessementtodate(){
		helper();
		fastpage.selectassessmenttodate();
	}
	
	@Then("^verify the downloaded excel for Assesment chart$")
	public void verify_the_downloaded_excel_for_Assesment_chart() throws Throwable {
		fastpage.exportexcelVerfication();
	}
	
	@Then("^verify the downloaded excel for fast activity report$")
	public void verify_the_downloaded_excel_for_fast_activity_report() throws Throwable {
		fastpage.exportexcelFastActivityVerfication();
	}
	
	@And("^click the export to excel button$")
	public void proceedexportexcel() throws InterruptedException{
		fastpage.exportexcel();		
	}
	
	@Then("^select the centre \"(.*?)\" and social worker \"(.*?)\"$")
	public void selectcentreandsw(String centre,String Socialworker) throws InterruptedException{
		helper();
		fastpage.switchtoframe();
		fastpage.selectcentreandsw(centre, Socialworker);		
	}
	
	@And("^choose the from date and to date$")
	public void choosefromandtodate(){
		fastpage.selectfromandtodate();
	}
	
	@Then("^submit the View report$")
	public void clickviewreport() throws InterruptedException{
		fastpage.submitreport();
	}
	@Then("^click the export to excel button for fast activity report$")
	public void click_the_export_to_excel_button_for_fast_activity_report() throws Throwable {
		fastpage.exportexcelFastActityRep();
	}
	
	@Then("^verify the completed status$")
	public void verify_the_completed_status() throws Throwable {
		fastpage.statusFn();
	}
	
	@Then("^click the toggle button$")
	public void click_the_toggle_button() throws Throwable {
		fastpage.toggleFn();
	}

	@Then("^verify the filtered category values$")
	public void verify_the_filtered_category_values() throws Throwable {
		fastpage.metricsVerfn();
	}

}
