package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Bookassignment {
	public Bookassignment(){
		
		PageFactory.initElements(getDriver(), this);

}
	
	@FindBy(name="SchoolID")
	private WebElement schoolcenter;
	
	@FindBy(name="ClassID")
	private WebElement schoolclassname;
	
	@FindBy(name="SectionID")
	private WebElement classsectionfield;
	
	@FindBy(name="BookName")
	private WebElement searchbookfield;
	
	@FindBy(name="SubjectID")
	private WebElement Subjectfield;
	
	@FindBy(name="childSubjectID")
	private WebElement childsubjectfield;
	
	@FindBy(id="BookRatio")
	private WebElement Bookratiobutton;
	
	@FindBy(name="NoOfBooksToBeAssigned")
	private WebElement bookstoassignfield;
	
	@FindBy(name="Comments")
	private WebElement commentsfield;
	
	@FindBy(id="btnAssignBook")
	private WebElement assignbooksubmitbtn;
	
	
	public void selectcentrename(String centre){
		schoolcenter.sendKeys(centre);
	}
	
	public void selectschoolname(String schoolname){
		schoolclassname.sendKeys(schoolname);
		}
	
	public void selectclasssection(String classsection){
		classsectionfield.sendKeys(classsection);
	}
	
	
	public void selectsubjectfield(String subject){
		Subjectfield.sendKeys(subject);
		
	}
	public void selectchildsubjectfield(String childsubject){
		try{
		childsubjectfield.sendKeys(childsubject);
		}
		catch(Exception e){
			System.out.println("Child Subject not available");
		}
	}
	public void searchwithbookname(String bookname) throws InterruptedException{
		
		searchbookfield.sendKeys(bookname);
		
		Thread.sleep(2000);
		searchbookfield.sendKeys(Keys.ARROW_DOWN);
		
		searchbookfield.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
	}
	
	public void assignbookratio(){
	
		Bookratiobutton.sendKeys("1");
		bookstoassignfield.sendKeys("1");
		commentsfield.sendKeys("Test Comments for book");
		
		
	}
	public void assignbook(){
		assignbooksubmitbtn.submit();
	}
	
	
	
}

