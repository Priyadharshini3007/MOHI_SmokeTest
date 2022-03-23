Feature: To verify the Academic Term Entry Functionalities

@AcademicTermEntry
Scenario: To Verify the Academic Date Range Funtionality
	And Enter username as "siteadmin" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to studentmenu and select Academic Term Entry submenu
	And Click Add Academic Term button
	And Select the range for Term I duration
	And Select the range for Term II duration 
	And Select the range for Term III duration
	And Click save to save the Academic term details
	And Verify the out ofrange dates got disable and unable to select
	
	
@AcademicTermEntry
@logout
Scenario: Log out the user
And log out 