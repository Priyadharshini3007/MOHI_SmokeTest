Feature: This is the Organization feature 
@AddOrganization
Scenario: This is Add Organization Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And Click Add Button
	And Enter the Organization required fields
	And Click save button to save the newly added Organization

@AddOrganization
@logout
Scenario: Log out the user
And log out


@EditOrganization
Scenario: This is Edit Organization Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And Click Edit to edit the Organization required fields
	And Click save button to save the edited Organization details

@EditOrganization
@logout
Scenario: Log out the user
And log out	


@AssignRoleToOrganization
Scenario: This is Assign Role to Organization Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And Click Assign role to organization icon
	And Select Designation and Role and click add new role button
	

@AssignRoleToOrganization
@logout
Scenario: Log out the user
And log out	


@OrganizationListCanBeViewed
Scenario: This is to view Organization list Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And Ensure that organization list can be Viewed

	

@OrganizationListCanBeViewed
@logout
Scenario: Log out the user
And log out	



@OrganizationSort
Scenario: This is to verify Organization Hierarchy and Designation Tab  Sort Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And Select Organization Hierarchy Tab
	And Ensure that search and sort working properly


	

#@OrganizationSort
#@logout
#Scenario: Log out the user
#And log out	

@OrganizationSearch
Scenario: This is to verify Organization Search Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And enter the name and Select Search icon
	#And click on Organization Hierarchy Tab and enter the name and click search
	#And click on Designation tab and enter the name and click search
	


	

#@OrganizationSearch
#@logout
#Scenario: Log out the user
#And log out		



@AddOrganizationHierarchy
Scenario: This is to Add organization Hierarchy Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And Select Organization Hierarchy Tab
	And Click Add symbol and enter the required details
	And Click save Button to save the Organization Hierarchy

	

@AddOrganizationHierarchy
@logout
Scenario: Log out the user
And log out	



@OrganizationHierarchyListCanBeViewed
Scenario: This is to view Organization Hierarchy list Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And Select Organization Hierarchy Tab
	And Ensure that Organization Hierarchy List can be Viewed

	

@OrganizationHierarchyListCanBeViewed
@logout
Scenario: Log out the user
And log out	

@EditOrganizationHierarchy
Scenario: This is to Edit Organization Hierarchy Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And Select Organization Hierarchy Tab
	And Edit the Organization Hierarchy Required fields 
	And Click save Button to save the Edited Organization Hierarchy
	

@EditOrganizationHierarchy
@logout
Scenario: Log out the user
And log out	


@DeleteOrganizationHierarchy
Scenario: This is to Delete Organization Hierarchy Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And Select Organization Hierarchy Tab
	And Search the name to delete from orgnization Hierarchy
	And Click Delete icon Button to delete the Edited Organization Hierarchy
	

@DeleteOrganizationHierarchy
@logout
Scenario: Log out the user
And log out	

@AddDesignation
Scenario: This is to Add designation Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And Select Designation Tab
	And Click Add Button and enter the Designation required field
	And Click save button to save the Designation details

	

@AddDesignation
@logout
Scenario: Log out the user
And log out	




@DeleteRoleMappedToOrganization
Scenario: This is to Delete the role mapped to Organization Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Organization submenu
	And Select Assign role to organization icon and delete the role mapped to the Organization

	
@DeleteRoleMappedToOrganization
@logout
Scenario: Log out the user
And log out	