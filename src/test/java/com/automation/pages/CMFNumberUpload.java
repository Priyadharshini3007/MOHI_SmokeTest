package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.utils.excelutil;
//import utilities.excelutil;

public class CMFNumberUpload {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public CMFNumberUpload()	{

	PageFactory.initElements(getDriver(), this);
	}

	///////////////// CMF Number Upload Elements///////////////////////////

	@FindBy(linkText = "Sponsorship")
	WebElement sponsorshipMainMenu;

	@FindBy(linkText = "CMF Upload")
	WebElement CMFUploadsubmenu;

	@FindBy(linkText = "Download Template")
	WebElement DownloadTemplate;

	@FindBy(xpath = "//input[@id='FileName']")
	WebElement filename;
	
	@FindBy(xpath = "//input[@id='CMFUploadfile']")
	WebElement CMFfilename;
	
	
	@FindBy(xpath = "//button[@title='Upload']")
	WebElement CMFuploadbutton;
	

	public void Sponsorshipmenu() throws InterruptedException {
		
		/*String path=System.getProperty("user.dir");
		String fullPath= path + "//src//test//java//utilities//Studentdetails.xlsx";
		utilities.excelutil.Excelp(fullPath);*/
		
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		


		sponsorshipMainMenu.click();
		CMFUploadsubmenu.click();

	}

	public void downloadtemplate() throws InterruptedException {

		DownloadTemplate.click();

	}
	
	public void Upload() throws InterruptedException {
		
		String pathupload=System.getProperty("user.dir");
		String fullPathupload= pathupload + "//CMFIDUploadTemplate.xlsx";
	
		//utilities.excelutil.Excelp(fullPath);
		filename.sendKeys(excelutil.getData(8, 1, 0));
		
		CMFfilename.sendKeys(fullPathupload);
		
		CMFuploadbutton.click();

	}
	
	

}
