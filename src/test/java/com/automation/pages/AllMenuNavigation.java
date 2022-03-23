package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;
//import static com.utils.DriverUtils.getDriver;
//import static com.utils.DriverUtils.getDriver;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.automation.utils.WebElementUtils;

public class AllMenuNavigation {
	public AllMenuNavigation() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(linkText = "Admin")
	WebElement Admin;
	

	@FindBy(linkText = "User")
	WebElement User;
	
	@FindBy(linkText = "Add User")
	WebElement AddUser;
	

	@FindBy(linkText = "Role")
	WebElement Role;
	
	@FindBy(linkText = "Add Role")
	WebElement AddRole;
	
	

	@FindBy(linkText = "Organization")
	WebElement Organization;
	
	@FindBy(xpath = "//a[@title='Organization']")
	WebElement Organizationsettings;
	
	

	@FindBy(linkText = "Email Template")
	WebElement EmailTemplate;
	
	@FindBy(linkText = "Add Email Config")
	WebElement AddEmailConfig;

	@FindBy(linkText = "Privilege")
	WebElement Privilege;
	
	@FindBy(linkText = "Add Privilege")
	WebElement AddPrivilege;

	@FindBy(linkText = "Menu")
	WebElement Menu;
	
	@FindBy(linkText = "Add Menu")
	WebElement AddMenu;

	@FindBy(linkText = "Workflow")
	WebElement Workflow;
	
	@FindBy(xpath = "//li[contains(.,'WorkflowStepGroup List')]")
	WebElement Workflowgroup;
	

	@FindBy(linkText = "Master Detail List")
	WebElement MasterDetailList;
	
	@FindBy(linkText = "Add Master Detail")
	WebElement AddMasterDetail1;
	

	@FindBy(linkText = "Master Detail Entry")
	WebElement MasterDetailEntry;
	
	@FindBy(linkText = "Notification Entry")
	WebElement NotificationEntry;
	
	@FindBy(xpath="//a[contains(.,'Notification List')]")
	WebElement NotificationList;
	
	@FindBy(linkText = "Book")
	WebElement Book;

	@FindBy(linkText = "Leave")
	WebElement Leave1;

	@FindBy(linkText = "Holidays")
	WebElement Holidays;
	
	@FindBy(xpath = "//li[normalize-space()='Holiday List']")
	WebElement Holidayscheck;

	@FindBy(linkText = "Center")
	WebElement Center;

	@FindBy(linkText = "Class Teacher Entry")
	WebElement ClassTeacherEntry;
	
	@FindBy(xpath = "//li[text()='Teacher Assignment']")
	WebElement TeacherAssignment;

	@FindBy(linkText = "Annual Photo Schedule")
	WebElement AnnualPhotoSchedule;
	
	@FindBy(xpath = "//a[@title='Annual Photo Schedule']")
	WebElement AnnualPhotoSchedulecheck;
	

	@FindBy(linkText = "Family Social Worker Assignment")
	WebElement FamilySocialWorkerAsgnmnt;
	
	@FindBy(xpath = "//a[@title='Assign family social worker']")
	WebElement Assignfamilysocialworker;
	
	

	@FindBy(linkText = "Exam")
	WebElement Exam;

	@FindBy(linkText = "Exam Entry")
	WebElement ExamEntry;
	
	@FindBy(xpath = "//a[@title='Exam Entry']")
	WebElement ExamEntrycheck;

	@FindBy(linkText = "Exam Results")
	WebElement ExamResults;
	
	@FindBy(xpath = "//li[contains(text(),'Exam Result')]")
	WebElement ExamResultcheck;

	@FindBy(linkText = "Invigilation Entry")
	WebElement InvigilationEntry;
	
	@FindBy(xpath = "//li[contains(text(),'Invigilator Assignment')]")
	WebElement InvigilatorAssignment;
	
	@FindBy(linkText = "Subject Grading Entry")
	WebElement SubjectGradingEntry;
	
	@FindBy(xpath = "//li[contains(text(),'Subject Grading')]")
	WebElement SubjectGradingcheck;

	@FindBy(linkText = "Employee")
	WebElement EmpMainMenu;

	@FindBy(linkText = "Employee Recruitment")
	WebElement EmpRecSubMenu;
	
	@FindBy(xpath = "//li[contains(text(),'Employee Recruitment')]")
	WebElement EmpRecCheck;

	@FindBy(linkText = "Employee List")
	WebElement EmpListSubMenu;
	
	@FindBy(xpath = "//li[normalize-space()='Employee List']")
	WebElement EmpListCheck;

	@FindBy(linkText = "Employee Leave")
	WebElement EmpLeaveSubMenu;

	@FindBy(linkText = "Staff Promotion Report")
	WebElement StaffPromotionSubMenu;
	
	@FindBy(xpath = "//span[contains(.,'StaffPromotionReport')]")
	WebElement StaffPromotionCheck;
	
	
	@FindBy(linkText = "FAST")
	WebElement FAST;

	@FindBy(linkText = "Assessment Generation")
	WebElement AssessmentGeneration;
	
	@FindBy(xpath="//li[contains(text(),'Generate Assessment')]")
	WebElement GenerateAssessment;

	@FindBy(linkText = "Assessment Schedules Report")
	WebElement AssessmentSchedulesRep;
	
	@FindBy(xpath= "//a[contains(.,'AssessmentSchedule')]")
	WebElement AssessmentScheduleCheck;
	
	@FindBy(linkText = "Assessment Report")
	WebElement AssessmentRep;
	
	@FindBy(xpath= "//a[text()='Assessment']" )
	WebElement AssessmentRepcheck;
	
	@FindBy(linkText = "Assessment Analysis Report")
	WebElement AssessmentAnalysisRep;
	
	@FindBy(xpath= "//a[contains(.,'Assessment Analysis List')]" )
	WebElement AssessmentAnalysislist;

	@FindBy(linkText = "Assessment Chart")
	WebElement AssessmentChart;
	
	@FindBy(xpath= "//li[contains(text(),'Assessment Chart')]")
	WebElement AssessmentChartCheck;

	@FindBy(linkText = "Fast Activity Report")
	WebElement FastActivityRep;
	
	@FindBy(xpath= "//span[contains(.,'MonthlyFastActivityReport')]" )
	WebElement FastActivitycheck;

	@FindBy(partialLinkText = "Employees' current month unpaid leave update reminder")
	WebElement unpaidLeaveUpdateReminder;

	@FindBy(partialLinkText = "students bio information not updated for the past 12 months")
	WebElement bioInformationNotUpdated;

