Feature: To verify the Procurement reports

@Requisition
@verifyrequisitionlist
Scenario Outline: To verify requisition list page
And initiate web browser
  Given user is on login page
  And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
  And Enter security answer as "k" And click submit
  And Enter password as "Password#123" And click submit
  When Select procurement menu
  And Click Requisition List submenu
  Then enter the requisitioncode as "<requisitioncode>"
  And verify the view requisition button
  When navigate to main page
  Then click on the approve and deny button
  When navigate to main page
  Then verify the clearfilter button
    
Examples:
|requisitioncode|
|RMOHI-SPRODEP-1603202021784|

@Requisition
@verifyrequisitionlist
Scenario: Log out scenario
  And log out
  And close window 

@Requisition
@Verifylpolist
Scenario Outline: To verify the lpo list report page
And initiate web browser
     Given user is on login page
     And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
     And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select procurement menu
    And Click LPO List submenu
    Then enter the requisitioncode as "<requisitioncode>"
    Then verify the clearfilter button
    And verify the lpocode field "<lpocode>"
    When navigate to main page
    Then click on the approve and deny button
    When navigate to main page
    Then verify the goods received icon
    When navigate to main page
    And verify the initiate lpo cancellation icon
    When navigate to main page
    Then verify the clearfilter button
    
Examples:
|requisitioncode|lpocode|
|RMOHI-ADMDPT-210920162157|LMOHI-ADMDPT-260920161556|

@Requisition
@Verifylpolist
Scenario: Log out scenario
  And log out
  And close window 
 
@Requisition
@Verifyreimbursementlist
Scenario Outline: To verify the reimbursement list report page
And initiate web browser
	Given user is on login page
     And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
     And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select procurement menu
    And Click Reimbursement List submenu
    Then select the from date field
    And select the to date field
    When submit the search button
    Then choose the centre field "<centre>"
    And select the paid status "<status>"
    Then click on Find records
    Then verify the clearfilter button
     
Examples:
|centre	|status	|
|All	|All	|

@Requisition
@Verifyreimbursementlist
Scenario: Log out scenario
  And log out
  And close window 
    
@Requisition
@Verifylpopymentreport
 Scenario Outline: To verify the LPO Payment report page
 And initiate web browser
	Given user is on login page
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO Payment Report submenu
	Then select the from date field
	And select the to date field
	When submit the search button
	Then search with lpocode field "<lpo>"
     
Examples:
|lpo|
|2541542|

@Requisition
@Verifylpopymentreport
  Scenario: Log out scenario
  And log out
  And close window 
   
@LPO
@LPOApproval
Scenario Outline: To verify the LPO Approval
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Click on the approved requisitions waiting for LPO creation alert
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>"
	And click on the createlpo button
	And log out
	And Approve based on the GrandAmount
	And close window 
   
Examples:
|item	|supplier			|
|2		|Star School Uniform|

@LPO
@LPOApproval
  Scenario: Log out scenario
  And log out
  And close window 

@LPO
@LpoFMDenied
Scenario Outline: To verify the finance manager denial LPO process
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Click on the approved requisitions waiting for LPO creation alert
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>"
	And click on the createlpo button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the LPOs waiting for approval alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on deny button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the denied LPO alert
	And Search the LPO Code
	Then verify the LPO code is available in denied alert
   
Examples:
|item	|supplier			|
|20		|Star School Uniform|

@LPO
@LpoFMDenied
  Scenario: Log out scenario
  And log out
  And close window 

@LPO
@LpoDirDenied
Scenario Outline: To verify the LPO Approval
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Click on the approved requisitions waiting for LPO creation alert
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>"
	And click on the createlpo button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the LPOs waiting for approval alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on approve button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the LPOs waiting for approval alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on deny button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the denied LPO alert
	And Search the LPO Code
	Then verify the LPO code is available in denied alert
   
Examples:
|item	|supplier			|
|20000	|Star School Uniform|

@LPO
@LpoDirDenied
  Scenario: Log out scenario
  And log out
  And close window 

@LPO
@LpoFMNeedClar
Scenario Outline: To verify the LPO Approval
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on the approved requisitions waiting for LPO creation alert 
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>" 
	And click on the createlpo button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the LPOs waiting for approval alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on Send for clarification to Previous Step button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the LPO need clarification alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on Send clarification button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the LPO received information alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on approve button
#	And Verify the user intimation that LPO is approved
	
Examples:
|item	|supplier			|
|20		|Star School Uniform|

@LPO
@LpoFMNeedClar
  Scenario: Log out scenario
  And log out
  And close window 

