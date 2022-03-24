Feature: To verify Admin Menu navigations 

@SmokeTestNavi 
@menunavigation 
@AdminMenunavigation 
Scenario: Verification of User menu navigation 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select Admin menu 
	And click User sub menu 
	When Select Admin menu 
	And click Role sub menu 
	When Select Admin menu 
	And click Organization sub menu 
	When Select Admin menu 
	And click Email Template sub menu 
	When Select Admin menu 
	And click Privilege sub menu 
	When Select Admin menu 
	And click Menu as sub menu 
	When Select Admin menu 
	And click Workflow sub menu 
	When Select Admin menu 
	And click Master Detail List sub menu 
	When Select Admin menu 
	And click Master Detail Entry sub menu 
	When Select Admin menu 
	And click Notification Entry sub menu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@SmokeTestNavi 
@menunavigation 
@Book&leavemenunavigation 
Scenario: To verify Book & Leave Menu navigations 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select Book menu 
	And click Book Assignment sub menu 
	When Select Dashboard menu 
	And click My Dashboard sub menu 
	When Select Leave menu 
	And click Holidays sub menu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
	
@SmokeTestNavi 
@menunavigation 
@centremenu 
Scenario: To verify center menu navigations 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select center menu 
	And click class teacher entry sub menu 
	When Select center menu 
	And click Annual Photo Schedule sub menu 
	When Select center menu 
	And click Family Social Worker Assignment sub menu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@SmokeTestNavi 
@menunavigation 
@exammenunavigation 
Scenario: To verify exam menu navigations 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select exam menu 
	And click Exam entry sub menu 
	When Select exam menu 
	And click Exam Results sub menu 
	When Select exam menu 
	And click Invigilation Entry sub menu 
	When Select exam menu 
	And click Subject Grading Entry sub menu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@SmokeTestNavi 
@menunavigation 
@employeemenunavigation 
Scenario: To verify employee menu navigations 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select employee menu 
	And click Employee Recruitment sub menu 
	When Select employee menu 
	And click Employee list sub menu 
	When Select employee menu 
	And click Employee leave sub menu 
	When Select employee menu 
	And click staff promotion report sub menu 
	When Select employee menu 
	And Click Employee Leave Report submenu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@SmokeTestNavi 
@menunavigation 
@fastmenunavigation 
Scenario: To verify FAST Menu navigations 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select FAST menu 
	And click Assessment Generation sub menu 
	When Select FAST menu 
	And click Assessment Schedules Report sub menu 
	When Select FAST menu 
	And click Assessment Report sub menu 
	When Select FAST menu 
	And click Assessment Analysis Report sub menu 
	When Select FAST menu 
	And click Assessment Chart sub menu 
	When Select FAST menu 
	And click Fast Activity Report sub menu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@menunavigation 
