package com.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.automation.utils.excelutil;
import static com.automation.utils.DriverUtils.getDriver;

public class InterSchoolTransferReport {
	
JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public InterSchoolTransferReport()	{
		
		PageFactory.initElements(getDriver(), this);

	}
	
	////////////////////////////////InterSchoolTransferReportElements//////////////////////////////
	
	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;
	
	@FindBy(linkText = "Inter-School Transfer")
	WebElement InterSchoolTransfersubmenu;
	
	@FindBy(xpath = "//select[@id='DivSchoolTransferFC']")
	WebElement FromCenter;
	
	@FindBy(xpath = "//select[@id='DivSchoolTransferTC']")
	WebElement ToCenter;
	
	@FindBy(xpath = "//select[@id='DivSchoolTransferTS']")
	WebElement ToSchool;
	
	@FindBy(xpath = "//select[@id='DivSchoolTransferTT']")
	WebElement TransferType;
	
	@FindBy(xpath = "//select[@id='DivSchoolTransferFS']")
	WebElement FromSchool;
	
	@FindBy(xpath = "//*[@id='DivSchoolTransferCMFID']")
	WebElement CMFId;
	
	@FindBy(xpath = "//*[@id='DivSchoolTransferWFS']")
	WebElement workflowstep;
	
	@FindBy(xpath = "//*[@id='DivSchoolTransferAFAT']")
	WebElement Awaitingforapprovaltrue;
	
	@FindBy(xpath = "//*[@id='DivSchoolTransferAFAF']")
	WebElement Awaitingforapprovalfalse;
	
	@FindBy(xpath = "//*[@id='DivSchoolTransferFD']")
	WebElement FromDate;
	
	@FindBy(xpath = "//*[@id='DivSchoolTransferTD']")
	WebElement Todate;
	
	@FindBy(xpath = "//*[@id='btnDivSchoolTransfer']")
	WebElement transferViewreport;
	
	
	@FindBy(xpath = "//*[@src='/ReportViewerWebForm.aspx']")
	WebElement fvviewreportframe;

	@FindBy(xpath = "(//*[@alt='Export drop down menu'])[1]")
	WebElement fvexportdopdownmenu;

	@FindBy(xpath = "//*[@title='Excel']")
	WebElement excel;

	@FindBy(xpath = "//*[@title='PDF']")
	WebElement pdf;

	@FindBy(xpath = "//*[@title='Word']")
	WebElement word;
	
	public void interschoolreportmenu() throws InterruptedException {

		Reportsmenu.click();
		InterSchoolTransfersubmenu.click(); 
		Thread.sleep(2000);

	}
	public void filterTransferReport() throws InterruptedException {
		 getDriver().switchTo().frame(fvviewreportframe);
		Thread.sleep(2000);
		Select selFromCenter = new Select(FromCenter);
		selFromCenter.selectByVisibleText(excelutil.getData(19, 1, 0));
		Thread.sleep(2000);
		
		Select selFromSchool = new Select(FromSchool);
		selFromSchool.selectByVisibleText(excelutil.getData(19, 1, 1));
		Thread.sleep(2000);
		
		Select selToCenter = new Select(ToCenter);
		selToCenter.selectByVisibleText(excelutil.getData(19, 1, 2));
		Thread.sleep(2000);
		
		Select selToSchool = new Select(ToSchool);
		selToSchool.selectByVisibleText(excelutil.getData(19, 1, 3));
		Thread.sleep(2000);
		
		Select selTransferType = new Select(TransferType);
		selTransferType.selectByVisibleText(excelutil.getData(19, 1, 4));
		Thread.sleep(2000);
		
		Select selworkflowstep = new Select(workflowstep);
		selworkflowstep.selectByVisibleText(excelutil.getData(19, 1, 6));
		Thread.sleep(2000);
		
		//CMFId.sendKeys(excelutil.getData(19, 1, 5));
		FromDate.sendKeys(excelutil.getData(19, 1, 8));
		Todate.sendKeys(excelutil.getData(19, 1, 9));
		Thread.sleep(5000);
		if (excelutil.getData(19, 1, 7).equals("TRUE")){
			Awaitingforapprovaltrue.click();
		}
		else
		{
			Awaitingforapprovalfalse.click();
		}
	}
	public void viewTransferReport() throws InterruptedException {

		try{
		transferViewreport.click();
		Thread.sleep(3000);
		}
		
		catch (Exception e){
			
			System.out.println("View Report button is not clickable");
			
		}
	}
	
	public void exportTransferReport() throws InterruptedException {

		try{
		Thread.sleep(4000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", fvexportdopdownmenu);

		
		Thread.sleep(4000);

		JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
		jse1.executeScript("arguments[0].click()", excel);

		Thread.sleep(4000);

		JavascriptExecutor jse2 = (JavascriptExecutor) getDriver();
		jse2.executeScript("arguments[0].click()", pdf);
		Thread.sleep(4000);

		JavascriptExecutor jse3 = (JavascriptExecutor) getDriver();
		jse3.executeScript("arguments[0].click()", word);
		
		
		//driver.switchTo().frame(0);
		getDriver().switchTo().defaultContent();
		
		}
		
		catch (Exception e){
			
			System.out.println("Export Bar is not visible");
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	

