Feature: CT Entry 
	Test this file CT

@ct 
Scenario: CT 
	And initiate web browser 
	And Enter username as "samwel.akweyu@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	Given navigate 
	And select the center name as "JOSK - JOSKA" 
	And select the school name as "Joska School" 
	And select the Class as "Grade 3" 
	And select the Section as "Green" 
	And select the Teacher as "Kevin Ochieng Ogengo" 
	And click save 
	Then verify the text message 
	
@ct 
@logout 
Scenario: Log out the user 
	And log out
	And close window 