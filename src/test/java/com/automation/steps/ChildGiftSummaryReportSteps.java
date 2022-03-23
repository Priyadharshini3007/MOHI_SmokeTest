package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;
public class ChildGiftSummaryReportSteps extends BaseClass {
	
	@Given("^click report menu and click childgift summary submenu$")
	public void click_report_menu_and_click_childgift_summary_submenu() throws Throwable {
		
		helper();
		
		cgsr.chilfGiftSummaryReportMenu();
		
		
	}

	@Given("^report can be filtered based on the Center,School,Received From Date,Received To Date and GiftStatus$")
	public void report_can_be_filtered_based_on_the_Center_School_Received_From_Date_Received_To_Date_and_GiftStatus() throws Throwable {
		cgsr.filterChildGiftSummaryReport();
	}

	@Given("^click on view report to view the childgift summary report$")
	public void click_on_view_report_to_view_the_childgift_summary_report() throws Throwable {
		cgsr.viewChildGiftSummaryReport();
	}

	@Given("^click download to dowload the childgiftsummary report in specified format$")
	public void click_download_to_dowload_the_childgiftsummary_report_in_specified_format() throws Throwable {
		cgsr.childGiftSummaryReport();
	}
	
	@Given("^Click Tracking Report$")
	public void click_Tracking_Report() throws Throwable {
		cgsr.TrackingReport();
	}

	@Given("^Report can be filtered based on Center,School,Year and CMF ID$")
	public void report_can_be_filtered_based_on_Center_School_Year_and_CMF_ID() throws Throwable {
		cgsr.TrackingDropDwn();
	}


	

}
