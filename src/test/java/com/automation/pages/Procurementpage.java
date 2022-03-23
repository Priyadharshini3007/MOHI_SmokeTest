package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;
import static com.automation.utils.WebElementUtils.elementVisible;
import static com.automation.utils.WebElementUtils.confirmationMsg;
import static com.automation.utils.WebElementUtils.dateFn;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

import junit.framework.Assert;

public class Procurementpage {
	public Procurementpage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "Filter_RequisitionCode")
	private WebElement requisitioncodefield;

	@FindBy(id = "btnSearch")
	private WebElement searchbutton;

	@FindBy(id = "btnRefresh")
	private WebElement clearfilterbutton;

	@FindBy(xpath = "//a[@title='Click here to view this Requisition']")
	private WebElement viewrequisitionbutton;

	@FindBy(xpath = "//a[@title='View LPO Approval workflow' or @title='Approve/Deny Requisition']")
	private WebElement approvedenyrequisitionbtn;

	@FindBy(id = "Filter_LPOCode")
	private WebElement lpocodesearchfield;

	@FindBy(xpath = "//a[@title='Click here to view this LPO']")
	private WebElement viewlpoicon;

	@FindBy(xpath = "//a[@title='Click here to view the goods received history']")
	private WebElement goodsreceivedicon;

	@FindBy(xpath = "//a[@title='Approve/Deny LPO Cancellation' or @title='Initiate LPO Cancellation']")
	private WebElement initiatelpocancellationicon;

	@FindBy(name = "FromDate")
	private WebElement fromdatefield;

	@FindBy(xpath = "//div[@class='datepicker-days'] //th[@class='datepicker-switch']")
	private WebElement selectmonthyear;

	@FindBy(xpath = "//div[@class='datepicker-days'] //th[@class='next']")
	private WebElement nextclick;

	@FindBy(id = "txtToDate")
	private WebElement todatefield;

	@FindBy(xpath = "//button[@value='GO']")
	private WebElement gobuttonfield;

	@FindBy(id = "Filter_CenterId")
	private WebElement centrefield;

	@FindBy(id = "Filter_StatusID")
	private WebElement paidstatusfield;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPO_Create')]")
	private WebElement lpocreationlink;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPO_Appr')]")
	private WebElement lpoapprovallink;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPO_Need_Info')]")
	private WebElement lpoNeedClarificationAlert;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPO_Send_Info')]")
	private WebElement lpoReceivedInformationAlert;

	@FindBy(xpath = "//button[@value='Need More Info']")
	private WebElement lpoNeedClarification;

	@FindBy(xpath = "//button[@value='Need More Info from Procurement Manager']")
	private WebElement lpoNeedClarificationFromPM;

	@FindBy(xpath = "//button[@value='Send Info']")
	private WebElement lpoSendInfo;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPO_Deny')]")
	private WebElement lpoDeniedAlert;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPO_UnDelivered_Within_Date')]")
	private WebElement LPOUnDeliveredAlert;

	@FindBy(xpath = "//a[@title='Click here to Create LPO/View LPO']//i")
	private WebElement createlpoicon;

	@FindBy(id = "LPOStartDate")
	private WebElement lpostartdatefield;

	@FindBy(id = "LPOEndDate")
	private WebElement lpoenddatefield;

	@FindBy(name = "itemdetails[0].ItemRate")
	private WebElement costfield;

	@FindBy(id = "drpSupplier")
	private WebElement supplierselection;

	@FindBy(id = "btnCreateLPO")
	private WebElement createlpobutton;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPOCancel_Appr')]")
	private WebElement LPOCancelApprAlert;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPOCancel_Deny')]")
	private WebElement LPOCancelDenyAlert;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPOCancel_Need_Info')]")
	private WebElement LPOCancelNeedInfoAlert;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPOCancel_Send_Info')]")
	private WebElement LPOCancelSendInfoAlert;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPOPay_Appr')]")
	private WebElement LPOPayApprAlert;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPOPay_Deny')]")
	private WebElement LPOPayDenyAlert;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPO_Pay_Det')]")
	private WebElement LPOPayReqApproveAlert;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPOPay_Need_Info')]")
	private WebElement LPOPayNeedInfoAlert;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPOPay_Send_Info')]")
	private WebElement LPOPaySendInfoAlert;

	@FindBy(xpath = "//a[@title='Approve/Deny LPO Payment']")
	private WebElement LPOpaymentIcon;

	@FindBy(id = "Comments")
	private WebElement commentsfield;

	@FindBy(xpath = "//button[@value='Approve']")
	private WebElement LPOApprove;
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement LPOCancellationApproval;

	@FindBy(xpath = "//button[@value='Deny']")
	private WebElement denyandcloseapplicationbtn;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=LPO_Pay_Init')]")
	private WebElement lpopaymentlink;

	@FindBy(xpath = "//a[@title='Click here to Initiate LPO Payment']")
	private WebElement initiatelpopaymentlink;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement lpopaymentcheckbox;

	@FindBy(name = "IsCheckTransaction")
	private WebElement chequetransactionradiobutton;

	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']//button[2]")
	private WebElement intiatepaymentsavebutton;

	@FindBy(name = "itemdetails[0].ItemCost")
	private WebElement itemratebutton;

	@FindBy(xpath = "//*[contains(text(),'RMOHI')]")
	WebElement requisitionCodeText;

	@FindBy(xpath = "//*[@id='spnSupplierAlert']")
	private WebElement SupplierAlert;

	@FindBy(xpath = "//*[contains(text(),'LMOHI')]")
	WebElement LPOCodeText;

	@FindBy(xpath = "//td[contains(text(),'Cancelled')]")
	WebElement LPOCancelledStatus;

	@FindBy(xpath = "//td[contains(text(),'Payment Approved')]")
	WebElement LPOPaymentApproveStatus;

	@FindBy(xpath = "//td[contains(text(),'Payment Denied')]")
	WebElement LPOPaymentDeniedStatus;

	@FindBy(xpath = "//td[contains(text(),'Paid')]")
	WebElement LPOPaidStatus;

	@FindBy(xpath = "//td[contains(text(),'Grand Total')]/following-sibling:: td[3]")
	WebElement LPOGrandTotal;

	@FindBy(xpath = "//a[@title='Click here to enter the number of goods received']")
	WebElement GrnIcon;

	@FindBy(xpath = "//button[@title='Add Bank Deposit Slip Number']")
	WebElement AddbankDepositSlipNoIcon;

	@FindBy(id = "Filter_LPOCode")
	WebElement LPOCode;

	@FindBy(name = "BankDepositNo")
	WebElement BankDepositNo;

	@FindBy(xpath = "//input[@title='Enter the Quantity Received']")
	WebElement ItmQtyRcvd;

	@FindBy(id = "txtReceivingComment")
	WebElement RCmnts;

	@FindBy(id = "InvoiceNumber")
	WebElement InvNo;

	@FindBy(id = "DeliveryNumber")
	WebElement DelvryNo;

	@FindBy(id = "btnSearch")
	WebElement btnSearch;

	@FindBy(id = "BankDepositSlipNumber")
	WebElement BankDepositSlipNumber;

	@FindBy(id = "DepositDate")
	WebElement DepositDateFld;

	@FindBy(xpath = "//td[@class='today day']")
	WebElement DepositDate;

	@FindBy(xpath = "//button[@title='Save this record']")
	WebElement SaveBtn;

	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']//button[2]")
	WebElement saveBankSlipBtn;

	@FindBy(xpath = "//*[@title='Expand Requisition']")
	WebElement ExpandRequisition;

	@FindBy(xpath = "//*[@id='flash']")
	WebElement flash;

	public void LPOPaymentIconFn() {
		webDriverclick(LPOpaymentIcon);
	}

	public void LPOPaymentIconnFn() {
		try {
			JavascriptExecutor js = ((JavascriptExecutor) getDriver());
			js.executeScript("arguments[0].click()", LPOpaymentIcon);
		} catch (Exception e) {
			System.out.println("Unable to click/Element is not available" + LPOpaymentIcon);
		}
	}

	public void BankDepositNoChckBxFn() {
		webDriverclick(BankDepositNo);
	}

	public void AddbankDepositSlipNoIconFn() {
		webDriverclick(AddbankDepositSlipNoIcon);
	}

	public void BankDepositSlipNumberFn() {
		webDriverclick(BankDepositSlipNumber);
		BankDepositSlipNumber.sendKeys("1234567");
		webDriverclick(DepositDateFld);
		dateFn(DepositDateFld);
		webDriverclick(saveBankSlipBtn);
	}

	public void verifytherequisitionlist() {
		requisitioncodefield.sendKeys(BaseClass.requisitionCode);
		webDriverclick(searchbutton);
	}

	public void requisitionlist(String reqCode) {
		requisitioncodefield.sendKeys(reqCode);
		webDriverclick(searchbutton);
	}

	public void verifyviewrequisitionbutton() {
		webDriverclick(viewrequisitionbutton);
	}

	public void verifyapproveanddenybutton() {
		webDriverclick(approvedenyrequisitionbtn);
	}

	public void navigatetomainpage() {
		getDriver().navigate().back();
	}

	public void verifytheclearfilterbutton() {
		webDriverclick(clearfilterbutton);
	}

	public void verifywithlposearch(String lpocode) {
		lpocodesearchfield.sendKeys(lpocode);
		webDriverclick(searchbutton);
	}

	public void verifygoodsreceivediconbutton() {
		webDriverclick(goodsreceivedicon);
	}

	public void verifyinitiatelpocancellation() {
		elementVisible(initiatelpocancellationicon);
	}

	public void selectafromdate() {
		com.automation.utils.excelutil.Excelp(".//TestData1.xlsx");

		fromdatefield.click();
		String date = excelutil.getData(3, 1, 0);
		String monthyear, day;
		String dateArray[] = date.split("-");
		day = dateArray[0];
		monthyear = dateArray[1] + " " + dateArray[2];

		while (true) {

			String text = getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[2]"))
					.getText();

			if (text.equals(monthyear)) {
				break;
			} else {
				getDriver().findElement(By.xpath("//th[@class='prev']")).click();
			}
		}
		getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody//tr//td[contains(text()," + day + ")]"))
				.click();
	}

	public void selecttodate() {
		com.automation.utils.excelutil.Excelp(".//TestData1.xlsx");

		todatefield.click();
		String date = excelutil.getData(3, 1, 1);
		String monthyear, day;
		String dateArray[] = date.split("-");
		day = dateArray[0];
		monthyear = dateArray[1] + " " + dateArray[2];

		while (true) {
			String text = getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[2]"))
					.getText();

			if (text.equals(monthyear)) {
				break;
			} else {
				getDriver().findElement(By.xpath("//th[@class='next']")).click();
			}
		}

		getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody//tr//td[contains(text()," + day + ")]"))
				.click();
	}

	public void selectgobuttonfield() {
		webDriverclick(gobuttonfield);
	}

	public void choosecentrefield(String centre) {
		centrefield.sendKeys(centre);
	}

	public void choosethestatus(String status) {
		paidstatusfield.sendKeys(status);
	}

	public void clickonfindrecords() {
		webDriverclick(searchbutton);
	}

	public void searchwithlpofield(String lpo) {
		lpocodesearchfield.sendKeys(lpo);
	}

	public void createlpolink() {

		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(lpocreationlink);
		WebElementUtils.scrolltoview(lpocreationlink);
		webDriverclick(lpocreationlink);
	}

	public void createlpoicon() {
		webDriverclick(createlpoicon);
	}

	public void LPOgettext() {
		String requisitionCode = requisitionCodeText.getText();
		System.out.println(requisitionCode);
	}

	public void enterlpostartdate() {
		dateFn(lpostartdatefield);
		lpostartdatefield.sendKeys(Keys.TAB);
	}

	public void enterlpoenddate() {
		webDriverclick(lpoenddatefield);
		webDriverclick(nextclick);
		getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody//tr//td[contains(text()," + 15 + ")]"))
				.click();
	}

	public void selectthechekboxes(String item, String supplier) throws InterruptedException {
		List<WebElement> AllCheckBoxes = getDriver().findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of Check boxes : " + Integer.toString(AllCheckBoxes.size()));
		int index = 0;
		for (WebElement cb : AllCheckBoxes) {
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("arguments[0].scrollIntoView();", cb);
			webDriverclick(cb);
			// cb.click();
			this.lpodetails(item, supplier, index);
			index = index + 1;
		}
		System.out.println("All check boxes have been checked");
	}

	public void lpodetails(String item, String supplier, int index) throws InterruptedException {
		WebElement ItemCost = getDriver().findElement(By.xpath("//*[@name='itemdetails[" + index + "].ItemCost']"));
		ItemCost.sendKeys(item);
		supplierselection.sendKeys(supplier);
		Thread.sleep(1000);
	}

	public void createlpobutton() throws InterruptedException {
		webDriverclick(createlpobutton);

		WebElementUtils.waitForVisible(LPOCodeText);
		WebElementUtils.scrolltoview(LPOCodeText);

		BaseClass.lpoCode = LPOCodeText.getText();
		BaseClass.lpoAmt = LPOGrandTotal.getText();
		System.out.println(BaseClass.lpoCode + "," + BaseClass.lpoAmt);

	}

	public void clicklpoapprovallink() {

		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(lpoapprovallink);
		WebElementUtils.scrolltoview(lpoapprovallink);
		webDriverclick(lpoapprovallink);
	}

	public void searchLPOCode() throws InterruptedException {
		WebElementUtils.scrolltoview(LPOCodeText);
		lpocodesearchfield.sendKeys(BaseClass.lpoCode);
		Thread.sleep(2000);
		webDriverclick(searchbutton);
	}

	public void searchLPOCodeVerf() {
		lpocodesearchfield.sendKeys(BaseClass.lpoCode);
		if (LPOpaymentIcon.isDisplayed()) {
			System.out.println("Lpo code is available");
		} else {
			System.out.println("Lpo code is not available");
		}
	}

	public void LPOApproval() {
		commentsfield.sendKeys("Approved");
		webDriverclick(LPOApprove);
	}

	public void LpoUserIntimationMsg() throws InterruptedException {
		String message = "The LPO has been approved, generated and sent to the supplier directly.";
		Thread.sleep(2000);
		confirmationMsg(message);
	}

	public void LpoBankSlipNoUpdateMsg() {
		String message = "Bank pay slip number updated sucessfully";
		confirmationMsg(message);
	}

	public void LPOCancellationApproval() throws InterruptedException {
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()", commentsfield);
		commentsfield.sendKeys("TestComments");
		webDriverclick(LPOCancellationApproval);
		Thread.sleep(2000);
		BaseClass.lpoCode = LPOCodeText.getText();
		System.out.println(BaseClass.lpoCode);
	}

	public void LPOCancelApprAlertFn() {
		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(LPOCancelApprAlert);
		WebElementUtils.scrolltoview(LPOCancelApprAlert);

		webDriverclick(LPOCancelApprAlert);
	}

	public void LPOCancelNeedInfoAlertFn() {
		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(LPOCancelNeedInfoAlert);
		WebElementUtils.scrolltoview(LPOCancelNeedInfoAlert);

		webDriverclick(LPOCancelNeedInfoAlert);
	}

	public void LPOCancelSendInfoAlertFn() {
		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(LPOCancelSendInfoAlert);
		WebElementUtils.scrolltoview(LPOCancelSendInfoAlert);

		webDriverclick(LPOCancelSendInfoAlert);
	}

	public void LPOCancellationApprovalicon() {
		webDriverclick(initiatelpocancellationicon);
	}

	public void denialprocess() {
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()", commentsfield);
		commentsfield.sendKeys("TestComments");
		webDriverclick(denyandcloseapplicationbtn);
		getDriver().switchTo().alert().accept();
	}

	public void NeedClarificationAlertFn() {

		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(lpoNeedClarificationAlert);
		WebElementUtils.scrolltoview(lpoNeedClarificationAlert);
		webDriverclick(lpoNeedClarificationAlert);
	}

	public void NeedClarificationBtnFn() {
		commentsfield.sendKeys("Need more information");
		webDriverclick(lpoNeedClarification);
	}

	public void NeedClarificationFromPMBtnFn() {
		commentsfield.sendKeys("Need more information from Procurement Manager");
		webDriverclick(lpoNeedClarificationFromPM);
	}

	public void sendClarAlertFn() {
		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(lpoReceivedInformationAlert);
		WebElementUtils.scrolltoview(lpoReceivedInformationAlert);

		webDriverclick(lpoReceivedInformationAlert);
	}

	public void sendClarBtnFn() {
		commentsfield.sendKeys("More Clarification Sent");
		webDriverclick(lpoSendInfo);
	}

	public void lpopaymentlink() {
		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(lpopaymentlink);
		WebElementUtils.scrolltoview(lpopaymentlink);

		webDriverclick(lpopaymentlink);
	}

	public void initiatelpopaymentbutton() {
		webDriverclick(lpopaymentcheckbox);
		webDriverclick(initiatelpopaymentlink);
	}

	public void enterlpopaymentcomments() {
		commentsfield.sendKeys("TestComments");
		webDriverclick(intiatepaymentsavebutton);
	}

	public void lpoPaymentApprovalAlert() {
		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(LPOPayApprAlert);
		WebElementUtils.scrolltoview(LPOPayApprAlert);

		webDriverclick(LPOPayApprAlert);
	}

	public void lpoPaymentApprovalAlertFn() {
		try {

			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(LPOPayApprAlert);
			WebElementUtils.scrolltoview(LPOPayApprAlert);
			JavascriptExecutor js = ((JavascriptExecutor) getDriver());
			js.executeScript("arguments[0].click()", LPOPayApprAlert);
		} catch (Exception e) {
			System.out.println("Unable to click/Element is not available" + LPOPayApprAlert);
		}
	}

	public void LPOPayDenyAlertFn() {
		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(LPOPayDenyAlert);
		WebElementUtils.scrolltoview(LPOPayDenyAlert);
		webDriverclick(LPOPayDenyAlert);
	}

	public void LPOPayReqApproveAlertFn() {

		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(LPOPayReqApproveAlert);
		WebElementUtils.scrolltoview(LPOPayReqApproveAlert);
		webDriverclick(LPOPayReqApproveAlert);
	}

	public void LPOPayNeedInfoAlertFns() {
		try {
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(LPOPayNeedInfoAlert);
			WebElementUtils.scrolltoview(LPOPayNeedInfoAlert);
			JavascriptExecutor js = ((JavascriptExecutor) getDriver());
			js.executeScript("arguments[0].click()", LPOPayNeedInfoAlert);
		} catch (Exception e) {
			System.out.println("Unable to click/Element is not available" + LPOPayNeedInfoAlert);
		}
	}

	public void LPOPaySendInfoAlertFns() {
		try {
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(LPOPaySendInfoAlert);
			WebElementUtils.scrolltoview(LPOPaySendInfoAlert);
			JavascriptExecutor js = ((JavascriptExecutor) getDriver());
			js.executeScript("arguments[0].click()", LPOPaySendInfoAlert);
		} catch (Exception e) {
			System.out.println("Unable to click/Element is not available" + LPOPaySendInfoAlert);
		}
	}

	public void LPOPayNeedInfoAlertFn() {
		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(LPOPayNeedInfoAlert);
		WebElementUtils.scrolltoview(LPOPayNeedInfoAlert);

		webDriverclick(LPOPayNeedInfoAlert);
	}

	public void LPOPaySendInfoAlertFn() {

		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(LPOPaySendInfoAlert);
		WebElementUtils.scrolltoview(LPOPaySendInfoAlert);
		webDriverclick(LPOPaySendInfoAlert);
	}

	public void lposearchbutton(String lpovalue) {

		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(lpoapprovallink);
		WebElementUtils.scrolltoview(lpoapprovallink);
		webDriverclick(lpoapprovallink);
	}

	public void lpoDeniedAlertFn() {

		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(lpoDeniedAlert);
		WebElementUtils.scrolltoview(lpoDeniedAlert);
		webDriverclick(lpoDeniedAlert);
	}

	public void lpoDeniedCancellationAlertFn() {

		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(LPOCancelDenyAlert);
		WebElementUtils.scrolltoview(LPOCancelDenyAlert);
		webDriverclick(LPOCancelDenyAlert);
	}

	public void LPOsNotDeliveredFn() {
		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(LPOUnDeliveredAlert);
		WebElementUtils.scrolltoview(LPOUnDeliveredAlert);
		webDriverclick(LPOUnDeliveredAlert);
	}

	public void deniedLPO() {
		elementVisible(approvedenyrequisitionbtn);
	}

	public void cancelledLPOStatus() {
		elementVisible(LPOCancelledStatus);
	}

	public void LPOPyamentStatusFn() {
		elementVisible(LPOPaymentApproveStatus);
	}

	public void LPOPyamentDeniedStatusFn() {
		elementVisible(LPOPaymentDeniedStatus);
	}

	public void LPOPaidStatusFn() {
		elementVisible(LPOPaidStatus);
	}

}