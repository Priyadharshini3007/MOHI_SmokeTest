package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class FinancialSummaryReport {
	
JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public FinancialSummaryReport()	{
		
		PageFactory.initElements(getDriver(), this);

	}
	
	
	////////////////////////////////////////////FinancialSummaryReport Elements/////////////////////////////////////
	
	
	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(linkText = "Financial Summary")
	WebElement FinancialSummarysubmenu;
	
	@FindBy(xpath = "//*[@src='/ReportViewerWebForm.aspx']")
	WebElement fvviewreportframe;
	
	@FindBy(xpath = "//select[@id='FSType']")
	WebElement FSType;
	
	@FindBy(xpath = "//select[@id='FSCenter']")
	WebElement FSCenter;
	
	@FindBy(xpath = "//select[@id='FSMonth']")
	WebElement FSMonth;
	
	@FindBy(xpath = "//select[@id='FSYear']")
	WebElement FSYear;
	
	@FindBy(xpath = "//select[@id='FSPS']")
	WebElement FSPaymentStatus;
	
	@FindBy(xpath = "//*[@id='btnFinancialSummary']")
	WebElement FSViewReportbutton;
	
	@FindBy(xpath = "(//*[@alt='Export drop down menu'])[1]")
	WebElement fvexportdopdownmenu;

	@FindBy(xpath = "//*[@title='Excel']")
	WebElement excel;

	@FindBy(xpath = "//*[@title='PDF']")
	WebElement pdf;

	@FindBy(xpath = "//*[@title='Word']")
	WebElement word;
	
	
	
	public void financialSummaryReportMenu() throws InterruptedException {

		Reportsmenu.click();
		FinancialSummarysubmenu.click();

	}
	
	
	public void filterFinancialSummaryReport() throws InterruptedException {

		 getDriver().switchTo().frame(fvviewreportframe);

		Thread.sleep(2000);

		Select selFSType = new Select(FSType);
		selFSType.selectByVisibleText(excelutil.getData(23, 1, 0));

		Thread.sleep(2000);
		
		if (excelutil.getData(23, 1, 0).equals("By Center"))
		{

		Select selFSCenter = new Select(FSCenter);
		selFSCenter.selectByVisibleText(excelutil.getData(23, 1, 1));

		Thread.sleep(2000);
		
		}
		
		if (excelutil.getData(23, 1, 0).equals("By Month"))
		{

		Select selFSMonth = new Select(FSMonth);
		selFSMonth.selectByVisibleText(excelutil.getData(23, 1, 2));

		Thread.sleep(2000);
		
		}

		Select selFSYear = new Select(FSYear);
		selFSYear.selectByVisibleText(excelutil.getData(23, 1, 3));

		Thread.sleep(2000);

		Select selFSPaymentStatus = new Select(FSPaymentStatus);
		selFSPaymentStatus.selectByVisibleText(excelutil.getData(23, 1, 4));

	}

	public void viewFinancialSummaryReportButton() throws InterruptedException {

		FSViewReportbutton.click();
		Thread.sleep(3000);
	}
	
	public void FinancialSummaryReportDownload() throws InterruptedException {

		Thread.sleep(4000);

		JavascriptExecutor jse = (JavascriptExecutor)  getDriver();
		jse.executeScript("arguments[0].click()", fvexportdopdownmenu);

		
		Thread.sleep(4000);

		JavascriptExecutor jse1 = (JavascriptExecutor)  getDriver();
		jse1.executeScript("arguments[0].click()", excel);

		Thread.sleep(4000);

		JavascriptExecutor jse2 = (JavascriptExecutor)  getDriver();
		jse2.executeScript("arguments[0].click()", pdf);
		Thread.sleep(4000);

		JavascriptExecutor jse3 = (JavascriptExecutor)  getDriver();
		jse3.executeScript("arguments[0].click()", word);
		
		
		 getDriver().switchTo().defaultContent();
	}

	
	
}
