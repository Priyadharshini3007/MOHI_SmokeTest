Feature: To Verify parent contribution feature 
#@Reports
@ParentContributionReport
Scenario: This is Parent Contribution Report scenario
Given user is on login page
	And Enter username "Accountant" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Select Reports menu and select parent contribution submenu
	And Filter the grid with valid search criteria
	And Search the name and add bank deposit number
	And edit bank deposit number
#@Reports	
@ParentContributionReport
@logout
Scenario: Log out the user
 And log out