@LPO
@LpoDirNeedClarFromProcurementManager
Scenario Outline: To verify the LPO Approval
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on the approved requisitions waiting for LPO creation alert 
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>" 
	And click on the createlpo button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the LPOs waiting for approval alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on approve button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the LPOs waiting for approval alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on Send for Clarification to Procurement Manager button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the LPO need clarification alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on Send clarification button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the LPO received information alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on approve button
	And Verify the user intimation that LPO is approved
	
Examples:
|item	|supplier			|
|20000	|Star School Uniform|

@LPO
@LpoDirNeedClarFromProcurementManager
  Scenario: Log out scenario
  And log out
  And close window 

@LPO
@LpoDirNeedClarFromFinanceManager
Scenario Outline: To verify the LPO Approval
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on the approved requisitions waiting for LPO creation alert 
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>" 
	And click on the createlpo button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the LPOs waiting for approval alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on approve button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the LPOs waiting for approval alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on Send for clarification to Previous Step button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the LPO need clarification alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on Send clarification button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the LPO received information alert
	And Search the LPO Code
	And Click the View LPO Approval workflow icon
	And Click on approve button
	And Verify the user intimation that LPO is approved
	
Examples:
|item	|supplier			|
|20000	|Star School Uniform|

@LPO
@LpoDirNeedClarFromFinanceManager
  Scenario: Log out scenario
  And log out
  And close window 

@LPO
@LPOCancellationApproval
Scenario: To verify the LPO Cancellation approval process
And initiate web browser
    Given user is on login page 
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	And Click LPOs not delivered within the period of performance alert
	And Click Initiate LPO Cancellation icon
	And Enter the comments and Approve Lpo Cancellation
	And log out
	And close window 
	And initiate web browser
 	And Enter username as "peter.githinji@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	And Click LPO cancellation waiting for approval Alert
	And Search the LPO Code
	And Click Approve/Deny Lpo Cancellation icon
	And Enter the comments and Approve Lpo Cancellation
	And log out 
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	And Click LPO cancellation waiting for approval Alert
	And Search the LPO Code
	And Click Approve/Deny Lpo Cancellation icon
	And Enter the comments and Approve Lpo Cancellation
	When Select procurement menu
	And Click LPO List submenu
	And Search the LPO Code
	And Verify the LPO status
	
@LPO
@LPOCancellationApproval
  Scenario: Log out scenario
  And log out	
  And close window 
  
@LPO
@LPOCancellationFMDenied
Scenario: To verify the LPO Cancellation finance manager denied process
And initiate web browser
	Given user is on login page 
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	And Click LPOs not delivered within the period of performance alert
	And Click Initiate LPO Cancellation icon
	And Enter the comments and Approve Lpo Cancellation
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	And Click LPO cancellation waiting for approval Alert
	And Search the LPO Code
	And Click Approve/Deny Lpo Cancellation icon
	And Enter the comments and Deny Lpo Cancellation
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the denied LPO cancellation alert
	And Search the LPO Code
	Then verify the LPO code is available in denied alert

@LPO
@LPOCancellationFMDenied
  Scenario: Log out scenario
  And log out
  And close window 
  	
@LPO
@LPOCancellationDirDenied
Scenario: To verify the LPO Cancellation director denied process
And initiate web browser
	Given user is on login page 
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	And Click LPOs not delivered within the period of performance alert
	And Click Initiate LPO Cancellation icon
	And Enter the comments and Approve Lpo Cancellation
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	And Click LPO cancellation waiting for approval Alert
	And Search the LPO Code
	And Click Approve/Deny Lpo Cancellation icon
	And Enter the comments and Approve Lpo Cancellation
	And log out
	And close window 
	And initiate web browser 
	And Enter username as "john.matuti@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	And Click LPO cancellation waiting for approval Alert
	And Search the LPO Code
	And Click Approve/Deny Lpo Cancellation icon
	And Enter the comments and Deny Lpo Cancellation
	And log out 
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Click the denied LPO cancellation alert
	And Search the LPO Code
	Then verify the LPO code is available in denied alert

@LPO
@LPOCancellationDirDenied
  Scenario: Log out scenario
  And log out
  And close window 
  	