	@FindBy(partialLinkText = "cash only requisitions with the cheque number signed and not yet collected")
	WebElement chequeNumberSignedNotYetCollected;

	@FindBy(partialLinkText = "cash only requisitions with cheque number entered and waiting for director's sign")
	WebElement cheqNoEnteredWaitingForDirSign;

	@FindBy(partialLinkText = "approved cash only requisitions waiting for cheque writing")
	WebElement approvedCashOnlyRequisitions;

	@FindBy(partialLinkText = "students with cumulative overdue fee >= 500")
	WebElement cummulativeOverdue;

	@FindBy(partialLinkText = "fee deposits without the bank deposit slip no.")
	WebElement feeDepositWithoutSlip;

	@FindBy(partialLinkText = "overdue fee payments")
	WebElement overdueFeePayments;

	@FindBy(partialLinkText = "student fee schedule today")
	WebElement feeScheduleToday;

	@FindBy(partialLinkText = "FAST assessments not carried out yet")
	WebElement AssessmentsNotCarriedOut;

	@FindBy(xpath = "//li//a[@href='/dashboard/index' and @class='nav-link dropdown-toggle']")
	WebElement Dashboard;

	@FindBy(xpath = "//a[@href='/Event/Dashboard']")
	WebElement sponsorshipDashboard;
	
	@FindBy(xpath = "//b[contains(.,'Child Sponsorship')]")
	WebElement SponsorDashboard;
	

	@FindBy(linkText = "Sponsor List")
	WebElement sponsorList;
	
	@FindBy(xpath = "//b[contains(.,'Child Sponsorship Details')]")
	WebElement sponsorListcheck;
	

	@FindBy(linkText = "Message Report")
	WebElement MessageReport;
	
	@FindBy(xpath = "//li[contains(text(),'Message Report')]")
	WebElement MessageReportcheck;

	@FindBy(linkText = "Employee Leave Report")
	WebElement EmployeeLeaveReport;
	
	@FindBy(xpath = "//span[contains(.,'EmployeeLeaveReport')]")
	WebElement EmployeeLeaveReportcheck;
	
	@FindBy (xpath = "//a[contains(.,'Fee Master Entry')]")
	WebElement FeeMasterEntry;


	@FindBy (xpath = "//b[contains(.,'Fee Master Page')]")
	WebElement FeeMasterEntrycheck;
	
	@FindBy (xpath = "//a[contains(.,'Academic Term Entry')]")
	WebElement AcademicEntry;
	
	@FindBy (xpath = "//b[contains(.,'Academic Entry List')]")
	WebElement AcademicEntrycheck;

	@FindBy(linkText = "My Dashboard")
	WebElement MyDashboard;
	
	@FindBy(xpath = "//span[normalize-space()='My Dashboard']")
	WebElement MyDashboardcheck;
	

	@FindBy(linkText = "Enroll Student")
	WebElement EnrollStudent;

	@FindBy(linkText = "Fee Deposit")
	WebElement FeeDeposit;

	@FindBy(linkText = "Upload CMF Numbers")
	WebElement UploadCMFNumbers;

	@FindBy(linkText = "Upload Sponsorship details")
	WebElement UploadSponsorshipDetails;

	@FindBy(linkText = "Update Photo Schedules")
	WebElement UpdatePhotoSchedules;

	@FindBy(linkText = "Upload Students CMF Photo")
	WebElement UploadStudentsCMFPhoto;

	@FindBy(linkText = "Assign Social workers for family")
	WebElement AssignSwforfamily;

	@FindBy(partialLinkText = "Make Promotion")
	WebElement PromoSectionChngDetain;

	@FindBy(partialLinkText = "Transfer Students")
	WebElement TransferStudents;

	@FindBy(linkText = "Invigilation Assignment")
	WebElement InvigilationAssignmentFn;

	@FindBy(linkText = "Add Master Detail")
	WebElement AddMasterDetail;

	@FindBy(linkText = "Submit Requisition")
	WebElement SubmitRequisition;

	@FindBy(linkText = "Add Supplier")
	WebElement AddSupplier;

	@FindBy(linkText = "Create Inventory items")
	WebElement CreateInventoryItems;

	@FindBy(linkText = "Mark Student Attendance")
	WebElement MarkStudentAttendance;

	@FindBy(xpath = "//*[@id='item-2']/div/div/a[17]")
	WebElement ExamManagement;

	@FindBy(linkText = "Publish Exam Result")
	WebElement PublishExamResult;

	@FindBy(linkText = "Class Teacher Assignment")
	WebElement ClassTeacherAssignment;

	@FindBy(linkText = "Update Center Annual Photo Schedule")
	WebElement UpdateCenterAnnualPhotoSchedule;

	@FindBy(linkText = "Visit Student Family")
	WebElement VisitStudentFamily;

	@FindBy(linkText = "Subject Grading Assignment")
	WebElement SubjectGradingAssgnmnt;

	@FindBy(linkText = "Link supplier & item")
	WebElement LinkSupplierItem;

	@FindBy(linkText = "Book Assignment")
	WebElement BookAssignment;

	@FindBy(linkText = "Submit Reimbursement")
	WebElement SubmitReimbursement;

	@FindBy(linkText = "Audit Inventory items")
	WebElement AuditInventoryItems;

	@FindBy(linkText = "Track inventory items")
	WebElement TrackInventoryItems;

	@FindBy(linkText = "Upload Inventory Items")
	WebElement UploadInventoryItems;

	@FindBy(linkText = "Recruit new employee")
	WebElement RecruitNewEmployee;

	@FindBy(linkText = "Payroll")
	WebElement PayrolMainMenu;

	@FindBy(linkText = "Manual Payroll")
	WebElement ManualPayrolSubMenu;
	
	@FindBy(xpath = "//a[contains(.,'Manual Payroll')]")
	WebElement ManualPayrolcheck;

	@FindBy(linkText = "Pay Structure Entry")
	WebElement PayStructureEntrySubMenu;
	
	@FindBy(xpath = "//a[normalize-space()='Pay Structure']")
	WebElement PayStructure;
	
	@FindBy(linkText = "Pay Structure Upload")
	WebElement PayStructureUploadSubMenu;
	
	@FindBy(xpath ="//li[contains(text(),'Pay Structure Upload')]")
	WebElement PayStructureUpload;

	@FindBy(linkText = "BDS Summary Report")
	WebElement BDSSummaryReportSubMenu;
	
