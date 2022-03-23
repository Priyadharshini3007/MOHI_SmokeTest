package com.automation.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;
import static com.automation.utils.WebElementUtils.scrolltoview;;

public class CenterAndDeptBasedReimbursementCreationAndApproval {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public CenterAndDeptBasedReimbursementCreationAndApproval()	{
		PageFactory.initElements(getDriver(), this);
	}
	public String KshValue;
	////////////////////////// CenterAndDeptBasedReimbursementCreationAndApprovalElements//////////////////////////////

	@FindBy(linkText = "Submit Reimbursement")
	WebElement submitreimbursementlink;

	@FindBy(xpath = "//*[@id='ddlSchool']")
	WebElement schoolname;

	@FindBy(xpath = "//*[@id='txtDate']")
	WebElement Date;

	@FindBy(xpath = "//*[@id='txtdescription']")
	WebElement Description;

	@FindBy(xpath = "//*[@id='txtreason']")
	WebElement reason;

	@FindBy(xpath = "//*[@id='txtAmount']")
	WebElement Amount;

	@FindBy(xpath = "//*[@id='AddItem']")
	WebElement Additem;

	@FindBy(xpath = "//*[@id='DeleteItem']")
	WebElement DeleteItem;

	@FindBy(xpath = "//*[@id='btnInfoSubmit']")
	WebElement btnInfoSubmit;

	/////////////////////////////////Approval////////////////////////////////////////

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Reim_Appr')]")
	WebElement Approvallink;

	@FindBy(xpath = "//*[@id='Comments']")
	WebElement comments;

	@FindBy(xpath = "//*[@title='Approve Reimbursement']")
	WebElement ApproveReimbursement;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Dept_Reim_Appr')]")
	WebElement DeptApproveReimbursement;

	@FindBy(xpath="//i[@title='Click here to enter the bank deposit details']")
	WebElement bankDepositIcon;

	@FindBy(id="BankDepositSlipNumber")
	WebElement BankDepositSlipNumber;

	@FindBy(id="DepositDate")
	WebElement DepositDate;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement Save;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Reim_Need_Info')]")
	WebElement NeedMoreInformationLink;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Dept_Reim_Need_Info')]")
	WebElement DeptNeedMoreInformationLink;

	@FindBy(xpath = "//*[@title='Send Clarification']")
	WebElement SendClarificationButton;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Reim_Send_Info')]")
	WebElement ReceivedMoreInformationLink;

	@FindBy(xpath = "//a[contains(@href,'Filterstring=Dept_Reim_Send_Info')]")
	WebElement DeptReceivedMoreInformationLink;

	@FindBy(xpath="//button[@value='Approve']")
	WebElement ApproveButton;
	
	@FindBy(xpath = "//*[@title='Expand Requisition']")
	WebElement ExpandRequisition;

	public void reimbursementRedirection() throws InterruptedException {
		submitreimbursementlink.click();
	}

	public void reimbursementFieldEnter(String requisitiontype) throws InterruptedException {

		if(requisitiontype.toLowerCase().equals("centre"))
		{
			Select selschoolname = new Select(schoolname);
			selschoolname.selectByVisibleText(excelutil.getData(26, 1, 0));
		}
		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		Date.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		Description.sendKeys(excelutil.getData(26, 1, 2));
		reason.sendKeys(excelutil.getData(26, 1, 3));
		Amount.sendKeys(excelutil.getData(26, 1, 4));
		Additem.click();
		JavascriptExecutor scrolldowns = (JavascriptExecutor) getDriver();
		scrolldowns.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		Date.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		Description.sendKeys(excelutil.getData(26, 1, 2));
		reason.sendKeys(excelutil.getData(26, 1, 3));
		Amount.sendKeys(excelutil.getData(26, 1, 4));
		Additem.click();
	}

	public void reimbursementDelete() throws InterruptedException {

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,250)");

		DeleteItem.click();

