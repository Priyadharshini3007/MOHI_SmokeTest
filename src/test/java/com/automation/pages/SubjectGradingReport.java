package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;
import static com.automation.utils.DriverUtils.getDriver;;

public class SubjectGradingReport {


JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public SubjectGradingReport()	{
		
		PageFactory.initElements(getDriver(), this);

	}

	////////////////////// Subject Grading Reports
	////////////////////// Elements///////////////////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(linkText = "Subject Grading")
	WebElement subjectgradingmenu;

	@FindBy(xpath = "//select[@id='Filter_ClassName']")
	WebElement subjectgradingClass;

	@FindBy(xpath = "//select[@id='Filter_SubjectName']")
	WebElement subjectgradingsubject;

	@FindBy(xpath = "//input[@id='Filter_StartPerc']")
	WebElement subjectgradingstartpercentage;

	@FindBy(xpath = "//input[@id='Filter_EndPerc']")
	WebElement subjectgradingendpercentage;

	@FindBy(xpath = "//input[@id='Filter_Grade']")
	WebElement subjectgradinggrade;

	@FindBy(xpath = "//input[@id='Filter_Points']")
	WebElement subjectgradingpoints;

	@FindBy(xpath = "//button[@id='btnSearch']")
	WebElement searchbutton;

	@FindBy(xpath = "(//*[@title='Click here to edit this Subject Grading Assignment'])[1]")
	WebElement editbutton;

	@FindBy(xpath = "//input[@id='txtStartPerc']")
	WebElement startPercentage;

	@FindBy(xpath = "//input[@id='txtGrade']")
	WebElement Grade;

	@FindBy(xpath = "//input[@id='txtEndPerc']")
	WebElement endPercentage;

	@FindBy(xpath = "//input[@id='txtPoints']")
	WebElement Points;

	@FindBy(xpath = "//*[@value='Save']")
	WebElement save;

	@FindBy(xpath = "//button[contains(@class,'returntolist')]")
	WebElement Returntolist;
	
	@FindBy(xpath = "(//*[@title='Click here to delete this Subject Grading Assignment'])[1]")
	WebElement Delete;		

	public void SubjectGradingReportmenu() throws InterruptedException {

		Reportsmenu.click();
		subjectgradingmenu.click();

	}

	public void searchSubjectGrade() throws InterruptedException {

		Select selgrdcls = new Select(subjectgradingClass);
		selgrdcls.selectByVisibleText(excelutil.getData(15, 1, 0));
		
		Select selgrdsub = new Select(subjectgradingsubject);
		selgrdsub.selectByVisibleText(excelutil.getData(15, 1, 1));
		
		subjectgradingstartpercentage.sendKeys(excelutil.getData(15, 1, 2));
		
		subjectgradingendpercentage.sendKeys(excelutil.getData(15, 1, 3));
		
		subjectgradinggrade.sendKeys(excelutil.getData(15, 1, 4));
		
		subjectgradingpoints.sendKeys(excelutil.getData(15, 1, 5));
		
		searchbutton.click();

	}

public void SubGradingedit() throws InterruptedException {

		editbutton.click();
		startPercentage.clear();
		startPercentage.sendKeys(excelutil.getData(15, 2, 2));
		endPercentage.clear();
		endPercentage.sendKeys(excelutil.getData(15, 2, 3));
		Grade.clear();
		Grade.sendKeys(excelutil.getData(15, 2, 4));
		Points.clear();
		Points.sendKeys(excelutil.getData(15, 2, 5));
		save.click();
		Returntolist.click();

	}

public void SearcEditedSubgrade() throws InterruptedException {

	Select selgrdcls = new Select(subjectgradingClass);
	selgrdcls.selectByVisibleText(excelutil.getData(15, 1, 0));
	
	Select selgrdsub = new Select(subjectgradingsubject);
	selgrdsub.selectByVisibleText(excelutil.getData(15, 1, 1));
	
	subjectgradingstartpercentage.sendKeys(excelutil.getData(15, 2, 2));
	subjectgradingendpercentage.sendKeys(excelutil.getData(15, 2, 3));
	subjectgradinggrade.sendKeys(excelutil.getData(15, 2, 4));
	subjectgradingpoints.sendKeys(excelutil.getData(15, 2, 5));


}



public void deletegrade() throws InterruptedException {
	
	Delete.click();
	isAlertPresent();

}
public boolean isAlertPresent() {
	try {
		 getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		Alert a =  getDriver().switchTo().alert();
		a.accept();
		return true;
	} catch (NoAlertPresentException e) {
		return false;
	} finally {
		 getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
}

	
}
	
	


