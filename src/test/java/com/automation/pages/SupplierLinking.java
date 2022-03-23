package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierLinking {
	
	
	public SupplierLinking(){
		PageFactory.initElements(getDriver(), this);		
	}
	
	@FindBy(id="flash")
	WebElement flash;
	
	@FindBy(id="ddlSupplier")
	WebElement supplier;
	
	@FindBy(id="ddlItemtype")
	WebElement itemtype;
	
	@FindBy(id="btnSearchsupplierlinking")
	WebElement supplierlinking;
	
	@FindBy(id="supplierItem_0__IsSelected")
	WebElement supplierItem1;
	
	@FindBy(xpath="//i[@title='Click here to delete this Supplier']")
	WebElement delete;
	
	@FindBy(xpath="//button[@title='Save']")
	WebElement save;
	
	public void supplierFn(String Supplier){
		supplier.sendKeys(Supplier);
	}
	
	public void itemtypeFn(String Itemtype){
		itemtype.sendKeys(Itemtype);
	}
	
	public void supplierlinkingFn(){
		supplierlinking.click();
	}
	
	public void supplierItemFn(){
		try{
			supplierItem1.click();			
		}
		catch(Exception e){
			System.out.println("No item to select");			
		}
	}
	
	public void SupLinkMgSaveFn(){
		String userIntSaveMg ="Saved Supplier Item linking";
		String flashMsg=flash.getText();
		Assert.assertEquals(flashMsg,userIntSaveMg);
	}
	
	public void deleteIconFn(){
		delete.click();
		Alert confirmAlert = getDriver().switchTo().alert();
		confirmAlert.accept();
	}
	
	public void saveBtn(){		
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()", save);
	}
}
