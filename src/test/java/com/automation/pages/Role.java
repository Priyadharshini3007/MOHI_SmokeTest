package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class Role {

	
JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public Role()	{
		
		PageFactory.initElements(getDriver(), this);

	}
	
	
//-------------------------------------Role Elements---------------------------------------//
	
	@FindBy(linkText="Admin")
	WebElement AdminMenu;
	
	@FindBy(linkText="Role")
	WebElement RoleSubmenu;
	
	@FindBy(linkText="Add Role")
	WebElement AddRoleLink;
	
	@FindBy(xpath="//*[@id='Name']")
	WebElement Name;
	
	@FindBy(xpath="//*[@id='Description']")
	WebElement Description;
	
	@FindBy(xpath="//*[@id='IsActive']")
	WebElement ISActive;
	
	@FindBy(xpath="//*[@id='btnInfoSubmit']")
	WebElement SaveButton;
	
	@FindBy(xpath="//*[@id='flash']")
	WebElement Flashmessage;
	
	@FindBy(xpath="//*[@title='Click here to Return to List']")
	WebElement ReturnToList;
	
	@FindBy(xpath="(//*[@title='Edit Role'])[1]")
	WebElement EditButton;
	
	
	
	public void AddRole() throws InterruptedException {
		
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		
		AdminMenu.click();
		RoleSubmenu.click();
		
		
	}
	
	public void addRoleLink() throws InterruptedException {
		
		AddRoleLink.click();
		
		}
	
	
	public void addRoleRequiredFilelds() throws InterruptedException {
		
		Name.sendKeys(excelutil.getData(34, 1, 0));
		
		Description.sendKeys(excelutil.getData(34, 1, 1));
		
		}
	
	public void saveRole() throws InterruptedException {
		
		SaveButton.click();
		System.out.println(Flashmessage.getText());
		
	}
	
//EditRole
	
	public void editRolebutton() throws InterruptedException {
		
		
		
		WebElement getElement=  getDriver().findElement(By.xpath("//*[normalize-space(text())='"+excelutil.getData(34, 1, 0)+"']/preceding-sibling::td/div/a"));
		
		getElement.click();
		
	}	
	
	

	public void editRoleRequiredFilelds() throws InterruptedException {
		Name.clear();
		Name.sendKeys(excelutil.getData(34, 2, 0));
		Description.clear();
		Description.sendKeys(excelutil.getData(34, 2, 1));
		
		}
	
//DeleteRole
	
	
	public void DeleteRolebutton() throws InterruptedException {
		
		WebElement getElement=  getDriver().findElement(By.xpath("//td[contains(text(),'"+excelutil.getData(34, 3, 0)+"')]/following-sibling::td[5]/a[3]"));
		
		getElement.click();
		
		System.out.println(Flashmessage.getText());
		
	}
	
//Do Not get Deleted when associated with System details
	
		public void deleteWhenAssociatedWithSystemDetails() throws InterruptedException {
		
		WebElement getElement=  getDriver().findElement(By.xpath("//td[contains(text(),'"+excelutil.getData(34, 4, 0)+"')]/following-sibling::td[5]/a[3]"));
		
		getElement.click();
		
		System.out.println(Flashmessage.getText());
		
	}
		
//InActive
		

		
		public void InactiveRole() throws InterruptedException {
			
			Thread.sleep(1000);
			WebElement getElement=  getDriver().findElement(By.xpath("//*[normalize-space(text())='"+excelutil.getData(34, 1, 0)+"']/preceding-sibling::td/div/a"));
			
			getElement.click();
			
			ISActive.click();
			
			this.saveRole();
			
			System.out.println(Flashmessage.getText());
		}
		
//RoleReturnToList
		
		public void addRoleReturnToList() throws InterruptedException {
			
			AddRoleLink.click();
			
			ReturnToList.click();
			
			
		}
		
		public void editRoleReturnToList() throws InterruptedException {
			
			EditButton.click();
			
			ReturnToList.click();
			
		}
//ManageMenu Associate to Role
		
		
		public void ManageMenuLink() throws InterruptedException {
			
			WebElement getElement=  getDriver().findElement(By.xpath("//td[contains(text(),'"+excelutil.getData(34, 4, 0)+"')]/following-sibling::td[5]/a[1]"));
			
			getElement.click();
			
			String [] arr= excelutil.getData(34, 1, 2).toString().split(",");
			
			for (int i = 0; i < arr.length; i++) {
				WebElement menucheckboxes=  getDriver().findElement(By.xpath("//*[normalize-space(text())='"+arr[i]+"']/preceding-sibling::td[1]/input[not(@type='hidden')]"));
				
				Thread.sleep(2000);
				
				JavascriptExecutor jse = (JavascriptExecutor)getDriver();
				jse.executeScript("arguments[0].click()",menucheckboxes);
				
				//menucheckboxes.click();
				
				JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
				scrolldown1.executeScript("arguments[0].scrollIntoView()",SaveButton);
				}
		}
		
//ManagePrevilege Associate to Role
		
		public void ManagePrevilegesLink() throws InterruptedException {
			
			WebElement getElement=  getDriver().findElement(By.xpath("//td[contains(text(),'"+excelutil.getData(34, 4, 0)+"')]/following-sibling::td[5]/a[2]"));
			
			getElement.click();
			
			String [] arr= excelutil.getData(34, 1, 3).toString().split(",");
			
			for (int i = 0; i < arr.length; i++) {
				WebElement menucheckboxes=  getDriver().findElement(By.xpath("//*[normalize-space(text())='"+arr[i]+"']/preceding-sibling::td[1]/input[not(@type='hidden')]"));
				
				menucheckboxes.click();
				
				JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
				scrolldown1.executeScript("arguments[0].scrollIntoView()",SaveButton);
				}
		}
}



