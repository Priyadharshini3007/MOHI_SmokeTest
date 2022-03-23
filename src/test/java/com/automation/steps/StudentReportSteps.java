package com.automation.steps;
import com.automation.pages.BaseClass;
import cucumber.api.java.en.Given;


public class StudentReportSteps extends BaseClass{
	
	
	@Given("^Select reports menu and select student submenu$")
	public void select_reports_menu_and_select_student_submenu() throws Throwable {
		/*sr = new pageObject.StudentReport(driver);
		hta= new pageObject.HeadTeacherApproval(driver);*/
		helper();
		sr.studentreportmenu();
	}

	@Given("^click go$")
	public void click_go() throws Throwable {
		
		 sr.gobutton();
	}

	@Given("^select the student profileReport$")
	public void select_the_student_profileReport() throws Throwable {
		
		sr.studentprofilereport();
		
		//hta= new pageObject.HeadTeacherApproval(driver);
		
	}
	
	@Given("^select the student recruitmentApprovalReport$")
	public void select_the_student_recruitmentApprovalReport() throws Throwable {
		sr.recruitmentApprovalReport();
	}

	@Given("^select the student familVisitReport$")
	public void select_the_student_familVisitReport() throws Throwable {
		sr.familVisitReport();
	}

	@Given("^select the student pulloutReport$")
	public void select_the_student_pulloutReport() throws Throwable {
		sr.pulloutReport();
	}

	@Given("^select the student readmissionReport$")
	public void select_the_student_readmissionReport() throws Throwable {
		sr.readmissionReport();
	}

	@Given("^select the student rankReport$")
	public void select_the_student_rankReport() throws Throwable {
		sr.rankReport();
	}

	@Given("^select the student giftReport$")
	public void select_the_student_giftReport() throws Throwable {
		sr.giftReport();
	}

	@Given("^select the student feeDepositReport$")
	public void select_the_student_feeDepositReport() throws Throwable {
		sr.feeDepositReport();
	}

	@Given("^select the student feeChangeReport$")
	public void select_the_student_feeChangeReport() throws Throwable {
		sr.feeChangeReport();
	}

	@Given("^select the student sectionChangeReport$")
	public void select_the_student_sectionChangeReport() throws Throwable {
		sr.sectionChangeReport();
	}


	
	
	@Given("^Select the student to view the birthcertificatenotgiven report$")
	public void Select_the_student_to_view_the_birthcertificatenotgiven_report() throws Throwable {
		sr.birthcertificatenumber();
		
		
	}
	
	@Given("^Select the disablestudent to view the disable report$")
	public void Select_the_disablestudent_to_view_the_disable_report() throws Throwable {
		sr.disablestudent();
		
		
	}
	
	@Given("^Select CMF Photo schedule icon to update the CMF Schedule$")
	public void Select_CMF_Photo_schedule_icon_to_update_the_CMF_Schedule() throws Throwable {
		sr.photoschedulereport();
		
		
	}
	
	
	


}
