package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.excelutil;

public class EmailTemplate {
	

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public EmailTemplate()	{

		PageFactory.initElements(getDriver(), this);

}
	/////////////////////////////////////EmailTemplateElements//////////////////////////////////////////////
	
	
	@FindBy(linkText="Admin")
	WebElement AdminMenu;
	
	@FindBy(linkText="Email Template")
	WebElement EmailTemplateSubmenu;
	
	@FindBy(linkText="Add Email Config")
	WebElement AddEmailConfig;
	
	@FindBy(xpath="//*[@id='Type']")
	WebElement Type;
	
	@FindBy(xpath="//*[@id='Msg']")
	WebElement Message;
	
	@FindBy(xpath="//*[@title='Save this record']")
	WebElement SaveButton;
	
	@FindBy(xpath="//*[@id='Filter_Type']")
	WebElement Filter;
	
	@FindBy(xpath="//*[@id='btnSearch']")
	WebElement Search;
	
	@FindBy(xpath="//*[@id='flash']")
	WebElement FlashMessage;
	
	@FindBy(xpath="(//a[contains(@href,'eventtype=edit')])[1]")
	WebElement Edit;
	
	@FindBy(xpath="(//a[contains(@href,'eventtype=delete')])[1]")
	WebElement Delete;
	
	@FindBy(xpath="//*[@title='Click here to Return to List']")
	WebElement ReturnToList;
	
	
	

	public void AdminMenu() throws InterruptedException {
		
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		
		AdminMenu.click();
		EmailTemplateSubmenu.click();
	}
	
	
	public void addEmailConfig() throws InterruptedException {
		
	
		AddEmailConfig.click();
		//Type.sendKeys(excelutil.getData(30, 1, 0));
		
	
	}
	
	public void emailTypeAndMessage() throws InterruptedException {
		
		
	Type.sendKeys(excelutil.getData(30, 1, 0));
	Message.sendKeys(excelutil.getData(30, 1, 1));
		
	
	}
	
	public void Savemailtype() throws InterruptedException {
		
		
		SaveButton.click();
			
		
	}
	
	
	public void Flashmessage() throws InterruptedException {

		
		System.out.println(FlashMessage.getText());
		

	}
	
	public void SearchType() throws InterruptedException {

		Filter.sendKeys(excelutil.getData(30, 1, 0));
		Search.click();
		
	}
	
	public void edit() throws InterruptedException {
		Edit.click();
		Type.clear();
		Type.sendKeys(excelutil.getData(30, 2, 0));
		Message.clear();
		Message.sendKeys(excelutil.getData(30, 2, 1));
		
	}
	
	public void saveEditedMailType() throws InterruptedException {
		
		
		SaveButton.click();
		System.out.println(FlashMessage.getText());
			
		
	}
	
	public void SearchTypetoDelete() throws InterruptedException {

		Filter.sendKeys(excelutil.getData(30, 3, 0));
		Search.click();
		
	}
	
	public void Deletemail() throws InterruptedException {


		Delete.click();
		System.out.println(FlashMessage.getText());
	}
	
	public void AddConfigMailReturnToList() throws InterruptedException {
			
		AddEmailConfig.click();
		
		ReturnToList.click();
		
	}	
	
	public void EditMailReturnToList() throws InterruptedException {
		
		Edit.click();
		
		ReturnToList.click();
		
	}	

	
}
