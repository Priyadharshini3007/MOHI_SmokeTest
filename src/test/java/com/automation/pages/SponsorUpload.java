package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.utils.excelutil;
//import utilities.excelutil;

public class SponsorUpload {
	

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public SponsorUpload()	{

	PageFactory.initElements(getDriver(), this);
	}

	//////////SponsorUploadElements////////////////////////////////////
	

	@FindBy(linkText = "Sponsorship")
	WebElement sponsorshipMainMenu;
	

	@FindBy(linkText = "Sponsor Upload")
	WebElement SponsorUploadsubmenu;
	
	@FindBy(linkText = "Download Template")
	WebElement DownloadSponsorTemplate;
	
	@FindBy(xpath = "//input[@id='FileName']")
	WebElement sponsorfilename;
	
	@FindBy(xpath = "//input[@id='CMFUploadfile']")
	WebElement Sponsorfilename;
	
	@FindBy(xpath = "//button[@title='Upload']")
	WebElement Sponsoruploadbutton;
	
	
	
	public void Sponsorshipsponsormenu() throws InterruptedException {
		
//		String path=System.getProperty("user.dir");
//		String fullPath= path + "//src//test//java//utilities//Studentdetails.xlsx";
//		com.automation.utils.excelutil.Excelp(fullPath);
		
		//com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		


		sponsorshipMainMenu.click();
		SponsorUploadsubmenu.click();

	}
	
	public void downloadsponsortemplate() throws InterruptedException {

		DownloadSponsorTemplate.click();
		
		
	}
	
public void sponsorUpload() throws InterruptedException {
		
		String pathupload=System.getProperty("user.dir");
		String fullPathupload= pathupload + "//CMFSponsorUploadTemplate.xlsx";
	
		//utilities.excelutil.Excelp(fullPath);
		sponsorfilename.sendKeys(excelutil.getData(8, 1, 0));
		
		Sponsorfilename.sendKeys(fullPathupload);
		
		Sponsoruploadbutton.click();

	
}
	
}
