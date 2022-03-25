Feature: Employee Leave

@employeeleave
Scenario: Apply Leave
   And initiate web browser
   Given user is on login page 
	And Enter username as "beatrice.mainga@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And After login navigate to employee leave 
	And Apply for Leave
	
@employeeleave
@logout
Scenario: Log out the user 
  And log out 
  And close window
  
  
@employeeleave
Scenario: Approve Leave
   And initiate web browser
   Given user is on login page 
	And Enter username as "peter.muroncia@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Approve the leave 
	
@employeeleave
@logout
Scenario: Log out the user 
  And log out 
  And close window