Feature: To verify special attendance process

@specialattendance 
Scenario: Verification of special attendance process 
	And initiate web browser 
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select student menu 
	And click Special Attendance submenu 
	And Select the center 
	And Select the school 
	And Select the class 
	And Select the class section 
	And Select the Term 
	And Click Get Class Roaster button 
	And Mark as Not Received for the student 
	And Click Save Attendance 
	And Verify the user intimation message 
	And log out 
	And close window 
	And initiate web browser 
	And Enter username as "josk.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select Reports menu 
	And Click Student List submenu 
	And Select the student type and click GO button 
	And Enter the child name in search box and click search 
	And verify the pull out icon for the student 
 
@specialattendance 
Scenario: Log out the user 
	And log out 
	And close window