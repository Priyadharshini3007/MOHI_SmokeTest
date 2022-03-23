package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.ExcelLib;
import com.automation.utils.ExcelUtils;
import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;




public class UsersPage extends ExcelLib {
	public UsersPage() {
        PageFactory.initElements(getDriver(), this);
    }
	 
	 ExcelUtils UT=new ExcelUtils();
	 
	   @FindBy(xpath="//a[contains(text(),'Add User')]")
	   private WebElement Adduserbtn;
	   
	   @FindBy(xpath="//input[@name='FirstName']")
	   private WebElement Firstname;
	   
	   @FindBy(xpath="//input[@name='MiddleName']")
	   private WebElement Middlename;
	   
	   @FindBy(xpath="//input[@name='LastName']")
	   private WebElement Lastname;
	   
	   @FindBy(xpath="//select[@name='CompanyID']")
	   private WebElement Country;
	   
	   @FindBy(xpath="//select[@name='OrganizationID']")
	   private WebElement centreName;
	   
	   @FindBy(xpath="//select[@name='DesignationID']")
	   private WebElement Designation;
	   
	   @FindBy(xpath="//input[@name='Title']")
	   private WebElement Title;
	   
	   @FindBy(xpath="//input[@name='Address1']")
	   private WebElement AddressField;
	   
	   @FindBy(xpath="//input[@name='Address2']")
	   private WebElement AddressField2;
	   
	   @FindBy(xpath="//input[@name='City']")
	   private WebElement CityField;
	   
	   @FindBy(xpath="//input[@name='State']")
	   private WebElement StateField;
	   
	   @FindBy(xpath="//input[@name='Zip']")
	   private WebElement ZipField;
	   
	   @FindBy(xpath="//input[@name='Phone']")
	   private WebElement PhoneNumberField;
	   
	   @FindBy(xpath="//input[@name='ReportingUserName']")
	   private WebElement reportingName;
	   
	   @FindBy(id="Username")
	   private WebElement userName;
	   
	   @FindBy(id="Email")
	   private WebElement EmailaddressField;
	   
	   @FindBy(xpath="//i[@class='fa fa-save']")
	   private WebElement Submitbtn;
	   
	   @FindBy(xpath="//a[contains(text(),'User List')]")
	   private WebElement aftersavereturntoList;
	   
	   @FindBy(xpath="//button[@class='btn btn-default btn-sm returntolist']")
	   private WebElement errorsavereturntolist;
	   
	   @FindBy(xpath="//div[@id='flash']")
	   private WebElement errortext;
	   
	   @FindBy(xpath="//*[@id='Filter_Username']")
	   private WebElement enterUserToEdit;
	   
	   @FindBy(xpath="//*[@id='btnSearch']")
	   private WebElement SearchButton;
	   
	   @FindBy(xpath="//a[@title='Click here to edit Reporting User']")
	   private WebElement EditReportingUser;
	   
	   @FindBy(xpath="//*[@id='Filter_Status']")
	   private WebElement FilterStatus;
	   
	   @FindBy(xpath="//td[contains(text(),'administration@mohiafrica.org')]/following-sibling::td[6]")
	   private WebElement ReadStatus;
	   
	   @FindBy(xpath="//*[@class='btn btn-default btn-sm returntolist']")
	   private WebElement ReturnToList;
	   
	   @FindBy(xpath="(//*[@title='Edit User'])[1]")
	   private WebElement EditUSerIcon;
	   
	   @FindBy(xpath="//*[@class='table-grid grid']")
	   private WebElement Table;
	   
	   @FindBy(xpath="//*[@title='Delete this user']")
	   private WebElement Deleteicon;
	   
	   @FindBy(xpath="(//*[@class='blue'])[2]")
	   private WebElement ZeroRecords;
	   
	   @FindBy(xpath="//*[@id='flash']")
	   private WebElement FlashMessage;
	   
	   @FindBy(xpath="(//*[@class='table-grid grid']//td[2])[1]")
	   private WebElement DefaultRole;
	   
	   @FindBy(xpath="//*[@class='grid']//tr//td[2]")
	   private WebElement DeleteDefaultRole;
	   
	   @FindBy(xpath="//*[@title='Delete this Role']")
	   private WebElement DeleteRole;
	   
