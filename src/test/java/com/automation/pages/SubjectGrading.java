package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SubjectGrading {

	

    
	public SubjectGrading()	{
		
		PageFactory.initElements(getDriver(), this);

	}
	
	@FindBy(linkText="Exam")
	WebElement exammenu;
	
	@FindBy(linkText="Subject Grading Entry")
	WebElement subjgrading;
	
	@FindBy(id="ddlClasses")
	WebElement selectclass;
	@FindBy(id="ddlSubjects")
	WebElement subjectname;
	@FindBy(id="txtStartPerc")
	WebElement startperc;
	@FindBy(id="txtEndPerc")
	WebElement endperc;
	@FindBy(id="txtGrade")
	WebElement selectgrade;
	@FindBy(id="txtPoints")
	WebElement gradepoints;
	
	@FindBy(xpath="//button[@value='Save']")
	WebElement save;
	
	@FindBy(id="flash")
	WebElement message;
	
	public void navigation(){
		exammenu.click();
		subjgrading.click();
		}
		
	public void select_class(String classname) throws InterruptedException{
		selectclass.click();
		Select select_class = new Select(selectclass);
		select_class.selectByVisibleText(classname);
		Thread.sleep(500);
	}
	
	public void select_subject(String subj) throws InterruptedException{
		subjectname.click();
		Select select_subject = new Select(subjectname);
		select_subject.selectByVisibleText(subj);
		Thread.sleep(500);
	}
	
	public void Perc_start(String stperc) throws InterruptedException{
		startperc.click();
		startperc.sendKeys(stperc);
		Thread.sleep(500);
	}
	
	public void Perc_end(String edperc) throws InterruptedException{
		endperc.click();
		endperc.sendKeys(edperc);
		Thread.sleep(500);
	}
	
	public void grade(String grade) throws InterruptedException{
		selectgrade.click();
		selectgrade.sendKeys(grade);
		Thread.sleep(500);
	}
	
	public void points(String points) throws InterruptedException{
		gradepoints.click();
		gradepoints.sendKeys(points);
		Thread.sleep(500);
	}
	
	public void submit() throws InterruptedException{
		save.click();
		Thread.sleep(500);
	}
	
	public void Checkmessage() {
		String message1 = message.getText();
		Assert.assertEquals("Saved Subject Grading Assingment.", message1);
	}
	
	
}


