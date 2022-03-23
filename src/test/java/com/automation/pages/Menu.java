package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class Menu {
	
JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public Menu()	{
		
		PageFactory.initElements(getDriver(), this);

}
////////////////////////////////////////////////Admin Menu Elements///////////////////////////////////////////////////////////


	@FindBy(linkText="Admin")
	WebElement AdminMenu;
	
	@FindBy(linkText="Menu")
	WebElement MenuSubmenu;
	
	@FindBy(linkText="Add Menu")
	WebElement AddMenuLink;
	
	@FindBy(xpath="//*[@id='Name']")
	WebElement Name;
	
	@FindBy(xpath="//*[@id='ParentID']")
	WebElement Parent;
	
	@FindBy(xpath="//*[@id='SortOrder']")
	WebElement SortOrder;
	
	@FindBy(xpath="//*[@id='URL']")
	WebElement URL;
	
	@FindBy(xpath="//*[@id='AppModuleID']")
	WebElement ApplicationName;
	
	@FindBy(xpath="//*[@id='IsActive']")
	WebElement IsActive;
	
	@FindBy(xpath="//*[@id='btnInfoSubmit']")
	WebElement SaveButton;
	
	@FindBy(xpath="//*[@title='Click here to Return to List']")
	WebElement ReturnToList;
	
	@FindBy(linkText="Role")
	WebElement RoleSubmenu;
	
	@FindBy(xpath="//*[@name='Filter.Name']")
	WebElement FilerRole;
	
	@FindBy(xpath="//*[@id='btnSearch']")
	WebElement SearchButton;
	
	@FindBy(linkText="Manage Menu")
	WebElement ManageMenuLink;
	
	@FindBy(linkText="TestExam")
	WebElement TestExam;
	
	@FindBy(linkText="Exam")
	WebElement ExamMenu;
	
	@FindBy(xpath="//*[@id='flash']")
	WebElement Flashmessage;
	
	@FindBy(xpath="//*[not(@checked='checked') and @type='checkbox']")
	WebElement newAddedMenu;
	
	@FindBy(xpath="(//a[contains(@href,'eventtype=delete')])[1]")
	WebElement DeleteMenu;
	
	@FindBy(xpath="(//a[contains(@href,'eventtype=edit')])[8]")
	WebElement EditMenu;
	
	@FindBy(xpath="(//a[contains(@href,'eventtype=edit')])[4]")
	WebElement EditMenuISActive;
	
	
	
	
	
	
	
	
//Add New Menu
	
	public void menu() throws InterruptedException {
		
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		
		AdminMenu.click();
		MenuSubmenu.click();
		
		
	}
	
	public void AddmenuLink() throws InterruptedException {
		
		AddMenuLink.click();
		
	}
	
	public void enterTheFields() throws InterruptedException {
		
		Name.sendKeys(excelutil.getData(32, 1, 0));
		
		Thread.sleep(2000);
		Select selectParent = new Select(Parent);
		selectParent.selectByVisibleText(excelutil.getData(32, 1, 1));
		
		SortOrder.clear();
		SortOrder.sendKeys(excelutil.getData(32, 1, 2));
		
		URL.sendKeys(excelutil.getData(32, 1, 3));
		
		Select selectApplication = new Select(ApplicationName);
		selectApplication.selectByVisibleText(excelutil.getData(32, 1, 4));
	}
	
	public void saveTheMenu() throws InterruptedException {
		
		SaveButton.click();
		System.out.println(Flashmessage.getText());
		
	}
	
	public void roleMenu() throws InterruptedException {
		
		AdminMenu.click();
		RoleSubmenu.click();
		
	}
	
	public void filterRole() throws InterruptedException {
		
		FilerRole.sendKeys(excelutil.getData(32, 1, 5));
		
		SearchButton.click();
		
		ManageMenuLink.click();
		
	}
	
	public void newAddedMenu() throws InterruptedException {
		
		Thread.sleep(2000);
		
		WebElement newMenu=  getDriver().findElement(By.xpath("//td[contains(text(),'"+excelutil.getData(32, 1, 0)+"')]/preceding-sibling::td/input[not(@type='hidden')  and not(@checked='checked')]"));
		
	JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
	scrolldown.executeScript("arguments[0].scrollIntoView()",newMenu);
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",newMenu);
		//Thread.sleep(2000);
		//newMenu.click();
		
		//JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		//scrolldown.executeScript("window.scrollBy(0,3000)");
		
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()",SaveButton);
		
		
	}
	
	public void verifyAddedMenu() throws InterruptedException {
		
		//ExamMenu.click();
		WebElement getElement=  getDriver().findElement(By.linkText(""+excelutil.getData(32, 1, 1)+""));
		
		getElement.click();
		
		WebElement getSubElement = getDriver().findElement(By.linkText(""+excelutil.getData(32, 1, 0)+""));
		System.out.println(getSubElement.getText());
		
		
	}
	
//Edit existing Menu
	
	public void editExistingMenu() throws InterruptedException {
		
		
		
		WebElement getElement=  getDriver().findElement(By.xpath("//*[normalize-space(text())='"+excelutil.getData(32, 1, 0)+"']/preceding-sibling::td/div/a"));
		
		getElement.click();
		
		//EditMenu.click();
		
		Name.clear();
		Name.sendKeys(excelutil.getData(32, 2, 0));
		
		Thread.sleep(2000);
		
		Select selectParent = new Select(Parent);
		selectParent.selectByVisibleText(excelutil.getData(32, 2, 1));
		
		SortOrder.clear();
		SortOrder.sendKeys(excelutil.getData(32, 2, 2));
		
		URL.clear();
		URL.sendKeys(excelutil.getData(32, 2, 3));
		
		Select selectApplication = new Select(ApplicationName);
		selectApplication.selectByVisibleText(excelutil.getData(32, 2, 4));
		
		
}
	
	
//AdminMenuReturnToList	
	
	

	public void addMenuReturnToList() throws InterruptedException {
		
		AddMenuLink.click();
		
		ReturnToList.click();
		
		
	}
	
	public void editReturnToList() throws InterruptedException {
		
		EditMenu.click();
		
		ReturnToList.click();
		
	}
	
//MenuInactive
	
	
	public void menuActive() throws InterruptedException {
		
		//EditMenuISActive.click();
		WebElement getElement=  getDriver().findElement(By.xpath("//td[contains(text(),'"+excelutil.getData(32, 3, 0)+"')]/preceding-sibling::td/div/a"));
		getElement.click();
		IsActive.click();
		this.saveTheMenu();
		
		String t= getDriver().findElement(By.xpath("//td[contains(text(),'"+excelutil.getData(32, 3, 0)+"')]/following-sibling::td[4]")).getText();
		if(t.equals("False"))
		{
			System.out.println("Become inactive successfully");
		}
		else
		{
			System.out.println("Not inactivated");
		}
		}
	
	
//Application Field Deafaulted To SiteAdmin
	
	public void defaultToSiteAdmin() throws InterruptedException {
		
		//System.out.println(ApplicationName.getFirstSelectedOption());
		Select select = new Select(getDriver().findElement(By.xpath("//*[@id='AppModuleID']")));

		WebElement option = select.getFirstSelectedOption();

		String defaultItem = option.getText();

		System.out.println(defaultItem );
		
		System.out.println("Application is defaulted to SiteAdmin");
		
		}
	
//Inactive Elememt not displayed in the site
	
			public void inActiveElementnotDisplayed() throws InterruptedException {
				
				
			
				WebElement getElement=  getDriver().findElement(By.linkText(""+excelutil.getData(32, 3, 1)+""));
				
				getElement.click();
				
                boolean getsubmenu=  getDriver().findElements(By.linkText(""+excelutil.getData(32, 3, 0)+"")).size() == 0;
				
				//getElement.click();
				
				if(getsubmenu)
				{
				System.out.println("Inactive menu not get displayed in the site");
					
				}
				
				else
				{
					System.out.println("Inactive menu get displayed in the site");
					
				}
		
		}
	

}
