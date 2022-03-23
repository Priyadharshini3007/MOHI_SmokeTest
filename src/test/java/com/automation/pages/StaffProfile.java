package com.automation.pages;

import java.io.File;
import static com.automation.utils.DriverUtils.getDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffProfile {
	
	
	public StaffProfile(){
	
		PageFactory.initElements(getDriver(), this);
	}
	
	//String filepath="C:\\Users\\manikandan.r\\Desktop\\MOHI\\output";
	String filepath=".\\output";
	
	@FindBy(xpath="//h4[contains(text(),'Employee Details')]")
	WebElement basicProfile;
	
	@FindBy(xpath="//h4[contains(text(),'Employee Pay Structure')]")
	WebElement payStructure;
	
	@FindBy(className="PaySlipHistory")
	WebElement paySlip;
	
	public void basicProfileFn() throws Exception{
		if(basicProfile.isDisplayed()){
			this.takeSnapShot(getDriver(), filepath+"BasicProfile.png");
		}
		else{
			this.takeSnapShot(getDriver(), filepath+"Error_BasicProfile.png");
		}
	}
	
	public void payStructureFn() throws Exception{
		if(payStructure.isDisplayed()){
			this.takeSnapShot(getDriver(), filepath+"PayStructure.png");
		}
		else{
			this.takeSnapShot(getDriver(), filepath+"Error_PayStructure.png");
		}
	}
	
	public void paySlipDetailFn() throws Exception{
		if(paySlip.isDisplayed()){
			this.takeSnapShot(getDriver(), filepath+"PaySlipDetail.png");
		}
		else{
			this.takeSnapShot(getDriver(), filepath+"Error_PaySlipDetail.png");
		}
	}
	
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{	
	   TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	   File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	   File DestFile=new File(fileWithPath);
	   FileUtils.copyFile(SrcFile, DestFile);
    }
	
}
