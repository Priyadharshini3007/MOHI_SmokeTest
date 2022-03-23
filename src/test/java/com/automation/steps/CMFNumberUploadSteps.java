package com.automation.steps;

import cucumber.api.java.en.Given;
//import pageObject.BaseClass;
import com.automation.pages.BaseClass;

public class CMFNumberUploadSteps extends BaseClass{
	
	
	@Given("^click sponsorship menu and click CMF upload submenu$")
	public void click_sponsorship_menu_and_click_CMF_upload_submenu() throws Throwable {
		helper();
		//cmf = new pageObject.CMFNumberUpload(driver);
		cmf.Sponsorshipmenu();
	}

	@Given("^click download template$")
	public void click_download_template() throws Throwable {
		cmf.downloadtemplate();
	}

	@Given("^Enter the file name and choose the file and click upload button$")
	public void enter_the_file_name_and_choose_the_file_and_click_upload_button() throws Throwable {
		cmf.Upload();
	}



}
