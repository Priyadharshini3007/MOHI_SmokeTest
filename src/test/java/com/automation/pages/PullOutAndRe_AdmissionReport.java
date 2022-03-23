package com.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;
import static com.automation.utils.DriverUtils.getDriver;
public class PullOutAndRe_AdmissionReport {

JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public PullOutAndRe_AdmissionReport()	{
		
		PageFactory.initElements(getDriver(), this);

	}


	////////////////////////////////// PullOutAndRe_AdmissionReport
	////////////////////////////////// elements/////////////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(linkText = "Pull out Report")
	WebElement PullOutReportsubmenu;

	@FindBy(xpath = "//*[@src='/ReportViewerWebForm.aspx']")
	WebElement fvviewreportframe;

	@FindBy(xpath = "//select[@id='DivStudentPulloutT']")
	WebElement PullOutType;

	@FindBy(xpath = "//select[@id='DivStudentPulloutS']")
	WebElement PullOutStatus;

	@FindBy(xpath = "//select[@id='DivStudentPulloutC']")
	WebElement PullOutCenter;

	@FindBy(xpath = "//select[@id='DivStudentPulloutWFS']")
	WebElement PullOutWorkFlowStep;

	@FindBy(xpath = "//*[@id='DivStudentPulloutFD']")
	WebElement PullOutFromDate;

	@FindBy(xpath = "//*[@id='DivStudentPulloutTD']")
	WebElement PullOutToDate;

	@FindBy(xpath = "//*[@id='DivStudentPulloutSc']")
	WebElement PullOutSchool;

	@FindBy(xpath = "//*[@id='btnDivStudentPullout']")
	WebElement PullOutviewReport;
	
	@FindBy(xpath = "(//*[@alt='Export drop down menu'])[1]")
	WebElement fvexportdopdownmenu;

	@FindBy(xpath = "//*[@title='Excel']")
	WebElement excel;

	@FindBy(xpath = "//*[@title='PDF']")
	WebElement pdf;

	@FindBy(xpath = "//*[@title='Word']")
	WebElement word;
	

	public void PullOutReportMenu() throws InterruptedException {

		Reportsmenu.click();
		PullOutReportsubmenu.click();

	}

	public void filterPullOutReport() throws InterruptedException {

		getDriver().switchTo().frame(fvviewreportframe);

		Thread.sleep(2000);

		Select selPullOutType = new Select(PullOutType);
		selPullOutType.selectByVisibleText(excelutil.getData(22, 1, 0));

		Thread.sleep(2000);
		
	}
	
	public void ReAdmissionReport() throws InterruptedException {

		getDriver().switchTo().frame(fvviewreportframe);

		Thread.sleep(2000);

		Select selPullOutType = new Select(PullOutType);
		selPullOutType.selectByVisibleText(excelutil.getData(22, 2, 0));

		Thread.sleep(2000);
		
	}
	
	public void DisabledReport() throws InterruptedException {

		getDriver().switchTo().frame(fvviewreportframe);

		Thread.sleep(2000);

		Select selPullOutType = new Select(PullOutType);
		selPullOutType.selectByVisibleText(excelutil.getData(22, 3, 0));

		Thread.sleep(2000);
		
	}
	
	public void filterPullOut() throws InterruptedException {

		Select selPullOutStatus = new Select(PullOutStatus);
		selPullOutStatus.selectByVisibleText(excelutil.getData(22, 1, 1));

		Thread.sleep(2000);

		Select selPullOutCenter = new Select(PullOutCenter);
		selPullOutCenter.selectByVisibleText(excelutil.getData(22, 1, 2));

		Thread.sleep(2000);
		
		/* This drop dropdown is removed*/

		//Select selPullOutWorkFlowStep = new Select(PullOutWorkFlowStep);
		//selPullOutWorkFlowStep.selectByVisibleText(excelutil.getData(22, 1, 3));

		Thread.sleep(2000);

		PullOutFromDate.sendKeys(excelutil.getData(22, 1, 4));

		Thread.sleep(2000);

		PullOutToDate.sendKeys(excelutil.getData(22, 1, 5));

		Thread.sleep(2000);

		Select selPullOutSchool = new Select(PullOutSchool);
		selPullOutSchool.selectByVisibleText(excelutil.getData(22, 1, 6));

	}
	
	public void DisablefilterPullOut() throws InterruptedException {

		Select selPullOutStatus = new Select(PullOutStatus);
		selPullOutStatus.selectByVisibleText(excelutil.getData(22, 1, 6));

		Thread.sleep(2000);

		Select selPullOutCenter = new Select(PullOutCenter);
		selPullOutCenter.selectByVisibleText(excelutil.getData(22, 1, 2));

		Thread.sleep(2000);
		
		/* This drop dropdown is removed*/

		//Select selPullOutWorkFlowStep = new Select(PullOutWorkFlowStep);
		//selPullOutWorkFlowStep.selectByVisibleText(excelutil.getData(22, 1, 3));

		Thread.sleep(2000);

		PullOutFromDate.sendKeys(excelutil.getData(22, 1, 4));

		Thread.sleep(2000);

		PullOutToDate.sendKeys(excelutil.getData(22, 1, 5));

		Thread.sleep(2000);

		Select selPullOutSchool = new Select(PullOutSchool);
		selPullOutSchool.selectByVisibleText(excelutil.getData(22, 1, 6));

	}
	
	
	

	public void viewPullOutReport() throws InterruptedException {

		PullOutviewReport.click();
		Thread.sleep(3000);
	}
	
	public void pullOutReportDownload() throws InterruptedException {

		Thread.sleep(4000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", fvexportdopdownmenu);

		
		Thread.sleep(4000);

		JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
		jse1.executeScript("arguments[0].click()", excel);

		Thread.sleep(4000);

		JavascriptExecutor jse2 = (JavascriptExecutor) getDriver();
		jse2.executeScript("arguments[0].click()", pdf);
		Thread.sleep(4000);

		JavascriptExecutor jse3 = (JavascriptExecutor) getDriver();
		jse3.executeScript("arguments[0].click()", word);
		
		
		getDriver().switchTo().defaultContent();
	}


}
