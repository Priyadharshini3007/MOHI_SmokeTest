package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.dateFn;
import static com.automation.utils.WebElementUtils.confirmationMsg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryAudit {
	
	public InventoryAudit(){
		 PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="txtAuditQuantity_2")
	WebElement auditQty;
	
	@FindBy(id="txtAuditDate_2")
	WebElement auditDate;
	
	@FindBy(id="txtAuditComments_2")
	WebElement auditCom;
	
	@FindBy(xpath="(//a[@title='Save the inventory audit details'])[2]")
	WebElement saveicon;
	
	String filepath=".\\output";
	
	public void auditQtyFn(String Qty){
		auditQty.clear();
		auditQty.sendKeys(Qty);
	}
	
	public void auditDateFn(String aDate){
		auditDate.clear();
//		auditDate.sendKeys(aDate);
		dateFn(auditDate);
	}
	
	public void auditComFn(String comments){
		auditCom.clear();
		auditCom.sendKeys(comments);
	}
	
	public void saveIcnFn(){
		saveicon.click();
	}
	
	public void userVerifn() throws InterruptedException{
		Thread.sleep(5000);
		String message = "The inventory audit details have been saved successfully.";
		confirmationMsg(message);
	}
	
}
