package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.alertAccept;
import static com.automation.utils.WebElementUtils.confirmationMsg;
import static com.automation.utils.WebElementUtils.scrollIntoView;
import static com.automation.utils.WebElementUtils.webDriverclick;
import static com.automation.utils.WebElementUtils.DwnldfileVerificatnFn;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.utils.AssertionUtils;
import com.automation.utils.ExcelHelper;
import com.automation.utils.ExcelLib;
import com.automation.utils.WebElementUtils;

public class PayrollPage {
	
	public PayrollPage(){
		PageFactory.initElements(getDriver(), this);
	}
	
	// Pay structure entry locators
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle'][contains(text(),'Payroll')]")
	WebElement payrollheader;

	@FindBy(xpath="//a[contains(text(),'Pay Structure Entry')]")
	private WebElement payrollstructurelink;

	@FindBy(xpath="//form[@id='pagerForm']//table//tbody//tr//td//table//thead//tr//th//a//i")
	private WebElement addnewpaystructurebtn;

	@FindBy(xpath="//input[@id='Filter_PayStructureCode']")
	private WebElement searchpaystructurecodefield;

	@FindBy(name="PayStructureCode")
	private WebElement enterpaystructurename;

	@FindBy(name="PayStructureName")
	private WebElement paystructurenamefield;

	@FindBy(id="DisplayOrder")
	private WebElement newdisplayorderfield;

	@FindBy(xpath="//input[@id='PayStructureCode']")
	private WebElement newpaystructurecodefield;

	@FindBy(xpath="//input[@id='PayStructureName']")
	private WebElement newpaystructureNamefield;

	@FindBy(xpath="//input[@id='Filter_PaystructureName']")
	private WebElement searchPaystructure;

	@FindBy(xpath="//button[@id='btnSearch']")
	private WebElement searchbtn;

	@FindBy(xpath="//button[@id='btnRefresh']")
	private WebElement refreshbtn;

	@FindBy(xpath="//select[@id='VariableTypeID']")
	private WebElement variabledropdown;

	@FindBy(xpath="//input[@id='IsTaxableDirect']")
	private WebElement isTaxableDirectcheckboxfield;

	@FindBy(xpath="//input[@id='IsTaxExemptable']")
	private WebElement IsTaxexemtablecheckboxfield;

	@FindBy(xpath="//input[@id='IsSkipAllowed']")
	private WebElement IsSkipallowedcheckboxfield;

	@FindBy(xpath="//input[@id='IsTaxableBenefit']")
	private WebElement isTaxablefieldcheckboxfield;

	@FindBy(xpath="//input[@id='IsTaxDeductable']")
	private WebElement istaxDeductiblefield;

	@FindBy(xpath="//input[@id='IsFinalComponent']")
	private WebElement isFinalComponentcheckboxfield;

	@FindBy(xpath="//input[@id='IsActive']")
	private WebElement isactivecheckboxfield;

	@FindBy(xpath="//input[@id='IsMandatoryComponent']")
	private WebElement isMandatorycomponentcheckboxfield;

	@FindBy(xpath="//input[@id='IsTaxableByYear']")
	private WebElement isTaxableperyearcheckboxfield;

	@FindBy(xpath="//span[@class='multiselect-selected-text']")
	private WebElement payslipdisplaysection;

	@FindBy(xpath="//input[@id='rdoFixedAmount']")
	private WebElement fixedamountcheckboxfield;

	@FindBy(xpath="//input[@id='FixedAmount']")
	private WebElement fixedamounttextboxfield;

	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElement cancelbutton;

	@FindBy(xpath="//button[@id='btnSave']")
	private WebElement savebutton;

	@FindBy(xpath="//input[@value='4']")
	WebElement displaycheckbox;

	@FindBy(xpath="//input[@id='Filter_PayStructureCode']")
	private WebElement FilterPaystructurecode;

	@FindBy(xpath="//button[@id='btnSearch']")
	private WebElement searchbutton;

	@FindBy(xpath="//a//i[@title='Click here to edit this pay structure']")
	private WebElement editpaystructure;

	@FindBy(xpath="//span[@class='fa fa-angle-double-right bigger-140 last-page  blue']")
	private WebElement lastpagebutton;

	@FindBy(xpath="//span[@class='fa fa-angle-right bigger-140 next-page  blue']")
	private WebElement nextpagebutton;

	@FindBy(xpath="//span[@class='fa fa-angle-double-left bigger-140 first-page  blue']")
	private WebElement firstpagebutton;

	@FindBy(xpath="//span[@class='fa fa-angle-left bigger-140 prev-page  blue']")
	private WebElement prevpagebutton;

	@FindBy(xpath="//input[@id='PageSize']")
	private WebElement pagesize;

	//manual payroll elements

	@FindBy(xpath="//select[@name='HoldorIntiatePayroll']")
	private WebElement holdorinitiatedropdown;

	@FindBy(xpath="//b[text()='Year:']/..//select")
	private WebElement yeardropdown;

	@FindBy(xpath="//select[@name='Month']")
	private WebElement monthdropdown;

	@FindBy(xpath="//b[text()='Employee Name :']/..//div//input")
	private WebElement employeefield;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement gobutton;

	@FindBy(xpath="//input[@id='btnsubmit']")
	private WebElement manualpayrollsubmit;

	@FindBy(xpath="//div[@id='flash']")
	private WebElement payrollsuccessmessage;

	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement payrollsaveconfirmation;

	@FindBy(xpath="//a[contains(text(),'Manual Payroll')]")
	private WebElement manualpayrolllink;

	@FindBy(xpath="//input[@id='OrgList_0__IsChecked']")
	private WebElement directorcheckbox;
	
	@FindBy(xpath="//input[@id='OrgList_98__IsChecked']")
	private WebElement educationdepart;

