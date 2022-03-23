package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.DwnldfileVerificatnFn;
import static com.automation.utils.WebElementUtils.webDriverclick;
import static com.automation.utils.WebElementUtils.selectFn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;

public class StaffPromotionReport {
	
	public StaffPromotionReport(){

		PageFactory.initElements(getDriver(), this);		
	}
	
	@FindBy(css="select#ReportTypeID")
	WebElement ReportTypeField;
	
	@FindBy(xpath="//a[@title='Export drop down menu']")
	WebElement download;
	
	@FindBy(xpath="//a[@title='Excel']")
	WebElement excel;
	
	@FindBy(id="SPFromDate")
	WebElement fromDate;
	
	@FindBy(xpath="//input[@name='SPToDate']")
	WebElement toDate;
	
	@FindBy(id="btnStaffPromotionReport")
	WebElement viewReport;
	
	@FindBy(tagName="iframe")
    WebElement empFrame;
		
	public void reportTypefn(String reportType){
		getDriver().switchTo().frame(empFrame);
		selectFn(ReportTypeField, reportType);
	}
	
	public void dateSelectionFn(String FrmDate,String ToDate) throws Exception{
		Thread.sleep(3000);
		fromDate.sendKeys(FrmDate);
		toDate.sendKeys(ToDate);
	}
	
	public void viewReportFn() throws InterruptedException{
		Thread.sleep(2000);
		STAFFPROMOTION.isDisplayed();
		viewReport.click();
	}
	
//	@FindBy(xpath = "(//*[@alt='Export drop down menu'])[1]")
	@FindBy(xpath="//a[@alt='Export drop down menu']")
	WebElement fvexportdopdownmenu;
	@FindBy(xpath = "//div[.='STAFF PROMOTION REPORT']")
	WebElement STAFFPROMOTION;
	
	
	public void downloadFn() throws InterruptedException{
		
		
		webDriverclick(fvexportdopdownmenu);
		Thread.sleep(2000);
		
		webDriverclick(excel);
		getDriver().switchTo().defaultContent();
	}
	
	public void DwnldTempVerificatnFn(String filename) throws InterruptedException{
		DwnldfileVerificatnFn(filename);
	}
	
}