@LPO
@LPOCancellationFMNeedClar
Scenario: To verify the LPO Cancellation need clarification process
And initiate web browser
	Given user is on login page 
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click LPOs not delivered within the period of performance alert
	And Click Initiate LPO Cancellation icon
	And Enter the comments and Approve Lpo Cancellation
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click LPO cancellation waiting for approval Alert
	And Search the LPO Code
	And Click Approve/Deny Lpo Cancellation icon
	And Click on Send for clarification to Previous Step button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the LPO cancellation requests need information alert
	And Search the LPO Code
	And Click Approve/Deny Lpo Cancellation icon
	And Click on Send clarification button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the LPO Cancellation requests received more information alert
	And Search the LPO Code
	And Click Approve/Deny Lpo Cancellation icon
	And Enter the comments and Approve Lpo Cancellation
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click LPO cancellation waiting for approval Alert
	And Search the LPO Code
	And Click Approve/Deny Lpo Cancellation icon
	And Click on Send for clarification to Previous Step button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the LPO cancellation requests need information alert
	And Search the LPO Code
	And Click Approve/Deny Lpo Cancellation icon
	And Click on Send clarification button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the LPO Cancellation requests received more information alert
	And Search the LPO Code
	And Click Approve/Deny Lpo Cancellation icon
	And Enter the comments and Approve Lpo Cancellation
	When Select procurement menu
	And Click LPO List submenu
	And Search the LPO Code
	And Verify the LPO status
@LPO
@LPOCancellationFMNeedClar
  Scenario: Log out scenario
  And log out
  And close window 
  
@LPO
@GRN
Scenario Outline: To verify the LPO Approval
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on the approved requisitions waiting for LPO creation alert 
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>" 
	And click on the createlpo button 
	And log out
	And close window 
	And initiate web browser
	And Approve based on the GrandAmount 
   	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO List submenu
	And Search the LPO Code
	And Click GRN icon
	And Enter the Item Quantity Received
	And Enter the Receiving Comment
	And Enter the Invoice Number
	And Enter the Delivery Number
	And Click Save button to save GRN details
	Then Verify the user intimation for saving GRN
Examples:
|item	|supplier			|
|200	|Star School Uniform|

@LPO
@GRN
  Scenario: Log out scenario
  And log out
  And close window 
	
@LPO
@LPOPaymentapprovalprocess
Scenario Outline: To verify the LPO payment approval process
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on the approved requisitions waiting for LPO creation alert 
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>" 
	And click on the createlpo button 
	And log out
	And close window 
	And initiate web browser
	And Approve based on the GrandAmount 
   	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO List submenu
	And Search the LPO Code
	And Click GRN icon
	And Enter the Item Quantity Received
	And Enter the Receiving Comment
	And Enter the Invoice Number
	And Enter the Delivery Number
	And Click Save button to save GRN details
	Then Verify the user intimation for saving GRN
   	And log out
   	And close window 
   	And initiate web browser
    And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit 
    And Enter security answer as "k" And click submit 
    And Enter password as "Password#123" And click submit
    And Click LPOs ready for payment alert
    And Search the LPO Code
    And Click on Initiate LPO Payment button
    And Enter the comments and Click save button
    And log out
    And close window 
    And initiate web browser
    Then Complete the LPO Payment approve process
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO Payment Report submenu
    And Search the LPO Code
	And Verify the LPO Payment approve status
 
 Examples:
|item	|supplier			|
|2000	|Star School Uniform|

@LPO
@LPOPaymentapprovalprocess
  Scenario: Log out scenario
  And log out
  And close window 
  
@LPO
@LPOPaymentFMSendClar
Scenario Outline: To verify the LPO payment approval process
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on the approved requisitions waiting for LPO creation alert 
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>" 
	And click on the createlpo button 
	And log out
	
	And Approve based on the GrandAmount
   	And Enter username as "fwamacaroline@yahoo.com" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO List submenu
	And Search the LPO Code
	And Click GRN icon
	And Enter the Item Quantity Received
	And Enter the Receiving Comment
	And Enter the Invoice Number
	And Enter the Delivery Number
	And Click Save button to save GRN details
	Then Verify the user intimation for saving GRN
   	And log out
   	And close window 
   	And initiate web browser
    And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit 
    And Enter security answer as "k" And click submit 
    And Enter password as "Password#123" And click submit
    And Click LPOs ready for payment alert
    And Search the LPO Code
    And Click on Initiate LPO Payment button
    And Enter the comments and Click save button
    And log out
    And close window 
    And initiate web browser
    And Enter username as "peter.githinji@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click on the LPO payment waiting for approval alert
	And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on Send for clarification to Previous Step button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click the LPO payment need clarification alert
    And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on Send clarification button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	And Click the LPO payment received information alert
	And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on deny button
 
 Examples:
|item	|supplier			|
|20		|Star School Uniform|

@LPO
@LPOPaymentFMSendClar
  Scenario: Log out scenario
  And log out
  And close window 
  
