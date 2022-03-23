package com.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.automation.utils.WebElementUtils.webDriverclick;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;
import static com.automation.utils.DriverUtils.getDriver;

public class AdminAssistantFeeDeposit {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public AdminAssistantFeeDeposit() {

		PageFactory.initElements(getDriver(), this);

	}

	/////////////////////////////////// Fee Deposit
	/////////////////////////////////// steps//////////////////////////////
	@FindBy(xpath = "//a[contains(@class,'nav-link') and contains(@href,'/Student/StudentListDetails')]") // adminassistant

	// student

	// menu

	WebElement aaStudentMenu;
	@FindBy(xpath = "//a[contains(text(),'Fee Deposit')]") // admin assistant

	// feedeposit menu

	WebElement aaStudentSubmenu;

	@FindBy(xpath = "//*[@id='TxtStudent']") // enter the name of the student

	WebElement aaEnterStudentName;

	@FindBy(xpath = "(//a[@id='PayButton'])[1]")

	WebElement aaAdmissionFeePayment;// for clicking the admissionfee payment

	// icon

	@FindBy(linkText = "  ksh  ")

	WebElement aascheduledAdmissionFeepayment; // scheduled admission fee

	// deposit

	@FindBy(xpath = "//button[@id='savebutton']")

	WebElement aaAdmissionFeeSaveButton;// Save button for admission fee payment

	@FindBy(xpath = "//button[@id='savebutton']")

	WebElement aascheduledAdmissionFeeSaveButton;

	@FindBy(xpath = "(//a[@id='PayButton'])[1]")

	WebElement aaDevelopmentFeePayment;// for clicking the development payment

	// icon

	@FindBy(xpath = "//button[@id='savebutton']")

	WebElement aaDevelopmentFeeSaveButton;// Save button for development fee

	// payment

	@FindBy(xpath = "(//input[@name='Receipt'])[1]")

	WebElement aaAdmissionFeeCheckBox;// checkbox

	@FindBy(xpath = "(//input[@name='Receipt'])[2]")

	WebElement aaDevelopmentFeeCheckBox;// Development Fee Check Box

	@FindBy(xpath = "(//input[@name='Receipt'])[3]")

	WebElement aaexamfeeFeeCheckBox;

	@FindBy(xpath = "(//input[@name='Receipt'])[4]")

	WebElement aaexamfee2CheckBox;

	@FindBy(xpath = "(//input[@name='Receipt'])[5]")

	WebElement aatransportFeeCheckBox;

	@FindBy(xpath = "(//input[@name='Receipt'])[6]")

	WebElement aatransport2FeeCheckBox;

	@FindBy(xpath = "(//input[@name='Receipt'])[7]")

	WebElement aatuitionFeeCheckBox;

	@FindBy(xpath = "(//input[@name='Receipt'])[8]")

	WebElement aatuition2FeeCheckBox;

	@FindBy(xpath = "//button[@id='btnCombinedReceipt']")

	WebElement printcombinedreceiptbutton;

	@FindBy(xpath = "//a[text()='View Recent Transactions']")

	WebElement ViewRecentTransactions;

	@FindBy(xpath = "//a[@id='printpagebutton']")

	WebElement clickprintlink;

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=FeeSchedule')]")

	WebElement feedscheduledtodaylink;

	@FindBy(xpath = "//input[@id='Filter_FirstName']")

	WebElement enterthestudentname;

	@FindBy(xpath = "//*[@id='tblStudentListView']/tbody/tr[2]/td[11]/div/a[3]")

	WebElement paymenticon;
	

	@FindBy(xpath = "//*[@title='Expand Student']")
		WebElement ExpandStudent;

	///////////////////////////// Fee deposit workflow
	///////////////////////////// methods/////////////////////////////////

	public void aafeedepositmenuselection() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");

