package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffAge {

	public StaffAge(){
        PageFactory.initElements(getDriver(), this);
        }
	
	@FindBy(id="DivStaffAgeDA")
	WebElement calendar;
	
	@FindBy(id="btnDivStaffAge")
	WebElement view;
	
	@FindBy(xpath="//a[@id='ReportViewer1_ctl05_ctl04_ctl00_ButtonLink']")
	WebElement download;
	
	@FindBy(xpath="//a[@title='Excel']")
	WebElement excel;
	
	@FindBy(tagName="iframe")
    WebElement empFrame;
	
	@FindBy(xpath="//a[@alt='Export drop down menu']")
	WebElement fvexportdopdownmenu;
	
	public void calendarFn() throws InterruptedException{
		getDriver().switchTo().frame(empFrame);
		calendar.sendKeys("31/08/2020");
		view.click();
		Thread.sleep(3000);
		webDriverclick(fvexportdopdownmenu);
		Thread.sleep(2000);
		webDriverclick(excel);
		getDriver().switchTo().defaultContent();
	}

}
