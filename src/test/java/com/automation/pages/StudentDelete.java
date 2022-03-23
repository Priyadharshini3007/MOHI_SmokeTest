package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class StudentDelete {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public StudentDelete() {

		PageFactory.initElements(getDriver(), this);

	}
	//////////////////////////////////// Student Delete
	//////////////////////////////////// Elements////////////////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(xpath = "//a[contains(@class,'dropdown-item') and contains(@href,'/Student/StudentListDetails')]")
	WebElement Studentsubmenu;

	@FindBy(xpath = "//button[@id='submitButton']")
	WebElement gobutton;

	@FindBy(xpath = "//*[@id='Filter_CMFID']")
	WebElement CMFID;

	@FindBy(xpath = "//*[@id='btnSearch']")
	WebElement SearchButton;

	@FindBy(xpath = "//*[@title='Delete this student']")
	WebElement DeleteButton;

	@FindBy(xpath = "//*[@id='txtNewDeleteComments']")
	WebElement commentthereason;

	@FindBy(xpath = "//*[@id='btnSaveDeteleStudent']")
	WebElement SaveThecomment;

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=StudentDelete_Appr')]")
	WebElement Deletelink;

	@FindBy(xpath = "//*[@id='Comments']")
	WebElement Comments;

	@FindBy(xpath = "//*[@title='Approve ']")
	WebElement ApproveButton;

	@FindBy(xpath = "//*[@title='Deny Employee Recruitment Approval']")
	WebElement DenyButton;

	@FindBy(xpath = "//*[@title='Send for Clarification']")
	WebElement SendForClarificationToPreviousStepButton;

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=StudentDelete_Need_Info')]")
	WebElement NeedMoreinfoToDeleteStudentLink;

	@FindBy(xpath = "//*[@title='Send Clarification']")
	WebElement SendClarificationButton;

	@FindBy(xpath = "//a[contains(@href,'StudentListDetails?Filterstring=StudentDelete_Send_Info')]")
	WebElement ReceivedMoreInfoToDeleteStudentLink;

	@FindBy(xpath = "//*[@id='worflowStudentId']")
	WebElement Workflowhistory;

	@FindBy(linkText = "Inactive students")
	WebElement InActiveStudents;

	@FindBy(xpath = "(//span[@title='CMFID'])[10]")
	WebElement DeleteChild;

	@FindBy(xpath = "//*[@title='Expand Student']")
	WebElement ExpandStudent;

	@FindBy(xpath = "(//span[@title='CMFID'])[1]")
	WebElement CMFID1;

	public void InActiveStudent() {

		WebElementUtils.waitForVisible(InActiveStudents);

		InActiveStudents.click();

	}

	public void getStudent1() {

		WebElementUtils.waitForVisible(CMFID1);
		WebElementUtils.scrolltoview(CMFID1);

		BaseClass.DeleteChild = CMFID1.getText();
		System.out.println(BaseClass.DeleteChild);
	}

	public void EnterCMFIDToDelete() throws InterruptedException {

		Thread.sleep(2000);
		CMFID.sendKeys(BaseClass.DeleteChild);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", SearchButton);

	}
	
	public void goButton() throws InterruptedException {

		WebElementUtils.waitForVisible(gobutton);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", gobutton);

	}
	


	public void Deleteicon() throws InterruptedException {

		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", DeleteButton);

		Thread.sleep(3000);

	}

	public void commentsToDelete() throws InterruptedException {

		// Alert b = getDriver().switchTo().alert();

		Workflowhistory.click();
		Thread.sleep(2000);
		getDriver().navigate().back();
		Thread.sleep(2000);
		this.Deleteicon();
		commentthereason.sendKeys(excelutil.getData(28, 1, 1));
		SaveThecomment.click();

		Alert a = getDriver().switchTo().alert();
		a.accept();

		Thread.sleep(1000);

		Alert b1 = getDriver().switchTo().alert();
		b1.accept();

	}

	public void deleteWaitingforapproval() throws InterruptedException {
		Thread.sleep(2000);
		WebElementUtils.webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(Deletelink);
		WebElementUtils.scrolltoview(Deletelink);

		Deletelink.click();

	}

	public void deleteStudentSendForClarification() throws InterruptedException {

		Comments.sendKeys(excelutil.getData(28, 1, 1));

		SendForClarificationToPreviousStepButton.click();
	}

	public void deleteStudentNeedMoreInformation() throws InterruptedException {

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,250)");

		WebElementUtils.webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(NeedMoreinfoToDeleteStudentLink);
		WebElementUtils.scrolltoview(NeedMoreinfoToDeleteStudentLink);
		NeedMoreinfoToDeleteStudentLink.click();
	}

	public void deleteStudentSendClarification() throws InterruptedException {

		Comments.sendKeys(excelutil.getData(28, 1, 1));

		SendClarificationButton.click();

	}

	public void deleteStudentReceivedMoreInformation() throws InterruptedException {

		WebElementUtils.webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(ReceivedMoreInfoToDeleteStudentLink);
		WebElementUtils.scrolltoview(ReceivedMoreInfoToDeleteStudentLink);
		ReceivedMoreInfoToDeleteStudentLink.click();

	}

	public void deleteStudentReceivedMoreInformationcomments() throws InterruptedException {

		Comments.sendKeys(excelutil.getData(28, 1, 1));

		ApproveButton.click();

		Alert approve = getDriver().switchTo().alert();
		approve.accept();

	}

	public void EnterCMFIDToDenyDelete() throws InterruptedException {

		Thread.sleep(2000);
		CMFID.sendKeys(BaseClass.DeleteChild);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", SearchButton);

	}

	public void deleteStudentdenied() throws InterruptedException {

		Comments.sendKeys(excelutil.getData(28, 1, 1));

		DenyButton.click();

		Alert Deny = getDriver().switchTo().alert();
		Deny.accept();

	}

}
