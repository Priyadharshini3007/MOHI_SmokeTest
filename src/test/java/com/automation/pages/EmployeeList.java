package com.automation.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;





public class EmployeeList {
	
	
	public EmployeeList()
	{
		PageFactory.initElements(getDriver(), this);
	
	}
	
	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	  
	
	@FindBy(xpath="//a[text()='Employee']")
	WebElement drop1;
	@FindBy(linkText="Employee List")
	WebElement emplist;
	@FindBy(id="ddlEmpStatus") //Search Emp category  
	WebElement empcategory;
	@FindBy(id="txtStartDate")
	WebElement startdate;
	@FindBy(id="ToDate")
	WebElement enddate;
	@FindBy(xpath="//*[@title='Click here to update unpaid leave for the selected employees']")
	WebElement unpaidleavebtn;
	@FindBy(id="unpaidleave")
	WebElement unpaidleavetxtbx;
	@FindBy(id="comments")
	WebElement unpaidleavecomments;
	@FindBy(id="btnSave")
	WebElement buttonsave; 
	@FindBy(xpath="//*[@title='Click here to mark appraisal as not applicable for the selected employees']")
	WebElement appraisalnotapplicablebtn;
	@FindBy(id="submitButton")
	WebElement go;
	@FindBy(id="btnSearch")
	WebElement searchbtn;
	@FindBy(xpath="//a[@title='Short Term Changes – Confirm/ Extend/ Terminate']")
	WebElement recruitmenttypebtn;
	@FindBy(xpath="//a[@title='Click here to disable selected employees']")
	WebElement disableemployeebtn;
	@FindBy(xpath="//a[@title='Click here to re enable selected employees']")
	WebElement enableemployeebtn;
	
	@FindBy(id="IsConfirmed")
	WebElement isconfirmed;
	@FindBy(id="IsProbationExtension")
	WebElement extended;
	@FindBy(id="IsTerminate")
	WebElement terminate;  
	@FindBy(id="comments")
	WebElement comments; 
	@FindBy(id="btnSave")
	WebElement savebtn; 
	@FindBy(id="ExtendShortTermPeriod")
	WebElement extendshorttimedate;
	@FindBy(xpath="/html/body/div[6]/div/div/button[1]") //Cancel button
	WebElement cancelbtn;
	@FindBy(id="btnRefresh") //Search reset button - Filter reset 
	WebElement clearfilter;	
	@FindBy(id="Username")
	WebElement username;
	@FindBy(id="Questions_0__Answer")
	WebElement key;	
	@FindBy(id="Password")
	WebElement pass;	
	@FindBy(name="CheckUserNamePassword")
	WebElement submit;
	@FindBy(xpath="//a[@id='userDropdownMenuLink']")
	WebElement logout1;
	@FindBy(linkText="Log Out")
	WebElement logout2;
	@FindBy(xpath="//a[contains(text(),'Staffs re-enable request')]")
	WebElement reenablealert;
	@FindBy(id="Filter_PIN") //Search box PIN
	WebElement filterpin;
	@FindBy(id="btnSearch")
	WebElement searchbutton;
	@FindBy(xpath="//i[@title='Click here to Re-enable this Employee/View Re-enable workFlow']")
	WebElement reenableemployeebtn;
	@FindBy(xpath="//button[@value='Approve']")
	WebElement approvebtn;
	@FindBy(id="Comments")
	WebElement maincomments;
	@FindBy(xpath="//a[@title='Click here to Re-Run payroll for the selected employees']")
	WebElement rerunpayrollbtn;
	@FindBy(xpath="//a[@title='Click here download Employee details']")
	WebElement downloaddropdown;
	@FindBy(xpath="//a[@title='Download Employee in PDF']") //Download Employee in Excel
	WebElement downloadpdf;
	@FindBy(xpath="//a[@title='Download Employee in Excel']") //Download Employee in Excel
	WebElement downloadExcel;
	
