Feature: This is Dept Based Reimbursement Creation and Approval feature

@Requisition
@DeptBasedReimbursement
@DeptBasedReimbursementCreationAndApproval
 Scenario: This is Dept Based Reimbursement Creation and Approval scenario
 And initiate web browser
	Given user is on login page
	And Enter username "OfficeAdmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Reimbursement from My Functions tab
	And Fill the reimbursement mandatory fields in the "Dept" and click Add icon to the items 
	And click delete icon to delete the reimbursement items
	And click submit reimbursement button to submit the reimbursement
	And reimbursement Approve based on the KSH in the "Dept"
	
@Requisition 
@DeptBasedReimbursement 
@DeptBasedReimbursementCreationAndApproval 
Scenario: Log out the user 
	And log out 
	And close window 
	
@Requisition
@DeptBasedReimbursement
@DeptBasedReimbursementCEODenied
 Scenario: This is Department Based Reimbursement CEO Denied scenario 
 And initiate web browser
	Given user is on login page
	And Enter username "OfficeAdmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Reimbursement from My Functions tab
	And Fill the reimbursement mandatory fields in the "Dept" and click Add icon to the items 
	And click delete icon to delete the reimbursement items
	And click submit reimbursement button to submit the reimbursement
	And reimbursement Approve partially based on the KSH in the "Dept"
	And log out
	And close window
	And initiate web browser
	And Enter username "CEO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When CEO click on the Reimbursement Waiting for approval link in the myalerts tab amd filter the claim as "Dept"
	When CEO should navigate to finalpage and click Denied button as "Dept"

@Requisition
@DeptBasedReimbursement
@DeptBasedReimbursementCEODenied
 Scenario: Log out the user
 And log out
 And close window
 
@Requisition
@DeptBasedReimbursement
@DeptBasedReimbursementCEOsendforclarification 
 Scenario: This is CEO sendforclarification scenario 
 And initiate web browser
	And Enter username "OfficeAdmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Reimbursement from My Functions tab
	And Fill the reimbursement mandatory fields in the "Dept" and click Add icon to the items 
	And click delete icon to delete the reimbursement items
	And click submit reimbursement button to submit the reimbursement
	And reimbursement Approve partially based on the KSH in the "Dept"
	And log out
	And close window
	And initiate web browser
	And Enter username "CEO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When CEO click on the Reimbursement Waiting for approval link in the myalerts tab as "Dept"
	When CEO should navigate to finalpage and click sendforclarification as "Dept" for reimbursement approval

@Requisition
@DeptBasedReimbursement
@DeptBasedReimbursementCEOsendforclarification 
 Scenario: Log out the user
 And log out
 And close window