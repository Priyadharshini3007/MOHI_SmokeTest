package com.automation.pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import com.automation.utils.excelutil;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.automation.utils.DriverUtils.getDriver;

public class StudentCMFReport {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public StudentCMFReport() {

		PageFactory.initElements(getDriver(), this);

	}
	//////////////////////////// StudentCMFReportElements///////////////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(linkText = "Student CMF Report")
	WebElement StudentCMFReportsubmenu;

	@FindBy(xpath = "//select[@id='ddlReportTypes']")
	WebElement reportcriteria;

	@FindBy(xpath = "//select[@id='ddlCenters']")
	WebElement center;

	@FindBy(xpath = "//select[@id='ddlSchools']")
	WebElement School;

	@FindBy(xpath = "//select[@id='ddlHomeCenter']")
	WebElement homecenter;

	@FindBy(xpath = "//input[@id='FromDate']")
	WebElement fromdate;

	@FindBy(xpath = "//input[@id='ToDate']")
	WebElement todate;

	@FindBy(xpath = "//button[@id='ExcelDownload']")
	WebElement Downloadbtn;

	@FindBy(xpath = "//button[@id='btnSearch']")
	WebElement searchbtn;

	@FindBy(xpath = "//input[@id='CMFID']")
	WebElement CMFID;

	public void StudentCMFReportmenu() throws InterruptedException {

		Reportsmenu.click();
		StudentCMFReportsubmenu.click();

	}

	public void StudentCMFReportcriteria() throws InterruptedException {

		Select selrptcriteria = new Select(reportcriteria);
		selrptcriteria.selectByVisibleText(excelutil.getData(17, 1, 0));

		Select selcentername = new Select(center);
		selcentername.selectByVisibleText(excelutil.getData(17, 1, 1));

		Select selsclname = new Select(School);
		selsclname.selectByVisibleText(excelutil.getData(17, 1, 2));

		Select selhomecenter = new Select(homecenter);
		selhomecenter.selectByVisibleText(excelutil.getData(17, 1, 3));

	}

	public void FromDateandTodate() throws InterruptedException {

		fromdate.click();

		String date = excelutil.getData(17, 1, 4);
		String monthyear, day;
		String dateArray[] = date.split("-");
		day = dateArray[0];
		monthyear = dateArray[1] + " " + dateArray[2];
		// String month = "July 2010";
		// System.out.println(monthyear);
		// System.out.println(day);

		while (true) {

			String text = getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[2]"))
					.getText();

			if (text.equals(monthyear)) {
				break;
			} else {

				getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
		}

		getDriver().findElement(
				By.xpath("/html/body/div[6]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ day + "]"))
				.click();

		todate.click();

		String date1 = excelutil.getData(17, 1, 5);
		String monthyear1, day1;
		String dateArray1[] = date1.split("-");
		day1 = dateArray1[0];
		monthyear1 = dateArray1[1] + " " + dateArray1[2];
		// String month = "July 2010";
		// System.out.println(monthyear);
		// System.out.println(day);

		while (true) {

			String text1 = getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[2]"))
					.getText();

			if (text1.equals(monthyear1)) {
				break;
			} else {

				getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
		}

		getDriver().findElement(
				By.xpath("/html/body/div[6]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ day1 + "]"))
				.click();
	}

	public void Search() throws InterruptedException {

		searchbtn.click();

	}

	public boolean isAlertPresent() {
		try {
			getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			Alert a = getDriver().switchTo().alert();
			a.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		} finally {
			getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	}

	public void Download() throws InterruptedException {

		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Downloadbtn);

		this.DwnldTempVerificatnFn("MOHIReport");
		
}

	public void DwnldTempVerificatnFn(String filename) throws InterruptedException {
		String path = System.getProperty("user.home");
		String fullPath = path + "\\Downloads";
		// utilities.excelutil.Excelp(fullPath);
		File path1 = new File(fullPath);
		File[] allfiles = path1.listFiles();
		for (File reqfile : allfiles) {
			if (reqfile.getName().startsWith(filename)) {
				System.out.println("File is downloaded, " + reqfile);
				break;

			}
		}
	}

}
