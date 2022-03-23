package com.automation.pages;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.automation.utils.Excelutilt;
import com.automation.utils.WebElementUtils;

//import util.ExcelUtil;

public class EmployeeRec {
	
	public EmployeeRec()
	{
		PageFactory.initElements(getDriver(), this);
	
	}
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	int sheet = 0 ;
	int row = 1;
	JavascriptExecutor js = (JavascriptExecutor)getDriver();
	
	
	@FindBy(xpath="//a[text()='Employee']") //"/html/body/div[1]/nav/div/ul[1]/li[2]/a"
	WebElement drop1;
	@FindBy(linkText="Employee Recruitment")
	WebElement linkemp;
	@FindBy(id="EmployeeFirstName")
	WebElement wfirstname;
	@FindBy(id="EmployeeLastName")
	WebElement wlastname;
	@FindBy(xpath="//div//input[@value='1']") //Male	
	WebElement genderm;
	@FindBy(xpath="//div//input[@value='2']") //Female
	WebElement genderf;	
	@FindBy(id="NICN")	//National ID
	WebElement nicn;
	@FindBy(id="PIN")	//Personal ID
	WebElement pin;
	@FindBy(id="NSSN") 	//NAtional Social Security no	
	WebElement nssn;
	@FindBy(id="NHIN")	//National Health Insurance no
	WebElement nhin;
	@FindBy(id="Address")
	WebElement address;
	@FindBy(id="BankAccountNumber")
	WebElement bankaccnum;
	@FindBy(id="DOB") //Date of birth date picker
	WebElement dob;
	@FindBy(id="DOFEmployement") //Date of Employment
	WebElement doe;
	@FindBy(id="EmpEmail")
	WebElement email;
	@FindBy(id="Town")
	WebElement town;
	@FindBy(id="Landmark")
	WebElement landmark; 
	@FindBy(xpath="//*[@id='emppersonInfobtn']/button[2]") //Submit Button /html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/form/div/div/div/div[5]/div/div/button[2]
	WebElement submit;
	//@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/ul/li[1]/a")
	//WebElement personaltab;
	@FindBy(xpath="//div[@id='trShortTerm' and not(contains(@class, 'hidden'))] //input")
	WebElement shorttermdate;
	@FindBy(xpath="//th[@class='next']")
	WebElement next;
	@FindBy(xpath = "//*[@title='Expand Employee']")
	WebElement ExpandEmployee;
	
	/////////  Web Elements of Company Info //////////////
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/ul/li[2]/a") //Company Info Tab
	WebElement companytab;
	@FindBy(id="AddCompany")
	WebElement addbtn;
	@FindBy(id="CompanyReferenceList_0__CompanyName")
	WebElement company;
	@FindBy(id="CompanyReferenceList_0__Position")
	WebElement position;
	@FindBy(id="CompanyReferenceList_0__Reasonleaving")
	WebElement reason;
	@FindBy(id="CompanyReferenceList_0__Fromyr")
	WebElement fromdate;
	@FindBy(id="CompanyReferenceList_0__Toyr")
	WebElement todate; //*[@id="formCompanyinfo"] //button[@type='submit'][2]
	@FindBy(xpath="//*[@id='formCompanyinfo'] //button[@type='submit'][2]") //Submit and GO /html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/div[5]/form/div[1]/div[2]/div/button[2]
	WebElement submitcompany;
	
	////////// Qualification Info ////////////+
	
	@FindBy(id="ui-id-3")
	WebElement qualificationtab;
	@FindBy(id="AddQualification")
	WebElement addqualification;
	@FindBy(id="QualilficationList_0__QualificationTypeID")
	WebElement qualificationtype;
	@FindBy(id="QualilficationList_0__certificate")
	WebElement qualificationcert;
	@FindBy(id="QualilficationList_0__Institution")
	WebElement institution;
	@FindBy(id="QualilficationList_0__Grade")
	WebElement grade;
	@FindBy(id="QualilficationList_0__From")
	WebElement qfrom;
	@FindBy(id="QualilficationList_0__Toy") 
	WebElement qto;
	@FindBy(xpath="//*[@id='formQualificationinfo']//*[@type='submit'][2]") //Submit and Go Qualification /html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/div[4]/form/div/div[2]/div/button[2]
	WebElement subitqual;
	
