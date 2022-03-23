package com.automation.pages;

import org.junit.Assert;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.selectFn;
import static com.automation.utils.WebElementUtils.webDriverclick;
import static com.automation.utils.WebElementUtils.recordsVerifn;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.utils.ExcelHelper;


public class SpecialAttendance {

	public SpecialAttendance(){
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div/div/div/form[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/td[3]/input[3]")
	WebElement notReceived1;

	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div/div/div/form[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/span[1]")
	WebElement notReceived1Tag;

	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div/div/div/form[2]/table/tbody/tr/td[1]/table/tbody/tr[10]/td[3]/input[3]")
	WebElement notReceived7;

	@FindBy(id="submitButton")
	WebElement SWsubmitButton;

	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div/div/div/form[2]/div/button")
	WebElement SPsubmitButton;

	@FindBy(name="CenterID")
	WebElement centerName;

	@FindBy(id="ddlSchools")
	WebElement schoolName;

	@FindBy(id="ddlClasses")
	WebElement className;

	@FindBy(id="ddlSections")
	WebElement sectionName;

	@FindBy(id="ddlTerms")
	WebElement term;

	@FindBy(id="btnSearchClassRoster")
	WebElement classRoaster;

	@FindBy(id="flash")
	WebElement flash;

	@FindBy(id="Filter_FirstName")
	WebElement firstName;

	@FindBy(xpath="//a[@title='Pull out this student/View Pull out workFlow']")
	WebElement pullOutIcon;

	@FindBy(id="userDropdownMenuLink")
	WebElement logoutProfile;

	@FindBy(linkText="Log Out")
	WebElement logOut;

	@FindBy(id="ddlStudentType")
	WebElement StudentType;

	@FindBy(xpath="//a[@title='View Student Profile']")
	WebElement studentProfile;

	@FindBy(className="dataTables_empty")
	WebElement emptyRecord;

	public void centerNameFn(){
		String center = ExcelHelper.readData(".\\ExcelFiles\\SpecialAttendance.xlsx","SpecialAtt",1,0);
		if(center.equals("Joska"))
		{
			String centerDp = center.toUpperCase();
			selectFn(centerName,centerDp);
		}
		else{
			selectFn(centerName,center);
		}
	}

	public void schoolNameFn(){
		String schlname = ExcelHelper.readData(".\\ExcelFiles\\SpecialAttendance.xlsx","SpecialAtt",1,1);
		selectFn(schoolName,schlname);
	}

	public void classNameFn(){
		String Classname = ExcelHelper.readData(".\\ExcelFiles\\SpecialAttendance.xlsx","SpecialAtt",1,2);
		selectFn(className,Classname);
	}

	public void sectionNameFn(){
		String sectionID = ExcelHelper.readData(".\\ExcelFiles\\SpecialAttendance.xlsx","SpecialAtt",1,3);
		selectFn(sectionName,sectionID);
	}

	public void termFn(){
		String termID = ExcelHelper.readData(".\\ExcelFiles\\SpecialAttendance.xlsx","SpecialAtt",1,4);
		selectFn(term,termID);
	}

	public void classRoasterFn(){
		classRoaster.click();
	}

	public void submitButtonFn(){
		webDriverclick(SPsubmitButton);
	}

	public void splAttUserIntMgFn(){
		String splAttUserIntMg ="The special attendance details have been saved successfully.";
		String flashMsg=flash.getText();
		Assert.assertEquals(flashMsg,splAttUserIntMg);
	}

	public void notReceived1Fn(){
		if(notReceived1.isSelected()){
			System.out.println("Already Selected");
		}
		else{
			notReceived1.click();
		}
	}

	public void notReceived7Fn(){
		if(notReceived7.isSelected()){
			System.out.println("Already Selected");
		}
		else{
			webDriverclick(notReceived7);
		}
	}
	
	public void outOfFrame() {
		try{
			getDriver().switchTo().defaultContent();
		}
		catch(Exception e){
			System.out.println("iFrame is not applied");
		}
	}

	public void logOutFn() throws Throwable{
		Thread.sleep(3000);
		try{
			logoutProfile.click();
			logOut.click();
		}
		catch(Exception e){
			System.out.println("Unable to log out");
		}
	}

	public void notReceived1NameFn(){
		ExcelHelper.clearData(".\\ExcelFiles\\SpecialAttendance.xlsx","SpecialAtt",1,5);
		String studentName = notReceived1Tag.getText();
		ExcelHelper.writeData(".\\ExcelFiles\\SpecialAttendance.xlsx","SpecialAtt",1,5,studentName);
	}

	public void searchBoxFn() throws InterruptedException{	
		String studentName = ExcelHelper.readData(".\\ExcelFiles\\SpecialAttendance.xlsx","SpecialAtt",1,5);
		Thread.sleep(2000);
		firstName.sendKeys(studentName);
		firstName.sendKeys(Keys.RETURN);
		try{
			if(emptyRecord.isDisplayed()){
				System.out.println("No records matching");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			System.out.println("Record is available");
		}   
	}

	public void StudentTypeFn(){
		String studentTypeValue = "Attendance Chart Poor";
		selectFn(StudentType,studentTypeValue);
		SWsubmitButton.click();
	}

	public void pullOutIconFn(){
		try{
			
			Thread.sleep(2000);
			if(pullOutIcon.isDisplayed()){
				System.out.println("Pullout icon is available");
			}
		}
		catch(Exception e){
			recordsVerifn();
			System.out.println("Pullout icon is not available");
			Assert.assertTrue(false);
		}
	}

}
