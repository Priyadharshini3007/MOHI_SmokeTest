package com.automation.steps;

import cucumber.api.java.en.When;
import com.automation.pages.BaseClass;

public class LpoRequisitionSummaryRepSteps extends BaseClass{
	
	@When("^Select the center as \"(.*?)\"$")
	public void select_the_center(String center) throws Throwable {
		helper();
		lporequisition.centerFn(center);
	}

	@When("^Select the Month as \"(.*?)\"$")
	public void select_the_Month(String month) throws Throwable {
		lporequisition.monthFn(month);
	}

	@When("^Select the Year as \"(.*?)\"$")
	public void select_the_Year(String year) throws Throwable {
		lporequisition.yearFn(year);
	}
	
	
	@When("^Click the LPO Requisition Summary View Report button$")
	public void click_the_LPO_Requisition_Summary_View_Report_button() throws Throwable {
		lporequisition.btnLpoReq();
	}

}
