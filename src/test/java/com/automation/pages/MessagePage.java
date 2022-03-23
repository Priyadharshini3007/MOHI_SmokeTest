package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {
	public MessagePage(){
			PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id="txtbasicSearch")
	private WebElement basicsearchbutton;
	
	@FindBy(xpath="//tbody[@id='tbodyMessages']")
	private WebElement messageheader;
	
	@FindBy(id="btnAddMessage")
	private WebElement addmessagebutton;
	
	@FindBy(id="txtNewMsgComments")
	private WebElement addnewmesagecomments;
	
	@FindBy(id="btnSaveChildMessages")
	private WebElement savemessage;
	
	@FindBy(xpath="//button[@class='swal-button swal-button--confirm']")
	private WebElement messagesuccessbutton;
	
	@FindBy(partialLinkText="students have received new message that requires your review")
	private WebElement studentmessagelink;
	
	@FindBy(xpath="//span[@class='switch-label']")
	private WebElement labelswitchbutton;
	
	@FindBy(xpath="//i[@class='fa fa-envelope-open-o']")
	private WebElement editactionbutton;
	
	@FindBy(id="btnEditChildMessage")
	private WebElement editmessagebutton;
	
	@FindBy(id="btnApproveChildMessage")
	private WebElement approvemessagebutton;
	
	@FindBy(id="btnRejectChildMessage")
	private WebElement rejectmessagebutton;
	
	@FindBy(id="txtEditRecMsgComments")
	private WebElement edittextfield;
	
	@FindBy(id="btnEditSaveChildMessage")
	private WebElement saveandapprovebutton;
	
	@FindBy(xpath="//i[@class='fa fa-print ']")
	private WebElement clickonprinticon;
	
	@FindBy(id="btnPrintApproveChildMessage")
	private WebElement printapprovebutton;
	
	public void searchforstudent(String cmforstudent){
		basicsearchbutton.sendKeys(cmforstudent);
		basicsearchbutton.sendKeys(Keys.ENTER);
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		messageheader.click();
	}
	
	public void addmessage(){
		addmessagebutton.click();
		addnewmesagecomments.sendKeys("TestComments");
		savemessage.click();
		messagesuccessbutton.click();
	}
	
	public void selectthestudent(){
		studentmessagelink.click();
		messageheader.click();

	}
	public void switchthelabel(){
		labelswitchbutton.click();
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		public void editactions(){
		editactionbutton.click();
		editmessagebutton.click();
	}
	
	public void editandapprovemessage(){
		//editmessagebutton.click();
		edittextfield.sendKeys("Test Edit comments00");
		saveandapprovebutton.click();	
		messagesuccessbutton.click();
		
	}
	
	public void rejectmessage(){
		editactionbutton.click();
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		rejectmessagebutton.click();
		messagesuccessbutton.click();
	}
	
	public void clickonprint() throws InterruptedException{
		clickonprinticon.click();
		printapprovebutton.click();
		String parent = getDriver().getWindowHandle();

        Thread.sleep(3000);

        for (String winHandle : getDriver().getWindowHandles()) {

       	 getDriver().switchTo().window(winHandle); // switch focus to new window

        }

        // String second = driver.getWindowHandle();

        getDriver().close();

        getDriver().switchTo().window(parent);
	}
	public void clickonaction(){
		editactionbutton.click();
		
	}

}
