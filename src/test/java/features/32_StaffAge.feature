Feature: Staff Age 

@StaffAge 
Scenario: To verify Staff Age Report 
	And initiate web browser 
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select Payroll menu 
	And Click Staff Age Group Report submenu 
	And generate report 
	
@StaffAge 
@logout 
Scenario: Log out the user 
	And log out 
	And close window