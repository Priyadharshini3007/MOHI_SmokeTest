package com.automation.pages;
import java.util.Set;

import static com.automation.utils.DriverUtils.getDriver;

import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import utilities.excelutil;

import com.automation.utils.excelutil;


public class StudentReport {

	

JavascriptExecutor js = (JavascriptExecutor) getDriver();
    
	public StudentReport()	{
		
		PageFactory.initElements(getDriver(), this);
	}


	///////////////////////////////////// student report page
	///////////////////////////////////// elements///////////////////////////////////////////StTestReport
	@FindBy(linkText = "Reports")
	WebElement Reportsmenu;

	@FindBy(xpath = "//a[contains(@class,'dropdown-item') and contains(@href,'/Student/StudentListDetails')]")
	WebElement Studentsubmenu;

	@FindBy(xpath = "//button[@id='submitButton']")
	WebElement gobutton;

	@FindBy(xpath = "//input[@id='Filter_FirstName']")
	WebElement enterstudenttoviewthereport;

	@FindBy(xpath = "//*[@title='View Student Profile']")
	WebElement studentprofileicon;

	@FindBy(xpath = "(//*[@title='View Recruitment Approval'])[1]")
	WebElement recruitmentapprovalicon;

	@FindBy(xpath = "(//*[@title='View student family visit history'])[1]")
	WebElement familyvisiticon;

	// @FindBy(xpath = "(//*[@title='Approve/Deny student fee change
	// request'])[1]")
	// WebElement feechangerequesticon;

	@FindBy(xpath = "(//*[@title='View Pull out workFlow'])[1]")
	WebElement pullouticon;

	@FindBy(xpath = "(//*[@title='View Re-admission workFlow'])[1]")
	WebElement readmissionicon;

	@FindBy(xpath = "(//*[@title='View Student Rank Report'])[1]")
	WebElement rankreporticon;

	@FindBy(xpath = "(//*[@title='View Child Gift Details'])[1]")
	WebElement giftdetailicon;

	@FindBy(xpath = "//input[@id='btnStudentRankReport']")
	WebElement viewreporticon;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/div/div/div/div/iframe")
	WebElement viewreportframe;

	@FindBy(xpath = "(//*[@title='Student Fee Deposit'])[1]")
	WebElement FeeDepositicon;

	@FindBy(xpath = "(//*[@title='View Fee change workFlow'])[1]")
	WebElement FeeChangeicon;

	@FindBy(xpath = "(//*[@title='View Promotion/Detainment/Section change workflow'])[1]")
	WebElement sectionchangeicon;

	@FindBy(xpath = "(//*[@title='View student was not given the birth Certificate number'])[1]")
	WebElement notgivenbirthcertificate;

	@FindBy(xpath = "//input[@id='Filter_CMFID']")
	WebElement CMFID;

	@FindBy(xpath = "(//*[@title='Disable this student'])[1]")
	WebElement disablestudenticon;

	@FindBy(xpath = "(//*[@title='Update CMF Photo Schedule'])[1]")
	WebElement CMFPhotoScheduleicon;

	@FindBy(xpath = "//input[@id='PhotoScheduleDate']")
	WebElement CMFPhotoScheduledateicon;

	@FindBy(xpath = "//div[contains(@class, 'ui-dialog-buttonset')]//button[contains(@class, 'btn-xs')]")
	WebElement cancelbutton;

	@FindBy(xpath = "//div[contains(@class, 'ui-dialog-buttonset')]//button[contains(@class, 'btn-primary')]")
	WebElement savebutton;

	public void studentreportmenu() throws InterruptedException {

		Reportsmenu.click();
		Studentsubmenu.click();
		Thread.sleep(3000);

	}

	public void gobutton() throws InterruptedException {

		gobutton.click();

	}

