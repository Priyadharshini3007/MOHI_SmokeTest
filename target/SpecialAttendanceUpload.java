package com.automation.pages;

import java.awt.AWTException;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.DwnldfileVerificatnFn;
import static com.automation.utils.WebElementUtils.webDriverWait;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SpecialAttendanceUpload {

	public SpecialAttendanceUpload(){
		PageFactory.initElements(getDriver(), this);		
	}

	String filepath=".\\output";

	@FindBy(linkText="Download Template")
	WebElement DownloadTemp;

	@FindBy(id="FileName")
	WebElement fileNameField;

	@FindBy(xpath="//*[@id='SpecialAttendancefile']")
	WebElement SpecialAttendanceUpload;

	@FindBy(xpath="//div[@class='center']//button")
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
		String fullPath= path + "//Special_Attendance_Upload.xlsx";
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

	public void CMFIDSearchFn(String CMFID){
		webDriverWait(CMFIDField);
		CMFIDField.sendKeys(CMFID);
		CMFIDField.sendKeys(Keys.RETURN);
		try{
			if(emptyRecord.isDisplayed()){
				System.out.println("No records matching");
			}
		}
		catch(Exception e){
			System.out.println("Record is available");
		}
	}

	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{	
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void StudentTypeFn(){
		Select select6 = new Select(StudentType);
		select6.selectByVisibleText("Attendance Chart Poor");
		SWsubmitButton.click();
	}

	public void pullOutIconFn(){
		try{
			if(studentProfile.isDisplayed()){
				boolean pullOutIconAvailable = pullOutIcon.isDisplayed();
				System.out.println("Pullout icon is available" +pullOutIconAvailable);
			}
		}
		catch(Exception e){
			System.out.println("Pullout icon is not available");
		}
	}

}