	@FindBy(xpath = "//*[@title='Expand Employee']")
	WebElement ExpandEmployee;
	
public void Logout(){
		
		logout1.click();
		logout2.click();		
	}

public void perfomrtask() throws InterruptedException{

	excelutil.Excelp(".//EmployeeList.xlsx");
	
	
	//disableemployee();
	
	unpaidleavemethod();
	appraisalnotapplicable();
	rerubpayroll();
	download(); 
	recruitmentemployee();
	//disableemployee();
   
}
public void searchByPin(){
	int sheet = 0 ;
	int row = 1;		
	excelutil.Excelp(".//TestData.xlsx");
	filterpin.sendKeys(excelutil.getData(sheet, row,6));
	searchbutton.click();
}
	public void login(String u , String k , String p) throws InterruptedException{
		Thread.sleep(2000);
		username.sendKeys(u);
		submit.click();
		key.sendKeys(k);
		submit.click();
		pass.sendKeys(p);
		submit.click();		
	}
	public void navigateemplist() throws InterruptedException{
		excelutil.Excelp(".//EmployeeList.xlsx");
		
		login(excelutil.getData(1, 2,0),excelutil.getData(1, 1,1),excelutil.getData(1, 1,2));
		drop1.click();
		emplist.click();
		//search1();	
		
	}
	
	public void disableemployee() throws InterruptedException{
		excelutil.Excelp(".//EmployeeList.xlsx");
		clearfilter.click();
	searchByPin();
		selectcheckbox();	
		disableemployeebtn.click();
		comments.sendKeys(excelutil.getData(0, 1,7));
		savebtn.click();
	getDriver().switchTo().alert().accept();
		search1(); 
		clearfilter.click();
		////searchstatus(excelutil.getData(0, 1,9));
		Thread.sleep(2000);
		//search1();
		searchByPin();
		selectcheckbox();
		enableemployeebtn.click();
		comments.sendKeys(excelutil.getData(0, 1,7));
		savebtn.click();
		getDriver().switchTo().alert().accept();		
		Logout();
		login(excelutil.getData(1, 1,0),excelutil.getData(1, 1,1),excelutil.getData(1, 1,2));
		webDriverclick(ExpandEmployee);

		WebElementUtils.waitForVisible(reenablealert);

		WebElementUtils.scrolltoview(reenablealert);
		reenablealert.click();
		searchByPin();
		reenableemployeebtn.click();
		maincomments.sendKeys(excelutil.getData(0, 1,7));
		approvebtn.click();		
	}
	public void rerubpayroll() throws InterruptedException{
		selectcheckbox();
		rerunpayrollbtn.click();
		Thread.sleep(3000);
		getDriver().switchTo().alert().accept();
		getDriver().switchTo().alert().accept();
	}
	public void unpaidleavemethod(){
		excelutil.Excelp(".//EmployeeList.xlsx");
		String text=excelutil.getData(0,1,11);
		
		selectcheckbox(text);
		unpaidleavebtn.click();
		unpaidleavetxtbx.clear();
		unpaidleavetxtbx.sendKeys(excelutil.getData(0, 1,12));
		unpaidleavecomments.sendKeys(excelutil.getData(0, 1,13));
		buttonsave.click();
		getDriver().switchTo().alert().accept();		
	}
	public void appraisalnotapplicable() throws InterruptedException{
		Thread.sleep(1000);
		//Excelutilt.Excelp("C://Work//Mohi-Emp//src//main//java//util//EmployeeList.xlsx");
		String text=excelutil.getData(0,1,14);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("scroll(0, 300)",""); //bottom scroll
		selectcheckbox(text);
		jse.executeScript("scroll(300, 0)",""); //top scroll
		appraisalnotapplicablebtn.click();
		unpaidleavecomments.sendKeys(excelutil.getData(0, 1,5));
		buttonsave.click();
		getDriver().switchTo().alert().accept();			
	}
	public void selectcheckbox(String text){
		excelutil.Excelp(".//EmployeeList.xlsx");
		System.out.println(excelutil.getData(0,1,3));			
		getDriver().findElement(By.xpath("//input[@name='List["+text+"].SelectedItem']")).click();
	}
		public void startdate(){
			
			startdate.click();
			
			String date = excelutil.getData(0, 1,1);
			String monthyear , day;
			String dateArray[]=date.split("-");
			day = dateArray[0];
			monthyear=  dateArray[1] + " " + dateArray[2];	
					
			while (true)	{
				
				String text=getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[2]")).getText();
				
				if (text.equals(monthyear))
				{
						break;
				}
				else {
					
					getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[1]")).click();
				}
				
				}
			
				getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();			
		}
		public void todate(){
			
				enddate.click();
			
			String date = excelutil.getData(0, 1,2);
			String monthyear , day;
			String dateArray[]=date.split("-");
			day = dateArray[0];
			monthyear=  dateArray[1] + " " + dateArray[2];	
					
			while (true)	{
				
				String text=getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[2]")).getText();
				
				if (text.equals(monthyear))
				{
						break;
				}
				else {
					
					getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[1]")).click();
				}
				
				}
			
				getDriver().findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();		
					}
	
	
	public void download() throws InterruptedException{
		excelutil.Excelp(".//EmployeeList.xlsx");
		downloaddropdown.click();
		String text= excelutil.getData(0, 1,10);
		switch (text) {
		case "PDF":
			System.out.println("one");
			pdf();
			break;
		case "Excel":
			System.out.println("two");
			Excel();
			break;
		case "Both":
			System.out.println("three");
			
			pdf();
			Thread.sleep(2000);
			downloaddropdown.click();
			Excel();			
			break;
		default:
			System.out.println("default");
			}		
	}
	

