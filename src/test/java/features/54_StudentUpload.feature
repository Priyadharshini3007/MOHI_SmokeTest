Feature: This is Student Upload feature for MOHI
@studententry
@StudentUpload
Scenario: This is Student upload scenario
	Given user is on login page 
	And Enter username as "laceymontour@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click the student CMF photo scheduled today 
	When enter the student name to upload photo and click on the view profile icon 
	When click on upload CMF photo 
	When Click on the choose file and upload button 
@studententry
@StudentUpload  
@logout
Scenario: Log out the user
 And log out 
 
 
@studententry
@SizeInfoTab
Scenario: To Verify Size Info Tab Functionality

And Enter username as "josk.sw1@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Click on students dress information need to be update Alert
And Enter the student name to update the dress information
And Click on Edit icon
When Navigate to Size info tab
And Enter the dress details
And Click Save to save the dress information

@studententry
@SizeInfoTab  
@logout
Scenario: Log out the user
 And log out 