package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class FamilyVisit {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public FamilyVisit() {
		PageFactory.initElements(getDriver(), this);
	}

	//////////////////////// Family Visit
	//////////////////////// Steps///////////////////////////////////////////

	@FindBy(xpath = "//a[text()='Center']")
	WebElement CenterMenu;

	@FindBy(xpath = "//a[text()='Family Social Worker Assignment']")
	WebElement FamilySocialWorkerAssignmentSubmenu;

	@FindBy(xpath = "//select[@id='ddlSocialWorkers']")
	WebElement SelectSocialWorker;

	@FindBy(xpath = "//input[@id='TxtStudent']")
	WebElement SearchThestudentToAssignSociaWorker;

	@FindBy(xpath = "//a[contains(@href,'/Student/ChangeFamilySW')]")
	WebElement AssignStudentfamilyButton;

	@FindBy(xpath = "//select[@id='ChildSiblings_0__ParentSocialWorkerID']")
	WebElement SelectParentSocialWorker;

	@FindBy(xpath = "//button[@id='btnSave']")
	WebElement SavePSW;

	@FindBy(linkText = "Student")
	WebElement selectStudentmenu;

	@FindBy(linkText = "Family Visit")
	WebElement SelectFamilyVisitSubmenu;

	@FindBy(xpath = "//input[@id='TxtStudent']")
	WebElement SearchtheStudentToFillTheForm;

	@FindBy(xpath = "//input[@id='VisitDate']")
	WebElement VisitDate;

	@FindBy(xpath = "//textarea[@id='VisitReason']")
	WebElement ReasonForVisit;

	@FindBy(xpath = "//input[@id='IsFamilyStatusChange'and @value='true']")
	WebElement FamilyStatusChange;// yes

	@FindBy(xpath = "//textarea[@id='FamilyStatusChangeComment']")
	WebElement ChangeComment;

	@FindBy(xpath = "//input[@id='IsFamilyStatusChange'and @value='false']")
	WebElement NoFamilyStatusChange;

	@FindBy(xpath = "//textarea[@id='Findings']")
	WebElement Findings;

	@FindBy(xpath = "//textarea[@id='Recommendations']")
	WebElement Recommendations;

	@FindBy(xpath = "//select[@id='ddlReferrals']")
	WebElement Referral;

	@FindBy(xpath = "//button[@id='btnSavePrint']")
	WebElement SaveAndGenerateFamilyVisitForm;

	@FindBy(xpath = "//div[contains(@class, 'ui-dialog-buttonset')]//button[contains(@class, 'btn-primary')]")
	WebElement Yes;

	@FindBy(xpath = "//div[contains(@class, 'ui-dialog-buttonset')]//button[contains(@class, 'btn btn-xs ui-button ui-corner-all ui-widget')]")
	WebElement No;

	@FindBy(xpath = " //a[@title='View Family Visit Form']")
	WebElement ViewFamilyVisitFormIcon;

	@FindBy(xpath = "//a[@id='lnkPrintFamilyVisit']")
	WebElement PrintfamilyVisitForm;

	@FindBy(linkText = "Center")
	WebElement CenterMenuSw;

	@FindBy(linkText = "Family Social Worker Assignment")
	WebElement FamilySocialWorkerAssignmentsw;

	@FindBy(xpath = "//input[@id='Filter_FirstName']")
	WebElement EnterChildName;

	@FindBy(xpath = "//input[@id='Filter_StudentName']")
	WebElement EnterStudentname; // sw enter the studentname

	@FindBy(xpath = "//a[@title='Create new / Edit incomplete Family Visit Form']")
	WebElement EditIncompleteFamilyVisitForm;

	@FindBy(xpath = "//button[@id='btnSave']")
	WebElement SaveFamilyVisit;

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=TransferredSWNonAssigned')]")
	WebElement Clickthetransferstudentsocialworkerassignmentlink;
	
	@FindBy(xpath = "//*[@title='Expand Student']")
	WebElement ExpandStudent;

	@FindBy(xpath = "//a[@title='Assign social worker for family']")
	WebElement AssignSocialWorkerButton;

	@FindBy(xpath = "//select[@id='ChildSiblings_0__SocialWorkerID']")
	WebElement SelectassignedSocialWorker;// assigned social worker for transfer
											// students
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void CenterMenu() throws InterruptedException {

		try {

			com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
			CenterMenu.click();
			FamilySocialWorkerAssignmentSubmenu.click();
		}

		catch (Exception e) {

			System.out.println("Menu is not clickable");

		}

	}

	public void SelectSocialWorker() throws InterruptedException {

		try {

			Select selectsw = new Select(SelectSocialWorker);
			selectsw.selectByVisibleText(excelutil.getData(6, 1, 0));

			SearchThestudentToAssignSociaWorker.sendKeys(excelutil.getData(6, 1, 1));
			Thread.sleep(1000);
			SearchThestudentToAssignSociaWorker.sendKeys(Keys.ARROW_DOWN);
			SearchThestudentToAssignSociaWorker.sendKeys(Keys.ENTER);

			AssignStudentfamilyButton.click();

		}

		catch (Exception e) {

			System.out.println("Assign Student Family button is not available");
		}
	}

	public void SelectStudentforTransfer() throws InterruptedException {

		SearchThestudentToAssignSociaWorker.sendKeys(excelutil.getData(6, 2, 1));
		Thread.sleep(1000);
		SearchThestudentToAssignSociaWorker.sendKeys(Keys.ARROW_DOWN);
		SearchThestudentToAssignSociaWorker.sendKeys(Keys.ENTER);

		AssignSocialWorkerButton.click();

		System.out.println("print");
	}

	public void SelectSocialWorkerforTransferStudent() throws InterruptedException {
		Thread.sleep(2000);

		Select selectsw = new Select(SelectSocialWorker);
		selectsw.selectByVisibleText(excelutil.getData(6, 1, 0));

		SearchThestudentToAssignSociaWorker.sendKeys(excelutil.getData(6, 2, 3));
		Thread.sleep(1000);
		SearchThestudentToAssignSociaWorker.sendKeys(Keys.ARROW_DOWN);
		SearchThestudentToAssignSociaWorker.sendKeys(Keys.ENTER);

		 AssignStudentfamilyButton.click();
	}

	public void SelectParentSocialWorker() throws InterruptedException {

		try {
			if (SelectParentSocialWorker.isDisplayed()) {
				Select selectpsw = new Select(SelectParentSocialWorker);
				selectpsw.selectByVisibleText(excelutil.getData(6, 1, 2));
			}
		} catch (Exception e) {
			System.out.println("Parent Social Worker is not available");
		}
	}

	public void submit() throws InterruptedException {

		try {
			SavePSW.click();

			Thread.sleep(9000);
			
			Alert alert =getDriver().switchTo().alert(); alert.accept();

		} catch (Exception e) {

			System.out.println("Save button is not available");

		}

		/*
		 * Alert alert =getDriver().switchTo().alert(); alert.accept();
		 */
	}

	public void SelectFamilyVisitFromStudentMenu() throws InterruptedException {

		selectStudentmenu.click();
		SelectFamilyVisitSubmenu.click();

	}

	public void searchTheStudentToFillTheForm() throws InterruptedException {
		
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(2000);
		SearchtheStudentToFillTheForm.sendKeys(excelutil.getData(6, 1, 3));

		Thread.sleep(2000);
		SearchtheStudentToFillTheForm.sendKeys(Keys.ARROW_DOWN);
		SearchtheStudentToFillTheForm.sendKeys(Keys.ENTER);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		VisitDate.click();

		String date = excelutil.getData(6, 1, 4);
		String monthyear, day;
		String dateArray[] = date.split("-");
		day = dateArray[0];
		monthyear = dateArray[1] + " " + dateArray[2];
		// String month = "July 2010";
		// System.out.println(monthyear);
		// System.out.println(day);

		while (true) {

			String text = getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[2]"))
					.getText();

			if (text.equals(monthyear)) {
				break;
			} else {

				getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
		}

		// getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();
		getDriver().findElement(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ day + "] "))
				.click();

		ReasonForVisit.clear();
		ReasonForVisit.sendKeys(excelutil.getData(6, 1, 5));

		String text1 = "Yes";
		String familystatus = excelutil.getData(6, 1, 6);
		familyStatusSelect(text1, familystatus);
	}

	public void searchTheTransferStudentToFillTheForm() throws InterruptedException {
		Thread.sleep(2000);

		{
			SearchtheStudentToFillTheForm.sendKeys(excelutil.getData(6, 2, 3));

		}

		Thread.sleep(2000);
		SearchtheStudentToFillTheForm.sendKeys(Keys.ARROW_DOWN);
		SearchtheStudentToFillTheForm.sendKeys(Keys.ENTER);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		VisitDate.click();

		String date = excelutil.getData(6, 1, 4);
		String monthyear, day;
		String dateArray[] = date.split("-");
		day = dateArray[0];
		monthyear = dateArray[1] + " " + dateArray[2];
		// String month = "July 2010";
		// System.out.println(monthyear);
		// System.out.println(day);

		while (true) {

			String text = getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[2]"))
					.getText();

			if (text.equals(monthyear)) {
				break;
			} else {

				getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
		}

		// getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();
		getDriver().findElement(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ day + "] "))
				.click();

		ReasonForVisit.clear();
		ReasonForVisit.sendKeys(excelutil.getData(6, 1, 5));

		String text1 = "Yes";
		String familystatus = excelutil.getData(6, 1, 6);
		familyStatusSelect(text1, familystatus);
	}

	public void searchTheTransferStudentToFillTheFormassw() throws InterruptedException {
		Thread.sleep(2000);

		{
			SearchtheStudentToFillTheForm.sendKeys(excelutil.getData(6, 3, 1));

		}

		Thread.sleep(2000);
		SearchtheStudentToFillTheForm.sendKeys(Keys.ARROW_DOWN);
		SearchtheStudentToFillTheForm.sendKeys(Keys.ENTER);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		VisitDate.click();

		String date = excelutil.getData(6, 1, 4);
		String monthyear, day;
		String dateArray[] = date.split("-");
		day = dateArray[0];
		monthyear = dateArray[1] + " " + dateArray[2];
		// String month = "July 2010";
		// System.out.println(monthyear);
		// System.out.println(day);

		while (true) {

			String text = getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[2]"))
					.getText();

			if (text.equals(monthyear)) {
				break;
			} else {

				getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
		}

		// getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();
		getDriver().findElement(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ day + "] "))
				.click();

		ReasonForVisit.clear();
		ReasonForVisit.sendKeys(excelutil.getData(6, 1, 5));

		String text1 = "Yes";
		String familystatus = excelutil.getData(6, 1, 6);
		familyStatusSelect(text1, familystatus);
	}

	private void familyStatusSelect(String text1, String familystatus) {

		if (text1.equals(familystatus)) {

			FamilyStatusChange.click();
			ChangeComment.clear();
			ChangeComment.sendKeys(excelutil.getData(6, 1, 7));

		} else {
			NoFamilyStatusChange.click();
		}

		Findings.clear();

		Findings.sendKeys(excelutil.getData(6, 1, 8));

		Recommendations.clear();

		Recommendations.sendKeys(excelutil.getData(6, 1, 9));

		Select referral = new Select(Referral);
		referral.selectByVisibleText(excelutil.getData(6, 1, 10));

		try {
			SaveAndGenerateFamilyVisitForm.click();
		} catch (Exception c) {
			try {
				SaveFamilyVisit.click();
			} catch (Exception e) {
				System.out.println("Save Button is not available");
			}
		}

	}

	public void Yes() throws InterruptedException {

		Yes.click();

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", ViewFamilyVisitFormIcon);

		String parent = getDriver().getWindowHandle();
		Thread.sleep(3000);
		for (String winHandle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(winHandle); // switch focus to new
														// window
		}
		// String second = getDriver().getWindowHandle();
		getDriver().close();
		getDriver().switchTo().window(parent);

	}

	public void No() throws InterruptedException {

		Thread.sleep(3000);

		No.click();

		PrintfamilyVisitForm.click();

		String parent = getDriver().getWindowHandle();
		Thread.sleep(3000);
		for (String winHandle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(winHandle); // switch focus to new
														// window
		}
		// String second = getDriver().getWindowHandle();
		getDriver().close();
		getDriver().switchTo().window(parent);

	}

	public void centermenusw() throws InterruptedException {
		Thread.sleep(3000);
		CenterMenuSw.click();
		Thread.sleep(3000);
		FamilySocialWorkerAssignmentsw.click();
		Thread.sleep(3000);

	}

	public void EnterChildName() throws InterruptedException {
		Thread.sleep(3000);
		EnterChildName.sendKeys(excelutil.getData(6, 1, 1));
		EnterChildName.sendKeys(Keys.ENTER);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", EditIncompleteFamilyVisitForm);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

		JavascriptExecutor je = (JavascriptExecutor) getDriver();
		je.executeScript("arguments[0].click()", SaveFamilyVisit);

		Yes.click();
	}

	public void EnterStudentName() throws InterruptedException {
		Thread.sleep(3000);
		EnterStudentname.sendKeys(excelutil.getData(6, 1, 1));
		EnterStudentname.sendKeys(Keys.ENTER);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", EditIncompleteFamilyVisitForm);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

		JavascriptExecutor je = (JavascriptExecutor) getDriver();
		je.executeScript("arguments[0].click()", SaveFamilyVisit);

		Yes.click();
	}

	/*
	 * The center manager to associate the families of the students to the
	 * social workers for family visit,when students get transferred to their
	 * center. (Alert Type 1)
	 */
	public void familyvisitwhenstudentsgettransferredtotheircenter() throws InterruptedException {
		Thread.sleep(2000);
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(Clickthetransferstudentsocialworkerassignmentlink);
		WebElementUtils.scrolltoview(Clickthetransferstudentsocialworkerassignmentlink);
		
		webDriverclick(Clickthetransferstudentsocialworkerassignmentlink);
	}

	public void EntertransferChildName() throws InterruptedException {
		Thread.sleep(3000);
		EnterChildName.sendKeys(excelutil.getData(6, 2, 1));
		EnterChildName.sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", AssignSocialWorkerButton);
		// AssignSocialWorkerButton.click();

	}

	public void SelectassingnedSocialWorker() throws InterruptedException {

		try {
			if (SelectassignedSocialWorker.isDisplayed()) {

				Select selectpsw = new Select(SelectassignedSocialWorker);
				selectpsw.selectByVisibleText(excelutil.getData(6, 1, 11));

			}
		} catch (Exception e) {
			System.out.println("Assigned Social Worker is not available");
		}

	}
}
