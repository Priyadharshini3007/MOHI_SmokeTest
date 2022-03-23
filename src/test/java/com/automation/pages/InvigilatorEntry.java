package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;
import static com.automation.utils.WebElementUtils.selectFn;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InvigilatorEntry {

	
	public InvigilatorEntry() {

		PageFactory.initElements(getDriver(), this);
		}
	
	@FindBy(linkText="Exam")
	WebElement exammenu;

	@FindBy(linkText="Invigilation Entry")
	WebElement invigilatorentry;
	
	@FindBy(id="ddlCenters")
	WebElement selectcenter;
	@FindBy(id="ddlSchools")
	WebElement selectschool;
	@FindBy(id="ddlClasses")
	WebElement selectclass;
	@FindBy(id="ddlYears")
	WebElement selectyear;
	@FindBy(id="ddlSections")
	WebElement selectsection;
	@FindBy(id="ddlTerms")
	WebElement selectterm;
	@FindBy(id="ddlExams")
	WebElement selectexam;
	@FindBy(id="TxtInvigilatorName")
	WebElement selectteacher;
					  
	@FindBy(id="AddExamSubject")
	WebElement addsubj;
	
	@FindBy(id="InvigilatorSubjectList_0__SubjectID")
	WebElement subject1;
	@FindBy(id="InvigilatorSubjectList_1__SubjectID")
	WebElement subject2;
	@FindBy(id="InvigilatorSubjectList_2__SubjectID")
	WebElement subject3;
	@FindBy(id="InvigilatorSubjectList_3__SubjectID")
	WebElement subject4;
	@FindBy(id="InvigilatorSubjectList_4__SubjectID")
	WebElement subject5;
	@FindBy(id="InvigilatorSubjectList_5__SubjectID")
	WebElement subject6;

	@FindBy(id="InvigilatorSubjectList_0__ExaminationDate")
	WebElement subj1examdate;	
	@FindBy(id="InvigilatorSubjectList_1__ExaminationDate")
	WebElement subj2examdate;
	@FindBy(id="InvigilatorSubjectList_2__ExaminationDate")
	WebElement subj3examdate;
	@FindBy(id="InvigilatorSubjectList_3__ExaminationDate")
	WebElement subj4examdate;
	@FindBy(id="InvigilatorSubjectList_4__ExaminationDate")
	WebElement subj5examdate;
	@FindBy(id="InvigilatorSubjectList_5__ExaminationDate")
	WebElement subj6examdate;
	
	@FindBy(id="InvigilatorSubjectSave_0")
	WebElement saveexam1date;
	@FindBy(id="InvigilatorSubjectSave_1")
	WebElement saveexam2date;
	@FindBy(id="InvigilatorSubjectSave_2")
	WebElement saveexam3date;
	@FindBy(id="InvigilatorSubjectSave_3")
	WebElement saveexam4date;
	@FindBy(id="InvigilatorSubjectSave_4")
	WebElement saveexam5date;
	@FindBy(id="InvigilatorSubjectSave_5")
	WebElement saveexam6date;
	
	@FindBy(id="InvigilatorSubjectDelete_0")
	WebElement delexam1date;
	@FindBy(id="InvigilatorSubjectDelete_1")
	WebElement delexam2date;
	@FindBy(id="InvigilatorSubjectDelete_2")
	WebElement delexam3date;
	@FindBy(id="InvigilatorSubjectDelete_3")
	WebElement delexam4date;
	@FindBy(id="InvigilatorSubjectDelete_4")
	WebElement delexam5date;
	@FindBy(id="InvigilatorSubjectDelete_5")
	WebElement delexam6date;
	
	@FindBy(xpath="//button[@value='Save']")
	WebElement savedetails;
	
	@FindBy(xpath="//i[@class='fa fa-list']")
	WebElement rtntorpt;
	
	@FindBy(id="flash")
	WebElement message; 
	
	
	public void navigation(){
		exammenu.click();
		invigilatorentry.click();
	}
		
	public void select_center(String center) throws InterruptedException{
		selectcenter.click();
//		Select select_center = new Select(selectcenter);
//		select_center.selectByVisibleText(center);
		selectFn(selectcenter,center);
		Thread.sleep(500);
	}
	
	public void select_school(String school) throws InterruptedException{
		selectschool.click();
//		Select select_school = new Select(selectschool);
//		select_school.selectByVisibleText(school);
		selectFn(selectschool,school);
		Thread.sleep(500);
	}
	
	public void select_class(String classname) throws InterruptedException{
		selectclass.click();
//		Select select_class = new Select(selectclass);
//		select_class.selectByVisibleText(classname);
		selectFn(selectclass,classname);
		Thread.sleep(500);
	}
	
	public void select_year(String year) throws InterruptedException{
		selectyear.click();
//		Select select_year = new Select(selectyear);
//		select_year.selectByVisibleText(year);
		selectFn(selectyear,year);
		Thread.sleep(500);
	}
	
	public void select_section(String section) throws InterruptedException{
		selectsection.click();
//		Select select_section = new Select(selectsection);
//		select_section.selectByVisibleText(section);
		selectFn(selectsection,section);
		Thread.sleep(500);
	}
	
	public void select_term(String term) throws InterruptedException{
		selectterm.click();
//		Select select_term = new Select(selectterm);
//		select_term.selectByVisibleText(term);
		selectFn(selectterm,term);
		Thread.sleep(500);
	}
	
	public void select_exam(String exam) throws InterruptedException{
		selectexam.click();
//		Select select_exam = new Select(selectexam);
//		select_exam.selectByVisibleText(exam);
		selectFn(selectexam,exam);
		Thread.sleep(500);
	}
	
	public void select_teacher(String teacher) throws InterruptedException{
		selectteacher.click();
		selectteacher.sendKeys(teacher);
		Thread.sleep(500);
		selectteacher.sendKeys(Keys.ARROW_DOWN);
		selectteacher.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	public void AddSubj() throws InterruptedException{
		addsubj.click();
		Thread.sleep(1000);
		
	}
	
	public void Subj1() throws InterruptedException{
		subject1.click();
		Select select_subj = new Select(subject1);
		select_subj.selectByVisibleText("English");
		Thread.sleep(1000);
		subj1examdate.sendKeys("21/04/2021");
		Thread.sleep(100);
		saveexam1date.click();
		Thread.sleep(500);
		if (this.isAlertPresent()){
			
			Alert a = getDriver().switchTo().alert();
			a.accept();
			System.out.println("Invigilation Already Assigned on this date");
			}
		 
		
	}
	
	public void Subj2() throws InterruptedException{
		subject2.click();
		Select select_subj = new Select(subject2);
		select_subj.selectByVisibleText("Environmental Activities");
		Thread.sleep(1000);
		subj2examdate.sendKeys("22/04/2021");
		Thread.sleep(100);
		saveexam2date.click();
		Thread.sleep(500);
		if (this.isAlertPresent()){
			Alert a = getDriver().switchTo().alert();
			a.accept();
			System.out.println("Invigilation Already Assigned on this date");
			}
	}
	
	public void Subj3() throws InterruptedException{
		subject3.click();
		Select select_subj = new Select(subject3);
		select_subj.selectByVisibleText("Hygiene & Nutrition Activities");
		Thread.sleep(1000);
		subj3examdate.sendKeys("23/04/2021");
		Thread.sleep(100);
		saveexam3date.click();
		Thread.sleep(500);
		if (this.isAlertPresent()){
			Alert a = getDriver().switchTo().alert();
			a.accept();
			System.out.println("Invigilation Already Assigned on this date");
			}
	}
	
	public void Subj4() throws InterruptedException{
//		subject4.click();
		webDriverclick(subject4);
		Select select_subj = new Select(subject4);
		select_subj.selectByVisibleText("Kiswahili");
		Thread.sleep(1000);
		subj4examdate.sendKeys("26/04/2021");
		Thread.sleep(100);
//		saveexam4date.click();
		webDriverclick(saveexam4date);
		Thread.sleep(500);
		if (this.isAlertPresent()){
			Alert a = getDriver().switchTo().alert();
			a.accept();
			System.out.println("Invigilation Already Assigned on this date");
			}
	}
	
	public void Subj5() throws InterruptedException{
		subject5.click();
		Select select_subj = new Select(subject5);
		select_subj.selectByVisibleText("Math Activities");
		Thread.sleep(1000);
		subj5examdate.sendKeys("27/04/2021");
		Thread.sleep(100);
		saveexam5date.click();
		Thread.sleep(500);
		if (this.isAlertPresent()){
			Alert a = getDriver().switchTo().alert();
			a.accept();
			System.out.println("Invigilation Already Assigned on this date");
			}
	}
	
	/*public void Subj6() throws InterruptedException{
		subject6.click();
		Select select_subj = new Select(subject6);
		select_subj.selectByVisibleText("Religious Activities");
		Thread.sleep(1000);
		subj6examdate.sendKeys("07/07/2020");
		Thread.sleep(100);
		saveexam6date.click();
		Thread.sleep(500);
	}*/
	
	public void save_details() throws InterruptedException{
		
		savedetails.click();
		Thread.sleep(500);
		
	}
	
	public void Checkmessage() throws InterruptedException{
		
		if(message.isDisplayed()){
		String message1 = message.getText();
		Assert.assertEquals("The invigilator assignment has been saved successfully.", message1);
		}
		
		else{
		
			System.out.println("Not Saved");
		}
	}
	
	public boolean isAlertPresent() 
	{ 
	    try 
	    { 
	        getDriver().switchTo().alert(); 
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	} 

}

