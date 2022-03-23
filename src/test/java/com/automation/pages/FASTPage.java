package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;
import static com.automation.utils.WebElementUtils.alertAccept;
import static com.automation.utils.WebElementUtils.elementVisible;
import static com.automation.utils.WebElementUtils.windowScrollDown;
import static com.automation.utils.WebElementUtils.windowScrollUp;
import static com.automation.utils.WebElementUtils.DwnldfileVerificatnFn;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.ExcelHelper;

public class FASTPage {

	public FASTPage(){
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(linkText="Assessment Generation")
	private WebElement assesmentgenerationlink;

	@FindBy(xpath="//input[@id='TxtStudent']")
	private WebElement searchstudentfield;

	@FindBy(id="VisitDate")
	private WebElement visitdate;

	@FindBy(xpath="//div[@class='datepicker-days'] //th[@class='prev']")
	WebElement prevclick;

	@FindBy(xpath="//div[@class='datepicker-days'] //th[@class='next']")
	WebElement nextclick;

	@FindBy(xpath="//div[@class='datepicker-days'] //th[@class='datepicker-switch']")
	WebElement selectmonthyear;

	@FindBy(id="VisitReason")
	private WebElement visitreason;

	@FindBy(name="IsFamilyStatusChange")
	private WebElement familystatuschange;

	@FindBy(xpath="//input[@value='true']")
	private WebElement familystatusyes;

	@FindBy(xpath="//input[@value='false']")
	private WebElement familystatusno;

	@FindBy(id="Findings")
	private WebElement findingsfield;

	@FindBy(id="Recommendations")
	private WebElement recommandationfield;

	@FindBy(id="ddlReferrals")
	private WebElement referralsdropdown;

	@FindBy(name="ActualAssessmentDate")
	private WebElement actualassessmentdate;

	@FindBy(xpath="//input[@name='rd_A_FT_Cooperation']")
	private WebElement caregivercooperationradio;

	@FindBy(name="rd_A_FT_Conflict")
	private WebElement familyconflictsradio;

	@FindBy(xpath="//button[@title='Save']")
	private WebElement savebutton;

	@FindBy(xpath="//button[@title='Submit Assessment Results']")
	private WebElement submitbutton;

	@FindBy(id="txtActionPlan")
	private WebElement actionplanfield;

	@FindBy(id="txtActionDate")
	private WebElement actionplandatefield;

	@FindBy(xpath="//input[@name='Filter.Name' or @id='Filter_ChildName']")
	private WebElement searchstudent;

	@FindBy(xpath="//i[@class='fa fa-edit purple bigger-110']")
	private WebElement assessmenticon;

	@FindBy(xpath="//a[@title='Generate Assessment form']")
	private WebElement assessmentgenerateschduleicon;

	@FindBy(id="printpagebutton")
	WebElement printpagebutton;

	@FindBy(xpath="//h3[text()='Family Visit Information']")
	WebElement FamilyVisitInformationText;

	@FindBy(id="FromDate")
	private WebElement fromdate;

	@FindBy(id="ToDate")
	private WebElement todate;

	@FindBy(name="MetricCategory")
	private WebElement metriccatfield;

	@FindBy(name="MetricCriteria")
	private WebElement metriccriteriafield;

	@FindBy(name="Score")
	private WebElement scorevalue;

	@FindBy(xpath="//*[@value='GO']")
	private WebElement submitgobtn;

	@FindBy(id="MonthlyReportFASW")
	private WebElement sworker;

	@FindBy(id="Filter_AssessmentCode")
	private WebElement searchassessmentcode;

	@FindBy(id="MonthlyReportFAC")
	private WebElement centrename;

	@FindBy(id="MonthlyReportFAFD")
	private WebElement Fromdate;

	@FindBy(id="MonthlyReportFATD")
	private WebElement Todate;

	@FindBy(xpath="//iframe[contains(text(),'iframes not supported.')]")
	private WebElement iframe;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement viewreportbtn;

	@FindBy(xpath="//input[@id='AssessmentFromDate' or @title='From Date Required']")
	private WebElement assessmentfromdate;

	@FindBy(xpath="//input[@id='AssessmentToDate' or @title='To Date Required']")
	private WebElement assessmenttodate;

	@FindBy(name="submitButton")
	private WebElement assessmentchartsubmit;

	@FindBy(xpath="//button[@value='SendEmail']")
	private WebElement sendemailbutton;

	@FindBy(id="btnExportData")
	private WebElement exportdatebutton;

	@FindBy(xpath="//i[@class='fa fa-plus - bigger-100']")
	private WebElement addactionbutton;

	@FindBy(name="ActionDate")
	private WebElement actiondate;

	@FindBy(xpath="//input[@name='IsFamilyStatusChange' and @value='true']")
	WebElement familyStatusChange;

	@FindBy(xpath="//input[@name='IsFamilyStatusChange' and @value='false']")
	WebElement familyStatusNoChange;

	@FindBy(id="FamilyStatusChangeComment")
	WebElement FamilyStatusChangeComment;

	@FindBy(xpath="//a[@title='Add/Edit Assessment Comment']")
	WebElement AddorEditAssessmentComment;

	@FindBy(xpath="//button[@id='btnSendMail']")
	WebElement actionPlanSave;

	@FindBy(id="txtAssessmentcmt")
	WebElement assessmentComment;

	@FindBy(id="btnSearch")
	WebElement search;

	@FindBy(xpath="//div[contains(text(),'FA_FAM')]")
	WebElement familyCode;

	@FindBy(id="Filter_AssessmentCode")
	WebElement assessmentcodeField;

	@FindBy(xpath="//td[contains(text(),'Completed')]")
	WebElement completedStatus;

	@FindBy(id="PageSize")
	private WebElement PageSize;

	@FindBy(id="txtToAddr")
	private WebElement ToAddress;

	@FindBy(id="txtCcAddr")
	private WebElement CcAddress;

	@FindBy(id="txtSubject")
	private WebElement Subject;

	@FindBy(id="editorMsg")
	private WebElement message;

	@FindBy(xpath="//a[@title='Export drop down menu']")
	private WebElement exportBtn;

	@FindBy(xpath="//a[@title='Excel']")
	private WebElement exportExcelBtn;

	@FindBy(xpath="//a[@title='View Assessment form Details']")
	private WebElement ViewAssessmentform;

	@FindBy(xpath="//h3[text()='Family Visit Information']")
	private WebElement FamilyVisitInformation;

	@FindBy(className="lnkToggle")
	WebElement toggleBtn;

	public void toggleFn(){
		webDriverclick(toggleBtn);
	}

	public void metricsVerfn(){
		String MetriCriteria = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","AssessmentAnalysisRep",1,3);
		WebElement criteria = getDriver().findElement(By.xpath("//td[contains(text(),'"+MetriCriteria+"')]"));
		elementVisible(criteria);
	}

	public void chooseassessmentgeneration(){
		assesmentgenerationlink.click();
	}

	public void AddorEditAssessmentCommentFn(){
		try{
			webDriverclick(AddorEditAssessmentComment);
			fieldVerification(assessmentComment,1,8);
			webDriverclick(actionPlanSave);
			alertAccept();
		}
		catch(Exception e){
			System.out.println("Add or Edit Assessment Comment field is not displayed");
			Assert.assertTrue(false);
		}
	}

	public void statusFn(){
		elementVisible(completedStatus);
	}

	public void searchstudent() throws InterruptedException{
		Thread.sleep(2000);
		String student = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","Fast",1,0);
		searchstudentfield.sendKeys(student);
		Thread.sleep(2000);
		searchstudentfield.sendKeys(Keys.ARROW_DOWN);		
		searchstudentfield.sendKeys(Keys.ENTER);
	}

	public void selectvisitdate() throws InterruptedException{
		try{
			visitdate.click();
			prevclick.click();
			getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr/td[@class='day' and text()='1']")).click();
		}
		catch(Exception e){
			System.out.println("Form is already completed");
			Assert.assertTrue(false);
		}
	}

	public void fieldVerification(WebElement element,int r,int c){
		if(!element.equals(null)){
			String field = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","Fast",r,c);
			element.sendKeys(field);
		}
		else{
			System.out.println("Field already has some value in it,"+element);
		}
	}

	public void enterfamilyvisitinformation(){
		fieldVerification(visitreason,1,1);
	}

	public void selectfamilychangestatus() throws InterruptedException {
		String status = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","Fast",1,2);
		if(status.trim().toLowerCase().equals("yes")){
			webDriverclick(familyStatusChange);
			FamilyStatusChangeComment.sendKeys("Test");
		}
		else if(status.trim().toLowerCase().equals("no")){
			webDriverclick(familyStatusNoChange);
		}
	}

	public void fillfindingsandrecommendations(){
		fieldVerification(findingsfield,1,3);
		fieldVerification(recommandationfield,1,4);
		fieldVerification(referralsdropdown,1,5);
		referralsdropdown.sendKeys(Keys.TAB);
	}

	public void actualassessmentdate(){
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("javascript:window.scrollBy(0,150)");
		actualassessmentdate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
	}

	public void selecttheradiobuttons() throws InterruptedException{
		List<WebElement> radiobutton=getDriver().findElements(By.xpath("//table/tbody/tr/td[3]/input"));
		int count=radiobutton.size();
		System.out.println("no of radiobuttons --" +count);
		for (int i = 0; i < radiobutton.size(); i++) {
			radiobutton.get(i).click();
			Thread.sleep(5000);
			Actions action=new Actions(getDriver());
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(3000);			
		}
	}

	public void fillfamilytogethervalues(){
		actualassessmentdate.sendKeys(Keys.TAB);
		List<WebElement> tables = getDriver().findElements(By.xpath("//table[@border='1']"));
		int tableCount = tables.size();
		int count = 0;
		for(int i=1;i<=tableCount;i++){
			List<WebElement> radios = getDriver().findElements(By.xpath("//table["+i+"]//input[@type='radio' and @value="+count+"]"));
			WebElement comments = getDriver().findElement(By.xpath("//table["+i+"]//textarea[starts-with(@name,'txtComm')]"));
			comments.sendKeys("test"+i);
			for(WebElement radioBtn:radios){
				webDriverclick(radioBtn);
			}
			count++;
			if(count==4){
				count=0;
			}
		}
	}

	public void submittheassessment(){
		ExcelHelper.clearData(".\\ExcelFiles\\FastAssessment.xlsx","Fast",1,6);
		String assessmentCode = familyCode.getText();
		ExcelHelper.writeData(".\\ExcelFiles\\FastAssessment.xlsx","Fast",1,6,assessmentCode);
		webDriverclick(submitbutton);
	} 

	public void savetheassessment(){
		webDriverclick(savebutton);
	} 

	public void addactionplan() throws InterruptedException{
		try{
			fieldVerification(actionplanfield,1,7);
			Thread.sleep(2000);
			actionplandatefield.click();
			getDriver().findElement(By.xpath("//td[@class='today day']")).click();
			Thread.sleep(4000);
			webDriverclick(actionPlanSave);
			Thread.sleep(2000);
			alertAccept();
		}
		catch(Exception e){
			System.out.println("Add action plan pop up is not displayed");
			Assert.assertTrue(false);
		}
	}



	public void clickonassessmenticon(){
		webDriverclick(assessmenticon);
	}

	public void ViewAssessmentformIcon() throws InterruptedException{
		Thread.sleep(3000);
		webDriverclick(ViewAssessmentform);
	}

	public void printAssessmentformIcon() throws InterruptedException{
		String MainWindow	=	getDriver().getWindowHandle();
		Set<String>popUp =	getDriver().getWindowHandles();
		for (String AttendanceSheetPopUp : popUp) {
			if(!AttendanceSheetPopUp.equals(MainWindow)){
				getDriver().switchTo().window(AttendanceSheetPopUp);
				elementVisible(FamilyVisitInformationText);
				Thread.sleep(2000);
				getDriver().close();
			}
		}
		getDriver().switchTo().window(MainWindow);
	}

	public void clickongenerateassessmenticon(){
		windowScrollDown();
		webDriverclick(PageSize);
		PageSize.clear();
		PageSize.sendKeys("999");
		PageSize.sendKeys(Keys.ENTER);
		windowScrollUp();
		webDriverclick(assessmentgenerateschduleicon);
	}

	public void selectassessmentfromdate(){
		String monthyear = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","AssessmentChart",1,0);
		assessmentfromdate.click();
		while (true){	 
			String text=selectmonthyear.getText();
			if (text.equals(monthyear))	{
				break;
			}
			else {
				prevclick.click();
			}
		}
		getDriver().findElement(By.xpath("//td[@class='day' and text()='1']")).click();
	}

	public void selectassessmenttodate(){
		String monthyear = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","AssessmentChart",1,1);
		assessmenttodate.click();
		while (true){	 
			String text=selectmonthyear.getText();
			if (text.equals(monthyear))	{
				break;
			}
			else {
				prevclick.click();
			}
		}
		getDriver().findElement(By.xpath("//td[@class='day' and text()='31']")).click();
	}

	public void searchthestudentname() throws InterruptedException{
		String assessmentCode = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","Fast",1,6);
		searchassessmentcode.sendKeys(assessmentCode);
		Thread.sleep(1000);
		webDriverclick(search);
	}

	public void submitsendemail() throws InterruptedException{
		webDriverclick(sendemailbutton);
	}

	public void submitsendBtn() throws InterruptedException{
		webDriverclick(actionPlanSave);
		Thread.sleep(2000);
		alertAccept();
	}

	public void exportexcel() throws InterruptedException{
		webDriverclick(exportdatebutton);
	}

	public void exportexcelFastActityRep() throws InterruptedException{
		Thread.sleep(5000);
		webDriverclick(exportBtn);
		webDriverclick(exportExcelBtn);
	}

	public void exportexcelFastActivityVerfication() throws InterruptedException{
		Thread.sleep(5000);
		String filename = "MonthlyFastActivityReport";
		DwnldfileVerificatnFn(filename);
		ExcelHelper.deleteFile(filename);
	}

	public void exportexcelVerfication() throws InterruptedException{
		String filename = "ChartExport";
		DwnldfileVerificatnFn(filename);
		ExcelHelper.deleteFile(filename);
	}

	public void emailFields(){
		String toAdd = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","AssessmentChart",1,4);
		ToAddress.sendKeys(toAdd);
		String ccAdd = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","AssessmentChart",1,5);
		CcAddress.sendKeys(ccAdd);
		String subj = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","AssessmentChart",1,6);
		Subject.sendKeys(subj);
		String msg = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","AssessmentChart",1,7);
		message.sendKeys(msg);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("javascript:window.scrollBy(0,150)");
	}

	public void selectfromdate(){
		fromdate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
	}

	public void selecttodate(){
		todate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
	}

	public void selectcategoryandcriteria(){
		String category = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","AssessmentAnalysisRep",1,2);
		metriccatfield.sendKeys(category);
		String criteria = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","AssessmentAnalysisRep",1,3);
		metriccriteriafield.sendKeys(criteria);
	}

	public void selectthescore(){
		String score = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","AssessmentAnalysisRep",1,4);
		scorevalue.sendKeys(score);
	}

	public void submitgobutton(){
		webDriverclick(submitgobtn);
	}

	public void selectcentreandsw(String centre,String Socialworker) throws InterruptedException{
		Thread.sleep(2000);
		centrename.sendKeys(centre);
		sworker.sendKeys(Socialworker);
	}

	public void submitreport() throws InterruptedException{
		Thread.sleep(2000);
		webDriverclick(viewreportbtn);
	}

	public void switchtoframe(){
		getDriver().switchTo().frame(iframe);
	}

	public void selectfromandtodate(){
		String fromdate = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","FastActivityRep",1,0);
		Fromdate.sendKeys(fromdate);
		String todate = ExcelHelper.readData(".\\ExcelFiles\\FastAssessment.xlsx","FastActivityRep",1,1);
		Todate.sendKeys(todate);
	}

	public void assessmentchartsubmit()	{
		assessmentchartsubmit.click();
	}

}
