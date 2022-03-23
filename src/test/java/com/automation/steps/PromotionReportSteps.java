package com.automation.steps;

import cucumber.api.java.en.Given;
import com.automation.pages.BaseClass;

public class PromotionReportSteps extends  BaseClass{
	
	
	@Given("^click report and promotion submenu$")
	public void click_report_and_promotion_submenu() throws Throwable {
		helper();
		pr.promotionreportmenu();
	}

	@Given("^select the year$")
	public void select_the_year() throws Throwable {
		pr.year();
	}

	@Given("^select the center$")
	public void select_the_center() throws Throwable {
	  pr.center();
	}

	@Given("^select the school$")
	public void select_the_school() throws Throwable {
	   pr.school();
	}

	@Given("^select the class$")
	public void select_the_class() throws Throwable {
	 pr.classnme();
	}

	@Given("^select view report$")
	public void select_view_report() throws Throwable {
	pr.viewreport();
	}
	
	

	

}
