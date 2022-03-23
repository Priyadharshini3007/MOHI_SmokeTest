Feature: To verify the User menus 

#@adduser	
@AddingSocialworker 
Scenario: 10982_To add social worker User 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the social worker user 
	Then Click on Submit button 
	And Return to user list page 
	
	
	
	
	#@adduser
	# @AddingHeadTeacher
Scenario: To add Head Teacher User 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the Head Teacher user 
	Then Click on Submit button 
	And Return to user list page 
	
	
	
	#@adduser
	#@AddingClassTeacher
Scenario: To add Class Teacher User 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the class Teacher user 
	Then Click on Submit button 
	And Return to user list page 
	
	
	# @adduser
@AddingSeniorTeacher 
Scenario: To add Senior Teacher User 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the senior Teacher user 
	Then Click on Submit button 
	And Return to user list page 
	
	
	#@adduser 
@AddingregionalEducationCoordinator 
Scenario: To add regional education coordinator User 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the regional education coordinator user 
	Then Click on Submit button 
	And Return to user list page 
	
	
	
	
	#@adduser
@AddingFinanceManager 
Scenario: To add Finance Manager User 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the finance manager user 
	Then Click on Submit button 
	And Return to user list page 
	
	
	#@adduser
@AddingLogisticaccountassistant 
Scenario: To add logistics account assistant User 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the logistics account assistant user 
	Then Click on Submit button 
	And Return to user list page 
	
	
	#@adduser
@AddingChildsponsorshipcoordinator 
Scenario: To add child sponsorship coordinator User 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the child sponsorship coordinator user 
	Then Click on Submit button 
	And Return to user list page 
	
	
@EditSocialWorker 
Scenario: 11339_To Edit social worker User 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	
	And Click on the Admin menu 
	Then Click on the User button 
	And Edit the social worker user 
	Then Click on Edit Submit button 
	And Return to user list page 
	
	
	
	#@ActivationMail #(Not Feasible)
	#Scenario: 11340_To verify activation mail received After user created with valid EmailId
	#	Given user is on login page 
	#	And Enter username "siteadmin" And click submit 
	#	And Enter security answer And click submit 
	#	And Enter password And click submit
	#     And Click on the Admin menu
	#     Then Click on the User button
	#     And Click on Adduser button 
	#	And Create the social worker user
	#     Then Click on Submit button
	#     And Return to user list page
	#     And Verify activation mail received
	
@UnlockTheUser 
Scenario: 11341_To verify the user can be unlocked 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Filter locked users from the status DropDown 
	And Click UnlockUserIcon 
	
	
@UsersReturnToList 
Scenario: 14365_This is to verify Users Return To List 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click Add User and click ReturnToListButton 
	And Click Edit User and click ReturnToListButton 
	
@DeleteUsers 
Scenario: 11365_This is to verify Delete Users 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click Edit icon to delete the user 
	
	
@DuplicateMailError 
Scenario: 
	14356_This is to ensure that system validates the duplicated mail and prompts to enter new mailScenario 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the social worker user 
	And ensure that error message get prompted for the duplicate mail 
	
@DefaultRoleAllocated 
Scenario: 
	14357_This is to ensure that default role of that organization will be provided once the user is setup 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the Head Teacher user 
	And Ensure that default role of that organization will be provided once the user is setup 
	
@DeleteDefaultRole 
Scenario: 
	14358_This is to Ensure that siteadmin is able to delete the default role that has been assigned 
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the Head Teacher user 
	And Ensure that siteadmin is able to delete the default role that has been assigned 
	
@NewRoleGetAddedFromTheDropdown 
Scenario: 
	14359_This is to ensure that siteadmin is able to add new role by Selecting a role from the role drop down
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Click on Adduser button 
	And Create the social worker user 
	Then Click on Submit button 
	And Ensure that new role get added by Selecting a role from the role drop down 
	
@ChangeTheStatus 
Scenario: 
	14360_This is to ensure that siteadmin is able to change the user status
	Given user is on login page 
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click on the Admin menu 
	Then Click on the User button 
	And Filter the user and click search icon 
	And Click Edit button and change the userStatus 
	
	
	
	
	
     