	/////////////// Family Info //////////
	
	@FindBy(id="ui-id-4")
	WebElement familytab;
	@FindBy(id="personrelatedList_1__relationshipID")
	WebElement relationship;
	@FindBy(id="personrelatedList_1__Name")
	WebElement rname;
	@FindBy(id="personrelatedList_1__telephone")
	WebElement phoneno;	
	@FindBy(xpath="//*[@id='formFamilyinfo']/div/div[3]/div/button") ///html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div/div[3]/div/button
	WebElement submitfam;
	
	////////////////// Payroll ////////////////////
	
	@FindBy(id="ui-id-5")
	WebElement payrolltab;
	@FindBy(id="PayStructureYear")
	WebElement paystructureyear;
	@FindBy(id="Comments")
	WebElement comments;
	@FindBy(id="PayStructure_0__Value")
	WebElement grosssalary;
	@FindBy(id="PayStructure_5__Value")
	WebElement otherallowance; 
	@FindBy(xpath="//*[@id='PaystructureInfo']//*[@type='submit'][2]") // /html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/div[3]/form/div/div/div[3]/div/button[2]
	WebElement submitpay;
	//////////////////// LOG OUT /////////////////
	@FindBy(id="userDropdownMenuLink")
	WebElement logout1;
	@FindBy(linkText="Log Out")
	WebElement logout2;
	
	public void dataentry () throws Exception {		
		
		Excelutilt.Excelp(".//TestData.xlsx");
		
		//System.out.println(Excelutilt.getData(0,1,1));	
		String text1="Male";		
		
		String sfirstname =  Excelutilt.getData(sheet, row, 1);    //Excelutilt.getData(0, 2, 2);	 
		String slastname  =  Excelutilt.getData(sheet, row, 3);
		String gender1=Excelutilt.getData(sheet, row, 4);
		wfirstname.click();
		wfirstname.sendKeys(sfirstname);
		wlastname.click();
		wlastname.sendKeys(slastname);
		genderselect(text1,gender1); //Selecting Male or Female
		dateofbirth();
		js.executeScript("scroll(0, 200)",""); 
		dateofemployment();
		identification();
		bankid();
	
		email.sendKeys(Excelutilt.getData(sheet, row, 15));
		
		recruitmenttype();
		
		town.sendKeys(Excelutilt.getData(sheet, row, 20));
		landmark.sendKeys(Excelutilt.getData(sheet, row, 21));
		Maritialstatus();
	}
	
	private void identification(){
		nicn.sendKeys(Excelutilt.getData(sheet, row,5));		
		pin.sendKeys(Excelutilt.getData(sheet, row,6));
		nssn.sendKeys(Excelutilt.getData(sheet, row,7));
		nhin.sendKeys(Excelutilt.getData(sheet, row,8));
		address.sendKeys(Excelutilt.getData(sheet, row,9));
	}
		
	private void bankid() {
		//BankName
		WebElement element = getDriver().findElement(By.id("BankID")); 
		Select select = new Select(element); 
		select.selectByVisibleText(Excelutilt.getData(sheet, row,10));
		//BankBranch
		WebElement element1 = getDriver().findElement(By.id("branchID")); 
		Select select1 = new Select(element1); 
		select1.selectByVisibleText(Excelutilt.getData(sheet, row,11));
		//BankAccountNumber
		bankaccnum.sendKeys(Excelutilt.getData(sheet, row,12));
		
		js.executeScript("scroll(0,-1500)","");
		
		
		
		}
	
	 public  String[] datesplit(String date ){

			 
			String monthyear , day;
			String dateArray[]=date.split("-");
			day = dateArray[0];
			monthyear=  dateArray[1] + " " + dateArray[2];
			return new String[] {day,monthyear} ;			
		
	} 
	 
