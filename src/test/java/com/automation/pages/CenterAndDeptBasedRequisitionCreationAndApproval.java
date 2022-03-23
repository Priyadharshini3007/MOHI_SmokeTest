package com.automation.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class CenterAndDeptBasedRequisitionCreationAndApproval {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public CenterAndDeptBasedRequisitionCreationAndApproval() {
		PageFactory.initElements(getDriver(), this);
	}

	//////////////////////////////////////// RequisitionCreation

	@FindBy(linkText = "Submit Requisition")
	WebElement submitrequisitionlink;

	@FindBy(xpath = "//*[@id='txtPurpose']")
	WebElement Purpose;

	@FindBy(xpath = "//*[@class='IsCashOnly'and @value='true']")
	WebElement CashOnlyYes;// cash only yes

	@FindBy(xpath = "//*[@id='txtCheckName']")
	WebElement ChequeName;// Cheque name

	@FindBy(xpath = "//*[@class='IsCashOnly'and @value='false']")
	WebElement CashOnlyNo;// cash only no

	@FindBy(xpath = "//*[@id='IsRepetitive' and @value='True']")
	WebElement RepetitiveYes;// repetitive yes

	@FindBy(xpath = "//*[@id='IsRepetitive' and @value='False']")
	WebElement RepetitiveNo;// repetitive no

	@FindBy(xpath = "//*[@id='txtStartMonth']")
	WebElement Startmonth;// start month

	@FindBy(xpath = "//*[@id='txtNoofperiod']")
	WebElement periods;// No.of periods

	@FindBy(xpath = "//*[@id='IsFixedAmt' and @value='True']")
	WebElement FixedAmounYes;// Fixed amount yes

	@FindBy(xpath = "//*[@id='IsFixedAmt' and @value='False']")
	WebElement FixedAmounNo;// Fixed amount no

	@FindBy(xpath = "//*[@id='txtDateNeededBy']")
	WebElement DateNeededBy;// Date Needed By

	@FindBy(xpath = "//*[@id='ddlSchool']")
	WebElement School;// School

	@FindBy(xpath = "//*[@id='drpItemType']")
	WebElement SelectItemType;// select item type from the dropdown

	@FindBy(xpath = "//*[@id='drpItemName']")
	WebElement SelectItemName;// select item name from the dropdown

	@FindBy(xpath = "//*[@id='txtQuantity_']")
	WebElement ItemQuantity;// Enter item Quantity

	@FindBy(xpath = "//*[@id='drpQuantityUnits']")
	WebElement ItemQuantityUnits;// Enter item Quantity units

	@FindBy(xpath = "//*[@id='txtitemRate_']")
	WebElement ItemRate;// ItemRate

	@FindBy(xpath = "//*[@id='txtComments']")
	WebElement ItemComments;// ItemComments

	@FindBy(xpath = "//*[@title='Add Items ']")
	WebElement AddItemButton;// Add item

	@FindBy(xpath = "(//*[@title='click here to edit the item details'])[2]")
	WebElement Edit;// Edit item button

	@FindBy(xpath = "(//*[@class='yellow fa fa-save bigger-120'])[1]")
	WebElement Save;// Save item button

	@FindBy(xpath = "(//*[@class='fa fa-trash bigger-130'])[3]")
	WebElement Delete;// Delete item button

	@FindBy(xpath = "//*[@title='Save & Submit for Approval']")
	WebElement SubmitRequisition;// submit button

	@FindBy(xpath = "//*[@id='flash']")
	WebElement readflashmessage;// submit button

	@FindBy(xpath = "//*[contains(text(),'RMOHI')]")
	WebElement requisitionCodeText;

	/////////////////////////// Approval//////////////////////////////////////

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Request_Appr')]")
	WebElement ApproveRequisitionLink;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Dept_Request_Appr')]")
	WebElement DeptApproveRequisitionLink;

	@FindBy(xpath = "//*[@id='Filter_RequisitionCode']")
	WebElement FilterRequisitionCode;

	@FindBy(xpath = "//*[@id='btnSearch']")
	WebElement SearchButton;

	@FindBy(xpath = "//*[@title='Approve/Deny Requisition']")
	WebElement Approveicon;

	@FindBy(xpath = "//a[contains(@href,'FilterString=Dept_Request_Appr')]")
	WebElement DeptApproveicon;

	@FindBy(xpath = "//*[@id='Comments']")
	WebElement Comments;

	@FindBy(xpath = "//*[@title='Approve Requisition']")
	WebElement ApproveButton;

	@FindBy(xpath = "//*[@title='Deny Requisition']")
	WebElement DenyButton;

	@FindBy(xpath = "//*[@title='Send for Clarification']")
	WebElement SendForClarificationButton;

	@FindBy(xpath = "//*[@class='month focused']/following-sibling::span[1]")
	WebElement repetitiveMnth;

	@FindBy(xpath = "//td[@class='day' and contains(text(),'15')]")
	WebElement dateNeededBy;

	@FindBy(xpath = "//th[@class='next']")
	WebElement next;

	@FindBy(xpath = "//*[@title='Expand Requisition']")
	WebElement ExpandRequisition;

	public void requisitionCreation() throws InterruptedException {
		submitrequisitionlink.click();
	}

	public void requisitionCreationdetails(String requisitionType) throws InterruptedException {

		Purpose.sendKeys(excelutil.getData(24, 1, 0));

		if (excelutil.getData(24, 1, 1).equals("Yes")) {

			CashOnlyYes.click();
			ChequeName.sendKeys(excelutil.getData(24, 1, 2));
			Thread.sleep(2000);
		}

		if (excelutil.getData(24, 1, 1).equals("No")) {
			CashOnlyNo.click();
			Thread.sleep(2000);
		}

		if (excelutil.getData(24, 1, 3).equals("No")) {
			RepetitiveNo.click();
			Thread.sleep(2000);
		}

		if (excelutil.getData(24, 1, 3).equals("Yes")) {

			RepetitiveYes.click();
			Thread.sleep(2000);

			// Startmonth.sendKeys(excelutil.getData(24, 1, 4));
			Startmonth.click();
			repetitiveMnth.click();
			Startmonth.sendKeys(Keys.TAB);

			periods.sendKeys(excelutil.getData(24, 1, 5));

			if (excelutil.getData(24, 1, 6).equals("Yes")) {
				FixedAmounYes.click();
				Thread.sleep(2000);
				FixedAmounYes.sendKeys(Keys.TAB);
			}

			if (excelutil.getData(24, 1, 6).equals("No")) {
				FixedAmounNo.click();
				Thread.sleep(2000);
				FixedAmounNo.sendKeys(Keys.TAB);
			}
		}

		// DateNeededBy.sendKeys(excelutil.getData(24, 1, 7));
		webDriverclick(DateNeededBy);
		webDriverclick(next);
		// DateNeededBy.click();
		dateNeededBy.click();

		if (requisitionType.toLowerCase().equals("centre")) {
			Select selschoolname = new Select(School);
			selschoolname.selectByVisibleText(excelutil.getData(24, 1, 8));
		}
	}

	public void addItems() throws InterruptedException {
		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		Select selItemType = new Select(SelectItemType);
		selItemType.selectByVisibleText(excelutil.getData(24, 1, 9));

		Select selItemName = new Select(SelectItemName);
		selItemName.selectByVisibleText(excelutil.getData(24, 1, 10));

		ItemQuantity.sendKeys(excelutil.getData(24, 1, 11));

		Select selItemQuantityUnits = new Select(ItemQuantityUnits);
		selItemQuantityUnits.selectByVisibleText(excelutil.getData(24, 1, 12));

		ItemRate.sendKeys(excelutil.getData(24, 1, 13));

		ItemComments.sendKeys(excelutil.getData(24, 1, 14));

		AddItemButton.click();

		Select selItemType1 = new Select(SelectItemType);
		selItemType1.selectByVisibleText(excelutil.getData(24, 1, 9));

		Select selItemName1 = new Select(SelectItemName);
		selItemName1.selectByVisibleText(excelutil.getData(24, 2, 10));

		ItemQuantity.sendKeys(excelutil.getData(24, 1, 11));

		Select selItemQuantityUnits1 = new Select(ItemQuantityUnits);
		selItemQuantityUnits1.selectByVisibleText(excelutil.getData(24, 2, 12));

		ItemRate.sendKeys(excelutil.getData(24, 1, 13));

		ItemComments.sendKeys(excelutil.getData(24, 1, 14));

		AddItemButton.click();
	}

	public void edititem() throws InterruptedException {

		Edit.click();

		ItemQuantity.clear();

		ItemQuantity.sendKeys(excelutil.getData(24, 3, 11));

		ItemRate.clear();

		ItemRate.sendKeys(excelutil.getData(24, 1, 13));

		Save.click();

	}

	public void deleteitem() throws InterruptedException {
		Delete.click();
	}

	public void submititem() throws InterruptedException {

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		SubmitRequisition.click();

		System.out.println(readflashmessage.getText());

		BaseClass.requisitionCode = requisitionCodeText.getText();

		System.out.println(BaseClass.requisitionCode);
	}

	public void requisitionApprovalAlert(String requisitionType) throws InterruptedException {

		if (requisitionType.toLowerCase().equals("centre")) {
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(ApproveRequisitionLink);
			WebElementUtils.scrolltoview(ApproveRequisitionLink);
			webDriverclick(ApproveRequisitionLink);
		} else {
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(DeptApproveRequisitionLink);
			WebElementUtils.scrolltoview(DeptApproveRequisitionLink);
			webDriverclick(DeptApproveRequisitionLink);
		}

		System.out.println(BaseClass.requisitionCode);

		FilterRequisitionCode.sendKeys(BaseClass.requisitionCode);
		SearchButton.click();
		Thread.sleep(1000);

		if (requisitionType.toLowerCase().equals("centre")) {
			Approveicon.click();
		} else {
			DeptApproveicon.click();
		}

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,250)");
		Comments.sendKeys(excelutil.getData(24, 1, 14));
		ApproveButton.click();
	}

	public void requisitionApproval(String user, String requisitionType) throws InterruptedException {

		if (user.trim().toLowerCase().equals("headteacher")) {
			JavascriptExecutor scroll = (JavascriptExecutor) getDriver();
			scroll.executeScript("window.scrollBy(0,1000)");
		}
		if (requisitionType.toLowerCase().equals("centre")) {
			Thread.sleep(2000);
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(ApproveRequisitionLink);
			WebElementUtils.scrolltoview(ApproveRequisitionLink);
			webDriverclick(ApproveRequisitionLink);
		} else {
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(DeptApproveRequisitionLink);
			WebElementUtils.scrolltoview(DeptApproveRequisitionLink);
			webDriverclick(DeptApproveRequisitionLink);
		}

		System.out.println(BaseClass.requisitionCode);

		FilterRequisitionCode.sendKeys(BaseClass.requisitionCode);
		SearchButton.click();
		Thread.sleep(1000);

		if (requisitionType.toLowerCase().equals("centre")) {
			webDriverclick(Approveicon);
		} else {
			webDriverclick(DeptApproveicon);
		}

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,250)");
		Comments.sendKeys(excelutil.getData(24, 1, 14));
		ApproveButton.click();

	}

	/////////////////////////// CenterBasedSendForClarificationElements/////////////////////////////

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Request_Need_Info')]")
	WebElement NeedMoreInformationLink;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Dept_Request_Need_Info')]")
	WebElement DeptNeedMoreInformationLink;

	@FindBy(xpath = "//*[@title='Send Clarification']")
	WebElement SendClarificationButton;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Request_Send_Info')]")
	WebElement ReceivedMoreInformationLink;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Dept_Request_Send_Info')]")
	WebElement DeptReceivedMoreInformationLink;

	public void requisitionWaitingforApprovalLink(String SendForClarificationType) throws InterruptedException {

		if (SendForClarificationType.toLowerCase().equals("centre")) {
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(ApproveRequisitionLink);
			WebElementUtils.scrolltoview(ApproveRequisitionLink);
			webDriverclick(ApproveRequisitionLink);
		} else {

			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(DeptApproveRequisitionLink);
			WebElementUtils.scrolltoview(DeptApproveRequisitionLink);
			webDriverclick(DeptApproveRequisitionLink);
		}
	}

	public void filterRequisitionCode() throws InterruptedException {

		FilterRequisitionCode.sendKeys(BaseClass.requisitionCode);
		Thread.sleep(2000);

		webDriverclick(SearchButton);

		webDriverclick(Approveicon);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		Comments.sendKeys(excelutil.getData(24, 1, 14));

		Thread.sleep(2000);

	}

	public void centerBasedSendForClarification() throws InterruptedException {
		webDriverclick(SendForClarificationButton);
	}

	public void sendMoreInformationToCEO(String SendForClarificationType) throws InterruptedException {

		if (SendForClarificationType.toLowerCase().equals("centre")) {
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(NeedMoreInformationLink);
			WebElementUtils.scrolltoview(NeedMoreInformationLink);
			webDriverclick(NeedMoreInformationLink);
		}

		else {
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(DeptNeedMoreInformationLink);
			WebElementUtils.scrolltoview(DeptNeedMoreInformationLink);
			webDriverclick(DeptNeedMoreInformationLink);
		}

		FilterRequisitionCode.sendKeys(BaseClass.requisitionCode);
		Thread.sleep(2000);

		webDriverclick(SearchButton);

		webDriverclick(Approveicon);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		Comments.sendKeys(excelutil.getData(24, 1, 14));

		Thread.sleep(2000);
		webDriverclick(SendClarificationButton);
	}

	public void receivedMoreInformation(String SendForClarificationType) throws InterruptedException {

		if (SendForClarificationType.toLowerCase().equals("centre"))

		{
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(ReceivedMoreInformationLink);
			WebElementUtils.scrolltoview(ReceivedMoreInformationLink);
			webDriverclick(ReceivedMoreInformationLink);
		}

		else {
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(DeptReceivedMoreInformationLink);
			WebElementUtils.scrolltoview(DeptReceivedMoreInformationLink);
			webDriverclick(DeptReceivedMoreInformationLink);
		}

		FilterRequisitionCode.sendKeys(BaseClass.requisitionCode);
		Thread.sleep(2000);

		webDriverclick(SearchButton);

		webDriverclick(Approveicon);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		Comments.sendKeys(excelutil.getData(24, 1, 14));

		Thread.sleep(2000);
		webDriverclick(ApproveButton);
	}

	//////////////////////// CenterAndDeptBasedDeniedElements///////////////////////////////////////////////////

	public void ceorequisitionDenied(String Denied) throws InterruptedException {

		if (Denied.toLowerCase().equals("centre")) {
			webDriverclick(DenyButton);
			Alert a = getDriver().switchTo().alert();
			a.accept();
		}

		else {
			webDriverclick(DenyButton);
			Alert a = getDriver().switchTo().alert();
			a.accept();
		}
	}

};