Feature: This is update photo schedule feature 
@studententry
@UpdatePhotoSchedule
Scenario: This is Student photo update scenario
	Given user is on login page 
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on update photo schedule from my functions 
	When enter the student name to update the photo schedule and click camera icon 
	When enter the date and save 

@studententry
@UpdatePhotoSchedule
 @logout
Scenario: Log out the user
 And log out 