	 public void shortterm() throws InterruptedException{		
		 shorttermdate.click();
		
			String date = Excelutilt.getData(sheet, row,23);
			String monthyear , day;
			String dateArray[]=date.split("-");
			day = dateArray[0];
			monthyear=  dateArray[1] + " " + dateArray[2];	
			
			
					
			while (true)	{
				
				String text=getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[2]/th[2]")).getText();
				
				if (text.equals(monthyear))
				{
						break;
				}
				else {
//					getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[2]/th[1]")).click();
					getDriver().findElement(By.xpath("//th[@class='next']")).click();
				}
				
				}
////				next.click();
//		 getDriver().findElement(By.xpath("//th[@class='next']")).click();
				getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();
			
		}
	
	public void dateofbirth() throws InterruptedException{		
		
		Thread.sleep(2000);
		dob.click();
//		webDriverclick(dob);
	
		String date = Excelutilt.getData(sheet, row,13);
		String monthyear , day;
		String dateArray[]=date.split("-");
		day = dateArray[0];
		monthyear=  dateArray[1] + " " + dateArray[2];	
				
		while (true)	{
			
			String text=getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[2]/th[2]")).getText();
			
			if (text.equals(monthyear))
			{
					break;
			}
			else {
				
				getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
			
			}
		
			getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();
		
	}
	
	public void dateofemployment(){
		
		doe.click();
		
		String date = Excelutilt.getData(sheet, row,14);
		String monthyear , day;
		String dateArray[]=date.split("-");
		day = dateArray[0];
		monthyear=  dateArray[1] + " " + dateArray[2];	
				
		while (true)	{
			
			String text=getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[2]/th[2]")).getText();
			
			if (text.equals(monthyear))
			{
					break;
			}
			else {
				
				getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
			
			}
		
			getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();
		
		
	}
	
	public void recruitmenttype() throws InterruptedException{
		 //Recruitment type
		 	WebElement element = getDriver().findElement(By.id("VRecruitmentTypeId")); 
			Select select = new Select(element); 
			select.selectByVisibleText(Excelutilt.getData(sheet, row,16));
			if (Excelutilt.getData(sheet, row,16).toLowerCase().toString().equals("short term"))
			{
			Thread.sleep(2000);
			this.shortterm();
			}
		//Staff category
			WebElement element1 = getDriver().findElement(By.id("StaffCategoryID")); 
			Select select1 = new Select(element1); 
			select1.selectByVisibleText(Excelutilt.getData(sheet, row,17));
			
		//Center
			WebElement element2 = getDriver().findElement(By.id("CenterID")); 
			Select select2 = new Select(element2); 
			select2.selectByVisibleText(Excelutilt.getData(sheet, row,18));
			js.executeScript("scroll(0, 1000)","");
		//Designation
			WebElement element3 = getDriver().findElement(By.id("DesignationID")); 
			Select select3 = new Select(element3); 
			select3.selectByVisibleText(Excelutilt.getData(sheet, row,19));
	 }

	public void Maritialstatus(){
		//MAritial status
		WebElement element3 = getDriver().findElement(By.id("MaritalID")); 
		Select select3 = new Select(element3); 
		select3.selectByVisibleText(Excelutilt.getData(sheet, row,22));
	}
	
	private void genderselect(String text , String   gender) {
		if (text.equals(gender)){
			genderm.click();
		}
		else{
			genderf.click();
		}
	}
	
	public void Submitbutton(){
		JavascriptExecutor js = (JavascriptExecutor)getDriver();		
		js.executeScript("scroll(0, 2000)","");
		webDriverclick(submit);
	}

	public void navigate() throws InterruptedException{
		Thread.sleep(2000);

		Excelutilt.Excelp(".//TestData.xlsx");
	
        int sheet = 5;
       
        login1(Excelutilt.getData(sheet, 2,0), Excelutilt.getData(sheet, 2,1), Excelutilt.getData(sheet, 2,2));
		drop1.click();
		linkemp.click();
	}
 
//////////////////////  Previous Company Details //////////////////
	
	public void precompanydetails() throws InterruptedException{
			
			int row = 1;
			Excelutilt.Excelp(".//TestData.xlsx");
			Thread.sleep(2000);
			webDriverclick(addbtn);
			Thread.sleep(1000);
			company.sendKeys(Excelutilt.getData(1, row,0));
			position.sendKeys(Excelutilt.getData(1, row,1));
			reason.sendKeys(Excelutilt.getData(1, row,2));
			fromdate.sendKeys(Excelutilt.getData(1, row,3));
			todate.sendKeys(Excelutilt.getData(1, row,4));
			todate.sendKeys(Keys.ENTER);
			js.executeScript("scroll(0, 200)","");
			submitcompany.click();				
	}
	
///////////////////// Qualification  Details //////////////////
	
	public void Qualificationtab() throws InterruptedException{
		
		int row= 1;
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		addqualification.click();
		Thread.sleep(1000);		
		Select select3 = new Select(qualificationtype); 
		select3.selectByVisibleText(Excelutilt.getData(2, row,0));
		qualificationcert.sendKeys(Excelutilt.getData(2, row,1));
		institution.sendKeys(Excelutilt.getData(2, row,2));
		grade.sendKeys(Excelutilt.getData(2, row,3));
		qfrom.sendKeys(Excelutilt.getData(2, row,4));
		qto.sendKeys(Excelutilt.getData(2, row,5));
		qto.sendKeys(Keys.ENTER);
		subitqual.click();		
		
	}
/////////////////////  Family Info  //////////////////
	
	public void familyinfo() throws InterruptedException{
		int row= 1;
		Thread.sleep(1000);
		Select select = new Select(relationship); 
		select.selectByVisibleText(Excelutilt.getData(3, row,0));
		rname.sendKeys(Excelutilt.getData(3,row,1));
		phoneno.sendKeys(Excelutilt.getData(3, row,2));		
		JavascriptExecutor js = (JavascriptExecutor)getDriver();		 
		//js.executeScript("scroll(250, 0)");  // if the element is on top.
		
		js.executeScript("scroll(0, 1000)","");  // if the element is on bottom.
		
		submitfam.click();		
		
	}
	////////////////////////// PAYROLL Details //////////////////////
	
	public void payrolldetails() throws InterruptedException{
		
		int row = 1;
		JavascriptExecutor js = (JavascriptExecutor)getDriver();		
		js.executeScript("scroll(1000, 0)");	  // if the element is on top.		
		//js.executeScript("scroll(0, 500)","");	 // if the element is on bottom.
		payrolltab.click();
		Thread.sleep(2000);
		paystructureyear.sendKeys(Excelutilt.getData(4,row,0));
		comments.click();
		comments.sendKeys(Excelutilt.getData(4,row,1));
		js.executeScript("scroll(0, 300)","");
		grosssalary.sendKeys(Excelutilt.getData(4,row,2));
		otherallowance.sendKeys(Excelutilt.getData(4,row,3));
		//js.executeScript("scroll(0, 2500)",""); //Bottom scroll
		Thread.sleep(2000);
		js.executeScript("scroll(0,3000)",""); //Bottom scroll
		Thread.sleep(2000);
		submitpay.click();
	}
		
	public void Logout(){
		
		logout1.click();
		logout2.click();
		
	}
	
	/////////////////////////////////// HR Login and Approval //////////////////////
	
	
	@FindBy(id="Username")
	WebElement username;
	@FindBy(id="Questions_0__Answer")
	WebElement key;	
	@FindBy(id="Password")
	WebElement pass;	
	@FindBy(name="CheckUserNamePassword")
	WebElement submit1;
	@FindBy(xpath="//a[contains(@href,'/EmployeeList/0?Filterstring=Staff_Appr')]") 	
	WebElement approvealert;
	@FindBy(id="Filter_PIN") //Search box PIN
	WebElement filterpin;
	@FindBy(id="btnSearch")
	WebElement searchbutton;
	@FindBy(css="i.fa.fa-cogs")
	WebElement approval;
	@FindBy(id="Comments")
	WebElement commentsemployee;
	@FindBy(xpath="//button[@value='Approve']")
	WebElement approvebtn;
	@FindBy(xpath="//button[@value='Deny']")
	WebElement denybtn;
	@FindBy(xpath="//button[@value='Need More Info']")
	WebElement clarification;
	@FindBy(xpath="//a[contains(text(),'recruitment request')]")
	WebElement deniedalert;
	@FindBy(xpath="//a[contains(@href,'/EmployeeList/0?Filterstring=Staff_Need_Info')]")
	WebElement needmoreinfoalert;
	@FindBy(xpath="//button[@value='Send Info']")
	WebElement sendcalrification;
	@FindBy(xpath="//a[contains(@href,'Employee/EmployeeList/0?Filterstring=Staff_Send_Info')]")
	WebElement moreinforecievedalert;
	
	public void login1(String nam, String ke , String pas) throws InterruptedException{
		
		//getDriver().get("http://192.10.1.208:8009/Login/Index");
		//Thread.sleep(2000);
		username.sendKeys(nam);
		submit1.click();
		Thread.sleep(2000);
		key.sendKeys(ke);
		submit1.click();
		Thread.sleep(2000);
		pass.sendKeys(pas);
		submit1.click();
		Thread.sleep(2000);
	}
	public void hrlogin() throws InterruptedException{
		
		int sheet = 5; int row = 1;
		Excelutilt.Excelp(".//TestData.xlsx");		
		login1(Excelutilt.getData(sheet, row,0), Excelutilt.getData(sheet, row,1), Excelutilt.getData(sheet, row,2));	
		
	}
	public void clickalert(){
		webDriverclick(ExpandEmployee);

		WebElementUtils.waitForVisible(approvealert);

		WebElementUtils.scrolltoview(approvealert);
		
		approvealert.click();	
		filterpin.sendKeys(Excelutilt.getData(sheet, row,6));
		searchbutton.click();
		approval.click();			
	}
	
	public void approveemployee(){
		int sheet = 5; int row = 1;
		commentsemployee.sendKeys("Approve "+Excelutilt.getData(sheet, row,3));
		approvebtn.click();
	}
	public void denyemployee() throws InterruptedException{
		int sheet = 5; int row = 1;
		commentsemployee.sendKeys("Deny "+Excelutilt.getData(sheet, row,3));
		denybtn.click();		
		String alerttext = getDriver().switchTo().alert().getText();
		System.out.println(alerttext);
		getDriver().switchTo().alert().accept();
		Logout();
		login1(Excelutilt.getData(sheet, row,0), Excelutilt.getData(sheet, row,1), Excelutilt.getData(sheet, row,2));
		deniedalert.click();
		approval.click();
	}
	
	public void clarificationemployee() throws InterruptedException{
		int sheet = 5; int row = 2;
		commentsemployee.sendKeys("Clarification "+Excelutilt.getData(sheet, row,3));
		clarification.click();  
		Logout();
		login1(Excelutilt.getData(sheet, row,0), Excelutilt.getData(sheet, row,1), Excelutilt.getData(sheet, row,2));
		webDriverclick(ExpandEmployee);

		WebElementUtils.waitForVisible(needmoreinfoalert);

		WebElementUtils.scrolltoview(needmoreinfoalert);
		needmoreinfoalert.click();
		approval.click();	
		commentsemployee.sendKeys("Clarification again "+Excelutilt.getData(sheet, row,3));
		sendcalrification.click();
		Logout();
		login1(Excelutilt.getData(sheet, 1,0), Excelutilt.getData(sheet, 1,1), Excelutilt.getData(sheet, 1,2));
		webDriverclick(ExpandEmployee);

		WebElementUtils.waitForVisible(moreinforecievedalert);

		WebElementUtils.scrolltoview(moreinforecievedalert);
		
		moreinforecievedalert.click();
		approval.click();
		approveemployee(); 
		
	}
	
	
		}
	

	

