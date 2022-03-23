package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.And;

public class AcademicTermEntrySteps extends BaseClass {
	
	@And("^Navigate to studentmenu and select Academic Term Entry submenu$")
	public void navigate_to_studentmenu_and_select_Academic_Term_Entry_submenu() throws Throwable {
		helper();
	   academictermentry.academicTermSubMenu();
	}

	@And("^Click Add Academic Term button$")
	public void click_Add_Academic_Term_button() throws Throwable {
		academictermentry.addAcademicTerm();
	}

	@And("^Select the range for Term I duration$")
	public void select_the_range_for_Term_I_duration() throws Throwable {
	   academictermentry.addTerm1StartDuration();
	   academictermentry.addTerm1EndDuration();
	}

	@And("^Select the range for Term II duration$")
	public void select_the_range_for_Term_II_duration() throws Throwable {
		academictermentry.addTerm2StartDuration();
		academictermentry.addTerm2EndDuration();
	}

	@And("^Select the range for Term III duration$")
	public void select_the_range_for_Term_III_duration() throws Throwable {
		academictermentry.addTerm3StartDuration();
		academictermentry.addTerm3EndDuration();
	}

	@And("^Click save to save the Academic term details$")
	public void click_save_to_save_the_Academic_term_details() throws Throwable {
		academictermentry.saveAcademicTerms();
	}
	
	@And("^Verify the out ofrange dates got disable and unable to select$")
	public void verify_the_out_ofrange_dates_got_disable_and_unable_to_select() throws Throwable {
		academictermentry.verfifyDate();
	}


}
