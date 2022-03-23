Feature: To verify class teacher report 
@Reports 
@classteacherReport
Scenario: This is class teacher report scenario
Given user is on login page
	And Enter username "EducationCoordinator" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit	
	And select report menu and Class teacher submenu
	And click Add teacher to add the teacher and click save
	And filter the added teacher and choose edit and make the changes
	And filter the edited teacher and choose delete

@Reports	
@logout
Scenario: Log out the user
 And log out 