package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;


public class StaffPromotionReportSteps extends BaseClass{
	
	@When("^Select the report type as \"(.*?)\"$")
	public void select_the_report_type_as(String reportType) throws Throwable {
		helper();
		Spr.reportTypefn(reportType);
	}

	@When("^Select the From Date as \"(.*?)\" and End Date as \"(.*?)\"$")
	public void select_the_From_Date_as_and_End_Date_as(String FrmDate,String ToDate) throws Throwable {
		Spr.dateSelectionFn(FrmDate,ToDate);
	}

	@When("^Click the View Report button$")
	public void click_the_View_Report_button() throws Throwable {
		helper();
		Spr.viewReportFn();
	}

	@When("^Click Download icon to download as excel$")
	public void click_Download_icon_to_download_as_excel() throws Throwable {
		helper();
		Spr.downloadFn();
	}
	
	@When("^Verify the downloaded excel named as \"(.*?)\"$")
	public void verify_the_downloaded_excel_named_as(String file) throws Throwable {
		helper();
		Spr.DwnldTempVerificatnFn(file);
	}

}
