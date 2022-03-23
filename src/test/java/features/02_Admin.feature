  Feature: To verify the admin menus  
 	
  @adduser	
  @AddingSocialworker
  Scenario Outline: To add social worker User
     #Given Enter the login credentials
     #And Navigate to Admin page
     And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
     Given Click on the Admin menu
     Then Click on the User button
     And Click on Adduser button 
#     Given Enter the "<FirstName>" and "<LastName>"
#     And select the "<Company>"
     And Create the social worker user
     Then Click on Submit button
     And Return to user list page
      
  Examples:
  |FirstName|LastName|Company|
  |TestFirstt|TestLastt|Kenya|
  
  @adduser
  @AddingHeadTeacher
  Scenario Outline: To add Head Teacher User
     Given Click on the Admin menu
     Then Click on the User button
     And Click on Adduser button 
#     Given Enter the "<FirstName>" and "<LastName>"
#     And select the "<Company>"
     And Create the Head Teacher user
     Then Click on Submit button
     And Return to user list page
        
     
  Examples:
  |FirstName|LastName|Company|
  |TestFirst|TestLast|Kenya|
  
  @adduser
  @AddingClassTeacher
  Scenario Outline: To add Class Teacher User
     Given Click on the Admin menu
     Then Click on the User button
     And Click on Adduser button 
#     Given Enter the "<FirstName>" and "<LastName>"
#     And select the "<Company>"
     And Create the class Teacher user
     Then Click on Submit button
     And Return to user list page
        
     
  Examples:
  |FirstName|LastName|Company|
  |TestFirst|TestLast|Kenya|
  
  @adduser
  @AddingSeniorTeacher
  Scenario Outline: To add Senior Teacher User
     Given Click on the Admin menu
     Then Click on the User button
     And Click on Adduser button 
#     Given Enter the "<FirstName>" and "<LastName>"
#     And select the "<Company>"
     And Create the senior Teacher user
     Then Click on Submit button
     And Return to user list page
         
  Examples:
  |FirstName|LastName|Company|
  |TestFirst|TestLast|Kenya|
 
 @adduser 
 @AddingregionalEducationCoordinator
  Scenario Outline: To add regional education coordinator User
     Given Click on the Admin menu
     Then Click on the User button
     And Click on Adduser button 
#     Given Enter the "<FirstName>" and "<LastName>"
#     And select the "<Company>"
     And Create the regional education coordinator user
     Then Click on Submit button
     And Return to user list page
         
  Examples:
  |FirstName|LastName|Company|
  |TestFirst|TestLast|Kenya| 
  
  
 @adduser
 @AddingFinanceManager
  Scenario Outline: To add Finance Manager User
     Given Click on the Admin menu
     Then Click on the User button
     And Click on Adduser button 
#     Given Enter the "<FirstName>" and "<LastName>"
#     And select the "<Company>"
     And Create the finance manager user
     Then Click on Submit button
     And Return to user list page
         
  Examples:
  |FirstName|LastName|Company|
  |TestFirst|TestLast|Kenya|  
  
  @adduser
  @AddingLogisticaccountassistant
  Scenario Outline: To add logistics account assistant User
     Given Click on the Admin menu
     Then Click on the User button
     And Click on Adduser button 
     And Create the logistics account assistant user
     Then Click on Submit button
     And Return to user list page
         
  Examples:
  |FirstName|LastName|Company|
  |TestFirst|TestLast|Kenya| 
  
  @adduser
  @AddingChildsponsorshipcoordinator
  Scenario Outline: To add child sponsorship coordinator User
     Given Click on the Admin menu
     Then Click on the User button
     And Click on Adduser button 
     And Create the child sponsorship coordinator user
     Then Click on Submit button
     And Return to user list page
         
  Examples:
  |FirstName|LastName|Company|
  |TestFirst|TestLast|Kenya| 