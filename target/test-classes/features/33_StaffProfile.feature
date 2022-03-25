Feature: To verify Staff Profile Menu navigations 

@staffprofile 
@BasicProfileEmp 
Scenario: Verification of Basic Profile menu navigation 
	And initiate web browser 
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select Staff Profile menu 
	And click Basic Profile sub menu 
	And verify the navigation to the basic profile 
	And navigate to dashboard page 
	
@staffprofile 
@PayStructureDetailsEmp 
Scenario: Verification of Pay Structure Details menu navigation 
	When Select Staff Profile menu 
	And click Pay Structure Details sub menu 
	And verify the navigation to the Pay Structure Details 
	And navigate to dashboard page 
	
@staffprofile 
@PaySlipDetailsEmp 
Scenario: Verification of Pay Slip Details menu navigation 
	When Select Staff Profile menu 
	And click Pay Slip Details sub menu 
	And verify the navigation to the Pay Slip Details 
	
@staffprofile 
@logout 
Scenario: Log out the user 
	And log out 
	And close window