@LPO
@LPOPaymentDirSendClar
Scenario Outline: To verify the LPO payment approval process
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on the approved requisitions waiting for LPO creation alert 
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>" 
	And click on the createlpo button 
	And log out
	And Approve based on the GrandAmount 
   	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO List submenu
	And Search the LPO Code
	And Click GRN icon
	And Enter the Item Quantity Received
	And Enter the Receiving Comment
	And Enter the Invoice Number
	And Enter the Delivery Number
	And Click Save button to save GRN details
	Then Verify the user intimation for saving GRN
   	And log out
   	And close window 
   	And initiate web browser
    And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit 
    And Enter security answer as "k" And click submit 
    And Enter password as "Password#123" And click submit
    And Click LPOs ready for payment alert
    And Search the LPO Code
    And Click on Initiate LPO Payment button
    And Enter the comments and Click save button
    And log out
    And close window 
    And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click on the LPO payment waiting for approval alert
    And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on approve button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click on the LPO payment waiting for approval alert
    And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on Send for clarification to Previous Step button
    And log out
    And close window 
    And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click the LPO payment need clarification alert
    And Search the LPO Code
    And Click on Approve/Deny LPO Payment icon
	And Click on Send clarification button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	And Click the LPO payment received information alert
	And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on deny button
 
 Examples:
|item	|supplier			|
|20		|Star School Uniform|

@LPO
@LPOPaymentDirSendClar
  Scenario: Log out scenario
  And log out
  And close window 
  
@LPO
@LPOPaymentExeDirSendClar
Scenario Outline: To verify the LPO payment approval process
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on the approved requisitions waiting for LPO creation alert 
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>" 
	And click on the createlpo button 
	And log out
	And Approve based on the GrandAmount 
   	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO List submenu
	And Search the LPO Code
	And Click GRN icon
	And Enter the Item Quantity Received
	And Enter the Receiving Comment
	And Enter the Invoice Number
	And Enter the Delivery Number
	And Click Save button to save GRN details
	Then Verify the user intimation for saving GRN
   	And log out
   	And close window 
   	And initiate web browser
    And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit 
    And Enter security answer as "k" And click submit 
    And Enter password as "Password#123" And click submit
    And Click LPOs ready for payment alert
    And Search the LPO Code
    And Click on Initiate LPO Payment button
    And Enter the comments and Click save button
    And log out
    And close window 
    And initiate web browser
	And Enter username as "peter.githinji@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click on the LPO payment waiting for approval alert
    And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on approve button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click on the LPO payment waiting for approval alert
    And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on approve button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click on the LPO payment waiting for approval alert
    And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on Send for clarification to Previous Step button
    And log out
    And close window 
    And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click the LPO payment need clarification alert
    And Search the LPO Code
    And Click on Approve/Deny LPO Payment icon
	And Click on Send clarification button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	And Click the LPO payment received information alert
	And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on deny button
 
 Examples:
|item	|supplier			|
|20		|Star School Uniform|

@LPO
@LPOPaymentExeDirSendClar
  Scenario: Log out scenario
  And log out
  And close window 

@LPO
@LPOPaymentFmDenied
Scenario Outline: To verify the LPO payment approval process
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on the approved requisitions waiting for LPO creation alert 
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>" 
	And click on the createlpo button 
	And log out
	And Approve based on the GrandAmount 
   	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO List submenu
	And Search the LPO Code
	And Click GRN icon
	And Enter the Item Quantity Received
	And Enter the Receiving Comment
	And Enter the Invoice Number
	And Enter the Delivery Number
	And Click Save button to save GRN details
	Then Verify the user intimation for saving GRN
   	And log out
   	And close window 
   	And initiate web browser
    And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click LPOs ready for payment alert
    And Search the LPO Code
    And Click on Initiate LPO Payment button
    And Enter the comments and Click save button
    And log out
    And close window 
    And initiate web browser
    And Enter username as "peter.githinji@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click on the LPO payment waiting for approval alert
	And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on deny button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the denied LPO Payment request alert
	And Search the LPO Code
	Then verify the LPO code is available in LPO payment denied alert
    
Examples:
|item	|supplier			|
|2000	|Star School Uniform|

@LPO
@LPOPaymentFmDenied
  Scenario: Log out scenario
  And log out
  And close window 

