Feature: This is WorkFlow feature 
@AddUsersInTheWorkFlow
Scenario: This is Add Users to the corresponding workflow Scenario
And initiate web browser
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click WorkFlow submenu
	And Click Edit icon for the respective WorkFlow
	And Select WorkFlow Tab
	And Click Approver Assignment icon
	And Enter the User name and click Save
	

@AddUsersInTheWorkFlow
@logout
Scenario: Log out the user
And log out
And close window


@WorkFlowListCanAbleToView
Scenario: This is to verify Workflow List can able to view Scenario
And initiate web browser
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click WorkFlow submenu
	And Ensure that WorkFlow list can be Viewed
	
	

@WorkFlowListCanAbleToView
@logout
Scenario: Log out the user
And log out
And close window

@AdminWorkFlowReturnToList
Scenario: This is to verify Admin Workflow Return to List Button Scenario
And initiate web browser
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click WorkFlow submenu
	And Click Add workflow Step Group icon and select ReturnToList Button
	And Click Edit workflow Step Group icon And select ReturnToList Button
		
@AdminWorkFlowReturnToList
@logout
Scenario: Log out the user
And log out
And close window

@EditUsersInTheWorkFlow
Scenario: This is Edit Users to the corresponding workflow Scenario
And initiate web browser
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click WorkFlow submenu
	And Click Edit icon for the respective WorkFlow
	And Select WorkFlow Tab
	And Click Edit icon to edit the workflow step and click save icon
	
	

@EditUsersInTheWorkFlow
@logout
Scenario: Log out the user
And log out
And close window