	//pay structure upload
	@FindBy(xpath="//a[contains(text(),'Pay Structure Upload')]")
	private WebElement paystructureuploadlink;

	@FindBy(xpath="//input[@name='FileName']")
	private WebElement paystructureFilename;

	@FindBy(xpath="//input[@name='PayStructureUploadfile']")
	private WebElement paystructurefileuploadlink;

	@FindBy(xpath="//a[text()='Download Template']")
	private WebElement downloadtemplate;


	@FindBy(xpath="//div[@id='flash']")
	private WebElement errortext;

	// P9A form elements

	@FindBy(name="submitButton")
	private WebElement generatep9form;

	@FindBy(xpath="//a[contains(text(),'P9A Form')]")
	private WebElement p9aformlink;

	@FindBy(xpath="//select[@id='Year']")
	private WebElement selectyear;

	@FindBy(xpath="//input[@id='StaffFrom']")
	private WebElement staffnumberstart;

	@FindBy(xpath="//input[@id='StaffTo']")
	private WebElement staffnumberto;

	@FindBy(xpath="//button[@class='btn btn-primary btn-sm btnSendBulkEmail']")
	private WebElement sendemailbuttonp9form;


	// Bank entry elements

	@FindBy(xpath="//a[@class='lnkAddBank']")
	private WebElement addnewbankbutton;

	@FindBy(xpath="//input[@id='BankCode']")
	private WebElement bankcodefield;

	@FindBy(xpath="//input[@id='BankName']")
	private WebElement banknamefield;

	@FindBy(xpath="//textarea[@id='BankAddress']")
	private WebElement bankaddressfield;

	@FindBy(xpath="//input[@id='BankFax']")
	private WebElement bankfaxfield;

	@FindBy(xpath="//input[@id='BankPhone']")
	private WebElement bankphonefield;

	@FindBy(xpath="//input[@id='BankEmail']")
	private WebElement bankemailfield;

	@FindBy(xpath="//input[@id='AccnoLEN']")
	private WebElement bankaccountlengthfield;

	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElement cancelbtn;

	@FindBy(xpath="//button[@id='btnSave']")
	private WebElement savebankbutton;

	@FindBy(xpath="//button[contains(text(),'Close')]")
	private WebElement bankclosebutton;

	@FindBy(xpath="//a[contains(text(),'Bank Entry')]")
	private WebElement bankentryoption;

	@FindBy(xpath="//input[@id='Filter_BankName']")
	WebElement banknamesearch;

	@FindBy(xpath="//a[@title='Edit Bank details']")
	WebElement bankediticon;

	@FindBy(xpath="//button[@id='btnSearch']")
	WebElement banknamesearchbtn;

	@FindBy(xpath="//button[@title='Clear filter']")
	WebElement banknameclear;


	// pay slip elements

	@FindBy(xpath="//div[@class='dropdown-menu dropdown-menu-right show']//a[@class='dropdown-item'][contains(text(),'Pay Slip')]")
	private WebElement paysliplink;

	@FindBy(xpath="//select[@id='Filter_CenterID']")
	private WebElement centrefielddropdown;

	@FindBy(xpath="//select[@name='Filter.DesignationID']")
	private WebElement designationfielddropdown;

	@FindBy(id="Filter_UpdateBankSlipAll")
	private WebElement chequecheckbox;

	@FindBy(xpath="(//input[@name='Filter.UpdateBankSlipAll'])[1]")
	private WebElement addcheckno;

	@FindBy(id="Filter_PaySlipNo")
	private WebElement payslipnumberfilter;

	@FindBy(xpath="//a[@class='btn btn-info btn-sm button modalBankDeposit right']")
	private WebElement addchequebutton;

	@FindBy(xpath="//input[@name='DepositSlipNo']")
	private WebElement chequeboxfield;

	@FindBy(xpath="//input[@name='DepositDate']")
	private WebElement chequeissuedate;

	@FindBy(xpath="//button[@class='btn btn-xs ui-button ui-corner-all ui-widget']")
	private WebElement chequecancelbutton;

	@FindBy(xpath="//button[@class='btn btn-primary btn-xs ui-button ui-corner-all ui-widget']")
	private WebElement chequesavebutton;

	@FindBy(xpath="//tr[3]//td[1]//input[1]")
	private WebElement payslipchequebox;

	@FindBy(xpath="//button[@class='btn btn-primary btn-sm btnSendEmail right']")
	private WebElement sendemailbutton;

	@FindBy(xpath="//div[contains(text(),'Pay Slip No.')]")
	private WebElement payslipsortbuton;

	@FindBy(xpath="//div[contains(text(),'Employee Name')]")
	private WebElement employsortbuton;

	@FindBy(xpath="//font[contains(text(),'q')]")
	private WebElement unsortbutton;

	@FindBy(xpath="//font[contains(text(),'p')]")
	private WebElement payslipnumdescendingorderbutton;

	@FindBy(xpath="//a[@class='btn btn-sm btn-success PrintRequisition right']")
	private WebElement printsubmitbutton;

	@FindBy(xpath="//a[@href='#'and@id='payslipprintpagebutton']")
	private WebElement printoptionbutton;

	@FindBy(xpath="//input[@name='Filter.PaySlipNo']")
	private WebElement payslipnumbertextbox;

	@FindBy(xpath="//button[@class='btn fas fa-sync-alt']")
	private WebElement refreshbutton;

	@FindBy(xpath="//input[@id='List_0__SendMail']")
	WebElement selectpayslipcheckbox;

	@FindBy(xpath="//tbody//tr//td[@class='today day']")
	WebElement selectdate;

	@FindBy(xpath="//input[@name='Filter.StaffNo']")
	WebElement filterstaffno;


	// employee loan element

