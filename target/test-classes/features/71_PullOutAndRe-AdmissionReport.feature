Feature: To Verify PullOut,Readmission and Disabled Report
@Reports
@PullOutAndReAdmissionReport
@PullOutReport
Scenario: This is PullOut report scenario 
And initiate web browser
	Given user is on login page
	And Enter username "CSCUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And click report menu and click pullout report submenu
	And Report can be filtered based on Type like Pull Out
	And click on view report to view the type of report selected from the dropdown
	And click download to dowload the selected Report in the specified format
@Reports	
@PullOutAndReAdmissionReport
@ReAdmissionReport
Scenario: This is ReAdmission Report scenario 
	And click report menu and click pullout report submenu
	And Report can be filtered based on Type like Re-Admission
	And click on view report to view the type of report selected from the dropdown
	And click download to dowload the selected Report in the specified format
@Reports	
@PullOutAndReAdmissionReport	
@DisabledReport
Scenario: This is Disabled Report scenario 
	And click report menu and click pullout report submenu
	And Report can be filtered based on Type like Disabled
	And click on view report to view the type of report selected from the dropdown
	And click download to dowload the selected Report in the specified format
	
@Reports	
@logout
Scenario: Log out the user
 And log out 
 And close window