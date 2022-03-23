package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class Previlege {
	
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public Previlege()	{

		PageFactory.initElements(getDriver(), this);
		
}
	
	
//////////////////////////////////////////////Previlege Elements/////////////////////////////////////////////////////
	
	@FindBy(linkText="Admin")
	WebElement AdminMenu;
	
	@FindBy(linkText="Privilege")
	WebElement PrivilegeSubmenu;
	
	@FindBy(linkText="Add Privilege")
	WebElement AddPrivilegeLink;
	
	@FindBy(xpath="//*[@id='Name']")
	WebElement Name;
	
	@FindBy(xpath="//*[@id='description']")
	WebElement Description;	
	
	@FindBy(xpath="//*[@id='AppModuleID']")
	WebElement ApplicationName;
	
	@FindBy(xpath="//*[@id='btnInfoSubmit']")
	WebElement SaveButton;
	
	@FindBy(xpath="//*[@id='flash']")
	WebElement Flashmessage;
	
	@FindBy(xpath="//*[@title='Click here to Return to List']")
	WebElement ReturnToList;
	
	@FindBy(xpath="(//*[@title='Edit Privilege'])[1]")
	WebElement EditButton;
	
	@FindBy(xpath="//*[@class='grid']")
	WebElement Table;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//Add Previlege
	
		public void previlege() throws InterruptedException {
		
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		
		AdminMenu.click();
		PrivilegeSubmenu.click();
		
		
	}
	
	
		public void addPrevilegeLink() throws InterruptedException {
			
			AddPrivilegeLink.click();
			
			}
		
	
		public void addPrevilegeRequiredFilelds() throws InterruptedException {
			
			Name.sendKeys(excelutil.getData(33, 1, 0));
			
			Description.sendKeys(excelutil.getData(33, 1, 1));
			
			Select selectApplication = new Select(ApplicationName);
			selectApplication.selectByVisibleText(excelutil.getData(33, 1, 2));
			
			}
		
		public void savePrevilege() throws InterruptedException {
			
			SaveButton.click();
			System.out.println(Flashmessage.getText());
			
		}
//Edit existing Previlege
		
		
		public void editbutton() throws InterruptedException {
			
			
			
			WebElement getElement=  getDriver().findElement(By.xpath("//*[normalize-space(text())='"+excelutil.getData(33, 1, 0)+"']/preceding-sibling::td/div/a"));
			
			getElement.click();
			
		}	
			
		
		public void editTheExistingPrevilegeDetails() throws InterruptedException {
			
			Name.clear();
			Name.sendKeys(excelutil.getData(33, 2, 0));
			
			Description.clear();
			Description.sendKeys(excelutil.getData(33, 2, 1));
			
			Select selectApplication = new Select(ApplicationName);
			selectApplication.selectByVisibleText(excelutil.getData(33, 2, 2));
			
			
	}
		
//PrevilegeReturnToList	
		
		

		public void addPrevilegeReturnToList() throws InterruptedException {
			
			AddPrivilegeLink.click();
			
			ReturnToList.click();
			
			
		}
		
		public void editPrevilegeReturnToList() throws InterruptedException {
			
			EditButton.click();
			
			ReturnToList.click();
			
		}
		
//PrevilegeListCanBeViewed
		
		public void PrevilegeListCanBeViewed() throws InterruptedException {
			
			if(Table.isDisplayed()){
				
				System.out.println("previlege List can able to View");
				
			}
			
			else
			{
				System.out.println("previlege List unable to View");
			}
			}
			
		}
