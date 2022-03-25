Feature: This is the Student Data Bulk Upload feature 
@StudentDataBulkUpload
Scenario: This is Student Data Bulk Upload Scenario
And initiate web browser 
Given user is on login page
	And Enter username "Socialworker" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Report and select Student submenu 
	And click on Upload Student details icon
	And Click on Download Template link to view the download template options
	And Click on INFO icon to view the instructions to fill the student upload template
	And Click on Empty Template to download an empty student template 
	And Click on Edit Template to download student template with the existing student details 
	And Make changes in the template and Click on the browse button to select the saved file, enter the file name and click upload
	And If there are errors in the uploaded file, the error log will be downloaded automatically 
	
@StudentDataBulkUpload
@logout
Scenario: Log out the user
And log out
And close window

