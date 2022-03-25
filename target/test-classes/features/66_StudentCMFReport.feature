Feature: To verify Student CMF Report 
@Reports 
@StudentCMFReport 
Scenario: This is Student CMF report scenario 
	And initiate web browser 
	Given user is on login page 
	And Enter username "CSCUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And click report menu and click studentCMFReport submenu 
	And Select the Report criteria and center name from the dropdown 
	And Set the Date range Both From and To 
	And Click the Search button to view the report 
	And click download to dowload the excel 
	
@Reports 
@logout 
Scenario: Log out the user 
	And log out 
	And close window