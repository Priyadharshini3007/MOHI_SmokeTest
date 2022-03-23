Feature: This is Center Based Reimbursement Creation and Approval feature 

@Requisition2
@CenterBasedReimbursement
@CenterBasedReimbursementCreationAndApproval
 Scenario: This is Center Based Reimbursement Creation and Approval scenario
	Given user is on login page
	And Enter username "AdminAssistant" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Reimbursement from My Functions tab
	And Fill the reimbursement mandatory fields in the "centre" and click Add icon to the items 
	And click delete icon to delete the reimbursement items
	And click submit reimbursement button to submit the reimbursement
	And reimbursement Approve based on the KSH in the "centre"

@Requisition2
@CenterBasedReimbursement
@CenterBasedReimbursementCreationAndApproval
 Scenario: Log out the user
	And log out
 
@Requisition2
@CenterBasedReimbursement
@CenterBasedReimbursementCEOsendforclarification
 Scenario: This is CEO sendforclarification scenario
	Given user is on login page 
	And Enter username "AdminAssistant" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Reimbursement from My Functions tab
	And Fill the reimbursement mandatory fields in the "centre" and click Add icon to the items
	And click delete icon to delete the reimbursement items
	And click submit reimbursement button to submit the reimbursement
	And reimbursement Approve partially based on the KSH in the "centre"
	And log out
	And Enter username "CEO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When CEO click on the Reimbursement Waiting for approval link in the myalerts tab as "centre"
	When CEO should navigate to finalpage and click sendforclarification as "centre" for reimbursement approval

@Requisition2
@CenterBasedReimbursement
@CenterBasedReimbursementCEOsendforclarification
 Scenario: Log out the user
	And log out

@Requisition2
@CenterBasedReimbursement
@CenterBasedReimbursementCEODenied
Scenario: This is Center Based Reimbursement CEO Denied scenario 
	Given user is on login page 
	And Enter username "AdminAssistant" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Reimbursement from My Functions tab
	And Fill the reimbursement mandatory fields in the "centre" and click Add icon to the items
	And click delete icon to delete the reimbursement items
	And click submit reimbursement button to submit the reimbursement
	And reimbursement Approve partially based on the KSH in the "centre"
	And log out
	And Enter username "CEO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When CEO click on the Reimbursement Waiting for approval link in the myalerts tab amd filter the claim as "centre"
	When CEO should navigate to finalpage and click Denied button as "centre"
	
@Requisition2
@CenterBasedReimbursement
@CenterBasedReimbursementCEODenied
Scenario: Log out the user
 And log out