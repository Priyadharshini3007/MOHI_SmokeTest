package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
   public AdminPage(){
	   PageFactory.initElements(getDriver(), this);
   }
   @FindBy(xpath="//a[contains(text(),'Admin')]")
   private WebElement AdminMenu;
   
   @FindBy(xpath="//a[contains(text(),'User')]")
   private WebElement UserBtn;
   
   @FindBy(linkText="Admin")
   private WebElement adminlink;
   
   
   
   
   public void clickonadminmenu(){
	   AdminMenu.click();
   }
   public void userbtn(){
	   UserBtn.click();
	   
   }
   public void navigateadmin(){
	   adminlink.click();
   }
   
   
}
