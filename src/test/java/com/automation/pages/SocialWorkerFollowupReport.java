package com.automation.pages;


import java.util.ArrayList;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;
import static com.automation.utils.DriverUtils.getDriver;
public class SocialWorkerFollowupReport {


JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public SocialWorkerFollowupReport()	{
		
		PageFactory.initElements(getDriver(), this);

	}

	////////////////////////////////// Social worker followup report
	////////////////////////////////// elements/////////////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(linkText = "Social Worker Follow-up")
	WebElement socialworkerfollowupsubmenu;

	@FindBy(xpath = "//select[@id='FollowupReasonID']")
	WebElement Followupreason;

	@FindBy(xpath = "//input[@id='FromDate']")
	WebElement FromDateReport;

	@FindBy(xpath = "//input[@id='ToDate']")
	WebElement ToDateReport;

	@FindBy(xpath = "//select[@id='Filter_IsFollowedup']")
	WebElement Followupstatus;

	@FindBy(xpath = "//button[@value='GO']")
	WebElement GoButton;

	@FindBy(xpath = "//input[@id='Filter_CMFID']")
	WebElement CMFID;

	@FindBy(xpath = "(//*[@title='Follow-up pending' and @class = 'FollowupEdit'])[1]")
	WebElement FollowUpPendingIcon;

	@FindBy(xpath = "//input[@id='txtFollowupDate']")
	WebElement FollowUpDate;

	@FindBy(xpath = "//*[@id='txtFollowupReason']")
	WebElement FollowUpReasontext;

	@FindBy(xpath = "//*[@id='txtResponse']")
	WebElement response;

	@FindBy(xpath = "//*[@id='btnSaveFollowup']")
	WebElement save;

	@FindBy(xpath = "//*[@title='Follow-up completed']")
	WebElement FollowUpCompletedIcon;

	@FindBy(xpath = "//div[contains(@class, 'ui-dialog-buttonset')]//button[contains(@class, 'btn btn-xs ui-button ui-corner-all ui-widget')]")
	WebElement cancelbutton;

	@FindBy(xpath = "//*[@title='View Student Profile']")
	WebElement studentprofileicon;

	@FindBy(xpath = "//*[@title='View Social worker follow-up History']")
	WebElement socialworkerfollowuphistory;

	@FindBy(xpath = "//*[@title='View student in student report']")
	WebElement viewstudentinstudentreport;

	@FindBy(xpath = "//*[@title='View student in parent contribution report']")
	WebElement parentcontributionreport;

	public void socialWorkerFollowuReportmenu() throws InterruptedException {

		Reportsmenu.click();
		socialworkerfollowupsubmenu.click();
	}

	public void socialWorkerFollowupSearch() throws InterruptedException {

		Select selFollowupreason = new Select(Followupreason);
		selFollowupreason.selectByVisibleText(excelutil.getData(20, 1, 0));
		
		FromDateReport.clear();
		FromDateReport.sendKeys(excelutil.getData(20, 1, 1));
		ToDateReport.clear();
		ToDateReport.sendKeys(excelutil.getData(20, 1, 2));

		Select selFollowupstatus = new Select(Followupstatus);
		selFollowupstatus.selectByVisibleText(excelutil.getData(20, 1, 3));

		GoButton.click();

		Thread.sleep(3000);

		CMFID.sendKeys(excelutil.getData(20, 1, 4));

		CMFID.sendKeys(Keys.ENTER);

	}

	public void followUpPendingicon() throws InterruptedException {
		
		ArrayList<WebElement> followuppendingList = new ArrayList<WebElement>(getDriver().findElements(By.xpath("//*[@title='Follow-up pending']")));
		int size =  followuppendingList.size();
		for (int i = 0 ; i < size ; i++) {
		
		Thread.sleep(1000);
		FollowUpPendingIcon.click();
		FollowUpDate.sendKeys(excelutil.getData(20, 1, 5));

		FollowUpReasontext.sendKeys(excelutil.getData(20, 1, 6));

		response.sendKeys(excelutil.getData(20, 1, 7));

		save.click();

		Thread.sleep(2000);

		Alert alert = getDriver().switchTo().alert();
		alert.accept();
			  
		}
		
		
		
		
	}

	public void Followupcompletedicon() throws InterruptedException {

		FollowUpCompletedIcon.click();

		Thread.sleep(2000);

		cancelbutton.click();

	}

	public void studentprofileicon() throws InterruptedException {

		studentprofileicon.click();
		
		ArrayList<String> tabs1 = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs1.get(1));
		Thread.sleep(2000);
		socialworkerfollowuphistory.click();
		String parent = getDriver().getWindowHandle();
		Thread.sleep(3000);
		for (String winHandle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(winHandle); // switch focus to new window
		}
		// String second = driver.getWindowHandle();
		getDriver().close();
		getDriver().switchTo().window(parent);
		getDriver().close();
		getDriver().switchTo().window(tabs1.get(0));

		Thread.sleep(5000);

		

	

	

	}

	public void viewstudentinstudentreport() throws InterruptedException {

		viewstudentinstudentreport.click();
		Thread.sleep(3000);

		ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs2.get(1));
		getDriver().close();
		getDriver().switchTo().window(tabs2.get(0));
	}

	public void parentcontributionicon() throws InterruptedException {

		parentcontributionreport.click();
		Thread.sleep(3000);

		ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs2.get(1));
		getDriver().close();
		getDriver().switchTo().window(tabs2.get(0));

	}

}
