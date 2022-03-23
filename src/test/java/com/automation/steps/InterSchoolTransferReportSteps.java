package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;

public class InterSchoolTransferReportSteps extends BaseClass {
	
	@Given("^click report menu and click InterSchoolTransfer submenu$")
	public void click_report_menu_and_click_InterSchoolTransfer_submenu() throws Throwable {
		helper();
		istr.interschoolreportmenu();
	}

	@Given("^report can be filtered based on the From center,From School,To Center,To School,Transfer type, WorkFlow Step,Awaiting for Approval,From date,To Date and CMFID$")
	public void report_can_be_filtered_based_on_the_From_center_From_School_To_Center_To_School_Transfer_type_WorkFlow_Step_Awaiting_for_Approval_From_date_To_Date_and_CMFID() throws Throwable {
		istr.filterTransferReport();
	}

	@Given("^click on view report to view the transfer report$")
	public void click_on_view_report_to_view_the_transfer_report() throws Throwable {
		istr.viewTransferReport();
	}

	@Given("^click download to dowload the transfer report in specified format$")
	public void click_download_to_dowload_the_transfer_report_in_specified_format() throws Throwable {
		istr.exportTransferReport();
	}



}
