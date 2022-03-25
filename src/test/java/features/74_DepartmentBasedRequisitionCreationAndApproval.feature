Feature: This is Department Based Requisition Creation and Approval feature 

@Requisition1 
@DepartmentBasedRequisition 
@DepartmentBasedRequisitionCreationAndApproval 
Scenario: This is Department Based Requisition Creation and Approval scenario 
	And initiate web browser 
	Given user is on login page 
	And Enter username "OfficeAdmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click Submit Requisition from My Functions tab 
	And Fill the mandatory fields in the "dept" 
	And Select Itemtype,Itemname,ItemQuantity,Units,ItemRate,Items and click Add icon to the items 
	And click edit icon to edit the items 
	And click delete icon to delete the items 
	And click submit requisition button to submit the requisition 
	And Approve based on the KSH in the "dept" 
	
@Requisition1 
@DepartmentBasedRequisition 
@DepartmentBasedRequisitionCreationAndApproval 
Scenario: Log out the user 
	And log out 
	And close window 
	
@Requisition1 
@DepartmentBasedRequisition 
@DepartmentBasedCEOsendforclarification 
Scenario: This is Department Based CEO sendforclarification scenario 
	Given user is on login page 
	And Enter username "OfficeAdmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click Submit Requisition from My Functions tab 
	And Fill the mandatory fields in the "dept" 
	And Select Itemtype,Itemname,ItemQuantity,Units,ItemRate,Items and click Add icon to the items 
	And click submit requisition button to submit the requisition 
	And log out 
	And close window 
	And initiate web browser 
	And Enter username "headofdepartment" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click the requisition waiting for "dept" approval alert and approve 
	And log out 
	And close window 
	And initiate web browser 
	And Enter username "director" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click the requisition waiting for "dept" approval alert and approve 
	And log out 
	And close window 
	And initiate web browser 
	And Enter username "CEO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When CEO click on the Requisition Waiting for approval link in the myalerts tab as "dept" 
	When CEO enter the RequisitionCode and click on approval icon 
	When CEO should navigate to finalpage and click sendforclarification as "dept" 
	
@Requisition1 
@DepartmentBasedRequisition 
@DepartmentBasedCEOsendforclarification 
Scenario: Log out the user 
	And log out 
	And close window 
	
@Requisition1 
@DepartmentBasedRequisition 
@DepartmentBasedRequisitionDenied 
Scenario: This is CenterBasedRequisition CEO Deniedscenario 
	And initiate web browser 
	Given user is on login page 
	And Enter username "OfficeAdmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click Submit Requisition from My Functions tab 
	And Fill the mandatory fields in the "dept" 
	And Select Itemtype,Itemname,ItemQuantity,Units,ItemRate,Items and click Add icon to the items 
	And click submit requisition button to submit the requisition 
	And log out 
	And close window 
	And initiate web browser 
	And Enter username "headofdepartment" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click the requisition waiting for "dept" approval alert and approve 
	And log out 
	And close window 
	And initiate web browser 
	And Enter username "director" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Click the requisition waiting for "dept" approval alert and approve 
	And log out 
	And close window 
	And initiate web browser 
	And Enter username "CEO" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When CEO click on the Requisition Waiting for approval link in the myalerts tab as "dept" 
	When CEO enter the RequisitionCode and click on approval icon 
	When CEO should navigate to finalpage and click Denied as "dept" 
	
@Requisition1 
@DepartmentBasedRequisition 
@DepartmentBasedRequisitionDenied 
Scenario: Log out the user 
	And log out 
	And close window