Feature: Employee List 
 Using this Feature file for Employee List tasks


@emplist 
Scenario: Employe list 
	Given After login select Employee list from Menu 
    And perform task 
 

@emplist 
@logout 
Scenario: Log out the user 
 And log out 