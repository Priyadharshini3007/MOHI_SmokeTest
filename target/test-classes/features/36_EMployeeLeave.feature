Feature: Employee Leave

  @empleave
  Scenario: Apply Leave
    Given After login navigate to employee leave 
	And Aplly for Leave 
	Given login as HR Manager and Approve leave 
	
	@empleave
@logout
Scenario: Log out the user
 And log out