	public void pdf() 
	{
		
		downloadpdf.click();
			}
	public void Excel(){
		downloadExcel.click();
	}
	public void recruitmentemployee() throws InterruptedException{
		excelutil.Excelp(".//EmployeeList.xlsx");
		searchRecruitmenttype(excelutil.getData(0, 1,4));
		
		filterpin.sendKeys(excelutil.getData(0, 3,5));
		searchbutton.click();
		selectcheckbox();
		recruitmenttypebtn.click();
		
		String text= excelutil.getData(0, 1,5);
		
		switch (text) {
		case "Confirm":
			System.out.println("one");
			confirm();
			break;
		case "Extended":
			System.out.println("two");
			extended();
			break;
		case "Terminate":
			System.out.println("three");
			terminate();
			break;
		default:
			System.out.println("default");
			}
	}
	public void terminate() throws InterruptedException{
		terminate.click();
		comments.sendKeys(excelutil.getData(0, 1,7));
		Thread.sleep(2000);
		cancelbtn.click();		
	}
	
		public void confirm() throws InterruptedException{
			excelutil.Excelp(".//EmployeeList.xlsx");
			String underprobation =  "Under Probation"; //input[@value="False"]
			String input = excelutil.getData(0, 1,6);
			isconfirmed.click();
			Thread.sleep(1000);
			if(underprobation.equals(input)){				
				getDriver().findElement(By.xpath("//input[@value='True' and @id='IsConfirmLT']")).click();
			}
			else {
				getDriver().findElement(By.xpath("//input[@value='False'and @id='IsConfirmLT']")).click();
			}			
			comments.sendKeys(excelutil.getData(0, 1,7));
			//savebtn.click();
			cancelbtn.click();
		}
		public void extended(){
			excelutil.Excelp(".//EmployeeList.xlsx");
			extended.click();
			extendshorttimedate.click();
			String date = excelutil.getData(0, 1,8);
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
					
					getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[2]/th[3]")).click();
				}
				
				}
			
				getDriver().findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody//tr//td[contains(text(),"+day+")]")).click();
				comments.click();
				comments.sendKeys(excelutil.getData(0, 1,7));
				cancelbtn.click();
		}
		
		public void search1(){						
			Select select = new Select(empcategory); 
			select.selectByVisibleText(excelutil.getData(0, 1,0));		
			go.click();
			
		}
	
		public void selectcheckbox(){
			excelutil.Excelp(".//EmployeeList.xlsx");
			String box = excelutil.getData(0,1,3);
			WebElement selectbox = getDriver().findElement(By.xpath("//input[@name='List["+box+"].SelectedItem']"));
			selectbox.click();		
		}
		
		public void searchstatus(String type){
			Select select=new Select(getDriver().findElement(By.id("Filter_Status")));
			select.selectByVisibleText(type);
			searchbtn.click();
			
		}
		public void searchRecruitmenttype(String type){
		
			Select select= new Select(getDriver().findElement(By.id("Filter_RecruitmentID")));
			select.selectByVisibleText(type);
			searchbtn.click();
		}
}
			
			
		
	

