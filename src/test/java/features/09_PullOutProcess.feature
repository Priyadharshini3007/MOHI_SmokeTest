Feature: To verify pull out process

@pulloutprocess
@PullOutProcessApprove
 Scenario: Verification of pull out approval process
 	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select Reports menu
	And Click Student List submenu
	And Select the student type to initiate pull out
	And Click the pull out icon
	And Enter the Pull Out Date
	And Enter the Comments
	And Click the Submit button
	And log out
	And Enter username as "bond.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And log out
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And log out
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And Verify the child status
@pulloutprocess
@PullOutProcessApprove
Scenario: Log out the user
	And log out

@pulloutprocess
@PullOutHTNeedInfoAndDenial
Scenario: Verification of pull out head teacher need information and denial process
	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select Reports menu
	And Click Student List submenu
	And Select the student type to initiate pull out
	And Click the pull out icon
	And Enter the Pull Out Date
	And Enter the Comments
	And Click the Submit button
	And log out
	And Enter username as "bond.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Send for Clarification to Previous Step' button
	And log out
	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the alert - requests need more information
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Send Clarification' button
	And log out
	And Enter username as "bond.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the alert - received more information
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Deny and Close Application' button
	And Click the yes button to confirm the deny process
	And log out
	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the denied student pullout alert
	And Enter the CMFID in search
@pulloutprocess
@PullOutHTNeedInfoAndDenial
Scenario: Log out the user
	And log out

@pulloutprocess
@PullOutCSCNeedInfoAndDenied
Scenario: Verification of pull out CSC need information and denial process
 	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select Reports menu
	And Click Student List submenu
	And Select the student type to initiate pull out
	And Click the pull out icon
	And Enter the Pull Out Date
	And Enter the Comments
	And Click the Submit button
	And log out
	And Enter username as "bond.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And log out
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Send for Clarification to Previous Step' button
	And log out
	And Enter username as "bond.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the alert - requests need more information
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Send Clarification' button
	And log out
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the alert - received more information
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Deny and Close Application' button
	And Click the yes button to confirm the deny process
	And log out
	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the denied student pullout alert
	And Enter the CMFID in search
@pulloutprocess
@PullOutCSCNeedInfoAndDenied
Scenario: Log out the user
	And log out

@pulloutprocess
@PullOutCSMNeedInfoAndDenied
Scenario: Verification of pull out CSM need information and denial process
 	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select Reports menu
	And Click Student List submenu
	And Select the student type to initiate pull out
	And Click the pull out icon
	And Enter the Pull Out Date
	And Enter the Comments
	And Click the Submit button
	And log out
	And Enter username as "bond.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And log out
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And log out
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Send for Clarification to Previous Step' button
	And log out
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the alert - requests need more information
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Send Clarification' button
	And log out
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the alert - received more information
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Deny and Close Application' button
	And Click the yes button to confirm the deny process
	And log out
	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the denied student pullout alert
	And Enter the CMFID in search
@pulloutprocess
@PullOutCSMNeedInfoAndDenied
Scenario: Log out the user
	And log out

@pulloutprocess
@PullOutCSCNeedInfoFrmSW
Scenario:  Verification of pull out CSC need information from social worker process
	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select Reports menu
	And Click Student List submenu
	And Select the student type to initiate pull out
	And Click the pull out icon
	And Enter the Pull Out Date
	And Enter the Comments
	And Click the Submit button
	And log out
	And Enter username as "bond.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And log out
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Send for Clarification to Social Worker' button
	And log out
	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the alert - requests need more information
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Send Clarification' button
	And log out
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the alert - received more information
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And log out
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And Verify the child status
@pulloutprocess
@PullOutCSCNeedInfoFrmSW
Scenario: Log out the user
	And log out

@pulloutprocess
@PullOutCSMNeedInfoFrmSW
Scenario:  Verification of pull out CSM need information from social worker process
	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select Reports menu
	And Click Student List submenu
	And Select the student type to initiate pull out
	And Click the pull out icon
	And Enter the Pull Out Date
	And Enter the Comments
	And Click the Submit button
	And log out
	And Enter username as "bond.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And log out
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And log out
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the waiting for approval alert
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Send for Clarification to Social Worker' button
	And log out
	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the alert - requests need more information
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Send Clarification' button
	And log out
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the alert - received more information
	And Enter the CMFID in search
	And Click the pull out approve icon
	And Enter the Comments
	And Click the 'Approve and Send to Next Step' button
	And Verify the child status
	
@pulloutprocess
@PullOutCSMNeedInfoFrmSW
Scenario: Log out the user
	And log out