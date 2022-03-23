package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

public class Ct {
	
	public Ct() {
		
		PageFactory.initElements(getDriver(), this);
	
	}
	
	@FindBy(linkText = "Center")
	WebElement centermenu;
	@FindBy(linkText = "Class Teacher Entry")
	WebElement ctemenu;
	
	
	@FindBy(id="slctCenter")
	WebElement selectcenter;
	@FindBy(id="slctSchool")
	WebElement selectschool;
	@FindBy(id="slctClass")
	WebElement selectclass;
	@FindBy(id="slctsection")
	WebElement selectsection;
	@FindBy(id="slctclassteacher")
	WebElement selectteacher;
	
	@FindBy(xpath="//button[@value='Save']")
	WebElement save;

	@FindBy(id="flash")
	WebElement message; 
		
	
	public void navi(){
	centermenu.click();
	ctemenu.click();
	}
	
	public void select_center(String center) throws InterruptedException{
		selectcenter.click();
		Select select_center = new Select(selectcenter);
		select_center.selectByVisibleText(center);
		//selectcenter.sendKeys("J");
		Thread.sleep(500);
		//selectcenter.sendKeys(Keys.ENTER);
		}
	
	public void select_school(String school) throws InterruptedException{
		selectschool.click();
		Select select_school = new Select(selectschool);
		select_school.selectByVisibleText(school);
		//selectschool.sendKeys("J");
		Thread.sleep(500);
		//selectschool.sendKeys(Keys.ENTER);
		}
	
	public void select_class(String classname) throws InterruptedException{
		selectclass.click();
		Select select_class = new Select(selectclass);
		select_class.selectByVisibleText(classname);
		//selectclass.sendKeys("Form 1");
		Thread.sleep(500);
		//selectclass.sendKeys(Keys.ENTER);
		}
	
	public void select_section(String section) throws InterruptedException{
		selectsection.click();
		Select select_section = new Select(selectsection);
		select_section.selectByVisibleText(section);
		Thread.sleep(500);
		this.isAlertPresent();
		
		}
	
	public void select_teacher(String teacher) throws InterruptedException{
		selectteacher.click();
		Select select_teacher = new Select(selectteacher);
		select_teacher.selectByVisibleText(teacher);
		Thread.sleep(500);
		this.isAlertPresent();
		
		}
	
	public void select_save() throws InterruptedException{
	
	
		save.click();
		this.isAlertPresent();
	}
	
	
	public void Checkmessage() {
		String message1 = message.getText();
		Assert.assertEquals("The class teacher assignment has been saved successfully.", message1);
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