	@FindBy(xpath="//a[contains(text(),'Employee Loan Report')]")
	private WebElement employeeloanreportlink;

	@FindBy(xpath="//div[@id='DivLoanSavings']//div[1]//div[1]//div[1]//div[1]")
	private WebElement loancomponentradiobutton;

	@FindBy(xpath="//span[text()='Loan Components']//..//div//select")
	private WebElement selectloancomponent;

	@FindBy(xpath="//select[@name='DivLoanSavingsLC']")
	WebElement selectloan;

	@FindBy(xpath="//select[@id='DivLoanSavingsLC']")
	private WebElement selectloancomponentbutton;

	@FindBy(xpath="//label[contains(text(),'True')]")
	private WebElement truebutton;

	@FindBy(xpath="//input[@id='radioButtonList_1']")
	private WebElement falsebutton;

	@FindBy(xpath="//iframe[contains(text(),'iframes not supported.')]")
	private WebElement payrollframe;

	@FindBy(xpath="//input[@id='DivLoanSavingsSF']")
	private WebElement emploanstaffnumberfrom;

	@FindBy(xpath="//input[@id='DivLoanSavingsST']")
	private WebElement emploanstaffnumbersto;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement viewreportbutton;

	@FindBy(xpath="//a[@id='ReportViewer1_ctl05_ctl04_ctl00_ButtonLink']")
	WebElement downloadlinkbutton;

	@FindBy(xpath="//a[@title='Excel']")
	WebElement excel;

	@FindBy(xpath="//a[@title='PDF']")
	WebElement pdf;

	@FindBy(xpath="//a[@title='Word']")
	WebElement word;

	@FindBy(xpath="//input[@name='DivPayrollSummarySF']")
	private WebElement reportstaffrom;

	@FindBy(xpath="//span[@class='multiselect-selected-text']")
	private WebElement loansum;

	@FindBy(xpath="//li//a//input[@type='checkbox'and@value='BDS LOAN']")
	WebElement selectloansum;

	@FindBy(xpath="//select[@id='DivLoanSavingsCD']")
	private WebElement emploancent;

	@FindBy(xpath="//select[@id='DivLoanSavingsD']")
	private WebElement  emploandes;

	@FindBy(xpath="//tbody//tr//td[2]")
	WebElement payslipNo;

	// netpay and gross pay report elements

	@FindBy(xpath="//span[text()='Year']/following-sibling::div")
	private WebElement multiselectyear;

	@FindBy(xpath="//label[contains(text(),'2020')]")
	private WebElement year1;

	@FindBy(xpath="//label[contains(text(),'2019')]")
	private WebElement year2;

	@FindBy(xpath="//a[contains(text(),'Net Pay & Gross Pay Report')]")
	private WebElement netandgrosspaylink;

	@FindBy(xpath="//select[@id='DivNetAndGrossPayMNormal']")
	private WebElement netandgrossmonth;

	@FindBy(xpath="//select[@id='DivNetAndGrossPayCD']")
	private WebElement netandgrosspaycentre;

	@FindBy(xpath="//select[@id='DivNetAndGrossPayD']")
	private WebElement netandgrossdesignation;

	@FindBy(xpath="//input[@id='DivNetAndGrossPaySF']")
	private WebElement netandgrossstafffrom;

	@FindBy(xpath="//input[@id='DivNetAndGrossPayST']")
	private WebElement netandgrossstaffto;

	@FindBy(xpath="//input[@id='btnDivNetAndGrossPay']")
	private WebElement netandgrosspayviewreport;

	@FindBy(xpath="//label[contains(text(),'Comparative')]")
	private WebElement comparitivebutton;

	@FindBy(xpath="//div[@class='btn-group open']//span[@class='multiselect-selected-text'][contains(text(),'-- Select Values --')]")
	private WebElement netandgrossyear;

	@FindBy(xpath="//select[@id='DivNetAndGrossPayRT']")
	private WebElement recruitmenttype;


	@FindBy(xpath="//label[contains(text(),'2020')]")
	private WebElement yearselection1;

	@FindBy(xpath="//label[contains(text(),'2019')]")
	private WebElement yearselection2;

	// staffage group report elements

	@FindBy(xpath="//a[contains(text(),'Staff Age Group Report')]")
	private WebElement staffagegrouplink;

	@FindBy(xpath="//span[text()='Center/Department']/..//div//select")
	private WebElement staffagecentre;

	@FindBy(xpath="//span[text()='Designation']/..//div//select")
	private WebElement staffagedesignation;

	@FindBy(id="DivStaffAgeDA")
	private WebElement staffagedatefield;

	// staff count report elements

	@FindBy(xpath="//a[contains(text(),'Staff Count Report')]")
	private WebElement staffcountreportlink;

	@FindBy(xpath="//select[@id='DivStaffCountFT']")
	private WebElement staffcountfiltertype;

	@FindBy(xpath="//select[@id='DivStaffCountYNormal']")
	private WebElement staffcountreportyear;

	@FindBy(xpath="//select[@id='DivStaffCountMNormal']")
	private WebElement staffcountreportmonth;

	@FindBy(xpath="//input[@id='btnDivStaffCount']")
	private WebElement staffagecountreport;

	@FindBy(xpath="//label[.='Comparative']")
	private WebElement comparativeradiobutton;

	@FindBy(xpath="//label[.='Normal']")
	private WebElement Normalradiobutton;

	@FindBy(xpath="//select[@id='DivStaffCountYNormal']")
	private WebElement selstaffcountyear;

	@FindBy(xpath="//select[@id='DivStaffCountMNormal']")
	private WebElement selstaffcountmonth;

	@FindBy(xpath="//select[@id='DivStaffCountC']")
	private WebElement selstaffcountcent;

	@FindBy(xpath="//select[@id='DivStaffCountD']")
	private WebElement selstaffcountdes;

