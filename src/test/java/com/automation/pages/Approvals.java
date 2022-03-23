package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

import com.automation.utils.AssertionUtils;
import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class Approvals {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public Approvals() {

		PageFactory.initElements(getDriver(), this);
	}

	///////////////////////////////// Approval
	///////////////////////////////// steps///////////////////////////////////////////////

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=Appr')]")
	WebElement approvallink;

	@FindBy(xpath = "//input[@id='Filter_FirstName']")
	WebElement enterstudent;
	
	@FindBy(xpath = "(//*[@title='Approve/Deny Student'])[1]")
	WebElement App;
	
	
	// i.fa.fa-cogs
	// *[@id='tblStudentListView']/tbody/tr[2]/td[11]/div/a[2]/i
	@FindBy(css = "i.fa.fa-cogs")
	WebElement approvalicon;

	// *[@id="tblStudentListView"]/tbody/tr[2]/td[13]/div/a[2]/i

	////////////////////////////////// School
	////////////////////////////////// Info////////////////////////////////////////////////////

	@FindBy(xpath = "//*[@id='ddlClasses']")
	WebElement enterclass;

	@FindBy(xpath = "//*[@id='ddlSections']")
	WebElement entersection;

	@FindBy(xpath = "//div[@id='SchoolInfoSave']//button[@value='Save & Go To Next']")
	WebElement saveschoolinfo;

	////////////////////////////// Fee info/////////////////////////

	@FindBy(xpath = "//*[@id='AdmissionFee']")
	WebElement admissionfee;

	@FindBy(xpath = "//*[contains(@class,'Required morecurrent')]")
	WebElement feeduedatelist;

	@FindBy(xpath = "//input[@id='TuitionFee']")
	WebElement tutionfee;

	@FindBy(xpath = "//*[@id='ExaminationFee']")
	WebElement examfee;

	@FindBy(xpath = "//input[@id='MotivationFee']")
	WebElement Motivationfee;

	@FindBy(xpath = "//*[@id='DevelopmentFeeDueDate']")
	WebElement developmentfeeduedate;

	@FindBy(xpath = "//*[@id='DevelopmentFee']")
	WebElement developmentfee;

	@FindBy(xpath = "//input[@id='ActivityFee']")
	WebElement Activityfee;

	@FindBy(xpath = "//*[@id='FeeComments']")
	WebElement feecomments;

	@FindBy(xpath = "//*[@id='FeeInfoSave']/button")
	WebElement feeinfosave;

	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	WebElement ConfirmBtn;

	@FindBy(xpath = "//button[@class='swal-button swal-button--cancel']")
	WebElement CancelBtn;

	//////////////////////////////////////////// Final headteacher approval
	//////////////////////////////////////////// page/////////////////////////////////////

	@FindBy(id = "TxtSocialWorker")
	WebElement textsocialworker;

	@FindBy(xpath = "//*[@id='Comments']")
	WebElement comments;

	@FindBy(xpath = "//button[@value='Approve']")
	WebElement frmapprovalstudent;

	@FindBy(xpath = "//button[@value='Deny']")
	WebElement frmdeniedstudent;

	@FindBy(xpath = "//button[@value='Deny']")
	WebElement cscdeniedbutton;

	@FindBy(xpath = "//button[@value='Deny']")
	WebElement csmdeniedbutton;

	@FindBy(xpath = "//button[@value='Need More Info']")
	WebElement sendforclarification;

	@FindBy(xpath = "//*[@id='userDropdownMenuLink']")
	WebElement menu;

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=Need_Info')]")
	WebElement swmoreclarificationlink;

	@FindBy(xpath = "//button[@value='Send Info']")
	WebElement swsendclarification;

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=Send_Info')]")
	WebElement afterreceivedinformation; // after received information waiting
											// for approval link

	@FindBy(xpath = "//button[@value='Need More Info']")
	WebElement cscsendclarification;

	@FindBy(xpath = "//button[@value='Send Info']")
	WebElement csmsendclarification;

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=Need_Info')]")
	WebElement htmoreclarificationlink; // csc clicks send for clarification
										// login as an ht and click
										// clarificationlink

	@FindBy(xpath = "//button[@value='Send Info']")
	WebElement htsendclarification; // ht send more clarification for csc

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=Send_Info')]")
	WebElement receivedmoreinfofromhtlink;// after received more info from ht
											// login as ht and click the link

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=Need_Info')]")
	WebElement studentrecruitmentneedmoreinformation;// when csm click on send
														// for clarification
														// login as csc and
														// click the link

	@FindBy(xpath = "//button[@value='Send Info']")
	WebElement cscsendclarificationbutton;

	@FindBy(xpath = "//button[@value='Need More Info From SW']")
	WebElement cscsendclarificationtosw;

	@FindBy(xpath = "//button[@value='Need More Info From SW']")
	WebElement csmsendclarificationtosw;

	@FindBy(xpath = "//button[@value='Send Info']")
	WebElement swsendclarificationbutton;// when csc click send for clarication
											// to sw

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=Need_Info')]")
	WebElement swneedmoreinformationlink; // when login as a sw and click
											// student recruitment need more
											// information

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=Send_Info')]")
	WebElement csmreceivedmoreinformationlink;// clicking on csm received more
												// information link

	@FindBy(xpath = "//button[@value='Approve']")
	WebElement csmresubmissionapprovalbutton;

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=Send_Info')]")
	WebElement cscreceivedmoreinformationlink;

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=Send_Info')]")
	WebElement csmreceivemoreinfolink1;

	@FindBy(xpath = "//*[@id='navbar-collapse-nav']/ul[2]/li/span/a[2]")
	WebElement logout;

	@FindBy(xpath = "//button[@value='Save & Go To Next']")
	WebElement savewhensendforclarification;

	@FindBy(xpath = "//button[@value='Save & Submit for Approval']")
	WebElement SaveAndGoToTheWorkFlow;

	@FindBy(xpath = "//*[@title='Expand Student']")
	WebElement ExpandStudent;

	@FindBy(xpath = "//*[@id='Mask']")
	WebElement MaskFee;

	@FindBy(xpath = "//*[@id='TransitionFee']")
	WebElement TransitionFee;

	@FindBy(xpath = "//*[@id='TransitionFee_DueDate']")
	WebElement TransitionFee_DueDate;

	@FindBy(xpath = "//*[@id='CommitmentFee']")
	WebElement CommitmentFee;
	
	@FindBy(xpath = "(//div[@class='col-sm-6 col-form-label'])[3]")
	WebElement CMF_ID;
	

	@FindBy(xpath = "//*[@id='ui-id-4']")
	WebElement SchoolInfo;
	
	@FindBy(xpath = "//select[@id='ddlSocialWorkers']")
	WebElement SocialWorker;
	

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// For clicking approval link after login

	public void headteacherapprovallink() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(approvallink);

		WebElementUtils.scrolltoview(approvallink);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvallink);

		Thread.sleep(3000);
	}

	// For clicking approval button

	public void headteacherstudentapproval() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(4, 1, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);// For clicking
																// the approval
																// icon

	}

	public void htNewFeeEntryValidation() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 4, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}

	public void htNewYrlyFeeEntryValidation() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 8, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void htNewMonthlyFeeEntryValidation() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 12, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void htNewTermlyFeeEntryValidation() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 16, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void PerFamilyMonthlyPreRequiste() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 32, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void PerFamilyTermlyPreRequiste() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 38, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void PerFamilyTermly() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 40, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	
	public void GenderMaleOneTime() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 44, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void GenderMaleYearly() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 50, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void GenderMaleMonthly() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 56, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void GenderMaleTermly() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 62, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void GenderFemaleMonthly() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 58, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void GenderFemaleTermly() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 64, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void HTElderOneTime() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 68, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	

	public void HTElderMonthly() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 74, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void HTyoungerrMonthly() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 76, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void EnterStdntToVerifyDeleteAllFee() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 87, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void EnterStdntToVerifyEditable() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 93, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void EnterStdntToVerifyNonEditable() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 97, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void HTYoungerOneTime() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 70, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void GenderfemaleYearly() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 52, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void GenderFemaleOneTime() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 46, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void preRequisteStudent() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 20, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void preRequistePderFamilyYearlyStudent() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 26, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void perFamilyOneTimestudent() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 22, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void perFamilyYearlystudent() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 28, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}
	
	public void perFamilyMonthlystudent() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(38, 34, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}

	public void cscDeniedStudent() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(4, 8, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);// For clicking
																// the approval
																// icon

	}

	public void csmDeniedStudent() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(4, 9, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);// For clicking
																// the approval
																// icon

	}

	public void HTDeniedStudent() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(4, 7, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);// For clicking
																// the approval
																// icon

	}

	public void htsendforclarificationStudent() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(4, 2, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}

	public void cscsendforclarificationStudent() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(4, 3, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}

	public void cscsendforclarificationStudenttosw() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(4, 5, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}

	public void csmsendforclarificationStudenttosw() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(4, 6, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}

	public void csmsendforclarificationStudent() throws InterruptedException {

		Thread.sleep(5000);
		enterstudent.sendKeys(excelutil.getData(4, 4, 0));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", approvalicon);

	}

	// savewhensendforclarification after received more informsation from the
	// social worker...Head teacher save the info to reapprove

	public void savewhenreceivedmoreinformationfromsw() throws InterruptedException {
		
		WebElementUtils.waitForVisible(SchoolInfo);
		String Actual=SchoolInfo.getText();
		System.out.println(Actual);
		String expected="School Info";
		AssertionUtils.assertEquals(SchoolInfo, Actual, expected, true);
		
		savewhensendforclarification.click();
		SaveAndGoToTheWorkFlow.click();

	}

	// For saving school info

	public void schoolinfo() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(3, 1, 4));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(3, 1, 5));

		saveschoolinfo.click();

	}

	public void newFeeShoolInfo() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 4, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 4, 3));

		saveschoolinfo.click();
	}

	public void newYrlyFeeShoolInfo() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 8, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 8, 3));

		saveschoolinfo.click();
	}
	
	public void newMonthlyFeeShoolInfo() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 12, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 12, 3));

		saveschoolinfo.click();
	}
	
	public void newTermlyFeeShoolInfo() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 16, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 16, 3));

		saveschoolinfo.click();
	}
	
	public void PerFamilyMonthlyPreRequisteClass() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 32, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 32, 3));

		saveschoolinfo.click();
	}
	
	public void PerFamilyTermlyClass() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 40, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 40, 3));

		saveschoolinfo.click();
	}
	
	public void genderMaleOneTimeFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 44, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 44, 3));

		saveschoolinfo.click();
	}
	
	public void genderMaleYearlyFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 50, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 50, 3));

		saveschoolinfo.click();
	}
	
	public void genderMaleMonthlyFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 56, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 56, 3));

		saveschoolinfo.click();
	}
	
	public void genderMaleTermlyFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 62, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 62, 3));

		saveschoolinfo.click();
	}
	
	public void genderFemaleMonthlyFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 58, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 58, 3));

		saveschoolinfo.click();
	}
	
	public void genderFemaleTermlyFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 64, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 64, 3));

		saveschoolinfo.click();
	}
	
	public void ElderclassFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 68, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 68, 3));

		saveschoolinfo.click();
	}
	
	public void ElderMonthlyclassFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 74, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 74, 3));

		saveschoolinfo.click();
	}
	
	public void youngerMonthlyclassFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 76, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 76, 3));

		saveschoolinfo.click();
	}
	

	public void EnterClassToVerifyDeleteAllFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 87, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 87, 3));

		saveschoolinfo.click();
	}
	
	public void EnterClassToVerifyEditable() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 93, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 93, 3));

		saveschoolinfo.click();
	}
	
	public void EnterClassToVerifyNonEditable() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 97, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 97, 3));

		saveschoolinfo.click();
	}
	
	public void youngerClassFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 70, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 70, 3));

		saveschoolinfo.click();
	}
	
	public void genderFemaleYearlyFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 52, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 52, 3));

		saveschoolinfo.click();
	}
	
	public void genderFemaleOneTimeFee() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 46, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 46, 3));

		saveschoolinfo.click();
	}
	
	public void preRequisteShoolInfo() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 20, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 20, 3));

		saveschoolinfo.click();
	}
	
	public void preRequistePerFamilyYrShoolInfo() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 26, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 26, 3));

		saveschoolinfo.click();
	}
	
	
	public void PerFamilyOneTimeFeeShoolInfo() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 22, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 22, 3));

		saveschoolinfo.click();
	}
	
	public void PerFamilyYearlyFeeShoolInfo() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 28, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 28, 3));

		saveschoolinfo.click();
	}
	
	public void PerFamilyMonthlyFeeShoolInfo() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText(excelutil.getData(38, 34, 5));

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText(excelutil.getData(38, 34, 3));

		saveschoolinfo.click();
	}

	public void feeinfo() throws InterruptedException {

		try {

			int t = getDriver().findElements(By.xpath("//*[contains(@class,'Required morecurrent')]")).size();

			for (int i = 0; i < t; i++) {
				getDriver().findElement(By.xpath("(//*[contains(@class,'Required morecurrent')])[" + (i + 1) + "]"))
						.click();
				
				getDriver().findElement(By
					.xpath("//td[@class='today disabled day']/following-sibling::td[1]"))
					.click();
			}
			
		}

//				String date = excelutil.getData(4, 1, 5);
//				String monthyear, day;
//				String dateArray[] = date.split("-");
//				day = dateArray[0];
//				monthyear = dateArray[1] + " " + dateArray[2];
//				while (true) {
//
//					String text = getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[2]"))
//							.getText();
//					System.out.println(text.equals(monthyear));
//					if (text.equals(monthyear)) {
//						break;
//					} else {
//
//						getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[3]")).click();
//					}
//				}
//
//				getDriver().findElement(By
//						.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
//								+ day + "] "))
//						.click();
//			}
//
//		}
//
		catch (Exception e) {
		System.out.println("Due date is not Available");
	}

		try {
			feecomments.clear();
			feecomments.sendKeys(excelutil.getData(4, 1, 8));
		} catch (Exception e) {
			System.out.println("FeeComments is not Available");
		}
		
		
		WebElementUtils.scrolltoview(feeinfosave);
		feeinfosave.click();

		try {

			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript("arguments[0].click()", ConfirmBtn);
		}

		catch (Exception e) {

			System.out.println("No edit happens");
		}

	}
	
	@FindBy(xpath="//a[text()='View Profile']")
	WebElement viewProfile;	
	
	@FindBy(xpath="//*[contains(text(),'Fee Information')]")
	WebElement FeeInfoHeading;	
	
	
	
	public void verifyFeeInStudentProfile() throws InterruptedException{
		viewProfile.click();
		
		WebElementUtils.scrolltoview(FeeInfoHeading);
		
		boolean getElement = getDriver().findElements(By.xpath("//*[normalize-space(text())='"+ excelutil.getData(38, 1, 0) + " :']")).size()!= 0;
		
		Assert.assertEquals(true, getElement);
		
		Thread.sleep(3000);
		
		getDriver().navigate().back();
		
}

	public void enterswdetails() throws InterruptedException {
		
		Thread.sleep(2000);
		
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");
		
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", textsocialworker);
		
		WebElementUtils.scrolltoview(textsocialworker);

		textsocialworker.sendKeys(excelutil.getData(4, 1, 9));
		Thread.sleep(3000);
		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("window.scrollBy(0,1000)");
		textsocialworker.sendKeys(Keys.ARROW_DOWN);
		textsocialworker.sendKeys(Keys.ENTER);

		comments.sendKeys(excelutil.getData(4, 1, 10));
		frmapprovalstudent.click();
	}
	
