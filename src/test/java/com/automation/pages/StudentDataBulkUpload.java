package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.excelutil;

public class StudentDataBulkUpload {
	
	

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public StudentDataBulkUpload()	{

	PageFactory.initElements(getDriver(), this);
		
	}
	
	////////////////////////////////////////StudentDataBulkUploadElements////////////////////////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(xpath = "//a[contains(@class,'dropdown-item') and contains(@href,'/Student/StudentListDetails')]")
	WebElement Studentsubmenu;
	
	@FindBy(xpath = "//a[contains(@href,'/Student/StudentExcelUpload')]")
	WebElement UploadStudentDetails;
	
	@FindBy(linkText = "Download Template")
	WebElement DownloadTemplate;
	
	@FindBy(linkText = "Empty Template")
	WebElement EmptyTemplate;
	
	@FindBy(linkText = "Edit Template")
	WebElement EditTemplate;
	
	@FindBy(xpath = "//*[@id='FileName']")
	WebElement Filename;
	
	@FindBy(xpath = "//*[@id='StudentUploadfile']")
	WebElement BrowseButton;
	
	@FindBy(xpath = "//*[@class='btn btn-success ui-button ui-corner-all ui-widget']")
	WebElement UploadButton;
	
	@FindBy(xpath = "//*[@title='Click to show/hide instructions']")
	WebElement infoButton;
	
	@FindBy(xpath = "//*[@id='flash']")
	WebElement Flashmessage;
	
	
	
	
	
	
	
	public void studentreportmenutoupload() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		Reportsmenu.click();
		Studentsubmenu.click();
		Thread.sleep(3000);

	}
	
	public void UploadStudentDetailsIcon() throws InterruptedException {

		UploadStudentDetails.click();

	}
	
	public void downloadTemplateOptions() throws InterruptedException {

		DownloadTemplate.click();

	}
	
	public void infoButton() throws InterruptedException {

		infoButton.click();

	}
	
	public void EmptyTemplate() throws InterruptedException {
		DownloadTemplate.click();
		EmptyTemplate.click();
		Thread.sleep(3000);

	}
	
	public void editTemplate() throws InterruptedException {
		DownloadTemplate.click();
		EditTemplate.click();
		Thread.sleep(3000);

	}
	
	public void templateUpload() throws InterruptedException {

		
		
		String pathupload=System.getProperty("user.dir");
		String fullPathupload= pathupload + "//StudentUploadTemplate.xlsx";
		
		Filename.sendKeys(excelutil.getData(28, 1, 1));
	
		BrowseButton.sendKeys(fullPathupload);
		
		UploadButton.click();

	}
	
	public void Errorlog() throws InterruptedException {

		String exp="Uploaded successfully.";
		  String text=Flashmessage.getText();
		   Assert.assertEquals(text,exp);
	
		System.out.println(Flashmessage.getText());
		

	}
	
	
	
	

	
	

	
	 
	
	








}