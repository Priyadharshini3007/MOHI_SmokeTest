package com.automation.steps;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AllMenuNavigationSteps extends BaseClass{
	
		
	@When("^Select Admin menu$")
	public void select_Admin_menu() throws Throwable {
		helper();
		menunavigation.AdminMainMenu();
	}

	@When("^click User sub menu$")
	public void click_User_sub_menu() throws Throwable {
		helper();
		menunavigation.UserSubMenu();
	}

	@When("^click Role sub menu$")
	public void click_Role_sub_menu() throws Throwable {
		helper();
		menunavigation.RoleSubMenu();
	}

	@When("^click Organization sub menu$")
	public void click_Organization_sub_menu() throws Throwable {
		helper();
		menunavigation.OrganizationSubMenu();
	}

	@When("^click Email Template sub menu$")
	public void click_Email_Template_sub_menu() throws Throwable {
		helper();
		menunavigation.EmailTemplateSubMenu();
	}

	@When("^click Privilege sub menu$")
	public void click_Privilege_sub_menu() throws Throwable {
		helper();
		menunavigation.PrivilegeSubMenu();
	}

	@When("^click Menu as sub menu$")
	public void click_Menu_as_sub_menu() throws Throwable {
		helper();
		menunavigation.MenuSubMenu();
	}

	@When("^click Workflow sub menu$")
	public void click_Workflow_sub_menu() throws Throwable {
		helper();
		menunavigation.WorkflowSubMenu();
	}

	@When("^click Master Detail List sub menu$")
	public void click_Master_Detail_List_sub_menu() throws Throwable {
		helper();
		menunavigation.MasterDetailListSubMenu();
	}

	@When("^click Master Detail Entry sub menu$")
	public void click_Master_Detail_Entry_sub_menu() throws Throwable {
		helper();
		menunavigation.MasterDetEntrySubMenu();
	}
	
	@When("^click Notification Entry sub menu$")
	public void click_Notification_Entry_sub_menu() throws Throwable {
		helper();
		menunavigation.NotificationEntrysubmenu();
	}
	
	
	@When("^Select Book menu$")
	public void select_Book_menu() throws Throwable {
		helper();
		menunavigation.BookMainMenu();
	}

	@When("^click Book Assignment sub menu$")
	public void click_Book_Assignment_sub_menu() throws Throwable {
		helper();
		menunavigation.BookAssignmentSubMenu();
	}

	@When("^Select Dashboard menu$")
	public void select_Dashboard_menu() throws Throwable {
		helper();
		menunavigation.DashboardMainMenu();
	}

	@When("^click My Dashboard sub menu$")
	public void click_My_Dashboard_sub_menu() throws Throwable {
		helper();
		menunavigation.MyDashboardSubMenu();
	}

	@When("^Select Leave menu$")
	public void select_Leave_menu() throws Throwable {
		helper();
		menunavigation.LeaveMainMenu();
	}

	@When("^click Holidays sub menu$")
	public void click_Holidays_sub_menu() throws Throwable {
		helper();
		menunavigation.HolidaysSubMenu();
	}
	@When("^Select center menu$")
	public void select_center_menu() throws Throwable {
		helper();
		menunavigation.CenterMainMenu();
	}

	@When("^click class teacher entry sub menu$")
	public void click_class_teacher_entry_sub_menu() throws Throwable {
		helper();
		menunavigation.ClassTeacherEntrySubMenu();
	}

	@When("^click Annual Photo Schedule sub menu$")
	public void click_Annual_Photo_Schedule_sub_menu() throws Throwable {
		helper();
		menunavigation.AnnualPhotoScheduleSubMenu();
	}

	@When("^click Family Social Worker Assignment sub menu$")
	public void click_Family_Social_Worker_Assignment_sub_menu() throws Throwable {
		helper();
		menunavigation.FamSocialWrkrAsgnmntSubMenu();
	}
	@When("^Select exam menu$")
	public void select_exam_menu() throws Throwable {
		helper();
		menunavigation.ExamMainMenu();
	}

	@When("^click Exam entry sub menu$")
	public void click_Exam_entry_sub_menu() throws Throwable {
		helper();
		menunavigation.ExamEntrySubMenu();
	}

	@When("^click Exam Results sub menu$")
	public void click_Exam_Results_sub_menu() throws Throwable {
		helper();
		menunavigation.ExamResultsSubMenu();		
	}

	@When("^click Invigilation Entry sub menu$")
	public void click_Invigilation_Entry_sub_menu() throws Throwable {
		helper();
		menunavigation.InvigilationEntSubMenu();
	}

	@When("^click Subject Grading Entry sub menu$")
	public void click_Subject_Grading_Entry_sub_menu() throws Throwable {
		helper();
		menunavigation.SubjGradEntSubMenu();
	}
	@When("^Select employee menu$")
	public void select_employee_menu() throws Throwable {
		helper();
		menunavigation.Employee();
	}

	@When("^click Employee Recruitment sub menu$")
	public void click_Employee_Recruitment_sub_menu() throws Throwable {
		helper();
		menunavigation.EmployeeRecruitment();
	}

	@When("^click Employee list sub menu$")
	public void click_Employee_list_sub_menu() throws Throwable {
		helper();
		menunavigation.EmployeeList();
	}

	@When("^click Employee leave sub menu$")
	public void click_Employee_leave_sub_menu() throws Throwable {
		helper();
		menunavigation.EmployeeLeave();
	}

	@When("^click staff promotion report sub menu$")
	public void click_staff_promotion_report_sub_menu() throws Throwable {
		helper();
		menunavigation.StaffPromotion();
	}
	@When("^Select FAST menu$")
	public void select_FAST_menu() throws Throwable {
		helper();
		menunavigation.FASTMainMenu();
	}

	@When("^click Assessment Generation sub menu$")
	public void click_Assessment_Generation_sub_menu() throws Throwable {
		helper();
		menunavigation.AssessmentGenSubMenu();
	}

	@When("^click Assessment Schedules Report sub menu$")
	public void click_Assessment_Schedules_Report_sub_menu() throws Throwable {
		helper();
		menunavigation.AssessmentSchedulesRepSubMenu();
	}

	@When("^click Assessment Report sub menu$")
	public void click_Assessment_Report_sub_menu() throws Throwable {
		helper();
		menunavigation.AssessmentRepSubMenu();
	}

	@When("^click Assessment Analysis Report sub menu$")
	public void click_Assessment_Analysis_Report_sub_menu() throws Throwable {
		helper();
		menunavigation.AssessmentAnalysisRepSubMenu();
	}

	@When("^click Assessment Chart sub menu$")
	public void click_Assessment_Chart_sub_menu() throws Throwable {
		helper();
		menunavigation.AssessmentChartSubMenu();
	}

	@When("^click Fast Activity Report sub menu$")
	public void click_Fast_Activity_Report_sub_menu() throws Throwable {
		helper();
		menunavigation.FastActivityRepSubMenu();
	}
	@Given("^Click the unpaid leave update reminder alert$")
	public void click_the_unpaid_leave_update_reminder_alert() throws Throwable {
		helper();	
		menunavigation.unpaidLeaveUpdateReminderAl();
	}

	@Given("^Click the students bio information not updated alert$")
	public void click_the_students_bio_information_not_updated_alert() throws Throwable {
		helper();
		menunavigation.bioInformationNotUpdatedAl();
	}

	@Given("^Click the cash only requisitions with the cheque number alert$")
	public void click_the_cash_only_requisitions_with_the_cheque_number_alert() throws Throwable {
		helper();
		menunavigation.chequeNumberSignedNotYetCollectedAl();
	}

	@Given("^Click the cash only requisitions waiting for director alert$")
	public void click_the_cash_only_requisitions_waiting_for_director_alert() throws Throwable {
		helper();
		menunavigation.cheqNoEnteredWaitingForDirSignAl();
	}

	@Given("^Click the cash only requisitions waiting for cheque writing alert$")
	public void click_the_cash_only_requisitions_waiting_for_cheque_writing_alert() throws Throwable {
		helper();
		menunavigation.approvedCashOnlyRequisitionsAl();
	}

	@Given("^Click the cumulative overdue fee alert$")
	public void click_the_cumulative_overdue_fee_alert() throws Throwable {
		helper();
		menunavigation.cummulativeOverdueAl();
	}

	@Given("^Click the fee deposits without the bank deposit slip no alert$")
	public void Click_the_fee_deposits_without_the_bank_deposit_slip_no_alert() throws Throwable {
		helper();
		menunavigation.feeDepositWithoutSlipAl();
	}

	@Given("^Click the Fee Schedule Today alert$")
	public void click_the_Fee_Schedule_Today_alert() throws Throwable {
		helper();
		menunavigation.feeScheduleTodayAl();
	}

	@Given("^Click the overdue fee payments alert$")
	public void click_the_overdue_fee_payments_alert() throws Throwable {
		helper();
		menunavigation.overdueFeePaymentsAl();
	}

	@Given("^Click the Assessments not carried out yet alert$")
	public void click_the_Assessments_not_carried_out_yet_alert() throws Throwable {
		helper();
		menunavigation.AssessmentsNotCarriedOutAl();
	}
	@Given("^User is in dashboard$")
	public void user_is_in_dashboard() throws Throwable {
		helper();
		menunavigation.DashboardFn();
	}
	
	@Given("^Click Employee Collapse button$")
	public void click_Employee_Collapse_button() throws Throwable {
		helper();
		menunavigation.CollapseEmployeeButton();
		
	}

	@Given("^Click Student Collapse button$")
	public void click_Student_Collapse_button() throws Throwable {
		helper();
		menunavigation.CollapseStudentButton();
	  
	}

	@Given("^Click Requisition Collapse button$")
	public void click_Requisition_Collapse_button() throws Throwable {
		helper();
		menunavigation.CollapseRequisitionButton();
	}


	@When("^Click Enroll Student from My Functions$")
	public void click_Enroll_Student_from_My_Functions() throws Throwable {
		helper();
		menunavigation.EnrollStudentFn();
	}

	@When("^Click Fee Deposit from My Functions$")
	public void click_Fee_Deposit_from_My_Functions() throws Throwable {
		helper();
		menunavigation.FeeDepositFn();
	}

	@When("^Click Upload CMF Numbers from My Functions$")
	public void click_Upload_CMF_Numbers_from_My_Functions() throws Throwable {
		helper();
		menunavigation.UploadCMFNumbersFn();
	}

	@When("^Click Upload Sponsorship details from My Functions$")
	public void click_Upload_Sponsorship_details_from_My_Functions() throws Throwable {
		helper();
		menunavigation.UploadSponsorshipDetailsFn();
	}

	@When("^Click Update Photo Schedules from My Functions$")
	public void click_Update_Photo_Schedules_from_My_Functions() throws Throwable {
		helper();
		menunavigation.UpdatePhotoSchedulesFn();
	}

	@When("^Click Upload Students CMF Photo from My Functions$")
	public void click_Upload_Students_CMF_Photo_from_My_Functions() throws Throwable {
		helper();
		menunavigation.UploadStudentsCMFPhotoFn();
	}

	@When("^Click Assign Social workers for family from My Functions$")
	public void click_Assign_Social_workers_for_family_from_My_Functions() throws Throwable {
		helper();
		menunavigation.AssignSwforfamilyFn();
	}

	@When("^Click Make Promotion/Detainment/Section change for students from My Functions$")
	public void click_Make_Promotion_Detainment_Section_change_for_students_from_My_Functions() throws Throwable {
		helper();
		menunavigation.PromoSectionChngDetainFn();
	}

	@When("^Click Transfer Students to another Center from My Functions$")
	public void click_Transfer_Students_to_another_Center_from_My_Functions() throws Throwable {
		helper();
		menunavigation.TransferStudentsFn();
	}

	@When("^Click Invigilation Assignment from My Functions$")
	public void click_Invigilation_Assignment_from_My_Functions() throws Throwable {
		helper();
		menunavigation.InvigilationAssignmentFnFn();
	}

	@When("^Click Add Master Detail from My Functions$")
	public void click_Add_Master_Detail_from_My_Functions() throws Throwable {
		helper();
		menunavigation.AddMasterDetailFn();
	}

	@When("^Click Submit Requisition from My Functions$")
	public void click_Submit_Requisition_from_My_Functions() throws Throwable {
		helper();
		menunavigation.SubmitRequisitionFn();
	}

	@When("^Click Add Supplier from My Functions$")
	public void click_Add_Supplier_from_My_Functions() throws Throwable {
		helper();
		menunavigation.AddSupplierFn();
	}

	@When("^Click Create Inventory items from My Functions$")
	public void click_Create_Inventory_items_from_My_Functions() throws Throwable {
		helper();
		menunavigation.CreateInventoryItemsFn();
	}

	@When("^Click Mark Student Attendance from My Functions$")
	public void click_Mark_Student_Attendance_from_My_Functions() throws Throwable {
		helper();
		menunavigation.MarkStudentAttendanceFn();
	}

	@When("^Click Exam Management from My Functions$")
	public void click_Exam_Management_from_My_Functions() throws Throwable {
		helper();
		menunavigation.ExamManagementFn();
	}

	@When("^Click Publish Exam Result from My Functions$")
	public void click_Publish_Exam_Result_from_My_Functions() throws Throwable {
		helper();
		menunavigation.PublishExamResultFn();
	}

	@When("^Click Class Teacher Assignment from My Functions$")
	public void click_Class_Teacher_Assignment_from_My_Functions() throws Throwable {
		helper();
		menunavigation.ClassTeacherAssignmentFn();
	}

	@When("^Click Update Center Annual Photo Schedule from My Functions$")
	public void click_Update_Center_Annual_Photo_Schedule_from_My_Functions() throws Throwable {
		helper();
		menunavigation.UpdateCenterAnnualPhotoScheduleFn();
	}

	@When("^Click Visit Student Family from My Functions$")
	public void click_Visit_Student_Family_from_My_Functions() throws Throwable {
		helper();
		menunavigation.VisitStudentFamilyFn();
	}

	@When("^Click Subject Grading Assignment from My Functions$")
	public void click_Subject_Grading_Assignment_from_My_Functions() throws Throwable {
		helper();
		menunavigation.SubjectGradingAssgnmntFn();
	}

	@When("^Click Link supplier & item from My Functions$")
	public void click_Link_supplier_item_from_My_Functions() throws Throwable {
		helper();
		menunavigation.LinkSupplierItemFn();
	}

	@When("^Click Book Assignment from My Functions$")
	public void click_Book_Assignment_from_My_Functions() throws Throwable {
		helper();
		menunavigation.BookAssignmentFn();
	}

	@When("^Click Submit Reimbursement from My Functions$")
	public void click_Submit_Reimbursement_from_My_Functions() throws Throwable {
		helper();
		menunavigation.SubmitReimbursementFn();
	}

	@When("^Click Audit Inventory items from My Functions$")
	public void click_Audit_Inventory_items_from_My_Functions() throws Throwable {
		helper();
		menunavigation.AuditInventoryItemsFn();
	}

	@When("^Click Track inventory items from My Functions$")
	public void click_Track_inventory_items_from_My_Functions() throws Throwable {
		helper();
		menunavigation.TrackInventoryItemsFn();
	}

	@When("^Click Upload Inventory Items from My Functions$")
	public void click_Upload_Inventory_Items_from_My_Functions() throws Throwable {
		helper();
		menunavigation.UploadInventoryItemsFn();
	}

	@When("^Click Recruit new employee from My Functions$")
	public void click_Recruit_new_employee_from_My_Functions() throws Throwable {
		helper();
		menunavigation.RecruitNewEmployeeFn();
	}
	
	@When("^Select Payroll menu$")
	public void select_Payroll_menu() throws Throwable {
		helper();
		menunavigation.Payroll();

	}

	@When("^Click Manual Payroll submenu$")
	public void click_Manual_Payroll_submenu() throws Throwable {
		helper();
		menunavigation.ManualPayrol();
	}

	@When("^Click Pay Structure Entry submenu$")
	public void click_Pay_Structure_Entry_submenu() throws Throwable {
		helper();
		menunavigation.PayStructureEntry();
	}

	@When("^Click Pay Structure Upload submenu$")
	public void click_Pay_Structure_Upload_submenu() throws Throwable {
		helper();
		menunavigation.PayStructureUpload();
	}

	@When("^Click BDS Summary Report submenu$")
	public void click_BDS_Summary_Report_submenu() throws Throwable {
		helper();
		menunavigation.BDSSummaryReport();
	}

	@When("^Click Bank Entry submenu$")
	public void click_Bank_Entry_submenu() throws Throwable {
		helper();
		menunavigation.BankEntry();
	}

	@When("^Click payslip submenu$")
	public void click_payslip_submenu() throws Throwable {
		helper();
		menunavigation.PaySlipSubMenu();
	}

	@When("^Click P(\\d+)A form submenu$")
	public void click_P_A_form_submenu(int arg1) throws Throwable {
		helper();
		menunavigation.P9AForm();
	}

	@When("^Click Employee Loan Report submenu$")
	public void click_Employee_Loan_Report_submenu() throws Throwable {
		helper();
		menunavigation.EmployeeLoanReport();
	}

	@When("^Click Summary Report submenu$")
	public void click_Summary_Report_submenu() throws Throwable {
		helper();
		menunavigation.SummaryReport();
	}

	@When("^Click Staff Age Group Report submenu$")
	public void click_Staff_Age_Group_Report_submenu() throws Throwable {
		helper();
		menunavigation.StaffAge();
	}

	@When("^Click Staff Count Report submenu$")
	public void click_Staff_Count_Report_submenu() throws Throwable {
		helper();
		menunavigation.StaffCount();
	}

	@When("^Click Net Pay & Gross Pay Report submenu$")
	public void click_Net_Pay_Gross_Pay_Report_submenu() throws Throwable {
		helper();
		menunavigation.NetPayGrossPay();
	}

	@When("^Click Summary Report by Designation submenu$")
	public void click_Summary_Report_by_Designation_submenu() throws Throwable {
		helper();
		menunavigation.SummaryReportbyDesg();
	}

	@When("^Click Active students from My Reports$")
	public void click_Active_students_from_My_Reports() throws Throwable {
		helper();
		menunavigation.ActiveStudentsRep();
	}

	@When("^Click All Parent contributions from My Reports$")
	public void click_All_Parent_contributions_from_My_Reports() throws Throwable {
		helper();
		menunavigation.AllParentContributionsRep();
	}

	@When("^Click All students from My Reports$")
	public void click_All_students_from_My_Reports() throws Throwable {
		helper();
		menunavigation.AllStudentsRep();
	}

	@When("^Click All Suppliers from My Reports$")
	public void click_All_Suppliers_from_My_Reports() throws Throwable {
		helper();
		menunavigation.AllSuppliers();
	}

	@When("^Click Child Gift Summary from My Reports$")
	public void click_Child_Gift_Summary_from_My_Reports() throws Throwable {
		helper();
		menunavigation.ChildGiftSummaryRep();
	}

	@When("^Click Class Teacher from My Reports$")
	public void click_Class_Teacher_from_My_Reports() throws Throwable {
		helper();
		menunavigation.ClassTeacherRep();
	}

	@When("^Click Employee Loan Report from My Reports$")
	public void click_Employee_Loan_Report_from_My_Reports() throws Throwable {
		helper();
		menunavigation.EmployeeLoanReportRep();
	}

	@When("^Click Employee Report from My Reports$")
	public void click_Employee_Report_from_My_Reports() throws Throwable {
		helper();
		menunavigation.EmployeeReportRep();
	}

	@When("^Click Exam from My Reports$")
	public void click_Exam_from_My_Reports() throws Throwable {
		helper();
		menunavigation.ExamRep();
	}

	@When("^Click Exam Results By class from My Reports$")
	public void click_Exam_Results_By_class_from_My_Reports() throws Throwable {
		helper();
		menunavigation.ExamResultsByClassRep();
	}

	@When("^Click Family Visit Summary from My Reports$")
	public void click_Family_Visit_Summary_from_My_Reports() throws Throwable {
		helper();
		menunavigation.FamilyVisitSummaryRep();
	}

	@When("^Click Financial Summary from My Reports$")
	public void click_Financial_Summary_from_My_Reports() throws Throwable {
		helper();
		menunavigation.FinancialSummaryRep();
	}

	@When("^Click Inactive students from My Reports$")
	public void click_Inactive_students_from_My_Reports() throws Throwable {
		helper();
		menunavigation.InactiveStudentsRep();
	}

	@When("^Click Inter-School Transfer from My Reports$")
	public void click_Inter_School_Transfer_from_My_Reports() throws Throwable {
		helper();
		menunavigation.InterSchoolTransferRep();
	}

	@When("^Click Invigilation assignment for this month from My Reports$")
	public void click_Invigilation_assignment_for_this_month_from_My_Reports() throws Throwable {
		helper();
		menunavigation.InvigilationAssignmentThisMonthRep();
	}

	@When("^Click Invigilation assignment for this Week from My Reports$")
	public void click_Invigilation_assignment_for_this_Week_from_My_Reports() throws Throwable {
		helper();
		menunavigation.InvigilationAssignmentThisWeekRep();
	}

	@When("^Click All Invigilation Assignment from My Reports$")
	public void click_All_Invigilation_Assignment_from_My_Reports() throws Throwable {
		helper();
		menunavigation.AllInvigilationAssignmentRep();
	}	

	@When("^Click LPOs created after Needed by date from My Reports$")
	public void click_LPOs_created_after_Needed_by_date_from_My_Reports() throws Throwable {
		helper();
		menunavigation.LPOsCreatedAfterNeededByDateRep();
	}

	@When("^Click P(\\d+)A Report from My Reports$")
	public void click_P_A_Report_from_My_Reports(int arg1) throws Throwable {
		helper();
		menunavigation.P9AReportRep();
	}

	@When("^Click Parent contributions this month from My Reports$")
	public void click_Parent_contributions_this_month_from_My_Reports() throws Throwable {
		helper();
		menunavigation.ParentContributionsThisMonthRep();
	}

	@When("^Click Parent contributions this week from My Reports$")
	public void click_Parent_contributions_this_week_from_My_Reports() throws Throwable {
		helper();
		menunavigation.ParentContributionsThisWeekRep();
	}

	@When("^Click Payroll Summary Report from My Reports$")
	public void click_Payroll_Summary_Report_from_My_Reports() throws Throwable {
		helper();
		menunavigation.PayrollSummaryReportRep();
	}

	@When("^Click Pay Slip Report from My Reports$")
	public void click_Pay_Slip_Report_from_My_Reports() throws Throwable {
		helper();
		menunavigation.PaySlipReportRep();
	}

	@When("^Click Promotion Report from My Reports$")
	public void click_Promotion_Report_from_My_Reports() throws Throwable {
		helper();
		menunavigation.PromotionReportRep();
	}

	@When("^Click Ranking Report from My Reports$")
	public void click_Ranking_Report_from_My_Reports() throws Throwable {
		helper();
		menunavigation.RankingReportRep();
	}

	@When("^Click Subject Grading from My Reports$")
	public void click_Subject_Grading_from_My_Reports() throws Throwable {
		helper();
		menunavigation.SubjectGradingRep();
	}

	@When("^Click LPOs needed by this week from My Reports$")
	public void click_LPOs_needed_by_this_week_from_My_Reports() throws Throwable {
		helper();
		menunavigation.LPOsNeededByThisWeekRep();
	}

	@When("^Click LPOs needed by today from My Reports$")
	public void click_LPOs_needed_by_today_from_My_Reports() throws Throwable {
		helper();
		menunavigation.LPOsNeededByThisTodayRep();
	}
	
	@When("^Select procurement menu$")
	public void select_procurement_menu() throws Throwable {
		helper();
		menunavigation.Procurement();
	}

	@When("^Click supplier submenu$")
	public void click_supplier_submenu() throws Throwable {
		helper();
		menunavigation.Supplier();
	}

	@When("^Click supplier linking submenu$")
	public void click_supplier_linking_submenu() throws Throwable {
		helper();
		menunavigation.SupplierLinking();
	}

	@When("^Click Inventory Report submenu$")
	public void click_Inventory_Report_submenu() throws Throwable {
		helper();
		menunavigation.InventoryReport();
	}

	@When("^Click Inventory Tracking submenu$")
	public void click_Inventory_Tracking_submenu() throws Throwable {
		helper();
		menunavigation.InventoryTracking();
	}

	@When("^Click Inventory Audit submenu$")
	public void click_Inventory_Audit_submenu() throws Throwable {
		helper();
		menunavigation.InventoryAudit();
	}

	@When("^Click Inventory Items Upload submenu$")
	public void click_Inventory_Items_Upload_submenu() throws Throwable {
		helper();
		menunavigation.InventoryItemsUpload();
	}

	@When("^Click Requisition List submenu$")
	public void click_Requisition_List_submenu() throws Throwable {
		helper();
		menunavigation.Requisition();
	}

	@When("^Click LPO List submenu$")
	public void click_LPO_List_submenu() throws Throwable {
		helper();
		menunavigation.LpoList();
	}

	@When("^Click Reimbursement List submenu$")
	public void click_Reimbursement_List_submenu() throws Throwable {
		helper();
		menunavigation.Reimbursement();
	}

	@When("^Click LPO Payment Report submenu$")
	public void click_LPO_Payment_Report_submenu() throws Throwable {
		helper();
		menunavigation.LpoPayment();
	}

	@When("^Click LPO Requisition Summary Report submenu$")
	public void click_LPO_Requisition_Summary_Report_submenu() throws Throwable {
		helper();
		menunavigation.LpoRequisitionSummary();
	}
	@When("^Select Promotion menu$")
	public void select_Promotion_menu() throws Throwable {
		helper();
		menunavigation.PromotionMainMenu();		
	}

	@When("^click In-SchoolPromotion sub menu$")
	public void click_In_SchoolPromotion_sub_menu() throws Throwable {
		helper();
		menunavigation.InSchlPromotionSubMenu();
	}

	@When("^click Transfer & Promotional Transfer sub menu$")
	public void click_Transfer_Promotional_Transfer_sub_menu() throws Throwable {
		helper();
		menunavigation.TransferAndPromotionalSubMenu();
	}
	
	@When("^Select Reports menu$")
	public void select_Reports_menu() throws Throwable {
		helper();
		menunavigation.Reports();
	}

	@When("^Click Parent Contribution submenu$")
	public void click_Parent_Contribution_submenu() throws Throwable {
		helper();
		menunavigation.ParentContribution();
	}

	@When("^Click Student List submenu$")
	public void click_Student_List_submenu() throws Throwable {
		helper();
		menunavigation.Student();
	}

	@When("^Click Class Teacher submenu$")
	public void click_Class_Teacher_submenu() throws Throwable {
		helper();
		menunavigation.ClassTeacher();
	}

	@When("^Click Exam submenu$")
	public void click_Exam_submenu() throws Throwable {
		helper();
		menunavigation.Exam();
	}

	@When("^Click Inviglilation submenu$")
	public void click_Inviglilation_submenu() throws Throwable {
		helper();
		menunavigation.Invigilation();
	}

	@When("^Click Ranking Report submenu$")
	public void click_Ranking_Report_submenu() throws Throwable {
		helper();
		menunavigation.RankingRep();
	}

	@When("^Click Subject Grading submenu$")
	public void click_Subject_Grading_submenu() throws Throwable {
		helper();
		menunavigation.SubjectGrading();
	}

	@When("^Click Promotion submenu$")
	public void click_Promotion_submenu() throws Throwable {
		helper();
		menunavigation.Promotion();
	}

	@When("^Click Book submenu$")
	public void click_Book_submenu() throws Throwable {
		helper();
		menunavigation.Book();
	}

	@When("^Click Student CMF Report submenu$")
	public void click_Student_CMF_Report_submenu() throws Throwable {
		helper();
		menunavigation.CMFReport();
	}

	@When("^Click Family Visit Summary submenu$")
	public void click_Family_Visit_Summary_submenu() throws Throwable {
		helper();
		menunavigation.FamilyVisitsummary();
	}

	@When("^Click Social Worker Follow-up submenu$")
	public void click_Social_Worker_Follow_up_submenu() throws Throwable {
		helper();
		menunavigation.SocialWorkerFollowUp();
	}

	@When("^Click Inter-School Transfer submenu$")
	public void click_Inter_School_Transfer_submenu() throws Throwable {
		helper();
		menunavigation.InterSchlTransfer();
	}

	@When("^Click Child Gift Summary submenu$")
	public void click_Child_Gift_Summary_submenu() throws Throwable {
		helper();
		menunavigation.ChildGiftSummary();
	}

	@When("^Click Pull out Report submenu$")
	public void click_Pull_out_Report_submenu() throws Throwable {
		helper();
		menunavigation.PullOutRep();
	}

	@When("^Click Financial Summary submenu$")
	public void click_Financial_Summary_submenu() throws Throwable {
		helper();
		menunavigation.FinancialSummaryRep();
	}
	@When("^Select Sponsorship menu$")
	public void select_Sponsorship_menu() throws Throwable {
		helper();
		menunavigation.SponsorshipMainMenu();		
	}

	@When("^click CMF Upload sub menu$")
	public void click_CMF_Upload_sub_menu() throws Throwable {
		helper();
		menunavigation.CMFUploadSubMenu();
	}

	@When("^click Sponsor Upload sub menu$")
	public void click_Sponsor_Upload_sub_menu() throws Throwable {
		helper();
		menunavigation.SponsorUploadSubMenu();
	}

	@When("^click CMF Edit sub menu$")
	public void click_CMF_Edit_sub_menu() throws Throwable {
		helper();
		menunavigation.CMFEditSubMenu();
	}
	
	@When("^Select Staff Profile menu$")
	public void select_Staff_Profile_menu() throws Throwable {
		helper();
		menunavigation.StaffProfileMainMenu();
	}

	@When("^click Basic Profile sub menu$")
	public void click_Basic_Profile_sub_menu() throws Throwable {
		menunavigation.BasicProfileSubMenu();
	}

	@When("^click Pay Structure Details sub menu$")
	public void click_Pay_Structure_Details_sub_menu() throws Throwable {
		menunavigation.PayStructureDetSubMenu();
	}

	@When("^click Pay Slip Details sub menu$")
	public void click_Pay_Slip_Details_sub_menu() throws Throwable {
		menunavigation.PaySlipDetailSubMenu();
	}
	

	@When("^Select student menu$")
	public void select_student_menu() throws Throwable {
		helper();
		menunavigation.studentMenu();		
	}

	@When("^click student entry submenu$")
	public void click_student_entry_submenu() throws Throwable {
		helper();
		menunavigation.studentEntry();
	}

	@When("^click fee deposit submenu$")
	public void click_fee_deposit_submenu() throws Throwable {
		helper();
		menunavigation.FeeDeposit();
	}

	@When("^click attendance submenu$")
	public void click_attendance_submenu() throws Throwable {
		helper();
		menunavigation.Attendance();
	}

	@When("^click family visit submenu$")
	public void click_family_visit_submenu() throws Throwable {
		helper();
		menunavigation.FamilyVisit();
	}
	
	@When("^click Education Loan Request submenu$")
	public void click_Education_Loan_Request_submenu() throws Throwable {
		helper();
		menunavigation.EducationLoanRequest();
	}
	
	@When("^click Student Profile submenu$")
	public void click_Student_Profile_submenu() throws Throwable {
		helper();
		menunavigation.StudentProfile();
	}
	
	@When("^click Education Loan Repayment submenu$")
	public void click_Education_Loan_Repayment_submenu() throws Throwable {
		helper();
		menunavigation.EducationLoanRepayment();
	}

	@When("^click Special Attendance submenu$")
	public void click_Special_Attendance_submenu() throws Throwable {
		helper();
		menunavigation.SpecialAttendance();
	}
	
	@When("^click Special Attendance Upload submenu$")
	public void click_Special_Attendance_Upload_submenu() throws Throwable {
		helper();
		menunavigation.SpecialAttendanceUpload();
	}
	
	@When("^click Messages submenu$")
	public void click_Messages_submenu() throws Throwable {
		helper();
		menunavigation.Messages();
	}
	
	@When("^click gifts submenu$")
	public void click_gifts_submenu() throws Throwable {
		helper();
		menunavigation.Gifts();
	}
	
	@When("^Click Student Workflow status submenu$")
	public void click_Student_Workflow_status_submenu() throws Throwable {
		helper();
		menunavigation.StudentWorkflowstatusSubMenuFn();
	}
	
	@When("^Click Gifts categories submenu$")
	public void click_gifts_categories_submenu() throws Throwable {
		helper();
		menunavigation.GiftsCategoriesSubMenuFn();
	}
	
	@When("^Click Sponsor List submenu$")
	public void click_sponsor_list_submenu() throws Throwable {
		helper();
		menunavigation.sponsorListFn();
	}
	
	@When("^Click Dashboard submenu$")
	public void click_dashboard_submenu() throws Throwable {
		helper();
		menunavigation.sponsorDashboardFn();
	}
	
	@When("^Click Message Report submenu$")
	public void click_Message_Report_submenu() throws Throwable {
		helper();
		menunavigation.MessageReportSubMenuFn();
	}
	
	@When("^Click Employee Leave Report submenu$")
	public void click_employee_leave_Report_submenu() throws Throwable {
		helper();
		menunavigation.EmployeeLeaveReportSubMenuFn();
	}
	
	@When("^click Fee Master Entry submenu$")
	public void click_Fee_Master_Entry_submenu() throws Throwable {
		helper();
		menunavigation.FeeMasterEntrysubmenu() ;
	}

	@When("^click Academic Term Entry submenu$")
	public void click_Academic_Term_Entry_submenu() throws Throwable {
		helper();
		menunavigation.AcademicTermEntrysubmenu();
	}
	
	@When("^Click Message status report submenu$")
	public void click_Message_status_report_submenu() throws Throwable {
		helper();
		menunavigation.Messagestatusreportsubmenu();
	}

	@When("^Click Message conversation Report submenu$")
	public void click_Message_conversation_Report_submenu() throws Throwable {
		helper();
		menunavigation.MessageconversationReportsubmenu();
	}
	
	@When("^close window$")
	public void close_window()  {
	  
		Close();
		
	}
	
	
	@Given("^initiate web browser$")
	public void initiate_web_browser() throws Throwable {
	   
		initDriver();
	}
	
	
}
