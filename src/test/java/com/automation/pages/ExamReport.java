package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class ExamReport {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public ExamReport() {

		PageFactory.initElements(getDriver(), this);

	}

	/////////////////////////////////// Exam Report
	/////////////////////////////////// Elements//////////////////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(xpath = "//div[contains(@class, 'dropdown-menu')]//*[contains(@href, '/Report/ExamList')]")
	WebElement exammenu;

	@FindBy(linkText = "Add Exam")
	WebElement addexam;

	@FindBy(xpath = "//input[@id='ExaminiationName']")
	WebElement examinationname;

	@FindBy(xpath = "//select[@id='ddlExamYear']")
	WebElement examyear;

	@FindBy(xpath = "//select[@id='ddlTerms']")
	WebElement examterm;

	@FindBy(xpath = "//select[@id='ddlTerms']")
	WebElement classname;

	@FindBy(xpath = "//*[@value='Save']")
	WebElement save;

	@FindBy(xpath = "//button[contains(@class,'returntolist')]")
	WebElement Returntolist;

	@FindBy(xpath = "//input[@id='Filter_ExaminationName']")
	WebElement searchexaminationname;

	@FindBy(xpath = "//button[@id='btnSearch']")
	WebElement searchbutton;

	@FindBy(xpath = "(//*[@title='Click here to edit this Exam'])[1]")
	WebElement editbutton;

	@FindBy(xpath = "(//a[@title='Click here to delete this Exam'])[1]")
	WebElement deletebutton;

	@FindBy(xpath = "//div[@id='divClass']")
	WebElement chkdiv;

	@FindBy(xpath = "//div[@id='flash']")
	private WebElement errortext;

	//// 10555-Ensure whether the examination added can be viewed in reports

	public void ExamReportmenu() throws InterruptedException {
		Thread.sleep(2000);
		Reportsmenu.click();
		exammenu.click();
		// Thread.sleep(3000);

	}

	public void addExam() throws InterruptedException {

		JavascriptExecutor zoomin = (JavascriptExecutor) getDriver();
		zoomin.executeScript("document.body.style.zoom = '90%'");
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", addexam);
	
try{
		examinationname.sendKeys(excelutil.getData(12, 1, 0));

		Select selexamyear = new Select(examyear);
		selexamyear.selectByVisibleText(excelutil.getData(12, 1, 1));

		Select selexamterm = new Select(examterm);
		selexamterm.selectByVisibleText(excelutil.getData(12, 1, 2));

		getDriver().findElement(By.xpath("//div[@id='divClass'] //input[@id='chk']")).click();

		String[] chkClass = excelutil.getData(12, 1, 3).split(",");

		for (int i = 0; i < chkClass.length; i++) {
			getDriver()
					.findElement(
							By.xpath("//div[@id='divClass'] //*[@value='" + chkClass[i] + "']/following::input[2]"))
					.click();

		}

		save.click();
		Thread.sleep(2000);

		String exp = "The exam information has been saved successfully.";
		String text = errortext.getText();
		Assert.assertEquals(text, exp);
		
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()", Returntolist);
		
		Returntolist.click();
		
}

catch (Exception e){
	
	System.out.println("Exam name  Already Exists");
}

	}

	public void searchExam() throws InterruptedException {
		Thread.sleep(2000);

		try{
		searchexaminationname.sendKeys(excelutil.getData(12, 1, 4));

		searchbutton.click();
		}
		
		catch (Exception e){
			
			System.out.println("No Such Exam Found.Please search with different search criteria");
		}

	}
	
	public void searchExamafterEdit() throws InterruptedException {
		Thread.sleep(2000);

		try{
		searchexaminationname.sendKeys(excelutil.getData(12, 2, 4));

		searchbutton.click();
		}
		
		catch (Exception e){
			
			System.out.println("No Such Exam Found.Please search with different search criteria");
		}

	}

	public void editexam() throws InterruptedException {
		
		try{
		
		editbutton.click();
		
		}
		
		catch (Exception e){
			
			System.out.println("Edit Button is not available");
		}

	}

	public void editExam() throws InterruptedException {
		
		try{

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", addexam);
		// addexam.click();

		examinationname.sendKeys(excelutil.getData(12, 2, 0));

		Select selexamyear = new Select(examyear);
		selexamyear.selectByVisibleText(excelutil.getData(12, 2, 1));

		Select selexamterm = new Select(examterm);
		selexamterm.selectByVisibleText(excelutil.getData(12, 2, 2));
		// *[@value='Pre Primary 2']

		getDriver().findElement(By.xpath("//div[@id='divClass'] //input[@id='chk']")).click();

		String[] chkClass = excelutil.getData(12, 2, 3).split(",");

		for (int i = 0; i < chkClass.length; i++) {
			getDriver()
					.findElement(
							By.xpath("//div[@id='divClass'] //*[@value='" + chkClass[i] + "']/following::input[2]"))
					.click();

		}

		save.click();

		Thread.sleep(2000);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		Returntolist.click();
		}
		
		catch (Exception e){
			
			System.out.println("Exam name Already Exists");
		}

	}

	public void deleteexam() throws InterruptedException {
		
		try{
		deletebutton.click();
		isAlertPresent();
		}
		
		catch(Exception e){
			
			System.out.println("Delete icon is not available");
		}

	}

	public boolean isAlertPresent() {
		try {
			getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			Alert a = getDriver().switchTo().alert();
			a.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		} finally {
			getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	}

}
