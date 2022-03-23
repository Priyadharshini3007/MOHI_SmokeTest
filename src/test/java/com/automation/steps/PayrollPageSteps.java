package com.automation.steps;

import java.awt.AWTException;
import java.io.IOException;

import com.automation.pages.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayrollPageSteps extends BaseClass {
	
	//pay structure entry
	
	public void navigatetopayrollmenu(){
		
		helper();
		payrollpage.clickonpayrollheader();	
	}

	@Given("^Navigate to payroll header$")
	public void navigatetopayrollheader(){
		helper();
		payrollpage.clickonpayrollheader();
	}
	
	@Then("^Select payroll Structure entry option$")
	public void selectthepayrollstructureoption(){
		helper();
		payrollpage.selectpayrollentryoption();
	}
	
	@And("^Create new paystructure$")
	public void addnewpaystructure(){
		payrollpage.addnewpaystructure();
	}
	
	@Then("^enter the fields$")
	public void enterallfields(){
		payrollpage.enterthefieldsFn();
	}
	
	@And("^select the variable types$")
	public void selectthevariabletype(){
		payrollpage.selectstatuatoryfield();
	}
	
	@Then("^verify the user intimation after saving payroll entry$")
	public void verify_the_user_intimation_after_saving_payroll_entry() throws Throwable {
		payrollpage.userIntimation();
	}
	
	@Then("^select the payslip display section$")
	public void selecthepayslipdisplaysection() throws AWTException{
		payrollpage.selectpayslipdisplaysection();
	}
	@And("^navigate to dashboardpage$")
	public void navigatetodashboard(){
		helper();
		dashboardpage.navigatetodashboardmenu();
	}
	@Then("^search by paystructure code$")
	public void search_by_paystructure_code_as() throws Throwable {
	    payrollpage.searchpaystructurecode();
	}

	@Then("^click on editicon$")
	public void click_on_editicon() throws Throwable {
	    payrollpage.clickoneditpaystructure();
	}

	@Then("^update the Paystructure name as \"([^\"]*)\" and display order as \"([^\"]*)\" save$")
	public void update_the_Paystructure_name_as_and_display_order_as_save(String paystructurename, String displayorder) throws Throwable {
	    payrollpage.updatefields(paystructurename, displayorder);
	}

	@Then("^search by paystructure name as \"([^\"]*)\" and clear the data$")
	public void search_by_paystructure_name_as_and_clear_the_data(String searchpaystructurename) throws Throwable {
	   payrollpage.searchpaystructurename(searchpaystructurename);
	}
	
	
	// manual payroll functions
	
	@Then("^select Manual Payroll option$")
	public void manualpayrolloption(){
		payrollpage.selectmanualpayrolloption();
	}
	
	@Then("^select the payroll as \"([^\"]*)\"$")
	public void select_the_payroll_as(String payroll) throws Throwable {
	    payrollpage.setholdorinitiatepayroll(payroll);
	}

	@Then("^select the month as \"([^\"]*)\"$")
	public void select_the_month_as(String month) throws Throwable {
	   payrollpage.setmonthformanualpayroll(month);
	}
	@Then("^select the year in manualroll as \"([^\"]*)\"$")
	public void select_the_year_in_manualroll_as(String year) throws Throwable {
	   payrollpage.setyearformanualpayroll(year);
	}

	@Then("^select the values and search as \"([^\"]*)\"$")
	public void select_the_values_and_search_as(String employeename) throws Throwable {
		payrollpage.setemployee(employeename);
	}
	
	@Then("^select the organisation name$")
	public void selecttheorganisationname() throws InterruptedException{
		payrollpage.selecttheorganisationcheckbox();
	}
	@And("^submit the payroll$")
	public void submithebutton(){
		payrollpage.submitmanualpayrollbutton();
	}
	
	@Then("^verify the success message$")
	public void verifythepayrollsuccessmessage(){
		payrollpage.verifythepayrollinitiatesuccessmessge();
	}
	
	//pay structure upload 
	@Then("^select the paystructure upload link$")
	public void selecthepaystructurelink(){
		payrollpage.paystructurelink();
	}
	
	@Then("^download the template$")
	public void download_the_template() throws Throwable {
	   payrollpage.verifydownloadtemplate();
	   
	}
	@Then("^verify the template \"([^\"]*)\"$")
	public void verify_the_template_and(String downloadfile) throws Throwable {
		payrollpage.DwnldtempVerificatn(downloadfile);
	}

	@And("^choose the file$")
	public void providethefiledetails() throws Exception{
		payrollpage.verifypaystructureupload();
	}
	
	@Then("^click on upload$")
	public void verifytheupload(){
		payrollpage.clickonuploadbutton();
	}
	
	
	// P9A form
	
	@Then("^select the p9aform link$")
	public void selectthep9aform(){
		payrollpage.clickonp9aformlink();
	}
	
	@And("^select the year \"([^\"]*)\"$")
	public void selecttheyear(String year){
		payrollpage.enterdetailsforp9form(year);
	}
	
	@Then("^fill the staff details \"([^\"]*)\" and \"([^\"]*)\"$")
	public void fillthestaffdetails(String staffstartnum,String staffnumto){
		helper();
		payrollpage.enterstaffnumbers(staffstartnum, staffnumto);
	}
	@Then("^send the email$")
	public void send_the_email() throws Throwable {
	   payrollpage.sendbulkemail();
	}
	@Then("^generate the p9a form$")
	public void generatep9form() throws InterruptedException{
		
		payrollpage.generatep9form();
	}
	
	@And("^close the p9a form$")
	public void closethep9aform() throws InterruptedException{
		payrollpage.closethep9aform();
	}
	
	// Bank entry 
	
	@Then("^select the bankentry option$")
	public void selectbankentryoption() throws InterruptedException{
		payrollpage.selectthebankentryoption();
	}
	
	@And("^click the add new bank option$")
	public void addnewbank(){
		payrollpage.addnewbankbutton();
	}
	
	@Then("^enter all the details for adding new bank$")
	public void enterthedetailsforaddingbank() throws IOException{
		payrollpage.enterallthedetailsofnewbank();
	}
	
	@Then("^search the bankname$")
	public void search_the_bankname() throws Throwable {
	   payrollpage.banksearch();
	}

	@Then("^Update required fields \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\" and \"([^\"]*)\"$")
	public void Bankentryupdate(String bcode, String address, String phone, String email) throws Throwable {
	   payrollpage.updatebankentry(bcode, address, phone, email);
	}

	@Then("^verify the clearfilter$")
	public void verify_the_clearfilter() throws Throwable {
	   payrollpage.bankclearfilter();
	}
	
// payslip

	@Then("^select the payslip link$")
	public void selectthepaysliplink(){
		payrollpage.selectpaysliplink();
	}
	
	@And("^select the checkbox for adding cheque no$")
	public void selectthecheckbox(){
		payrollpage.selectcheckboxforchequeno();
	}
	
	@Then("^Enter the chequenumber \"([^\"]*)\"$")
	public void enterthechequenumberanddate(String chequenumber){
		payrollpage.enterchequenumberanddate(chequenumber);
	}
	
	@And("^save the chequenumber$")
	public void savethechequenumber(){
		payrollpage.savechequebutton();
	}
	
	@When("^search with payslip$")
	public void searchwithpayslipnumber(){
		payrollpage.searchpayslipandchooseemployess();
	}
	
	@Then("^select the payslips$")
	public void select_the_payslips() throws Throwable {
	   payrollpage.selectthepayslips();
	}

	@Then("^click on Print button to print the selected payslips$")
	public void click_on_Print_button_to_print_the_selected_payslips() throws Throwable {
		payrollpage.prinsubmitbutton();
	}
	
	@Then("^Close the print page$")
	public void close_the_payslip_page() throws Throwable {
	    payrollpage.closepayrollpage();
	}
	
	@Then("^click on send email button and verify the email is sent$")
	public void click_on_send_email_button_and_verify_the_email_is_sent() throws Throwable {
	   payrollpage.clicksendemailbutton();
	}

	@And("^enter the staffnum \"([^\"]*)\" and search$")
	public void verifythesearch(String staffno){
		payrollpage.verifytheFilter(staffno);
	}
	
	@Then("^verify the clear filter button$")
	public void verifytherefreshbutton(){
		payrollpage.refreshbutton();
	}
	
	@Then("^click on payslip number column to check the sorting functionality$")
	public void click_on_payslip_number_column_to_check_the_sorting_functionality() throws Throwable {
		payrollpage.verifypayslipsortfunction();
		payrollpage.verifypayslipsortfunction();
	}

	@Then("^verify the employeename column to check the sorting$")
	public void verify_the_employeename_column_to_check_the_sorting() throws Throwable {
		payrollpage.verifyemploysortfunction();
		payrollpage.verifyemploysortfunction();
	}
	
// employee loan report
	
	@Then("^select the employee loan report link$")
	public void selecttheemployeeloanreport(){
		payrollpage.selectheemployeereportlink();
	}
	
	@And("^select the loan component \"([^\"]*)\"$")
	public void selectloancomponent(String loan) throws InterruptedException{
		payrollpage.switchtoframe();
		payrollpage.selectindividualloan(loan);
	}

	@When("^choose the staffrom \"([^\"]*)\" and staffto \"([^\"]*)\"$")
	public void enterthestaffromandto(String Stafffrom,String Staffto) throws InterruptedException{
		payrollpage.enterthestaffnumbers(Stafffrom, Staffto);
	}

	@And("^select the loan summary$")
	public void selectloansummary() throws InterruptedException{
		payrollpage.switchtoframe();
		payrollpage.selectindividualloansum();
	}
	
	@When("^select the emploancentre \"([^\"]*)\" and designation \"([^\"]*)\"$")
	public void select_the_emploancentre_and_designation(String cent, String design) throws Throwable {
	    payrollpage.emploancentanddesign(cent, design);
	}
	
	@Then("^export the emploan excel report \"([^\"]*)\"$")
	public void export_the_emploan_excel_report_and(String downloadfile) throws Throwable {
		payrollpage.downloadFn();
		payrollpage.DwnldVerificatnemploan(downloadfile);
	}
	
	@When("^download excel report$")
	public void download_excel_report() throws Throwable {
		payrollpage.downloadFn();
	}
	
	//netgross pay functions
	
	@Then("^select the netpay and grosspay link$")
	public void selectnetpaygrosspaylink(){
		payrollpage.selectnetandgrosspaylink();
		payrollpage.switchtoframe();
	}
	
	@And("^choose the reqruitment type \"([^\"]*)\"$")
	public void chooserecruittmenttype(String requirmenttype) throws InterruptedException{
		payrollpage.chooserecuitmentype(requirmenttype);
	}
	
	@Then("^fill the year and month \"([^\"]*)\"$")
	public void fillyearandmonth(String month){
		payrollpage.fillmonthandyear(month);
	}

	@And("^enter the Staff numbers from \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterstaffnumber(String Stafffrom,String staffto){
		payrollpage.selectstaffdetails(Stafffrom,staffto);
		payrollpage.netpaygrosspayviewreport();
	}
	
	@When("^click on the report type$")
	public void selectnetandgrossreporttype(){
		payrollpage.selectnetandgrosstype();
	}
	
	@Then("^select the year and month$")
	public void selectyearandmonth(){
		payrollpage.multiselecttheyear();
	}
	
	@Then("^select the netgrosspaycentre \"([^\"]*)\" and designation \"([^\"]*)\"$")
	public void select_the_netgrosspaycentre_and_designation(String cent, String design) throws Throwable {
	    payrollpage.netgrosscentanddesign(cent, design);
	}
	
	@Then("^export the netgross excel report \"([^\"]*)\"$")
	public void export_the_netgross_excel_report_and(String downloadfile) throws Throwable {
		payrollpage.downloadFn();
		payrollpage.DwnldVerificatnetgross(downloadfile);
	}
	
	// staffage group report
	
	@Then("^click on the staff age group report link$")
	public void selectstaffagegroup(){
		payrollpage.clickonstaffagegrouplink();
		payrollpage.switchtoframe();
	}
	
	@And("^select the centre \"([^\"]*)\" and designation \"([^\"]*)\"$")
	public void selectcentreanddesignaation(String Centre,String Designation) throws InterruptedException{
		helper();
		payrollpage.selectcentreanddesignation(Centre, Designation);
	}
	
	@And("^navigate to dashboard page$")
	public void navigationtodashboardpage() throws InterruptedException{
		helper();
		payrollpage.switchframetodefaut();
		dashboardpage.navigatetodashboardmenu();
	}
	
	@Then("^choose the date$")
	public void choosedateforstaffage() throws IOException, InterruptedException {
		Thread.sleep(1000);
		payrollpage.selectdateforstaffage();
	}
	
	@Then("^export the staffage excel report \"([^\"]*)\"$")
	public void export_the_staffage_excel_report_and(String downloadfile) throws Throwable {
	   payrollpage.downloadFn();
	   payrollpage.DwnldVerificatnstaffage(downloadfile);
	}

	//staffcount report
	
	@Then("^click on the staff count report link$")
	public void clickonstaffcountreport(){
		payrollpage.staffcountreportlink();
		payrollpage.switchtoframe();
	}
	
	@And("^select the filter type \"([^\"]*)\"$")
	public void selectfiltertype(String filtertype){
		payrollpage.selectfiltertype(filtertype);
	}
	
	@When("^choose the year \"([^\"]*)\" and month \"([^\"]*)\"$")
	public void choosetheyearandmonth(String year,String month) throws InterruptedException{
		payrollpage.selectthemonthandyear(year, month);
	}
	
	@When("^click on view report$")
	public void clickonviewreport() throws InterruptedException{
		payrollpage.viewreportbutton();
	}
	
	@When("^choose the report type$")
	public void selectthereporttype() throws InterruptedException{
		payrollpage.selectthereporttype();
	}
	
	@When("^choose the year and month$")
	public void choosetheyearandmon(){
		payrollpage.multiselecttheyear();
	}
	
	@When("^select staftcount center \"([^\"]*)\" and designation\"([^\"]*)\"$")
	public void select_staftcount_center_and_designation(String cent, String design) throws Throwable {
	   payrollpage.selectstaffcountcentanddesign(cent, design);
	}
	
	@Then("^export the staffcount excel report \"([^\"]*)\"$")
	public void export_the_staffcount_excel_report_and(String downloadfile) throws Throwable {
		payrollpage.downloadFn();
	   payrollpage.DwnldVerificatnstaffcount(downloadfile);
	}

	// summary report by designation
	
	@When("^click on summary report by designation link$")
	public void clickonsummaryreportbydesignation(){
		payrollpage.clickonsummryreportbydesignation();
		payrollpage.switchtoframe();
	}
	
	@Then("^select the year \"([^\"]*)\" and month \"([^\"]*)\"$")
	public void selecttheyearandmonth(String year,String month){
		payrollpage.selectyearandmonth(year, month);
	}

	@When("^enter the Staff \"([^\"]*)\" and staff to \"([^\"]*)\"$")
	public void enterstaffnumbers(String stafffrom,String staffto){
		payrollpage.enterthestaffnumberdetails(stafffrom, staffto);
	}
	
	@Then("^select the recruitment type \"([^\"]*)\"$")
	public void selecrecruitmenttype(String recruitmenttype){
		payrollpage.selectingrecruitmenttype(recruitmenttype);
	}
	
	@And("^choose the centre \"([^\"]*)\" and designation \"([^\"]*)\"$")
	public void choosecentreanddesignationfield(String centre,String designation){
		payrollpage.choosecentreanddesign(centre,designation);
	}
	
	@Then("^export the designation excel report \"([^\"]*)\"$")
	public void export_the_designation_excel_report_and(String downloadfile) throws Throwable {
		payrollpage.downloadFn();
		payrollpage.DwnldVerificatndesignation(downloadfile);
	}
	
	// summary report

	@Then("^select the summary report link$")
	public void selecctthesummaryreportlink(){
		helper();
		payrollpage.payrollsummaryreport();
	}
	
	@And("^select the summary type \"([^\"]*)\"$")
	public void selectthereporttype(String summarytype) throws InterruptedException{
		payrollpage.selectthesummarytype(summarytype);
	}
	
	@Then("^select the year \"([^\"]*)\" and \"([^\"]*)\"$")
	public void chooseyearandmonth(String year,String month) throws InterruptedException{
		payrollpage.selectpayrollyearandmonth(year, month);
	}
	
    @Then("^choose the recruitmenttype \"([^\"]*)\"$")
	public void chooserecruitmenttype(String recruitmenttype){
		payrollpage.selectrecruitmenttype(recruitmenttype);
	}
	
    @When("^Fill the staffrom \"([^\"]*)\" and \"([^\"]*)\"$")
    public void fill_the_staffrom_and(String payrollpagestaffrom, String payrollpagestafto) throws Throwable {
        payrollpage.fillstaffsfromandto(payrollpagestaffrom, payrollpagestafto);
    }
    
    @When("^click on report type$")
	public void selectreporttype() throws InterruptedException{
		payrollpage.selectreporttype();
	}
    
    @Then("^select the month$")
	public void selectmonth() throws InterruptedException{
		payrollpage.selectthemonth();
	}
    
    @Then("^select the statutory component$")
    public void select_the_statutory_component() throws Throwable {
        payrollpage.selectstatucomp();
    }
    
    @Then("^select bank \"([^\"]*)\" and branch \"([^\"]*)\"$")
    public void select_bank_and_branch(String bank, String branch) throws Throwable { 
        payrollpage.selectbankandbranch(bank, branch);
    }
    
    @Then("^select payrollcenter\"([^\"]*)\"and designation \"([^\"]*)\"$")
    public void select_payrollcenter_and_designation(String cent, String design)throws Throwable {
        payrollpage.selectprollcentanddesign(cent, design);
    }
    
    @Then("^export the payrollsummary excel report \"([^\"]*)\"$")
    public void export_the_payrollsummary_excel_report_and(String downloadfile) throws Throwable {
    	payrollpage.downloadFn();
    	payrollpage.DwnldVerificatnpayroll(downloadfile);
    }
    
    //BDS summary report
    
    @Then("^select the BDS summary report link$")
    public void select_the_BDS_summary_report_link() throws Throwable {
        payrollpage.selectbdsreportlink();
        payrollpage.switchtoframe();
    }

    @Then("^select yearand month \"([^\"]*)\" and \"([^\"]*)\"$")
    public void select_yearand_month_and(String year, String month) throws Throwable {
        payrollpage.bdsselect(year, month);
    }

    @Then("^enterstafffrom and staffto \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterstafffrom_and_staffto_and_staffto(String bdsstaffrom, String bdsstafto) throws Throwable {
        payrollpage.BDSstaff(bdsstaffrom, bdsstafto);
    }
    
    @Then("^slect bds \"([^\"]*)\" \"([^\"]*)\"and\"([^\"]*)\"$")
    public void slect_bds_and(String center, String design, String recruit) throws Throwable {
        payrollpage.selectbsdcentdesiginationandrecruitment(center, design, recruit);
    }

    @Then("^export the BDS excel report \"([^\"]*)\"$")
    public void export_the_BDS_excel_report_and(String downloadfile) throws Throwable {
    	payrollpage.downloadFn();
    	payrollpage.DwnldVerificatnBDS(downloadfile);
    }

}
