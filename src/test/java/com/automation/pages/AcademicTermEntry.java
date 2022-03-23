package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class AcademicTermEntry {
	public AcademicTermEntry() {

		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[contains(text(),'Student')]")
	WebElement StudentMenu;

	@FindBy(xpath = "//a[contains(text(),'Academic Term Entry')]")
	WebElement AcademicTermEntrySubMenu;

	@FindBy(xpath = "(//*[@class='blue fa fa-edit'])[2]")
	WebElement AddAcademicTermButton;

	@FindBy(xpath = "//input[@id='Term1StartDate']")
	WebElement Term1StartDate;

	@FindBy(xpath = "//input[@id='Term1EndDate']")
	WebElement Term1EndDate;

	@FindBy(xpath = "//input[@id='Term2StartDate']")
	WebElement Term2StartDate;

	@FindBy(xpath = "//input[@id='Term2EndDate']")
	WebElement Term2EndDate;

	@FindBy(xpath = "//input[@id='Term3StartDate']")
	WebElement Term3StartDate;

	@FindBy(xpath = "//input[@id='Term3EndDate']")
	WebElement Term3EndDate;

	@FindBy(xpath = "//button[@id='SaveAcademic']")
	WebElement SaveAcademic;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	WebElement Cancel;

	@FindBy(xpath = "(//input[@id='StudentStartDate'])[1]")
	WebElement StudentStartDate;

	@FindBy(partialLinkText = "Entry")
	WebElement studentEntrySubMenu;

	@FindBy(xpath = "//a[@title='School Info']")
	WebElement SchoolInfoTab;

	@FindBy(xpath = "/html/body/div[7]/div[1]/table/thead/tr[2]/th[2]")
	WebElement monthYear;

	@FindBy(xpath = "/html/body/div[7]/div[1]/table/thead/tr[2]/th[3]")
	WebElement NextClick;

	public void academicTermSubMenu() {

		StudentMenu.click();
		AcademicTermEntrySubMenu.click();
	}

	public void addAcademicTerm() {

		AddAcademicTermButton.click();

	}

	public void addTerm1StartDuration() {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(Term1StartDate);

		Term1StartDate.click();

		String Term1StartDate = excelutil.getData(40, 1, 1);
		String Term1StartMonthYear, Term1StartDay;
		String dateArray2[] = Term1StartDate.split("-");
		Term1StartDay = dateArray2[0];
		Term1StartMonthYear = dateArray2[1] + " " + dateArray2[2];

		while (true) {

			String text2 = monthYear.getText();

			if (text2.equals(Term1StartMonthYear)) {
				break;
			}

			else {

				NextClick.click();
			}

		}

		getDriver().findElement(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ Term1StartDay + "] "))
				.click();
	}

	public void addTerm1EndDuration() {

		Term1EndDate.click();

		String Term1EndDate = excelutil.getData(40, 1, 2);
		String Term1EndMonthYear, Term1EndDay;
		String dateArray2[] = Term1EndDate.split("-");
		Term1EndDay = dateArray2[0];
		Term1EndMonthYear = dateArray2[1] + " " + dateArray2[2];
		while (true) {

			String text2 = monthYear.getText();

			if (text2.equals(Term1EndMonthYear)) {
				break;
			}

			else {

				NextClick.click();
			}

		}

		getDriver().findElement(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ Term1EndDay + "] "))
				.click();

	}

	public void addTerm2StartDuration() {

		Term2StartDate.click();

		String Term2StartDate = excelutil.getData(40, 1, 3);
		String Term2StartMonthYear, Term2StartDay;
		String dateArray2[] = Term2StartDate.split("-");
		Term2StartDay = dateArray2[0];
		Term2StartMonthYear = dateArray2[1] + " " + dateArray2[2];
		while (true) {

			String text2 = monthYear.getText();

			if (text2.equals(Term2StartMonthYear)) {
				break;
			}

			else {

				NextClick.click();
			}

		}

		getDriver().findElement(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ Term2StartDay + "] "))
				.click();
	}

	public void addTerm2EndDuration() {

		Term2EndDate.click();

		String Term2EndDate = excelutil.getData(40, 1, 4);
		String Term2EndMonthYear, Term2EndDay;
		String dateArray2[] = Term2EndDate.split("-");
		Term2EndDay = dateArray2[0];
		Term2EndMonthYear = dateArray2[1] + " " + dateArray2[2];
		while (true) {

			String text2 = monthYear.getText();

			if (text2.equals(Term2EndMonthYear)) {
				break;
			}

			else {

				NextClick.click();
			}

		}

		getDriver().findElement(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ Term2EndDay + "] "))
				.click();
	}

	public void addTerm3StartDuration() {

		Term3StartDate.click();

		String Term3StartDate = excelutil.getData(40, 1, 5);
		String Term3StartMonthYear, Term3StartDay;
		String dateArray2[] = Term3StartDate.split("-");
		Term3StartDay = dateArray2[0];
		Term3StartMonthYear = dateArray2[1] + " " + dateArray2[2];
		while (true) {

			String text2 = monthYear.getText();

			if (text2.equals(Term3StartMonthYear)) {
				break;
			}

			else {

				NextClick.click();
			}

		}

		getDriver().findElement(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ Term3StartDay + "] "))
				.click();
	}

	public void addTerm3EndDuration() {

		Term3EndDate.click();

		String Term3EndDate = excelutil.getData(40, 1, 6);
		String Term3EndMonthYear, Term3EndDay;
		String dateArray2[] = Term3EndDate.split("-");
		Term3EndDay = dateArray2[0];
		Term3EndMonthYear = dateArray2[1] + " " + dateArray2[2];
		while (true) {

			String text2 = monthYear.getText();

			if (text2.equals(Term3EndMonthYear)) {
				break;
			}

			else {

				NextClick.click();
			}

		}

		getDriver().findElement(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ Term3EndDay + "] "))
				.click();
	}

	public void saveAcademicTerms() {

		SaveAcademic.click();
	}

	public void verfifyDate() {

		WebElementUtils.waitForVisible(StudentMenu);
		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].click()", StudentMenu);

		JavascriptExecutor scrolldown3 = (JavascriptExecutor) getDriver();
		scrolldown3.executeScript("arguments[0].click()", studentEntrySubMenu);
		WebElementUtils.waitForVisible(SchoolInfoTab);
		SchoolInfoTab.click();
		StudentStartDate.click();

		String Term3StartDate = excelutil.getData(40, 1, 7);
		String Term3StartMonthYear, Term3StartDay;
		String dateArray2[] = Term3StartDate.split("-");
		Term3StartDay = dateArray2[0];
		Term3StartMonthYear = dateArray2[1] + " " + dateArray2[2];
		while (true) {

			String text2 = monthYear.getText();

			if (text2.equals(Term3StartMonthYear)) {
				break;
			}

			else {

				NextClick.click();
			}

		}

		int disableCount = getDriver().findElements(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[(contains(@class, 'disabled')) and text()="
						+ Term3StartDay + "] "))
				.size();
		Assert.assertNotEquals(0, disableCount);

	}
}
