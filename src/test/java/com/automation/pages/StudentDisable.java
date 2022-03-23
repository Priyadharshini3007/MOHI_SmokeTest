package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class StudentDisable {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public StudentDisable() {

		PageFactory.initElements(getDriver(), this);

	}

	//////////////////////////////////// StudentDisableElements////////////////////////////////////////////

	@FindBy(xpath = "//*[@id='Filter_CMFID']")
	WebElement CMFID;

	@FindBy(xpath = "//*[@id='btnSearch']")
	WebElement SearchButton;

	@FindBy(xpath = "(//*[@title='Disable this student'])[1]")
	WebElement Disableicon;

	@FindBy(xpath = "//*[@id='ChildDisableID']")
	WebElement Disablereason;

	@FindBy(xpath = "//*[@id='Comments']")
	WebElement Comments;

	@FindBy(xpath = "//*[@class='btn btn-primary btn-xs ui-button ui-corner-all ui-widget']")
	WebElement SaveButton;

	@FindBy(xpath = "//*[@title='Close']")
	WebElement close;

	public void Disableicon() throws InterruptedException {

		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", Disableicon);

	}

	public void DisableReason() throws InterruptedException {

		try {
		Select selDisbleReason = new Select(Disablereason);
		selDisbleReason.selectByVisibleText(excelutil.getData(28, 1, 4));

		Comments.sendKeys(excelutil.getData(28, 1, 5));

		Thread.sleep(3000);

		SaveButton.click();

		} catch (Exception e) {
			System.out.println("Already Saved");
		}
		
		//close.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", close);


	}


}