	// summary report by designation elements

	@FindBy(xpath="//span[text()='Staff From']/..//div//input")
	private WebElement staffnumberfrom;

	@FindBy(xpath="//span[text()='Staff To']/..//div//input")
	private WebElement staffnumbersto;

	@FindBy(xpath="//span[text()='Recruitment Type']/..//div//select")
	private WebElement selectingrecruitmenttype;

	@FindBy(linkText="Summary Report by Designation")
	private WebElement summaryreportbydesignationlink;

	@FindBy(xpath="//span[text()='Year']/../div//select/.")
	private WebElement reportyearselection;

	@FindBy(xpath="//span[text()='Month']/..//div//select/.")
	private WebElement reportmonthselection;

	@FindBy(xpath="//span[text()='Center']/..//div//select/.")
	private WebElement reportcentreselection;

	@FindBy(xpath="//span[text()='Designation']/..//div//select/.")
	private WebElement reportdesignationselection;

	@FindBy(xpath="//span[text()='Center']/..//div//select")
	private WebElement centerselection;

	@FindBy(xpath="//span[text()='Designation']/..//div//select")
	private WebElement designationselection;

	// summary report elements

	@FindBy(linkText="Summary Report")
	private WebElement summaryreportlink;

	@FindBy(xpath="//select[@id='DivPayrollSummaryT']")
	private WebElement payrollreporttype;

	@FindBy(xpath="//input[@name='DivPayrollSummaryST']")
	private WebElement reportstaffto;

	@FindBy(xpath="//select[@name='DivPayrollSummaryCD']")
	private WebElement summcentredept;

	@FindBy(xpath="//select[@name='DivPayrollSummaryD']")
	private WebElement payrolldesignation;

	@FindBy(xpath="//select[@name='DivPayrollSummaryRT']")
	private WebElement payrollrecruitmenttype;

	@FindBy(xpath="//input[@name='btnDivPayrollSummary']")
	private WebElement viewpayrollreport;

	@FindBy(xpath="//select[@name='DivPayrollSummaryYNormal']")
	private WebElement payrollyear;

	@FindBy(xpath="//select[@name='DivPayrollSummaryMNormal']")
	private WebElement payrollmonth;

	@FindBy(xpath="//label[contains(text(),'Normal')]")
	private WebElement reporttype;

	@FindBy(xpath="//div[@id='DivPayrollSummaryComparativeType']//div[1]//div[1]//div[1]")
	private WebElement reporttyperadiobutton;

	@FindBy(xpath="//label[contains(text(),'Comparative')]")
	private WebElement comparitiveradiobutton;

	@FindBy(xpath="//button[@title='-- Select Values --']")
	private WebElement selectamonth;

	@FindBy(xpath="//body/form/div/div[2]")
	private WebElement reportview;

	@FindBy(xpath="//input[@id='DivPayrollSummarySF']")
	WebElement summarystafffrom;

	@FindBy(xpath="//input[@id='DivPayrollSummaryST']")
	WebElement summarystaffto;

	@FindBy(xpath="//input[@type='checkbox'and@value='1']")
	WebElement selectmonth1;

	@FindBy(xpath="//input[@type='checkbox'and@value='2']")
	WebElement selectmonth2;

	@FindBy(xpath="//select[@id='DivPayrollSummarySC']")
	WebElement selectstatucomp;

	@FindBy(xpath="//select[@id='DivPayrollSummaryB']")
	WebElement selectbank;

	@FindBy(xpath="//select[@id='DivPayrollSummaryBR']")
	WebElement selectbranch;

	@FindBy(xpath="//select[@id='DivPayrollSummaryCD']")
	WebElement selectprollcent;

	@FindBy(xpath="//select[@id='DivPayrollSummaryD']")
	WebElement selectprolldes;

	// BDS Summary Report

	@FindBy(xpath="//a[contains(text(),'BDS Summary Report')]")
	WebElement bdssummarylink;

	@FindBy(xpath="//select[@id='DivBDSReportY']")
	WebElement bdsyear;

	@FindBy(xpath="//select[@id='DivBDSReportM']")
	WebElement bdsmonth;

	@FindBy(xpath="//select[@id='DivBDSReportCD']")
	WebElement bdscentre;

	@FindBy(xpath="//select[@id='DivBDSReportRT']")
	WebElement bdsrecruitment;

	@FindBy(xpath="//input[@id='DivBDSReportSF']")
	WebElement bdsstafffrom;

	@FindBy(xpath="//input[@id='DivBDSReportST']")
	WebElement bdsstaffto;

	@FindBy(xpath="//select[@id='DivBDSReportD']")
	WebElement bdsdesignation;

	// pay structure entry functions

	public void clickonpayrollheader(){
		webDriverclick(payrollheader);	
	}

	public void selectpayrollentryoption(){
		webDriverclick(payrollstructurelink);
	}

	public void addnewpaystructure(){
		webDriverclick(addnewpaystructurebtn);
	}

	public void enterthefieldsFn(){
		String Paystructurecode = ExcelHelper.readData(".\\ExcelFiles\\Payroll.xlsx","PayStructureEntry",1,0);
		enterpaystructurename.sendKeys(Paystructurecode);
		String paystructurename = ExcelHelper.readData(".\\ExcelFiles\\Payroll.xlsx","PayStructureEntry",1,1);
		paystructurenamefield.sendKeys(paystructurename);
		String Displayorder = ExcelHelper.readData(".\\ExcelFiles\\Payroll.xlsx","PayStructureEntry",1,2);
		newdisplayorderfield.sendKeys(Displayorder);
		Select s1=new Select(variabledropdown);
		s1.selectByVisibleText("Variable Fixed");
	}

