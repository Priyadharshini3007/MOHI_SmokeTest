Feature: This is the Role feature 
@AddRole
Scenario: This is Add Role Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Role submenu
	And Click Add Role Link
	And Enter the Role required fields 
	And Click save button to save the newly added Role

@AddRole
@logout
Scenario: Log out the user
And log out	


@EditExistingRole
Scenario: This is edit existing Role Scenario
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


@DeleteRole
Scenario: This is Delete Role Scenario
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

@DeleteRoleWhenAssociatedWithSystemDetails
Scenario: This is Delete Role when Associated with SystemDetails Scenario
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



@ToInactiveRole
Scenario: This is to Inactive Role Scenario
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



@RoleReturnToList
Scenario: This is Role Return To List Scenario
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

@AssociateMenusToRole
Scenario: This is Associate Menu to Role Scenario
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


@AssociatePrevilegeToRole
Scenario: This is Associate Menu to Role Scenario
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



