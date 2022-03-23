package com.automation.pages;

import java.util.concurrent.TimeUnit;

import static com.automation.utils.DriverUtils.getDriver;



import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import utilities.excelutil;

import com.automation.utils.excelutil;


public class ClassTeacherReport {

JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public ClassTeacherReport()	{
		
		PageFactory.initElements(getDriver(), this);
	}

	////////////////////////////////// Class Teacher Report
	////////////////////////////////// elements////////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(linkText = "Class Teacher")
	WebElement Classteachermenu;
	  
	@FindBy(xpath = "(//a[contains(@href,'/Sponsorship/TeacherHolder/0?')])[2]")
	WebElement Addclassteacher;
	
	/*@FindBy(linkText = "Add Class Teacher")
	WebElement Addclassteacher;*/

	@FindBy(xpath = "//select[@id='slctCenter']")
	WebElement centername;

	@FindBy(xpath = "//select[@id='slctSchool']")
	WebElement schoolname;

	@FindBy(xpath = "//select[@id='slctClass']")
	WebElement classname;

	@FindBy(xpath = "//select[@id='slctsection']")
	WebElement classsecname;

	@FindBy(xpath = "//select[@id='slctclassteacher']")
	WebElement classteachername;

	@FindBy(xpath = "//*[@value='Save']")
	WebElement save;

	@FindBy(xpath = "//button[contains(@class,'returntolist')]")
	WebElement Returntolist;

	@FindBy(xpath = "//select[@id='Filter_CenterName']")
	WebElement searchcenter;

	@FindBy(xpath = "//select[@id='Filter_ClassCode']")
	WebElement searchclass;

	@FindBy(xpath = "//select[@id='Filter_ClassSectionID']")
	WebElement searchsection;

	@FindBy(xpath = "//button[@id='btnSearch']")
	WebElement searchbutton;

	@FindBy(xpath = "//a[@title='Click here to edit this Class Teacher Assignment']")
	WebElement editbutton;

	@FindBy(xpath = "//a[@title='Click here to delete this Class Teacher Assignment']")
	WebElement deletebutton;
	
	@FindBy(xpath = "//input[@id='Filter_TeacherName']")
	WebElement searchclassteacher;

	public void classTeacherReport() throws InterruptedException {

		Reportsmenu.click();
		Classteachermenu.click();
		// Thread.sleep(3000);

	}

	public void addClassTeacher() throws InterruptedException {
		Thread.sleep(3000);
		
		JavascriptExecutor zoomin = (JavascriptExecutor) getDriver();
		zoomin.executeScript("document.body.style.zoom = '90%'");
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",Addclassteacher);
		//Addclassteacher.click();

		Select selcentername = new Select(centername);
		selcentername.selectByVisibleText(excelutil.getData(11, 1, 0));

		Select selschoolname = new Select(schoolname);
		selschoolname.selectByVisibleText(excelutil.getData(11, 1, 1));

		Select selclassname = new Select(classname);
		selclassname.selectByVisibleText(excelutil.getData(11, 1, 2));

		Select selclasssecname = new Select(classsecname);
		selclasssecname.selectByVisibleText(excelutil.getData(11, 1, 3));

		this.isAlertPresent();

		Select selclassteachername = new Select(classteachername);
		selclassteachername.selectByVisibleText(excelutil.getData(11, 1, 4));
		this.isAlertPresent();
		save.click();
		this.isAlertPresent();
		Returntolist.click();

	}

	public void editClassTeacher() throws InterruptedException {

		// Thread.sleep(2000);

		Select selcentername = new Select(centername);
		selcentername.selectByVisibleText(excelutil.getData(11, 2, 0));

		Select selschoolname = new Select(schoolname);
		selschoolname.selectByVisibleText(excelutil.getData(11, 2, 1));

		Select selclassname = new Select(classname);
		selclassname.selectByVisibleText(excelutil.getData(11, 2, 2));

		Select selclasssecname = new Select(classsecname);
		selclasssecname.selectByVisibleText(excelutil.getData(11, 2, 3));

		this.isAlertPresent();

		Select selclassteachername = new Select(classteachername);
		selclassteachername.selectByVisibleText(excelutil.getData(11, 2, 4));
		this.isAlertPresent();
		// Thread.sleep(1000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", save);
		// Thread.sleep(3000);

		this.isAlertPresent();
		Returntolist.click();

	}

	public void searchTeacher() throws InterruptedException {
		// Thread.sleep(2000);
		Select selsearchcenter = new Select(searchcenter);
		selsearchcenter.selectByVisibleText(excelutil.getData(11, 3, 0));

		Select selsearchclass = new Select(searchclass);
		selsearchclass.selectByVisibleText(excelutil.getData(11, 3, 2));

		searchclassteacher.sendKeys(excelutil.getData(11, 3, 4));
		searchbutton.click();

	}

	public void editTeacher() throws InterruptedException {
		editbutton.click();

	}

	public void deleteTeacher() throws InterruptedException {
		deletebutton.click();
		this.isAlertPresent();

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