	@FindBy(xpath ="//span[contains(.,'Payroll_BDSreport')]")
	WebElement BDSSummaryReport;

	@FindBy(linkText = "Bank Entry")
	WebElement BankEntrySubMenu;
	
	@FindBy(xpath ="//a[contains(.,'Bank List')]")
	WebElement BankList;

	@FindBy(linkText = "Pay Slip")
	WebElement PaySlipSubMenu;
	
	@FindBy(xpath ="//div[.='Pay Slip No. q']")
	WebElement PaySlip;
	

	@FindBy(linkText = "P9A Form")
	WebElement P9AFormSubMenu;
	
	@FindBy(xpath ="//a[contains(text(),'P9A Form Search')]")
	WebElement P9AForm ;

	@FindBy(linkText = "Employee Loan Report")
	WebElement EmployeeLoanReportSubMenu;
	
	@FindBy(xpath ="//span[contains(.,'Payroll_LoanSavings')]")
	WebElement EmployeeLoanReportcheck;

	@FindBy(linkText = "Summary Report")
	WebElement SummaryReportSubMenu;
	
	@FindBy(xpath ="//span[contains(.,'PayrollSummaryReport')]")
	WebElement PayrollSummaryReportcheck ;

	@FindBy(linkText = "Staff Age Group Report")
	WebElement StaffAgeSubMenu;
	
	@FindBy(xpath ="//span[contains(.,'StaffAge')]")
	WebElement StaffAge;
	

	@FindBy(linkText = "Staff Count Report")
	WebElement StaffCountSubMenu;
	
	@FindBy(xpath ="//span[contains(.,'StaffCount')]")
	WebElement StaffCount;

	@FindBy(linkText = "Net Pay & Gross Pay Report")
	WebElement NetPayGrossPaySubMenu;
	
	@FindBy(xpath ="//span[contains(.,'NetAndGrossPay')]")
	WebElement NetAndGrossPay;

	@FindBy(linkText = "Summary Report by Designation")
	WebElement SummaryReportbyDesgSubMenu;
	
	@FindBy(xpath ="//span[contains(.,'PayrollSummarybyDesignation')]")
	WebElement PayrollSummarybyDesignation;
	

	@FindBy(linkText = "Active students")
	WebElement ActiveStudents;

	@FindBy(linkText = "All Parent contributions")
	WebElement AllParentContributions;

	@FindBy(linkText = "All students")
	WebElement AllStudents;

	@FindBy(linkText = "All Suppliers")
	WebElement AllSuppliers;

	@FindBy(linkText = "Child Gift Summary")
	WebElement ChildGiftSummary;

	@FindBy(linkText = "Class Teacher")
	WebElement ClassTeacher;

	@FindBy(linkText = "Employee Loan Report")
	WebElement EmployeeLoanReport;

	@FindBy(linkText = "Employee Report")
	WebElement EmployeeReport;

	@FindBy(linkText = "Exam Results By class")
	WebElement ExamResultsByClass;

	@FindBy(partialLinkText = "Family Visit Summary")
	WebElement FamilyVisitSummary;

	@FindBy(partialLinkText = "Financial Summary")
	WebElement FinancialSummary;
	
	
	@FindBy(xpath ="//span[contains(.,'FinancialSummary')]")
	WebElement FinancialSummarycheck;
	

	@FindBy(linkText = "Inactive students")
	WebElement InactiveStudents;

	@FindBy(linkText = "Inter-School Transfer")
	WebElement InterSchoolTransfer;

	@FindBy(linkText = "Invigilation assignment for this month")
	WebElement InvigilationAssignmentThisMonth;

	@FindBy(linkText = "Invigilation assignment for this week")
	WebElement InvigilationAssignmentThisWeek;

	@FindBy(linkText = "All Invigilation Assignment")
	WebElement AllInvigilationAssignment;

	@FindBy(linkText = "LPOs created after Needed by date")
	WebElement LPOsCreatedAfterNeededByDate;

	@FindBy(linkText = "P9A Report")
	WebElement P9AReport;

	@FindBy(linkText = "Parent contributions this month")
	WebElement ParentContributionsThisMonth;

	@FindBy(linkText = "Parent contributions this week")
	WebElement ParentContributionsThisWeek;

	@FindBy(linkText = "Payroll Summary Report")
	WebElement PayrollSummaryReport;

	@FindBy(linkText = "Pay Slip Report")
	WebElement PaySlipReport;

	@FindBy(linkText = "Promotion Report")
	WebElement PromotionReport;

	@FindBy(linkText = "Ranking Report")
	WebElement RankingReport;

	@FindBy(linkText = "Subject Grading")
	WebElement SubjectGrading;

	@FindBy(linkText = "LPOs needed by this week")
	WebElement LPOsNeededByThisWeek;

	@FindBy(linkText = "LPOs needed by today")
	WebElement LPOsNeededByThisToday;

	@FindBy(linkText = "Procurement")
	WebElement ProcurementMainMenu;

	@FindBy(linkText = "Supplier")
	WebElement SupplierSubMenu;
	
	@FindBy(xpath = "//li[normalize-space()='Reports']")
	WebElement Supplier;

	@FindBy(linkText = "Supplier Linking")
	WebElement SupplierLinkingSubMenu;
	
	@FindBy(xpath = "//li[contains(text(),'Supplier Linking')]")
	WebElement SupplierLinking;

	@FindBy(linkText = "Inventory Report")
	WebElement InventoryReportSubMenu;
	
	@FindBy(xpath = "//li[contains(text(),'Inventory Report')]")
	WebElement InventoryReport;

	@FindBy(linkText = "Inventory Tracking")
	WebElement InventoryTrackingSubMenu;
	
	@FindBy(xpath = "//li[contains(text(),'Inventory Tracking')]")
	WebElement InventoryTracking;
	

	@FindBy(linkText = "Inventory Audit")
	WebElement InventoryAuditSubMenu;
	
	@FindBy(xpath = "//li[contains(text(),'Inventory Audit')]")
	WebElement InventoryAudit ;
	

	@FindBy(linkText = "Inventory Items Upload")
	WebElement InventoryItemsUploadSubMenu;
	
	@FindBy(xpath = "//li[contains(text(),'Item Upload')]")
	WebElement ItemUpload;
	

	@FindBy(linkText = "Requisition List")
	WebElement RequisitionSubMenu;
	
	@FindBy(xpath = "//li[normalize-space()='Requisition List']")
	WebElement RequisitionList;
	

	@FindBy(linkText = "LPO List")
	WebElement LpoSubMenu;
	
