package com.automation.pages;

import java.util.List;
import java.util.Set;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverWait;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Attendance {
	public Attendance(){
		PageFactory.initElements(getDriver(), this);
	}

	String AbsentChildName;

	@FindBy(xpath="//input[@id='StudentsList_1__IsPresent' and @value='False']")
	WebElement radiobtn;

	@FindBy(xpath="//a[@id='lnkprint']")
	WebElement print;

	@FindBy(xpath="//a[@id='printpagebutton']")
	WebElement printpagebutton;

	@FindBy(id="AttendanceDate")
	WebElement dateclick;

	@FindBy(id="flash")
	WebElement flash;

	@FindBy(xpath="//div[@class='datepicker-days'] //th[@class='prev']")
	WebElement prevclick;

	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div/div/div/form[2]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/span[1]")
	WebElement childName;

	@FindBy(xpath="//button[@value='Save']")
	WebElement submitButton;

	@FindBy(id="btnSearchClassRoster")
	WebElement getClassRoaster;

	@FindBy(xpath="//a[@id='userDropdownMenuLink']")
	WebElement logoutProfile;

	@FindBy(linkText="Log Out")
	WebElement logOut;

	@FindBy(id="ddlStudentType")
	WebElement StudentType;

	@FindBy(id="Filter_FirstName")
	WebElement firstName;

	@FindBy(className="dataTables_empty")
	WebElement emptyRecord;

	@FindBy(xpath="//a[@title='Pull out this student/View Pull out workFlow']")
	WebElement pullOutIcon;

	@FindBy(xpath="//a[@title='View Student Profile']")
	WebElement studentProfile;

	@FindBy(xpath="//button[@value='GO']")
	WebElement SWsubmitButton;
	
	@FindBy(name="CenterID")
	WebElement centerName;

	@FindBy(id="ddlSchools")
	WebElement schoolName;

	@FindBy(id="ddlClasses")
	WebElement className;

	@FindBy(id="ddlSections")
	WebElement sectionName;
	
	public void centerNameFn(String centerID){
		Select select1 = new Select(centerName);
		select1.selectByVisibleText(centerID);
	}

	public void schoolNameFn(String schoolID){
		Select select2 = new Select(schoolName);
		select2.selectByVisibleText(schoolID);
	}

	public void classNameFn(String classID){
		Select select3 = new Select(className);
		select3.selectByVisibleText(classID);
	}

	public void sectionNameFn(String sectionID){
		Select select4 = new Select(sectionName);
		select4.selectByVisibleText(sectionID);
	}

	public void AbsentFn() throws InterruptedException{
		Thread.sleep(2000);
		if(radiobtn.isSelected()){
			System.out.println("Already Selected");
		}
		else{
			radiobtn.click();
		}
		submit();
	}

	public void submit(){
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()", submitButton);
	}

	public void dateclickFn(){
		dateclick.click();
		prevclick.click();
		getDriver().findElement(By.xpath("//td[@class='day' and text()='1']")).click();
	}

	public void saveAttendance() throws InterruptedException{
		dateclick.click();
		List <WebElement> dates = getDriver().findElements(By.xpath("//td[@class='day']"));
		int dateCount = dates.size();
		for(int i=2;i<=dateCount-1;i++){
			getDriver().findElement(By.xpath("//td[@class='day' and text()='"+i+"']")).click();
			getClassRoaster.click();
			AbsentFn();
			Thread.sleep(2000);
			dateclick.click();
		}
		AttUserIntMgFn();
	}

	public void AttendanceSheetFn() throws InterruptedException{
		String MainWindow	=	getDriver().getWindowHandle();
		print.click();
		Set<String>popUp =	getDriver().getWindowHandles();
		for (String AttendanceSheetPopUp : popUp) {
			if(!AttendanceSheetPopUp.equals(MainWindow)){
				getDriver().switchTo().window(AttendanceSheetPopUp);
				Thread.sleep(2000);
				getDriver().close();
			}
		}
		getDriver().switchTo().window(MainWindow);
	}

	public void AbsentChildNameFn(){
		AbsentChildName = childName.getText();
		System.out.println("Name is: " +AbsentChildName);
		//Return AbsentChildName;
	}

	public void AttUserIntMgFn(){
		String splAttUserIntMg ="The attendance details have been saved successfully.";
		String flashMsg=flash.getText();
		Assert.assertEquals(flashMsg,splAttUserIntMg);
	}

	public void searchBoxFn(){
		webDriverWait(firstName);
		firstName.sendKeys(AbsentChildName);
		firstName.sendKeys(Keys.RETURN);
		try{
			if(emptyRecord.isDisplayed()){
				System.out.println("No records matching");
			}
		}
		catch(Exception e){
			System.out.println("Record is available");
		}	
	}

	public void StudentTypeFn(){
		Select select6 = new Select(StudentType);
		select6.selectByVisibleText("Attendance Chart Poor");
		SWsubmitButton.click();
	}

	public void pullOutIconFn(){
		try{
			boolean status = pullOutIcon.isDisplayed();
			Assert.assertTrue(status);
			System.out.println("Pullout icon is available");
		}
		catch(Exception e){
			System.out.println("Pullout icon is not available");
		}
	}

}
