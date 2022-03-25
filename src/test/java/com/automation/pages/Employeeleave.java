
package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class Employeeleave {
	public Employeeleave()
	{

		PageFactory.initElements(getDriver(), this);	
	}
	
	@FindBy(xpath="//a[text()='Employee']")
	WebElement nav1; 
	@FindBy(linkText="Employee Leave")   // /html/body/div[1]/nav/div/ul[1]/li[2]/div/a[3]
	WebElement nav2; 
	@FindBy(id="btnEmployeeLeavePersonal")
	WebElement applyleavebtn;
	@FindBy(xpath="//a[contains(text(),'Employee Leave request')]")
	WebElement clickalert;
	@FindBy(xpath="//input[@type='search']")
	WebElement searchbox; 
	@FindBy(xpath="//*[@class='btn btn-success btnAdd btn-sm btnApproval']")
	WebElement approvebtn; 
	@FindBy(id="Comments")
	WebElement comment; 
	@FindBy(name="Submit")
	WebElement submitbbbtn; 
	@FindBy(id="select2-ddlLeaveType-container")
	WebElement dropdown;
	@FindBy(xpath="//input[@type='text'][1]")
	WebElement datepickerclick;
	@FindBy(xpath="/html/body/div[6]/div[1]/table[2]/tbody/tr[2]/td[3]/div")
	WebElement dateselect1;
	@FindBy(id="txtTask_1")
	WebElement task;
	@FindBy(id="select2-ddlEmployee_1-container")
	WebElement selectemp;
	@FindBy(id="btnSubmitEmployeeLeave")
	WebElement employeeleavesubmitbtn;
	@FindBy(xpath="'//button[text()='OK']")
	WebElement acceptalert;
	
	
	@FindBy(id="userDropdownMenuLink")
	WebElement logout1;
	@FindBy(linkText="Log Out")
	WebElement logout2;
	
	@FindBy(id="Username")
	WebElement username;
	@FindBy(id="Questions_0__Answer")
	WebElement key;	
	@FindBy(id="Password")
	WebElement pass;	
	@FindBy(name="CheckUserNamePassword")
	WebElement submit;
	@FindBy(xpath = "//*[@title='Expand Employee']")
	WebElement ExpandEmployee;
	@FindBy(xpath="i[title='Expand Employee']")
	WebElement EmployeeAlert;
	
	
	public void NavigateLeave() throws InterruptedException{
	//	excelutil.Excelp(".//EmployeeLeave.xlsx");
    //  login(excelutil.getData(0,2,0),excelutil.getData(0, 1,1),excelutil.getData(0, 1,2));
		nav1.click(); 
		nav2.click();
	}
	
	public void applyleave() throws InterruptedException, AWTException{
		excelutil.Excelp(".//EmployeeLeave.xlsx");
		applyleavebtn.click();
		dropdown.click();
		
		String text = excelutil.getData(0, 1,5);
		WebElement el = getDriver().findElement(By.xpath("//ul[@id = 'select2-ddlLeaveType-results']/descendant::li[text() = '"+text+"']"));
		el.click();
		datepickerclick.click();
		Thread.sleep(2000);
		dateselect1.click();dateselect1.click();
		comment.sendKeys(excelutil.getData(0, 1,4));
		task.sendKeys(excelutil.getData(0, 1,4));
		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");
		selectemp.click();
		
		String text1 = excelutil.getData(0, 1,6);
		//*[@class='select2-search__field']
		getDriver().findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(text1.split("-")[1].trim());;
		
		WebElement e2 = getDriver().findElement(By.xpath("(//ul[@id ='select2-ddlEmployee_1-results']/descendant::li[contains(text(), '"+text1.split("-")[1].trim()+"')])[1]"));
		e2.click();
		
		employeeleavesubmitbtn.click();
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
		//acceptalert.click();
				
	}
	
	public void approveleave() throws InterruptedException{
	
		excelutil.Excelp(".//EmployeeLeave.xlsx");
		logout();
		login(excelutil.getData(0, 1,0),excelutil.getData(0, 1,1),excelutil.getData(0, 1,2));
		webDriverclick(ExpandEmployee);

		WebElementUtils.waitForVisible(clickalert);

		WebElementUtils.scrolltoview(clickalert);
		clickalert.click();
		searchbox.sendKeys(excelutil.getData(0, 1,3));
		approvebtn.click();
		comment.sendKeys(excelutil.getData(0, 1,4));
		submitbbbtn.click();
		
	}
	
	public void approveleave1() throws InterruptedException{
		
		
		webDriverclick(ExpandEmployee);


		WebElementUtils.waitForVisible(clickalert);

		WebElementUtils.scrolltoview(clickalert);
		clickalert.click();
		searchbox.sendKeys(excelutil.getData(0, 1,3));
		approvebtn.click();
		comment.sendKeys(excelutil.getData(0, 1,4));
		submitbbbtn.click();
		
		
	}
	
	public void logout() throws InterruptedException{
		logout1.click();logout2.click();
		
	}
	
	public void login(String u , String k , String p) throws InterruptedException{
		Thread.sleep(2000);
		
		username.sendKeys(u);
		submit.click();
		key.sendKeys(k);
		submit.click();
		pass.sendKeys(p);
		submit.click();		
		
	}
	
	
	
}
