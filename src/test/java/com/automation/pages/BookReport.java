package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class BookReport {

	
JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public BookReport()	{
		
		PageFactory.initElements(getDriver(), this);

	}
	///////////////////////////////////// Book Report
	///////////////////////////////////// elements////////////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(xpath = "//div[contains(@class, 'dropdown-menu')]//*[contains(@href,'/Book/Report')]")
	WebElement Bookmenu;
	
	@FindBy(xpath = "//input[@id='Filter_BookName']")
	WebElement bookName;
	
	@FindBy(xpath = "//select[@id='Filter_CenterID']")
	WebElement center;
	
	@FindBy(xpath = "//select[@id='Filter_Classcode']")
	WebElement classCode;
	
	@FindBy(xpath = "//select[@id='Filter_SectionID']")
	WebElement sectionID;
	
	@FindBy(xpath = "//select[@id='Filter_SubjectID']")
	WebElement subjectId;
	
	@FindBy(xpath = "//*[@title='Find records']")
	WebElement Search;
	
	@FindBy(xpath = "(//*[contains(@class, 'modalUpdateBookStatus')])[1]")
	WebElement editbook;
	
	@FindBy(xpath = "//input[@id='DamagedQuantity']")
	WebElement damagedbook;
	
	@FindBy(xpath = "//textarea[@id='BookCondition']")
	WebElement Bookcondition;

	@FindBy(xpath = "//input[@id='DamagedDate']")
	WebElement Damageddate;

	@FindBy(xpath = "//*[contains(@class, 'ui-dialog-buttonset')] //*[contains(@class, 'btn-primary')]")
	WebElement save;

	@FindBy(xpath = "(//*[contains(@class, 'ui-dialog-buttonset')] //*[contains(@class, 'btn-xs')])[1]")
	WebElement cancel;

	public void bookReportmenu() throws InterruptedException {
		Thread.sleep(2000);
		Reportsmenu.click();
		Bookmenu.click();
	}

	
	public void searchbook() throws InterruptedException {
		
		try{
		
		bookName.sendKeys(excelutil.getData(16, 1, 0));
		
		Select selcenter = new Select(center);
		selcenter.selectByVisibleText(excelutil.getData(16, 1, 1).trim());
		
		Select selcls = new Select(classCode);
		selcls.selectByVisibleText(excelutil.getData(16, 1, 2));
		
		Select selsec = new Select(sectionID);
		selsec.selectByVisibleText(excelutil.getData(16, 1, 3));
		
		Select selsub = new Select(subjectId);
		selsub.selectByVisibleText(excelutil.getData(16, 1, 4));
		
		Search.click();
		}
		
		catch (Exception e){
			
			System.out.println("Search book is not available");
		}
	}
	

	public void editbook() throws InterruptedException {
		
		try{
		
		editbook.click();
		
		damagedbook.sendKeys(excelutil.getData(16, 1, 5));
		
		Bookcondition.clear();
		
		Bookcondition.sendKeys(excelutil.getData(16, 1, 6));
		
		Damageddate.sendKeys(excelutil.getData(16, 1, 7));
		
		save.click();
		}
		
		catch (Exception e){
			
			System.out.println("Not Able to edit ");
		}
		
	}

	
}
