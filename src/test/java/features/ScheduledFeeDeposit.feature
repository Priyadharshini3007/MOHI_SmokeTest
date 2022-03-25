Feature: This is the Scheduled Fee deposit feature for MOHI 
@AdminassistantLoginScheduledFeeDeposit
Scenario: This is Scheduled Fee deposit scenario
And initiate web browser
Given user is on login page
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit

When Adminassistant click on the fee scheduled today link
When Adminassistant enter the student name and click on payment icon
When Adminassistant Click on the student AdmissionFee Deposit icon
When Adminassistant Click on save button to do the AdmissionFeeDeposit 
When Adminassistant Click on the student DevelopmentFee Deposit icon
When Adminassistant Click on save button to do the DevelopmentFeeDeposit 
When Select checkbox and click print combined receipt button results to view combined receipt
When Adminassistant Click view recent transaction button results to view the recent transactions
And log out
And close window 