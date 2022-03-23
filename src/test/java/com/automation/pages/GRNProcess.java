package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.scrolltobottomofpage;
import static com.automation.utils.WebElementUtils.webDriverclick;
import static com.automation.utils.WebElementUtils.confirmationMsg;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GRNProcess {

	public GRNProcess(){
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath="//a[@title='Click here to enter the number of goods received']")
	WebElement GrnIcon;

	@FindBy(id="Filter_LPOCode")
	WebElement LPOCode;

	@FindBy(xpath="//input[@title='Enter the Quantity Received']")
	WebElement ItmQtyRcvd;

	@FindBy(id="txtReceivingComment")
	WebElement RCmnts;

	@FindBy(id="InvoiceNumber")
	WebElement InvNo;

	@FindBy(id="DeliveryNumber")
	WebElement DelvryNo;

	@FindBy(id="btnSearch")
	WebElement btnSearch;

	@FindBy(xpath="//button[@title='Save this record']")
	WebElement SaveBtn;
	
	@FindBy(xpath="//span[contains(@id,'spnQunatityExpected_')]")
	WebElement expected;

	public void GrnIconFn(){
		webDriverclick(GrnIcon);
	}

	public void ItmQtyRcvdFn(){
		String ItmQty = expected.getText();
		ItmQtyRcvd.sendKeys(ItmQty);
	}		

	public void RCmntsFn(){
		RCmnts.sendKeys("Test Comments");
	}

	public void InvNoFn(){
		InvNo.sendKeys("123456789");
	}

	public void DelvryNoFn(){
		DelvryNo.sendKeys("987654321");
	}

	public void SaveBtnFn(){
		scrolltobottomofpage();
		webDriverclick(SaveBtn);
	}

	public void GRNUserIntMgFn(){
		String splAttUserIntMg ="The goods received details has been saved successfully.";
		confirmationMsg(splAttUserIntMg);
	}

}