	public void studentprofilereport() throws InterruptedException {

		/*String path = System.getProperty("user.dir");
		String fullPath = path + "//src//test//java//utilities//Studentdetails.xlsx";
		Excelutilt.Excelp(fullPath);*/

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		
		Thread.sleep(2000);
		enterstudenttoviewthereport.sendKeys(excelutil.getData(10, 1, 0));

		enterstudenttoviewthereport.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		try{
			if(studentprofileicon.isDisplayed()){
				JavascriptExecutor jse = (JavascriptExecutor) getDriver();
				jse.executeScript("arguments[0].click()", studentprofileicon);
				Thread.sleep(3000);
				getDriver().navigate().back();
			}
		}
		catch(Exception e){
			System.out.println("Student Profile icon is not available for this student");
		}

		
		
		
	}

	public void sectionChangeReport() throws InterruptedException {
		Thread.sleep(2000);
		
		try{
			if(sectionchangeicon.isDisplayed()){
				JavascriptExecutor jse11 = (JavascriptExecutor) getDriver();
				jse11.executeScript("arguments[0].click()", sectionchangeicon);
				Thread.sleep(3000);
				getDriver().navigate().back();
			}
		}
		catch(Exception e){
			System.out.println("Section Change icon is not available for this student");
		}

		

		
	}

	public void feeChangeReport() throws InterruptedException {
		Thread.sleep(2000);
		
		try{
			if(FeeChangeicon.isDisplayed()){
				JavascriptExecutor jse10 = (JavascriptExecutor) getDriver();
				jse10.executeScript("arguments[0].click()", FeeChangeicon);
				Thread.sleep(3000);
				getDriver().navigate().back();
			}
		}
		catch(Exception e){
			System.out.println("FeeChange icon is not Available for this student");
		}


}

	public void feeDepositReport() throws InterruptedException {
		Thread.sleep(2000);
		
		try{
			if(FeeDepositicon.isDisplayed()){
				JavascriptExecutor jse9 = (JavascriptExecutor) getDriver();
				jse9.executeScript("arguments[0].click()", FeeDepositicon);
				Thread.sleep(3000);
				getDriver().navigate().back();

			}
		}
		catch(Exception e){
			System.out.println("FeeDeposit icon is not available for this student");
		}

		
		
	}

	public void giftReport() throws InterruptedException {
		Thread.sleep(2000);

		
		try{
			if(giftdetailicon.isDisplayed()){
				JavascriptExecutor jse8 = (JavascriptExecutor) getDriver();
				jse8.executeScript("arguments[0].click()", giftdetailicon);
				Thread.sleep(3000);
				getDriver().navigate().back();
			}
		}
		catch(Exception e){
			System.out.println("giftdetailicon is not available for this student");
		}
		
}

	public void rankReport() throws InterruptedException {
		Thread.sleep(2000);
		
		try{
			if(rankreporticon.isDisplayed()){
				JavascriptExecutor jse7 = (JavascriptExecutor) getDriver();
				jse7.executeScript("arguments[0].click()", rankreporticon);
				Thread.sleep(3000);
				
				String mainWindow = getDriver().getWindowHandle();
				// It returns no. of windows opened by WebDriver and will return Set of
				// Strings
				Set<String> set = getDriver().getWindowHandles();
				// Using Iterator to iterate with in windows
				Iterator<String> itr = set.iterator();
				while (itr.hasNext()) {
					String childWindow = itr.next();
					// Compare whether the main windows is not equal to child window. If
					// not equal, we will close.
					if (!mainWindow.equals(childWindow)) {
						getDriver().switchTo().window(childWindow);

						getDriver().switchTo().frame(viewreportframe);
						viewreporticon.click();
						Thread.sleep(6000);
						getDriver().close();
					}
				}
				
				// This is to switch to the main window
				
				getDriver().switchTo().window(mainWindow);
			}
		}
		catch(Exception e){
			System.out.println("Rank Report icon is not available for this student");
		}

}

	public void readmissionReport() throws InterruptedException {
		Thread.sleep(2000);
		
		try{
			if(readmissionicon.isDisplayed()){
				JavascriptExecutor jse6 = (JavascriptExecutor) getDriver();
				jse6.executeScript("arguments[0].click()", readmissionicon);

				Thread.sleep(3000);
				
				getDriver().navigate().back();
			}
		}
		catch(Exception e){
			System.out.println("Readmission icon is not available for this student");
		}

		
}

