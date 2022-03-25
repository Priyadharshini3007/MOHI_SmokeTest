Feature: subject grading 
	Test file for subject grading
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
	
@subjectgrading 
@logout 
Scenario: Log out the user 
	And log out 
	And close window