	@FindBy(xpath = "//li[normalize-space()='LPO List']")
	WebElement LPOList;
	

	@FindBy(linkText = "Reimbursement List")
	WebElement ReimbursementSubMenu;
	
	@FindBy(xpath = "//a[@href='/Requisition/Reimbursementlist/0']")
	WebElement ReimbursementList;
	

	@FindBy(linkText = "LPO Payment Report")
	WebElement LpoPaymentSubMenu;
	

	@FindBy(linkText = "LPO Requisition Summary Report")
	WebElement LpoRequisitionSubMenu;
	
	@FindBy(xpath = "//span[contains(.,'LpoRequisitionSummary')]")
	WebElement LpoRequisition;
	

	@FindBy(linkText = "Promotion")
	WebElement Promotion;

	@FindBy(linkText = "In-School Promotion")
	WebElement InSchoolPromotion;
	
	@FindBy(xpath ="//li[contains(text(),'In-School Promotion')]")
	WebElement InSchoolPromotionCheck;
	

	@FindBy(linkText = "Transfer & Promotional Transfer")
	WebElement TransferAndPromotional;
	
	@FindBy(xpath ="//li[contains(text(),'Transfer & Promotional Transfer')]")
	WebElement TransferPromotional;

	@FindBy(linkText = "Reports")
	WebElement RepMainMenu;

	@FindBy(linkText = "Parent Contribution")
	WebElement ParentContributionSubMenu;
	
	@FindBy(xpath ="//li[contains(text(),'Parent Contribution')]")
	WebElement ParentContributioncheck;
	

	@FindBy(xpath = "//*[@id='navbar-collapse-nav']//div//a[text()='Student']")
	WebElement StudentSubMenu;
	
	@FindBy(xpath ="//a[contains(.,'Add Student')]")
	WebElement Studentcheck;
	
	@FindBy(xpath = "//a[@id='lnkFeeChange']")
	WebElement BooksAssignment;

	@FindBy(linkText = "Class Teacher")
	WebElement ClassTeacherSubMenu;
	
	@FindBy(xpath = "//a[contains(.,'Add Class Teacher')]")
	WebElement ClassTeachercheck;

	@FindBy(xpath = "//a[@href='/Report/ExamList']")
	WebElement ExamSubMenu;
	
	@FindBy(xpath = "//a[contains(.,'Add Exam')]")
	WebElement Examcheck;

	@FindBy(linkText = "Invigilation")
	WebElement InvigilationSubMenu;
	
	@FindBy(xpath = "//a[contains(.,'Add Invigilator')]")
	WebElement Invigilationcheck;

	@FindBy(linkText = "Ranking Report")
	WebElement RankingRepSubMenu;
	
	@FindBy(xpath = "//span[contains(.,'RankingReport')]")
	WebElement RankingReportcheck;

	@FindBy(linkText = "Subject Grading")
	WebElement SubjectGradingSubMenu;
	
	@FindBy(xpath ="//a[contains(.,'Add Subject Grading')]")
	WebElement SubjectGradings;

	@FindBy(xpath = "//*[@id='navbar-collapse-nav']/ul[1]/li[14]/div/a[8]")
	WebElement PromotionSubMenu;
	
	@FindBy(xpath = "//li[contains(text(),'Promotion')]")
	WebElement Promotioncheck;

	@FindBy(xpath = "//*[@id='navbar-collapse-nav']/ul[1]/li[14]/div/a[9]")
	WebElement BookSubMenu;
	
	@FindBy(xpath = "//a[contains(.,'Assign Book')]")
	WebElement AssignBookcheck ;

	@FindBy(xpath = "//*[@id='navbar-collapse-nav']/ul[1]/li[14]/div/a[10]")
	WebElement CMFReportSubMenu;
	
	@FindBy(xpath = "//b[contains(.,'Student CMF Report')]")
	WebElement CMFReportcheck;

	@FindBy(linkText = "Family Visit Summary")
	WebElement FamilyVisitsummarySubMenu;
	
	@FindBy(xpath = "//span[contains(.,'FamilyVisit')]")
	WebElement FamilyVisitchecks;

	@FindBy(linkText = "Social Worker Follow-up")
	WebElement SocialWrkrFlwUpSubMenu;
	
	@FindBy(xpath = "//li[normalize-space()='Reports']")
	WebElement SocialWorkerFollowup;

	@FindBy(linkText = "Inter-School Transfer")
	WebElement InterSchlTrnsfrSubMenu;
	
	@FindBy(xpath = "//span[contains(.,'SchoolTransfer')]")
	WebElement SchoolTransfercheck;

	@FindBy(linkText = "Child Gift Summary")
	WebElement ChildGiftSumrySubMenu;
	
	@FindBy(xpath = "//span[contains(.,'ChildGift')]")
	WebElement ChildGiftcheck;

	@FindBy(linkText = "Pull out Report")
	WebElement PullOutRepSubMenu;
	
	@FindBy(xpath = "//span[contains(.,'StudentPullout')]")
	WebElement StudentPulloutcheck;

	@FindBy(linkText = "Sponsorship")
	WebElement Sponsorship;

	@FindBy(linkText = "CMF Upload")
	WebElement CMFUpload;
	
	@FindBy( xpath = "//li[contains(text(),'CMF Numbers Upload')]")
	WebElement CMFNumbersUpload ;

	@FindBy(linkText = "Sponsor Upload")
	WebElement SponsorUpload;
	
	@FindBy( xpath = "//li[contains(.,'CMF Sponsors Upload')]")
	WebElement SponsorUploadcheck;

	@FindBy(linkText = "CMF Edit")
	WebElement CMFEdit;
	
	@FindBy( xpath ="//li[contains(text(),'CMF Edit')]")
	WebElement CMFEditcheck;

	@FindBy(linkText = "Staff Profile")
	WebElement StaffProfile;

	@FindBy(linkText = "Basic Profile")
	WebElement BasicProfile;


	@FindBy(linkText = "Pay Structure Details")
	WebElement PayStructureDetails;

	@FindBy(linkText = "Pay Slip Details")
	WebElement PaySlipDetails;

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle'][text()='Student']")
	WebElement studentMainMenu;

	@FindBy(partialLinkText = "Entry")
	WebElement studentEntrySubMenu;
	
	@FindBy ( xpath = "//li[contains(text(),'Student Entry')]")
	WebElement studentEntry;
	

	@FindBy(linkText = "Fee Deposit")
	WebElement FeeDepositSubMenu;
	