	public void selectthevalues(){
		isTaxableDirectcheckboxfield.click();
		if(!isTaxableDirectcheckboxfield.isSelected())
		{
			isTaxableDirectcheckboxfield.click();
		}
		isactivecheckboxfield.click();
		if(!isactivecheckboxfield.isSelected())
		{
			isactivecheckboxfield.click();
		}
	}

	public void selectstatuatoryfield(){
		fixedamountcheckboxfield.click();
		String fixedamount = ExcelHelper.readData(".\\ExcelFiles\\Payroll.xlsx","PayStructureEntry",1,3);
		fixedamounttextboxfield.sendKeys(fixedamount);
		selectthevalues();
	}

	public void userIntimation() throws InterruptedException{
		String message = "The pay structure details have been saved successfully.";
		try{
			Thread.sleep(2000);
			confirmationMsg(message);
		}
		catch(Exception e){
			Thread.sleep(2000);
			alertAccept();
		}
	}

	public void selectpayslipdisplaysection() throws AWTException{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		payslipdisplaysection.click();
		webDriverclick(displaycheckbox);
		webDriverclick(savebutton);
	}

	public void searchpaystructurecode()
	{
		String Paystructurecode = ExcelHelper.readData(".\\ExcelFiles\\Payroll.xlsx","PayStructureEntry",1,0);
		FilterPaystructurecode.sendKeys(Paystructurecode);
		searchbutton.click();
	}

	public void clickoneditpaystructure()
	{
		editpaystructure.click();
	}

	public void updatefields(String paystructurename,String displayorder){
		newpaystructureNamefield.clear();
		newpaystructureNamefield.sendKeys(paystructurename);
		newdisplayorderfield.clear();
		newdisplayorderfield.sendKeys(displayorder);	
		savebutton.click();
	}

	public void searchpaystructurename(String searchpaystructurename)
	{
		FilterPaystructurecode.sendKeys(searchpaystructurename);
		searchbutton.click();
		refreshbtn.click();
	}

	// manual payroll function

	public void selectmanualpayrolloption(){
		webDriverclick(manualpayrolllink);
	}

	public void setemployee(String employeename) throws InterruptedException{
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		employeefield.sendKeys(employeename);
		gobutton.click();
		Thread.sleep(5000);
	}

	public void setholdorinitiatepayroll(String payroll)
	{
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		holdorinitiatedropdown.sendKeys(payroll);
	}

	public void setyearformanualpayroll(String year)
	{
		yeardropdown.sendKeys(year);
	}

	public void setmonthformanualpayroll(String month)
	{
		monthdropdown.sendKeys(Keys.ARROW_DOWN);
	}

	public void selecttheorganisationcheckbox() throws InterruptedException{
		educationdepart.click();
		Thread.sleep(5000);
	}

	public void submitmanualpayrollbutton(){
		scrollIntoView(manualpayrollsubmit);
		manualpayrollsubmit.click();
	}

	public void verifythepayrollinitiatesuccessmessge(){
		String Actual=payrollsaveconfirmation.getText();
		String expected="The Payroll has been put on hold for the Employees";
		AssertionUtils.assertEquals(payrollsaveconfirmation, Actual, expected, true);
	}

	//payroll structure upload functions

	public void paystructurelink(){
		paystructureuploadlink.click();
	}

