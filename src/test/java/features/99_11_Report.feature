Feature: To Verify Report Feature 
@AddedExamCanBeViewedinReports 
Scenario: 10555_To verify whether the examination added can be viewed in reports 
And initiate web browser 
	Given user is on login page 
	And Enter username "EducationCoordinator" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And select Exam menu and exam entry submenu 
	And click Add exam to add the exam and click save 
	And select report menu and exam submenu 
	And View the Exam which is added 
	
	
@AddedExamCanBeViewedinReports 
@logout 
Scenario: Log out the user 
	And log out 
	And close window
