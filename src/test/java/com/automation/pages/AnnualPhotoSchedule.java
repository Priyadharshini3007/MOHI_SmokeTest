package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class AnnualPhotoSchedule {

	public AnnualPhotoSchedule() {
		PageFactory.initElements(getDriver(), this);

	}

	////////////////////////// AnnualPhotoSchedule////////////////////////////////

	@FindBy(xpath = "//a[text()='Center']")
	WebElement CenterMenu;

	@FindBy(xpath = "//a[text()='Annual Photo Schedule']")
	WebElement AnnualPhotoSchedule;

	@FindBy(xpath = "//input[@id='CenterPhotoScheduledate']")
	WebElement CenterPhotoScheduleDate;

	@FindBy(xpath = "//button[@id='savebutton']")
	WebElement Save;

	@FindBy(xpath = "//*[@id='userDropdownMenuLink']")
	WebElement menu;

	@FindBy(xpath = "//*[@id='navbar-collapse-nav']/ul[2]/li/span/a[2]")
	WebElement logout;

	@FindBy(xpath = "//div/a[contains(text(),'Annual center')]")
	WebElement AnnualPhotoscheduleLink;

	@FindBy(xpath = "//*[@title='Expand Student']")
	WebElement ExpandStudent;

	/////////////////////////////////////////////////////////////////////////////////

	public void CenterMenuAnnualPhotoSchedhule() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");

		CenterMenu.click();
		AnnualPhotoSchedule.click();

	}

	public void updatePhotoSchedhuledate() throws InterruptedException {

		CenterPhotoScheduleDate.click();
		CenterPhotoScheduleDate.clear();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.now();
		getDriver().findElement(By.xpath("//input[@id='CenterPhotoScheduledate']")).sendKeys(dtf.format(localDate));

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Save);

	}

	public void photoschedulelinkpresent() throws InterruptedException {

		Thread.sleep(3000);

		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(AnnualPhotoscheduleLink);

		WebElementUtils.scrolltoview(AnnualPhotoscheduleLink);

		boolean getElement = getDriver().findElements(By.xpath("//div/a[contains(text(),'Annual center')]"))
				.size() != 0;

		Assert.assertEquals(true, getElement);

	}
}