	  @FindBy(xpath="//*[@class='grid']//td//select")
	   private WebElement table1;
	  
	  @FindBy(xpath="//*[@id='Id_Role']")
	   private WebElement RoleDropDown;
	  
	  @FindBy(xpath="//*[@id='AddNewUserRole']")
	   private WebElement AddnewRoleButton;
	  
	  @FindBy(xpath="//*[@id='Status']")
	   private WebElement StatusDropdown;
	

	   public void adduser(){
		   Adduserbtn.click();
	   }
	   
	 
	   
	   public void enteruserdetails(String FirstName,String LastName){
		   Firstname.sendKeys(FirstName);
		   Lastname.sendKeys(LastName);
		   
	   }
	   public void addsocialworker() throws IOException{
		   String sfirstname=ExcelLib.getExcelData("UserDetails", 1, 0);
		   String slastname=ExcelLib.getExcelData("UserDetails", 1, 1);
		   String scenter=ExcelLib.getExcelData("UserDetails", 1, 2);
		   String sdesignation=ExcelLib.getExcelData("UserDetails", 1, 3);
		   String sTitle=ExcelLib.getExcelData("UserDetails", 1, 4);
		   String sAddress=ExcelLib.getExcelData("UserDetails", 1, 5);
		   String scity=ExcelLib.getExcelData("UserDetails", 1, 6);
		   String sState=ExcelLib.getExcelData("UserDetails", 1, 7);
		   String sZip=ExcelLib.getExcelData("UserDetails", 1, 8);
		   String sPhone=ExcelLib.getExcelData("UserDetails", 1, 9);
		   String sReportinguser=ExcelLib.getExcelData("UserDetails", 1, 10);
		   String susername=ExcelLib.getExcelData("UserDetails", 1, 11);
		   String Email=ExcelLib.getExcelData("UserDetails", 1, 12);
		   
		   Firstname.sendKeys(sfirstname);
		   Lastname.sendKeys(slastname);
		   centreName.sendKeys(scenter);
		   Designation.sendKeys(sdesignation);
		   Title.sendKeys(sTitle);
		   AddressField.sendKeys(sAddress);
		   CityField.sendKeys(scity);
		   StateField.sendKeys(sState);
		   ZipField.sendKeys(sZip);
		   PhoneNumberField.sendKeys(sPhone);
		   reportingName.sendKeys(sReportinguser);
		   userName.sendKeys(susername);
		   EmailaddressField.sendKeys(Email);
		   
		   
	   }
	   
	   public void clicksubmitbtn() throws Exception{
		   ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", Submitbtn);
		   Thread.sleep(500); 
		   WebElementUtils.waitForVisible(Submitbtn);
		   //WebElementUtils.waitForElement1(Submitbtn);
		   Actions action=new Actions(getDriver());
		   action.moveToElement(Submitbtn).click().perform();
		   Thread.sleep(3000);
		  String exp="User information saved and Email has been sent to the User. The default role has been set for this user. Please add more roles if needed.";
		  String text=errortext.getText();
		   Assert.assertEquals(text,exp);
		   
		   
     }
	   public void clickEditsubmitbtn() throws Exception{
		   ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", Submitbtn);
		   Thread.sleep(500); 
		   WebElementUtils.waitForVisible(Submitbtn);
		   //WebElementUtils.waitForElement1(Submitbtn);
		   Actions action=new Actions(getDriver());
		   action.moveToElement(Submitbtn).click().perform();
		   Thread.sleep(3000);
		  String exp="User information saved.";
		  String text=errortext.getText();
		   Assert.assertEquals(text,exp);
		   
		   
     }
	   
	   
	   
	   public void backtouserlist(){
		   
		   
		   if(aftersavereturntoList.isDisplayed()){
			   JavascriptExecutor jse = (JavascriptExecutor)getDriver();
				jse.executeScript("arguments[0].click()", aftersavereturntoList);
			}
			else{
				errorsavereturntolist.click();
				
			}
		   //aftersavereturntoList.click();
		   //JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			//jse.executeScript("arguments[0].click()", aftersavereturntoList);
	   }
	
