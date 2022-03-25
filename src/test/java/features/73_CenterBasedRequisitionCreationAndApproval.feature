Feature: This is Center Based Requisition Creation and Approval feature

@Requisition
@CenterBasedRequisition
@CenterBasedRequisitionCreationAndApproval
 Scenario: This is Center Based Requisition Creation and Approval scenario
 And initiate web browser
	Given user is on login page
	And Enter username "AdminAssistant" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Requisition from My Functions tab
	And Fill the mandatory fields in the "centre"
	And Select Itemtype,Itemname,ItemQuantity,Units,ItemRate,Items and click Add icon to the items
	And click edit icon to edit the items
	And click delete icon to delete the items
	And click submit requisition button to submit the requisition
	And Approve based on the KSH in the "centre"
	
@Requisition
@CenterBasedRequisition
@CenterBasedRequisitionCreationAndApproval
 Scenario: Log out the user
 And log out
 And close window
 
@Requisition
@CenterBasedRequisition
@CenterBasedRequisitionCEOsendforclarification 
 Scenario: This is CEO sendforclarification scenario 
 And initiate web browser
	Given user is on login page 
	And Enter username "AdminAssistant" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Requisition from My Functions tab
	And Fill the mandatory fields in the "centre"
	And Select Itemtype,Itemname,ItemQuantity,Units,ItemRate,Items and click Add icon to the items
	And click submit requisition button to submit the requisition
	And Enter username "headteacher" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click the requisition waiting for "centre" approval alert and approve
	And log out
	And close window
	And initiate web browser
	And Enter username "educationcoordinator" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click the requisition waiting for "centre" approval alert and approve
	And log out
	And close window
	And initiate web browser
	And Enter username "educationmanager" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click the requisition waiting for "centre" approval alert and approve
	And log out
	And close window
	And initiate web browser
	And Enter username "director" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click the requisition waiting for "centre" approval alert and approve
	And log out
	And close window
	And initiate web browser
	And Enter username "CEO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When CEO click on the Requisition Waiting for approval link in the myalerts tab as "centre"	
	When CEO enter the RequisitionCode and click on approval icon
	When CEO should navigate to finalpage and click sendforclarification as "centre"
	
@Requisition
@CenterBasedRequisition
@CenterBasedRequisitionCEOsendforclarification
 Scenario: Log out the user
 And log out
 And close window
 
@Requisition
@CenterBasedRequisition
@CenterBasedRequisitionDenied
 Scenario: This is CenterBasedRequisition CEO Deniedscenario 
 And initiate web browser
	Given user is on login page 
	And Enter username "AdminAssistant" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Requisition from My Functions tab
	And Fill the mandatory fields in the "centre"
	And Select Itemtype,Itemname,ItemQuantity,Units,ItemRate,Items and click Add icon to the items
	And click submit requisition button to submit the requisition
	And Enter username "headteacher" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click the requisition waiting for "centre" approval alert and approve
	And log out
	And close window
	And initiate web browser
	And Enter username "educationcoordinator" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click the requisition waiting for "centre" approval alert and approve
	And log out
	And close window
	And initiate web browser
	And Enter username "educationmanager" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click the requisition waiting for "centre" approval alert and approve
	And log out
	And close window
	And initiate web browser
	And Enter username "director" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click the requisition waiting for "centre" approval alert and approve
	And log out
	And close window
	And initiate web browser
	And Enter username "CEO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When CEO click on the Requisition Waiting for approval link in the myalerts tab as "centre"
	When CEO enter the RequisitionCode and click on approval icon
	When CEO should navigate to finalpage and click Denied as "centre"
	
@Requisition
@CenterBasedRequisition
@CenterBasedRequisitionDenied
Scenario: Log out the user
 And log out
 And close window