	@FindBy ( xpath = "//li[contains(text(),'Fee Deposit')]")
	WebElement FeeDepositcheck;

	@FindBy(linkText = "Attendance")
	WebElement AttendanceSubMenu;
	
	@FindBy ( xpath = "//li[contains(text(),'Attendance')]")
	WebElement Attendance;
	

	@FindBy(linkText = "Family Visit")
	WebElement FamilyVisitSubMenu;
	
	@FindBy ( xpath = "//li[contains(text(),'Family Visit')]")
	WebElement FamilyVisitcheck;
	

	@FindBy(linkText = "Education Loan Request")
	WebElement EducationLoanRequestSubMenu;
	
	@FindBy ( xpath = "//li[contains(text(),'Loan Repayment')]")
	WebElement EducationLoanRepaymentcheck;
	

	@FindBy(linkText = "Student Profile")
	WebElement StudentProfileSubMenu;

	@FindBy(linkText = "Education Loan Repayment")
	WebElement EducationLoanRepaymentSubMenu;

	@FindBy(linkText = "Special Attendance")
	WebElement SpecialAttendanceSubMenu;
	
	@FindBy( xpath ="//li[contains(text(),'Special Attendance')]")
	WebElement SpecialAttendancecheck;

	@FindBy(linkText = "Special Attendance Upload")
	WebElement SpecialAttendanceUploadSubMenu;
	
	@FindBy( xpath ="//li[contains(text(),'Special Attendance Upload')]")
	WebElement SpecialAttendanceuploadcheck;

	@FindBy(linkText = "Messages")
	WebElement MessageSubMenu;
	
	@FindBy( xpath ="//b[contains(.,'Messages')]")
	WebElement Messagecheck;

	@FindBy(xpath = "//a[@href='/Student/GetAllGiftList']")
	WebElement GiftsSubMenu;
	
	@FindBy( xpath ="//b[contains(.,'Gifts')]")
	WebElement Giftcheck;

	@FindBy(xpath = "//a[@href='/Student/StudentWorkFlowStatus']")
	WebElement StudentWorkflowstatusSubMenu;
	
	@FindBy( xpath ="//li[contains(.,'Student WorkFlow Status')]")
	WebElement StudentWorkflowcheck;
	

	@FindBy(xpath = "//a[@href='/Student/GiftCategories']")
	WebElement GiftsCategoriesSubMenu;
	
	@FindBy( xpath ="//b[contains(.,'GiftCategories')]")
	WebElement GiftsCategoriescheck;

	@FindBy(xpath = "//*[@title='Expand Employee']")
	WebElement ExpandEmployee;

	@FindBy(xpath = "//*[@title='Collapse Employee']")
	WebElement CollapseEmployee;

	@FindBy(xpath = "//*[@title='Expand Student']")
	WebElement ExpandStudent;

	@FindBy(xpath = "//*[@title='Collapse Student']")
	WebElement CollapseStudent;

	@FindBy(xpath = "//*[@title='Expand Requisition']")
	WebElement ExpandRequisition;

	@FindBy(xpath = "//*[@title='Collapse Requisition']")
	WebElement CollapseRequisition;
	
	@FindBy(xpath ="//a[contains(.,'Message Status Report')]")
	WebElement MessageStatusReport;
	
	@FindBy(xpath ="//span[contains(.,'MessageStatusReport')]")
	WebElement MessageReportchecks;
	
	@FindBy(xpath ="//a[contains(.,'Message Conversation Report')]")
	WebElement MessageConversation;
	
	@FindBy(xpath ="//li[contains(text(),'Message Conversation Report')]")
	WebElement MessageConversationcheck;

	public void AdminMainMenu() {
		Admin.click();
	}

	public void UserSubMenu() {
		User.click();
		AddUser.isDisplayed();
	}

	public void RoleSubMenu() {
		Role.click();
		AddRole.isDisplayed();
	}

	public void OrganizationSubMenu() {
		Organization.click();
		Organizationsettings.isDisplayed();
		
	}

	public void EmailTemplateSubMenu() {
		EmailTemplate.click();
		AddEmailConfig.isDisplayed();
	}

	public void PrivilegeSubMenu() {
		Privilege.click();
		AddPrivilege.isDisplayed();
	}

	public void MenuSubMenu() {
		Menu.click();
		AddMenu.isDisplayed();
	}

	public void WorkflowSubMenu() {
		Workflow.click();
		Workflowgroup.isDisplayed();
		
	}

	public void MasterDetailListSubMenu() {
		MasterDetailList.click();
		AddMasterDetail1.isDisplayed();
		
	}

	public void MasterDetEntrySubMenu() {
		MasterDetailEntry.click();
		MasterDetailList.isDisplayed();
	}
	
	public void NotificationEntrysubmenu() {
		NotificationEntry.click();
		NotificationList.isDisplayed();
		
	}
	

	public void BookMainMenu() {
		Book.click();
	}

	public void BookAssignmentSubMenu() {
		BookAssignment.click();
		BooksAssignment.isDisplayed();
	}

	public void LeaveMainMenu() {
		Leave1.click();
	}

	public void HolidaysSubMenu() {
		Holidays.click();
		Holidayscheck.isDisplayed();
	}

	public void DashboardMainMenu() {
		Dashboard.click();
	}

	public void MyDashboardSubMenu() {
		MyDashboard.click();
		MyDashboardcheck.isDisplayed();
	}

	public void CenterMainMenu() {
		Center.click();
	}

	public void ClassTeacherEntrySubMenu() {
		// josk.ht@mohiafrica.org
		ClassTeacherEntry.click();
		TeacherAssignment.isDisplayed();
	}

	public void AnnualPhotoScheduleSubMenu() {
		AnnualPhotoSchedule.click();
		AnnualPhotoSchedulecheck.isDisplayed();
	}

	public void FamSocialWrkrAsgnmntSubMenu() {
		FamilySocialWorkerAsgnmnt.click();
		Assignfamilysocialworker.isDisplayed();
	}

	public void ExamMainMenu() {
		Exam.click();
	}

	public void ExamEntrySubMenu() {
		ExamEntry.click();
		ExamEntrycheck.isDisplayed();
	}

	public void ExamResultsSubMenu() {
		ExamResults.click();
		ExamResultcheck.isDisplayed();
	}

	public void InvigilationEntSubMenu() {
		InvigilationEntry.click();
		InvigilatorAssignment.isDisplayed();
	}