@LPO
@LPOPaymentDirDenied
Scenario Outline: To verify the LPO payment approval process
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Click on the approved requisitions waiting for LPO creation alert
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>" 
	And click on the createlpo button 
	And log out 
	And Approve based on the GrandAmount 
   	And Enter username as "fwamacaroline@yahoo.com" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO List submenu
	And Search the LPO Code
	And Click GRN icon
	And Enter the Item Quantity Received
	And Enter the Receiving Comment
	And Enter the Invoice Number
	And Enter the Delivery Number
	And Click Save button to save GRN details
	Then Verify the user intimation for saving GRN
   	And log out
   	And close window 
   	And initiate web browser
    And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click LPOs ready for payment alert
    And Search the LPO Code
    And Click on Initiate LPO Payment button
    And Enter the comments and Click save button
    And log out
    And close window 
    And initiate web browser
    And Enter username as "peter.githinji@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click on the LPO payment waiting for approval alert
	And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on approve button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click on the LPO payment waiting for approval alert
	And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on deny button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the denied LPO Payment request alert
	And Search the LPO Code
	Then verify the LPO code is available in LPO payment denied alert
    
Examples:
|item	|supplier			|
|2000	|Star School Uniform|

@LPO
@LPOPaymentDirDenied
  Scenario: Log out scenario
  And log out
  And close window 
  
@LPO
@LPOPaymentExecDirDenied
Scenario Outline: To verify the LPO payment approval process
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Click on the approved requisitions waiting for LPO creation alert
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>"
	And click on the createlpo button
	And log out
	And Approve based on the GrandAmount
   	And Enter username as "fwamacaroline@yahoo.com" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO List submenu
	And Search the LPO Code
	And Click GRN icon
	And Enter the Item Quantity Received
	And Enter the Receiving Comment
	And Enter the Invoice Number
	And Enter the Delivery Number
	And Click Save button to save GRN details
	Then Verify the user intimation for saving GRN
   	And log out
   	And close window 
   	And initiate web browser
    And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click LPOs ready for payment alert
    And Search the LPO Code
    And Click on Initiate LPO Payment button
    And Enter the comments and Click save button
    And log out
    And close window 
    And initiate web browser
    And Enter username as "peter.githinji@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click on the LPO payment waiting for approval alert
	And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on approve button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click on the LPO payment waiting for approval alert
	And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on approve button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "john.matuti@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click on the LPO payment waiting for approval alert
	And Search the LPO Code
	And Click on Approve/Deny LPO Payment icon
	And Click on deny button
	And log out
	And close window 
	And initiate web browser
	And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Click the denied LPO Payment request alert
	And Search the LPO Code
	Then verify the LPO code is available in LPO payment denied alert
    
Examples:
|item	|supplier			|
|2000	|Star School Uniform|

@LPO
@LPOPaymentExecDirDenied
  Scenario: Log out scenario
  And log out
  And close window 

@LPO
@AddBankDepositSlipNo
Scenario Outline: To verify the LPO payment approval process
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
	And log out
	And close window 
	And initiate web browser
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Click on the approved requisitions waiting for LPO creation alert
	Then enter the requisitioncode
	And proceed with create an LPO
	Then enter the lpostartdate
	And enter the lpoenddate
	Then fill the cost "<item>" and select "<supplier>"
	And click on the createlpo button
	And log out
	And Approve based on the GrandAmount
   	And Enter username as "fwamacaroline@yahoo.com" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO List submenu
	And Search the LPO Code
	And Click GRN icon
	And Enter the Item Quantity Received
	And Enter the Receiving Comment
	And Enter the Invoice Number
	And Enter the Delivery Number
	And Click Save button to save GRN details
	Then Verify the user intimation for saving GRN
   	And log out
   	And close window 
   	And initiate web browser
    And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    And Click LPOs ready for payment alert
    And Search the LPO Code
    And Click on Initiate LPO Payment button
    And Enter the comments and Click save button
    And log out
    Then Complete the LPO Payment approve process
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO Payment Report submenu
    And Search the LPO Code
	And Verify the LPO Payment approve status
	And log out
	And close window 
	And initiate web browser
    And Enter username as "Boniface.Kamau@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	And Click LPO payment requests approved alert
	And Search the LPO Code
	And Select the checkbox against the record
	And Click Add Bank deposit slip number for the chosen LPOs button
	And Enter the Bank Deposit Slip Number details and click save button
	Then Verify the user intimation that Bank Deposit Slip Number details are saved
	When Select procurement menu
	And Click LPO Payment Report submenu
    And Search the LPO Code
	And Verify the LPO status after saving Bank Deposit Slip Number details
 
 Examples:
|item	|supplier			|
|2000	|Star School Uniform|

@LPO
@AddBankDepositSlipNo
  Scenario: Log out scenario
  And log out
  And close window 