package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;
public class SponsorUploadSteps extends BaseClass{
	
	@Given("^click sponsorship menu and click Sponsor upload submenu$")
	public void click_sponsorship_menu_and_click_Sponsor_upload_submenu() throws Throwable {
		helper();
		//spru = new pageObject.SponsorUpload(driver);
		spru.Sponsorshipsponsormenu();
	}

	@Given("^click sponsor download template$")
	public void click_sponsor_download_template() throws Throwable {
		spru.downloadsponsortemplate();
	}

	@Given("^Enter the sponsor file name and choose the file and click upload button$")
	public void enter_the_sponsor_file_name_and_choose_the_file_and_click_upload_button() throws Throwable {
		spru.sponsorUpload();
	}



}
