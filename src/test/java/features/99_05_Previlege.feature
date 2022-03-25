Feature: This is the Previlege feature 
@AddPrevilege
Scenario: This is Add Previlege Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click previlege submenu
	And Click Add Previlege Link
	And Enter the Previlege required fields 
	And Click save button to save the newly added previlege
	
	
@AddPrevilege
@logout
Scenario: Log out the user
And log out
And close window

@AddPrevilege
@EditExistingPrevilege
Scenario: This is edit existing  Previlege Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click previlege submenu
	And Click Edit icon to edit the existing previlege
	And Edit the Previlege required fields 
	And Click save button to save the edited previlege changes
	
@AddPrevilege	
@EditExistingPrevilege
@logout
Scenario: Log out the user
And log out
And close window

@AddPrevilege
@PrevilegeReturnToList
Scenario: This is Previlege Return To List Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click previlege submenu
	And Click Add Previlege Link and click ReturnToListButton
	And Click Edit Previlege and click ReturnToListButton

	
@AddPrevilege	
@PrevilegeReturnToList
@logout
Scenario: Log out the user
And log out
And close window

@AddPrevilege
@PrevilegeListCanBeViewed
Scenario: This is Previlege can be able to view Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click previlege submenu
	And Ensure that Previlege list can be Viewed

	
@AddPrevilege	
@PrevilegeListCanBeViewed
@logout
Scenario: Log out the user
And log out
And close window