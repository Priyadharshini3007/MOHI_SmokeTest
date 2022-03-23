package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static com.automation.utils.WebElementUtils.selectFn;
import static com.automation.utils.WebElementUtils.dateFn;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.ExcelHelper;
import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class ReadmissionProcess {

	public ReadmissionProcess(){
		PageFactory.initElements(getDriver(), this);		
	}

	@FindBy(id="ddlStudentType")
	WebElement StudentTypeDrp;

	@FindBy(id="Filter_CMFID")
	WebElement CMFIdField;

	@FindBy(className="dataTables_empty")
	WebElement emptyRecord;

	@FindBy(xpath="//button[@value='GO']")
	WebElement SWsubmitButton;

	@FindBy(css="i.fa.fa-retweet")
	WebElement readmissionIcon;

	@FindBy(id="StartDate")
	WebElement readmissionDate;

	@FindBy(id="Comments")
	WebElement readmissionReason;

	@FindBy(xpath="//button[@value='Submit']")
	WebElement readmissionSubmit;

	@FindBy(xpath="//button[@value='Approve']")
	WebElement readmissionApprove;

	@FindBy(xpath="//button[@value='Need More Info']")
	WebElement readmissionNeedInfo;

	@FindBy(xpath="//button[@value='Deny']")
	WebElement readmissionDenial;

	@FindBy(xpath="//button[@value='Send Info']")
	WebElement readmissionSendInfo;

	@FindBy(xpath="//a[contains(@href,'Filterstring=ReAdm_Appr')]")
	WebElement approvalAlert;

	@FindBy(xpath="//a[contains(@href,'Filterstring=ReAdm_Need_Info')]")
	WebElement needInfoAlert;

	@FindBy(xpath="//a[contains(@href,'Filterstring=ReAdm_Send_Info')]")
	WebElement receivedInfoAlert;

	@FindBy(xpath="//a[contains(@href,'Filterstring=ReAdm_Deny')]")
	WebElement deniedSwAlert;

	@FindBy(xpath="//a[@id='userDropdownMenuLink']")
	WebElement logoutProfile;

	@FindBy(linkText="Log Out")
	WebElement logOut;

	@FindBy(xpath="//a[text()='View Profile']")
	WebElement viewProfile;

	@FindBy(xpath="//a[text()='Waiting for CMF Photo Update After Readmission']")
	WebElement status;

	@FindBy(id="ddlClasses")
	WebElement classesField;

	@FindBy(id="ddlSections")
	WebElement sectionsField;

	@FindBy(id="UseOldFeeStructure")
	WebElement feeStructure;

	@FindBy(id="MonthlyFee")
	WebElement monthlyFee;

	@FindBy(id="ExaminationFee")
	WebElement examinationFee;

	@FindBy(id="TransportFee")
	WebElement transportFee;

	@FindBy(xpath="//input[@value='False']")
	WebElement newfeeStructure;
	
	@FindBy(xpath = "//*[@title='Expand Student']")
	WebElement ExpandStudent;
	
	@FindBy(xpath = "//*[normalize-space(text())='Class :']/following-sibling::td[1]")
	WebElement ClassInfo;

	public void newfeeStructurefn(){
		webDriverclick(newfeeStructure);
		try{
			monthlyFee.sendKeys("500");
			examinationFee.sendKeys("200");
			transportFee.sendKeys("300");
		}
		catch(Exception e){
			System.out.println("Fee element is not available");
			Assert.assertTrue(false);
		}
	}

	public void classSectionFn(String classes,String sections){
//		try{
//			selectFn(classesField,classes);
//		}
//		catch(Exception e){
//			System.out.println("Classes are not listed due to bug");
//			Assert.assertTrue(false);
//		}
		try{
			
			JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
			scrolldown1.executeScript("window.scrollBy(0,250)");
			selectFn(sectionsField,sections);
		}
		catch(Exception e){
			System.out.println("Section is not enabled, since it is Non-Mohi School");
		}
	}
	public void StudentTypeFn(){
		String inactive ="Inactive Students";
		selectFn(StudentTypeDrp,inactive);
		SWsubmitButton.click();
	}

	public void searchBoxFn(String CmfID) throws InterruptedException{	
		try{
			if(emptyRecord.isDisplayed()){
				System.out.println("No records matching");
			}
		}
		catch(Exception e){
			System.out.println("Record is available");
			try{
				Thread.sleep(2000);
				CMFIdField.sendKeys(CmfID);
				CMFIdField.sendKeys(Keys.RETURN);
				Thread.sleep(2000);
			}
			catch(Exception s){
				System.out.println("Unable to click item");
			}
		}	
	}

	public void readmissionIconFn() throws InterruptedException {
		iconAvailable(readmissionIcon);

		Thread.sleep(2000);

	}

	public void dateclickFn() throws InterruptedException {

		//dateFn(readmissionDate);
		try{
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(2000);
		
		readmissionDate.click();
		
		String date = ExcelHelper.readData(".\\ExcelFiles\\Pullout & Re-Admission.xlsx","Re-Admission",1,1);
		String monthyear, day;
		String dateArray[] = date.split("-");
		day = dateArray[0];
		monthyear = dateArray[1] + " " + dateArray[2];
		while (true) {

			String text = getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[2]"))
					.getText();
			System.out.println(text.equals(monthyear));
			if (text.equals(monthyear)) {
				break;
			} else {

				getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[3]")).click();
			}
		}

		getDriver().findElement(By
				.xpath("/html/body/div[6]/div[1]/table/tbody/tr[4]/td[4][not(contains(@class, 'disabled')) and text()="
						+ day + "] "))
				.click();
		
	}
		catch(Exception e){			
		System.out.println("Re-admission is already initiated - Date field is not available");
	}
		
	}


		

	

	public void readmissionReason(){
		try{
			
			WebElementUtils.scrolltoview(readmissionReason);
			
			readmissionReason.sendKeys("Test Automation");
		}
		catch(Exception e){
			System.out.println("Readmission is already initiated - Comments not available");
		}	
	}

	public void readmissionSubmit() {
		
		try{
		readmissionSubmit.click();
		}
		catch(Exception e){
			System.out.println("Readmission is already initiated - Element is not available");
		}	
		
		
	}

	public void iconAvailable(WebElement element) {
		try{
			
			WebElementUtils.scrolltoview(element);
			webDriverclick(element);
		}
		catch(Exception e){
			System.out.println("Readmission is already initiated - Element is not available");
		}	
	}

	public void readmissionApproveBtn(){
		iconAvailable(readmissionApprove);
	}

	public void approvalAlertFn() throws InterruptedException{
		webDriverclick(ExpandStudent);
		WebElementUtils.waitForVisible(approvalAlert);
		WebElementUtils.scrolltoview(approvalAlert);
		webDriverclick(approvalAlert);
	}

	public void deniedAlertFn() throws InterruptedException{
		webDriverclick(ExpandStudent);
		WebElementUtils.waitForVisible(deniedSwAlert);
		WebElementUtils.scrolltoview(deniedSwAlert);
		webDriverclick(deniedSwAlert);
	}

	public void needInfoAlertFn() throws InterruptedException{
		webDriverclick(ExpandStudent);
		WebElementUtils.waitForVisible(needInfoAlert);
		WebElementUtils.scrolltoview(needInfoAlert);
		webDriverclick(needInfoAlert);
	}

	public void receivedInfoAlertFn() throws InterruptedException{
		webDriverclick(ExpandStudent);
		WebElementUtils.waitForVisible(receivedInfoAlert);
		WebElementUtils.scrolltoview(receivedInfoAlert);
		webDriverclick(receivedInfoAlert);
	}

	public void readmissionDenialBtn(){
		iconAvailable(readmissionDenial);
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

	public void readmissionNeedInfoBtn(){
		iconAvailable(readmissionNeedInfo);
	}

	public void readmissionSendClarFnBtn(){
		iconAvailable(readmissionSendInfo);
	}

	public void logOutFn(){
		logoutProfile.click();
		logOut.click();
	}

	public void statusCheck(){
		webDriverclick(viewProfile);
		try{
			if(status.isDisplayed()){
				System.out.println("Student status is changed to 'Waiting for CMF Photo Update After Readmission'");
			}
		}
		catch(Exception e){
			System.out.println("Student status is not changed");
		}
	}
	
	public void Profileicon(){
		webDriverclick(viewProfile);
		
	}
	
	public void StudentClassInfo() {

		WebElementUtils.scrolltoview(ClassInfo);

		BaseClass.classinfo = ClassInfo.getText();

	}
	
	public void backPage() {
		
		getDriver().navigate().back();
	}
	
		
		
	
	
}