@myalertsnavigation 
Scenario: To verify Alerts navigations in dashboard 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	Given User is in dashboard 
	And Click the unpaid leave update reminder alert 
	Given User is in dashboard 
	And Click Employee Collapse button 
	And Click the students bio information not updated alert 
	Given User is in dashboard 
	And Click Student Collapse button 
	And Click the cash only requisitions with the cheque number alert 
	Given User is in dashboard 
	And Click Requisition Collapse button 
	And Click the cash only requisitions waiting for director alert 
	Given User is in dashboard 
	And Click Requisition Collapse button 
	And Click the cash only requisitions waiting for cheque writing alert 
	Given User is in dashboard 
	And Click Requisition Collapse button 
	And Click the cumulative overdue fee alert 
	Given User is in dashboard 
	And Click Student Collapse button 
	And Click the fee deposits without the bank deposit slip no alert 
	Given User is in dashboard 
	And Click Student Collapse button 
	And Click the overdue fee payments alert 
	Given User is in dashboard 
	And Click Student Collapse button 
	And Click the Assessments not carried out yet alert 
	Given User is in dashboard 
	And Click Student Collapse button 
	
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@menunavigation 
@functionnavigation 
Scenario: To verify My Functions from dashboard 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	Given User is in dashboard 
	When Click Enroll Student from My Functions 
	Given User is in dashboard 
	When Click Fee Deposit from My Functions 
	Given User is in dashboard 
	When Click Upload CMF Numbers from My Functions 
	Given User is in dashboard 
	When Click Upload Sponsorship details from My Functions 
	Given User is in dashboard 
	When Click Update Photo Schedules from My Functions 
	Given User is in dashboard 
	When Click Upload Students CMF Photo from My Functions 
	Given User is in dashboard 
	When Click Assign Social workers for family from My Functions 
	Given User is in dashboard 
	When Click Make Promotion/Detainment/Section change for students from My Functions 
	Given User is in dashboard 
	When Click Transfer Students to another Center from My Functions 
	Given User is in dashboard 
	When Click Invigilation Assignment from My Functions 
	Given User is in dashboard 
	When Click Add Master Detail from My Functions 
	Given User is in dashboard 
	When Click Submit Requisition from My Functions 
	Given User is in dashboard 
	When Click Add Supplier from My Functions 
	Given User is in dashboard 
	When Click Create Inventory items from My Functions 
	Given User is in dashboard 
	When Click Mark Student Attendance from My Functions 
	Given User is in dashboard 
	When Click Exam Management from My Functions 
	Given User is in dashboard 
	When Click Publish Exam Result from My Functions 
	Given User is in dashboard 
	When Click Class Teacher Assignment from My Functions 
	Given User is in dashboard 
	When Click Update Center Annual Photo Schedule from My Functions 
	Given User is in dashboard 
	When Click Visit Student Family from My Functions 
	Given User is in dashboard 
	When Click Subject Grading Assignment from My Functions 
	Given User is in dashboard 
	When Click Link supplier & item from My Functions 
	Given User is in dashboard 
	When Click Book Assignment from My Functions 
	Given User is in dashboard 
	When Click Submit Reimbursement from My Functions 
	Given User is in dashboard 
	When Click Audit Inventory items from My Functions 
	Given User is in dashboard 
	When Click Track inventory items from My Functions 
	Given User is in dashboard 
	When Click Upload Inventory Items from My Functions 
	Given User is in dashboard 
	When Click Recruit new employee from My Functions 
	
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@SmokeTestNavi 
@menunavigation 
@payrollmenunavigation 
Scenario: To verify payroll menu navigations 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select Payroll menu 
	And Click Manual Payroll submenu 
	When Select Payroll menu 
	And Click Pay Structure Entry submenu 
	When Select Payroll menu 
	And Click Pay Structure Upload submenu 
	When Select Payroll menu 
	And Click BDS Summary Report submenu 
	When Select Payroll menu 
	And Click Bank Entry submenu 
	When Select Payroll menu 
	And Click payslip submenu 
	When Select Payroll menu 
	And Click P9A form submenu 
	When Select Payroll menu 
	And Click Employee Loan Report submenu 
	When Select Payroll menu 
	And Click Summary Report submenu 
	When Select Payroll menu 
	And Click Staff Age Group Report submenu 
	When Select Payroll menu 
	And Click Staff Count Report submenu 
	When Select Payroll menu 
	And Click Net Pay & Gross Pay Report submenu 
	When Select Payroll menu 
	And Click Summary Report by Designation submenu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@menunavigation 
@reportsnavigation 
Scenario: To verify My Reports from dashboard 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	Given User is in dashboard 
	When Click Active students from My Reports 
	Given User is in dashboard 
	When Click All Parent contributions from My Reports 
	Given User is in dashboard 
	When Click All students from My Reports 
	Given User is in dashboard 
	When Click All Suppliers from My Reports 
	Given User is in dashboard 
	When Click Child Gift Summary from My Reports 
	Given User is in dashboard 
	When Click Class Teacher from My Reports 
	Given User is in dashboard 
	When Click Employee Loan Report from My Reports 
	Given User is in dashboard 
	When Click Employee Report from My Reports 
	Given User is in dashboard 
	When Click Exam from My Reports 
	Given User is in dashboard 
	When Click Exam Results By class from My Reports 
	Given User is in dashboard 
	When Click Family Visit Summary from My Reports 
	Given User is in dashboard 
	When Click Financial Summary from My Reports 
	Given User is in dashboard 
	When Click Inactive students from My Reports 
	Given User is in dashboard 
	When Click Inter-School Transfer from My Reports 
	Given User is in dashboard 
	When Click Invigilation assignment for this month from My Reports 
	Given User is in dashboard 
	When Click Invigilation assignment for this Week from My Reports 
	Given User is in dashboard 
	When Click All Invigilation Assignment from My Reports 
	Given User is in dashboard 
	When Click LPOs created after Needed by date from My Reports 
	Given User is in dashboard 
	When Click P9A Report from My Reports 
	Given User is in dashboard 
	When Click Parent contributions this month from My Reports 
	Given User is in dashboard 
	When Click Parent contributions this week from My Reports 
	Given User is in dashboard 
	When Click Payroll Summary Report from My Reports 
	Given User is in dashboard 
	When Click Pay Slip Report from My Reports 
	Given User is in dashboard 
	When Click Promotion Report from My Reports 
	Given User is in dashboard 
	When Click Subject Grading from My Reports 
	Given User is in dashboard 
	When Click LPOs needed by this week from My Reports 
	Given User is in dashboard 
	When Click LPOs needed by today from My Reports 
	
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@SmokeTestNavi 
@menunavigation 
@procurementmenunavigation 
Scenario: To verify procurement menu navigations 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select procurement menu 
	And Click supplier submenu 
	When Select procurement menu 
	And Click supplier linking submenu 
	When Select procurement menu 
	And Click Inventory Report submenu 
	When Select procurement menu 
	And Click Inventory Tracking submenu 
	When Select procurement menu 
	And Click Inventory Audit submenu 
	When Select procurement menu 
	And Click Inventory Items Upload submenu 
	When Select procurement menu 
	And Click Requisition List submenu 
	When Select procurement menu 
	And Click LPO List submenu 
	When Select procurement menu 
	And Click Reimbursement List submenu 
	When Select procurement menu 
	And Click LPO Payment Report submenu 
	When Select procurement menu 
	And Click LPO Requisition Summary Report submenu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@SmokeTestNavi 
