package com.automation.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;

public class PullOutAndRe_AdmissionReportSteps extends BaseClass {

	@Given("^click report menu and click pullout report submenu$")
	public void click_report_menu_and_click_pullout_report_submenu() throws Throwable {

		helper();

		prr.PullOutReportMenu();
	}

	@Given("^Report can be filtered based on Type like Pull Out$")
	public void report_can_be_filtered_based_on_Type_like_Pull_Out() throws Throwable {

		prr.filterPullOutReport();
		prr.filterPullOut();
	}

	@Given("^click on view report to view the type of report selected from the dropdown$")
	public void click_on_view_report_to_view_the_type_of_report_selected_from_the_dropdown() throws Throwable {

		prr.viewPullOutReport();
	}

	@Given("^click download to dowload the selected Report in the specified format$")
	public void click_download_to_dowload_the_selected_Report_in_the_specified_format() throws Throwable {
		prr.pullOutReportDownload();
	}

	@And("^Report can be filtered based on Type like Re-Admission$")
	public void report_can_be_filtered_based_on_Type_like_Re_Admission() throws Throwable {

		prr.ReAdmissionReport();
		prr.filterPullOut();
	}

	@And("^Report can be filtered based on Type like Disabled$")
	public void report_can_be_filtered_based_on_Type_like_Disabled() throws Throwable {

		prr.DisabledReport();
		prr.DisablefilterPullOut();
	}

}
