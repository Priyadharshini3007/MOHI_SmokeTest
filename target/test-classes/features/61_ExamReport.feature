Feature: To Verify Exam Report 
@Reports
@ExamReport
Scenario: This is Exam report scenario
Given user is on login page
	And Enter username "EducationCoordinator" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And select report menu and exam submenu
	And click Add exam to add the exam and click save
	And filter the added exam and choose edit and make the changes
	And filter the edited exam and choose delete
	
@Reports	
@logout
Scenario: Log out the user
 And log out 