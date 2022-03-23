package com.automation.pages;


import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.utils.excelutil;
//import utilities.excelutil;

public class CMFEdit {
	

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public CMFEdit()	{

	PageFactory.initElements(getDriver(), this);

	}
	
	/////////////////CMF Edit elements/////////////////////////////////////
	
	@FindBy(linkText = "Sponsorship")
	WebElement sponsorshipMainMenu;
	

	@FindBy(linkText = "CMF Edit")
	WebElement cmfeditsubmenu;
	
	
	@FindBy(xpath = "//input[@id='TxtStudent']")
	WebElement enterthestudenttoeditcmf;
	

	@FindBy(xpath = "//input[@id='IsResuable'and @value='False']")
	WebElement reusuableno;
	
	
	@FindBy(xpath = "//button[@id='btnRemoveCMFID']")
	WebElement removeCMFid;
	
	
	@FindBy(xpath = "//input[@id='txtCMFID']")
	WebElement searchnewCMFid;
	
	
	@FindBy(xpath = "//button[@id='btnAssignCMFID']")
	WebElement assignCMFid;
	

	
	@FindBy(xpath = "//*[@id='spnStudentCMFID']")
	WebElement spnStudentCMFID;
	
	@FindBy(xpath = "//*[@id='validateCMF']")
	WebElement validateCMF;
	
	@FindBy(xpath="//*[@id='userDropdownMenuLink']")
	WebElement menu;
	
	@FindBy(xpath="//*[@id='navbar-collapse-nav']/ul[2]/li/span/a[2]")
	WebElement logout;
	
	
	
	public void Sponsorshipmenucmfedit() throws InterruptedException {
		/*String path=System.getProperty("user.dir");
		String fullPath= path + "//src//test//java//utilities//Studentdetails.xlsx";
		utilities.excelutil.Excelp(fullPath);*/
		
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		


		sponsorshipMainMenu.click();
		cmfeditsubmenu.click();

	}
	
	public void searchTheStudentToeditCMFID() throws InterruptedException{
		Thread.sleep(2000);
		enterthestudenttoeditcmf.sendKeys(excelutil.getData(8, 1, 2));
		Thread.sleep(2000);
		enterthestudenttoeditcmf.sendKeys(Keys.ARROW_DOWN);		
		enterthestudenttoeditcmf.sendKeys(Keys.ENTER);
		
		removeCMFid.click();
		
		Thread.sleep(2000);
		
		enterthestudenttoeditcmf.sendKeys(excelutil.getData(8, 1, 2));
		Thread.sleep(2000);
		enterthestudenttoeditcmf.sendKeys(Keys.ARROW_DOWN);		
		enterthestudenttoeditcmf.sendKeys(Keys.ENTER);
		

}
	
	public void searchnewCMFID() throws InterruptedException{
		Thread.sleep(3000);
		searchnewCMFid.sendKeys(excelutil.getData(8,1,1));
		Thread.sleep(2000);
		searchnewCMFid.sendKeys(Keys.ARROW_DOWN);		
		searchnewCMFid.sendKeys(Keys.ENTER);
		assignCMFid.click();
		

}
	
	public void searchTheStudentnoresuable() throws InterruptedException{
		Thread.sleep(2000);
		enterthestudenttoeditcmf.sendKeys(excelutil.getData(8, 1, 2));
		Thread.sleep(2000);
		enterthestudenttoeditcmf.sendKeys(Keys.ARROW_DOWN);		
		enterthestudenttoeditcmf.sendKeys(Keys.ENTER);
		
		
		reusuableno.click();
		
		searchnewCMFid.sendKeys(spnStudentCMFID.getText());

		searchnewCMFid.sendKeys(Keys.ARROW_DOWN);
		
		System.out.println(validateCMF.getText());
		
		
}
	
	public void logoutfromcmfedit() throws InterruptedException{
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
	     executor.executeScript("arguments[0].click();", menu);
		//menu.click();
	     JavascriptExecutor executor1 = (JavascriptExecutor) getDriver();
	     executor1.executeScript("arguments[0].click();", logout);
		//logout.click();
		
		
		}
	
	
	
}



