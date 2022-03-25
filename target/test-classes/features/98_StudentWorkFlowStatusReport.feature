Feature: To Verify student workflow status report 
@Reports 
@StudentWorkFlowStatusReport
Scenario: This is student workflow status report Scenario
And initiate web browser
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to student and select StudentWorkFlowStatus submenu
	And Enter CMF ID or Student name and click Go Button to view By student
	And Filter the records with column header search criteria for a student
	And Click the toggle button to view t By center
	And Select Center, Workflow Type & Workflow Step and click Go
	And Filter the records with column header search criteria 
@Reports	
@logout
Scenario: Log out the user
And log out
And close window