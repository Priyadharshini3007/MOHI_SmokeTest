package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class StudentWorkFlowStatus {

	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public StudentWorkFlowStatus()	{
		
	PageFactory.initElements(getDriver(), this);
}
	
	/////////////////////////////////////StudentWorkFlowStatusElements/////////////////////////////////////////////////
	
	@FindBy(linkText="Student")
	WebElement studentMainMenu;
	
	@FindBy(linkText="Student Workflow Status")
	WebElement StudentWorkflowStatusSubMenu;
	
	@FindBy(xpath="//*[@id='TxtStudent']")
	WebElement CMFID;
	
	@FindBy(xpath="//*[@id='submitButton']")
	WebElement Go;
	
	@FindBy(xpath="//*[@class='switch']")
	WebElement ToggleButton;
	
	@FindBy(xpath="//*[@id='ddlcenter']")
	WebElement Center;
	
	@FindBy(xpath="//*[@id='ddlworkflowstepType']")
	WebElement WorkflowType;
	
	@FindBy(xpath="//*[@id='ddlworkflowstep']")
	WebElement WorkflowStep;
	
	@FindBy(xpath="//*[@type='search']")
	WebElement Search;
	
	@FindBy(xpath="//*[@id='tblStudentListView_previous']")
	WebElement PreviousButton;
	
	@FindBy(xpath="//*[@id='tblStudentListView_next']")
	WebElement NextButton;
	
	
	
	public void studentWorkflowStatusmenu() throws InterruptedException {
		
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		
		studentMainMenu.click();
		StudentWorkflowStatusSubMenu.click();
	}
	
	public void CMFID() throws InterruptedException {
		
		CMFID.sendKeys(excelutil.getData(29, 1, 0));
		Thread.sleep(2000);
		CMFID.sendKeys(Keys.ARROW_DOWN);		
		CMFID.sendKeys(Keys.ENTER);
		Go.click();
	}
	
	public void searchColumnHeader() throws InterruptedException {
		
		Search.sendKeys(excelutil.getData(29, 1, 1));
		
	}
	
	public void toggleButton() throws InterruptedException {
		
		ToggleButton.click();
		
	}
	
	public void filterDropdown() throws InterruptedException {
		
		Select selcenter = new Select(Center);
		selcenter.selectByVisibleText(excelutil.getData(29, 1, 2));
		
		Select selworkflowtype = new Select(WorkflowType);
		selworkflowtype.selectByVisibleText(excelutil.getData(29, 1, 3));
		
		Select selworkflowstep = new Select(WorkflowStep);
		selworkflowstep.selectByVisibleText(excelutil.getData(29, 1, 4));
		
		Go.click();
		
		
	}
	
public void searchbycenter() throws InterruptedException {
		
		Search.sendKeys(excelutil.getData(29, 1, 5));
		
		Thread.sleep(2000);
		
		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse1 = (JavascriptExecutor)getDriver();
		jse1.executeScript("arguments[0].click()",NextButton);
		//NextButton.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",PreviousButton);
		
		//PreviousButton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
