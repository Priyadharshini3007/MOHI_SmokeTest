package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
      public LeavePage(){
  		PageFactory.initElements(getDriver(), this);
  	}
      
      @FindBy(xpath="//i[@class='fa fa-plus bigger-130']")
      private WebElement absenceicon;
      
      @FindBy(id="Holidays")
      private WebElement holidaynamefield;
      
      @FindBy(id="From")
      private WebElement datefrom;
      
      @FindBy(name="To")
      private WebElement todate;
      
      @FindBy(name="Repeats")
      private WebElement repeatbox;
      
      @FindBy(xpath="//button[@type='button' and @class='btn btn-primary btn-xs ui-button ui-corner-all ui-widget']")
      private WebElement savebutton;

      public void addnewholiday(){
	  JavascriptExecutor jse = (JavascriptExecutor)getDriver();
      jse.executeScript("arguments[0].click()",absenceicon);
  }
      public void addholidayname(String holidayname){
    	  holidaynamefield.sendKeys(holidayname);
      }
      public void selectingfromdate(String Fromdate){
    	  datefrom.sendKeys(Fromdate);
    	  
      }
      public void selecttodate(String Todate){
    	  todate.sendKeys(Todate);
      }
      public void selectrepeatcheckbox(){
    	  if(!repeatbox.isSelected())
    	  {
    		  repeatbox.click();
    	  }
      }
      public void saveholiday(){
    	  savebutton.click();
      }
}
