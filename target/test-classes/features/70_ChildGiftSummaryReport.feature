Feature: To Verify ChildGiftSummary Report 
@Reports 
@ChildGiftSummaryReport 
Scenario: This is ChildGiftSummary report scenario 
	And initiate web browser 
	Given user is on login page 
	And Enter username "CSCUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And click report menu and click childgift summary submenu 
	And report can be filtered based on the Center,School,Received From Date,Received To Date and GiftStatus 
	And click on view report to view the childgift summary report 
	And click download to dowload the childgiftsummary report in specified format 
	And Click Tracking Report 
	And Report can be filtered based on Center,School,Year and CMF ID 
	And click on view report to view the childgift summary report 
	And click download to dowload the childgiftsummary report in specified format 
	
@Reports 
@ChildGiftSummaryReport 
@logout 
Scenario: Log out the user 
	And log out 
	And close window