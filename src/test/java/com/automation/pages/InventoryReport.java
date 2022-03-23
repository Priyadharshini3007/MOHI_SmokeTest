package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.WebElementUtils;

public class InventoryReport {

	public InventoryReport() {

		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "ddlCenters")
	WebElement Centers;

	@FindBy(id = "ddlItemType")
	WebElement ItemType;

	@FindBy(id = "TxtItem")
	WebElement search;

	@FindBy(id = "btnSearchInventory")
	WebElement btnSearchInventory;

	@FindBy(xpath = "//i[@title='Click here to edit the selected Item Type']")
	WebElement EditItemType;

	@FindBy(xpath = "//i[@title='Click here to Add new Item Type']")
	WebElement AddItemType;

	@FindBy(xpath = "//i[@title='Click here to Add new Item']")
	WebElement AddItem;

	@FindBy(xpath = "//i[@title='Click here to edit this item']")
	WebElement editItem;

	@FindBy(id = "ItemName")
	WebElement ItemName;

	@FindBy(id = "ItemDescription")
	WebElement ItemDesc;

	@FindBy(id = "SupplierId")
	WebElement SupplierId;

	@FindBy(id = "ItemTypeCode")
	WebElement ItemTypeCode;

	@FindBy(id = "ItemTypeName")
	WebElement ItemTypeName;

	@FindBy(id = "ItemTypeDescription")
	WebElement ItemTypeDesc;

	@FindBy(id = "ItemQuantity_0__IsSelected")
	WebElement kilogram;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement Save;

	@FindBy(id = "flash")
	WebElement flash;

	@FindBy(id = "lnkAddMetric")
	WebElement quantityAddIcon;

	@FindBy(id = "txtMetric")
	WebElement quantityAdd;

	@FindBy(xpath = "//a[@title='Save quantity metric']//i")
	// @FindBy(xpath="//*[@id='divNewMetric']/a[1]/i")
	WebElement saveQuantity;

	@FindBy(xpath = "//a[@title='Edit quantity metric']//i")
	// @FindBy(xpath="//*[@id='divquantity']/a[75]/i")
	WebElement editQuantity;

	@FindBy(xpath = "//a[@title='Click here to disable this item']")
	WebElement disableItem;

	@FindBy(xpath = "//a[@title='Click here to enable this item']")
	WebElement enableItem;

	public void centerFn(String center) {
		Select select1 = new Select(Centers);
		select1.selectByVisibleText(center);
	}

	public void ItemTypeFn(String itemtype) {
		try {
			Select select2 = new Select(ItemType);
			select2.selectByVisibleText(itemtype);
		} catch (Exception c) {
			System.out.println("Item is not available");
		}
	}

	public void searchFn(String itemNameSearch) throws Throwable {
		search.clear();
		search.sendKeys(itemNameSearch);
		Thread.sleep(1000);
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
	}

	public void btnSearchInventory() throws Throwable {
		btnSearchInventory.click();
	}

	public void oldWindowFn() {
		String oldWindow = getDriver().getWindowHandle();
		System.out.println(oldWindow);
	}

	public void AddItemTypeFn() {
		oldWindowFn();
		AddItemType.click();
		newWindowFn();
	}

	public void editItemFn() {
		oldWindowFn();
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", editItem);
		newWindowFn();
	}

	public void newWindowFn() {
		Set<String> handles = getDriver().getWindowHandles();
		for (String newWindow : handles) {
			getDriver().switchTo().window(newWindow);
		}
	}

	public void ItemTypeCodeFn(String itemTypeCode) {
		ItemTypeCode.clear();
		ItemTypeCode.sendKeys(itemTypeCode);
	}

	public void ItemTypeNameFn(String itemTypeName) {
		ItemTypeName.clear();
		ItemTypeName.sendKeys(itemTypeName);
	}

	public void ItemTypeDescFn(String itemTypeDesc) {
		ItemTypeDesc.clear();
		ItemTypeDesc.sendKeys(itemTypeDesc);
	}

	public void kilogramFn() {
		kilogram.click();
	}

	public void SaveItemTypeFn() {

		Save.click();
		defaultContentFn();

	}

	public void defaultContentFn() {
		getDriver().switchTo().defaultContent();
	}

	public void itemTypeUserMsgFn() {
		try {
			
			String itemTypeIntMg = "Saved Item Type";
			WebElementUtils.waitForVisible(flash);
			String flashMsg = flash.getText();
			Assert.assertEquals(flashMsg, itemTypeIntMg);
		}

		catch (Exception e) {

			System.out.println("Not Get Saved");
		}
	}

	public void itemUserMsgFn() {
		String itemIntMg = "Saved Item";
		WebElementUtils.waitForVisible(flash);
		String flashMsg = flash.getText();
		Assert.assertEquals(flashMsg, itemIntMg);
	}

	public void editItemTypeFn() {
		EditItemType.click();
	}

	public void editItemTypeNameFn(String editItmTyp) {
		ItemTypeName.clear();
		ItemTypeName.sendKeys(editItmTyp);
	}

	public void quantityAddFn(String quantity) throws Throwable {
		Thread.sleep(1000);
		quantityAdd.sendKeys(quantity);
	}

	public void quantityAddIconFn() throws Throwable {
		oldWindowFn();
		Thread.sleep(1000);
		quantityAddIcon.click();
		newWindowFn();
	}

	public void quantityEditIconFn() throws Throwable {
		oldWindowFn();
		Thread.sleep(1000);
		editQuantity.click();
		newWindowFn();
	}

	public void saveQuantityIcon() throws Throwable {
		Thread.sleep(2000);
		// saveQuantity.click();
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", saveQuantity);
		Qtyverfn();
		defaultContentFn();
	}
	
	public void Qtyverfn() throws InterruptedException{
		Alert alertBx = getDriver().switchTo().alert();
		String flashMsg = alertBx.getText();
		String message = "The item quantity metric has been saved successfully.";
		Thread.sleep(1000);
		alertBx.accept();
		Assert.assertEquals(flashMsg, message);
	}

	public void alertAcceptFn() throws Throwable {
		Alert alertBx = getDriver().switchTo().alert();
		Thread.sleep(1000);
		alertBx.accept();
	}

	public void itemAddFn() {
		oldWindowFn();
		AddItem.click();
		newWindowFn();
	}

	public void itemNameFn(String itemName) {
		ItemName.clear();
		ItemName.sendKeys(itemName);
	}

	public void itemDescFn(String itemDesc) {
		ItemDesc.clear();
		ItemDesc.sendKeys(itemDesc);
	}

	public void supplierFn(String Supplier) {
		Select select2 = new Select(SupplierId);
		select2.selectByVisibleText(Supplier);
	}

	public void disableItemFn() throws Throwable {
		Thread.sleep(2000);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript("arguments[0].click()", disableItem);
			alertAcceptFn();
			defaultContentFn();
		} catch (Exception e) {
			if (enableItem.isDisplayed()) {
				System.out.println("Item is already disabled");
			}
		}
	}

	public void enableItemFn() throws Throwable {
		Thread.sleep(2000);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript("arguments[0].click()", enableItem);
			alertAcceptFn();
			defaultContentFn();
		} catch (Exception e) {
			if (disableItem.isDisplayed()) {
				System.out.println("Item is already enabled");
			}
		}
	}

	public void verification() {
		try {
			if (disableItem.isDisplayed()) {
				System.out.println("Item is enabled");
			}
		} catch (Exception e) {
			if (enableItem.isDisplayed()) {
				System.out.println("Item is disabled");
			}
		}
	}

}
