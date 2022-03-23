package com.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static com.automation.utils.DriverUtils.getDriver;

import com.automation.utils.excelutil;

public class FamilyVisitSummaryReport {

JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public FamilyVisitSummaryReport()	{
		
		PageFactory.initElements(getDriver(), this);

	}
	//////////////////////////////// Family visit summary report
	//////////////////////////////// elements//////////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(linkText = "Family Visit Summary")
	WebElement familyvisitsummarysubmenu;

	@FindBy(xpath = "//select[@id='DropDownListCenterFV']")
	WebElement fvcentername;

	@FindBy(xpath = "//select[@id='DropDownListSchoolFV']")
	WebElement fvschoolname;

	@FindBy(xpath = "//select[@id='DropDownListSWFV']")
	WebElement swfvname;

	@FindBy(xpath = "//select[@id='DropDownListFVVY']")
	WebElement fvvy;

	@FindBy(xpath = "//select[@id='DropDownListFVT']")
	WebElement fvt;

	@FindBy(xpath = "//select[@id='DropDownListFVM']")
	WebElement fvm;

	@FindBy(xpath = "//input[@id='TextBoxFVCMFID']")
	WebElement textboxcmfid;

	@FindBy(xpath = "//input[@id='btnFamilyVisit']")
	WebElement fvviewreportbtn;

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
	
	@FindBy(xpath = "//div[@title='View family visit detail']//a")
	WebElement familyvisitformlink;

	public void familyvisitsummaryreportmenu() throws InterruptedException {

		Reportsmenu.click();
		familyvisitsummarysubmenu.click();

		Thread.sleep(2000);

	}

	public void familyvisitsummarysearch() throws InterruptedException {

		getDriver().switchTo().frame(fvviewreportframe);

		Select selfvcenter = new Select(fvcentername);
		selfvcenter.selectByVisibleText(excelutil.getData(18, 1, 0));

		Thread.sleep(3000);

		Select selfvschoolname = new Select(fvschoolname);
		selfvschoolname.selectByVisibleText(excelutil.getData(18, 1, 1));

		Thread.sleep(3000);

		Select selfvsocialworker = new Select(swfvname);
		selfvsocialworker.selectByVisibleText(excelutil.getData(18, 1, 2));

		Thread.sleep(3000);

		Select selfvvisityear = new Select(fvvy);
		selfvvisityear.selectByVisibleText(excelutil.getData(18, 1, 3));

		Thread.sleep(3000);

		Select selfvterm = new Select(fvt);
		selfvterm.selectByVisibleText(excelutil.getData(18, 1, 4));

		Thread.sleep(3000);
		
		

		Select selfvmonth = new Select(fvm);
		selfvmonth.selectByVisibleText(excelutil.getData(18, 1, 5));

	}

	public void familyvisitreportbtn() throws InterruptedException {

		Thread.sleep(2000);
		fvviewreportbtn.click();
		
		Thread.sleep(4000);
		
		fvviewreportbtn.sendKeys(Keys.ARROW_DOWN);		
		fvviewreportbtn.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", familyvisitformlink);

		//familyvisitformlink.click();
		
		String parent=getDriver().getWindowHandle();
		Thread.sleep(3000);
		for (String winHandle : getDriver().getWindowHandles()) {
			 getDriver().switchTo().window(winHandle); // switch focus to new window
        }
        //String second = driver.getWindowHandle();
		getDriver().close();
		getDriver().switchTo().window(parent);
		getDriver().switchTo().frame(fvviewreportframe);
		
		
	}

	public void familyvisitexport() throws InterruptedException {

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

}
