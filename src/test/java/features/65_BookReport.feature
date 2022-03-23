Feature: To Verify Book Report 
@Reports 
@BookReport 
Scenario: This is Book report scenario 
	Given user is on login page 
	And Enter username "EducationCoordinator" And click submit
	And Enter security answer And click submit 
	And Enter password And click submit
	And click report menu and click Book submenu 
	And filter the Book assignment and choose edit and make the changes and click save
	
@Reports	
@logout
Scenario: Log out the user
 And log out 