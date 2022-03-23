package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

import static com.automation.utils.DriverUtils.getDriver;

import java.io.File;

public class ChildGiftsummaryReport {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public ChildGiftsummaryReport() {

		PageFactory.initElements(getDriver(), this);

	}

	/////////////////// child gift summary report
	/////////////////// elements////////////////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(linkText = "Child Gift Summary")
	WebElement ChildGiftSummarySubmenu;

	@FindBy(xpath = "//*[@src='/ReportViewerWebForm.aspx']")
	WebElement fvviewreportframe;

	@FindBy(xpath = "//*[@id='DropDownListCenter']")
	WebElement childcentername;

	@FindBy(xpath = "//*[@id='DropDownListSchool']")
	WebElement childschoolname;

	@FindBy(xpath = "//*[@id='TextBoxRCD']")
	WebElement ReceivedFromDate;

	@FindBy(xpath = "//*[@id='TextBoxRTD']")
	WebElement ReceivedToDate;

	@FindBy(xpath = "//*[@id='DropDownListGS']")
	WebElement GiftStatus;

	@FindBy(xpath = "//*[@id='btnChildGift']")
	WebElement ViewCildGiftReportButton;

	@FindBy(xpath = "(//*[@alt='Export drop down menu'])[1]")
	WebElement fvexportdopdownmenu;

	@FindBy(xpath = "//*[@title='Excel']")
	WebElement excel;

	@FindBy(xpath = "//*[@title='PDF']")
	WebElement pdf;

	@FindBy(xpath = "//*[@title='Word']")
	WebElement word;

	public void chilfGiftSummaryReportMenu() throws InterruptedException {

		Reportsmenu.click();
		ChildGiftSummarySubmenu.click();

	}

	public void filterChildGiftSummaryReport() throws InterruptedException {

		getDriver().switchTo().frame(fvviewreportframe);

		Thread.sleep(2000);

		Select selchildcentername = new Select(childcentername);
		selchildcentername.selectByVisibleText(excelutil.getData(21, 1, 0));

		Thread.sleep(2000);

		Select selchildschoolname = new Select(childschoolname);
		selchildschoolname.selectByVisibleText(excelutil.getData(21, 1, 1));

		Thread.sleep(2000);

		ReceivedFromDate.sendKeys(excelutil.getData(21, 1, 2));

		Thread.sleep(2000);

		ReceivedFromDate.sendKeys(Keys.TAB);

		ReceivedToDate.sendKeys(excelutil.getData(21, 1, 3));

		Thread.sleep(2000);

		ReceivedToDate.sendKeys(Keys.TAB);

		Select selGiftStatus = new Select(GiftStatus);
		selGiftStatus.selectByVisibleText(excelutil.getData(21, 1, 4));

	}

	public void viewChildGiftSummaryReport() throws InterruptedException {

		ViewCildGiftReportButton.click();
		Thread.sleep(3000);

	}

	public boolean isFileDownloaded(String downloadPath, String fileName) {

		boolean flag = false;
		File dir = new File(downloadPath);
		File[] dir_contents = dir.listFiles();
		

		for (int i = 0; i < dir_contents.length;i++) {
			if (dir_contents[i].getName().toLowerCase().contains(fileName))
				System.out.println(fileName);
			return flag = true;
		}

		return flag;
	}

	String home = System.getProperty("user.home");

	String downloadPath = new File(home + "/Downloads/").getPath();

	public void childGiftSummaryReport() throws InterruptedException {

		WebElementUtils.waitForVisible(fvexportdopdownmenu);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", fvexportdopdownmenu);

		Thread.sleep(4000);

		JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
		jse1.executeScript("arguments[0].click()", excel);

		Assert.assertTrue("Failed to download Expected document", isFileDownloaded(downloadPath, ".xlsx"));

		Thread.sleep(4000);

		JavascriptExecutor jse2 = (JavascriptExecutor) getDriver();
		jse2.executeScript("arguments[0].click()", pdf);

		Assert.assertTrue("Failed to download Expected document", isFileDownloaded(downloadPath, ".pdf"));
		Thread.sleep(4000);

		JavascriptExecutor jse3 = (JavascriptExecutor) getDriver();
		jse3.executeScript("arguments[0].click()", word);

		Assert.assertTrue("Failed to download Expected document", isFileDownloaded(downloadPath, ".docx"));

		getDriver().switchTo().defaultContent();

	}
	
	//Tracking Report
	
	@FindBy(xpath = "//*[@id='GiftReportCriteria_1']")
	WebElement TrackingReport;
	
	@FindBy(xpath = "//*[@id='YearDropdown']")
	WebElement YearDropdwn;
	
	
	
	public void TrackingReport() throws InterruptedException  {
		
		Thread.sleep(4000);
		
		getDriver().switchTo().frame(fvviewreportframe);

		TrackingReport.click();
		
		
		}
	
	public void TrackingDropDwn() throws InterruptedException {
		
		Thread.sleep(4000);

		Select selchildcentername = new Select(childcentername);
		selchildcentername.selectByVisibleText(excelutil.getData(21, 1, 0));

		Thread.sleep(2000);

		Select selYear = new Select(YearDropdwn);
		selYear.selectByVisibleText(excelutil.getData(21, 1, 5));
	}	

}
