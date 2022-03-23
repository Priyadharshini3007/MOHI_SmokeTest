Feature: This is the student disable feature 
@StudentDisableFeature
Scenario: This is student disable Scenario
Given user is on login page
	And Enter username "CSO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to InActive Students
	And click disable icon to disable the student
	And Enter the disable reason and comments and click save 
	
	
@StudentDisableFeature
@logout
Scenario: Log out the user
And log out