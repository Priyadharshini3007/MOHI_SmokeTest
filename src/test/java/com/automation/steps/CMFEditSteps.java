package com.automation.steps;

import cucumber.api.java.en.Given;
//import pageObject.BaseClass;
import com.automation.pages.BaseClass;

public class CMFEditSteps extends BaseClass{
	
	@Given("^click on sponsorshipmenu and click cmf edit submenu$")
	public void click_on_sponsorshipmenu_and_click_cmf_edit_submenu() throws Throwable {
		//cmfe = new pageObject.CMFEdit(driver);
		helper();
		cmfe.Sponsorshipmenucmfedit();
	}

	@Given("^search the student and click remove student CMFID$")
	public void search_the_student_and_click_remove_student_CMFID() throws Throwable {
		cmfe.searchTheStudentToeditCMFID();
	}

	@Given("^search new cmf id and click assign cmfid button$")
	public void search_new_cmf_id_and_click_assign_cmfid_button() throws Throwable {
		cmfe.searchnewCMFID();
	}

	
	@Given("^when resuable is no$")
	public void when_resuable_is_no() throws Throwable {
		cmfe.searchTheStudentnoresuable();
	}
	
	
	@Given("^logout from the page$")
	public void logout_from_the_page() throws Throwable {
		//cmfe = new pageObject.CMFEdit(driver);
		helper();
		cmfe.logoutfromcmfedit();
	}
	
	

}
