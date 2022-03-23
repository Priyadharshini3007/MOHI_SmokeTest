package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;


public class FeeChangeRequest {
	
JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public FeeChangeRequest()	{
		
		PageFactory.initElements(getDriver(), this);

}
	
///////////////////////////FeeChangeRequestSendForClarificationAndApprovalElements//////////////////////////////////	
	
	   @FindBy(xpath="//a[text()='Change Fee Structure']")
	   WebElement ChangeFeeStructure;
	
	   @FindBy(xpath="//*[@id='TxtStudent']")
	   WebElement SearchStudentToChangeFee;
	   
	   @FindBy(xpath="//*[@id='FeeMonth']")
	   WebElement FeeStartMonth;
	
	   @FindBy(xpath="//*[@id='MonthlyFee']")
	   WebElement TutionFee;
	   
	   @FindBy(xpath="//*[@id='ExaminationFee']")
	   WebElement ExaminationFee;
	   
	   @FindBy(xpath="//*[@id='TransportFee']")
	   WebElement TransportFee;
	   
	   @FindBy(xpath="//*[@id='FeeComments']")
	   WebElement FeeComments;
	   
	   @FindBy(xpath="//*[@title='Save & Submit for Approval']")
	   WebElement SubmitAndApprovalButton;
	   
	   @FindBy(xpath="//a[contains(@href,'StudentListDetails?Filterstring=FeeChange_Appr')]")
	   WebElement FeeChangeApprovalLink;
	   
	   @FindBy(xpath="//*[contains(@class,'fas fa-exchange')]")
	   WebElement FeeChangeApprovalIcon;
	   
	   @FindBy(xpath="//*[@id='Comments']")
	   WebElement Comments;
	   
	   @FindBy(xpath="//*[@title='Send for Clarification']")
	   WebElement SendForClarificationToPreviousstepButton;
	   
	   @FindBy(xpath="//a[contains(@href,'StudentListDetails?Filterstring=FeeChange_Need_Info')]")
	   WebElement FeeChangeNeedMoreInfoLink;
	   
	   @FindBy(xpath="//*[@title='Send Clarification']")
	   WebElement SendClarificationButton;
	   
	   @FindBy(xpath="//a[contains(@href,'StudentListDetails?Filterstring=FeeChange_Send_Info')]")
	   WebElement FeeChangeReceivedMoreInformationLink;
	   
	   @FindBy(xpath="//*[@title='Approve Fee Change']")
	   WebElement FeeChangeApproveButton;
	   
	   @FindBy(xpath="//*[@id='Filter_CMFID']")
	   WebElement CMFID;
	   
	   @FindBy(xpath="//*[@id='btnSearch']")
	   WebElement SearchButton;
	   
	   @FindBy(xpath="//*[@title='Deny Fee Change']")
	   WebElement DenyButton;
	   
		@FindBy(xpath = "//*[@title='Expand Student']")
		WebElement ExpandStudent;

	   
	 
	   
	 
	   
	 
	   
	 
	   
	   public void ChangeFeeStructure() throws InterruptedException{

		   com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		   
		   ChangeFeeStructure.click();
			
	   }
	   
	   
	   public void EnterStudentNameForFeeChange() throws InterruptedException{

		   Thread.sleep(2000);
		   SearchStudentToChangeFee.sendKeys(excelutil.getData(27, 1, 0));
		   
		   
		   
		   Thread.sleep(2000);
		   SearchStudentToChangeFee.sendKeys(Keys.ARROW_DOWN);		
		   SearchStudentToChangeFee.sendKeys(Keys.ENTER);
		
	   }
	   
