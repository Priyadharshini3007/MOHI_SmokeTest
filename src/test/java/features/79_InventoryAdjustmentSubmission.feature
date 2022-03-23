Feature: This is the Inventory Adjustment submission feature 


@InventoryAdjustment
@InventoryAdjustmentApprove
Scenario: This is Inventory Adjusment Submission scenario 
	Given user is on login page 
	And Enter username "AdminAssistant" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Requisition from My Functions tab
	And Fill the mandatory fields in the "centre"
	And Select Itemtype,Itemname,ItemQuantity,Units,ItemRate,Items and click Add icon to the items
	And click submit requisition button to submit the requisition
	And Approve based on the KSH in the "centre"
	And log out
	And Enter username "ProcurementManager" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When navigate to Procurement menu and select Requisition List Submenu
	When Enter the Requisition Code to make inventory adjustment and click search button
	When Click Inventory Adjusment Icon and select Adjust item icon
	When Enter the Quantity to be moved for any one of the center and click submit for approval button
	And log out
	And Enter username "NdoviniHeadTeacher" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When Click on the inventory adjustment request waiting for approval link
	When Search the requisition code and Click Approve Inventory Adjustment icon
	When Enter the Comments and click approve
	Then Verify that the Inventory Adjustment Request Status is changed to Approved


#@InventoryAdjustment
#@InventoryAdjustmentApprove
#Scenario: Log out the user
# And log out


@InventoryAdjustment
@InventoryAdjustmentSendClar
Scenario: This is Inventory Adjusment Submission scenario 
	Given user is on login page 
	And Enter username "AdminAssistant" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Requisition from My Functions tab
	And Fill the mandatory fields in the "centre"
	And Select Itemtype,Itemname,ItemQuantity,Units,ItemRate,Items and click Add icon to the items
	And click submit requisition button to submit the requisition
	And Approve based on the KSH in the "centre"
	And log out
	And Enter username "ProcurementManager" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When navigate to Procurement menu and select Requisition List Submenu
	When Enter the Requisition Code to make inventory adjustment and click search button
	When Click Inventory Adjusment Icon and select Adjust item icon
	When Enter the Quantity to be moved for any one of the center and click submit for approval button
	And log out
	And Enter username "NdoviniHeadTeacher" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When Click on the inventory adjustment request waiting for approval link
	When Search the requisition code and Click Approve Inventory Adjustment icon
	When Enter the Comments and click SendForclarification
	Then Verify that the Inventory Adjustment Request Status is changed to Approved
	

@InventoryAdjustment
@InventoryAdjustmentSendClar
Scenario: Log out the user
 And log out
 

@InventoryAdjustment
@InventoryAdjustmentDenied
Scenario: This is Inventory Adjusment Denied scenario 
	Given user is on login page 
	And Enter username "AdminAssistant" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Click Submit Requisition from My Functions tab
	And Fill the mandatory fields in the "centre"
	And Select Itemtype,Itemname,ItemQuantity,Units,ItemRate,Items and click Add icon to the items
	And click submit requisition button to submit the requisition
	And Approve based on the KSH in the "centre"
	And log out 
	And Enter username "ProcurementManager" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When navigate to Procurement menu and select Requisition List Submenu
	When Enter the Requisition Code to make inventory adjustment and click search button
	When Click Inventory Adjusment Icon and select Adjust item icon
	When Enter the Quantity to be moved for any one of the center and click submit for approval button
	And log out 
	And Enter username "NdoviniHeadTeacher" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	When Click on the inventory adjustment request waiting for approval link
	When Search the requisition code and Click Approve Inventory Adjustment icon
	When Enter the Comments and click Denied
	Then Verify that the Inventory Adjustment Request Status is changed to Denied


@InventoryAdjustment	
@InventoryAdjustmentDenied
Scenario: Log out the user
 And log out
