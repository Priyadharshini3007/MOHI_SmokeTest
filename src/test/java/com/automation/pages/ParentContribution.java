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

public class ParentContribution {

	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public ParentContribution()	{
		
		PageFactory.initElements(getDriver(), this);

	}

	/////////////////////// Parent contribution Elements/////////////////////

	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(linkText = "Parent Contribution")
	WebElement ParentContributionsubmenu;

	@FindBy(xpath = "//input[@id='txtFromDate']")
	WebElement paidfromdate;

	@FindBy(xpath = "//input[@id='txtToDate']")
	WebElement paidtodate;

	@FindBy(xpath = "//input[@id='Filter_DueDate']")
	WebElement duedate;

	@FindBy(xpath = "//input[@id='Filter_ReceiptNoSearch']")
	WebElement receiptfrom;

	@FindBy(xpath = "//input[@id='Filter_ReceiptNoToSearch']")
	WebElement receiptto;
	
	@FindBy(xpath = "//input[@id='Filter_Name']")
	WebElement name;
	
	@FindBy(xpath = "(//input[@name='BankDepositNo'])[1]")
	WebElement bankdepositcheckbox;
	
	@FindBy(xpath = "//button[@title='Add Bank Deposit Slip Number']")
	WebElement addbankdepositslipnumber;
	
	@FindBy(xpath = "//input[@id='BankDepositSlipNumber']")
	WebElement BankDepositSlipNumber;
	
	@FindBy(xpath ="//input[@id='DepositDate']")
	WebElement DepositDate;
	
	@FindBy(xpath ="//div[contains(@class, 'ui-dialog-buttonset')]//*[contains(@class, 'btn-primary')]")
	WebElement savebankdeposit;
	
	@FindBy(xpath ="//a[@title='Edit Bank Deposit Slip Number']")
	WebElement EditBankDepositSlipNumber;
	
	
	@FindBy(xpath ="//select[@id='Filter_SocialWorkerID']")
	WebElement socialworker;
	
	
	@FindBy(xpath ="//button[@value='GO']")
	WebElement Go;
	
	
	
	@FindBy(xpath ="//*[@id='flash']")
	WebElement message;
	

	public void ReportMenu() throws InterruptedException{
		
//		//utilities.excelutil.Excelp("C://Users//priyadharshini.s//workspace//MohiAutomation//src//test//java//utilities//Studentdetails.xlsx");
//		String path=System.getProperty("user.dir");
//		String fullPath= path + "//src//test//java//utilities//Studentdetails.xlsx";
//		utilities.excelutil.Excelp(fullPath);
		
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		
		Reportsmenu.click();
		ParentContributionsubmenu.click();
		
	}
	
	@FindBy(xpath = "//*[@id='year']")
	WebElement dueyear;
	
	public void Paidfromdate() throws InterruptedException{
		
		Select selectdueyr = new Select(dueyear);
		selectdueyr.selectByVisibleText(excelutil.getData(9, 1, 10));
		
		paidfromdate.click();
		
		String date = excelutil.getData(9,1,0);
		String monthyear , day;
		String dateArray[]=date.split("-");
		day = dateArray[0];
		monthyear=  dateArray[1] + " " + dateArray[2];   
		//String month = "July 2010";
		System.out.println(monthyear);
		System.out.println(day);

		while (true)    {  

			String text=getDriver().findElement(By.xpath("/html/body/div[28]/div[1]/table/thead/tr[2]/th[2]")).getText();

			if (text.equals(monthyear))
			{
				break;
			}
			else {
				getDriver().findElement(By.xpath("/html/body/div[28]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
		}
		//getDriver().findElement(By.xpath("/html/body/div[27]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();
		getDriver().findElement(By.xpath("(/html/body/div[28]/div[1]/table/tbody//tr//td[not(contains(@class,'disabled')) and text()="+day+"])[1]")).click();
		
		paidtodate.click();
		
		String date2 = excelutil.getData(9,1,1);
		String monthyear2 , day2 ;
		String dateArray2[]=date2.split("-");
		day2 = dateArray2[0];
		monthyear2=  dateArray2[1] + " " + dateArray2[2];   
		
		while (true)    {

			String text=getDriver().findElement(By.xpath("/html/body/div[28]/div[1]/table/thead/tr[2]/th[2]")).getText();

			if (text.equals(monthyear2))
			{
				break;
			}
			else {

				//driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[1]")).click();
				//driver.findElement(By.xpath("/html/body/div[27]/div[1]/table/thead/tr[2]/th[3]")).click();
				getDriver().findElement(By.xpath("/html/body/div[28]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
		}
		//getDriver().findElement(By.xpath("/html/body/div[27]/div[1]/table/tbody//tr//td[contains(text(),"+day2+")]")).click();
		getDriver().findElement(By.xpath("(/html/body/div[28]/div[1]/table/tbody//tr//td[not(contains(@class,'disabled')) and text()="+day2+"])[1]")).click();
		
		
		duedate.sendKeys(excelutil.getData(9,1,2));
		
		
		name.sendKeys(excelutil.getData(9,1,3));
		name.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		js1.executeScript("window.scrollBy(0,1000)");//scroll down

		js1.executeScript("window.scrollBy(1000,0)"); //Scroll right

		//js1.executeScript("window.scrollBy(0,-5000)"); 
		
		Select selectpsw = new Select(socialworker); 
		selectpsw.selectByVisibleText(excelutil.getData(9,1,6));
	
		Go.click();
		
	}
		
	public void addbankdepositnumber() throws InterruptedException{
		
		Thread.sleep(2000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
		
		js2.executeScript("window.scrollBy(0,1000)");//scroll down
		
		
		JavascriptExecutor js3= (JavascriptExecutor) getDriver();
		js3.executeScript("window.scrollBy(1000,0)"); //Scroll right

		boolean BDNum = getDriver()
				.findElements(By.xpath("(//input[@name='BankDepositNo'])[1]")).size() != 0;
		
		if(BDNum){
	
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", bankdepositcheckbox);
		
		//bankdepositcheckbox.click();
		
		addbankdepositslipnumber.click();
		
		Thread.sleep(3000);
		
		BankDepositSlipNumber.sendKeys(excelutil.getData(9,1,7));
		
		DepositDate.sendKeys(excelutil.getData(9,1,8));
		
		savebankdeposit.click();
		
		}
		
	}
		
	
	
	public void editaddbankdepositnumber() throws InterruptedException{
		JavascriptExecutor js3 = (JavascriptExecutor) getDriver();
		js3.executeScript("window.scrollBy(0,1000)");
		JavascriptExecutor js4 = (JavascriptExecutor) getDriver();
		js4.executeScript("window.scrollBy(1000,0)");
		
		
		EditBankDepositSlipNumber.click();
		
		BankDepositSlipNumber.clear();
		
		BankDepositSlipNumber.sendKeys(excelutil.getData(9,1,9));
		
		savebankdeposit.click();
		
		System.out.println(message.getText());
		
		
		
		
		
		}
		
		
}	
		

	

		

		
	
	


