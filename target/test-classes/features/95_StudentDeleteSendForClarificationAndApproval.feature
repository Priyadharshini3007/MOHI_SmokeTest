Feature: This is the Student Delete Send For Clarification And Approval feature 
@StudentDeleteSendForClarificationAndApprovalFeature
Scenario: This is Student Delete Send For Clarification And Approval Scenario
Given user is on login page
	And Enter username "CSO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to InActive Students
	And Get the Student CMFId which is deleted
	And click delete icon to delete the student
	And Enter the comments and click save and click Ok for both alerts and logout
	And log out
	
	
	
	And Enter username "CSMUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click on delete request waiting for approval link
	And Click Go Button
	And Enter CMF ID and click on Search button to delete the student
	And click delete icon to delete the student
	And Enter the comments and click Send For Clarification to previous step button and logout
	And log out
	
	
	And Enter username "CSO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click on student need more info link
	And Click Go Button
	And Enter CMF ID and click on Search button to delete the student
	And click delete icon to delete the student
	And Enter the comments and click Send Clarification button to delete the student and logout
	And log out
	
	
	
	And Enter username "CSMUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click on student receive more info link
	And Click Go Button
	And Enter CMF ID and click on Search button to delete the student
	And click delete icon to delete the student
	And Enter the comments and click Approve Button to delete the student
	
@StudentDeleteSendForClarificationAndApprovalFeature
@logout
Scenario: Log out the user
And log out