	public void SubjGradEntSubMenu() {
		SubjectGradingEntry.click();
		SubjectGradingcheck.isDisplayed();
	}

	public void Employee() {
		EmpMainMenu.click();
	}

	public void EmployeeRecruitment() {
		EmpRecSubMenu.click();
		EmpRecCheck.isDisplayed();
	}

	public void EmployeeList() {
		EmpListSubMenu.click();
		EmpListCheck.isDisplayed();
	}

	public void EmployeeLeave() {
		EmpLeaveSubMenu.click();
	}

	public void StaffPromotion() {
		webDriverclick(StaffPromotionSubMenu);
		StaffPromotionCheck.isDisplayed();
	}

	public void FASTMainMenu() {
		FAST.click();
	}

	public void AssessmentGenSubMenu() {
		AssessmentGeneration.click();
		GenerateAssessment.isDisplayed();
	}

	public void AssessmentSchedulesRepSubMenu() throws InterruptedException {
		AssessmentSchedulesRep.click();
		AssessmentScheduleCheck.isDisplayed();
	}

	public void AssessmentRepSubMenu() {
		AssessmentRep.click();
		AssessmentRepcheck.isDisplayed();
	}

	public void AssessmentAnalysisRepSubMenu() {
		AssessmentAnalysisRep.click();
		AssessmentAnalysislist.isDisplayed();
	}

	public void AssessmentChartSubMenu() {
		AssessmentChart.click();
		AssessmentChartCheck.isDisplayed();
	}

	public void FastActivityRepSubMenu() {
		FastActivityRep.click();
		FastActivitycheck.isDisplayed();
	}

	public void CollapseEmployeeButton() {

		WebElementUtils.waitForVisible(CollapseEmployee);

		webDriverclick(CollapseEmployee);
	}

	public void CollapseStudentButton() {

		WebElementUtils.waitForVisible(CollapseStudent);

		webDriverclick(CollapseStudent);
	}

	public void CollapseRequisitionButton() {

		WebElementUtils.waitForVisible(CollapseRequisition);

		webDriverclick(CollapseRequisition);
	}

	public void unpaidLeaveUpdateReminderAl() {

		// int t = getDriver().findElements(By.xpath("//*[@title='Expand
		// Employee']")).size();
		// if (t > 0) {
		webDriverclick(ExpandEmployee);
		// }

		WebElementUtils.waitForVisible(unpaidLeaveUpdateReminder);
		unpaidLeaveUpdateReminder.click();

	}

	public void bioInformationNotUpdatedAl() {

		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(bioInformationNotUpdated);

		WebElementUtils.scrolltoview(bioInformationNotUpdated);
		bioInformationNotUpdated.click();
	}

	public void chequeNumberSignedNotYetCollectedAl() {

		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(chequeNumberSignedNotYetCollected);
		WebElementUtils.scrolltoview(chequeNumberSignedNotYetCollected);

		chequeNumberSignedNotYetCollected.click();
	}

	public void cheqNoEnteredWaitingForDirSignAl() {

		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(cheqNoEnteredWaitingForDirSign);
		WebElementUtils.scrolltoview(cheqNoEnteredWaitingForDirSign);

		cheqNoEnteredWaitingForDirSign.click();
	}

	public void approvedCashOnlyRequisitionsAl() {

		webDriverclick(ExpandRequisition);

		WebElementUtils.waitForVisible(approvedCashOnlyRequisitions);
		WebElementUtils.scrolltoview(approvedCashOnlyRequisitions);

		approvedCashOnlyRequisitions.click();
	}

	public void cummulativeOverdueAl() throws InterruptedException {

		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(cummulativeOverdue);
		WebElementUtils.scrolltoview(cummulativeOverdue);

		cummulativeOverdue.click();
	}

	public void feeDepositWithoutSlipAl() {

		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(feeDepositWithoutSlip);
		WebElementUtils.scrolltoview(feeDepositWithoutSlip);

		webDriverclick(feeDepositWithoutSlip);
	}

	public void overdueFeePaymentsAl() {

		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(overdueFeePayments);
		WebElementUtils.scrolltoview(overdueFeePayments);

		webDriverclick(overdueFeePayments);
	}

	public void feeScheduleTodayAl() {
		webDriverclick(feeScheduleToday);
	}

	public void AssessmentsNotCarriedOutAl() {

		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(AssessmentsNotCarriedOut);
		WebElementUtils.scrolltoview(AssessmentsNotCarriedOut);

		webDriverclick(AssessmentsNotCarriedOut);
	}

	public void DashboardFn() {

		WebElementUtils.waitForVisible(Dashboard);

		webDriverclick(Dashboard);
		webDriverclick(MyDashboard);

	}

	public void EnrollStudentFn() {
		webDriverclick(EnrollStudent);
	}

	public void FeeDepositFn() {
		webDriverclick(FeeDeposit);
	}

	public void UploadCMFNumbersFn() {
		webDriverclick(UploadCMFNumbers);
	}

	public void UploadSponsorshipDetailsFn() {
		webDriverclick(UploadSponsorshipDetails);
	}

	public void UpdatePhotoSchedulesFn() {
		webDriverclick(UpdatePhotoSchedules);
	}

	public void UploadStudentsCMFPhotoFn() {
		webDriverclick(UploadStudentsCMFPhoto);
	}

	public void AssignSwforfamilyFn() {
		webDriverclick(AssignSwforfamily);
	}

	public void PromoSectionChngDetainFn() {
		webDriverclick(PromoSectionChngDetain);
	}

	public void TransferStudentsFn() {
		webDriverclick(TransferStudents);
	}

	public void InvigilationAssignmentFnFn() {
		webDriverclick(InvigilationAssignmentFn);
	}

	public void AddMasterDetailFn() {
		webDriverclick(AddMasterDetail1);
	}

	public void SubmitRequisitionFn() {
		webDriverclick(SubmitRequisition);
	}

	public void AddSupplierFn() {
		webDriverclick(AddSupplier);
	}

	public void CreateInventoryItemsFn() {
		webDriverclick(CreateInventoryItems);
	}

	public void MarkStudentAttendanceFn() {
		webDriverclick(MarkStudentAttendance);
	}

	public void ExamManagementFn() {
		webDriverclick(ExamManagement);
	}

	public void PublishExamResultFn() {
		webDriverclick(PublishExamResult);
	}

	public void ClassTeacherAssignmentFn() {
		webDriverclick(ClassTeacherAssignment);
	}

	public void UpdateCenterAnnualPhotoScheduleFn() {
		webDriverclick(UpdateCenterAnnualPhotoSchedule);
	}

