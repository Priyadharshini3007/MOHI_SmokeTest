package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class StudentUpload {

	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public StudentUpload()	{
	
		PageFactory.initElements(getDriver(), this);
	}

	/////////////////////////////////////Student Upload Steps/////////////////////////////

	@FindBy(xpath="//a[contains(@href,'StudentListDetails?Filterstring=CMFPhotoDate')]")
	WebElement CMFPhotoscheduledtodaylink;
	        
	@FindBy(xpath="//input[@id='Filter_FirstName']")
	WebElement EnterTheStdentNameToUpload;
	
	@FindBy(xpath="//*[@id='Filter_CMFID']")
	WebElement CMFID;
	
	

	@FindBy(xpath="//a[@title='View Student Profile']")
	WebElement ViewStudentProfileIcon;

	@FindBy(xpath="//a[@title='Upload CMF Photo']")
	WebElement UploadCMFPhotolink;

	@FindBy(xpath="//input[@id='CMFPhotoUpload']")
	WebElement ChooseFileButton;


	@FindBy(xpath ="//div[contains(@class, 'ui-dialog-buttonset')]//button[contains(@class, 'btn-primary')]")
	WebElement Uploadbutton;




	/////////////////////Update Photo schedule//////////////////////////////////////////

	@FindBy(xpath="//a[text()='Update Photo Schedules']")
	WebElement updatephotoschedulelink;

	@FindBy(xpath="//a[@title='Update CMF Photo Schedule']")
	WebElement cameraicon;
	

	
	@FindBy(xpath="//div[contains(@class, 'ui-dialog-buttonset')]//button[contains(@class, 'btn-primary')]")
	WebElement SaveTheUpdatedDate;
	
	@FindBy(xpath="//a[text()='Dashboard']")
	WebElement Mydashboard;
	
	@FindBy(xpath="//a[(text()='My Dashboard')]")
	WebElement Mydashboardsubmenu;
	
	@FindBy(xpath="//input[@id='PhotoScheduleDate']")
	WebElement EnterTheDate;
	
	@FindBy(xpath = "//*[@title='Expand Student']")
	WebElement ExpandStudent;

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void CMFphotoscheduletodaylink() throws InterruptedException{

		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		
		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(CMFPhotoscheduledtodaylink);

		WebElementUtils.scrolltoview(CMFPhotoscheduledtodaylink);
		CMFPhotoscheduledtodaylink.click();
		}
		
		catch (Exception e){
			
			System.out.println("CMF Photo Schedule today link is not available");
		}
	}


	public void enterthestudentnametoupload() throws InterruptedException{
		
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(5, 1, 2));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
		
		}
		
		catch (Exception e){
			
			System.out.println("Student is not available");
		}

	}
	
public void uploadStnNameToVfyMonthlyFee() throws InterruptedException{
		
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 12, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
		
		}
		
		catch (Exception e){
			
			System.out.println("Student is not available");
		}

	}

public void uploadStnNameToVfyTermlyFee() throws InterruptedException{
	
	try{
	com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 16, 0));
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
	EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
	
	}
	
	catch (Exception e){
		
		System.out.println("Student is not available");
	}

}

public void uploadStnNameToVfyPerFamilyMonthlyFeePreRequiste() throws InterruptedException{
	
	try{
	com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 32, 0));
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
	EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
	
	}
	
	catch (Exception e){
		
		System.out.println("Student is not available");
	}

}

public void uploadStnNameToVfyPerFamilyTermlyFeePreRequiste() throws InterruptedException{
	
	try{
	com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 38, 0));
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
	EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
	
	}
	
	catch (Exception e){
		
		System.out.println("Student is not available");
	}

}

public void uploadStnNameToVfyPerFamilyTermlyFee() throws InterruptedException{
	
	try{
	com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 40, 0));
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
	EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
	
	}
	
	catch (Exception e){
		
		System.out.println("Student is not available");
	}

}

public void uploadStnNameToVfyMaleMonthlyFee() throws InterruptedException{
	
	try{
	com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 56, 0));
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
	EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
	
	}
	
	catch (Exception e){
		
		System.out.println("Student is not available");
	}

}

public void uploadStnNameToVfyMaleTermlyFee() throws InterruptedException{
	
	try{
	com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 62, 0));
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
	EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
	
	}
	
	catch (Exception e){
		
		System.out.println("Student is not available");
	}

}

