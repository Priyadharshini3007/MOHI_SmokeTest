Feature: This is the Role feature 

@c
@AddRole
Scenario: This is Add Role Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Role submenu
	And Click Add Role Link
	And Enter the Role required fields 
	 And Click save button to save the newly added Role

@c	
@AddRole
@logout
Scenario: Log out the user
And log out	
And close window 


@d
@EditExistingRole
Scenario: This is edit existing Role Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Role submenu
	And Click Edit icon to edit the existing Role
	And Edit the Role required fields 
	And Click save button to save the edited Role changes
	
	
@EditExistingRole
@logout
Scenario: Log out the user
And log out
And close window 


@DeleteRole
Scenario: This is Delete Role Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Role submenu
	And Click Delete icon to Delete the existing Role
 
	
	
@DeleteRole
@logout
Scenario: Log out the user
And log out
And close window 

@DeleteRoleWhenAssociatedWithSystemDetails
Scenario: This is Delete Role when Associated with SystemDetails Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Role submenu
	And Click Delete icon to Delete and ensure that the Role not get Deleted
 
	
	
@DeleteRoleWhenAssociatedWithSystemDetails
@logout
Scenario: Log out the user
And log out
And close window 


@ToInactiveRole
Scenario: This is to Inactive Role Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Role submenu
	And Click Inactive Checkbox to inactive the Role
 
	
	
@ToInactiveRole
@logout
Scenario: Log out the user
And log out
And close window 


@RoleReturnToList
Scenario: This is Role Return To List Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Role submenu
	And Click Add Role Link and click ReturnToListButton
	And Click Edit Role and click ReturnToListButton

	
	
@RoleReturnToList
@logout
Scenario: Log out the user
And log out
And close window 


@AssociateMenusToRole
Scenario: This is Associate Menu to Role Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Role submenu
	And Click Manage Menu Link to Associate menu to the Role
	

	
	
@AssociateMenusToRole
@logout
Scenario: Log out the user
And log out
And close window 

@AssociatePrevilegeToRole
Scenario: This is Associate Menu to Role Scenario
And initiate web browser 
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Role submenu
	  And Click Previlege Menu Link to Associate Previlege to the Role
	

	
	
@AssociatePrevilegeToRole
@logout
Scenario: Log out the user
And log out
And close window 


