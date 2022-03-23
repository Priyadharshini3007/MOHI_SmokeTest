package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CTReport {

	
	public CTReport() {
	
		PageFactory.initElements(getDriver(), this);
		}
	
	@FindBy(linkText = "Reports")
	WebElement reportsmenu;
	@FindBy(linkText = "Class Teacher")
	WebElement ctreport;
	
	
	@FindBy(id="Filter_CenterName")
	WebElement selectcenter;
	@FindBy(id="Filter_ClassCode")
	WebElement selectclass;
	@FindBy(id="Filter_ClassSectionID")
	WebElement selectsection;
	@FindBy(id="Filter_TeacherName")
	WebElement selectteacher;
	
	
	@FindBy(id="btnSearch")
	WebElement search;
	
	
	public void navigation(){
		reportsmenu.click();
		ctreport.click();
		}
	
	public void select_center(String center) throws InterruptedException{
		selectcenter.click();
		Select select_center = new Select(selectcenter);
		select_center.selectByVisibleText(center);
		Thread.sleep(500);
		}
			
	public void select_class(String classname) throws InterruptedException{
		selectclass.click();
		Select select_class = new Select(selectclass);
		select_class.selectByVisibleText(classname);
		Thread.sleep(500);
		}
	
	public void select_section(String section) throws InterruptedException{
		selectsection.click();
		Select select_section = new Select(selectsection);
		select_section.selectByValue(section);
		Thread.sleep(500);
		}
	
	
	public void select_teacher(String teacher) throws InterruptedException{
		selectteacher.click();
		selectteacher.sendKeys(teacher);
		Thread.sleep(500);
		}
	
	public void search() throws InterruptedException{
		search.click();
		Thread.sleep(2000);
	}
	
}
