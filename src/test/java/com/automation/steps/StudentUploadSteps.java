package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;

public class StudentUploadSteps extends BaseClass {
	
	@When("^Click the student CMF photo scheduled today$")
	public void click_the_student_CMF_photo_scheduled_today() throws Throwable {
		helper();
		//su = new StudentUpload(driver);
		su.CMFphotoscheduletodaylink();
	}

	@When("^enter the student name to upload photo and click on the view profile icon$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon() throws Throwable {
	    su.enterthestudentnametoupload();
	}

	@When("^click on upload CMF photo$")
	public void click_on_upload_CMF_photo() throws Throwable {
		helper();
		su.UploadCMFPhotolink();
	}

	@When("^Click on the choose file and upload button$")
	public void click_on_the_choose_file_and_upload_button() throws Throwable {
		
		su.ChooseFile();
	}
	@When("^Click on update photo schedule from my functions$")
	public void click_on_update_photo_schedule_from_my_functions() throws Throwable {
	
         helper();
		su.UpdatePhotoscheduleLink();
	}

	@When("^enter the student name to update the photo schedule and click camera icon$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon() throws Throwable {
		
		su.ClickTheCameraIcon();
	}
	@When("^navigate to dashboard and select my dashboard$")
	public void navigate_to_dashboard_and_select_my_dashboard() throws Throwable {
		
		 su.MyDashboard();
	}



	@When("^enter the date and save$")
	public void enter_the_date_and_save() throws Throwable {
		su.SaveTheUpdatedDate();
	}

	@When("^select the schedule today click and uplaod the student photo$")
	public void select_the_schedule_today_click_and_uplaod_the_student_photo() throws Throwable {
	  
		su.CMFphotoscheduletodaylink();
		su.enterthestudentnametoupload();
		su.UploadCMFPhotolink();
		su.ChooseFile();
	}




	
	

}
