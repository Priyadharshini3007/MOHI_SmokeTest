Feature: This is the Email Template feature 


    #-----------------------------------Email Template Testcases-------------------------------------------#
    
    
@EmailTemplateAdd
Scenario: 11397_This is Email Template Add Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Email Template submenu
	And Click Add Email Config link
	And Enter email type and message
	And Click save button 
	
@EmailTemplateAdd
@logout
Scenario: Log out the user
And log out



@EmailTemplateEdit
Scenario: 11398_This is Email Template Edit Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Email Template submenu
	And Enter the mail type and click search icon to edit 
	And Edit the required fields
	And Click save button for edited Details
	
@EmailTemplateEdit
@logout
Scenario: Log out the user
And log out

 
@EmailTemplateDelete
Scenario: 11399_This is Email Template Delete Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Email Template submenu
	And Enter the mail type and click search icon to delete
	And Click Delete icon on the respective mail
	
	
@EmailTemplateDelete
@logout
Scenario: Log out the user
And log out


@EmailTemplateReturnToList
Scenario: 14363_This is Email Template ReturnToList Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Email Template submenu
	And Click on Add Config Email and select ReturnToList Button
	And Click on Edit Button And Select ReturnToList Button
	
	
@EmailTemplateReturnToList
@logout
Scenario: Log out the user
And log out