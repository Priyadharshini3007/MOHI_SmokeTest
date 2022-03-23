package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.ExcelHelper;
import com.automation.utils.WebElementUtils;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;
import static com.automation.utils.WebElementUtils.scrollIntoView;
import static com.automation.utils.WebElementUtils.waitForPageToLoad;
import static com.automation.utils.WebElementUtils.dateFn;
import static com.automation.utils.WebElementUtils.selectFn;
import static com.automation.utils.WebElementUtils.elementVisible;

public class PullOutProcess {

	public PullOutProcess(){
		PageFactory.initElements(getDriver(), this);		
	}

	@FindBy(id="ddlStudentType")
	WebElement StudentType;

	@FindBy(id="Filter_CMFID")
	WebElement CMFIdField;

	@FindBy(className="dataTables_empty")
	WebElement emptyRecord;

	@FindBy(xpath="//a[@title='Pull out this student/View Pull out workFlow' or @title='Approve/Deny student pull out request']")
	WebElement pullOutIcon;

	@FindBy(xpath="//a[@title='View Student Profile']")
	WebElement studentProfile;

	@FindBy(xpath="//button[@value='GO']")
	WebElement SWsubmitButton;

	@FindBy(id="StartDate")
	WebElement pullOutDate;

	@FindBy(id="Comments")
	WebElement pullOutReason;

	@FindBy(xpath="//button[@value='Submit']")
	WebElement pullOutSubmit;

	@FindBy(xpath="//button[@value='Approve']")
	WebElement pullOutApprove;

	@FindBy(xpath="//button[@value='Need More Info']")
	WebElement pullOutNeedInfo;

	@FindBy(xpath="//button[@value='Need More Info From SW']")
	WebElement pullOutNeedInfoFrmSW;

	@FindBy(xpath="//button[@value='Deny']")
	WebElement pullOutDenial;

	@FindBy(xpath="//button[@value='Send Info']")
	WebElement pullOutSendInfo;

	@FindBy(xpath="//a[contains(@href,'Filterstring=PullOut_Appr')]")
	WebElement approvalAlert;

	@FindBy(xpath="//a[contains(@href,'Filterstring=PullOut_Send_Info')]")
	WebElement receivedInfoAlert;

	@FindBy(xpath="//a[contains(@href,'Filterstring=PullOut_Need_Info')]")
	WebElement needInfoAlert;

	@FindBy(xpath="//a[contains(@href,'Filterstring=PullOut_Deny')]")
	WebElement deniedSwAlert;

	@FindBy(xpath="//a[@id='userDropdownMenuLink']")
	WebElement logoutProfile;

	@FindBy(linkText="Log Out")
	WebElement logOut;

	@FindBy(xpath="//a[text()='View Profile']")
	WebElement viewProfile;

	@FindBy(xpath="//a[text()='Inactive']")
	WebElement inActive;

	@FindBy(id="Filter_Ststus")
	WebElement statusFilter;

	@FindBy(id="btnSearch")
	WebElement search;

	@FindBy(xpath="//td[contains(text(),'CMF ID')]//following::td[1]")
	WebElement CMFID;
	
	@FindBy(xpath = "//*[@title='Expand Student']")
	WebElement ExpandStudent;

	public void searchBoxFn() throws InterruptedException{	
		String CMF_ID = ExcelHelper.readData(".\\ExcelFiles\\Pullout & Re-Admission.xlsx","PullOut",1,0);
		CMFIdField.sendKeys(CMF_ID);
		CMFIdField.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
	}

	public void pullOutInitiateIconFn() throws InterruptedException{
		Thread.sleep(2000);
		webDriverclick(pullOutIcon);
	}

	public void StudentTypeFn() throws InterruptedException{
		String studentTypeValue = "Attendance Chart Poor";
		selectFn(StudentType,studentTypeValue);
		SWsubmitButton.click();
		Thread.sleep(2000);
		String activeStatus = "Active";
		selectFn(statusFilter,activeStatus);
		webDriverclick(search);
	}

	public void pullOutIconFn() throws InterruptedException{
		webDriverclick(pullOutIcon);
	}

	public void dateclickFn() throws InterruptedException{
		try{
			dateFn(pullOutDate);
		}
		catch(Exception c){
			System.out.println("Pull out is already initiated - Date field is not available");
		}		
	}

	public void pullOutReason() throws InterruptedException{
		Thread.sleep(2000);
		try{
			WebElementUtils.scrollIntoView(pullOutReason);
			pullOutReason.sendKeys("Test Automation");
		}
		catch(Exception e){
			System.out.println("Pull out is already initiated - Comments not available");
		}	
	}

	public void pullOutSubmit() throws InterruptedException{
		webDriverclick(pullOutSubmit);
		ExcelHelper.clearData(".\\ExcelFiles\\Pullout & Re-Admission.xlsx","PullOut",1,0);
		String cmfID = CMFID.getText();
		ExcelHelper.writeData(".\\ExcelFiles\\Pullout & Re-Admission.xlsx","PullOut",1,0,cmfID);
	}

	public void dashboardAlert(WebElement alert){
		scrollIntoView(alert);
		waitForPageToLoad();
		try{
			webDriverclick(alert);
		}
		catch(Exception e){
			System.out.println("Alert is not available");
			Assert.assertTrue(false);
		}
	}

	public void approvalAlertFn() {
		webDriverclick(ExpandStudent);
		WebElementUtils.waitForVisible(approvalAlert);
		WebElementUtils.scrolltoview(approvalAlert);
		dashboardAlert(approvalAlert);
	}

	public void deniedAlertFn(){
		
		webDriverclick(ExpandStudent);
		WebElementUtils.waitForVisible(deniedSwAlert);
		WebElementUtils.scrolltoview(deniedSwAlert);
	
		dashboardAlert(deniedSwAlert);
	}

	public void needInfoAlertFn(){
		
		webDriverclick(ExpandStudent);
		WebElementUtils.waitForVisible(needInfoAlert);
		WebElementUtils.scrolltoview(needInfoAlert);
		
		dashboardAlert(needInfoAlert);
	}

	public void receivedInfoAlertFn(){
		
		webDriverclick(ExpandStudent);
		WebElementUtils.waitForVisible(receivedInfoAlert);
		WebElementUtils.scrolltoview(receivedInfoAlert);
		
		dashboardAlert(receivedInfoAlert);
	}

	public void pullOutApproveBtn(){
		webDriverclick(pullOutApprove);
	}

	public void pullOutDenialBtn(){
		webDriverclick(pullOutDenial);
	}

	public void DenialConfirmation(){
		try{
			Alert confirmAlert = getDriver().switchTo().alert();
			confirmAlert.accept();
		}
		catch(Exception e){
			System.out.println("No confirmation alert for denial");
		}
	}

	public void pullOutNeedInfoBtn(){
		webDriverclick(pullOutNeedInfo);
	}

	public void pullOutNeedInfoFrmSWBtn(){
		webDriverclick(pullOutNeedInfoFrmSW);
	}

	public void pullOutSendClarFnBtn(){
		webDriverclick(pullOutSendInfo);
	}

	public void logOutFn(){
		logoutProfile.click();
		logOut.click();
	}

	public void statusCheck(){
		webDriverclick(viewProfile);
		elementVisible(inActive);
	}

}