	public void VisitStudentFamilyFn() {
		webDriverclick(VisitStudentFamily);
	}

	public void SubjectGradingAssgnmntFn() {
		webDriverclick(SubjectGradingAssgnmnt);
	}

	public void LinkSupplierItemFn() {
		webDriverclick(LinkSupplierItem);
	}

	public void BookAssignmentFn() {
		webDriverclick(BookAssignment);
	}

	public void SubmitReimbursementFn() {
		webDriverclick(SubmitReimbursement);
	}

	public void AuditInventoryItemsFn() {
		webDriverclick(AuditInventoryItems);
	}

	public void TrackInventoryItemsFn() {
		webDriverclick(TrackInventoryItems);
	}

	public void UploadInventoryItemsFn() {
		webDriverclick(UploadInventoryItems);
	}

	public void RecruitNewEmployeeFn() {
		webDriverclick(RecruitNewEmployee);
	}

	public void Payroll() {
		PayrolMainMenu.click();
	}

	public void ManualPayrol() {
		ManualPayrolSubMenu.click();
		ManualPayrolcheck.isDisplayed();
	}

	public void PayStructureEntry() {
		PayStructureEntrySubMenu.click();
		PayStructure.isDisplayed();
	}

	public void PayStructureUpload() {
		PayStructureUploadSubMenu.click();
		PayStructureUpload.isDisplayed();
	}

	public void BDSSummaryReport() {
		BDSSummaryReportSubMenu.click();
		BDSSummaryReport.isDisplayed();
	}

	public void BankEntry() {
		BankEntrySubMenu.click();
		BankList.isDisplayed();
	}

	public void PaySlipSubMenu() {
		PaySlipSubMenu.click();
		PaySlip.isDisplayed();
	}

	public void P9AForm() {
		P9AFormSubMenu.click();
		P9AForm.isDisplayed();
	}

	public void EmployeeLoanReport() {
		EmployeeLoanReportSubMenu.click();
		EmployeeLoanReportcheck.isDisplayed();
	}

	public void SummaryReport() {
		SummaryReportSubMenu.click();
		PayrollSummaryReportcheck.isDisplayed();
	}

	public void StaffAge() {
		StaffAgeSubMenu.click();
		StaffAge.isDisplayed();
	}

	public void StaffCount() {
		StaffCountSubMenu.click();
		StaffCount.isDisplayed();
	}

	public void NetPayGrossPay() {
		NetPayGrossPaySubMenu.click();
		NetAndGrossPay.isDisplayed();
	}

	public void SummaryReportbyDesg() {
		SummaryReportbyDesgSubMenu.click();
		PayrollSummarybyDesignation.isDisplayed();
	}

	public void ActiveStudentsRep() {
		ActiveStudents.click();
	}

	public void AllParentContributionsRep() {
		AllParentContributions.click();
	}

	public void AllStudentsRep() {
		AllStudents.click();
	}

