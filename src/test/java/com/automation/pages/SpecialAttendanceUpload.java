package com.automation.pages;

import java.awt.AWTException;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.selectFn;
import static com.automation.utils.WebElementUtils.DwnldfileVerificatnFn;
import static com.automation.utils.WebElementUtils.webDriverWait;
import static com.automation.utils.WebElementUtils.recordsVerifn;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.utils.ExcelHelper;

public class SpecialAttendanceUpload {

	public SpecialAttendanceUpload(){
		PageFactory.initElements(getDriver(), this);		
	}

	String filepath=".\\output\\";

	@FindBy(linkText="Download Template")
	WebElement DownloadTemp;

	@FindBy(id="FileName")
	WebElement fileNameField;

	@FindBy(xpath="//*[@id='SpecialAttendancefile']")
	WebElement SpecialAttendanceUpload;

	@FindBy(xpath="//button[@title='Upload']")
	WebElement submitButton;

	@FindBy(id="TermID")
	WebElement TermIdField;

	@FindBy(id="flash")
	WebElement flash;

	@FindBy(id="Filter_CMFID")
	WebElement CMFIDField;

	@FindBy(className="dataTables_empty")
	WebElement emptyRecord;

	@FindBy(xpath="//a[@id='userDropdownMenuLink']")
	WebElement logoutProfile;

	@FindBy(linkText="Log Out")
	WebElement logOut;

	@FindBy(id="ddlStudentType")
	WebElement StudentType;

	@FindBy(id="submitButton")
	WebElement SWsubmitButton;

	@FindBy(xpath="//a[@title='View Student Profile']")
	WebElement studentProfile;
	
	@FindBy(css="i.fa.fa-flag.red.bigger-110")
	WebElement pullOutIcon;

	public void DownloadTempFn(){
		// click on download template
		DownloadTemp.click();
	}

	public void TermIDFn(String TermID){
		TermIdField.sendKeys(TermID);
	}

	public void DwnldTempVerificatnFn(String filename) throws InterruptedException{
		DwnldfileVerificatnFn(filename);
	}

	public void FileNameFn(String fileName){
		fileNameField.sendKeys(fileName);
	}

	public void SpecialAttendanceUploadFn() throws AWTException, InterruptedException{
		String path=System.getProperty("user.dir");
		String fullPath= path + "\\ExcelFiles\\Special_Attendance_Upload.xlsx";
		SpecialAttendanceUpload.sendKeys(fullPath);
	}

	public void uploadFn() throws Exception{
		submitButton.click();
	}	

	public void splAttUpUserIntMgFn() throws Exception{
		String splAttUserUpIntMg ="The special attendance details have been uploaded successfully.";
		String flashMsg=flash.getText();
		if(splAttUserUpIntMg==flashMsg){
			this.takeSnapShot(getDriver(), filepath+"SpecialAttendanceUpload_Successfull.png") ;
		}
		else{
			String file = "Log_";
			DwnldTempVerificatnFn(file);
		}
	}

	public void CMFIDSearchFn(){
		String CMFID = ExcelHelper.readData(".\\ExcelFiles\\Special_Attendance_Upload.xlsx","Sheet1",1,1);
		webDriverWait(CMFIDField);
		CMFIDField.sendKeys(CMFID);
		CMFIDField.sendKeys(Keys.RETURN);
		recordsVerifn();
	}

	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{	
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void StudentTypeFn(){
		String studentTypeValue = "Attendance Chart Poor";
		selectFn(StudentType,studentTypeValue);
		SWsubmitButton.click();
	}

	public void pullOutIconFn(){
		try{
			if(emptyRecord.isDisplayed()){
				System.out.println("Attendance Chart Poor category doesn't contains matching records");
				String studentTypeValue = "All";
				selectFn(StudentType,studentTypeValue);
				SWsubmitButton.click();
				Thread.sleep(3000);
				String CMFID = ExcelHelper.readData(".\\ExcelFiles\\Special_Attendance_Upload.xlsx","Sheet1",1,1);
				CMFIDField.sendKeys(CMFID);
				CMFIDField.sendKeys(Keys.RETURN);
				Thread.sleep(3000);
				if(studentProfile.isDisplayed()){
					System.out.println("Student is displayed");
				}
			}
		}
		catch(Exception p){
			System.out.println("Pull out icon is not displayed");
			Assert.assertTrue(false);
		}
	}

}