		Alert a = getDriver().switchTo().alert();
		a.accept();
	}

	public void submitForm() throws InterruptedException {
		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,250)");
		btnInfoSubmit.click();
		Alert a = getDriver().switchTo().alert();
		a.accept();
	}

	public void approveKSH(String user , String requisitiontype) throws InterruptedException {
		if(user.trim().toLowerCase().equals("headteacher"))	{
			JavascriptExecutor scroll = (JavascriptExecutor) getDriver();
			scroll.executeScript("window.scrollBy(0,250)");
		}
		if(requisitiontype.toLowerCase().equals("centre"))	{
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(Approvallink);
			WebElementUtils.scrolltoview(Approvallink);
			webDriverclick(Approvallink);	
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Reim_Appr')]"));
			webDriverclick(e);

		}
		else {
			
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(DeptApproveReimbursement);
			WebElementUtils.scrolltoview(DeptApproveReimbursement);
			webDriverclick(DeptApproveReimbursement);	
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Dept_Reim_Appr')]"));
			webDriverclick(e);
		}
		
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()", comments);

		comments.sendKeys(excelutil.getData(26, 1, 5));

		Thread.sleep(2000);

		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].scrollIntoView()", ApproveReimbursement);

		JavascriptExecutor scrolldown3 = (JavascriptExecutor) getDriver();
		scrolldown3.executeScript("arguments[0].click()", ApproveReimbursement);

	}

	public void sendMoreInformationToCEO(String SendForClarificationType) throws InterruptedException {

		if(SendForClarificationType.toLowerCase().equals("centre"))
		{
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(NeedMoreInformationLink);
			WebElementUtils.scrolltoview(NeedMoreInformationLink);
			webDriverclick(NeedMoreInformationLink);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Reim')]"));
			webDriverclick(e);
		}

		else
		{webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(DeptNeedMoreInformationLink);
		WebElementUtils.scrolltoview(DeptNeedMoreInformationLink);
			webDriverclick(DeptNeedMoreInformationLink);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Dept_Reim')]"));
			webDriverclick(e);
		}
		

		scrolltoview(comments);

		comments.sendKeys(excelutil.getData(26, 1, 5));

		Thread.sleep(2000);

		webDriverclick(SendClarificationButton);
	}

	public void receivedMoreInformation(String SendForClarificationType ) throws InterruptedException {

		if(SendForClarificationType.toLowerCase().equals("centre"))
		{ 
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(ReceivedMoreInformationLink);
			WebElementUtils.scrolltoview(ReceivedMoreInformationLink);
			webDriverclick(ReceivedMoreInformationLink);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Reim')]"));
			webDriverclick(e);
		}

		else
		{ webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(DeptReceivedMoreInformationLink);
		WebElementUtils.scrolltoview(DeptReceivedMoreInformationLink);
			webDriverclick(DeptReceivedMoreInformationLink);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Dept_Reim')]"));
			webDriverclick(e);
		}

		scrolltoview(comments);

		comments.sendKeys(excelutil.getData(26, 1, 5));

		Thread.sleep(2000);
		webDriverclick(ApproveButton);
	}

	@FindBy(xpath = "//a[contains(@href,'ReimbursementList/0?Filterstring=Reim_Appr')]")
	WebElement ApproveReimbursementLink;

	@FindBy(xpath = "//*[@id='Comments']")
	WebElement Comments;

	@FindBy(xpath = "//*[@title='Send for Clarification']")
	WebElement reimbursementsendforclarification;

	@FindBy(xpath = "//a[contains(@href,'ReimbursementList/0?Filterstring=Reim_Need_Info')]")
	WebElement reimbursementNeedMoreiformationLink;

	@FindBy(xpath = "//*[@title='Send Clarification']")
	WebElement SendClarificationToNextStepButton;

	@FindBy(xpath = "//a[contains(@href,'Requisition/ReimbursementList/0?Filterstring=Reim_Send_Info')]")
	WebElement receivedmoreinformationlink;

	@FindBy(xpath = "//*[@title='Approve Reimbursement']")
	WebElement Approve;

	@FindBy(xpath = "//a[contains(@href,'Requisition/ReimbursementList/0?Filterstring=Dept_Reim_Appr')]")
	WebElement DeptApproveReimbursementLink;

	@FindBy(xpath = "//a[contains(@href,'Requisition/ReimbursementList/0?Filterstring=Dept_Reim_Need_Info')]")
	WebElement Deptneedmoreinformation;

	@FindBy(xpath = "//a[contains(@href,'Requisition/ReimbursementList/0?Filterstring=Dept_Reim_Send_Info')]")
	WebElement Deptreceivedmoreinformation;

	@FindBy(xpath = "//*[contains(text(),'RMOHI')][1]")
	WebElement requisitionCodeText;

	public void sendForClarificationreimbursementKSH(String str) throws InterruptedException {

		if(str.toLowerCase().equals("centre")){
			
			 webDriverclick(ExpandRequisition);

				WebElementUtils.waitForVisible(ApproveReimbursementLink);
				WebElementUtils.scrolltoview(ApproveReimbursementLink);
			webDriverclick(ApproveReimbursementLink);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Reim')]"));
			webDriverclick(e);
		}

		else {
			
			 webDriverclick(ExpandRequisition);

				WebElementUtils.waitForVisible(DeptApproveReimbursementLink);
				WebElementUtils.scrolltoview(DeptApproveReimbursementLink);
			webDriverclick(DeptApproveReimbursementLink);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Dept_Reim')]"));
			webDriverclick(e);
		}

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		Comments.sendKeys(excelutil.getData(26, 1, 5));
		reimbursementsendforclarification.click();
	}

	public void sendMoreClarificationreimbursementKSH(String str) throws InterruptedException {

		if(str.toLowerCase().equals("centre"))
			
		{   
			 webDriverclick(ExpandRequisition);

				WebElementUtils.waitForVisible(reimbursementNeedMoreiformationLink);
				WebElementUtils.scrolltoview(reimbursementNeedMoreiformationLink);
			webDriverclick(reimbursementNeedMoreiformationLink);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Reim')]"));
			webDriverclick(e);
		}

		else {
			
			 webDriverclick(ExpandRequisition);

				WebElementUtils.waitForVisible(Deptneedmoreinformation);
				WebElementUtils.scrolltoview(Deptneedmoreinformation);
			webDriverclick(Deptneedmoreinformation);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Dept_Reim')]"));
			webDriverclick(e);
		}

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		Comments.sendKeys(excelutil.getData(26, 1, 5));

		webDriverclick(SendClarificationToNextStepButton);

	}

	public void receivedMoreClarificationreimbursementKSH(String str) throws InterruptedException {

		if(str.toLowerCase().equals("centre")){
			
			 webDriverclick(ExpandRequisition);

				WebElementUtils.waitForVisible(receivedmoreinformationlink);
				WebElementUtils.scrolltoview(receivedmoreinformationlink);
			webDriverclick(receivedmoreinformationlink);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Reim')]"));
			webDriverclick(e);
		}

		else {
			
			 webDriverclick(ExpandRequisition);

				WebElementUtils.waitForVisible(Deptreceivedmoreinformation);
				WebElementUtils.scrolltoview(Deptreceivedmoreinformation);
			webDriverclick(Deptreceivedmoreinformation);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Dept_Reim')]"));
			webDriverclick(e);
		}

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		Comments.sendKeys(excelutil.getData(26, 1, 5));

		webDriverclick(Approve);
	}
	///////////////////////////////CenterAndDeptBasedReimbursementDeniedElement////////////////////////////////////////////

	@FindBy(xpath = "//*[@title='Deny Reimbursement']")
	WebElement DenyReimbursementbutton;

	public void deniedreimbursementKSH(String str) throws InterruptedException {

		if(str.toLowerCase().equals("centre"))
		{     webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(ApproveReimbursementLink);
		WebElementUtils.scrolltoview(ApproveReimbursementLink);
			webDriverclick(ApproveReimbursementLink);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Reim')]"));
			webDriverclick(e);
		}

		else{
			
			webDriverclick(ExpandRequisition);

			WebElementUtils.waitForVisible(DeptApproveReimbursementLink);
			WebElementUtils.scrolltoview(DeptApproveReimbursementLink);
			webDriverclick(DeptApproveReimbursementLink);
			String ksh = excelutil.getData(26, 1, 4);
			WebElement e =getDriver().findElement(By.xpath("//td[contains(text(),'"+ksh+"')][1]/following-sibling::td[2]/a[contains(@href,'FilterString=Dept_Reim')]"));
			webDriverclick(e);
		}

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		Comments.sendKeys(excelutil.getData(26, 1, 5));

	}
	
	public void CEOdeniedreimbursement(String str) throws InterruptedException {
		webDriverclick(DenyReimbursementbutton);
		Alert a = getDriver().switchTo().alert();
		a.accept();
	}

}
