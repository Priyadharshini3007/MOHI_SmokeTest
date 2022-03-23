package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.ExcelHelper;
import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class FeeMasterEntry {

	public FeeMasterEntry() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(xpath = "//a[contains(text(),'Student')]")
	WebElement StudentMenu;

	@FindBy(xpath = "//a[contains(text(),'Fee Master Entry')]")
	WebElement FeeMasterEntry;

	@FindBy(xpath = "//button[contains(@class, 'btn-primary right')]")
	WebElement AddFeeButton;

	@FindBy(xpath = "//*[@id='feetypename']")
	WebElement FeeTypeName;

	@FindBy(xpath = "//*[@id='IsEditable']")
	WebElement IsEditable;

	@FindBy(xpath = "//button[contains(@class, 'btn-block')]")
	WebElement Add;

	@FindBy(xpath = "(//input[contains(@class, 'multiselect-search')])[1]")
	WebElement FeeTypeSearch;

	@FindBy(xpath = "(//input[contains(@class, 'multiselect-search')])[2]")
	WebElement AcademicyrSearch;

	@FindBy(xpath = "(//input[contains(@class, 'multiselect-search')])[3]")
	WebElement CenterSearch;

	@FindBy(xpath = "//*[@id='onetime']")
	WebElement OneTime;

	@FindBy(xpath = "//*[@id='monthly']")
	WebElement Monthly;

	@FindBy(xpath = "//*[@id='yearly']")
	WebElement Yearly;

	@FindBy(xpath = "//*[@id='select2-month-container']")
	WebElement MonthDropDown;

	@FindBy(xpath = "//*[@id='termly']")
	WebElement Termly;

	@FindBy(xpath = "//*[@id='select2-Termlydropdown-container']")
	WebElement TermDropDown;

	@FindBy(xpath = "//*[@id='savegift']")
	WebElement Save;

	@FindBy(xpath = "//*[contains(text(),'Cancel')]")
	WebElement Cancel;

	@FindBy(xpath = "//*[@id='IsElder']")
	WebElement IsElder;

	@FindBy(xpath = "//*[@id='IsGender']")
	WebElement IsGender;

	@FindBy(xpath = "//*[@id='prefamily']")
	WebElement PerFamily;

	@FindBy(xpath = "//*[@id='elderamount']")
	WebElement ElderAmount;

	@FindBy(xpath = "//*[@id='maleamt']")
	WebElement MaleAmount;

	@FindBy(xpath = "//*[@id='amount']")
	WebElement Amount;

	@FindBy(xpath = "//*[@id='femaleamt']")
	WebElement FemaleAmount;

	@FindBy(xpath = "(//*[@id='DDLFeeType']//following::button)[1]")
	WebElement FeeType;

	@FindBy(xpath = "(//*[@id='DDLYear']//following::button)[1]")
	WebElement AcademicYear;

	@FindBy(xpath = "(//*[@id='DDLCenter']//following::button)[1]")
	WebElement Center;

	@FindBy(xpath = "(//*[@id='DDLSchool']//following::button)[1]")
	WebElement School;

	@FindBy(xpath = "(//*[@id='DDLClass']//following::button)[1]")
	WebElement Class;

	@FindBy(xpath = "(//button[@class='close text-white'])[1]")
	WebElement Close;

	@FindBy(xpath = "//*[@id='ui-id-2']")
	WebElement FeeTypeListPage;

	@FindBy(xpath = "//*[@type='search']")
	WebElement search;

	@FindBy(xpath = "//td[@class='dataTables_empty']")
	WebElement Empty;

	@FindBy(xpath = "(//div[@class='col-md-12'])[5]")
	WebElement FeeNotAllocatedmsg;

	@FindBy(xpath = "//input[@id='DDLFeeTypeName']")
	WebElement editfield;

	@FindBy(xpath = "//button[@id='btnSaveFeeType']")
	WebElement saveEdit;

	@FindBy(xpath = "//input[@value='multiselect-all']")
	WebElement CentremultiSelect;

	@FindBy(xpath = "(//input[@value='multiselect-all'])[2]")
	WebElement SchoolmultiSelect;

	@FindBy(xpath = "(//input[@value='multiselect-all'])[3]")
	WebElement ClassmultiSelect;

	// Add New Fee

	public void Studentmenu() {

		StudentMenu.click();

	}

	public void FeeMasterEntrySubMenu() throws InterruptedException {

		FeeMasterEntry.click();
		Thread.sleep(5000);

	}

	public void AddFeeButton() {

		AddFeeButton.click();

	}

	public void FeeTypeName() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 1, 0));

	}

	public void FeeTypeNameYR() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 6, 0));

	}

	public void FeeTypeNameMonth() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 10, 0));

	}

	public void PerFamilyFeeTypeNameMonth() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 30, 0));

	}

	public void FeeTypeNameTerm() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 14, 0));

	}

	public void PerFamilyTerm() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 36, 0));

	}

	public void GenderOneTime() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 42, 0));

	}

	public void GenderYearlyFee() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 48, 0));

	}

	public void GenderMonthlyFee() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 54, 0));

	}

	public void GenderTermlyFee() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 60, 0));

	}

	public void ElderOneTimeFee() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 66, 0));

	}

	public void ElderMonthlyFee() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 72, 0));

	}

	public void DeleteFeefrmListPage() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 78, 0));

	}

	public void DeleteFeefrmMasterPage() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 80, 0));

	}

	public void editFeefrmListPage() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 82, 0));

	}

	public void NewFeeNmetovrfyAllCentres() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 89, 0));

	}

	public void NewFeeNmetovrfyEditable() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 91, 0));

	}

	public void NewFeeNmetovrfyNonEditable() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 95, 0));

	}

	public void FeeTypeNamePerFamily() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 18, 0));

	}

	public void FeeTypeNamePerFamilyYearly() {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(FeeTypeName);
		FeeTypeName.sendKeys(excelutil.getData(38, 24, 0));

	}

	public void IsEditable() {

		String t = excelutil.getData(38, 1, 1);
		if (t.equals("Yes")) {
			IsEditable.click();

		}
	}

	public void AddButton() {

		Add.click();

	}

	public void FeeType() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 1, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 1, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void FeeTypeYr() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 6, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 6, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void FeeTypeMonth() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 10, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 10, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void PerFamilyFeeTypeMonth() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 30, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 30, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void FeeTypeTerm() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 14, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 14, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void PerFamilyFeeTypeTerm() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 36, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 36, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void GenderFeeTypeOneTime() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 42, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 42, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void GenderFeeTypeYearly() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 48, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 48, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void GenderFeeTypeMonthly() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 54, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 54, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void GenderFeeTypeTermly() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 60, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 60, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void ElderoneTime() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 66, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 66, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void ElderMonthly() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 72, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 72, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void deleteFrmListPage() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 78, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 78, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void editFrmListPage() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 82, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 82, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void FeeTypePerFamily() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 18, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 18, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void PerFamilyYearly() throws InterruptedException {

		FeeType.click();
		FeeTypeSearch.sendKeys(excelutil.getData(38, 24, 0));

		boolean getElement = getDriver()
				.findElements(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 24, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

		WebElementUtils.waitForVisible(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	// Fee Type Assignment

	public void FeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 1, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[normalize-space(text())='" + excelutil.getData(38, 1, 2) + "']/input"));

		getElement.click();

	}

	public void YrFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 6, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[normalize-space(text())='" + excelutil.getData(38, 6, 2) + "']/input"));

		getElement.click();

	}

	public void perFamilyYrFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 24, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 24, 2) + "')]/input"));
		getElement.click();

	}

	public void MonthFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 10, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[normalize-space(text())='" + excelutil.getData(38, 10, 2) + "']/input"));
		getElement.click();

	}

	public void PerFamilyMonthFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 30, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 30, 2) + "')]/input"));
		getElement.click();

	}

	public void PerFamilyTermlyFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 36, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 36, 2) + "')]/input"));
		getElement.click();

	}

	public void genderOneTimeFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 42, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 42, 2) + "')]/input"));
		getElement.click();

	}

	public void genderYearlyFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 48, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 48, 2) + "')]/input"));
		getElement.click();

	}

	public void genderMonthlylyFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 54, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 54, 2) + "')]/input"));
		getElement.click();

	}

	public void genderTermlyFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 60, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 60, 2) + "')]/input"));
		getElement.click();

	}

	public void ElderOneTimeFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 66, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 66, 2) + "')]/input"));
		getElement.click();

	}

	public void ElderMonthlyTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 72, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 72, 2) + "')]/input"));
		getElement.click();

	}

	public void selectFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 80, 0));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 80, 0) + "')]/input"));
		getElement.click();

	}

	public void termFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 14, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 14, 2) + "')]/input"));
		getElement.click();

	}

	public void perFamilyFeeTypedrpdwn() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 18, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 18, 2) + "')]/input"));
		getElement.click();

	}

	public void academicYrDrpdwn() throws InterruptedException {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 1, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 1, 3) + "')]/input"));
		getElement.click();

	}

	public void yracademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 6, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 6, 3) + "')]/input"));
		getElement.click();

	}

	public void perFamilyYrlyacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 24, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 24, 3) + "')]/input"));
		getElement.click();

	}

	public void monthlyFeeacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 10, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 10, 3) + "')]/input"));
		getElement.click();

	}

	public void PerFamilymonthlyFeeacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 30, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 30, 3) + "')]/input"));
		getElement.click();

	}

	public void PerFamilyTermlyFeeacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 36, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 36, 3) + "')]/input"));
		getElement.click();

	}

	public void GenderOneTimeFeeacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 42, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 42, 3) + "')]/input"));
		getElement.click();

	}

	public void GenderYearlyFeeacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 48, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 48, 3) + "')]/input"));
		getElement.click();

	}

	public void GenderMonthlyFeeacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 54, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 54, 3) + "')]/input"));
		getElement.click();

	}

	public void GenderTermlyFeeacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 60, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 60, 3) + "')]/input"));
		getElement.click();

	}

	public void ElderOneTimeFeeacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 66, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 66, 3) + "')]/input"));
		getElement.click();

	}

	public void ElderMonthlyFeeacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 72, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 72, 3) + "')]/input"));
		getElement.click();

	}

	public void selAcademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 80, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 80, 2) + "')]/input"));
		getElement.click();

	}

	public void termlyFeeacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 14, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 14, 3) + "')]/input"));
		getElement.click();

	}

	public void perFamilyFeeacademicYrDrpdwn() throws InterruptedException {

		AcademicYear.click();

		AcademicyrSearch.sendKeys(excelutil.getData(38, 18, 3));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 18, 3) + "')]/input"));
		getElement.click();

	}

	public void centerDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 1, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void yRcenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 6, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void PerFamilyyRcenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 24, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void monthlyFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 10, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void PerFamilymonthlyFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 30, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void PerFamilyTermlyFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 36, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void genderOneTimeFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 42, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void genderYearlyFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 48, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void genderMonthlyFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 54, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void genderTermlyFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 60, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void elderOneTimeFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 66, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void elderMonthlyFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 72, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void selFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 80, 3).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void selFeecenterToVerifyEditable() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 91, 1).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void selFeecenterToVerifyNonEditable() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 95, 1).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void termlyFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 14, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void PerFamilyFeecenterDrpdwn() {

		Center.click();

		String[] centerChkBox = excelutil.getData(38, 18, 4).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void schoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 1, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void yRschoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 6, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void PerFamilyyRschoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 24, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void monthlySchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 10, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void PerFamilymonthlySchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 30, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void PerFamilyTermlySchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 36, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void genderOneTimeSchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 42, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void genderYearlySchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 48, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void genderMonthlySchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 54, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void genderTermlySchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 60, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void elderOneTimeSchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 66, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void elderMonthlySchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 72, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void selSchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 80, 4).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void selSchoolDrpdwnToVerifyEditable() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 91, 2).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void selSchoolDrpdwnToVerifyNonEditable() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 95, 2).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void TermlySchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 14, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void perFamilySchoolDrpdwn() {

		School.click();

		String[] schoolChkBox = excelutil.getData(38, 18, 5).split(",");

		for (int i = 0; i < schoolChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + schoolChkBox[i] + "')]/input")).click();

		}

	}

	public void classDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 1, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void classDrpdwnToVerifyEditable() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 91, 3).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void classDrpdwnToVerifyNonEditable() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 95, 3).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void yRclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 6, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void PerFamilyyRclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 24, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void montlyFeeclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 10, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void PerFamilymontlyFeeclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 30, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void PerFamilyTermlyFeeclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 36, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void genderOneTimeFeeclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 42, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void genderYearlyFeeclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 48, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void genderMonthlyFeeclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 54, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void genderTermlyFeeclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 60, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void elderOneTimeFeeclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 66, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void elderMonthlyFeeclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 72, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void selFeeclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 80, 5).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void termlyFeeclassDrpdwn() {

		Class.click();

		String[] classChkBox = excelutil.getData(38, 14, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i] + "')]/input")).click();

		}

	}

	public void perFamilyFeeclassDrpdwn() throws InterruptedException {

		Class.click();

		Thread.sleep(3000);
		String[] classChkBox = excelutil.getData(38, 18, 6).split(",");

		for (int i = 0; i < classChkBox.length; i++) {
			System.out.println(classChkBox[0].trim());
			System.out.println(classChkBox[1].trim());
			getDriver().findElement(By.xpath("//label[contains(text(),'" + classChkBox[i].trim() + "')]/input"))
					.click();

		}

	}

	public void enterAmount() {

		Amount.sendKeys(excelutil.getData(38, 1, 7));

	}

	public void yrenterAmount() {

		Amount.sendKeys(excelutil.getData(38, 6, 7));

	}

	public void PerFamilyYrenterAmount() {

		Amount.sendKeys(excelutil.getData(38, 24, 7));

	}

	public void monthlyFeeEnterAmount() {

		Amount.sendKeys(excelutil.getData(38, 10, 7));

	}

	public void PerFamilymonthlyFeeEnterAmount() {

		Amount.sendKeys(excelutil.getData(38, 30, 7));

	}

	public void PerFamilyTermlyFeeEnterAmount() {

		Amount.sendKeys(excelutil.getData(38, 36, 7));

	}

	public void FemaleFee() {

		FemaleAmount.sendKeys(excelutil.getData(38, 46, 7));

	}

	public void YearlyFemaleFee() {

		FemaleAmount.sendKeys(excelutil.getData(38, 52, 7));

	}

	public void MonthlyFemaleFee() {

		FemaleAmount.sendKeys(excelutil.getData(38, 58, 7));

	}

	public void TermlyFemaleFee() {

		FemaleAmount.sendKeys(excelutil.getData(38, 64, 7));

	}

	public void maleFee() {

		MaleAmount.sendKeys(excelutil.getData(38, 44, 7));

	}

	public void YearlymaleFee() {

		MaleAmount.sendKeys(excelutil.getData(38, 50, 7));

	}

	public void MonthlymaleFee() {

		MaleAmount.sendKeys(excelutil.getData(38, 56, 7));

	}

	public void TermlymaleFee() {

		MaleAmount.sendKeys(excelutil.getData(38, 62, 7));

	}

	public void ElderFee() {

		ElderAmount.sendKeys(excelutil.getData(38, 68, 6));

	}

	public void ElderMonthFee() {

		ElderAmount.sendKeys(excelutil.getData(38, 74, 6));

	}

	public void YoungerFee() {

		Amount.sendKeys(excelutil.getData(38, 70, 6));

	}

	public void YoungerMonthFee() {

		Amount.sendKeys(excelutil.getData(38, 76, 6));

	}

	public void termlyFeeEnterAmount() {

		Amount.sendKeys(excelutil.getData(38, 14, 7));

	}

	public void perFamilyFeeEnterAmount() {

		Amount.sendKeys(excelutil.getData(38, 18, 7));

	}

	public void oneTime() {

		String t = excelutil.getData(38, 1, 8);
		if (t.equals("One Time")) {

			WebElementUtils.scrolltoview(Save);
			OneTime.click();

		}

	}

	public void PerFamilychkbox() {

		String t = excelutil.getData(38, 18, 11);
		if (t.equals("Per Family")) {

			PerFamily.click();

		}

	}

	public void isGenderchkbox() {

		String t = excelutil.getData(38, 44, 6);
		if (t.equals("IsGender")) {

			IsGender.click();

		}

	}

	public void elderchkbox() {

		String t = excelutil.getData(38, 68, 7);
		if (t.equals("Elder")) {

			IsElder.click();

		}

	}

	public void Yearly() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		String t = excelutil.getData(38, 6, 8);
		if (t.equals("Yearly")) {

			WebElementUtils.scrolltoview(Save);
			Yearly.click();

			MonthDropDown.click();

			Thread.sleep(2000);

			srchbox.sendKeys((excelutil.getData(38, 6, 12)));

			srchbox.sendKeys(Keys.ENTER);

		}

	}

	public void Monthly() {

		String t = excelutil.getData(38, 10, 8);
		if (t.equals("Monthly")) {

			WebElementUtils.scrolltoview(Save);
			Monthly.click();

		}

	}

	public void Termly() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		String t = excelutil.getData(38, 14, 8);
		if (t.equals("Termly")) {

			WebElementUtils.scrolltoview(Save);
			Termly.click();

			TermDropDown.click();

			Thread.sleep(2000);

			srchbox.sendKeys((excelutil.getData(38, 14, 12)));

			srchbox.sendKeys(Keys.ENTER);

		}

	}

	public void SaveFee() {

		WebElementUtils.scrolltoview(Save);

		Save.click();

		if (this.isAlertPresent()) {
			Alert a = getDriver().switchTo().alert();
			a.accept();

		}

	}

	public boolean isAlertPresent() {
		try {
			getDriver().switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch
	}

	// Fee Master Page Elements

	@FindBy(xpath = "//*[@id='select2-ddlfeetypefilter-container']")
	WebElement MasterFeeType;

	@FindBy(xpath = "//*[@class='select2-search__field']")
	WebElement srchbox;

	@FindBy(xpath = "//*[@id='select2-ddlyearfilter-container']")
	WebElement MasterAcademicYr;

	@FindBy(xpath = "//*[@id='select2-ddlCenterName-container']")
	WebElement MasterCenter;

	@FindBy(xpath = "//*[@id='select2-ddlSchool-container']")
	WebElement MasterSchool;

	@FindBy(xpath = "//*[@id='select2-ddlClass-container']")
	WebElement MasterClass;

	@FindBy(xpath = "//*[@class='dataTables_empty']")
	WebElement EmptyRecord;

	public void verifyAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 1, 2));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//li[normalize-space(text())='" + excelutil.getData(38, 1, 2) + "']"));

		getElement.click();

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 1, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 1, 9));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 1, 10));

		srchbox.sendKeys(Keys.ENTER);

		MasterClass.click();

		srchbox.sendKeys(excelutil.getData(38, 1, 11));

		srchbox.sendKeys(Keys.ENTER);

		boolean getElement1 = getDriver()
				.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 1, 2) + "']"))
				.size() != 0;

		Assert.assertEquals(true, getElement1);

	}

	public void verifyYrlyAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 6, 2));
		
		WebElement getElement = getDriver()
				.findElement(By.xpath("//li[normalize-space(text())='" + excelutil.getData(38, 6, 2) + "']"));

		getElement.click();

		//srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 6, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 6, 9));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 6, 10));

		srchbox.sendKeys(Keys.ENTER);

		MasterClass.click();

		srchbox.sendKeys(excelutil.getData(38, 6, 11));

		srchbox.sendKeys(Keys.ENTER);

		boolean getElement1 = getDriver()
				.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 6, 2) + "']"))
				.size() != 0;

		Assert.assertEquals(true, getElement1);

	}

	public void verifyMonthlyAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 10, 2));
		
		WebElement getElement = getDriver()
				.findElement(By.xpath("//li[normalize-space(text())='" + excelutil.getData(38, 10, 2) + "']"));

		getElement.click();

		//srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 10, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 10, 9));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 10, 10));

		srchbox.sendKeys(Keys.ENTER);

		MasterClass.click();

		srchbox.sendKeys(excelutil.getData(38, 10, 11));

		srchbox.sendKeys(Keys.ENTER);

		boolean getElement1 = getDriver()
				.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 10, 2) + "']"))
				.size() != 0;

		Assert.assertEquals(true, getElement1);

	}

	// String exp = "No Fee Request available in table".trim();
	// String text = EmptyRecord.getText();
	// Assert.assertEquals(text, exp);

	public void verifyTermlyAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 14, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 14, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 14, 9));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 14, 10));

		srchbox.sendKeys(Keys.ENTER);

		MasterClass.click();

		srchbox.sendKeys(excelutil.getData(38, 14, 11));

		srchbox.sendKeys(Keys.ENTER);

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 14, 2) + "']"))
				.size() != 0;

		Assert.assertEquals(true, getElement);

	}

	public void verifyPerFamilyAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 18, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 18, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 18, 8));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 18, 9));

		srchbox.sendKeys(Keys.ENTER);

		String[] classChkBox = excelutil.getData(38, 18, 10).split(",");

		for (int i = 0; i < classChkBox.length; i++) {

			MasterClass.click();
			Thread.sleep(2000);
			getDriver().findElement(By.xpath(
					"//*[contains(@class, 'select2-results__option')][contains(text(),'" + classChkBox[i] + "')]"))
					.click();
		}

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 18, 2) + "']"))
				.size() != 0;

		Assert.assertEquals(true, getElement);

	}

	public void verifyPerFamilyMonthlyAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 30, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 30, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 30, 8));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 30, 9));

		srchbox.sendKeys(Keys.ENTER);

		String[] classChkBox = excelutil.getData(38, 30, 10).split(",");

		for (int i = 0; i < classChkBox.length; i++) {

			MasterClass.click();
			Thread.sleep(2000);
			getDriver().findElement(By.xpath(
					"//*[contains(@class, 'select2-results__option')][contains(text(),'" + classChkBox[i] + "')]"))
					.click();
		}

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 30, 2) + "']"))
				.size() != 0;

		Assert.assertEquals(true, getElement);

	}

	public void verifyPerFamilyTermlyAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 36, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 36, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 36, 8));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 36, 9));

		srchbox.sendKeys(Keys.ENTER);

		String[] classChkBox = excelutil.getData(38, 36, 10).split(",");

		for (int i = 0; i < classChkBox.length; i++) {

			MasterClass.click();
			Thread.sleep(2000);
			getDriver().findElement(By.xpath(
					"//*[contains(@class, 'select2-results__option')][contains(text(),'" + classChkBox[i] + "')]"))
					.click();
			boolean getElement = getDriver()
					.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 36, 2) + "']"))
					.size() != 0;

			Assert.assertEquals(true, getElement);
		}
	}

	public void GenderOneTimeAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 42, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 42, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 42, 7));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 42, 8));

		srchbox.sendKeys(Keys.ENTER);

		String[] classChkBox = excelutil.getData(38, 42, 9).split(",");

		for (int i = 0; i < classChkBox.length; i++) {

			MasterClass.click();
			Thread.sleep(2000);
			getDriver().findElement(By.xpath(
					"//*[contains(@class, 'select2-results__option')][contains(text(),'" + classChkBox[i] + "')]"))
					.click();

			boolean getElement = getDriver()
					.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 42, 2) + "']"))
					.size() != 0;

			Assert.assertEquals(true, getElement);

		}
	}

	public void GenderYearlyAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 48, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 48, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 48, 7));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 48, 8));

		srchbox.sendKeys(Keys.ENTER);

		String[] classChkBox = excelutil.getData(38, 48, 9).split(",");

		for (int i = 0; i < classChkBox.length; i++) {

			MasterClass.click();
			Thread.sleep(2000);
			getDriver().findElement(By.xpath(
					"//*[contains(@class, 'select2-results__option')][contains(text(),'" + classChkBox[i] + "')]"))
					.click();

			boolean getElement = getDriver()
					.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 48, 2) + "']"))
					.size() != 0;

			Assert.assertEquals(true, getElement);
		}
	}

	public void GenderMonthlyAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 54, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 54, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 54, 7));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 54, 8));

		srchbox.sendKeys(Keys.ENTER);

		String[] classChkBox = excelutil.getData(38, 54, 9).split(",");

		for (int i = 0; i < classChkBox.length; i++) {

			MasterClass.click();
			Thread.sleep(2000);
			getDriver().findElement(By.xpath(
					"//*[contains(@class, 'select2-results__option')][contains(text(),'" + classChkBox[i] + "')]"))
					.click();

			boolean getElement = getDriver()
					.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 54, 2) + "']"))
					.size() != 0;

			Assert.assertEquals(true, getElement);
		}

	}

	public void GenderTermlyAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 60, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 60, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 60, 7));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 60, 8));

		srchbox.sendKeys(Keys.ENTER);

		String[] classChkBox = excelutil.getData(38, 60, 9).split(",");

		for (int i = 0; i < classChkBox.length; i++) {

			MasterClass.click();
			Thread.sleep(2000);
			getDriver().findElement(By.xpath(
					"//*[contains(@class, 'select2-results__option')][contains(text(),'" + classChkBox[i] + "')]"))
					.click();

			boolean getElement = getDriver()
					.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 60, 2) + "']"))
					.size() != 0;

			Assert.assertEquals(true, getElement);

		}
	}

	public void ElderOneTimeAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 66, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 66, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 66, 7));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 66, 8));

		srchbox.sendKeys(Keys.ENTER);

		String[] classChkBox = excelutil.getData(38, 66, 9).split(",");

		for (int i = 0; i < classChkBox.length; i++) {

			MasterClass.click();
			Thread.sleep(2000);
			getDriver().findElement(By.xpath(
					"//*[contains(@class, 'select2-results__option')][contains(text(),'" + classChkBox[i] + "')]"))
					.click();
			boolean getElement = getDriver()
					.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 66, 2) + "']"))
					.size() != 0;

			Assert.assertEquals(true, getElement);

		}
	}

	public void ElderMonthAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 72, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 72, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 72, 7));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 72, 8));

		srchbox.sendKeys(Keys.ENTER);

		String[] classChkBox = excelutil.getData(38, 72, 9).split(",");

		for (int i = 0; i < classChkBox.length; i++) {

			MasterClass.click();
			Thread.sleep(2000);
			getDriver().findElement(By.xpath(
					"//*[contains(@class, 'select2-results__option')][contains(text(),'" + classChkBox[i] + "')]"))
					.click();

			boolean getElement = getDriver()
					.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 72, 2) + "']"))
					.size() != 0;

			Assert.assertEquals(true, getElement);
		}

	}

	public void filterToDeleteFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 80, 0));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 80, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 80, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 80, 4));

		srchbox.sendKeys(Keys.ENTER);

		MasterClass.click();

		srchbox.sendKeys(excelutil.getData(38, 80, 8));

		srchbox.sendKeys(Keys.ENTER);

	}

	public void getText() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 72, 7));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 72, 8));

		srchbox.sendKeys(Keys.ENTER);

		MasterClass.click();

		srchbox.sendKeys(BaseClass.classinfo);

		srchbox.sendKeys(Keys.ENTER);

	}

	public void getTextForTransfer(String promotionType) throws InterruptedException {
		if (promotionType.trim().toLowerCase().equals("inschoolpromotion")) {
			getTextForTransfer(1);
		} else if (promotionType.trim().toLowerCase().equals("detainment")) {
			getTextForTransfer(2);
		} else if (promotionType.trim().toLowerCase().equals("sectionchange")) {
			getTextForTransfer(3);
		} else if (promotionType.trim().toLowerCase().equals("highschoolpromotion")) {
			getTextForTransfer(4);
		} else if (promotionType.trim().toLowerCase().equals("transfer")) {
			getTextForTransfer(7);
		} else {
			System.out.println("Please enter valid promotionType. " + promotionType + " is not a valid one.");
			Assert.assertTrue(false);
		}
	}

	public void getTextForTransfer(int rowNo) throws InterruptedException {

		if (rowNo == 7) {
			MasterCenter.click();

			srchbox.sendKeys(BaseClass.transfercenter);

			srchbox.sendKeys(Keys.ENTER);

			MasterSchool.click();

			srchbox.sendKeys(BaseClass.TransferSchool);

			srchbox.sendKeys(Keys.ENTER);

			MasterClass.click();

			srchbox.sendKeys(BaseClass.clsname);

			srchbox.sendKeys(Keys.ENTER);

		}

		else {

			WebElementUtils.waitForVisible(MasterFeeType);

			Thread.sleep(3000);

			MasterCenter.click();

			srchbox.sendKeys(ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx", "Promotion", rowNo, 1));

			srchbox.sendKeys(Keys.ENTER);

			MasterSchool.click();

			srchbox.sendKeys(ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx", "Promotion", rowNo, 2));

			srchbox.sendKeys(Keys.ENTER);

			MasterClass.click();

			srchbox.sendKeys(BaseClass.transferClass);

			srchbox.sendKeys(Keys.ENTER);

		}
	}

	public void verifyPerFamilyYrlyAddedFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		srchbox.sendKeys(excelutil.getData(38, 24, 2));

		srchbox.sendKeys(Keys.ENTER);

		MasterAcademicYr.click();

		srchbox.sendKeys(excelutil.getData(38, 24, 3));

		srchbox.sendKeys(Keys.ENTER);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 24, 8));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 24, 9));

		srchbox.sendKeys(Keys.ENTER);

		String[] classChkBox = excelutil.getData(38, 24, 10).split(",");

		for (int i = 0; i < classChkBox.length; i++) {

			MasterClass.click();
			Thread.sleep(2000);
			getDriver().findElement(By.xpath(
					"//*[contains(@class, 'select2-results__option')][contains(text(),'" + classChkBox[i] + "')]"))
					.click();

			boolean getElement = getDriver()
					.findElements(By.xpath("//td[normalize-space(text())='" + excelutil.getData(38, 24, 2) + "']"))
					.size() != 0;

			Assert.assertEquals(true, getElement);

		}

	}

	// Recruitment Form verification

	public void NewFeeBox() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 1, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void newOneTimeFeeInFeePage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//*[contains(text(),'" + excelutil.getData(38, 1, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void NewYrlyFeeBox() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 6, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void NewmonthlyFeeBoxinHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 10, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void NewTermlyFeeBoxinHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 14, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void PerFamilyMonthlyPreRequisteFeeBoxinHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 30, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void PerFamilyTermlyPreRequisteFeeBoxinHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 36, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void PerFamilyTermlyFeeBoxinHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 36, 0) + "')]")).size() == 0;

		Assert.assertEquals(true, getElement);
	}

	public void NewFeeEditable() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElement(By.xpath(
						"//div[contains(text(),'" + excelutil.getData(38, 91, 0) + "')]/following-sibling::div//input"))
				.isEnabled();

		Assert.assertEquals(true, getElement);
	}

	public void NewFeeNonEditable() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElement(By.xpath(
						"//div[contains(text(),'" + excelutil.getData(38, 95, 0) + "')]/following-sibling::div//input"))
				.isEnabled();

		Assert.assertEquals(false, getElement);
	}

	public void IsGenderMaleFeeInHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 42, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

	}

	public void IsGenderMaleYearlyFeeInHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 48, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

	}

	public void IsGenderMaleMonthlyFeeInHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 54, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

	}

	public void IsGenderMaleTermlyFeeInHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 60, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

	}

	public void GenderOneTimeFeeInHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 66, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

	}

	public void ElderMonthlyFeeInHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 72, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);

	}

	public void maleAmtVerificationInHTPage() {

		String maleAmount = excelutil.getData(38, 44, 7);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 42, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(maleAmount, element);

	}

	public void maleYrlyAmtVerificationInHTPage() {

		String maleAmount = excelutil.getData(38, 50, 7);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 48, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(maleAmount, element);

	}

	public void maleMonthlyAmtVerificationInHTPage() {

		String maleAmount = excelutil.getData(38, 56, 7);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 54, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(maleAmount, element);

	}

	public void maleTermlyAmtVerificationInHTPage() {

		String maleAmount = excelutil.getData(38, 62, 7);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 60, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(maleAmount, element);

	}

	public void FemaleMonthlyAmtVerificationInHTPage() {

		String maleAmount = excelutil.getData(38, 58, 7);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 54, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(maleAmount, element);

	}

	public void FemaleTermlyAmtVerificationInHTPage() {

		String maleAmount = excelutil.getData(38, 64, 7);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 60, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(maleAmount, element);

	}

	public void ElderFeeOneTimeFeeVrfyInHTPage() {

		String ElderAmount = excelutil.getData(38, 68, 6);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 66, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(ElderAmount, element);

	}

	public void ElderMonthlyFeeVrfyInHTPage() {

		String ElderAmount = excelutil.getData(38, 74, 6);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 72, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(ElderAmount, element);

	}

	public void youngerMonthlyFeeVrfyInHTPage() {

		String ElderAmount = excelutil.getData(38, 76, 6);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 72, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(ElderAmount, element);

	}

	public void youngerFeeOneTimeFeeVrfyInHTPage() {

		String ElderAmount = excelutil.getData(38, 70, 6);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 66, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(ElderAmount, element);

	}

	public void FemaleYrlyAmtVerificationInHTPage() {

		String maleAmount = excelutil.getData(38, 52, 7);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 48, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(maleAmount, element);

	}

	public void FemaleAmtVerificationInHTPage() {

		String FemaleAmount = excelutil.getData(38, 46, 7);

		String element = getDriver().findElement(By.xpath("//input[@id='" + excelutil.getData(38, 42, 0) + "']"))
				.getAttribute("value");

		Assert.assertEquals(FemaleAmount, element);

	}

	public void NewPerFamilyFeeBoxinHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 18, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void NewPerFamilyYRFeeBoxinHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 24, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void oneTimePerFamilyFeeBoxinHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 18, 0) + "')]")).size() == 0;

		Assert.assertEquals(true, getElement);
	}

	public void yearlyPerFamilyFeeBoxinHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 24, 0) + "')]")).size() == 0;

		Assert.assertEquals(true, getElement);
	}

	public void monthlyPerFamilyFeeBoxinHTPage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//div[contains(text(),'" + excelutil.getData(38, 30, 0) + "')]")).size() == 0;

		Assert.assertEquals(true, getElement);
	}

	public void yearlyPerFamilyFeeBoxinFeePage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 24, 0) + "')]")).size() == 0;

		Assert.assertEquals(true, getElement);
	}

	public void NewYrlyFeeBoxInFeePage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//*[contains(text(),'" + excelutil.getData(38, 6, 0) + "')]")).size() != 0;

		if (getElement) {

			Assert.assertEquals(true, getElement);
		}
	}

	public void NewMonthlyFeeBoxInFeePage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//*[contains(text(),'" + excelutil.getData(38, 10, 0) + "')]")).size() == 0;

		if (getElement) {

			Assert.assertEquals(true, getElement);
		}
	}

	public void NewTermlyFeeBoxInFeePage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//*[contains(text(),'" + excelutil.getData(38, 14, 0) + "')]")).size() == 0;

		if (getElement) {

			Assert.assertEquals(true, getElement);
		}
	}

	public void perFamilyMonthlyInFeePage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//*[contains(text(),'" + excelutil.getData(38, 30, 0) + "')]")).size() == 0;

		if (getElement) {

			Assert.assertEquals(true, getElement);
		}
	}

	public void PerFamilyMnthlyPreRequisteFeeBoxInFeePage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//*[contains(text(),'" + excelutil.getData(38, 30, 0) + "')]")).size() == 0;

		if (getElement) {

			Assert.assertEquals(true, getElement);
		}
	}

	public void PerFamilyTermlyPreRequisteFeeBoxInFeePage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//*[contains(text(),'" + excelutil.getData(38, 36, 0) + "')]")).size() == 0;

		if (getElement) {

			Assert.assertEquals(true, getElement);
		}
	}

	public void PerFamilyTermlyFeeBoxInFeePage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//*[contains(text(),'" + excelutil.getData(38, 36, 0) + "')]")).size() == 0;

		if (getElement) {

			Assert.assertEquals(true, getElement);
		}
	}

	public void newPerFamilyOneTimeFeeTypeInFeePage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//*[contains(text(),'" + excelutil.getData(38, 18, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void newPerFamilyYrlyFeeTypeInFeePage() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//*[contains(text(),'" + excelutil.getData(38, 24, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void NewMonthlyFeeBoxInFeePageafterActive() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 10, 0) + "')]")).size() != 0;

		if (getElement) {

			Assert.assertEquals(true, getElement);
		}
	}

	public void NewTermlyFeeBoxInFeePageafterActive() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		String Excel = excelutil.getData(38, 14, 0);

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 14, 0) + "')]")).size() != 0;

		System.out.println(getElement);

		System.out.println(Excel);

		Assert.assertEquals(true, getElement);
	}

	public void PerFAmilyMonthlyInFeePageafterActivesibling() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 30, 0) + "')]")).size() == 0;

		Assert.assertEquals(true, getElement);
	}

	public void PerFamilyFeeBoxInFeePageafterActivePreRequiste() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 30, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void PerFamilyTermlyFeeBoxInFeePageafterActivePreRequiste() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 36, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void PerFamilyTermlyFeeBoxInFeePageafterActive() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 36, 0) + "')]")).size() == 0;

		Assert.assertEquals(true, getElement);
	}

	public void GenderMonthlyFeeBoxInFeePageafterActive() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 54, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void GenderTermlyFeeBoxInFeePageafterActive() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 60, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void ElderMonthlyFeeBoxInFeePageafterActive() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 72, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void GenderMaleOneTimeInFeePageB4Active() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 42, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void GenderMaleYearlyInFeePageB4Active() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 48, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void GenderMaleMonthlylyInFeePageB4Active() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 54, 0) + "')]")).size() == 0;

		Assert.assertEquals(true, getElement);
	}

	public void GenderMaleTermlyInFeePageB4Active() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 60, 0) + "')]")).size() == 0;

		Assert.assertEquals(true, getElement);
	}

	public void ElderOneTimeAmtInFeePageB4Active() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 66, 0) + "')]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	public void ElderMonthlyAmtInFeePageB4Active() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		boolean getElement = getDriver()
				.findElements(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 72, 0) + "')]")).size() == 0;

		Assert.assertEquals(true, getElement);
	}

	public void getAssignedfromFeeMaster() throws InterruptedException {

		int t = getDriver().findElements(By.xpath("//table[@id='FeeTable']//tr//td[6]")).size();

		for (int i = 0; i < t; i++) {
			String getValue1 = getDriver()
					.findElement(By.xpath("(//table[@id='FeeTable']//tr//td[6])[" + (i + 1) + "]")).getText();

			String PerFamilyValue1 = getDriver()
					.findElement(By.xpath("(//table[@id='FeeTable']//tr//td[10])[" + (i + 1) + "]")).getText();

			// String PerFamilyTerm1 = getDriver()
			// .findElement(By.xpath("(//table[@id='FeeTable']//tr//td[9])[" +
			// (i + 1) + "]")).getText();

			String getValue = getDriver().findElement(By.xpath("(//table[@id='FeeTable']//tr//td[1])[" + (i + 1) + "]"))
					.getText();

			if (getValue1.isEmpty() && PerFamilyValue1.isEmpty()) {

				System.out.println(getValue);
				BaseClass.feeTypelst.add(getValue.trim());

			}

			else {
				BaseClass.excludefeeTypelst.add(getValue.trim());
			}

		}

	}

	public void verifynewstructurefee() {
		Collections.sort(BaseClass.feeTypelst, Collections.reverseOrder());
		Collections.sort(BaseClass.htlst, Collections.reverseOrder());
		Assert.assertArrayEquals(BaseClass.feeTypelst.toArray(), BaseClass.htlst.toArray());
	}

	public void httransferlist() throws InterruptedException {

		int t = getDriver().findElements(By.xpath("//div[@class='col-lg-5 col-md-5 col-sm-5']/i/parent::div")).size();
		for (int i = 0; i < t; i++) {

			String getValue1 = getDriver()
					.findElement(
							By.xpath("(//div[@class='col-lg-5 col-md-5 col-sm-5']/i/parent::div)[" + (i + 1) + "]"))
					.getText().split("\\(")[0];
			System.out.println(getValue1);
			BaseClass.htlst.add(getValue1.trim());

		}
	}

	public void getTextfromHTTransfer() throws InterruptedException {

		int t = getDriver().findElements(By.xpath("//div[@class='col-lg-5 col-md-5 col-sm-5']/i/parent::div")).size();
		for (int i = 0; i < t; i++) {

			String getValue1 = getDriver()
					.findElement(
							By.xpath("(//div[@class='col-lg-5 col-md-5 col-sm-5']/i/parent::div)[" + (i + 1) + "]"))
					.getText().split("\\(")[0];
			System.out.println(getValue1);
			BaseClass.Transferlst.add(getValue1.trim());

		}

		ArrayList<String> result = new ArrayList<String>();

		for (String person : BaseClass.Transferlst) {

			boolean test = BaseClass.excludefeeTypelst.contains(person);

			if (!test) {

				result.add(person);
			}
		}
		System.out.println(result);
		System.out.println(BaseClass.feeTypelst);
		Collections.sort(BaseClass.feeTypelst, Collections.reverseOrder());
		Collections.sort(result, Collections.reverseOrder());

		Assert.assertArrayEquals(BaseClass.feeTypelst.toArray(), result.toArray());

	}

	public void getTextfromHT() throws InterruptedException {

		int t = getDriver().findElements(By.xpath("//div[@class='col-lg-5 col-md-5 col-sm-5']/i/parent::div")).size();
		for (int i = 0; i < t; i++) {

			String getValue1 = getDriver()
					.findElement(
							By.xpath("(//div[@class='col-lg-5 col-md-5 col-sm-5']/i/parent::div)[" + (i + 1) + "]"))
					.getText().split("\\(")[0];
			System.out.println(getValue1);
			BaseClass.readmitlst.add(getValue1.trim());

		}
		Collections.sort(BaseClass.feeTypelst, Collections.reverseOrder());
		Collections.sort(BaseClass.readmitlst, Collections.reverseOrder());
		Assert.assertArrayEquals(BaseClass.feeTypelst.toArray(), BaseClass.readmitlst.toArray());

	}

	public void FeeTypeListPageNavigaion() {

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeTypeListPage);

		// FeeTypeListPage.click();

	}

	public void FeeTypeListSearch() {

		search.sendKeys(excelutil.getData(38, 78, 0));

	}

	public void FeeTypeListSearchToEdit() {

		search.sendKeys(excelutil.getData(38, 82, 0));

	}

	public void deleteFeeTypeListSearch() {

		WebElement getElement = getDriver().findElement(By.xpath(
				"(//td[contains(text(),'" + excelutil.getData(38, 78, 0) + "')]/following-sibling::td[1]//i)[1]"));
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", getElement);

		Alert a = getDriver().switchTo().alert();
		a.accept();

	}

	public void editFeeTypeListSearch() {

		WebElement getElement = getDriver().findElement(By.xpath(
				"(//td[contains(text(),'" + excelutil.getData(38, 82, 0) + "')]/following-sibling::td[1]//i)[2]"));
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", getElement);

		WebElementUtils.waitForVisible(editfield);

		editfield.clear();

		editfield.sendKeys(excelutil.getData(38, 82, 2));

		saveEdit.click();

	}

	public void srchEditedFeeTypeListVrfy() {

		WebElementUtils.waitForVisible(search);

		search.sendKeys(excelutil.getData(38, 82, 2));

	}

	public void editedFeeTypeListVrfy() {

		String getElement = getDriver()
				.findElement(By.xpath("//td[contains(text(),'" + excelutil.getData(38, 82, 2) + "')]")).getText();

		String srchbox = getDriver().findElement(By.xpath("//*[@type='search']")).getAttribute("value");

		Assert.assertEquals(srchbox, getElement);

	}

	public void deleteFeeTypeListVrfy() {

		WebElementUtils.waitForVisible(search);

		search.sendKeys(excelutil.getData(38, 78, 0));

		String exp = "No data matching records found";
		String text = Empty.getText();
		Assert.assertEquals(text, exp);

	}

	public void deleteFeeTypeMasterPage() {

		WebElement getElement = getDriver().findElement(By.xpath(
				"(//td[contains(text(),'" + excelutil.getData(38, 80, 0) + "')]/following-sibling::td[14]//i)[1]"));
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", getElement);

		Alert a = getDriver().switchTo().alert();
		a.accept();

	}

	public void deleteFeeTypevrfyMasterPage() {

		String exp = "No Fee Request available in table";
		String text = Empty.getText();
		Assert.assertEquals(text, exp);

	}

	public void testCentreToDeleteAllFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterCenter.click();

		srchbox.sendKeys(excelutil.getData(38, 85, 0));

		srchbox.sendKeys(Keys.ENTER);

		MasterSchool.click();

		srchbox.sendKeys(excelutil.getData(38, 85, 1));

		srchbox.sendKeys(Keys.ENTER);

		MasterClass.click();

		srchbox.sendKeys(excelutil.getData(38, 85, 2));

		srchbox.sendKeys(Keys.ENTER);

	}

	public void verifyExistingFee() {

		int t = getDriver().findElements(By.xpath("//button[@href]//i")).size();

		if (t != 0) {

			for (int i = 0; i < t; i++) {

				WebElement getValue1 = getDriver()
						.findElement(By.xpath("(//tbody//tr[1]/td//button[@href]/parent::td//button//i)[1]"));

				getValue1.click();

				Alert a = getDriver().switchTo().alert();
				a.accept();
			}
		}

		else {

			String exp = "No Fee Request available in table";
			String text = Empty.getText();
			Assert.assertEquals(text, exp);

		}

	}

	public void verifyHTSubmitForm() {

		String exp = "Fee is not allocated for this center, school and section";
		String text = FeeNotAllocatedmsg.getText();
		System.out.println(text);
		Assert.assertEquals(text, exp);

	}

	public void verifyAddedFeeAcrossAllCentre() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(MasterFeeType);

		Thread.sleep(3000);

		MasterFeeType.click();

		Thread.sleep(2000);

		WebElement getElement = getDriver()
				.findElement(By.xpath("(//option[text()='" + excelutil.getData(38, 89, 0) + "'])[1]"));
		WebElementUtils.waitForVisible(getElement);

		getElement.click();

	}

	public void verifyFeeAddedForAllCentre() {

		MasterCenter.click();

		int t = getDriver().findElements(By.xpath("//li[@class='select2-results__option']")).size();

		System.out.println(t);

		if (t != 0) {

			for (int i = 0; i < t; i++) {

				WebElement getElement = getDriver()
						.findElement(By.xpath("(//li[@class='select2-results__option'])[" + (i + 1) + "]"));
				;

				getElement.click();

				boolean getElement1 = getDriver().findElements(By.xpath("//button[@href]//i")).size() != 0;

				Assert.assertEquals(true, getElement1);

				MasterCenter.click();

			}
		}
	}

	public void NewFeeForAllCentre() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 89, 0));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 89, 0) + "')]/input"));
		getElement.click();

	}

	public void NewFeeAddedEditable() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 91, 0));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 91, 0) + "')]/input"));
		getElement.click();

	}

	public void NewFeeAddedNonEditable() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		FeeTypeSearch.sendKeys(excelutil.getData(38, 95, 0));

		WebElement getElement = getDriver()
				.findElement(By.xpath("//label[contains(text(),'" + excelutil.getData(38, 95, 0) + "')]/input"));
		getElement.click();

	}

	public void selectAllCentre() {

		Center.click();
		CentremultiSelect.click();

	}

	public void selectAllSchool() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", School);

		Thread.sleep(5000);

		JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
		jse1.executeScript("arguments[0].click()", SchoolmultiSelect);

	}

	public void selectAllClass() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Class);

		Thread.sleep(5000);

		JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
		jse1.executeScript("arguments[0].click()", ClassmultiSelect);

	}

	public void ExistingFeeType() {

		WebElementUtils.waitForVisible(FeeType);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FeeType);

		WebElement getElement = getDriver().findElement(By.xpath("(//input[@type='radio'])[2]"));
		getElement.click();

	}

	public void ToastMessageVerification() {

		boolean toaster = getDriver().findElements(By.xpath("//*[@id='toaster']")).size() != 0;

		Assert.assertEquals(true, toaster);

	}

	public void closeScreen() {

		WebElementUtils.waitForVisible(Close);

		WebElementUtils.scrolltoview(Close);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Close);

	}

	public void ElderCheckBox() {

		WebElementUtils.waitForVisible(IsElder);

		IsElder.click();

		boolean IsGender = getDriver().findElement(By.xpath("//*[@id='IsGender']")).isEnabled();

		Assert.assertEquals(false, IsGender);

		boolean PerFamily = getDriver().findElement(By.xpath("//*[@id='prefamily']")).isEnabled();

		Assert.assertEquals(false, PerFamily);

		IsElder.click();

	}

	public void GenderCheckBox() {

		IsGender.click();

		boolean IsElder = getDriver().findElement(By.xpath("//*[@id='IsElder']")).isEnabled();

		Assert.assertEquals(false, IsElder);

		boolean PerFamily = getDriver().findElement(By.xpath("//*[@id='prefamily']")).isEnabled();

		Assert.assertEquals(false, PerFamily);

		IsGender.click();

	}

	public void perFamilyCheckBox() {

		PerFamily.click();

		boolean IsElder = getDriver().findElement(By.xpath("//*[@id='IsElder']")).isEnabled();

		Assert.assertEquals(false, IsElder);

		boolean IsGender = getDriver().findElement(By.xpath("//*[@id='IsGender']")).isEnabled();

		Assert.assertEquals(false, IsGender);

		PerFamily.click();

	}

	public void OneTimeCheckBox() {

		OneTime.click();

		boolean Monthly = getDriver().findElement(By.xpath("//*[@id='monthly']")).isEnabled();

		Assert.assertEquals(false, Monthly);

		boolean Yearly = getDriver().findElement(By.xpath("//*[@id='yearly']")).isEnabled();

		Assert.assertEquals(false, Yearly);

		boolean Termly = getDriver().findElement(By.xpath("//*[@id='termly']")).isEnabled();

		Assert.assertEquals(false, Termly);

		OneTime.click();

	}

	public void monthlyCheckBox() {

		Monthly.click();

		boolean OneTime = getDriver().findElement(By.xpath("//*[@id='onetime']")).isEnabled();

		Assert.assertEquals(false, OneTime);

		boolean Yearly = getDriver().findElement(By.xpath("//*[@id='yearly']")).isEnabled();

		Assert.assertEquals(false, Yearly);

		boolean Termly = getDriver().findElement(By.xpath("//*[@id='termly']")).isEnabled();

		Assert.assertEquals(false, Termly);

		Monthly.click();

	}

	public void yearlyCheckBox() {

		Yearly.click();

		boolean OneTime = getDriver().findElement(By.xpath("//*[@id='onetime']")).isEnabled();

		Assert.assertEquals(false, OneTime);

		boolean Monthly = getDriver().findElement(By.xpath("//*[@id='monthly']")).isEnabled();

		Assert.assertEquals(false, Monthly);

		boolean Termly = getDriver().findElement(By.xpath("//*[@id='termly']")).isEnabled();

		Assert.assertEquals(false, Termly);

		Yearly.click();

	}

	public void termlyCheckBox() {

		Termly.click();

		boolean OneTime = getDriver().findElement(By.xpath("//*[@id='onetime']")).isEnabled();

		Assert.assertEquals(false, OneTime);

		boolean Monthly = getDriver().findElement(By.xpath("//*[@id='monthly']")).isEnabled();

		Assert.assertEquals(false, Monthly);

		boolean Yearly = getDriver().findElement(By.xpath("//*[@id='yearly']")).isEnabled();

		Assert.assertEquals(false, Yearly);

		Termly.click();

	}
	
	@FindBy(linkText = "All students")
	WebElement AllStudents;
	
	@FindBy(xpath = "//*[@id='Filter_Ststus']")
	WebElement Status;
	
	@FindBy(xpath = "//button[@id='btnSearch']")
	WebElement Search;
	
	@FindBy(xpath = "(//*[@title='Student Fee Deposit'])[1]")
	WebElement FeeDeposit;
	
	@FindBy(xpath = "(//*[@id='PayButton'])[1]")
	WebElement PayButton;
	
	@FindBy(xpath = "//input[@id='TxtPaidAmount']")
	WebElement payableAmt;
	
	@FindBy(xpath = "//*[@id='savebutton']")
	WebElement SaveButton;
	
	@FindBy(xpath = "//*[@id='validatePaidAmount']")
	WebElement ValidationMessage;
	
	@FindBy(xpath = "//*[@id='ExpectedAmount']")
	WebElement expectedamtTextbox;
	
	
	
	public void AllStudentLink(){
		AllStudents.click();
	}
	
	public void Statusdrpdwn() throws InterruptedException{
		
	Thread.sleep(3000);
	Select selcls = new Select(Status);
	selcls.selectByVisibleText("Approved");
	}
	
	public void search() throws InterruptedException{
		
		WebElementUtils.waitForVisible(Search);
		JavascriptExecutor executor = (JavascriptExecutor)getDriver();
		executor.executeScript("arguments[0].click()", Search);
		//Search.click();
	}
	
	public void FeeDepositIcon() throws InterruptedException{
		//FeeDeposit.click();
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor)getDriver();
		executor.executeScript("arguments[0].click()", FeeDeposit);
	}
	
	public void PayAmt() throws InterruptedException{
		
		Thread.sleep(2000);
		
		JavascriptExecutor executor = (JavascriptExecutor)getDriver();
		executor.executeScript("arguments[0].click()", PayButton);
	}
	
	public void ExcessAmt() throws InterruptedException{
		
		Thread.sleep(2000);
		
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");
		payableAmt.clear();
		payableAmt.sendKeys("10000");
		SaveButton.click();
	}
	
	public void ErrorMsg(){
		
		String expAmt=expectedamtTextbox.getText();
		System.out.println(expAmt);
		String payableAmount =payableAmt.getAttribute("value");
		System.out.println(payableAmount);
		if (Integer.parseInt(expAmt) > Integer.parseInt(payableAmount)){
		String exp = "Please Enter Valid Pay Amount";
		String text = ValidationMessage.getText();
		System.out.println(text);
		Assert.assertEquals(text, exp);
		}
		
	}
	
	

}
