package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.When;


public class SpecialAttendanceUploadSteps extends BaseClass{
	
	@When("^click the Download Template link$")
	public void click_the_Download_Template_link() throws Throwable {
		helper();
		Spu.DownloadTempFn();
	}

	@When("^Verify the downloaded excel$")
	public void verify_the_downloaded_excel() throws Throwable {
		String file = "SpecialAttendanceUploadTemplate.xlsx";
		Spu.DwnldTempVerificatnFn(file);
	}

	@When("^Enter the filename as \"(.*?)\"$")
	public void enter_the_filename_as(String fileName) throws Throwable {
		helper();
		Spu.FileNameFn(fileName);
	}
	
	@When("^Select the Term as \"(.*?)\"$")
	public void select_the_Term_as(String TermID) throws Throwable {
		Spu.TermIDFn(TermID);
	}

	@When("^Select the file and upload$")
	public void select_the_file_and_upload() throws Throwable {
		Spu.SpecialAttendanceUploadFn();
	}

	@When("^Click upload button$")
	public void click_upload_button() throws Throwable {
		helper();
		Spu.uploadFn();
	}
	
	@When("^Verify the confirmation message$")
	public void verify_the_confirmation_message() throws Throwable {
		Spu.splAttUpUserIntMgFn();
	}
	
	@When("^Select the student type and click GO search button$")
	public void Select_the_student_type_and_click_GO_search_button() throws Throwable {
		Spu.StudentTypeFn();
	}
	
	@When("^Enter the CMFID in search box and click search$")
	public void enter_the_CMFID_in_search_box_and_click_search() throws Throwable {
		Spu.CMFIDSearchFn();
	}
	
	@When("^verify the pull out icon for the above student$")
	public void verify_the_pull_out_icon_for_the_above_student() throws Throwable {
		Spu.pullOutIconFn();
	}
	
}
