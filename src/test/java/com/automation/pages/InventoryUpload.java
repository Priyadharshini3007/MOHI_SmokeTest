package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryUpload {

	public InventoryUpload(){
		PageFactory.initElements(getDriver(), this);		
	}

	@FindBy(id="Itemsfile")
	WebElement InventoryUpload;

	@FindBy(id="flash")
	WebElement flash;


	public void InventoryUploadFn(){
		String path=System.getProperty("user.dir");
		String fullPath= path + "\\ExcelFiles\\InventoryItemUploadTemplate.xlsx";
		InventoryUpload.sendKeys(fullPath);
	}

	public void InvUpldUserIntMgFn(){

		String InvAttUserUpIntMg ="Inventory items Uploaded Successfully.";
		String flashMsg=flash.getText();
		if(InvAttUserUpIntMg==flashMsg){
			System.out.println("File uploaded successfully");
		}
		else{
			System.out.println("An error has occurred");
		}
	}

}
