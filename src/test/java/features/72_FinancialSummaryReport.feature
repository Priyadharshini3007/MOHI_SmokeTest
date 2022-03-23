Feature: To Verify Financial Summary Report
@Reports
@FinancialSummaryReport
Scenario: This is Financial Summary Report scenario 
	Given user is on login page
	And Enter username "CSCUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And click report menu and click Financial Summary report submenu
	And Reports can be filtered based on type – center or month & year and payment status
	And click on view report to view the Financial Summary Report based on the selection 
	And click download to dowload the Financial Summary Report in the specified format
	
@Reports	
@logout
Scenario: Log out the user
 And log out 