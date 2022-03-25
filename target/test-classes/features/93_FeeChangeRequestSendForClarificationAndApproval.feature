Feature: This is the Fee Change Request Send For Clarification and Approval feature 
@FeeChangeRequestSendForClarificationAndApprovalFeature
Scenario: This is Fee Change Request Send For Clarification and Approval Scenario
And initiate web browser
Given user is on login page
	And Enter username "Socialworker" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And click Change Fee Structure Link in My Functions
	And Enter the student name to change the  fee structure
	And Enter the propose new fee structure details and click submit for approval button and logout 
	And close window
	And initiate web browser
	And Enter username "HeadTeacher" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click fee change request waiting for approval link
	And Click Fee change request Approval icon
	And Enter the comments and click Send for clarification button and logout
	And close window
	And initiate web browser
	And Enter username "Socialworker" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Student fee change request need more information link from My Alerts
	And Click Fee change Approval icon to send more clarification 
	And Enter the comments and click SendClarification button and logout
	And close window
	And initiate web browser
	And Enter username "HeadTeacher" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Student fee change request received more information link from My Alerts
	And Click Fee change Approval icon to Approve the received information
	And Enter the comments and click Approval Button
	
	@FeeChangeRequestSendForClarificationAndApprovalFeature
@logout
Scenario: Log out the user
And log out
And close window