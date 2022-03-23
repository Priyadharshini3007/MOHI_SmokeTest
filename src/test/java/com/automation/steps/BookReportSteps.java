package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;

public class BookReportSteps extends BaseClass{
	
	
	@Given("^click report menu and click Book submenu$")
	public void click_report_menu_and_click_Book_submenu() throws Throwable {
		helper();
		br.bookReportmenu();
	}

	@Given("^filter the Book assignment and choose edit and make the changes and click save$")
	public void filter_the_Book_assignment_and_choose_edit_and_make_the_changes_and_click_save() throws Throwable {
	 br.searchbook();
	 br.editbook();
	}

	
	
	

}