	   public void addHeadTeacher() throws IOException{
		   String sfirstname=ExcelLib.getExcelData("UserDetails", 2, 0);
		   String slastname=ExcelLib.getExcelData("UserDetails", 2, 1);
		   String scenter=ExcelLib.getExcelData("UserDetails", 2, 2);
		   String sdesignation=ExcelLib.getExcelData("UserDetails", 2, 3);
		   String sTitle=ExcelLib.getExcelData("UserDetails", 2, 4);
		   String sAddress=ExcelLib.getExcelData("UserDetails", 2, 5);
		   String scity=ExcelLib.getExcelData("UserDetails", 2, 6);
		   String sState=ExcelLib.getExcelData("UserDetails", 2, 7);
		   String sZip=ExcelLib.getExcelData("UserDetails", 2, 8);
		   String sPhone=ExcelLib.getExcelData("UserDetails", 2, 9);
		   String sReportinguser=ExcelLib.getExcelData("UserDetails", 2, 10);
		   String susername=ExcelLib.getExcelData("UserDetails", 2, 11);
		   String Email=ExcelLib.getExcelData("UserDetails", 2, 12);
		   
		   Firstname.sendKeys(sfirstname);
		   Lastname.sendKeys(slastname);
		   centreName.sendKeys(scenter);
		   Designation.sendKeys(sdesignation);
		   Title.sendKeys(sTitle);
		   AddressField.sendKeys(sAddress);
		   CityField.sendKeys(scity);
		   StateField.sendKeys(sState);
		   ZipField.sendKeys(sZip);
		   PhoneNumberField.sendKeys(sPhone);
		   reportingName.sendKeys(sReportinguser);
		   userName.sendKeys(susername);
		   EmailaddressField.sendKeys(Email);
		   
		   
	   }
	   //ExcelUtils UT=new ExcelUtils();
	   public void socialworker() throws IOException{
		   List<String> exceldata = UT.GetUser("Social Worker");
		   Firstname.sendKeys(exceldata.get(1));
		   Lastname.sendKeys(exceldata.get(2));
		   centreName.sendKeys(exceldata.get(3));
		   Designation.sendKeys(exceldata.get(4));
		   Title.sendKeys(exceldata.get(5));
		   AddressField.sendKeys(exceldata.get(6));
		   CityField.sendKeys(exceldata.get(7));
		   StateField.sendKeys(exceldata.get(8));
		   ZipField.sendKeys(exceldata.get(9));
		   PhoneNumberField.sendKeys(exceldata.get(10));
		   reportingName.sendKeys(exceldata.get(11));
		   userName.sendKeys(exceldata.get(12));
		   EmailaddressField.sendKeys(exceldata.get(13));
		   
	   }
	   public void headteacher() throws IOException{
		   List<String> exceldata = UT.GetUser("Head Teacher");
		   Firstname.sendKeys(exceldata.get(1));
		   Lastname.sendKeys(exceldata.get(2));
		   centreName.sendKeys(exceldata.get(3));
		   Designation.sendKeys(exceldata.get(4));
		   Title.sendKeys(exceldata.get(5));
		   AddressField.sendKeys(exceldata.get(6));
		   CityField.sendKeys(exceldata.get(7));
		   StateField.sendKeys(exceldata.get(8));
		   ZipField.sendKeys(exceldata.get(9));
		   PhoneNumberField.sendKeys(exceldata.get(10));
		   reportingName.sendKeys(exceldata.get(11));
		   userName.sendKeys(exceldata.get(12));
		   EmailaddressField.sendKeys(exceldata.get(13));
		   
	   }
	   public void classteacher() throws IOException{
		   List<String> exceldata = UT.GetUser("Class Teacher");
		   Firstname.sendKeys(exceldata.get(1));
		   Lastname.sendKeys(exceldata.get(2));
		   centreName.sendKeys(exceldata.get(3));
		   Designation.sendKeys(exceldata.get(4));
		   Title.sendKeys(exceldata.get(5));
		   AddressField.sendKeys(exceldata.get(6));
		   CityField.sendKeys(exceldata.get(7));
		   StateField.sendKeys(exceldata.get(8));
		   ZipField.sendKeys(exceldata.get(9));
		   PhoneNumberField.sendKeys(exceldata.get(10));
		   reportingName.sendKeys(exceldata.get(11));
		   userName.sendKeys(exceldata.get(12));
		   EmailaddressField.sendKeys(exceldata.get(13));
		   
	   }
	   
