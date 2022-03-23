package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;

public class StudentDataBulkUploadSteps extends BaseClass{
	
	@Given("^Navigate to Report and select Student submenu$")
	public void navigate_to_Report_and_select_Student_submenu() throws Throwable {
	    
		helper();
		
		sdbu.studentreportmenutoupload();
	}

	@Given("^click on Upload Student details icon$")
	public void click_on_Upload_Student_details_icon() throws Throwable {
	    
		sdbu.UploadStudentDetailsIcon();
	}

	@Given("^Click on Download Template link to view the download template options$")
	public void click_on_Download_Template_link_to_view_the_download_template_options() throws Throwable {
	    
		sdbu.downloadTemplateOptions();
	}

	@Given("^Click on INFO icon to view the instructions to fill the student upload template$")
	public void click_on_INFO_icon_to_view_the_instructions_to_fill_the_student_upload_template() throws Throwable {
	    
		sdbu.infoButton();
	}

	@Given("^Click on Empty Template to download an empty student template$")
	public void click_on_Empty_Template_to_download_an_empty_student_template() throws Throwable {
	    
		sdbu.EmptyTemplate();
	}

	@Given("^Click on Edit Template to download student template with the existing student details$")
	public void click_on_Edit_Template_to_download_student_template_with_the_existing_student_details() throws Throwable {
	    
		sdbu.editTemplate();
	}

	@Given("^Make changes in the template and Click on the browse button to select the saved file, enter the file name and click upload$")
	public void make_changes_in_the_template_and_Click_on_the_browse_button_to_select_the_saved_file_enter_the_file_name_and_click_upload() throws Throwable {
	    
		sdbu.templateUpload();
	}

	@Given("^If there are errors in the uploaded file, the error log will be downloaded automatically$")
	public void if_there_are_errors_in_the_uploaded_file_the_error_log_will_be_downloaded_automatically() throws Throwable {
	    
		sdbu.Errorlog();
	}

}
