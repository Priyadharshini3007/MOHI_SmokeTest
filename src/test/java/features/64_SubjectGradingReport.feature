Feature: To Verify Subject Grading Report 
@Reports 
@SubjectGradingReport 
@subjectgrading 
Scenario: Subject grade entry 
	And initiate web browser 
	And Enter username as "samwel.akweyu@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	Given navigate to the subject grading page 
	And select the class as "Grade 3" 
	And select the subject as "Math Activities" 
	And enter the start percentage for grade points as "60" 
	And enter the end percentage for grade points as "70" 
	And enter the grade as "B+" 
	And enter the points as "6.5" 
	And click on the search button 
	Then verify the text message on the page 
@Reports 
@SubjectGradingReport 
@subjectgrading 
@logout 
Scenario: Log out the user 
	And log out 
	And close window 
	
@Reports 
@SubjectGradingReport 
Scenario: This is Subject Grading report scenario 
	And initiate web browser 
	Given user is on login page 
	And Enter username "EducationCoordinator" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And click report menu and click subject grading submenu 
	And filter the SubjectGrading assignment and choose edit and make the changes 
	And filter the SubjectGrading assignment and choose delete 
	
@Reports 
@SubjectGradingReport 
@logout 
Scenario: Log out the user 
	And log out 
	And close window 
	
	
