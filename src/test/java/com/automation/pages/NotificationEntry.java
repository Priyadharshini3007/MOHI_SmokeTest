package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
//import static com.utils.DriverUtils.getDriver;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;



public class NotificationEntry {

	public NotificationEntry() {

		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(linkText = "Notification Entry")
	WebElement NotificationEntrySubMenu;

	@FindBy(xpath = "//button[contains(@class, 'btn-primary right')]")
	WebElement AddNotification;

	@FindBy(xpath = "//input[@id='txtNotificationTitle']")
	WebElement NotificationTitle;

	@FindBy(xpath = "//div[@id='txtNotificationDescription']")
	WebElement NotificationDescription;

	@FindBy(xpath = "//input[@id='fileUpload']")
	WebElement FileUpload;

	@FindBy(xpath = "//button[contains(@class,'dropdown-toggle')]")
	WebElement NoneSelectedDrpdwn;

	@FindBy(xpath = "//*[@id='SaveNotification']")
	WebElement Save;

	@FindBy(xpath = "//*[@class='btn btn-default']")
	WebElement Cancel;

	@FindBy(xpath = "//*[@id='IsEnabled']")
	WebElement IsEnabled;

	@FindBy(xpath = "//*[@id='IsMandatory']")
	WebElement IsMandatory;

	@FindBy(xpath = "//*[@id='spntxtNotificationTitle']")
	WebElement ErrorNotificationTitle;

	@FindBy(xpath = "//*[@id='spntxtNotificationDescription']")
	WebElement ErrorNotificationDescription;

	@FindBy(xpath = "//*[@type='search']")
	WebElement Search;

	@FindBy(xpath = "//*[@class='red fa fa-trash bigger-130 ']")
	WebElement DeleteAttachment;
	
	@FindBy(xpath = "(//*[@class='modal-body'])[1]")
	WebElement TestNotification;
	
	@FindBy(xpath = "//*[@title='Submit']")
	WebElement SubmitNotification;
	
	@FindBy(xpath = "(//*[@class='btn stybut subbut'])[1]")
	WebElement cancelNotification;
	
	@FindBy(xpath = "//*[@id='userDropdownMenuLink']")
	WebElement menu;
	
	@FindBy(xpath = "//*[@id='navbar-collapse-nav']/ul[2]/li/span/a[2]")
	WebElement logout;
	
	
	
	
	
	

	public void NotificationEntrySubmenu() {

		NotificationEntrySubMenu.click();
	}

	public void AddNotification() {

		AddNotification.click();
	}

	public void NotificationTitlefn() {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		NotificationTitle.sendKeys(excelutil.getData(39, 1, 0));
	}

	public void NotificationDescriptionfn() {

		NotificationDescription.sendKeys(excelutil.getData(39, 1, 1));
	}

	public void Upload() {

		String pathupload = System.getProperty("user.dir");
		String fullPathupload = pathupload + "//NotificationUpload.txt";

		FileUpload.sendKeys(fullPathupload);

	}

	public void selectRolefn() {

		NoneSelectedDrpdwn.click();

		String[] chkClass = excelutil.getData(39, 1, 2).split(",");

		for (int i = 0; i < chkClass.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + chkClass[i] + "')]/input")).click();

		}

	}

	public void isEnablefn() {

		String t = excelutil.getData(39, 1, 3);
		if (t.equals("Yes")) {
			IsEnabled.click();
		}

	}

	public void isMandatoryfn() {

		String t = excelutil.getData(39, 1, 4);
		if (t.equals("Yes")) {
			IsMandatory.click();
		}

	}

	public void saveFn() {

		WebElementUtils.scrolltoview(Save);

		Save.click();

		if (this.isAlertPresent()) {
			Alert a = getDriver().switchTo().alert();
			a.accept();
			
			

		}

	}
	
	

	// Edit Notification

	public void editNotification() throws InterruptedException {
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElement getElement = getDriver().findElement(By.xpath(
				"(//*[normalize-space(text())='" + excelutil.getData(39, 7, 0) + "']/following-sibling::td[4]/a)[1]"));

		getElement.click();

	}

	public void editNotificationTitlefn() {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		WebElementUtils.waitForVisible(NotificationTitle);
		NotificationTitle.clear();
		NotificationTitle.sendKeys(excelutil.getData(39, 4, 0));
	}

	public void EditNotificationDescriptionfn() {
		NotificationDescription.clear();
		NotificationDescription.sendKeys(excelutil.getData(39, 4, 1));
	}

	public void DeleteAttachmentFn() {

		String t = excelutil.getData(39, 4, 5);

		boolean deletebutton = getDriver().findElements(By.xpath("//*[@class='red fa fa-trash bigger-130 ']"))
				.size() != 0;
		if (deletebutton) {

			DeleteAttachment.click();

			if (t.equals("Yes")) {

				String pathupload = System.getProperty("user.dir");
				String fullPathupload = pathupload + "//NotificationUpload.txt";

				FileUpload.sendKeys(fullPathupload);

			}

		}
	}

	public void editSelectRolefn() {

		WebElementUtils.scrolltoview(NoneSelectedDrpdwn);

		NoneSelectedDrpdwn.click();

		WebElement getElement = getDriver().findElement(By.xpath("//label[contains(text(),'Select all')]/input"));

		getElement.click();

		getElement.click();

		String[] chkClass = excelutil.getData(39, 4, 2).split(",");

		for (int i = 0; i < chkClass.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + chkClass[i] + "')]/input")).click();

		}

	}

	public void editIsEnablefn() {

		String t = excelutil.getData(39, 4, 3);

		if (IsEnabled.isSelected() && t.equals("No")) {
			IsEnabled.click();
		}
		if (!IsEnabled.isSelected() && t.equals("Yes")) {
			IsEnabled.click();
		}

	}

	public void editIsMandatoryfn() {

		String t = excelutil.getData(39, 4, 4);

		if (IsMandatory.isSelected() && t.equals("No")) {
			IsMandatory.click();
		}
		if (!IsMandatory.isSelected() && t.equals("Yes")) {
			IsMandatory.click();
		}

	}

	public boolean isAlertPresent() {
		try {
			getDriver().switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch
	}
	
	
	public void TestNotification() {
		
		String t = excelutil.getData(39, 1, 3);
		
		if (t.equals("Yes")) {
		
		boolean Notification = getDriver().findElements(By.xpath("(//*[@class='modal-body'])[1]"))
				.size() != 0;

		Assert.assertEquals(true, Notification);
		
		List<WebElement> chkboxlist = getDriver().findElements(By.xpath("//*[@type='checkbox']"));
		
		for (WebElement chk : chkboxlist) 
		{ 
			if(!chk.isSelected())
			{
				WebElementUtils.scrolltoview(chk);
				chk.click();
			}
		}
	}
	}
	
	
public void editTestNotification() {
		
		String t = excelutil.getData(39, 4, 3);
		
		if (t.equals("Yes")) {
		
		boolean Notification = getDriver().findElements(By.xpath("(//*[@class='modal-body'])[1]"))
				.size() != 0;

		Assert.assertEquals(true, Notification);
		
		List<WebElement> chkboxlist = getDriver().findElements(By.xpath("//*[@type='checkbox']"));
		
		for (WebElement chk : chkboxlist) 
		{ 
			if(!chk.isSelected())
			{
				WebElementUtils.scrolltoview(chk);
				chk.click();
			}
		}
	}
	}
	
	public void LogoutNotification() throws InterruptedException {
		
		String t = excelutil.getData(39, 1, 5);
		if (t.equals("Yes")) {
			SubmitNotification.click();
			Thread.sleep(2000);
			menu.click();
			logout.click();
		}
		
		else{
			
			cancelNotification.click();
			Alert a = getDriver().switchTo().alert();
			a.accept();
		}

		
	}
	
public void editLogoutNotification() throws InterruptedException {
		
		String t = excelutil.getData(39, 4, 7);
		if (t.equals("Yes")) {
			SubmitNotification.click();
			Thread.sleep(2000);
			menu.click();
			logout.click();
		}
		
		else{
			
			cancelNotification.click();
			Alert a = getDriver().switchTo().alert();
			a.accept();
		}

		
	}

	
	

}
