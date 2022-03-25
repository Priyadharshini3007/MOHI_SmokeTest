package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.*;

public class EmployeeListsteps extends BaseClass {

	@Given("^After login select Employee list from Menu$")
	public void after_login_select_Employee_list_from_Menu() throws Throwable {
		
	   Thread.sleep(1000);
	   helper();
	 
	   el.navigateemplist();
	   
	   
	}

	@Given("^perform task$")
	public void perform_task() throws Throwable {
	   
		el.perfomrtask();
		
	}
	
	@Given("^unpaidleave methode$")
	public void unpaidleave_methode() throws Throwable {
		el.unpaidleavemethod();
	}

	@Given("^appraisal notapplicable methode$")
	public void appraisal_notapplicable_methode() throws Throwable {
		el.appraisalnotapplicable();
	}

	@Given("^Rerun payroll methode$")
	public void rerun_payroll_methode() throws Throwable {
		el.rerubpayroll();

	}

	@Given("^download Pdf and Excel$")
	public void download_Pdf_and_Excel() throws Throwable {
		el.download();
	}

	@Given("^recruit an employee$")
	public void recruit_an_employee() throws Throwable {
		el.recruitmentemployee();
	}
	
	
	
	
	
}
