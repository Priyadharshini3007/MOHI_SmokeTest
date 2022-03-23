Feature: This is the Fee deposit after student active feature for MOHI 
@FeeDepositForActiveStudent
Scenario: This is Fee Deposit for active student scenario
	Given user is on login page 
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select student menu and click Fee Deposit submenu 
	When Enter the student name 
	When Click on the student ExaminationFee Deposit icon 
	When Click on the student TransportFee Deposit icon 
	When Click on the student TuitionFee Deposit icon 
	When Select checkbox and click print combined receipt button after active results to view combined receipt 
	When Click view recent transaction button results to view the recent transactions 


@FeeDepositForActiveStudent
 @logout
Scenario: Log out the user
 And log out 