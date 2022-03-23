package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.utils.ExcelHelper;
import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;
import static com.automation.utils.WebElementUtils.selectFn;
import static com.automation.utils.WebElementUtils.waitForPageToLoad;
import static com.automation.utils.WebElementUtils.confirmationMsg;
import static com.automation.utils.WebElementUtils.scrollIntoView;
import static com.automation.utils.WebElementUtils.ApprovalBtn;
import static com.automation.utils.WebElementUtils.elementVisible;
import static com.automation.utils.WebElementUtils.assertEquals;

import java.util.List;

public class PromotionPage {
	
	public PromotionPage(){
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(linkText="In-School Promotion")
	WebElement InSchoolPromotion;
	
	@FindBy(id="ddlCenters")
	private WebElement centrename;

	@FindBy(id="ddlSchools")
	private WebElement schoolname;

	@FindBy(id="ddlClasses")
	private WebElement classname;

	@FindBy(id="ddlSections")
	private WebElement sectionname;

	@FindBy(id="ddlPromoteClasses")
	private WebElement PromoteClasses;

	@FindBy(id="ddlPromoteSections")
	private WebElement PromoteSections;

	@FindBy(id="btnSearchClassRoster")
	private WebElement btnSearchClassRoster;

	@FindBy(id="Comments")
	private WebElement transfercomments;

	@FindBy(id="btnSubmit")
	private WebElement transfersubmitforapproval;

	@FindBy(xpath ="//a[contains(@href,'Filterstring=Promo_Appr')]")
	private WebElement studentpromotionalert;
	
	@FindBy(xpath="//td[contains(text(),'No students found.')]")
	WebElement noRecords;
	
	@FindBy(xpath ="//a[contains(@href,'Filterstring=Trans_Appr')]")
	private WebElement studenttransferalertlink;
	
	@FindBy(id="Filter_FirstName")
	WebElement firstName;
	
	@FindBy(xpath="//a[@title='Approve/Deny student Transfer/Promotional Transfer request']")
	private WebElement transferApprovalBtn;
	
	@FindBy(xpath="//a[@title='Approve/Deny student Promotion/Detainment/Section change request' or @title='View Promotion/Detainment/Section change workflow']")
	private WebElement promotionApprovalBtn;
	
	@FindBy(id="ddlSchoolTypes")
	private WebElement transferschooltype;
	
	@FindBy(id="ddlHeadTeacher")
	private WebElement transfheadteacher;
	
	@FindBy(id="Comments")
	private WebElement entercomments;

	@FindBy(xpath="//button[@value='Approve']")
	private WebElement approveandproceedtonextstep;
	
	@FindBy(xpath="//label[contains(text(),'School / Class / Section')]//following::div[1]")
	WebElement schooldetails;
	
	@FindBy(linkText="Transfer Students to another Center")
	WebElement TransferAndPromotionalFn;
	
	@FindBy(xpath ="//a[contains(@href,'Filterstring=HSCommon_Appr')]")
	private WebElement HSApproveAlert;
	
	@FindBy(xpath ="//a[contains(@href,'Filterstring=Det_Appr')]")
	private WebElement detainmentAlert;
	
	@FindBy(xpath ="//a[contains(@href,'Filterstring=SecChange_Appr')]")
	private WebElement sectionChangealert;
	
	@FindBy(xpath ="//a[contains(@href,'Filterstring=ViewManualClsChng')]")
	WebElement ViewManualClsChng;
	
	@FindBy(xpath = "//*[@title='Expand Student']")
	WebElement ExpandStudent;
	
	public void InSchlPromotionSubMenu(){
		webDriverclick(InSchoolPromotion);
	}
	
	public void choosecentreandschool(){
		String center = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",1,1);
		if(center.equals("Joska"))
		{
			String centerDp = center.toUpperCase();
			System.out.println(centerDp);
			selectFn(centrename,centerDp);
		}
		else{
			selectFn(centrename,center);
		}
		waitForPageToLoad();
		String schlname = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",1,2);
		selectFn(schoolname,schlname);
	}
	
	public void choosecentreandschoolfortransfer() {

		String excelpath = (".\\ExcelFiles\\Promotion.xlsx");

		Select selectcentre = new Select(centrename);

		selectcentre.selectByVisibleText(ExcelHelper.readData(excelpath, "Promotion", 7, 1));

		waitForPageToLoad();

		Select selectschool = new Select(schoolname);

		selectschool.selectByVisibleText(ExcelHelper.readData(excelpath, "Promotion", 7, 2));

	}
	
	
	
	public void selectclassandsection(String promotionType) {
		if(promotionType.trim().toLowerCase().equals("inschoolpromotion")){
			classandsectionSelection(1);
		}
		else if(promotionType.trim().toLowerCase().equals("detainment")){
			classandsectionSelection(2);
		}
		else if(promotionType.trim().toLowerCase().equals("sectionchange")){
			classandsectionSelection(3);
		}
		else if(promotionType.trim().toLowerCase().equals("highschoolpromotion")){
			classandsectionSelection(4);
		}
		else if(promotionType.trim().toLowerCase().equals("transfer")){
			classandsectionSelection(7);
		}
		else{
			System.out.println("Please enter valid promotionType. "+promotionType+" is not a valid one.");
			Assert.assertTrue(false);
		}
	}

	public void classandsectionSelection(int rowNo)  {
		String clsname = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,3);
		selectFn(classname,clsname);
		BaseClass.clsname = clsname;
		waitForPageToLoad();
		String sectionnameFld = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,4);
		selectFn(sectionname,sectionnameFld);
	}

	public void getclassroaster(){
		webDriverclick(btnSearchClassRoster);
		waitForPageToLoad();
		try{
			boolean status = noRecords.isDisplayed();
			Assert.assertFalse("No students found.Select any another Class/Section", status);
		}
		catch(Exception e){
			System.out.println("Records are available");
		}
	}
	
	public void selectStudentPromotionType(String promotionType) {
		if(promotionType.trim().toLowerCase().equals("inschoolpromotion")){
			selectStudent(1);
		}
		else if(promotionType.trim().toLowerCase().equals("detainment")){
			selectStudent(2);
		}
		else if(promotionType.trim().toLowerCase().equals("sectionchange")){
			selectStudent(3);
		}
		else if(promotionType.trim().toLowerCase().equals("highschoolpromotion")){
			selectStudent(4);
		}
		else if(promotionType.trim().toLowerCase().equals("transfer")){
			selectStudent(7);
		}
		else{
			System.out.println("Please enter valid promotionType. "+promotionType+" is not a valid one.");
			Assert.assertTrue(false);
		}
	}

	public void selectStudent(int rowNo) {
		List <WebElement> checkboxes= getDriver().findElements(By.xpath("//input[@type='checkbox' and @isrevertedpromotion='False' or @value='true']"));
		int disabledBox = getDriver().findElements(By.xpath("//input[@type='checkbox' and @disabled='disabled']")).size();
		int totalcount = checkboxes.size();
		if(totalcount==disabledBox){
			System.out.println("Selected section does not contain eligible students for Promotion/Section Change/Detainment");
			Assert.assertTrue(false);
		}
		for(int loopvalue = 0;loopvalue<totalcount;loopvalue++)	{
			WebElement checkbox= getDriver().findElement(By.id("StudentsList_"+loopvalue+"__IsPromoted"));
			if(checkbox.isEnabled()) 
			{
				webDriverclick(checkbox);
				ExcelHelper.clearData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,8);
				String cmfid = getDriver().findElement(By.xpath("//input[@id='StudentsList_"+loopvalue+"__IsPromoted' and @value='true']//parent::td//parent::tr//td[2]//a//following-sibling::span[@title='Child name']")).getText();
				System.out.println(cmfid);
				ExcelHelper.writeData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,8,cmfid);
				break;
			}
		}
		if(rowNo==7){
			String transferCom = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,5);
			transfercomments.sendKeys(transferCom);
		}
		else {
			String transferClass = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,5);
			selectFn(PromoteClasses,transferClass);
			BaseClass.transferClass = transferClass;
			
			String transferSectionChange = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,6);
			selectFn(PromoteSections,transferSectionChange);
			
			String transferCom = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,7);
			transfercomments.sendKeys(transferCom);
		}
	}

	public void submitforapproval(){
		webDriverclick(transfersubmitforapproval);
	}

	public void verificationMsg(){
		String actual = "The students have been submitted for approval.";
		confirmationMsg(actual);
	}
	
	public void studentTransferDashboardAlert(){
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(studenttransferalertlink);
		WebElementUtils.scrolltoview(studenttransferalertlink);
		dashboardAlert(studenttransferalertlink);
	}

	public void promotionDashboardAlert(){
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(studentpromotionalert);
		WebElementUtils.scrolltoview(studentpromotionalert);
		dashboardAlert(studentpromotionalert);
	}
	
	public void dashboardAlert(WebElement alert){
		scrollIntoView(alert);
		waitForPageToLoad();
		webDriverclick(alert);
	}
	
	public void transApprovalBtnFn() throws InterruptedException{
		String childName = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",7,8);
		firstName.sendKeys(childName);
		firstName.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		ApprovalBtn(transferApprovalBtn);
	}
	
	public void ApprovalBtnFn(String promotionType) throws InterruptedException{
		if(promotionType.trim().toLowerCase().equals("inschoolpromotion")){
			ApproveBtn(1);
		}
		else if(promotionType.trim().toLowerCase().equals("detainment")){
			ApproveBtn(2);
		}
		else if(promotionType.trim().toLowerCase().equals("sectionchange")){
			ApproveBtn(3);
		}
		else if(promotionType.trim().toLowerCase().equals("highschoolpromotion")){
			ApproveBtn(4);
		}
	}

	public void ApproveBtn(int rowNo) throws InterruptedException{
		String childName = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,8);
		firstName.sendKeys(childName.split(" ")[0]);
		firstName.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		ApprovalBtn(promotionApprovalBtn);
	}
	
	public void selectCentreForApproval(){
		String transfercenter = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",7,6);
		centrename.sendKeys(transfercenter);
		BaseClass.transfercenter = transfercenter;
		waitForPageToLoad();
		String Transferschooltype = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",7,7);
		transferschooltype.sendKeys(Transferschooltype);
	}

	public void selectheadteacher(){
		
		Select headteacher = new Select(getDriver().findElement(By.id("ddlHeadTeacher")));
		headteacher.selectByVisibleText("Lilian  Etemesi");
//		transfheadteacher.sendKeys("a");
//		transfheadteacher.sendKeys(Keys.ARROW_DOWN);
//		1transfheadteacher.sendKeys(Keys.TAB);
	}

	public void approveandproceed() throws InterruptedException{
	
		String headTeacherComments = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",1,9);
		htComments(headTeacherComments,approveandproceedtonextstep);
	}
	
	public void htComments(String com,WebElement element){
		entercomments.sendKeys(com);
		webDriverclick(element);
	}
	
	public void selectSchoolSectionForApproval(){
		String TransferSchool = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",7,9);
		schoolname.sendKeys(TransferSchool);
		
		BaseClass.TransferSchool = TransferSchool;
		
		waitForPageToLoad();
		
		String TransferSection = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",7,10);
		sectionname.sendKeys(TransferSection);
		
		BaseClass.TransferSection = TransferSection;
	}
	
	public void approveVerification(String promotionType) {
		if(promotionType.trim().toLowerCase().equals("inschoolpromotion")){
			verificationAfterApprove(1);
		}
		else if(promotionType.trim().toLowerCase().equals("detainment")){
			verificationAfterApprove(2);
		}
		else if(promotionType.trim().toLowerCase().equals("sectionchange")){
			verificationAfterApprove(3);
		}
		else if(promotionType.trim().toLowerCase().equals("highschoolpromotion")){
			verificationAfterApprove(4);
		}
		else if(promotionType.trim().toLowerCase().equals("transfer")){
			verificationAfterApprove(7);
		}
		else{
			System.out.println("Please enter valid promotionType. "+promotionType+" is not a valid one.");
			Assert.assertTrue(false);
		}
	}

	public void verificationAfterApprove(int rowNo){
		if(rowNo==7){
			ExcelHelper.clearData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,8);
			String schoolName 	= ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,9);
			String className 	= ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,3);
			String sectionName 	= ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,10);
			verification(schoolName, className, sectionName);
		}
		else{
			ExcelHelper.clearData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,8);
			String schoolName 	= ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,2);
			String className 	= ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,5);
			String sectionName 	= ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,6);
			verification(schoolName, className, sectionName);
		}
	}
	
	public void verification(String schoolName,String className,String sectionName){
		String verify = schoolName+" / "+className+" / "+sectionName+"";
		String school = schooldetails.getText();
		assertEquals(verify,school);
	}

	public void manualClassChangeAlertVerifn(String promotionType) throws InterruptedException {
		if(promotionType.trim().toLowerCase().equals("inschoolpromotion")){
			manualClassChangeAlert(1);
		}
		else if(promotionType.trim().toLowerCase().equals("detainment")){
			manualClassChangeAlert(2);
		}
		else if(promotionType.trim().toLowerCase().equals("sectionchange")){
			manualClassChangeAlert(3);
		}
		else if(promotionType.trim().toLowerCase().equals("highschoolpromotion")){
			manualClassChangeAlert(4);
		}
	}

	public void manualClassChangeAlert(int rowNo) throws InterruptedException{
		elementVisible(ViewManualClsChng);
		webDriverclick(ViewManualClsChng);
		String childName = ExcelHelper.readData(".\\ExcelFiles\\Promotion.xlsx","Promotion",rowNo,8);
		firstName.sendKeys(childName);
		firstName.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		WebElement name = getDriver().findElement(By.xpath("//span[contains(text(),'"+childName+"')]"));
		ApprovalBtn(name);
	}
	
	public void sectionChangeDashboardAlert(){
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(sectionChangealert);
		WebElementUtils.scrolltoview(sectionChangealert);
		dashboardAlert(sectionChangealert);
	}
	
	public void detainmentDashboardAlert(){
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(detainmentAlert);
		WebElementUtils.scrolltoview(detainmentAlert);
		
		dashboardAlert(detainmentAlert);
	}
	
	public void highSchoolPromotionAlert(){
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(HSApproveAlert);
		WebElementUtils.scrolltoview(HSApproveAlert);
		dashboardAlert(HSApproveAlert);
	}
	
	public void TransferAndPromotionalDashbordFn(){
		webDriverclick(TransferAndPromotionalFn);
	}
	
	public void Promotionfeeinfo(){
		
		int t = getDriver().findElements(By.xpath("//*[contains(@class,'Required morecurrent')]")).size();
		if (t>0){
			
			for (int i = 0; i < t; i++) {
				
				WebElement calendarTextbox =  getDriver().findElement(By.xpath("(//*[contains(@class,'Required morecurrent')])[" + (i + 1) + "]"));
				
				WebElementUtils.scrolltoview(calendarTextbox);
				
				calendarTextbox.click();

				
				WebElement calendarClick = getDriver().findElement(By.xpath("//td[@class='today disabled day']/following-sibling::td[1]"));
			
				calendarClick.click();

			}
		}
	}
	
	
	}


