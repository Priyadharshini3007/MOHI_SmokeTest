Feature: To verify Inventory Upload process

@procurement
@InventoryUpload
@InventoryDownloadTemplate
 Scenario: Verification of Download Template for Inventory Upload process
 And initiate web browser 
    And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click Inventory Items Upload submenu
	And click the Download Template link
	And Verify the downloaded excel named as "InventoryItemUploadTemplate.xlsx"

@procurement
@InventoryUpload	
@procurementFile
 Scenario: Verification of Inventory Upload process
	When Select procurement menu
	And Click Inventory Items Upload submenu	
	And Enter the filename as "Test1"
	And Select the inventory file and upload
	And Click upload button
	And Verify the confirmation message for inventory upload

@procurement
@InventoryUpload
Scenario: Log out the user
 And log out 
 And close window 
