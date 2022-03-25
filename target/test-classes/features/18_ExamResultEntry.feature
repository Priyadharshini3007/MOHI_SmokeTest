Feature: Exam results entry 
	Test file for Exam results 
@examresults 
Scenario: Exam Result entry 
	And initiate web browser 
	And Enter username as "josk.st@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	Given navigate to the Exam results page 
	And select center name as "JOSK - JOSKA" 
	And select school name as "Joska School" 
	And select class as "Grade 3" 
	And select section name as "Blue" 
	And select year as "2021" 
	And select term as "Term-III" 
	And select the exam name as "Opener3" 
	And click on the get class roster button 
	And Enter the marks for the students in the class 
	And click the save button 
	Then verify message displayed 
	
@examresults 
@logout 
Scenario: Log out the user 
	And log out 
	And close window 
 