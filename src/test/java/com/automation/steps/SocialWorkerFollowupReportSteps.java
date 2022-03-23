package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;

public class SocialWorkerFollowupReportSteps extends BaseClass {
	
	
	@Given("^click report menu and click SocialworkerFollowup submenu$")
	public void click_report_menu_and_click_SocialworkerFollowup_submenu() throws Throwable {
		
		helper();
		
		swfr.socialWorkerFollowuReportmenu();
	}

	@Given("^Select the follow-up reason, enter the date range and select the follow-up status and click on the go button to retrieve the student details$")
	public void select_the_follow_up_reason_enter_the_date_range_and_select_the_follow_up_status_and_click_on_the_go_button_to_retrieve_the_student_details() throws Throwable {
		
		swfr.socialWorkerFollowupSearch();
	}

	@Given("^click on the follow up pending icon to enter the follow-up details$")
	public void click_on_the_follow_up_pending_icon_to_enter_the_follow_up_details() throws Throwable {
		
		swfr.followUpPendingicon();
	}

	@Given("^click on the follow up completed icon to view the follow-up details$")
	public void click_on_the_follow_up_completed_icon_to_view_the_follow_up_details() throws Throwable {
	    
		swfr.Followupcompletedicon();
	}

	@Given("^Click on the view student profile icon to view the student profile and click on the social worker follow up history link to view the history of social worker follow-ups done for the child$")
	public void click_on_the_view_student_profile_icon_to_view_the_student_profile_and_click_on_the_social_worker_follow_up_history_link_to_view_the_history_of_social_worker_follow_ups_done_for_the_child() throws Throwable {
	 
		swfr.studentprofileicon();
	}

	@Given("^click on the view student in student report icon to get the student filtered in the student report$")
	public void click_on_the_view_student_in_student_report_icon_to_get_the_student_filtered_in_the_student_report() throws Throwable {
		
		swfr.viewstudentinstudentreport();
	   
	}

	@Given("^click view student in parent contribution report icon to get the student filtered in the parent contribution report\\.$")
	public void click_view_student_in_parent_contribution_report_icon_to_get_the_student_filtered_in_the_parent_contribution_report() throws Throwable {
		
		swfr.parentcontributionicon();
	}

}
