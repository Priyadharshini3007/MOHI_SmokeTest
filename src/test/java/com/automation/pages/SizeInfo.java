package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class SizeInfo {
	public SizeInfo() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@title='Expand Student']")
	WebElement ExpandStudent;

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=ClothSize_Updates')]")
	WebElement DressInfoUpdateAlert;

	@FindBy(xpath = "//input[@id='Filter_FirstName']")
	WebElement enterstudent;

	@FindBy(xpath = "//*[@class='fa fa-pencil-alt bigger-130']")
	WebElement EditIcon;

	@FindBy(xpath = "//*[@id='ui-id-4']")
	WebElement SizeInfoTab;

	// Preprimary to Grade8 -Female

	@FindBy(xpath = "(//input[@id='DressSize'])[1]")
	WebElement DressSize;

	@FindBy(xpath = "(//input[@id='SweaterSize'])[1]")
	WebElement SweaterSize;

	@FindBy(xpath = "(//input[@id='TrackSuitSize'])[1]")
	WebElement TrackSuitSize;

	@FindBy(xpath = "//select[@id='SockSize']")
	WebElement SockSize;

	@FindBy(xpath = "(//select[@id='ShoeSize'])[1]")
	WebElement ShoeSize;

	@FindBy(xpath = "//div[@id='ClothSizeInfoSave']//button[@value='Save & Go To Next']")
	WebElement Save;

	@FindBy(xpath = "//div[@id='flash']")
	WebElement FlashMessage;

	//

	// Form 1 to Form 4 -Female

	@FindBy(xpath = "(//input[@id='SkirtSize'])[1]")
	WebElement SkirtSize;

	@FindBy(xpath = "(//input[@id='ShirtSize'])[1]")
	WebElement ShirtSize;

	@FindBy(xpath = "(//select[@id='TieSize'])[1]")
	WebElement TieSize;

	// Pre-primary and Grade school -Male

	@FindBy(xpath = "//input[@id='ShortSize']")
	WebElement ShortSize;

	// Male -High school
	@FindBy(xpath = "(//*[@id='TrouserSize'])[1]")
	WebElement TrouserSize;

	public void dressInfoUpdateAlert() {

		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(DressInfoUpdateAlert);

		WebElementUtils.scrolltoview(DressInfoUpdateAlert);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", DressInfoUpdateAlert);

	}

	public void EnterCMFID() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");

		WebElementUtils.waitForVisible(enterstudent);
		enterstudent.sendKeys(excelutil.getData(5, 1, 2));
		enterstudent.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

	}

	public void editIcon() {
		WebElementUtils.waitForVisible(EditIcon);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", EditIcon);

	}

	public void sizeInfo() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", SizeInfoTab);

	}

	public void dressDetails() {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		String gender = excelutil.getData(0, 1, 4);

		String classname = excelutil.getData(3, 1, 4);

		boolean isFemale = gender.equals("Female");

		boolean isFemaleForm = classname.split(" ")[0].equals("Form");

		boolean isFemalegrade = classname.split(" ")[0].equals("Grade") || classname.split(" ")[0].equals("Pre");

		boolean isMale = gender.equals("Male");


		if (isFemale) {

			SweaterSize.sendKeys(excelutil.getData(5, 1, 5));

			TrackSuitSize.sendKeys(excelutil.getData(5, 1, 4));

			Select sockSize = new Select(SockSize);
			sockSize.selectByVisibleText(excelutil.getData(5, 1, 6));

			Select shoeSize = new Select(ShoeSize);
			shoeSize.selectByVisibleText(excelutil.getData(5, 1, 7));

		}

		if (isFemale && isFemaleForm) {

			SkirtSize.sendKeys(excelutil.getData(5, 1, 9));
			ShirtSize.sendKeys(excelutil.getData(5, 1, 10));
			TieSize.sendKeys(excelutil.getData(5, 1, 8));
		}

		if (isFemale && isFemalegrade) {

			DressSize.sendKeys(excelutil.getData(5, 1, 3));

		}

		if (isMale) {

			ShirtSize.sendKeys(excelutil.getData(5, 1, 10));

			TieSize.sendKeys(excelutil.getData(5, 1, 8));

			SweaterSize.sendKeys(excelutil.getData(5, 1, 5));

			TrackSuitSize.sendKeys(excelutil.getData(5, 1, 4));

			Select sockSize = new Select(SockSize);
			sockSize.selectByVisibleText(excelutil.getData(5, 1, 6));

			Select shoeSize = new Select(ShoeSize);
			shoeSize.selectByVisibleText(excelutil.getData(5, 1, 7));

		}

		if (isMale && isFemaleForm) {

			TrouserSize.sendKeys(excelutil.getData(5, 1, 12));

		}

		if (isMale && isFemalegrade ) {

			ShortSize.sendKeys(excelutil.getData(5, 1, 11));

		}

	}

	public void saveDressInfo() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Save);

	}

	public void DressInoSavedMgFn() {
		String dressInoSavedMg = "The child's shcool uniform size information has been saved.";
		String flashMsg = FlashMessage.getText();
		Assert.assertEquals(flashMsg, dressInoSavedMg);
	}
}