	public void pulloutReport() throws InterruptedException {
		Thread.sleep(2000);
		
		try{
			if(pullouticon.isDisplayed()){
				JavascriptExecutor jse5 = (JavascriptExecutor) getDriver();
				jse5.executeScript("arguments[0].click()", pullouticon);

				Thread.sleep(3000);
				getDriver().navigate().back();
			}
		}
		catch(Exception e){
			System.out.println("Pullout icon is not available for this student");
		}

}

	public void familVisitReport() throws InterruptedException {
		Thread.sleep(2000);

		
		try{
			if(familyvisiticon.isDisplayed()){
				JavascriptExecutor jse3 = (JavascriptExecutor) getDriver();
				jse3.executeScript("arguments[0].click()", familyvisiticon);

				Thread.sleep(3000);
				getDriver().navigate().back();

			}
		}
		catch(Exception e){
			System.out.println("Family visit icon is not available for this student");
		}
		
		
	}

	public void recruitmentApprovalReport() throws InterruptedException {
		Thread.sleep(2000);
		try{
			if(recruitmentapprovalicon.isDisplayed()){
				JavascriptExecutor jse2 = (JavascriptExecutor) getDriver();
				jse2.executeScript("arguments[0].click()", recruitmentapprovalicon);

				Thread.sleep(3000);
				getDriver().navigate().back();
			}
		}
		catch(Exception e){
			System.out.println("Recruitment Approval icon is not available for this student");
		}
		
		
}

	public void birthcertificatenumber() throws InterruptedException {
		/*String path = System.getProperty("user.dir");
		String fullPath = path + "//src//test//java//utilities//Studentdetails.xlsx";
		Excelutilt.Excelp(fullPath);*/
		
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
			
		Thread.sleep(2000);
		CMFID.sendKeys(excelutil.getData(10, 1, 1));

		CMFID.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		try{
			if(notgivenbirthcertificate.isDisplayed()){

				Thread.sleep(2000);
				JavascriptExecutor jse = (JavascriptExecutor) getDriver();
				jse.executeScript("arguments[0].click()", notgivenbirthcertificate);

				Thread.sleep(3000);
				getDriver().navigate().back();

			}
		}
		catch(Exception e){
			System.out.println("notgivenbirthcertificate icon is not available for this student");
		}

		
		

	}

	public void disablestudent() throws InterruptedException {
	/*	String path = System.getProperty("user.dir");
		String fullPath = path + "//src//test//java//utilities//Studentdetails.xlsx";
		Excelutilt.Excelp(fullPath);
		
	
*/
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		
		Thread.sleep(2000);
		CMFID.sendKeys(excelutil.getData(10, 1, 2));

		CMFID.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		try{
			if(disablestudenticon.isDisplayed()){
				
				Thread.sleep(2000);
				JavascriptExecutor jse = (JavascriptExecutor) getDriver();
				jse.executeScript("arguments[0].click()", disablestudenticon);

				Thread.sleep(3000);
				cancelbutton.click();
				

			}
		}
		catch(Exception e){
			System.out.println("Disable student icon is not available for this student");
		}
	

		
	}

	public void photoschedulereport() throws InterruptedException {
	/*	String path = System.getProperty("user.dir");
		String fullPath = path + "//src//test//java//utilities//Studentdetails.xlsx";
		Excelutilt.Excelp(fullPath);*/
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		
		Thread.sleep(2000);
		
		CMFID.clear();
		
		
		CMFID.sendKeys(excelutil.getData(10, 1, 3));

		CMFID.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		try{
			if(CMFPhotoScheduleicon.isDisplayed()){
				
				Thread.sleep(2000);
				
				JavascriptExecutor jse = (JavascriptExecutor) getDriver();
				jse.executeScript("arguments[0].click()", CMFPhotoScheduleicon);

				CMFPhotoScheduledateicon.clear();
				CMFPhotoScheduledateicon.sendKeys(excelutil.getData(10, 1, 4));

				Thread.sleep(3000);
				
				savebutton.click();

				getDriver().navigate().back();
			}
		}
		catch(Exception e){
			System.out.println("CMFPhotoSchedule icon is not available for this student");
		}

}

}
