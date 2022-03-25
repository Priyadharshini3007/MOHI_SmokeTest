Feature: This is the student delete Denied feature 
@StudentDeleteDeniedFeature
Scenario: This is student delete Denied Scenario
And initiate web browser 
Given user is on login page
	And Enter username "CSO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to InActive Students
	And Get the Student CMFId which is deleted
	And click delete icon to delete the student
	And Enter the comments and click save and click Ok for both alerts and logout
	And log out	
	And close window
	And initiate web browser 
	And Enter username "CSMUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click on delete request waiting for approval link
	And Click Go Button
	And Enter CMF ID and click on Search button to deny delete the student
	And click delete icon to delete the student
	And Enter the comments and click Deny button
	
	
	
@StudentDeleteDeniedFeature
@logout
Scenario: Log out the user
And log out
And close window