	   public void newFeeStructureDetails() throws InterruptedException{

			JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
			scrolldown.executeScript("window.scrollBy(0,250)");
			
			FeeStartMonth.click();
			
			
			String date = excelutil.getData(27, 1, 1);
			String month , year , day;
			String dateArray[]=date.split("-");
			day = dateArray[0];
			month=  dateArray[1] ; 
			year = dateArray[2];
			//String month = "July 2010";
			//System.out.println(monthyear);
			//System.out.println(day);

			while (true)    {

				String text=getDriver().findElement(By.xpath("/html/body/div[7]/div[2]/table/thead/tr[2]/th[2]")).getText();

				if (text.equals(year))
				{
					break;
				}
				else {

					getDriver().findElement(By.xpath("/html/body/div[7]/div[2]/table/thead/tr[2]/th[3]")).click();
				}
			}
			//getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();
			getDriver().findElement(By.xpath("/html/body/div[7]/div[2]/table/tbody/tr/td/span["+month+"]")).click();
			
			TutionFee.clear();
			
			TutionFee.sendKeys(excelutil.getData(27, 1, 2));
			
			ExaminationFee.clear();
			
			ExaminationFee.sendKeys(excelutil.getData(27, 1, 3));
			
			TransportFee.clear();
			
			TransportFee.sendKeys(excelutil.getData(27, 1, 4));
			
			FeeComments.sendKeys(excelutil.getData(27, 1, 5));
			
			SubmitAndApprovalButton.click();
			
			
}
	   
	   public void FeeChangeApprovalLink() throws InterruptedException{
		   

			webDriverclick(ExpandStudent);

			WebElementUtils.waitForVisible(FeeChangeApprovalLink);
			WebElementUtils.scrolltoview(FeeChangeApprovalLink);

		   FeeChangeApprovalLink.click();
		   
		   Thread.sleep(2000);
		   
		   CMFID.sendKeys(excelutil.getData(27, 1, 6));
		   
		   //SearchButton.click();
		   
		   JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		   jse.executeScript("arguments[0].click()",SearchButton);
		   
	   }
	   
	   public void feeChangeApprovalIcon() throws InterruptedException{
		   
		   JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		   jse.executeScript("arguments[0].click()",FeeChangeApprovalIcon);
		   
	   }
	   
	   
	   public void feeChangeSendForClarification() throws InterruptedException{
		   
		  
		   
		   JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		   scrolldown.executeScript("window.scrollBy(0,250)");
		   
		   Comments.sendKeys(excelutil.getData(27, 1, 7));
		   
		   SendForClarificationToPreviousstepButton.click();
		   
		  }
	   
	   
	   
	   public void feeChangeNeedMoreInformation() throws InterruptedException{
		   
			webDriverclick(ExpandStudent);

			WebElementUtils.waitForVisible(FeeChangeNeedMoreInfoLink);
			WebElementUtils.scrolltoview(FeeChangeNeedMoreInfoLink);

		   
		  FeeChangeNeedMoreInfoLink.click();
		  
		  Thread.sleep(2000);
		  
		  CMFID.sendKeys(excelutil.getData(27, 1, 6));
		  
		  JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		   jse.executeScript("arguments[0].click()",SearchButton);
		   
		 //SearchButton.click();
		  
		 }
	   
	   public void feeChangeSendClarification() throws InterruptedException{
		   
		  
		   
		   JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		   scrolldown.executeScript("window.scrollBy(0,250)");
		   
		   Comments.sendKeys(excelutil.getData(27, 1, 7));
		   
		   SendClarificationButton.click();
		   
		  }
	   
	 
	   
	   
	   public void feeChangeReceivedMoreInformation() throws InterruptedException{
		   
		   webDriverclick(ExpandStudent);

			WebElementUtils.waitForVisible(FeeChangeReceivedMoreInformationLink);
			WebElementUtils.scrolltoview(FeeChangeReceivedMoreInformationLink);
		   
		   FeeChangeReceivedMoreInformationLink.click();
		   Thread.sleep(2000);
		  
		  CMFID.sendKeys(excelutil.getData(27, 1, 6));
		  
		  JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		   jse.executeScript("arguments[0].click()",SearchButton);
		   
		  //SearchButton.click();
		  
		 }
	 
	   
	 
	   public void feeChangeApprove() throws InterruptedException{
		   
		  
		   
		   JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		   scrolldown.executeScript("window.scrollBy(0,250)");
		   
		   Comments.sendKeys(excelutil.getData(27, 1, 7));
		   
		   FeeChangeApproveButton.click();
		   
		  }
	   
	   public void feeChangeDenied() throws InterruptedException{
		   
		  
		   
		   JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		   scrolldown.executeScript("window.scrollBy(0,250)");
		   
		   Comments.sendKeys(excelutil.getData(27, 1, 7));
		   
		   DenyButton.click();
		   
		   Alert a = getDriver().switchTo().alert();
			a.accept();
		   
		  }
	 
	   
	
	
}
