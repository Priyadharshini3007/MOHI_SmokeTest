Feature: This is the Fee Change Request Denied feature 
@FeeChangeRequestDeniedFeature
Scenario: This is Fee Change Request Denied Scenario
Given user is on login page
	And Enter username "Socialworker" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And click Change Fee Structure Link in My Functions
	And Enter the student name to change the  fee structure
	And Enter the propose new fee structure details and click submit for approval button and logout
	And Enter username "HeadTeacher" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click fee change request waiting for approval link
	And Click Fee change request Approval icon
	And Enter the comments and click Denied Button
	
		@FeeChangeRequestDeniedFeature
@logout
Scenario: Log out the user
And log out