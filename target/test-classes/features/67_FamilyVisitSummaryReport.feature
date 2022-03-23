Feature: To Verify FamilyVisit Summary Report
@Reports
@FamilyVisitSummaryReport 
Scenario: This is FamilyVisit Summary report scenario 
	Given user is on login page 
	And Enter username "CSCUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And click report menu and click FamilyVisit Summary submenu 
	And report can be filtered based on the center, social worker, family visit year, term, month and CMF ID
	And click on view fvreport
	And click download to dowload the report in specified format
	
	
@Reports	
@logout
Scenario: Log out the user
 And log out 	