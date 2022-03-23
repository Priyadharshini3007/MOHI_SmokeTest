package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.selectFn;
import static com.automation.utils.WebElementUtils.dateFn;
import static com.automation.utils.WebElementUtils.confirmationMsg;
import static com.automation.utils.WebElementUtils.webDriverclick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryTracking {	
		
	public InventoryTracking(){
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id="ddlItem")
	WebElement itemName;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @id='tr_editable_0' or @class='newTrackRow']//td//input[@errormsg='Please enter the received date']")
	WebElement receivedDate;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @id='tr_editable_0' or @class='newTrackRow']//td//input[contains(@id,'_ReceivedBalance')]")
	WebElement receivedBalance;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @class='newTrackRow']//td//select[contains(@id,'ReceivedBalQtyUnits')]")
	WebElement receivedBalQtyUnts;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @id='tr_editable_0' or @class='newTrackRow']//td//input[contains(@id,'_ReceivedQty')]")
	WebElement receivedQty;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @class='newTrackRow']//td//select[contains(@id,'ddlReceivedQtyUnits')]")
	WebElement receivedQtyUnits;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @class='newTrackRow']//td//input[contains(@id,'TotalReceived')]")
	WebElement totalReceived;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @class='newTrackRow']//td//select[contains(@id,'TotalReceivedQtyUnits')]")
	WebElement TotReceivedQtyUnits;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @class='newTrackRow']//td//input[contains(@id,'IssuedDate')]")
	WebElement issuedDate;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @class='newTrackRow']//td//input[contains(@id,'IssuedQty')]")
	WebElement issuedQty;	
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @class='newTrackRow']//td//select[contains(@id,'IssuedQtyUnits')]")
	WebElement issuedQtyUnits;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @class='newTrackRow']//td//input[contains(@id,'BalanceDate')]")
	WebElement balanceDate;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @class='newTrackRow']//td//input[contains(@id,'BalanceQty')]")
	WebElement balanceQty;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @class='newTrackRow']//td//select[contains(@id,'BalanceQtyUnits')]")
	WebElement balanceQtyUnits;
	
	@FindBy(xpath="//tr[@style='display: table-row;' or @id='tr_editable_0' or @class='newTrackRow']//td//textarea[contains(@id,'Comments')]")
	WebElement comments;
	
	@FindBy(xpath="//a[@title='Save the track record']")
	WebElement saveTrackRecord;
	
	@FindBy(xpath="//a[@title='Click to edit the record']")
	WebElement editTrackRecord;
	
	@FindBy(xpath="//a[@title='Click to add new track record']")
	WebElement addTrackRecord;
	
	public void itemNameFn(String item){
		selectFn(itemName,item);
	}
	
	public void receivedDateFn() throws InterruptedException{
		try{
			addTrackRecord.click();
			receivedDate.clear();
			Thread.sleep(2000);
			dateFn(receivedDate);
		}
		catch(Exception c){
			receivedDate.clear();
			Thread.sleep(2000);
			dateFn(receivedDate);
		}
	}
	
	public void issuedDateFn(){
		dateFn(issuedDate);
	}
	
	public void issuedQtyFn(String IssuedQty){
		issuedQty.clear();
		issuedQty.sendKeys(IssuedQty);
	}
	
	public void balanceDateFn(){
		balanceDate.clear();
		dateFn(balanceDate);
	}
	
	public void receivedBalanceFn(String ReceivedBalance) throws InterruptedException{
		Thread.sleep(2000);
		receivedBalance.clear();
		receivedBalance.sendKeys(ReceivedBalance);
	}
	
	public void receivedQtyFn(String ReceivedQty){
		receivedQty.clear();
		receivedQty.sendKeys(ReceivedQty);
	}
	
	public void receivedBalQtyUntsFn(String ReceivedBalQtyUnts) throws InterruptedException{
		Thread.sleep(2000);
		selectFn(receivedBalQtyUnts,ReceivedBalQtyUnts);
	}
	
	public void receivedQtyUnitsFn(String ReceivedQtyUnits) throws InterruptedException{
		Thread.sleep(2000);
		selectFn(receivedQtyUnits,ReceivedQtyUnits);
	}
	
	public void totalReceivedFn(String TotalReceived){
		totalReceived.clear();
		totalReceived.sendKeys(TotalReceived);
	}
	
	public void TotReceivedQtyUnitsFn(String totReceivedQtyUnits){
		selectFn(TotReceivedQtyUnits,totReceivedQtyUnits);
	}
	
	public void issuedQtyUnitsFn(String IssuedQtyUnits){
		selectFn(issuedQtyUnits,IssuedQtyUnits);
	}
	
	public void balanceQtyFn(String BalanceQty){
		balanceQty.sendKeys(BalanceQty);
	}
	
	public void balanceQtyUnitsFn(String BalanceQtyUnits){
		selectFn(balanceQtyUnits,BalanceQtyUnits);
	}
	
	public void commentsFn(String Comments){
		comments.clear();
		comments.sendKeys(Comments);
	}
	
	public void saveTrackRecordFn() throws InterruptedException{
		Thread.sleep(2000);
		webDriverclick(saveTrackRecord);
	}
	
	public void editTrackRecordFn(){
		webDriverclick(editTrackRecord);
	}
	
	public void userVerifn(){
		String message = "The details have been saved successfully";
		confirmationMsg(message);
	}
	
}