@menunavigation 
@promotionmenunavigation 
Scenario: To verify Promotion Menu navigations 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select Promotion menu 
	And click In-SchoolPromotion sub menu 
	When Select Promotion menu 
	And click Transfer & Promotional Transfer sub menu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
	
@SmokeTestNavi 
@menunavigation 
@sponsorshipmenu 
Scenario: To verify Sponsorship Menu navigations 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select Sponsorship menu 
	And click CMF Upload sub menu 
	When Select Sponsorship menu 
	And click Sponsor Upload sub menu 
	When Select Sponsorship menu 
	And click CMF Edit sub menu 
	When Select Sponsorship menu 
	And Click Dashboard submenu 
	When Select Sponsorship menu 
	And Click Sponsor List submenu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@SmokeTestNavi 
@menunavigation 
@Staffprofilemenu 
Scenario: To verify Staff Profile Menu navigations 
	And initiate web browser 
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select Staff Profile menu 
	And click Basic Profile sub menu 
	When Select Staff Profile menu 
	And click Pay Structure Details sub menu 
	When Select Staff Profile menu 
	And click Pay Slip Details sub menu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@SmokeTestNavi 
@menunavigation 
@Studentsmenunavigation 
Scenario: To verify student menu navigations 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select student menu 
	And click student entry submenu 
	When Select student menu 
	And click fee deposit submenu 
	When Select student menu 
	And click attendance submenu 
	When Select student menu 
	And click family visit submenu 
	When Select student menu 
	And click Education Loan Request submenu 
	When Select student menu 
	And click Student Profile submenu 
	When Select student menu 
	And click Education Loan Repayment submenu 
	When Select student menu 
	And click Special Attendance Upload submenu 
	When Select student menu 
	And click Special Attendance submenu 
	When Select student menu 
	And click Messages submenu 
	When Select student menu 
	And click gifts submenu 
	When Select student menu 
	And Click Student Workflow status submenu 
	When Select student menu 
	And Click Gifts categories submenu 
	When Select student menu 
	And click Fee Master Entry submenu 
	When Select student menu 
	And click Academic Term Entry submenu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	
@SmokeTestNavi 
@menunavigation 
@reportsmenunavigation 
Scenario: To verify Reports menu navigations 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select Reports menu 
	And Click Parent Contribution submenu 
	When Select Reports menu 
	And Click Student List submenu 
	When Select Reports menu 
	And Click Class Teacher submenu 
	When Select Reports menu 
	And Click Exam submenu 
	When Select Reports menu 
	And Click Inviglilation submenu 
	When Select Reports menu 
	And Click Ranking Report submenu 
	When Select Reports menu 
	And Click Subject Grading submenu 
	When Select Reports menu 
	And Click Promotion submenu 
	When Select Reports menu 
	And Click Book submenu 
	When Select Reports menu 
	And Click Student CMF Report submenu 
	When Select Reports menu 
	And Click Family Visit Summary submenu 
	When Select Reports menu 
	And Click Social Worker Follow-up submenu 
	When Select Reports menu 
	And Click Inter-School Transfer submenu 
	When Select Reports menu 
	And Click Child Gift Summary submenu 
	When Select Reports menu 
	And Click Pull out Report submenu 
	When Select Reports menu 
	And Click Financial Summary submenu 
	When Select Reports menu 
	And Click Message Report submenu 
	When Select Reports menu 
	And Click Message status report submenu 
	When Select Reports menu 
	And Click Message conversation Report submenu 
	
@SmokeTestNavi 
@menunavigation 
Scenario: Log out the user 
	And log out 
	And close window 
	