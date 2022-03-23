Feature: To verify the attendance process

@AttendanceProcess
 Scenario: Verification of attendance menu navigation
	And Enter username as "bond.oa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu
	And click attendance submenu
	And Select the Date
	And Select Center Name as "BOND - Bondeni"
	And Select School Name as "Bondeni School"
	And Select Class as "Grade 3"
	And Select Class Section as "Red"
	And Click Get Class Roaster button
	And Mark as Absent for the student
	And Click Save Attendance button
	And Verify the user intimation message for attendance
	And Click Print Attendance Sheet link
	And log out
	And Enter username as "bond.sw4@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select Reports menu
	And Click Student List submenu
	And Select the student type
	And Enter the child name in search box
	And verify the pull out icon for that student

@AttendanceProcess
Scenario: Log out the user
 And log out