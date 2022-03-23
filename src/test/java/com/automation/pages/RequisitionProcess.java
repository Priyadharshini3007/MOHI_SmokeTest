package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequisitionProcess {
	
	@FindBy(id="txtPurpose")
	WebElement purpose;

	@FindBy(xpath="input[id='IsRepetitive'][value='False']")
	WebElement nonRepetitive;
	
	@FindBy(xpath="//button[@value='Save & Submit for Approval']")
	WebElement submitReq;
	
	@FindBy(id="txtDateNeededBy")
	WebElement DateNeededBy;
	
	@FindBy(id="ddlSchool")
	WebElement schoolName;
	
	@FindBy(id="drpItemType")
	WebElement itemType;
	
	@FindBy(id="drpItemName")
	WebElement itemName;
	
	@FindBy(id="txtQuantity_")
	WebElement quantity;
	
	@FindBy(id="drpQuantityUnits")
	WebElement quantityUnits;
	
	@FindBy(id="txtitemRate_")
	WebElement itemRate;
	
	@FindBy(id="txtComments")
	WebElement txtComments;
	
	@FindBy(id="AddItem")
	WebElement AddItem;
	
	
	
}