		aaStudentMenu.click();
		aaStudentSubmenu.click();

	}

	public void EnterTheStudentNameForFeepayment() throws InterruptedException {

		try {
			aaEnterStudentName.sendKeys(BaseClass.cmfID);
			Thread.sleep(3000);
			aaEnterStudentName.sendKeys(Keys.ARROW_DOWN);
			aaEnterStudentName.sendKeys(Keys.ENTER);
		}

		catch (Exception e) {
			System.out.println("Student is not Available");
		}

	}
	
	public void StudentNameForNewFeepayment() throws InterruptedException {

		try {
			aaEnterStudentName.sendKeys(BaseClass.cmfID);
			Thread.sleep(3000);
			aaEnterStudentName.sendKeys(Keys.ARROW_DOWN);
			aaEnterStudentName.sendKeys(Keys.ENTER);
		}

		catch (Exception e) {
			System.out.println("Student is not Available");
		}

	}
	
	
	
	public void StudentNameForNewYrlyFeepayment() throws InterruptedException {

		try {
			aaEnterStudentName.sendKeys(BaseClass.cmfID);
			Thread.sleep(3000);
			aaEnterStudentName.sendKeys(Keys.ARROW_DOWN);
			aaEnterStudentName.sendKeys(Keys.ENTER);
		}

		catch (Exception e) {
			System.out.println("Student is not Available");
		}

	}
	
	public void StudentNameForNewMonthlyFeepayment() throws InterruptedException {

		try {
			aaEnterStudentName.sendKeys(BaseClass.cmfID);
			Thread.sleep(3000);
			aaEnterStudentName.sendKeys(Keys.ARROW_DOWN);
			aaEnterStudentName.sendKeys(Keys.ENTER);
		}

		catch (Exception e) {
			System.out.println("Student is not Available");
		}

	}
	
	public void StudentNameForNewTermlyFeepayment() throws InterruptedException {

		try {
			aaEnterStudentName.sendKeys(BaseClass.cmfID);
			//aaEnterStudentName.sendKeys(excelutil.getData(38, 16, 0));
			Thread.sleep(3000);
			aaEnterStudentName.sendKeys(Keys.ARROW_DOWN);
			aaEnterStudentName.sendKeys(Keys.ENTER);
		}

		catch (Exception e) {
			System.out.println("Student is not Available");
		}

	}
	
	
	public void SelectAdmissionFeePaymentIcon()  {
		
			aaAdmissionFeePayment.click();
			
	}

