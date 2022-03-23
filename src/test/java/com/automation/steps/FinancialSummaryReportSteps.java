package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;

public class FinancialSummaryReportSteps extends BaseClass{
	
	@Given("^click report menu and click Financial Summary report submenu$")
	public void click_report_menu_and_click_Financial_Summary_report_submenu() throws Throwable {
	   
		helper();
	
		fsr.financialSummaryReportMenu();
	}

	@Given("^Reports can be filtered based on type – center or month & year and payment status$")
	public void reports_can_be_filtered_based_on_type_center_or_month_year_and_payment_status() throws Throwable {
	 
		fsr.filterFinancialSummaryReport();
	}

	@Given("^click on view report to view the Financial Summary Report based on the selection$")
	public void click_on_view_report_to_view_the_Financial_Summary_Report_based_on_the_selection() throws Throwable {
		fsr.viewFinancialSummaryReportButton();
	}

	@Given("^click download to dowload the Financial Summary Report in the specified format$")
	public void click_download_to_dowload_the_Financial_Summary_Report_in_the_specified_format() throws Throwable {
		
		fsr.FinancialSummaryReportDownload();
	}


	
	
	

}
