package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class WorkFlow {
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public WorkFlow()	{

	PageFactory.initElements(getDriver(), this);

}

//////////////////////////////////////////WorkFlow Page Elements/////////////////////////////////////////////////////////
	
	@FindBy(linkText="Admin")
	WebElement AdminMenu;
	
	@FindBy(linkText="Workflow")
	WebElement WorkFlow;
	
	@FindBy(xpath="//*[@id='Filter_Name']")
	WebElement FilterName;
	
	@FindBy(xpath="//*[@id='btnSearch']")
	WebElement Search;
	
	@FindBy(xpath="(//*[@title='Click here to edit this WorkflowStepGroup'])[1]")
	WebElement EditIcon;
	
	@FindBy(xpath="(//*[@title='Click here to Add WorkflowStepGroup'])[1]")
	WebElement AddIcon;
	
	@FindBy(xpath="//*[@class='btn btn-default btn-sm']")
	WebElement ReturnToList;
	
	
	
	
	@FindBy(xpath="//*[@id='ui-id-3']")
	WebElement WorkFlowTab;
	
	@FindBy(xpath="//*[@id='TxtUser']")
	WebElement ApproverName;
	
	@FindBy(xpath="//*[@id='SaveApprvr']")
	WebElement Savebutton;
	
	@FindBy(xpath="//div[contains(@class, 'ui-dialog-buttonset')]//button[contains(@class,'btn-xs')]")
	WebElement Cancelbutton;
	
	@FindBy(xpath="//*[@class='table-grid grid']")
	WebElement TableView;
	
	@FindBy(xpath="//*[@id='EdtDisplayOrder']")
	WebElement Order;
	
	@FindBy(xpath="//*[@id='EdtSteptype']")
	WebElement steptype;
	
	@FindBy(xpath="//*[@id='EdtStepName']")
	WebElement EditStepName;
	
	@FindBy(xpath="//*[@id='EdtIsCustom']")
	WebElement IsCustomApproval;
	
	@FindBy(xpath="//*[@id='btnSaveWf1']")
	WebElement Save;
	
	
	
	
	
	
	
	
	
	
	
	
	public void WorkFlowMenu() throws InterruptedException {
		
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		
		AdminMenu.click();
		WorkFlow.click();
		
		
	}
	
	public void editWorkFlow() throws InterruptedException {
		
		
		FilterName.sendKeys(excelutil.getData(36, 1, 0));
		
		Search.click();
		
		EditIcon.click();
		
		
}
	
	public void workFlowTab() throws InterruptedException {
		
		
		WorkFlowTab.click();
		
		
}
	

	public void approverAssignmentIcon() throws InterruptedException {
		
		
		WebElement getElement=  getDriver().findElement(By.xpath("//td[contains(text(),'"+excelutil.getData(36, 1, 1)+"')]/following-sibling::td[4]/a"));
		
		getElement.click();
		
}
	
	public void approverName() throws InterruptedException {
		
		
			ApproverName.sendKeys(excelutil.getData(36, 1, 2));
			Thread.sleep(1000);
			
			ApproverName.sendKeys(Keys.ARROW_DOWN);		
			ApproverName.sendKeys(Keys.ENTER);

			
			
			
			Savebutton.click();
			
			Thread.sleep(1000);
			
			Cancelbutton.click();
			
			}


//WorkFlow List can be Viewed
	
		public void workFlowListCanBeViewed() throws InterruptedException {
			
			if(TableView.isDisplayed()){
				
				System.out.println("WorkFlow List can able to View");
				
			}
			
			else
			{
				System.out.println("WorkFlow List unable to View");
			}
			}		


//AdminWorkFlowReturnToList	
		
		

		public void addWorkFlowReturnToList() throws InterruptedException {
			
			AddIcon.click();
			
			ReturnToList.click();
			
			
		}
		
		public void editWorkFlowReturnToList() throws InterruptedException {
			
			EditIcon.click();
			
			ReturnToList.click();
			
		}
		
//Edit User in the workFlow
		
		
		public void editUserInTheWorkFlow() throws InterruptedException {
			
		Thread.sleep(1000);	
		
		WebElement getElement=  getDriver().findElement(By.xpath("//td[contains(text(),'"+excelutil.getData(36, 1, 1)+"')]/following-sibling::td[5]/a"));
		
		getElement.click();
		
		Order.sendKeys(excelutil.getData(36, 1, 4));
		
		Select selectSteptype = new Select(steptype);
		selectSteptype.selectByVisibleText(excelutil.getData(36, 1, 5));
		
		EditStepName.clear();
		
		EditStepName.sendKeys(excelutil.getData(36, 1, 3));
		
		IsCustomApproval.click();
		
		Save.click();
		
		}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

