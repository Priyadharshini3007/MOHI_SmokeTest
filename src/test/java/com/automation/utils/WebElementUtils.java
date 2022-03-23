package com.automation.utils;

import static com.automation.utils.DriverUtils.getDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {

	static Long timeout = Long.parseLong("30");
	static WebDriverWait wait = new WebDriverWait(getDriver(), timeout);

	public static void waitForVisible(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitForPageToLoad() {
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void confirmationMsg(String message) {
		WebElement flash =getDriver().findElement(By.id("flash"));
		String flashMsg	=flash.getText();
		assertEquals(flash, flashMsg, message, true);
	}

	public static void assertEquals(String actual,String expected){
		System.out.println("Actual text is "+actual+" and expected text is "+expected);
		Assert.assertEquals(expected, actual);
	}

	public static void assertEquals(WebElement element, String actual, String expected, boolean b) {
		waitForVisible(element);
		Assert.assertTrue(String.format("Actual text is %s and expected text is %s", actual, expected), actual.contains(expected));
	}

	public static void scriptexe(){
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		// if the element is on bottom.
		js.executeScript("scroll(0, 250)");
	}
	public static void scrolltoview(){
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView()");
	}
	
	

	public static void webreuse(WebElement ele){
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].ele");
	}

	public static void scrolltobottomofpage(){
		JavascriptExecutor js = ((JavascriptExecutor) getDriver());
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void DwnldfileVerificatnFn(String filename) throws InterruptedException{
		File path = new File("C:/Users/" + System.getProperty("user.name") + "/Downloads/");
		File[] allfiles=path.listFiles();
		for(File reqfile:allfiles) {
			if(reqfile.getName().startsWith(filename)) {
				System.out.println("File is downloaded, "+reqfile);
				break;
			}
		}
	}

	public static void waitforanelement(By element)	{
		WebDriverWait wait = new WebDriverWait(getDriver(),20);
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

	public static void robotclassforscroll() throws AWTException{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static boolean isElementPresent(WebElement element) {
		if (element != null) {
			try {
				//this line checks the visibility but it's not returned. 
				//It's to perform any operation on the WebElement
				element.isDisplayed(); 
				return true;
			} catch (NoSuchElementException e) {
				return false;
			} 
		} else return false;
	}

	public static void webDriverWait(WebElement element){
		WebDriverWait wait = new WebDriverWait(getDriver(), 40);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void windowScrollDown(){
		((JavascriptExecutor)getDriver()).executeScript("window.scrollBy(0,250)");
	}

	public static void windowScrollUp(){
		((JavascriptExecutor)getDriver()).executeScript("window.scrollBy(0,-250)");
	}
	public static void scrolltoview(WebElement element){
		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("arguments[0].scrollIntoView()", element);
	}
	public static void webDriverclick(WebElement element){
		try{
			
			
//			JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
//			scrolldown.executeScript("arguments[0].scrollIntoView()", element);
			
			WebElementUtils.waitForVisible(element);
			
			JavascriptExecutor js = ((JavascriptExecutor) getDriver());
			js.executeScript("arguments[0].click()", element);
		}
		catch(Exception e){
			System.out.println("Unable to click/Element is not available-"+element);
			Assert.assertTrue(false);
		}
	}

	public static void selectFn(WebElement element,String text){
		try{
			Select select1 = new Select(element);
			select1.selectByVisibleText(text);
			
			WebElement option = select1.getFirstSelectedOption();
			String getSelectedValue = option.getText();
			System.out.println(getSelectedValue);
			
		}
		catch(Exception e){
			System.out.println("Element is not available");
			Assert.assertTrue(false);
		}
	}

	public static void dateFn(WebElement dateField) {  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = new Date(); 
		dateField.sendKeys(formatter.format(date));
		System.out.println(formatter.format(date));
	} 

	public static void elementVisible(WebElement element){
		try{
			Assert.assertEquals(true, element.isDisplayed());
			System.out.println(element.getText()+"/"+element+" is displayed");
		}
		catch(Exception e){
			System.out.println(element.getText()+"/"+element+" is not displayed");
			Assert.assertTrue(false);
		}
	}

	public static void ApprovalBtn(WebElement element){
		try{
			webDriverclick(element);
		}
		catch(Exception p){		
			System.out.println("Approval icon is not available");
			recordsVerifn();
		}
	}

	public static void recordsVerifn(){
		try{
			WebElement emptyRecord = getDriver().findElement(By.className("dataTables_empty"));
			Assert.assertEquals(true, emptyRecord.isDisplayed());
			System.out.println("No records matching");
		}
		catch(Exception p){		
			System.out.println("Record is available");
		}
	}

	public static void alertAccept(){
		try{
			Alert alertBx = getDriver().switchTo().alert();
			Thread.sleep(3000);
			System.out.println(alertBx.getText());
			alertBx.accept();
		}
		catch(Exception e){
			System.out.println("Alert box is not available");
			Assert.assertTrue(false);
		}
	}

}
