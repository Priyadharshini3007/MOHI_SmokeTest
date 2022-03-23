package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InvigilatorAssignmentReport {

	
	public InvigilatorAssignmentReport() {

		PageFactory.initElements(getDriver(), this);
		}
	
	@FindBy(linkText="Reports")
	WebElement reportsmenu;
	
	@FindBy(linkText="Invigilation")
	WebElement invigilatorentryreport;
	
	@FindBy(id="Filter_CenterName")
	WebElement selectcenter;
	@FindBy(id="Filter_ClassCode")
	WebElement selectclass;
	@FindBy(id="Filter_SectionID")
	WebElement selectsection;
	@FindBy(id="Filter_SubjectID")
	WebElement selectsubject;
	@FindBy(id="Filter_ExamYear")
	WebElement selectyear;
	@FindBy(id="Filter_VTermID")
	WebElement selectterm;
	
	@FindBy(id="btnSearch")
	WebElement search;
	@FindBy(id="btnRefresh")
	WebElement refresh;
	
	public void navigation(){
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("arguments[0].click()", reportsmenu);
		//reportsmenu.click();
        JavascriptExecutor je = (JavascriptExecutor)getDriver();
        je.executeScript("arguments[0].click()", invigilatorentryreport);
		//invigilatorentryreport.click();
	}
		
	public void select_center(String center) throws InterruptedException{
		selectcenter.click();
		Select select_class = new Select(selectcenter);
		select_class.selectByVisibleText(center);
		Thread.sleep(500);
	}
	
	public void select_class(String classname) throws InterruptedException{
		selectclass.click();
		Select select_subject = new Select(selectclass);
		select_subject.selectByVisibleText(classname);
		Thread.sleep(500);
	}
	
	public void select_section(String section) throws InterruptedException{
		selectsection.click();
		Select select_section = new Select(selectsection);
		select_section.selectByValue(section);
		Thread.sleep(500);
	}
	
	public void select_subject(String subject) throws InterruptedException{
		selectsubject.click();
		Select select_subject = new Select(selectsubject);
		select_subject.selectByVisibleText(subject);
		Thread.sleep(500);
	}
	
	public void select_year(String year) throws InterruptedException{
		selectyear.click();
		Select select_year = new Select(selectyear);
		select_year.selectByVisibleText(year);
		Thread.sleep(500);
	}
	
	public void select_term(String term) throws InterruptedException{
		selectterm.click();
		Select select_term = new Select(selectterm);
		select_term.selectByVisibleText(term);
		Thread.sleep(500);
	}
	
	public void submit() throws InterruptedException{
		search.click();
		Thread.sleep(500);
	}
	
	public void reset() throws InterruptedException{
		refresh.click();
		Thread.sleep(500);
	}
	
	
}
