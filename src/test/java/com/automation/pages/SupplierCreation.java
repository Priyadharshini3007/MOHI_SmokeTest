package com.automation.pages;

import java.util.Set;
import static com.automation.utils.DriverUtils.getDriver;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierCreation {


	public SupplierCreation(){
		PageFactory.initElements(getDriver(), this);		
	}

	@FindBy(xpath="//i[@title='Click here to Add Supplier']")
	WebElement addIcon;

	@FindBy(id="Code")
	WebElement code;

	@FindBy(id="Name")
	WebElement name;

	@FindBy(id="Address1")
	WebElement Address1;

	@FindBy(id="City")
	WebElement City;

	@FindBy(id="ContactPerson1")
	WebElement ContactPerson1;

	@FindBy(id="PhoneNo1")
	WebElement PhoneNo1;

	@FindBy(id="Email1")
	WebElement Email1;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;

	@FindBy(id="flash")
	WebElement flash;

	@FindBy(id="Filter_Name")
	WebElement nameSearch;

	@FindBy(xpath="//i[@title='Click here to edit this Supplier']")
	WebElement edit;

	@FindBy(xpath="//i[@title='Click here to delete this Supplier']")
	WebElement delete;

	@FindBy(id="btnSearch")
	WebElement btnSearch;

	@FindBy(id="btnRefresh")
	WebElement btnRefresh;

	@FindBy(id="PageSize")
	WebElement PageSize;

	@FindBy(className="next-page")
	WebElement nextPage;

	@FindBy(className="last-page")
	WebElement lastPage;

	@FindBy(className="sort-container")
	WebElement sort;

	public void addIconFn(){
		String oldWindow = getDriver().getWindowHandle();
		System.out.println(oldWindow);
		addIcon.click();
		Set<String> handles = getDriver().getWindowHandles();
		for (String newWindow : handles) {
			getDriver().switchTo().window(newWindow);
		}		
	}

	public void codeFn(String Scode){		
		code.sendKeys(Scode);
	}

	public void nameFn(String Sname){
		name.sendKeys(Sname);
	}

	public void Address1Fn(String Address){
		Address1.sendKeys(Address);
	}

	public void CityFn(String Scity){
		City.sendKeys(Scity);
	}

	public void ContactPerson1Fn(String person){
		ContactPerson1.sendKeys(person);
	}

	public void PhoneNo1Fn(String phone){
		PhoneNo1.sendKeys(phone);
	}

	public void Email1Fn(String email){
		Email1.sendKeys(email);
	}

	public void saveBtn(){
		save.click();
	}

	public void UserIntMgSaveFn(){
		String userIntSaveMg ="Saved Supplier";
		String flashMsg=flash.getText();
		Assert.assertEquals(flashMsg,userIntSaveMg);
	}

	public void UserIntMgDeleteFn(){
		String userIntDelMg ="Deleted Supplier";
		String flashMsg=flash.getText();
		Assert.assertEquals(flashMsg,userIntDelMg);
	}

	public void editIconFn(){
		try{
			edit.click();
		}
		catch(Exception c){
			System.out.println("Edit icon is not available");
		}
	}

	public void deleteIconFn(){
		try{
			delete.click();
			Alert confirmAlert = getDriver().switchTo().alert();
			confirmAlert.accept();
		}
		catch(Exception c){
			System.out.println("Icon is not available");
		}
	}

	public void editNameFn(String editName){
		try{
			name.clear();
			name.sendKeys(editName);
		}
		catch(Exception e){
			System.out.println("Field is not available");
		}
	}

	public void editEmailFn(String editEmail){
		try{
		Email1.clear();
		Email1.sendKeys(editEmail);
		}
		catch(Exception e){
			System.out.println("Field is not available");
		}
	}

	public void searchFn(String Sname){
		nameSearch.sendKeys(Sname);
		btnSearch.click();
	}

	public void refreshBtn(){
		btnRefresh.click();
	}

	public void nextPageFn(){
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()", nextPage);
	}

	public void lastPageFn(){
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()", lastPage);
	}

	public void pageSizeFn(String size){
		PageSize.sendKeys(size);
		PageSize.sendKeys(Keys.RETURN);
	}

}
