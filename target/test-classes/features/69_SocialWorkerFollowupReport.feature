Feature: To Verify SocialworkerFollowup Report
@Reports
@SocialworkerFollowupReport
Scenario: This is SocialworkerFollowup report scenario 
	Given user is on login page
	And Enter username "Socialworker" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And click report menu and click SocialworkerFollowup submenu 
	And Select the follow-up reason, enter the date range and select the follow-up status and click on the go button to retrieve the student details
	And click on the follow up pending icon to enter the follow-up details 
	And click on the follow up completed icon to view the follow-up details 
	And Click on the view student profile icon to view the student profile and click on the social worker follow up history link to view the history of social worker follow-ups done for the child
	And click on the view student in student report icon to get the student filtered in the student report
	And click view student in parent contribution report icon to get the student filtered in the parent contribution report.
	
@Reports	
@logout
Scenario: Log out the user
 And log out 