package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;

public class FamilyVisitSummaryReportSteps extends BaseClass{
	
	@Given("^click report menu and click FamilyVisit Summary submenu$")
	public void click_report_menu_and_click_FamilyVisit_Summary_submenu() throws Throwable {
		helper();
		fvsr.familyvisitsummaryreportmenu();
	}

	@Given("^report can be filtered based on the center, social worker, family visit year, term, month and CMF ID$")
	public void report_can_be_filtered_based_on_the_center_social_worker_family_visit_year_term_month_and_CMF_ID() throws Throwable {
		fvsr.familyvisitsummarysearch();
	}

	@Given("^click on view fvreport$")
	public void click_on_view_report() throws Throwable {
		fvsr.familyvisitreportbtn();
	}

	@Given("^click download to dowload the report in specified format$")
	public void click_download_to_dowload_the_report_in_specified_format() throws Throwable {
	
		fvsr.familyvisitexport();
	}



}
