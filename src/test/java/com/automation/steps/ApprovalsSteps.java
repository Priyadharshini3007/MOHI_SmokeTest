package com.automation.steps;

import com.automation.pages.BaseClass;
import com.automation.utils.AssertionUtils;
import com.automation.utils.WebElementUtils;

import cucumber.api.java.en.When;


public class ApprovalsSteps extends BaseClass{

	
	
	@When("^CSC click on the approval link in the myalerts tab$")
	public void csc_click_on_the_approval_link_in_the_myalerts_tab() throws Throwable {
		helper();
		hta.headteacherapprovallink();
	}

	@When("^CSC enter the student name and click on approval icon$")
	public void csc_enter_the_student_name_and_click_on_approval_icon() throws Throwable {
	
		hta.headteacherstudentapproval();
	}

	@When("^CSC should navigate to finalpage and click Approve$")
	public void csc_should_navigate_to_finalpage_and_click_Approve() throws Throwable {
	   
		hta.headteacherfinalapprovalpage();
	}
	
	@When("^CSC should navigate to finalpage and click denied$")
	public void csc_should_navigate_to_finalpage_and_click_denied() throws Throwable {
		//hta.headteacherapprovaldenied();
		hta.cscapprovaldenied();
	}

	
	@When("^CSC logout from the page$")
	public void csc_logout_from_the_page() throws Throwable {
	    hta.logout();
	}
	



	/*@When("^click save$")
	public void click_save() throws Throwable {
		su.SaveTheUpdatedDate();
	}*/
	

	/*@When("^select the schedule today click and uplaod the student photo$")
	public void select_the_schedule_today_click_and_uplaod_the_student_photo() throws Throwable {
	  
		su.CMFphotoscheduletodaylink();
		su.enterthestudentnametoupload();
		su.UploadCMFPhotolink();
		su.ChooseFile();
	}*/
	
	@When("^CSC should navigate to finalpage and click sendforclarification$")
	public void csc_should_navigate_to_finalpage_and_click_sendforclarification() throws Throwable {
		helper();
		//hta = new HeadTeacherApproval(driver);
		hta.cscneedmoreinformation();
		
		hta.logout();
		
		lp.htusername();
		lp.submit();
		
		lp.secquestion();
		lp.submit();
		
		lp.password();
		lp.submit();
		
		hta.htclarificationlink();
		
		hta.cscsendforclarificationStudent();
		
		hta.savewhenreceivedmoreinformationfromsw();
		
		hta.enterswdetailsforcscresumbission();
		
		hta.logout();
		
		lp.cscusername();
		lp.submit();
		

		lp.secquestion();
		lp.submit();
		
		lp.password();
		lp.submit();
		
		hta.cscclicksreceivedmoreinformationlink();
		
		hta.cscsendforclarificationStudent();
		
		hta.headteacherfinalapprovalpage();
		
	}
	@When("^CSC navigate to finalpage and click send for clarification to socialworker$")
	public void csc_navigate_to_finalpage_and_click_send_for_clarification_to_socialworker() throws Throwable {
		
		
	
		hta.cscsendclarificationtosw();
		
		hta.logout();
		
		
		
		lp.SwSetUsername();
		lp.submit();
		
		lp.secquestion();
		lp.submit();
		
		lp.password();
		lp.submit();
		
		Thread.sleep(1000);
		
		hta.swneedmoreinformationlink();
		
		hta.cscsendforclarificationStudenttosw();
		
		hta. swswndclarification();
		
		hta.logout();
		
		lp.cscusername();
		lp.submit();
		
		lp.secquestion();
		lp.submit();
		
		lp.password();
		lp.submit();
		
		hta.cscreceivedmoreinformationlink();
		
		hta.cscsendforclarificationStudenttosw();
		
		hta.appfromcscafterreceivedmoreinfofromsw();
		
		hta.logout();
		
		lp.csmusername();
		lp.submit();
		
		lp.secquestion();
		lp.submit();
		
		lp.password();
		lp.submit();
	
		hta.headteacherapprovallink();
		
		hta.cscsendforclarificationStudenttosw();
		
		hta.csmapprovalpage1();
		
	
	}

	@When("^CSM navigate to finalpage and click send for clarification to socialworker$")
	public void csm_navigate_to_finalpage_and_click_send_for_clarification_to_socialworker() throws Throwable {
	    
		
		hta.csmsendclarificationtosw();
		
		hta.logout();
		
		
		
		lp.SwSetUsername();
		lp.submit();
		
		lp.secquestion();
		lp.submit();
		
		lp.password();
		lp.submit();
		
		hta.swneedmoreinformationlink();
		
		hta.csmsendforclarificationStudenttosw();
		
		hta.swswndclarification();
		
		hta.logout();
		
		lp.csmusername();
		lp.submit();
		
		lp.secquestion();
		lp.submit();
		
		lp.password();
		lp.submit();
		
		hta.csmreceivedmoreinformationlink();
		
		hta.csmsendforclarificationStudenttosw();
		
		hta.csmapprovalpage1();
	
	
	}
	
	@When("^CSM click on the approval link in the myalerts tab$")
	public void csm_click_on_the_approval_link_in_the_myalerts_tab() throws Throwable {
		helper();
		//hta = new pageObject.HeadTeacherApproval(driver);
		hta.headteacherapprovallink();
	}

	@When("^CSM enter the student name and click on approval icon$")
	public void csm_enter_the_student_name_and_click_on_approval_icon() throws Throwable {
		hta.headteacherstudentapproval();
	}

