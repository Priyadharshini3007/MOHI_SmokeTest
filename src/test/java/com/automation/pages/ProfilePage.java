package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	public ProfilePage(){
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath="//a[contains(text(),'Site')]")
	private WebElement Siteadmin;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	private WebElement logout;
	

public void logout(){
	Siteadmin.click();
	logout.click();
	
}

}
