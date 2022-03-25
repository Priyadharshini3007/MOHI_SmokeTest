Feature: To verify re-admission process 

@readmissionprocess 
@ReadmissionApprovalProcess 
Scenario: Verification of re-admission social worker submittion process 
	And initiate web browser 
	# 	And Enter username as "josk.sw1@mohiafrica.org" And click submit 
	#	And Enter security answer as "k" And click submit 
	#	And Enter password as "Password#123" And click submit
	#	When Click Inactive students from My Reports 
	#	And Enter the CMFID as "002847" in search box
	#	And Click the Re-admission icon
	#	And Enter the Re-admission Date
	#	And Enter the Reason for Re-admission
	#	And Click the Submit button for Re-admission
	#	And log out
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	And Click the waiting for Re-admission approval alert 
	And Enter the CMFID as "002847" in search box 
	And Click the Re-admission icon 
	And Select the class as "Form 1" and section as "East" 
	And Enter the Comments 
	And Click the 'Approve' button 
	And Verify the child status after Re-admission 
	
@readmissionprocess
@ReadmissionApprovalProcess
Scenario: Logout Scenario
	And log out
	And close window
	

@readmissionprocess
@ReadmissionNewFeeStructure
 Scenario: Verification of re-admission new fee structure process
 And initiate web browser
  And Enter username as "josk.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Click Inactive students from My Reports 
	And Enter the CMFID as "021485" in search box
	And Click the Re-admission icon
	And Click View Profile
	And Collect Student Class Information
	And Navigate back
	And Enter the Re-admission Date
	And Enter the Reason for Re-admission
	And Click the Submit button for Re-admission
	And log out
	And close window
	And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Pass the class information of the student
    And get the text from the selected class and center
   	And log out
   	And close window
   	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for Re-admission approval alert
	And Enter the CMFID as "021485" in search box
	And Click the Re-admission icon
	And Verify All the fees related to that class get reflected
@readmissionprocess
@ReadmissionNewFeeStructure
Scenario: Logout Scenario
	And log out
	And close window

@readmissionprocess
@ReadmissionSendClarProcess
 Scenario: Verification of re-admission send clarification process
 And initiate web browser
  And Enter username as "josk.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Click Inactive students from My Reports 
	And Enter the CMFID as "016657" in search box
	And Click the Re-admission icon
	And Enter the Re-admission Date
	And Enter the Reason for Re-admission
	And Click the Submit button for Re-admission
	And log out
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for Re-admission approval alert
	And Enter the CMFID as "016657" in search box
	And Click the Re-admission icon
	And Enter the Comments
	And Click the Re-admission need clarification button
	And log out
	And close window
	And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the requests need more information alert
	And Enter the CMFID as "016657" in search box
	And Click the Re-admission icon
	And Enter the Comments
	And Click the Re-admission Send Clarification button
	And log out
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the received more information alert
	And Enter the CMFID as "016657" in search box
	And Click the Re-admission icon
	And Select the class as "Form 1" and section as "East"
	And Enter the Comments
	And Click the 'Approve' button
	And Enter the Comments
@readmissionprocess
@ReadmissionSendClarProcess
Scenario: Logout Scenario
	And log out
	And close window

@readmissionprocess
@ReadmissionDenialProcess
 Scenario: Verification of re-admission send clarification & denial process
 And initiate web browser
    And Enter username as "josk.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
 	When Click Inactive students from My Reports 
	And Enter the CMFID as "018915" in search box
	And Click the Re-admission icon
	And Enter the Re-admission Date
	And Enter the Reason for Re-admission
	And Click the Submit button for Re-admission
	And log out
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for Re-admission approval alert
	And Enter the CMFID as "018915" in search box
	And Click the Re-admission icon
	And Enter the Comments
	And Click the 'Deny' button
	And Click the yes button to confirm the deny process on readmission
	And log out
	And close window
	And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the denied student readmission alert
	And Enter the CMFID as "018915" in search box
	
@readmissionprocess
@ReadmissionDenialProcess
Scenario: Log out the user
 And log out 
 And close window