public void perFamilyenterswdetails() throws InterruptedException {
		
		Thread.sleep(2000);
		
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");
		
//		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
//		jse.executeScript("arguments[0].click()", SocialWorker);
		
		Select selSw = new Select(SocialWorker);
		selSw.selectByVisibleText(excelutil.getData(38, 22, 7));
		
		comments.sendKeys(excelutil.getData(4, 1, 10));
		frmapprovalstudent.click();
	}

	public void enterswdetailsforcscresumbission() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", textsocialworker);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		textsocialworker.sendKeys(excelutil.getData(4, 1, 9));
		Thread.sleep(3000);
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");
		textsocialworker.sendKeys(Keys.ARROW_DOWN);
		textsocialworker.sendKeys(Keys.ENTER);

		comments.sendKeys(excelutil.getData(4, 1, 10));
		htsendclarification.click();
	}

	public void swapprove() throws InterruptedException { // for resubmission
															// approval
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()", comments);
		comments.sendKeys(excelutil.getData(4, 1, 10));
		frmapprovalstudent.click();
	}

	public void headteachersendforclarification() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", textsocialworker);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		textsocialworker.sendKeys(excelutil.getData(4, 1, 9));
		Thread.sleep(3000);
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");
		textsocialworker.sendKeys(Keys.ARROW_DOWN);
		textsocialworker.sendKeys(Keys.ENTER);
		comments.sendKeys(excelutil.getData(4, 1, 10));
		sendforclarification.click();
		menu.click();
		logout.click();

	}

	public void headteacherfinalapprovalpage() throws InterruptedException {
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()", comments);
		comments.sendKeys(excelutil.getData(4, 1, 10));
		frmapprovalstudent.click();
		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].scrollIntoView()", CMF_ID);
		
		BaseClass.cmfID = CMF_ID.getText();
		
		

	}

	public void headteacherapprovaldenied() throws InterruptedException {
		comments.sendKeys(excelutil.getData(4, 1, 10));
		frmdeniedstudent.click();
		Thread.sleep(2000);
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
	}

	public void cscapprovaldenied() throws InterruptedException {
		comments.sendKeys(excelutil.getData(4, 1, 10));
		cscdeniedbutton.click();
		Thread.sleep(2000);
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
	}

	public void csmapprovaldenied() throws InterruptedException {
		comments.sendKeys(excelutil.getData(4, 1, 10));
		csmdeniedbutton.click();
		Thread.sleep(2000);
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
	}

	public void swneedmoreinformation() throws InterruptedException {

		Thread.sleep(3000);
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(swmoreclarificationlink);

		WebElementUtils.scrolltoview(swmoreclarificationlink);
	
		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].click()", swmoreclarificationlink);

	}

	public void schoolinforesubmission() throws InterruptedException {

		Select selectclass = new Select(enterclass);

		selectclass.selectByVisibleText("Pre Primary 1");

		Select selectsection = new Select(entersection);

		selectsection.selectByVisibleText("Blue");

		saveschoolinfo.click();

	}

	public void swresubmission() throws InterruptedException {

		comments.sendKeys(excelutil.getData(4, 1, 10));
		swsendclarification.click();

	}

	public void headteacheraftergettinginformationapprovallink() throws InterruptedException {
		
		Thread.sleep(3000);
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(afterreceivedinformation);

		WebElementUtils.scrolltoview(afterreceivedinformation);
	
		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].click()", afterreceivedinformation);

	}

	public void cscneedmoreinformation() throws InterruptedException {
		comments.sendKeys(excelutil.getData(4, 1, 10));
		Thread.sleep(2000);
		cscsendclarification.click();
	}

	public void cscclicksreceivedmoreinformationlink() throws InterruptedException {
		
		Thread.sleep(3000);
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(receivedmoreinfofromhtlink);

		WebElementUtils.scrolltoview(receivedmoreinfofromhtlink);

		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].click()", receivedmoreinfofromhtlink);

	}

	public void htclarificationlink() throws InterruptedException { 
		
		Thread.sleep(3000);
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(htmoreclarificationlink);

		WebElementUtils.scrolltoview(htmoreclarificationlink);
		
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].click()", htmoreclarificationlink);

	}

	public void csmneedmoreinformation() throws InterruptedException {
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()", comments);
		comments.sendKeys(excelutil.getData(4, 1, 10));
		cscsendclarification.click();

	}

	// when csm click on send for clarification login as csc and click the link

	public void studentrecruitmentneedmoreclarification() throws InterruptedException {
		
		Thread.sleep(3000);
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(studentrecruitmentneedmoreinformation);

		WebElementUtils.scrolltoview(studentrecruitmentneedmoreinformation);

		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].click()", studentrecruitmentneedmoreinformation);
	}

	public void csmsendclarificationbutton() throws InterruptedException {

		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");
		comments.sendKeys(excelutil.getData(4, 1, 10));
		csmsendclarification.click();
	}

	// csmreceivedmoreinformationlink;

	public void csmreceivemoreinformationlink() throws InterruptedException {
		
		Thread.sleep(3000);
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(csmreceivedmoreinformationlink);

		WebElementUtils.scrolltoview(csmreceivedmoreinformationlink);

		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].click()", csmreceivedmoreinformationlink);

	}

	public void csmresubmissionapproval() throws InterruptedException {

		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");
		comments.sendKeys(excelutil.getData(4, 1, 10));
		csmresubmissionapprovalbutton.click();
	}

	// csc send for clarification to social worker

	public void cscsendclarificationtosw() throws InterruptedException {

		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		comments.sendKeys(excelutil.getData(4, 1, 10));
		cscsendclarificationtosw.click();

	}

	// swneedmoreinformationlink

	public void swneedmoreinformationlink() throws InterruptedException {
		
		
		Thread.sleep(3000);
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(swneedmoreinformationlink);

		WebElementUtils.scrolltoview(swneedmoreinformationlink);

		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].click()", swneedmoreinformationlink);

		Thread.sleep(2000);

		

	}

	// enter the comments and click send clarification button

	public void swswndclarification() throws InterruptedException {

		Thread.sleep(1000);

		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()", comments);

		comments.sendKeys(excelutil.getData(4, 1, 10));

		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].click()", swsendclarificationbutton);

		// swsendclarificationbutton.click();

	}

	// login as csc and click student received more information link

	public void cscreceivedmoreinformationlink() throws InterruptedException {
		
		Thread.sleep(3000);
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(cscreceivedmoreinformationlink);

		WebElementUtils.scrolltoview(cscreceivedmoreinformationlink);

		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].click()", cscreceivedmoreinformationlink);

	}

	// got approval by csc once received more information from sw

	public void appfromcscafterreceivedmoreinfofromsw() throws InterruptedException {

		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");
		comments.sendKeys(excelutil.getData(4, 1, 10));
		frmapprovalstudent.click();

	}

	public void csmapprovalpage1() throws InterruptedException {
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");
		comments.sendKeys(excelutil.getData(4, 1, 10));
		frmapprovalstudent.click();
	}

	public void csmsendclarificationtosw() throws InterruptedException {

		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		comments.sendKeys(excelutil.getData(4, 1, 10));
		csmsendclarificationtosw.click();

	}
	// csmreceivedmoreinformationlink

	public void csmreceivedmoreinformationlink() throws InterruptedException {
		
		Thread.sleep(3000);
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(csmreceivemoreinfolink1);

		WebElementUtils.scrolltoview(csmreceivemoreinfolink1);

		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].click()", csmreceivemoreinfolink1);

	}
	
	

	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		menu.click();
		logout.click();
	}
	
	

}
