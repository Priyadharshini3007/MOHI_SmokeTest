package com.automation.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;
import static com.automation.utils.WebElementUtils.elementVisible;

public class InventoryAdjusmentApproval {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public InventoryAdjusmentApproval() {

		PageFactory.initElements(getDriver(), this);

	}

	//////////////////////////// InventoryAdjusmentApprovalElements///////////////////////////////////////

	@FindBy(xpath = "//a[contains(@href,'Filterstring=InvAdj_Appr')]")
	WebElement inventorylistapprovallink;

	@FindBy(xpath = "//*[@id='Filter_RequisitionCode']")
	WebElement FilterRequisitionCode;

	@FindBy(xpath = "//*[@id='btnSearch']")
	WebElement SearchButton;

	@FindBy(xpath = "//*[@title='Approve/Deny Inventory adjustment request']")
	WebElement Inventoryapprovalicon;

	@FindBy(xpath = "//*[@id='Comments']")
	WebElement Comments;

	@FindBy(xpath = "//*[@title='Approve Inventory Adjustement']")
	WebElement ApproveButton;

	@FindBy(xpath = "//*[@title='Send for Clarification']")
	WebElement SendForClarificationButton;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=InvAdj_Need_Info')]")
	WebElement needMoreInformationlink;

	@FindBy(xpath = "//*[@title='Approve/Deny Inventory adjustment request']")
	WebElement Approveinventoryinformation;

	@FindBy(xpath = "//*[@title='Send Clarification']")
	WebElement SendClarificationbutton;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=InvAdj_Send_Info')]")
	WebElement receivedmoreinformation;

	@FindBy(xpath = "//*[@title='Deny Inventory Adjustement']")
	WebElement DenyButton;
	
	@FindBy(xpath="//td[contains(text(),'Adjustment Request Status')]/following-sibling::td[contains(text(),'Approved')]")
	WebElement InvAdjApproved;
	
	@FindBy(xpath="//td[contains(text(),'Adjustment Request Status')]/following-sibling::td[contains(text(),'Denied')]")
	WebElement InvAdjDenied;
	
	@FindBy(xpath = "//*[@title='Expand Requisition']")
	WebElement ExpandRequisition;

	public void inventoryListApproval() throws InterruptedException {

		try {
			

			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(inventorylistapprovallink);
			WebElementUtils.scrolltoview(inventorylistapprovallink);
			webDriverclick(inventorylistapprovallink);

			FilterRequisitionCode.sendKeys(BaseClass.requisitionCode);
			
			webDriverclick(SearchButton);
		}

		catch (Exception e) {

			System.out.println("There is no injustment adjument request right now");
		}
	}

	public void inventoryListApprovalicon() throws InterruptedException {
		webDriverclick(Inventoryapprovalicon);
	}

	public void Approval() throws InterruptedException {
		try {
			Comments.sendKeys(excelutil.getData(24, 1, 14));
			webDriverclick(ApproveButton);
		}
		catch (Exception e) {
			System.out.println("No comments and Approve btn available");
		}

	}

	public void SendForClarication() throws InterruptedException {
		try {
			Comments.sendKeys(excelutil.getData(24, 1, 14));
			webDriverclick(SendForClarificationButton);
		}
		catch (Exception e) {
			System.out.println("No comments and Approve btn available");
		}

	}

	public void needmoreinformationlink() throws InterruptedException {
		try {

			webDriverclick(needMoreInformationlink);

			FilterRequisitionCode.sendKeys(BaseClass.requisitionCode);

			webDriverclick(SearchButton);

			webDriverclick(Approveinventoryinformation);

			Comments.sendKeys(excelutil.getData(24, 1, 14));

			webDriverclick(SendClarificationbutton);

		}
		catch (Exception e) {
			System.out.println("Not applicable");
		}
	}

	public void receivedmoreinformationlink() throws InterruptedException {
		try {

			webDriverclick(receivedmoreinformation);

			FilterRequisitionCode.sendKeys(BaseClass.requisitionCode);

			webDriverclick(SearchButton);

			webDriverclick(Approveinventoryinformation);

			Comments.sendKeys(excelutil.getData(24, 1, 14));

			webDriverclick(ApproveButton);

		}
		catch (Exception e) {
			System.out.println("Not applicable");
		}

	}

	public void Denied() throws InterruptedException {
		try {
			Comments.sendKeys(excelutil.getData(24, 1, 14));

			webDriverclick(DenyButton);

			Alert a = getDriver().switchTo().alert();
			a.accept();
		}
		catch (Exception e) {
			System.out.println("Not applicable");
		}
	}

	/////////////////////////////////Inventory Adjustment Submission Elements/////////////////////////////////////////

	@FindBy(linkText="Procurement")
	WebElement ProcurementMenu;

	@FindBy(linkText="Requisition List")
	WebElement RequisitionListSubmenu;

	@FindBy(xpath = "//*[@title='Click here to update from inventory/View inventory adjustment']")
	WebElement InventoryAdjustmentButton;

	@FindBy(xpath = "//*[@title='Adjust this item']")
	WebElement AdjustmentThisItemButton;

	@FindBy(xpath = "//td[contains(text(),'Ndovoini')]/following-sibling::td[4]/input")
	WebElement QuantityToBeMoved;

	@FindBy(xpath = "//*[contains(text(),'RMOHI')]")
	WebElement requisitionCodeText;

	@FindBy(xpath = "//td[contains(text(),'Ndovoini')]/following-sibling::td[5]/button")
	WebElement SubmitForApprovalButton;

	@FindBy(xpath = "//*[@id='Filter_Center']")
	WebElement selectCenter;

	@FindBy(xpath = "//*[@id='Filter_IsCashOnly']")
	WebElement Cashony;

	public void inventoryAdjustmentmenu() throws InterruptedException {
		ProcurementMenu.click();
		RequisitionListSubmenu.click();
	}

	public void filterRequisitionCode() throws InterruptedException {
		FilterRequisitionCode.sendKeys(BaseClass.requisitionCode);
		System.out.println(BaseClass.requisitionCode);
		webDriverclick(SearchButton);
	}

	public void inventoryAdjustmentIcon() throws InterruptedException {
		webDriverclick(InventoryAdjustmentButton);
		try {
			webDriverclick(AdjustmentThisItemButton);
		}
		catch (Exception e){
			System.out.println("LPO has been already created for this item and hence inventory adjustment need not to be done for this item");
		}
	}

	public void enterTheQuantity() throws InterruptedException {
		try{
			JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
			scrolldown.executeScript("window.scrollBy(0,1000)");
			webDriverclick(QuantityToBeMoved);
			QuantityToBeMoved.sendKeys(excelutil.getData(25, 1, 1));
			webDriverclick(SubmitForApprovalButton);
		}
		catch (Exception e){
			System.out.println("Inventory adjustment need not to be done for this item");
		}
	}
	
	public void InvAdjStatusApproved(){
		elementVisible(InvAdjApproved);
	}
	
	public void InvAdjStatusDenied(){
		elementVisible(InvAdjDenied);
	}

}