	   public void seniorteacher() throws IOException{
		   List<String> exceldata = UT.GetUser("Senior Teacher");
		   Firstname.sendKeys(exceldata.get(1));
		   Lastname.sendKeys(exceldata.get(2));
		   centreName.sendKeys(exceldata.get(3));
		   Designation.sendKeys(exceldata.get(4));
		   Title.sendKeys(exceldata.get(5));
		   AddressField.sendKeys(exceldata.get(6));
		   CityField.sendKeys(exceldata.get(7));
		   StateField.sendKeys(exceldata.get(8));
		   ZipField.sendKeys(exceldata.get(9));
		   PhoneNumberField.sendKeys(exceldata.get(10));
		   reportingName.sendKeys(exceldata.get(11));
		   userName.sendKeys(exceldata.get(12));
		   EmailaddressField.sendKeys(exceldata.get(13));
		   
	   }
	   
	   public void RegionalEducationCoordinator() throws IOException{
		   List<String> exceldata = UT.GetUser("Regional Education Coordinator");
		   Firstname.sendKeys(exceldata.get(1));
		   Lastname.sendKeys(exceldata.get(2));
		   centreName.sendKeys(exceldata.get(3));
		   Designation.sendKeys(exceldata.get(4));
		   Title.sendKeys(exceldata.get(5));
		   AddressField.sendKeys(exceldata.get(6));
		   CityField.sendKeys(exceldata.get(7));
		   StateField.sendKeys(exceldata.get(8));
		   ZipField.sendKeys(exceldata.get(9));
		   PhoneNumberField.sendKeys(exceldata.get(10));
		   reportingName.sendKeys(exceldata.get(11));
		   userName.sendKeys(exceldata.get(12));
		   EmailaddressField.sendKeys(exceldata.get(13));
		   
	   }
	   public void FinanceManager() throws IOException{
		   List<String> exceldata = UT.GetUser("Finance Manager");
		   Firstname.sendKeys(exceldata.get(1));
		   Lastname.sendKeys(exceldata.get(2));
		   centreName.sendKeys(exceldata.get(3));
		   Designation.sendKeys(exceldata.get(4));
		   Title.sendKeys(exceldata.get(5));
		   AddressField.sendKeys(exceldata.get(6));
		   CityField.sendKeys(exceldata.get(7));
		   StateField.sendKeys(exceldata.get(8));
		   ZipField.sendKeys(exceldata.get(9));
		   PhoneNumberField.sendKeys(exceldata.get(10));
		   reportingName.sendKeys(exceldata.get(11));
		   userName.sendKeys(exceldata.get(12));
		   EmailaddressField.sendKeys(exceldata.get(13));
		   
	   }
	   
	   public void logisticsaccountassistant() throws IOException{
		   List<String> exceldata = UT.GetUser("Logistics & Account Assitant");
		   Firstname.sendKeys(exceldata.get(1));
		   Lastname.sendKeys(exceldata.get(2));
		   centreName.sendKeys(exceldata.get(3));
		   Designation.sendKeys(exceldata.get(4));
		   Title.sendKeys(exceldata.get(5));
		   AddressField.sendKeys(exceldata.get(6));
		   CityField.sendKeys(exceldata.get(7));
		   StateField.sendKeys(exceldata.get(8));
		   ZipField.sendKeys(exceldata.get(9));
		   PhoneNumberField.sendKeys(exceldata.get(10));
		   reportingName.sendKeys(exceldata.get(11));
		   userName.sendKeys(exceldata.get(12));
		   EmailaddressField.sendKeys(exceldata.get(13));
		   
	   }
	
	   public void childsponsorhipcoordinator() throws IOException{
		   List<String> exceldata = UT.GetUser("Child Sponsorship Coordinator");
		   Firstname.sendKeys(exceldata.get(1));
		   Lastname.sendKeys(exceldata.get(2));
		   centreName.sendKeys(exceldata.get(3));
		   Designation.sendKeys(exceldata.get(4));
		   Title.sendKeys(exceldata.get(5));
		   AddressField.sendKeys(exceldata.get(6));
		   CityField.sendKeys(exceldata.get(7));
		   StateField.sendKeys(exceldata.get(8));
		   ZipField.sendKeys(exceldata.get(9));
		   PhoneNumberField.sendKeys(exceldata.get(10));
		   reportingName.sendKeys(exceldata.get(11));
		   userName.sendKeys(exceldata.get(12));
		   EmailaddressField.sendKeys(exceldata.get(13));
		   
	   }
	
//Edit users
	   
