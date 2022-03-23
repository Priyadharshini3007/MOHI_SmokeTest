package com.automation.steps;

import com.automation.pages.BaseClass;




import cucumber.api.java.en.*;
//import util.ExcelUtil;

public class EmployeeRecSteps extends BaseClass {
	
	@Given("^Navigate to Employee recruitment page$")
	public void navigate_to_Employee_recruitment_page() throws Throwable {
		Thread.sleep(3000);
		//erec=new EmployeeRec(driver);
		helper();
		erec.navigate();
	}

	@Given("^Enter details in Personal Info page$")
	public void enter_details_in_Personal_Info_page() throws Throwable {
		erec.dataentry();
		erec.Submitbutton();
		erec.precompanydetails();
		erec.Qualificationtab();
		erec.familyinfo();
		erec.payrolldetails(); 
		erec.Logout();
	}
	
	@Given("^Login as HR Manager$")
	public void login_as_HR_Manager() throws Throwable {
		//er=new EmployeeRec(driver);
		erec.hrlogin();
	}

	@Given("^Complete the Approval process$")
	public void complete_the_Approval_process() throws Throwable {
	 erec.clickalert();
	 erec.clarificationemployee();
	 //er.denyemployee();
	 //erec.Logout();
	}

	
}