	public void verifypaystructureupload() throws Exception{
		paystructureFilename.sendKeys("TestFile");
		Thread.sleep(2000);
		String path=System.getProperty("user.dir");
		String file= path+"//PayStructureUploadTemplate.xlsx";
		paystructurefileuploadlink.sendKeys(file);
		try{
			WebDriverWait wait = new WebDriverWait(getDriver(),30);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='submitButton']")));
			element.click();
		}
		catch(Throwable e){
			System.err.println("Error came while waiting and clicking the element. "+e.getMessage());
		}
	}

	public void verifydownloadtemplate() throws InterruptedException{
		downloadtemplate.click();
		Thread.sleep(3000);
	}

	public void clickonuploadbutton(){
		String exp="Changes to Excel is succefully Saved. Please note the changes will be effective only the next day.";
		String text=errortext.getText();
		Assert.assertEquals(text,exp);
	}

	//P9A form functions
	public void clickonp9aformlink(){
		p9aformlink.click();
	}

	public void enterdetailsforp9form(String year){
		selectyear.sendKeys(year);
	}

	public void enterstaffnumbers(String staffstartnum,String staffnumto){
		staffnumberstart.sendKeys(staffstartnum);
		staffnumberto.sendKeys(staffnumto);
	}

	public void sendbulkemail() throws InterruptedException{
		sendemailbuttonp9form.click();
		getDriver().switchTo().alert().accept();
		Thread.sleep(1000);
	}

	public void generatep9form() throws InterruptedException{
		generatep9form.click();
		Thread.sleep(3000);
	}

	public void closethep9aform() throws InterruptedException
	{
		String MainWindow	=	getDriver().getWindowHandle();
		Set<String>allwin =	getDriver().getWindowHandles();
		for (String P9aformwin : allwin ) {
			if(!P9aformwin.equals(MainWindow)){
				getDriver().switchTo().window(P9aformwin);
				Thread.sleep(2000);
				getDriver().close();
			}
		}
		getDriver().switchTo().window(MainWindow);
	}

	// Bank entry functions

	public void selectthebankentryoption() throws InterruptedException{
		Thread.sleep(1000);
		bankentryoption.click();
	}

	public void addnewbankbutton(){
		addnewbankbutton.click();
	}

	public void enterallthedetailsofnewbank() throws IOException{

		String bankcode=ExcelLib.getExcelData("Bankdetails", 1, 0);

		String Bankname=ExcelLib.getExcelData("Bankdetails", 1, 1);

		String Address=ExcelLib.getExcelData("Bankdetails", 1, 2);

		String fax=ExcelLib.getExcelData("Bankdetails", 1, 3);

		String Phone=ExcelLib.getExcelData("Bankdetails", 1, 4);

		String email=ExcelLib.getExcelData("Bankdetails", 1, 5);

		String Accnumlength=ExcelLib.getExcelData("Bankdetails", 1, 6);

		bankcodefield.sendKeys(bankcode);
		banknamefield.sendKeys(Bankname);
		bankaddressfield.sendKeys(Address);
		bankfaxfield.sendKeys(fax);
		bankphonefield.sendKeys(Phone);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true)", bankemailfield);

		bankemailfield.sendKeys(email);
		bankaccountlengthfield.sendKeys(Accnumlength);
		savebankbutton.click();
	}


	public void banksearch() throws IOException
	{
		String Bankname=ExcelLib.getExcelData("Bankdetails", 1, 1);
		banknamesearch.sendKeys(Bankname);
		banknamesearchbtn.click();
	}

	public void bankclearfilter() throws IOException
	{
		String Bankname=ExcelLib.getExcelData("Bankdetails", 1, 1);
		banknamesearch.sendKeys(Bankname);
		banknameclear.click();
	}

	public void updatebankentry(String bcode, String address,String phone, String email) throws InterruptedException
	{
		bankediticon.click();
		Thread.sleep(2000);

		bankcodefield.click();
		bankcodefield.clear();
		bankcodefield.sendKeys(bcode);

		bankaddressfield.click();
		bankaddressfield.clear();
		bankaddressfield.sendKeys(address);

		bankphonefield.click();
		bankphonefield.clear();
		bankphonefield.sendKeys(phone);

		bankphonefield.click();
		bankemailfield.clear();
		bankemailfield.sendKeys(email);

		savebankbutton.click();
	}

	// pay slip functions

	public void selectpaysliplink(){
		paysliplink.click();
	}

	public void clickoncentrefield(){
		centrefielddropdown.click();
	}

	public void selectthecentre(){
		centrefielddropdown.click();
		Select s1=new Select(centrefielddropdown);
		s1.selectByValue("Baba Dogo");
		designationfielddropdown.click();
		Select s2=new Select(designationfielddropdown);
		s2.selectByValue("Head Teacher");
	}

	public void selectcheckboxforchequeno(){
		if ( !addcheckno.isSelected()){
			addcheckno.click();
			if(this.isAlertPresent()){
			Alert a = getDriver().switchTo().alert();
			a.accept();	
			}
		}
	}
	
	public boolean isAlertPresent() {
		try {
			getDriver().switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch
	}
	

	public void searchpayslipandchooseemployess(){
		String payslipnum = payslipNo.getText();
		payslipnumberfilter.sendKeys(payslipnum);
		searchbtn.click();
		//refreshbtn.click();
		//webDriverclick(addcheckno);
//		refreshbtn.click();
	}
	
	public void switchframetodefaut() throws InterruptedException{
		Thread.sleep(5000);
		getDriver().switchTo().defaultContent();
	}

	public void enterchequenumberanddate(String chequenumber){
		addchequebutton.click();
		chequeboxfield.click();
		chequeboxfield.sendKeys(chequenumber);
		chequeissuedate.click();
		selectdate.click();
	}

	public void savechequebutton(){
		chequesavebutton.click();
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
	}

	public void selectthepayslips(){
		if ( !payslipchequebox.isSelected()){
			payslipchequebox.click();
		}
	}

	public void clicksendemailbutton(){
		sendemailbutton.click();
		Alert alert = getDriver().switchTo().alert();
		alert.accept(); 
	}

	public void verifypayslipsortfunction(){
		payslipsortbuton.click();
	}

	public void verifyemploysortfunction(){
		employsortbuton.click();
	}

	public void prinsubmitbutton(){
		printsubmitbutton.click();
	}

	public void presenceofprint() throws InterruptedException{
		printoptionbutton.click();
	}

	public void closepayrollpage() throws InterruptedException{
		String parent = getDriver().getWindowHandle();
		Thread.sleep(3000);
		for (String winHandle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(winHandle); // switch focus to new window
		}
		getDriver().close();
		getDriver().switchTo().window(parent);
	}

	public void verifythesearchbutton(String payslipno){
		payslipnumbertextbox.sendKeys(payslipno);
		searchbutton.click();
	}

	public void verifytheFilter(String staffno){
		filterstaffno.sendKeys(staffno);
		searchbutton.click();
	}

	public void refreshbutton(){
		refreshbutton.click();
	}

	// employee loan report -individual loan true/false

	public void selectheemployeereportlink(){
		employeeloanreportlink.click();
	}

	public void selectindividualloan(String loan) throws InterruptedException{
		truebutton.click();
		Thread.sleep(3000);
		selectloancomponentbutton.click();
		selectloancomponent.sendKeys(loan);

	}

	public void selectindividualloansum() throws InterruptedException{
		falsebutton.click();
		Thread.sleep(3000);
		loansum.click();
		selectloansum.click();
	}

	public void switchtoframe(){
		getDriver().switchTo().frame(payrollframe);
	}

	public void downloadFn() throws InterruptedException{
		webDriverclick(downloadlinkbutton);
		Thread.sleep(3000);
		webDriverclick(excel);
		Thread.sleep(3000);
		//webDriverclick(word);
		//webDriverclick(pdf);
		//this.DwnldVerificatnFn();
	}

	public void enterthestaffnumbers(String Stafffrom,String Staffto) throws InterruptedException{

		emploanstaffnumberfrom.click();
		Thread.sleep(1000);
		emploanstaffnumberfrom.sendKeys(Stafffrom);
		emploanstaffnumbersto.click();
		Thread.sleep(1000);
		emploanstaffnumbersto.sendKeys(Staffto);
	}
	public void emploancentanddesign(String cent, String design) throws InterruptedException
	{
		Select selcent= new Select(emploancent);
		selcent.selectByVisibleText(cent);	
		Thread.sleep(2000);
		Select seldes= new Select(emploandes);
		seldes.selectByVisibleText(design);	
	}

	// netpay and grosspay reports

	public void selectnetandgrosspaylink(){
		netandgrosspaylink.click();
	}

	public void chooserecuitmentype(String requirmenttype) throws InterruptedException{
		recruitmenttype.click();
		Thread.sleep(2000);
		recruitmenttype.sendKeys(requirmenttype);
	}

	public void fillmonthandyear(String month){
		netandgrossmonth.sendKeys(month);
	}

	public void selectstaffdetails(String Stafffrom,String staffto){
		netandgrossstafffrom.sendKeys(Stafffrom);
		netandgrossstaffto.sendKeys(staffto); 
	}

	public void netpaygrosspayviewreport(){
		netandgrosspayviewreport.click();
	}

	public void choosetheyearandmonth(){
		multiselectyear.click();
		WebElementUtils.isElementPresent(multiselectyear);
		getDriver().manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		year1.click();
		year2.click();
	}

	public void selectnetandgrosstype(){
		comparitivebutton.click();
		getDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	public void multiselecttheyear(){
		multiselectyear.click();
		WebDriverWait wait = new WebDriverWait(getDriver(), 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'2020')]")));
		yearselection1.click();
		yearselection2.click();
	}

	public void netgrosscentanddesign(String cent, String design) throws InterruptedException
	{
		Select selcent= new Select(netandgrosspaycentre);
		selcent.selectByVisibleText(cent);	
		Thread.sleep(2000);
		Select seldes= new Select(netandgrossdesignation);
		seldes.selectByVisibleText(design);	
	}

	// staffage group functions

	public void clickonstaffagegrouplink(){
		staffagegrouplink.click();
	}

	public void selectcentreanddesignation(String Centre,String Designation) throws InterruptedException{
		staffagecentre.click();
		staffagecentre.sendKeys(Centre);
		staffagedesignation.click();
		Thread.sleep(2000);
		staffagedesignation.sendKeys(Designation);
	}

	public void selectdateforstaffage() throws IOException{
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		staffagedatefield.sendKeys("31/08/2020");
	}

	// staffcount report functions

	public void staffcountreportlink(){
		staffcountreportlink.click();
	}

	public void selectfiltertype(String filtertype){
		getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		staffcountfiltertype.sendKeys(filtertype);
	}

	public void selectthemonthandyear(String year,String month) throws InterruptedException{
		staffcountreportyear.sendKeys(year);
		Thread.sleep(2000);
		staffcountreportmonth.sendKeys(month);
	}

	public void viewreportbutton() throws InterruptedException{
		viewreportbutton.click();
		Thread.sleep(5000);
	}

	public void selectthereporttype() throws InterruptedException{
		WebElement elem = Normalradiobutton;
		if(!elem.isSelected()){
			comparativeradiobutton.click();
		}
		else {
			System.out.println("Comparitive selected");
		}
		Thread.sleep(2000);
	}

	public void selectstaffcountyearandmonth(String month,String year) throws InterruptedException
	{
		Select selmonth=new Select(selstaffcountmonth);
		selmonth.selectByVisibleText(month);
		Thread.sleep(2000);
		Select selyear=new Select(selstaffcountyear);
		selyear.selectByVisibleText(year);
	}

	public void selectstaffcountcentanddesign(String cent,String design) throws InterruptedException
	{
		Select selmonth=new Select(selstaffcountcent);
		selmonth.selectByVisibleText(cent);
		Thread.sleep(2000);
		Select selyear=new Select(selstaffcountdes);
		selyear.selectByVisibleText(design);
	}

	// summary report by designation

	public void clickonsummryreportbydesignation(){
		summaryreportbydesignationlink.click();
	}

	public void selectyearandmonth(String year,String month){
		reportyearselection.sendKeys(year);
		Actions action = new Actions(getDriver());
		action.moveToElement(reportmonthselection);
		reportmonthselection.sendKeys(month);
	}

	public void enterthestaffnumberdetails(String stafffrom,String staffto){
		staffnumberfrom.sendKeys(stafffrom);
		staffnumbersto.sendKeys(staffto);
	}

	public void selectingrecruitmenttype(String recruitmenttype){
		selectingrecruitmenttype.sendKeys(recruitmenttype);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void choosecentreanddesign(String centre,String designation){
		centerselection.sendKeys(centre);
		designationselection.sendKeys(designation);
	}

	// summary report

	public void payrollsummaryreport(){
		summaryreportlink.click();
		getDriver().switchTo().frame(payrollframe);
	}

	public void selectthesummarytype(String summarytype) throws InterruptedException{
		payrollreporttype.sendKeys(summarytype);
		Thread.sleep(2000);
	}

	public void selectpayrollyearandmonth(String year,String month) throws InterruptedException{
		Thread.sleep(1000);
		payrollyear.sendKeys(year);
		payrollmonth.click();
		Thread.sleep(1000);
		payrollmonth.sendKeys(month);
		payrollmonth.click();
	}

	public void selectthecentre(String centrename,String Designation){
		summcentredept.sendKeys(centrename);
	}

	public void selectrecruitmenttype(String reqruitment){
		payrollrecruitmenttype.sendKeys(reqruitment);
	}

	public void fillstaffsfromandto(String prollstaffrom,String prollstafto){
		summarystafffrom.click();
		summarystafffrom.sendKeys(prollstaffrom);
		summarystaffto.click();
		summarystaffto.sendKeys(prollstafto);
	}

	public void selectreporttype() throws InterruptedException{
		WebElementUtils.waitForVisible(comparitiveradiobutton);
		comparitiveradiobutton.click();
		Thread.sleep(2000);
	}

	public void selectthemonth() throws InterruptedException{
		selectamonth.click();
		Thread.sleep(2000);
		selectmonth1.click();
		Thread.sleep(3000);
		selectmonth2.click();
	}

	public void selectstatucomp()
	{
		Select selectstatcomp= new Select(selectstatucomp);
		selectstatcomp.selectByIndex(1);
	}

	public void selectbankandbranch(String bank,String branch) throws InterruptedException
	{
		Select selbank= new Select(selectbank);
		selbank.selectByVisibleText(bank);
		Thread.sleep(2000);
		Select selbranch= new Select(selectbranch);
		selbranch.selectByVisibleText(branch);

	}

	public void selectprollcentanddesign(String cent,String design) throws InterruptedException
	{
		Select selbank= new Select(selectprollcent);
		selbank.selectByVisibleText(cent);
		Thread.sleep(2000);
		Select selbranch= new Select(selectprolldes);
		selbranch.selectByVisibleText(design);

	}
	public void DwnldVerificatnstaffage(String downloadfile) throws InterruptedException {
//		File file =new File(filepath);
//		File[] listoffile=file.listFiles();
//		for(File downloadedfile:listoffile)
//		{
//			if(downloadedfile.getName().equals(downloadfile))
//			{
//				System.out.println("StaffAgexcelfile is downloaded");
//				break;
//			}
//
//		}
		DwnldfileVerificatnFn(downloadfile);
	}

	public void DwnldVerificatnstaffcount(String downloadfile) throws InterruptedException {
//		File file =new File(filepath);
//		File[] listoffile=file.listFiles();
//		for(File downloadedfile:listoffile)
//		{
//			if(downloadedfile.getName().equals(downloadfile))
//			{
//				System.out.println("StaffCountexcelfile is downloaded");
//				break;
//			}
//
//		}
		DwnldfileVerificatnFn(downloadfile);
	}

	public void DwnldVerificatndesignation(String downloadfile) throws InterruptedException {
//		File file =new File(filepath);
//		File[] listoffile=file.listFiles();
//		for(File downloadedfile:listoffile)
//		{
//			if(downloadedfile.getName().equals(downloadfile))
//			{
//				System.out.println("PayrollSummarybyDesignationexcelfile is downloaded");
//				break;
//			}
//
//		}
		DwnldfileVerificatnFn(downloadfile);
	}

	public void DwnldVerificatnemploan(String downloadfile) throws InterruptedException {
//		File file =new File(filepath);
//		File[] listoffile=file.listFiles();
//		for(File downloadedfile:listoffile)
//		{
//			if(downloadedfile.getName().equals(downloadfile))
//			{
//				System.out.println("Payroll_LoanSavings excelfile is downloaded");
//				break;
//			}
//
//		}
		DwnldfileVerificatnFn(downloadfile);
	}

	public void DwnldVerificatnetgross(String downloadfile) throws InterruptedException {
//		File file =new File(filepath);
//		File[] listoffile=file.listFiles();
//		for(File downloadedfile:listoffile)
//		{
//			if(downloadedfile.getName().equals(downloadfile))
//			{
//				System.out.println("NetAndGrossPay excelfile is downloaded");
//				break;
//			}
//
//		}
		DwnldfileVerificatnFn(downloadfile);
	}

	public void DwnldVerificatnpayroll(String downloadfile) throws InterruptedException {
//		File file =new File(filepath);
//		File[] listoffile=file.listFiles();
//		for(File downloadedfile:listoffile)
//		{
//			if(downloadedfile.getName().equals(downloadfile))
//			{
//				System.out.println("PayrollSummaryReport excelfile is downloaded");
//				break;
//			}
//		}	
		DwnldfileVerificatnFn(downloadfile);
	}

	public void DwnldtempVerificatn(String downloadfile) throws InterruptedException {
//		File file =new File(filepath);
//		File[] listoffile=file.listFiles();
//		for(File downloadedfile:listoffile)
//		{
//			if(downloadedfile.getName().equals(downloadfile))
//			{
//				System.out.println("PayStructureUploadTemplate is downloaded");
//				break;
//			}
//		}	
		DwnldfileVerificatnFn(downloadfile);
	}

	// BDS summary report functions

	public void selectbdsreportlink()
	{
		bdssummarylink.click();
	}

	public void BDSstaff(String bdsstaffrom, String bdsstafto)
	{
		bdsstafffrom.sendKeys(bdsstaffrom);
		bdsstaffto.sendKeys(bdsstafto);
	}

	public void bdsselect(String year,String month) throws InterruptedException
	{
		Select selyear= new Select(bdsyear);
		selyear.selectByVisibleText(year);
		Thread.sleep(2000);
		Select selmonth= new Select(bdsmonth);
		selmonth.selectByVisibleText(month);
	}

	public void selectbsdcentdesiginationandrecruitment(String center, String design,String recruit) throws InterruptedException
	{
		Select selcent= new Select(bdscentre);
		selcent.selectByVisibleText(center);
		Thread.sleep(2000);
		Select seldesignr= new Select(bdsdesignation);
		seldesignr.selectByVisibleText(design);
		Thread.sleep(2000);
		Select selrecruit= new Select(bdsrecruitment);
		selrecruit.selectByVisibleText(recruit);
	}

	public void DwnldVerificatnBDS(String downloadfile) throws InterruptedException {
//		File file =new File(filepath);
//		File[] listoffile=file.listFiles();
//		for(File downloadedfile:listoffile)
//		{
//			if(downloadedfile.getName().equals(downloadfile))
//			{
//				System.out.println("Payroll_BDSreport excelfile is downloaded");
//				break;
//			}
//
//		}
		DwnldfileVerificatnFn(downloadfile);
	}
}
