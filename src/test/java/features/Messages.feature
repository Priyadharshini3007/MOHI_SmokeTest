Feature: To verify the Message page Functionalities

@MessageApprovalProcessSocialworkertoSponsor
Scenario Outline: To verify the message approval process
  When Select student menu
  And click Messages submenu
  Then search the student "<cmforstudent>"
  And add the message for the selected student
  And log out
  Given user is on login page
  And Enter username as "AndriaMoushon@cmfi.org" And click submit 
  And Enter security answer as "k" And click submit 
  And Enter password as "Password#123" And click submit
  Then select the student from dashboard
  And edit the message and approve
  And Enter username as "josk.sw1@mohiafrica.org" And click submit 
  And Enter security answer as "k" And click submit 
  And Enter password as "Password#123" And click submit
  When Select student menu
  And click Messages submenu
  Then search the student "<cmforstudent>"
  And switch the label of the message
  Then click on the print icon
  And log out
  
  
  Examples:
  |cmforstudent|
  |015315      |
  
  @MessageDenialProcessSocialworkertoSponsor
  Scenario Outline: To verify the message denial process
  When Select student menu
  And click Messages submenu
  Then search the student "<cmforstudent>"
  And add the message for the selected student
  And log out
  Given user is on login page
  And Enter username as "AndriaMoushon@cmfi.org" And click submit 
  And Enter security answer as "k" And click submit 
  And Enter password as "Password#123" And click submit
  Then select the student from dashboard
  And click on reject message
  
  Examples:
  |cmforstudent|
  |005868      |
  
   @MessageapprovalProcessSponsortosocialworker
  Scenario Outline: To verify the message from sponsor to social worker
  Given user is on login page
  And Enter username as "AndriaMoushon@cmfi.org" And click submit 
  And Enter security answer as "k" And click submit 
  And Enter password as "Password#123" And click submit
  Then select the student from dashboard
  Then search the student "<cmforstudent>"
  And add the message for the selected student
  And log out
  And Enter username as "josk.sw1@mohiafrica.org" And click submit 
  And Enter security answer as "k" And click submit 
  And Enter password as "Password#123" And click submit
  Then select the student from dashboard
  And edit the message and approve
  And log out
  
  
  Examples:
  |cmforstudent|
  |005868      |
  