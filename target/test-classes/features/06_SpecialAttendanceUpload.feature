Feature: To verify special attendance upload process 

@specialattendanceuploads 
Scenario: Verification of special attendance upload - Download Template 
	And initiate web browser 
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select student menu 
	And click Special Attendance Upload submenu 
	And click the Download Template link 
	And Verify the downloaded excel 
	And Enter the filename as "Test1" 
	And Select the Term as "Term-III" 
	And Select the file and upload 
	And Click upload button 
	And Verify the confirmation message 
	And log out 
	And close window
	And initiate web browser  
	And Enter username as "josk.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select Reports menu 
	And Click Student List submenu 
	And Select the student type and click GO search button 
	And Enter the CMFID in search box and click search 
	And verify the pull out icon for the above student 
	
@specialattendanceuploads 
Scenario: Log out the user 
	And log out 
	And close window