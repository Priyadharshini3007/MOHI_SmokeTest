package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
			public DashboardPage() {
		        PageFactory.initElements(getDriver(), this);
		    }
			@FindBy(xpath="//a[contains(text(),'Site')]")
			private WebElement Siteadmin;
			
			@FindBy(xpath="//a[contains(text(),'Log Out')]")
			private WebElement logout;
			
			@FindBy(xpath="//a[@class='nav-link dropdown-toggle'][contains(text(),'Dashboard')]")
			private WebElement dashboardmenu;
			
			@FindBy(xpath="//a[contains(text(),'My Dashboard')]")
			private WebElement mydashboardlink;
			
			public void navigatetodashboardmenu()
			{
				dashboardmenu.click();
				mydashboardlink.click();
			}
			
			
		
			
		

}
