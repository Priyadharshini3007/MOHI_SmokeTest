Feature: This is the unscheduled fee deposit feature for MOHI
@studententry
@UnScheduledFeeDeposit
Scenario: This is adminassistant Login and fee deposit scenario
	Given user is on login page 
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select student menu and click Fee Deposit submenu 
	When Enter the student name 
	When Click on the student AdmissionFee Deposit icon 
	When Click on save button to do the AdmissionFeeDeposit 
	When Click on the student DevelopmentFee Deposit icon 
	When Click on save button to do the DevelopmentFeeDeposit 
	When Select checkbox and click print combined receipt button results to view combined receipt 
	When Click view recent transaction button results to view the recent transactions 
@studententry
@UnScheduledFeeDeposit
 @logout
Scenario: Log out the user
 And log out 