	   public void editicon() throws IOException, InterruptedException{
		   
		 
		   
		   List<String> exceldata = UT.GetUser("Social Worker");
		   
		   enterUserToEdit.sendKeys(exceldata.get(12));
		   
		   SearchButton.click();
		   
		   Thread.sleep(1000);
		   
		   
			WebElement getElement=  getDriver().findElement(By.xpath("//td[contains(text(),'"+exceldata.get(12)+"')]/preceding-sibling::td"));
			
			getElement.click();
	   }  
	   
	   
	   public void Editsocialworker() throws IOException, InterruptedException{
		   List<String> exceldata = UT.GetUser("Edit Social Worker");
		   Firstname.clear();
		   Firstname.sendKeys(exceldata.get(1));
		   Lastname.clear();
		   Lastname.sendKeys(exceldata.get(2));
		   
		   centreName.sendKeys(exceldata.get(3));
		   
		   Designation.sendKeys(exceldata.get(4));
		   
		   Title.clear();
		   Title.sendKeys(exceldata.get(5));
		   
		   AddressField.clear();
		   AddressField.sendKeys(exceldata.get(6));
		   
		   CityField.clear();
		   CityField.sendKeys(exceldata.get(7));
		  
		   StateField.clear();
		   StateField.sendKeys(exceldata.get(8));
		   
		   ZipField.clear();
		   ZipField.sendKeys(exceldata.get(9));
		   
		   PhoneNumberField.clear();
		   PhoneNumberField.sendKeys(exceldata.get(10));
		   
		   EditReportingUser.click();
		   reportingName.clear();
		   reportingName.sendKeys(exceldata.get(11));
		   //Scroll
		   
		   ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", Submitbtn);
		   Thread.sleep(500); 
		   WebElementUtils.waitForVisible(Submitbtn);
		  // userName.clear();
		  // userName.sendKeys(exceldata.get(12));
		   
		   EmailaddressField.clear();
		   EmailaddressField.sendKeys(exceldata.get(13));
}
	   
//Verify Activation Mail received
	   
	   
	   public void MailReceived() throws IOException, InterruptedException{
		   
		   
		   
	   }
	   
	   
//Unlock the user
	   
	   public void filterUserToUnlock() throws IOException, InterruptedException{
		   
		 com.automation.utils.excelutil.Excelp(".//UserList.xlsx");
		
		 //FilterStatus.sendKeys(excelutil.getData(35, 1, 11));
		  // FilterStatus.sendKeys("Locked");
		   //Thread.sleep(1000);
		Select selectstatustype = new Select(FilterStatus);
		selectstatustype.selectByVisibleText(excelutil.getData(0, 1, 0));
		   
		   SearchButton.click();
		   
		   
}
	   
	   
	   public void UnlockUser() throws IOException, InterruptedException{
		   
		   WebElement getElement=  getDriver().findElement(By.xpath("//td[contains(text(),'"+excelutil.getData(0, 1, 1)+"')]/following-sibling::td[9]/a[1]"));
			
		   getElement.click();
		   
		   enterUserToEdit.sendKeys(excelutil.getData(0, 1, 1));
		   
		   SearchButton.click();
		   
		   String ActualStatus =ReadStatus.getText();
		   
		   String expectedStatus="Active";
			  
		   Assert.assertEquals(expectedStatus,ActualStatus);
			   
			   
		   
}
	   
	   
//Users ReturnToList Scenario
	   
	   
	   public void addUsersReturnToList() throws InterruptedException {
			
		 Adduserbtn.click();
		 
		 JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		 scrolldown1.executeScript("arguments[0].scrollIntoView()",ReturnToList);
			
		 ReturnToList.click();
		 
			boolean getValue = getDriver().findElement(By.xpath("//*[@class='table-grid grid']")).isDisplayed();
	
		 
			Assert.assertEquals(true,getValue);
			   
		 
			
			
		}
		