//		catch (Exception e) {
//
//			System.out.println("Already Paid");
//		}

	

	public void SelectscheduledAdmissionFeePaymentIcon() throws InterruptedException {

		try {
			aascheduledAdmissionFeepayment.click();
			Thread.sleep(3000);
		}

		catch (Exception e) {

			System.out.println("Already Paid");
		}

	}

	public void AdmissionFeepaymentSaveButton() throws InterruptedException {

		try {
			JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
			scrolldown1.executeScript("window.scrollBy(0,3000)");

			webDriverclick(aaAdmissionFeeSaveButton);
		}

		catch (Exception e) {
			System.out.println("Already Saved");
		}

	}

	// aascheduledAdmissionFeeSaveButton

	public void AdmissionscheduledFeepaymentSaveButton() throws InterruptedException {

		try {
			JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
			scrolldown1.executeScript("window.scrollBy(0,3000)");
			aascheduledAdmissionFeeSaveButton.click();
			Thread.sleep(3000);
		}

		catch (Exception e) {

			System.out.println("Already Saved");
		}

	}

	public void SelectDevelopmentFeePaymentIcon() throws InterruptedException {
		try {
			aaDevelopmentFeePayment.click();
			Thread.sleep(3000);
		}

		catch (Exception e) {

			System.out.println("Development Fee not available for this student");
		}

	}

	public void DevelopmentFeepaymentSaveButton() throws InterruptedException {

		try {
			JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
			scrolldown1.executeScript("window.scrollBy(0,1500)");
			Thread.sleep(3000);
			aaDevelopmentFeeSaveButton.click();
			Thread.sleep(3000);
			// refreshFn();
		}

		catch (Exception e) {

			System.out.println("Development Fee not available for this student");
		}
	}

	public void AdmissionFeeCheckBox() throws InterruptedException {

		try{
		aaAdmissionFeeCheckBox.click();

		Thread.sleep(3000);

		aaDevelopmentFeeCheckBox.click();

		Thread.sleep(3000);

		if (aaexamfeeFeeCheckBox != null)

		{

			aaexamfeeFeeCheckBox.click();

			Thread.sleep(3000);

		}

		if (aaexamfee2CheckBox != null)

		{

			aaexamfee2CheckBox.click();

			Thread.sleep(3000);

		}

		if (aatransportFeeCheckBox != null)

		{

			// aatransportFeeCheckBox.click();
			webDriverclick(aatransportFeeCheckBox);
			Thread.sleep(3000);

		}

		if (aatransport2FeeCheckBox != null)

		{

			// aatransport2FeeCheckBox.click();
			webDriverclick(aatransport2FeeCheckBox);
			Thread.sleep(3000);

		}

		if (aatuitionFeeCheckBox != null)

		{

			// aatuitionFeeCheckBox.click();
			webDriverclick(aatuitionFeeCheckBox);
			Thread.sleep(3000);

		}

		if (aatuition2FeeCheckBox != null)

		{

			// aatuition2FeeCheckBox.click();
			webDriverclick(aatuition2FeeCheckBox);
			Thread.sleep(3000);

		}

		// printcombinedreceiptbutton.click();
		webDriverclick(printcombinedreceiptbutton);
		String parent = getDriver().getWindowHandle();

		Thread.sleep(3000);

		for (String winHandle : getDriver().getWindowHandles()) {

			getDriver().switchTo().window(winHandle); // switch focus to new
														// window

		}

		// String second = driver.getWindowHandle();

		getDriver().close();

		getDriver().switchTo().window(parent);

	}
		catch (Exception e){
			
			System.out.println("CheckBox is not clickable");
		}
	}

	// ViewRecentTransactions

	public void ViewRecentTransactions() throws InterruptedException {

		try {
			webDriverclick(ViewRecentTransactions);
			String parent = getDriver().getWindowHandle();
			Thread.sleep(3000);
			for (String winHandle : getDriver().getWindowHandles()) {
				getDriver().switchTo().window(winHandle); // switch focus to new
															// window
			}
			// String second = getDriver().getWindowHandle();
			Thread.sleep(3000);
			getDriver().close();
			getDriver().switchTo().window(parent);
		}

		catch (Exception e) {
			System.out.println("View transaction is not available");
		}
	}

	// feedscheduledtodaylink

	public void FeeScheduledtodaylink() throws InterruptedException {

		try {
			
			webDriverclick(ExpandStudent);

			WebElementUtils.waitForVisible(feedscheduledtodaylink);
			WebElementUtils.scrolltoview(feedscheduledtodaylink);
			feedscheduledtodaylink.click();
		}

		catch (Exception e) {

			System.out.println("scheduled Today Link is not available");

		}

	}

	// enterthestudentname

	public void enterthestudentname() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		try {
			enterthestudentname.sendKeys(excelutil.getData(4, 1, 0));
			Thread.sleep(3000);
			enterthestudentname.sendKeys(Keys.ARROW_DOWN);
			enterthestudentname.sendKeys(Keys.ENTER);
			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript("arguments[0].click()", paymenticon);
		}

		catch (Exception e) {

			System.out.println("Student is not available");
		}
	}
	// aaDevelopmentFeePayment

	public void examinationfee() throws InterruptedException {
		for (int i = 0; i < 2; i++) {
			try {
				// aaAdmissionFeePayment.click();
				webDriverclick(aaAdmissionFeePayment);
			} catch (Exception e) {
				System.out.println("Fee is already paid");
			}
			Thread.sleep(3000);
			this.AdmissionFeepaymentSaveButton();
			Thread.sleep(3000);
			//refreshFn();
		}

	}

	public void refreshFn() throws InterruptedException {
		getDriver().navigate().refresh();
		EnterTheStudentNameForFeepayment();
	}

	public void transportfee() throws InterruptedException {

		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1500)");
		for (int i = 0; i < 2; i++) {
			try {
				// aaAdmissionFeePayment.click();
				webDriverclick(aaAdmissionFeePayment);
			} catch (Exception e) {
				System.out.println("Fee is already paid");
			}
			Thread.sleep(3000);
			this.AdmissionFeepaymentSaveButton();
			Thread.sleep(3000);
			//refreshFn();
		}

	}

	public void tutionfee() throws InterruptedException {
		for (int i = 0; i < 2; i++) {
			try {
				aaAdmissionFeePayment.click();
			} catch (Exception e) {
				System.out.println("Fee is already paid");
			}
			Thread.sleep(3000);
			this.AdmissionFeepaymentSaveButton();
			Thread.sleep(3000);
			//refreshFn();
		}

	}
	// Fee Deposit before student active

	public void AdmissionFeeCheckBoxbeforeactive() throws InterruptedException {

		try {
			aaAdmissionFeeCheckBox.click();

			Thread.sleep(3000);


			printcombinedreceiptbutton.click();

			String parent = getDriver().getWindowHandle();

			Thread.sleep(3000);

			for (String winHandle : getDriver().getWindowHandles()) {

				getDriver().switchTo().window(winHandle); // switch focus to new
															// window

			}

			// String second = driver.getWindowHandle();

			getDriver().close();

			getDriver().switchTo().window(parent);

		}

		catch (Exception e) {

			System.out.println("Not able to click checkbox");
		}

	}

}