	public void AllSuppliers() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", AllSuppliers);
		// AllSuppliers.click();
	}

	public void ChildGiftSummaryRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", ChildGiftSummary);
	}

	public void ClassTeacherRep() {
		ClassTeacher.click();
	}

	public void EmployeeLoanReportRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", EmployeeLoanReport);
	}

	public void EmployeeReportRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", EmployeeReport);
	}

	public void ExamRep() {
		Exam.click();
	}

	public void ExamResultsByClassRep() {
		ExamResultsByClass.click();
	}

	public void FamilyVisitSummaryRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FamilyVisitSummary);
	}

	public void FinancialSummaryRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", FinancialSummary);
		FinancialSummarycheck.isDisplayed();
	}

	public void InactiveStudentsRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", InactiveStudents);
		// InactiveStudents.click();
	}

	public void InterSchoolTransferRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", InterSchoolTransfer);
	}

	public void InvigilationAssignmentThisMonthRep() {
		InvigilationAssignmentThisMonth.click();
	}

	public void InvigilationAssignmentThisWeekRep() {
		InvigilationAssignmentThisWeek.click();
	}

	public void AllInvigilationAssignmentRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", AllInvigilationAssignment);
	}

	public void LPOsCreatedAfterNeededByDateRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", LPOsCreatedAfterNeededByDate);
	}

	public void MarkStudentAttendanceRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", MarkStudentAttendance);
	}

	public void P9AReportRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", P9AReport);
	}

	public void ParentContributionsThisMonthRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", ParentContributionsThisMonth);
	}

	public void ParentContributionsThisWeekRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", ParentContributionsThisWeek);
	}

	public void PayrollSummaryReportRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", PayrollSummaryReport);
	}

	public void PaySlipReportRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", PaySlipReport);
	}

	public void PromotionReportRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", PromotionReport);
	}

	public void RankingReportRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", RankingReport);
	}

	public void SubjectGradingRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", SubjectGradingcheck);
	}

	public void LPOsNeededByThisWeekRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", LPOsNeededByThisWeek);
	}

	public void LPOsNeededByThisTodayRep() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", LPOsNeededByThisToday);
	}

	public void Procurement() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", ProcurementMainMenu);
		// ProcurementMainMenu.click();
	}

	public void Supplier() {
		// SupplierSubMenu.click();
		webDriverclick(SupplierSubMenu);
		Supplier.isDisplayed();
	}

	public void SupplierLinking() {
		SupplierLinkingSubMenu.click();
		SupplierLinking.isDisplayed();
	}

	public void LpoRequisition() {
		LpoRequisitionSubMenu.click();
	}

	public void InventoryReport() {
		InventoryReportSubMenu.click();
		InventoryReport.isDisplayed();
	}

	public void InventoryTracking() {
		InventoryTrackingSubMenu.click();
		InventoryTracking.isDisplayed();
	}

	public void InventoryAudit() {
		InventoryAuditSubMenu.click();
		InventoryAudit.isDisplayed();
	}

	public void InventoryItemsUpload() {
		InventoryItemsUploadSubMenu.click();
		ItemUpload.isDisplayed();
	}

	public void Requisition() {
		RequisitionSubMenu.click();
		RequisitionList.isDisplayed();
	}

	public void LpoList() {
		LpoSubMenu.click();
		LPOList.isDisplayed();
	}

	public void Reimbursement() {
		ReimbursementSubMenu.click();
		ReimbursementList.isDisplayed();
	}

	public void LpoPayment() {
		LpoPaymentSubMenu.click();
	}

	public void LpoRequisitionSummary() {
		LpoRequisitionSubMenu.click();
		LpoRequisition.isDisplayed();
	}

	public void PromotionMainMenu() {
		Promotion.click();
	}

	public void InSchlPromotionSubMenu() {
		InSchoolPromotion.click();
		InSchoolPromotionCheck.isDisplayed();
	}

	public void TransferAndPromotionalSubMenu() {
		TransferAndPromotional.click();
		TransferPromotional.isDisplayed();
	}

	public void Reports() {
		RepMainMenu.click();
	}

	public void ParentContribution() {
		ParentContributionSubMenu.click();
		ParentContributioncheck.isDisplayed();
	}

	public void Student() {
		StudentSubMenu.click();
		Studentcheck.isDisplayed();
	}

	public void ClassTeacher() {
		ClassTeacherSubMenu.click();
		ClassTeachercheck.isDisplayed();
	}

	public void Exam() {
		ExamSubMenu.click();
		Examcheck.isDisplayed();
	}

	public void Invigilation() {
		InvigilationSubMenu.click();
		Invigilationcheck.isDisplayed();
	}

	public void RankingRep() {
		RankingRepSubMenu.click();
		RankingReportcheck.isDisplayed();
	}

	public void SubjectGrading() {
		SubjectGradingSubMenu.click();
		SubjectGradings.isDisplayed();
	}

	public void Promotion() {
		PromotionSubMenu.click();
		Promotioncheck.isDisplayed();
	}

	public void Book() {
		BookSubMenu.click();
		AssignBookcheck.isDisplayed();
	}

	public void CMFReport() {
		CMFReportSubMenu.click();
		CMFReportcheck.isDisplayed();
	}

	public void FamilyVisit() {
		FamilyVisitSubMenu.click();
		FamilyVisitcheck.isDisplayed();
	}

	public void SocialWorkerFollowUp() {
		SocialWrkrFlwUpSubMenu.click();
		SocialWorkerFollowup.isDisplayed();
	}

	public void InterSchlTransfer() {
		InterSchlTrnsfrSubMenu.click();
		SchoolTransfercheck.isDisplayed();
	}

	public void ChildGiftSummary() {
		ChildGiftSumrySubMenu.click();
		ChildGiftcheck.isDisplayed();
	}

	public void PullOutRep() throws InterruptedException {
		Thread.sleep(1000);
		PullOutRepSubMenu.click();
		StudentPulloutcheck.isDisplayed();
	}

	public void SponsorshipMainMenu() {
		Sponsorship.click();
		
	}

	public void CMFUploadSubMenu() {
		CMFUpload.click();
		CMFNumbersUpload.isDisplayed();
	}

	public void SponsorUploadSubMenu() {
		SponsorUpload.click();
		SponsorUploadcheck.isDisplayed();
	}

	public void CMFEditSubMenu() {
		CMFEdit.click();
	}

	public void StaffProfileMainMenu() {
		StaffProfile.click();
	}

	public void BasicProfileSubMenu() {
		BasicProfile.click();
	}

	public void PayStructureDetSubMenu() {
		PayStructureDetails.click();
	}

	public void PaySlipDetailSubMenu() {
		PaySlipDetails.click();
	}

	public void studentMenu() {
		webDriverclick(studentMainMenu);
	}

	public void studentEntry() {
		webDriverclick(studentEntrySubMenu);
		studentEntry.isDisplayed();
	}

	public void FeeDeposit() {
		webDriverclick(FeeDepositSubMenu);
		FeeDepositcheck.isDisplayed();
	}

	public void Attendance() {
		webDriverclick(AttendanceSubMenu);
		Attendance.isDisplayed();
	}

	public void FamilyVisitsummary() {
		webDriverclick(FamilyVisitsummarySubMenu);
		FamilyVisitchecks.isDisplayed();
		
	}

	public void EducationLoanRequest() {
		webDriverclick(EducationLoanRequestSubMenu);
	}

	public void StudentProfile() {
		webDriverclick(StudentProfileSubMenu);
	}

	public void EducationLoanRepayment() {
		webDriverclick(EducationLoanRepaymentSubMenu);
		EducationLoanRepaymentcheck.isDisplayed();
	}

	public void SpecialAttendance() {
		webDriverclick(SpecialAttendanceSubMenu);
		SpecialAttendancecheck.isDisplayed();
	}

	public void SpecialAttendanceUpload() {
		webDriverclick(SpecialAttendanceUploadSubMenu);
		SpecialAttendanceuploadcheck.isDisplayed();
	}

	public void Messages() {
		webDriverclick(MessageSubMenu);
		Messagecheck.isDisplayed();
	}

	public void Gifts() throws InterruptedException {
		webDriverclick(GiftsSubMenu);
		Thread.sleep(3000);
		Giftcheck.isDisplayed();
	}

	public void sponsorDashboardFn() {
		webDriverclick(sponsorshipDashboard);
		SponsorDashboard.isDisplayed();
	}

	public void sponsorListFn() {
		webDriverclick(sponsorList);
		sponsorListcheck.isDisplayed();
		
	}

	public void GiftsCategoriesSubMenuFn() {
		webDriverclick(GiftsCategoriesSubMenu);
		GiftsCategoriescheck.isDisplayed();
	}

	public void StudentWorkflowstatusSubMenuFn() throws InterruptedException {
		webDriverclick(StudentWorkflowstatusSubMenu);
		StudentWorkflowcheck.isDisplayed();
	}

	public void MessageReportSubMenuFn() {
		webDriverclick(MessageReport);
		MessageReportcheck.isDisplayed();
	}

	public void EmployeeLeaveReportSubMenuFn() {
		webDriverclick(EmployeeLeaveReport);
		EmployeeLeaveReportcheck.isDisplayed();
	}
	
	public void  FeeMasterEntrysubmenu(){
		
		FeeMasterEntry.click();
		FeeMasterEntrycheck.isDisplayed();
		
	}
	
	public void AcademicTermEntrysubmenu() {
		
		AcademicEntry.click();
		AcademicEntrycheck.isDisplayed();
		
	}
	
	public void Messagestatusreportsubmenu(){
		
		WebElementUtils.scrolltoview(MessageStatusReport);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", MessageStatusReport);
		//MessageStatusReport.click();
		MessageReportchecks.isDisplayed();
		
	}
	
	public void MessageconversationReportsubmenu(){
		
		WebElementUtils.scrolltoview(MessageConversation);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", MessageConversation);
		//MessageConversation.click();
		MessageConversationcheck.isDisplayed();
		
	}
	
	

}