public void uploadStnNameToVfyFemaleMonthlyFee() throws InterruptedException{
	
	try{
	com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 58, 0));
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
	EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
	
	}
	
	catch (Exception e){
		
		System.out.println("Student is not available");
	}

}


public void uploadStnNameToVfyFemaleTermlyFee() throws InterruptedException{
	
	try{
	com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 64, 0));
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
	EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
	
	}
	
	catch (Exception e){
		
		System.out.println("Student is not available");
	}

}

public void uploadStnNameToVfyElderMonthlyFee() throws InterruptedException{
	
	try{
	com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 74, 0));
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
	EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
	
	}
	
	catch (Exception e){
		
		System.out.println("Student is not available");
	}

}

public void uploadStnNameToVfyYoungerMonthlyFee() throws InterruptedException{
	
	try{
	com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 76, 0));
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
	EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
	
	}
	
	catch (Exception e){
		
		System.out.println("Student is not available");
	}

}

public void uploadStnNameToVfyPerFamilyMonthlyFee() throws InterruptedException{
	
	try{
	com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 34, 0));
	Thread.sleep(3000);
	EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
	EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].click()",ViewStudentProfileIcon);
	
	}
	
	catch (Exception e){
		
		System.out.println("Student is not available");
	}

}


	public void UploadCMFPhotolink() throws InterruptedException{
		
		try{
		Thread.sleep(3000);
		UploadCMFPhotolink.click();
		}
		
		catch (Exception e){
			
			System.out.println("Upload CMF Photo Link is not available");
		}
	}



	public void ChooseFile() throws InterruptedException{
	
		try{
		String pathupload=System.getProperty("user.dir");

        String fullPathupload= pathupload + "//Images//1.jpg";
		ChooseFileButton.sendKeys(fullPathupload);
		Uploadbutton.click();
		}
		
		catch (Exception e){
		
			System.out.println("Upload button is not available");
		}


	}

	//Update photo schedule methods

	//updatephotoschedulelink

	public void UpdatePhotoscheduleLink() throws InterruptedException{
		
		try{

		updatephotoschedulelink.click();
		
		}
		
		catch (Exception e){
			
			System.out.println("Update Photo schedule Link is not available");
		}
	}

	//cameraicon;


	public void ClickTheCameraIcon() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(5, 1, 2));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	public void ClickTheCameraIconToVerifyMonthlyFee() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 12, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	
	public void ClickTheCameraIconToVerifyTermlyFee() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 16, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	public void ClickTheCameraIconToVerifyPerFamilyMonthlyFee() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 34, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	public void uploadToVerifyPerFamilyMonthlyPreRequiste() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 32, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	public void updateToVerifyPerFamilyTermlyPreRequiste() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 38, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	

	public void updateToVerifyPerFamilyTermly() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 40, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	public void updateToVerifyMaleMonthly() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 56, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	public void updateToVerifyMaleTermly() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		//EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 62, 0));
		CMFID.sendKeys(BaseClass.cmfID);
		Thread.sleep(3000);
		//EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	public void updateToVerifyFemaleMonthly() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 58, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	public void updateToVerifyFemaleTermly() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 64, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	public void updateToVerifyElderMonthly() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 74, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	public void updateToVerifyYoungerMonthly() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 76, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	public void uploadToVerifyPerFamilyMonthly() throws InterruptedException{
		try{
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(excelutil.getData(38, 34, 0));
		Thread.sleep(3000);
		EnterTheStdentNameToUpload.sendKeys(Keys.ARROW_DOWN);		
		EnterTheStdentNameToUpload.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].click()",cameraicon);
		
		EnterTheDate.click();
		getDriver().findElement(By.xpath("//td[@class='today day']")).click();
		}
		
		catch (Exception e){
			
			System.out.println("Camera icon is not available");
		}
		
	}
	
	
	//SaveTheUpdatedDate;
	
	public void SaveTheUpdatedDate() throws InterruptedException{

		try{
		SaveTheUpdatedDate.click();
		}
		
		catch(Exception e){
			
			System.out.println("Save is Not Available");
		}
		
		
	}
	
	
	//Mydashboard
	
	public void MyDashboard() throws InterruptedException{
		Thread.sleep(5000);

		Mydashboard.click();
		Thread.sleep(5000);
		Mydashboardsubmenu.click();
	}
	
	}