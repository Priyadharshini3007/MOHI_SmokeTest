package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.DwnldfileVerificatnFn;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class PromotionReport {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public PromotionReport() {

		PageFactory.initElements(getDriver(), this);

	}
	///////////////////////////// Promotion Report
	///////////////////////////// elements////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(linkText = "Promotion")
	WebElement Promotionmenu;

	@FindBy(xpath = "//select[@id='ddlYears']")
	WebElement yearmenu;

	@FindBy(xpath = "//select[@id='ddlCenters']")
	WebElement centername;

	@FindBy(xpath = "//select[@id='ddlSchools']")
	WebElement schoolname;

	@FindBy(xpath = "//select[@id='ddlClasses']")
	WebElement classname;

	@FindBy(xpath = "//*[@id='btnViewReport']")
	WebElement viewreport;

	@FindBy(xpath = "//a[@title='Export drop down menu']")
	WebElement download;

	@FindBy(xpath = "//a[@title='Excel']")
	WebElement excel;

	public void promotionreportmenu() throws InterruptedException {

		Reportsmenu.click();
		Promotionmenu.click();
		Thread.sleep(2000);

	}

	public void year() throws InterruptedException {

		try {
			Select selyr = new Select(yearmenu);
			selyr.selectByVisibleText(excelutil.getData(14, 1, 0));
		}

		catch (Exception e) {

			System.out.println("Given year is not available");
		}

	}

	public void center() throws InterruptedException {

		try {

			Select selctr = new Select(centername);
			selctr.selectByVisibleText(excelutil.getData(14, 1, 1));
		}

		catch (Exception e) {

			System.out.println("Given center is not available");
		}

	}

	public void school() throws InterruptedException {

		try {

			Select selscl = new Select(schoolname);
			selscl.selectByVisibleText(excelutil.getData(14, 1, 2));

		}

		catch (Exception e) {

			System.out.println("Given School name is not available");
		}

	}

	public void classnme() throws InterruptedException {

		try {
			Select selcls = new Select(classname);
			selcls.selectByVisibleText(excelutil.getData(14, 1, 3));
		}

		catch (Exception e) {

			System.out.println("Given classname is not available");
		}

	}

	public void viewreport() throws InterruptedException {

		try {

			viewreport.click();

		}

		catch (Exception e) {

			System.out.println("View Button not available");
		}

	}

}