		public void editUsersReturnToList() throws InterruptedException {
			
			EditUSerIcon.click();
			
			JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
			scrolldown1.executeScript("arguments[0].scrollIntoView()",ReturnToList);
			
			ReturnToList.click();
			
			boolean getValue = getDriver().findElement(By.xpath("//*[@class='table-grid grid']")).isDisplayed();
			
			 
			 Assert.assertEquals(true,getValue);
			   
			
		}
		
//Delete Users
		
		public void deleteUsers() throws InterruptedException {
			
			com.automation.utils.excelutil.Excelp(".//UserList.xlsx");
			 
			enterUserToEdit.sendKeys(excelutil.getData(0,4,0));
			
			SearchButton.click();
			
			Deleteicon.click();
			
			Alert a = getDriver().switchTo().alert();
			a.accept();
			
			enterUserToEdit.sendKeys(excelutil.getData(0,4,0));
			
			SearchButton.click();
			
			String ActualStatus =ZeroRecords.getText();
			   
			String expectedStatus="Records 1 - 0 of 0";
				  
			Assert.assertEquals(expectedStatus,ActualStatus);
			
}
		
//Verify Duplicate mail prompts an error
		
		 public void saveWithDuplicateMail() throws Exception{
			   ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", Submitbtn);
			   Thread.sleep(500); 
			   WebElementUtils.waitForVisible(Submitbtn);
			   //WebElementUtils.waitForElement1(Submitbtn);
			   Actions action=new Actions(getDriver());
			   action.moveToElement(Submitbtn).click().perform();
			   Thread.sleep(3000);
			  String exp="Error ocurred while item data: Email Address Already Exists";
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
			   
			   
	     }
		 
//Ensure that Default Role allocated once the user is saved
		 
		 
		
		 public void defaultRoleValidationForHeadTeacher() throws Exception{
			   ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", Submitbtn);
			   Thread.sleep(500); 
			   WebElementUtils.waitForVisible(Submitbtn);
			   Actions action=new Actions(getDriver());
			   action.moveToElement(Submitbtn).click().perform();
			   Thread.sleep(3000);
			   
			   String ActualStatus =DefaultRole.getText();
			   String expectedStatus="Head Teacher Reader";
			 Assert.assertEquals(expectedStatus,ActualStatus);
			   
			   
	     }
		 
		// DeleteDefaultRole	
		 
		 public void deleteDefaultRole() throws Exception{
			   ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", Submitbtn);
			   Thread.sleep(500); 
			   WebElementUtils.waitForVisible(Submitbtn);
			   Actions action=new Actions(getDriver());
			   action.moveToElement(Submitbtn).click().perform();
			 Thread.sleep(2000);
			   
			   DeleteRole.click();
			  
			   String ActualStatus =DeleteDefaultRole.getText();
			 
			  // System.out.println(ActualStatus);
			   
			   String ExpectedStatus = "Add New Role";
			   
			  Assert.assertEquals(ExpectedStatus,ActualStatus);
			   
			   
	     }
		 
//Add new Role
		 
		 public void addNewRole() throws Exception{
			 
			 com.automation.utils.excelutil.Excelp(".//UserList.xlsx");
			 
			 Select selectRole = new Select(RoleDropDown);
			 selectRole.selectByVisibleText(excelutil.getData(0, 7, 0));
			 
			 String selectedValue=RoleDropDown.toString().valueOf(excelutil.getData(0, 7, 0));
			 
			 AddnewRoleButton.click();
			 
			 WebElement getElement=  getDriver().findElement(By.xpath("//*[contains(text(),'"+excelutil.getData(0, 7, 0)+"')]"));
				
			 String ActualStatus =getElement.getText();
			 
			 Assert.assertEquals(selectedValue,ActualStatus);   
			 
			 
		
			}
		 
//Change the status of the User
		 
		 public void filterUser() throws Exception{
			 
			 com.automation.utils.excelutil.Excelp(".//UserList.xlsx");
			 
			enterUserToEdit.sendKeys(excelutil.getData(0,10,0));
				
			SearchButton.click();
			
			
		 }
		 
		 public void changeStatus() throws Exception{
			
			EditUSerIcon.click();
			
			 Select selectStatus = new Select(StatusDropdown);
			 selectStatus.selectByVisibleText(excelutil.getData(0, 10, 1));
			 
			 
		 }
		 
}