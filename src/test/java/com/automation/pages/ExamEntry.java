package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ExamEntry {

	public ExamEntry() {
	
		PageFactory.initElements(getDriver(), this);
		}
	
	@FindBy(linkText = "Exam")
	WebElement exammenu;
	@FindBy(linkText = "Exam Entry")
	WebElement examentry;
		
	@FindBy(name="ExaminiationName")
	WebElement Examname;
	@FindBy(id="ddlExamYear")
	WebElement Examyear;
	@FindBy(id="ddlTerms")
	WebElement ExamTem;
	@FindBy(xpath="//input[@id='chk']")
	WebElement selectclass;
	
	@FindBy(xpath="//button[@value='Save']")
	WebElement save;
	
	@FindBy(id="flash")
	WebElement message;
	
	public void navigation(){
		exammenu.click();
		examentry.click();
		}
	
	public void Exam_name(String examname){
		
		Examname.click();
		Examname.sendKeys(examname);
	}
	
	public void Exam_year(String examyear){
		Examyear.click();
		Examyear.sendKeys(examyear);
	}
	
	public void select_term(String term){
		ExamTem.click();
		ExamTem.sendKeys(term);
	}
	
	public void select_class(String classname){
		selectclass.click();
		selectclass.sendKeys(classname);
	}
	
	public void submit(){
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()", save);
		
	}
	
	public void Checkmessage() {
		if (message.isDisplayed()) {
		
			String message1 = message.getText();
			Assert.assertEquals("The exam information has been saved successfully.", message1);
		
		}
		
		else{
			
			System.out.println("Exam name Already exists");
			
		}
		
		
		
	}
	
	
}
