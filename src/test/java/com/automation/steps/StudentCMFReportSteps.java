package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;
public class StudentCMFReportSteps extends BaseClass {
	
	
	@Given("^click report menu and click studentCMFReport submenu$")
	public void click_report_menu_and_click_studentCMFReport_submenu() throws Throwable {
		helper();
		scmfr.StudentCMFReportmenu();
	}

	@Given("^Select the Report criteria and center name from the dropdown$")
	public void select_the_Report_criteria_and_center_name_from_the_dropdown() throws Throwable {
		scmfr.StudentCMFReportcriteria();
	}

	@Given("^Set the Date range Both From and To$")
	public void set_the_Date_range_Both_From_and_To() throws Throwable {
		scmfr.FromDateandTodate();
	}

	@Given("^Click the Search button to view the report$")
	public void click_the_Search_button_to_view_the_report() throws Throwable {
		scmfr.Search();
	}

	@Given("^click download to dowload the excel$")
	public void click_download_to_dowload_the_excel() throws Throwable {
	   scmfr.Download();
	   Thread.sleep(3000);
	}



}
