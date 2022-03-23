package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import com.automation.utils.excelutil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.automation.utils.AssertionUtils;
import com.automation.utils.ExcelHelper;
import com.automation.utils.ExcelLib;
import com.automation.utils.WebElementUtils;

public class LoginPage extends ExcelLib   {
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "//input[@name='Username']")
	private  WebElement usernamebtn;

	@FindBy(className="submit")
	private WebElement Submitbtn;

	@FindBy(id="Questions_0__Answer")
	private WebElement SecurityAnswerBtn;

	@FindBy(xpath="//input[@name='Password']")
	private WebElement PasswordBtn;

	@FindBy(xpath="//div[contains(text(),'SIGN IN')]")
	private WebElement Signinbtn; 

	@FindBy(id="Username")
	WebElement username;

	@FindBy(name="CheckUserNamePassword")
	WebElement submit;

	@FindBy(id="Questions_0__Answer")
	WebElement SecurityAnswr;

	@FindBy(id="Password")
	WebElement password;

	//SocialWorkerLogin 
	public void SwSetUsername(){
		username.sendKeys("josk.sw1@mohiafrica.org");
	}

	public void submit(){
		submit.click();
	}

	public void setUsername(String usrname){
		usernamebtn.clear();
		usernamebtn.sendKeys(usrname);
	}

	public void setSWUsername(){
		usernamebtn.clear();
		usernamebtn.sendKeys("josk.sw1@mohiafrica.org");
	}

	public void setHTUsername(){
		usernamebtn.clear();
		usernamebtn.sendKeys("josk.ht@mohiafrica.org");
	}

	public void setCSCUsername(){
		usernamebtn.clear();
		usernamebtn.sendKeys("lynn.maringa@mohiafrica.org");
	}

	public void setCSMUsername(){
		usernamebtn.clear();
		usernamebtn.sendKeys("AndriaMoushon@cmfi.org");
	}

	public void setSecurityQn(String securityAns){
		SecurityAnswerBtn.clear();
		SecurityAnswerBtn.sendKeys(securityAns);
	}

	public void setPassword(String pswd){
		PasswordBtn.clear();
		PasswordBtn.sendKeys(pswd);
	}

	public void EnterUserNameandpassword() throws Exception{
		String sUsername=ExcelLib.getExcelData("TestData", 1, 0);
		System.out.println();
		String securityKey=ExcelLib.getExcelData("TestData", 1, 1);
		String spassword=ExcelLib.getExcelData("TestData", 1, 2);
		usernamebtn.sendKeys(sUsername);
		Submitbtn.click();
		SecurityAnswerBtn.sendKeys(securityKey);
		Submitbtn.click();
		PasswordBtn.sendKeys(spassword);
		Submitbtn.click();
	}

	public void verifysigninpage(){
		WebElementUtils.waitForVisible(Signinbtn);
		String Actual=Signinbtn.getText();
		String expected="SIGN IN";
		AssertionUtils.assertEquals(Signinbtn, Actual, expected, true);
	}

	public void enterusername(String UserName){
		usernamebtn.sendKeys(UserName);
		Submitbtn.click();
	}

	public void entersecuritykey(String SecurityKey){
		SecurityAnswerBtn.sendKeys(SecurityKey);
		Submitbtn.click();
	}
	public void enterpassword(String Password){
		PasswordBtn.sendKeys(Password);
		Submitbtn.click();
	}
	public void secquestion() throws InterruptedException{

		Thread.sleep(1000);
		SecurityAnswr.sendKeys("k");
	}

	public void password() throws InterruptedException{
		Thread.sleep(1000);
		password.sendKeys("Password#123");
	}

	//headteacherusername

	public void htusername(){
		username.sendKeys("josk.ht@mohiafrica.org");
	}

	//cscusername

	public void cscusername(){
		username.sendKeys("lynn.maringa@mohiafrica.org");
	}
	//csmusername

	public void csmusername(){
		username.sendKeys("AndriaMoushon@cmfi.org");
	}

	//adminassistantusername

	public void aausername(){
		username.sendKeys("fwamacaroline@yahoo.com");
	}


	//SocialWorkerLogin 
	public void excelusername(String uname) throws InterruptedException, Throwable{
		Thread.sleep(2000);
		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		if(uname.trim().toLowerCase().equals("socialworker"))
		{
			username.sendKeys(excelutil.getData(7, 1, 1));
		}

		if(uname.trim().toLowerCase().equals("headteacher"))
		{
			username.sendKeys(excelutil.getData(7, 2, 1));
		}
		if(uname.trim().toLowerCase().equals("cscusername"))
		{
			username.sendKeys(excelutil.getData(7, 3, 1));
		}
		if(uname.trim().toLowerCase().equals("csmusername"))
		{
			username.sendKeys(excelutil.getData(7,4,1));
		}
		if(uname.trim().toLowerCase().equals("adminassistant"))
		{
			username.sendKeys(excelutil.getData(7,5,1));
		}

		if(uname.trim().toLowerCase().equals("accountant"))
		{
			username.sendKeys(excelutil.getData(7,6,1));
		}

		if(uname.trim().toLowerCase().equals("educationcoordinator"))
		{
			username.sendKeys(excelutil.getData(7,7,1));
		}

		if(uname.trim().toLowerCase().equals("financemanager"))
		{
			username.sendKeys(excelutil.getData(7,8,1));
		}
		if(uname.trim().toLowerCase().equals("educationmanager"))
		{
			username.sendKeys(excelutil.getData(7,9,1));
		}
		if(uname.trim().toLowerCase().equals("director"))
		{
			username.sendKeys(excelutil.getData(7,10,1));
		}
		if(uname.trim().toLowerCase().equals("ceo"))
		{
			username.sendKeys(excelutil.getData(7,11,1));
		}

		if(uname.trim().toLowerCase().equals("officeadmin"))
		{
			username.sendKeys(excelutil.getData(7,12,1));
		}

		if(uname.trim().toLowerCase().equals("headofdepartment"))
		{
			username.sendKeys(excelutil.getData(7,13,1));
		}

		if(uname.trim().toLowerCase().equals("procurementmanager"))
		{
			username.sendKeys(excelutil.getData(7,14,1));
		}


		if(uname.trim().toLowerCase().equals("ndoviniheadteacher"))
		{
			username.sendKeys(excelutil.getData(7,15,1));
		}

		if(uname.trim().toLowerCase().equals("cso"))
		{
			username.sendKeys(excelutil.getData(7,16,1));
		}

		if(uname.trim().toLowerCase().equals("siteadmin"))
		{
			username.sendKeys(excelutil.getData(7,17,1));
		}

		if(uname.trim().toLowerCase().equals("hrofficer"))
		{
			username.sendKeys(excelutil.getData(7,18,1));
		}

		if(uname.trim().toLowerCase().equals("hrmanager"))
		{
			username.sendKeys(excelutil.getData(7,19,1));
		}
		
		if(uname.trim().toLowerCase().equals("directorproc"))	
		{
			username.sendKeys(ExcelHelper.readData(".\\ExcelFiles\\Procurement.xlsx","Login",1,1));
		}
		
		if(uname.trim().toLowerCase().equals("executivedirectorproc"))	
		{
			username.sendKeys(ExcelHelper.readData(".\\ExcelFiles\\Procurement.xlsx","Login",2,1));
		}
		
		if(uname.trim().toLowerCase().equals("financemanagerproc"))	
		{
			username.sendKeys(ExcelHelper.readData(".\\ExcelFiles\\Procurement.xlsx","Login",3,1));
		}
		if(uname.trim().toLowerCase().equals("officeadminproc"))	
		{
			username.sendKeys(ExcelHelper.readData(".\\ExcelFiles\\Procurement.xlsx","Login",6,1));
		}
		if(uname.trim().toLowerCase().equals("headofdepartmentproc"))	
		{
			username.sendKeys(ExcelHelper.readData(".\\ExcelFiles\\Procurement.xlsx","Login",7,1));
		}
		if(uname.trim().toLowerCase().equals("accountantproc"))	
		{
			username.sendKeys(ExcelHelper.readData(".\\ExcelFiles\\Procurement.xlsx","Login",10,1));
		}
		if(uname.trim().toLowerCase().equals("missionsdir"))	
		{
			username.sendKeys(ExcelHelper.readData(".\\ExcelFiles\\Procurement.xlsx","Login",11,1));
		}
		
	}

	public void excelsubmit(){
		submit.click();
	}

	public void excelsecquestion() throws Throwable  {

		SecurityAnswr.sendKeys(excelutil.getData(7, 1, 2));
	}

	public void excelpassword() throws Throwable  {

		password.sendKeys(excelutil.getData(7, 1, 3));
	}




}