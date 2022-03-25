Feature: Employee List Using this Feature file for Employee List tasks 

@employeelist 
Scenario: Employe list 
	And initiate web browser 
	Given user is on login page 
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	Given After login select Employee list from Menu 
	And unpaidleave methode 
	And appraisal notapplicable methode 
	And Rerun payroll methode 
	And download Pdf and Excel 
	And recruit an employee 
	
@employeelist 
@logout 
Scenario: Log out the user 
	And log out 
	And close window
	