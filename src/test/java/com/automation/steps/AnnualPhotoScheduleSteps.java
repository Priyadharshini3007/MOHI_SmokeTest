package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;


public class AnnualPhotoScheduleSteps extends BaseClass {

	@When("^navigate to center menu and click AnnualPhotoSchedule submenu$")
	public void navigate_to_center_menu_and_click_AnnualPhotoSchedule_submenu() throws Throwable {
		helper();
		aps.CenterMenuAnnualPhotoSchedhule();
	}

	@When("^update the center photo schedule date and click save$")
	public void update_the_center_photo_schedule_date_and_click_save() throws Throwable {
		aps.updatePhotoSchedhuledate();
	}

	@When("^login as a socialworker and verify the alert in MyAlerts$")
	public void login_as_a_socialworker_and_verify_the_alert_in_MyAlerts() throws Throwable {
		aps.photoschedulelinkpresent();
		
	}
}
