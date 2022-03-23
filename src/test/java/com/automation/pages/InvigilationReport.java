package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class InvigilationReport {

	
JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public InvigilationReport()	{
		
		PageFactory.initElements(getDriver(), this);

	}
	/////////////////////////////////////// Invigilation report
	/////////////////////////////////////// elements//////////////////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(linkText = "Invigilation")
	WebElement Invigilationmenu;

	@FindBy(xpath = "//input[@id='Filter_ExamName']")
	WebElement searchexamname;

	@FindBy(xpath = "//button[@id='btnSearch']")
	WebElement searchbutton;

	@FindBy(xpath = "(//*[@title='Click here to edit this Invigilator Assignment'])[1]")
	WebElement editbutton;

	@FindBy(xpath = "//select[@id='ddlSchools']")
	WebElement schoolname;

	@FindBy(xpath = "//select[@id='ddlClasses']")
	WebElement classnme;

	@FindBy(xpath = "//select[@id='ddlSections']")
	WebElement classsec;

	@FindBy(xpath = "//select[@id='ddlTerms']")
	WebElement classterm;

	@FindBy(xpath = "//select[@id='ddlExams']")
	WebElement exam;

	@FindBy(xpath = "//input[@id='TxtInvigilatorName']")
	WebElement srchinvigilator;

	@FindBy(xpath = "//*[@id='InvigilatorExamSubject'] //*[@id='InvigilatorSubjectDelete_0']")
	WebElement deletessubject;

	@FindBy(xpath = "//*[@id='AddExamSubject']")
	WebElement addexamsub;

	@FindBy(xpath = "//*[@id='InvigilatorSubjectList_1__SubjectID']")
	WebElement selsub;

	@FindBy(xpath = "//input[@id='InvigilatorSubjectList_1__ExaminationDate']")
	WebElement examdate;

	@FindBy(xpath = "//*[@id='InvigilatorSubjectSave_1']")
	WebElement subsave;

	@FindBy(xpath = "//*[@value='Save']")
	WebElement save;

	@FindBy(xpath = "//button[contains(@class,'returntolist')]")
	WebElement Returntolist;
	
	@FindBy(xpath = "(//a[@title='Click here to delete this Invigilator Assignment'])[1]")
	WebElement deletebutton;
	
	@FindBy(linkText = "Dashboard")
	WebElement Dashboard;
	
	@FindBy(linkText = "My Dashboard")
	WebElement MyDashboard;
	
	@FindBy(linkText = "Invigilation assignment for this week")
	WebElement invigilationforthisweek;	
	
	
	@FindBy(linkText = "Invigilation assignment for this month")
	WebElement invigilationforthismonth;
	

	public void InvigilationReportmenu() throws InterruptedException {
		Thread.sleep(2000);
		Reportsmenu.click();
		Invigilationmenu.click();

	}

	public void searchExaminvigilator() throws InterruptedException {
		Thread.sleep(2000);

		searchexamname.sendKeys(excelutil.getData(13, 1, 0));

		searchbutton.click();

	}

	public void editinvigilator() throws InterruptedException {

		editbutton.click();

		Select selschname = new Select(schoolname);
		selschname.selectByVisibleText(excelutil.getData(13, 1, 1));

		Select selclsname = new Select(classnme);
		selclsname.selectByVisibleText(excelutil.getData(13, 1, 2));

		Select selclssec = new Select(classsec);
		selclssec.selectByVisibleText(excelutil.getData(13, 1, 3));

		Select selclsterm = new Select(classterm);
		selclsterm.selectByVisibleText(excelutil.getData(13, 1, 4));

		Select selexam = new Select(exam);
		selexam.selectByVisibleText(excelutil.getData(13, 1, 5));

		
		srchinvigilator.sendKeys(excelutil.getData(13, 1, 6));
		Thread.sleep(2000);
		srchinvigilator.sendKeys(Keys.ARROW_DOWN);
		srchinvigilator.sendKeys(Keys.ENTER);
		
		//deletessubject.click();
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",deletessubject);
		Thread.sleep(2000);
		
		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,250)");
		
		JavascriptExecutor jse1 = (JavascriptExecutor)getDriver();
		jse1.executeScript("arguments[0].click()",addexamsub);
		//addexamsub.click();

		Select selsubj = new Select(selsub);
		selsubj.selectByVisibleText(excelutil.getData(13, 1, 7));

		examdate.sendKeys(excelutil.getData(13, 1, 8));

		subsave.click();
		
		save.click();

		Returntolist.click();
		
		Dashboard.click();

		MyDashboard.click();
		
		invigilationforthisweek.click();
		
		Dashboard.click();

		MyDashboard.click();
		
		invigilationforthismonth.click();
		
	}
	
	public void deleteinvigilation() throws InterruptedException {
		deletebutton.click();
		 isAlertPresent();

	}
	public boolean isAlertPresent() {
		try {
			getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			Alert a = getDriver().switchTo().alert();
			a.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		} finally {
			getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	}

}
