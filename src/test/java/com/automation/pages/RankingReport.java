package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.utils.Excelutilt;

public class RankingReport {
	
	public RankingReport() {
	
		PageFactory.initElements(getDriver(), this);
		}
	
	@FindBy(linkText="Reports")
	WebElement reportsmenu;
	
	@FindBy(linkText="Ranking Report")	
	WebElement rankingreport;
	
	
	@FindBy(id="DivRankingReportC")
	WebElement selectcategory;
	@FindBy(id="DivRankingReportCE")
	WebElement selectcenter;
	@FindBy(id="DivRankingReportSC")
	WebElement selectschool;
	@FindBy(id="DivRankingReportCL")
	WebElement selectclass;
	@FindBy(id="DivRankingReportT")
	WebElement selectterm;
	@FindBy(id="DivRankingReportY")
	WebElement selectyear;
	@FindBy(id="DivRankingReportE")
	WebElement selectexam;
	@FindBy(id="DivRankingReportS")
	WebElement selectsubj;
	@FindBy(id="DivRankingReportSE")
	WebElement selectsection;
	@FindBy(id="DivRankingReportCG")
	WebElement selectclassgrp;
	
	@FindBy(tagName="iframe")
    WebElement rankingFrame;
	
	
	@FindBy(id="btnDivRankingReport")
	WebElement search;
			
	@FindBy(xpath="//a[@id='ReportViewer1_ctl05_ctl04_ctl00_ButtonLink']")
	 WebElement download;
	 
	 @FindBy(xpath="//a[@title='Excel']")
	 WebElement excel;
	 
	 @FindBy(xpath="//a[@title='PDF']")
	 WebElement PDF;
	 
	 @FindBy(xpath="//a[@title='Word']")
	 WebElement Word;
	
	
	public void navigation(){
		reportsmenu.click();
		rankingreport.click();
	}
			
	public void Select_Category() throws InterruptedException{
		getDriver().switchTo().frame(rankingFrame);
		/* Excelutilt.Excelp("C:\\Users\\preethi.b\\Desktop\\MOHI\\Result entry.xlsx"); */
		Excelutilt.Excelp(".\\Result entry.xlsx");
		for(int i=1;i<=7;i++){
		//WebElement category1 = getDriver().findElement(By.xpath("/html/body/form/div[3]/div[1]/div[1]/div[1]/div/div/select"));
		//category1.click();
		selectcategory.sendKeys(Excelutilt.getData(1,i,0));
		Thread.sleep(5000);
		selectcenter.sendKeys(Excelutilt.getData(1,i,1));
		Thread.sleep(5000);
		selectschool.sendKeys(Excelutilt.getData(1,i,2));
		Thread.sleep(5000);
		selectclass.sendKeys(Excelutilt.getData(1,i,3));
		Thread.sleep(5500);
		selectterm.sendKeys(Excelutilt.getData(1,i,4));
		Thread.sleep(5500);
		selectyear.sendKeys(Excelutilt.getData(1,i,5));
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 500);
		wait.until(
				ExpectedConditions.presenceOfNestedElementsLocatedBy(By.id("DivRankingReportE"), By.tagName("option")));
		selectexam.sendKeys(Excelutilt.getData(1,i,6));
		Thread.sleep(5500);
		selectsubj.sendKeys(Excelutilt.getData(1,i,7));
		Thread.sleep(5000);
		selectsection.sendKeys(Excelutilt.getData(1,i,8));
		Thread.sleep(5000);
		selectclassgrp.sendKeys(Excelutilt.getData(1,i,9));
		Thread.sleep(5000);
		search.click();	
		Thread.sleep(5000);
		download_Excel();
		Thread.sleep(5000);
		download_PDF();
		Thread.sleep(5000);
		download_Word();
		     }
		}
	
	@FindBy(xpath = "(//*[@alt='Export drop down menu'])[1]")
	WebElement fvexportdopdownmenu;
		
		public void download_Excel() throws InterruptedException{
			
			Thread.sleep(3000);

			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript("arguments[0].click()", fvexportdopdownmenu);

			Thread.sleep(4000);

			JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
			jse1.executeScript("arguments[0].click()", excel);
			
			
		}
		
		public void download_PDF() throws InterruptedException{
			
			Thread.sleep(3000);

			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript("arguments[0].click()", fvexportdopdownmenu);

			Thread.sleep(4000);

			JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
			jse1.executeScript("arguments[0].click()", PDF);
			
			
		}
		
		public void download_Word() throws InterruptedException{
			
			Thread.sleep(3000);

			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript("arguments[0].click()", fvexportdopdownmenu);

			Thread.sleep(4000);

			JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
			jse1.executeScript("arguments[0].click()", Word);
			
			
		}
		
		

		public void switchtoDefault() throws InterruptedException {

			getDriver().switchTo().defaultContent();

		}
	        
		
	}

	
