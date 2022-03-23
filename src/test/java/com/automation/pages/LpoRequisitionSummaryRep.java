package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.selectFn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LpoRequisitionSummaryRep {

	public LpoRequisitionSummaryRep(){
        PageFactory.initElements(getDriver(), this);
        }
	
	@FindBy(id="DropDownLpoRequisitionCenter")
	WebElement centerDrp;
	
	@FindBy(id="DropDownLpoRequisitionMonth")
	WebElement monthDrp;
	
	@FindBy(id="DropDownLPORYear")
	WebElement yearDrp;
	
	@FindBy(id="btnLpoRequisitionSummary")
	WebElement viewRep;
	
	@FindBy(tagName="iframe")
    WebElement LpoFrame;
	
	@FindBy(xpath = "//div[.='LPO REQUISITION SUMMARY REPORT']")
	WebElement LPORepSumRep;
	
	public void centerFn(String center) throws InterruptedException{
		getDriver().switchTo().frame(LpoFrame);
		Thread.sleep(4000);
		selectFn(centerDrp,center);
	}
	
	public void monthFn(String month) throws InterruptedException{
		Thread.sleep(4000);
		selectFn(monthDrp,month);
	}
	
	public void yearFn(String year) throws InterruptedException{
		Thread.sleep(4000);
		selectFn(yearDrp,year);
	}
	
	public void btnLpoReq() throws InterruptedException{
		Thread.sleep(4000);
		viewRep.click();
		Thread.sleep(4000);
		LPORepSumRep.isDisplayed();
		

	}

}