	@When("^CSM should navigate to finalpage and click Approve$")
	public void csm_should_navigate_to_finalpage_and_click_Approve() throws Throwable {
		hta.headteacherfinalapprovalpage();
	}
	
	

	@When("^CSM should navigate to finalpage and click denied$")
	public void csm_should_navigate_to_finalpage_and_click_denied() throws Throwable {
		hta.csmapprovaldenied();
	}
	
	@When("^CSM logout from the page$")
	public void csm_logout_from_the_page() throws Throwable {
	  hta.logout();
	}
	
	@When("^CSM should navigate to finalpage and click sendforclarification$")
	public void csm_should_navigate_to_finalpage_and_click_sendforclarification() throws Throwable {
		
		
		
		hta.csmneedmoreinformation();
		
		hta.logout();
		
	
		lp.cscusername();
		lp.submit();
		
		lp.secquestion();
		lp.submit();
		
		lp.password();
		lp.submit();
		
		hta.studentrecruitmentneedmoreclarification(); 
		
		hta.csmsendforclarificationStudent();
		
		hta.csmsendclarificationbutton();
		
		hta.logout();
		
		lp.csmusername();
		lp.submit();
		
		lp.secquestion();
		Thread.sleep(1000);
		lp.submit();
		
		lp.password();
		lp.submit();
		
		hta.csmreceivemoreinformationlink();
		
		hta.csmsendforclarificationStudent();
		
		hta.csmresubmissionapproval();
		
		
		
	}
	@When("^headteacher click on the approval link in the myalerts tab$")
	public void headteacher_click_on_the_approval_link_in_the_myalerts_tab() throws Throwable {
	   	helper();
		
		hta.headteacherapprovallink();
	}

	@When("^headteacher enter the student name and click on approval icon$")
	public void headteacher_enter_the_student_name_and_click_on_approval_icon() throws Throwable {
	    
	
		hta.headteacherstudentapproval();
	
	
	}
	
	@When("^headteacher enter the student name for CSC Denied$")
	public void headteacher_enter_the_student_name_for_CSC_Denied() throws Throwable {
	    
	
		hta.cscDeniedStudent();
	
	
	}
	
	@When("^headteacher enter the student name for CSM Denied$")
	public void headteacher_enter_the_student_name_for_CSM_Denied() throws Throwable {
	    
	
		hta.csmDeniedStudent();
	
	
	}
	
	@When("^headteacher enter the student name for HT Denied$")
	public void headteacher_enter_the_student_name_for_HT_Denied() throws Throwable {
	    
	
		hta.HTDeniedStudent();
	
	
	}
	
	@When("^headteacher enter the student name and click on send for clarification icon$")
	public void headteacher_enter_the_student_name_and_click_on_send_for_clarification_icon() throws Throwable {
	    
	
		hta.htsendforclarificationStudent();
	
	
	}

	

	@When("^CSC enter the student name and click on send for clarification icon$")
	public void CSC_enter_the_student_name_and_click_on_send_for_clarification_icon() throws Throwable {
	    
	
		hta.cscsendforclarificationStudent();
	
	
	}
	
	@When("^CSC enter the student name and click on send for clarification icon to sw$")
	public void CSC_enter_the_student_name_and_click_on_send_for_clarification_icon_to_sw() throws Throwable {
	    
		
		hta.cscsendforclarificationStudenttosw();
	
	
	}
	
	@When("^CSM enter the student name and click on send for clarification icon to sw$")
	public void CSM_enter_the_student_name_and_click_on_send_for_clarification_icon_to_sw() throws Throwable {
	    
		
		hta.csmsendforclarificationStudenttosw();
	
	
	}

	
	@When("^CSM enter the student name and click on send for clarification icon$")
	public void CSM_enter_the_student_name_and_click_on_send_for_clarification_icon() throws Throwable {
	    
	
		hta.csmsendforclarificationStudent();
	
	
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo() throws Throwable {
		
		hta.schoolinfo();
	}

	@When("^headteacher should navigate to feeinfo page and save the feeinfo$")
	public void headteacher_should_navigate_to_feeinfo_page_and_save_the_feeinfo() throws Throwable {
	  
		hta.feeinfo();
	}

	@When("^headteacher should navigate to finalpage and click Approve$")
	public void headteacher_should_navigate_to_finalpage_and_click_Approve() throws Throwable {
	    
		hta.enterswdetails();
		
	}
	
	@When("^headteacher should navigate to finalpage and click denied$")
	public void headteacher_should_navigate_to_finalpage_and_click_denied() throws Throwable {
	   hta.headteacherapprovaldenied();
	}


	

	@When("^headteacher logout from the page$")
	public void headteacher_logout_from_the_page() throws Throwable {
	  helper();
	  hta.logout();
	}


@When("^headteacher should navigate to finalpage and click sendforclarification$")
	
	public void headteacher_should_navigate_to_finalpage_and_click_sendforclarification() throws Throwable {
   
		hta.headteachersendforclarification();

		lp.SwSetUsername();
		lp.submit();

		lp.secquestion();
		lp.submit();

		lp.password();
		lp.submit();

		hta.swneedmoreinformation();

		hta.htsendforclarificationStudent();
		
		hta.swresubmission();

		hta.logout();

		lp.htusername();
		lp.submit();

		lp.secquestion();
		Thread.sleep(1000);
		lp.submit();

		lp.password();
		lp.submit();

		hta.headteacheraftergettinginformationapprovallink();

		hta.htsendforclarificationStudent();

		hta.schoolinforesubmission();
		
		hta.feeinfo();
		
		//hta.savewhenreceivedmoreinformationfromsw();

		hta.enterswdetails();

		
}





}
