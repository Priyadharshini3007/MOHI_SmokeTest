Feature: This is the Admin Menu feature
 
@AddNewMenu
Scenario: This is Add New Menu Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Menu submenu
	And Click Add Menu Link
	And Enter the required fields
	And Click save button to save the newly added menu
	And Navigate to Admin and click Role submenu
	And Filter the Role and select Manage menu Link
	And Select the newly created menu and save
	

@AddNewMenu
@logout
Scenario: Log out the user
And log out


@AddNewMenu
@EditExistingMenu
Scenario: This is Edit Existing  Menu Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Menu submenu
	And Click Edit icon
	And Click save button to save the edited menu
	
	
@AddNewMenu
@EditExistingMenu
@logout
Scenario: Log out the user
And log out

@AddNewMenu
@AdminMenuReturnToList
Scenario: This is to verify AdminMenu Return to List Button Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Menu submenu
	And Click Add menu link and select ReturnToList Button
	And Click EditButton And select ReturnToList Button
@AddNewMenu		
@AdminMenuReturnToList
@logout
Scenario: Log out the user
And log out
@AddNewMenu
@MenuInactive
Scenario: This is to verify menu become inactive Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Menu submenu
	And click Edit button on any menu and uncheck Is Active Button and Click save
	
@AddNewMenu		
@MenuInactive
@logout
Scenario: Log out the user
And log out

@AddNewMenu
@ApplicationFieldDefaultedToSiteAdmin
Scenario: This is to verify Application field is defaulted to SiteAdmin Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Menu submenu
	And Click Add Menu Link
	And Verify Appication is defaulted to SiteAdmin
	
@AddNewMenu		
@ApplicationFieldDefaultedToSiteAdmin
@logout
Scenario: Log out the user
And log out
@AddNewMenu
@InactiveElementNotDisplayedinSite
Scenario: This is to verify Inactive Element not Displayed in The site Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Menu submenu
	And Verify the inactive element not displayed in the associated center
	
	
@AddNewMenu		
@InactiveElementNotDisplayedinSite
@logout
Scenario: Log out the user
And log out

