Feature: To verify Inventory Tracking process

@procurement
@InventoryTracking
@AddInventoryTracking
 Scenario: Verification of Add Inventory Tracking process
 	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	 When Select procurement menu
	 And Click Inventory Tracking submenu
	 Then Select the Center/Department as "      JOSKA"
	 And Select the Item Type as "AgriBusiness"
	 Then Select the Item as "Pesticide-Keshet"
	 And Click Get Inventory button
	 Then Enter the Received Date
	 And Enter the Received Balance as "50"
	 Then Enter the Received Balance Unit as "KILOGRAMS"
	 And Enter the Received Quantity as "10"
	 Then Enter the Received Quantity Unit as "KILOGRAMS" 
	 And Enter the Issued Date
	 Then Enter the Issued Quantity as "20"
	 And Enter the Issued Quantity Unit as "KILOGRAMS"
	 Then Enter the Balance Date
	 And Enter the Comment as "Test Track Record" to save tracking
	 And Click Save the track record icon
	 Then Verify the user intimation after saving tracking details
	 
 @procurement
 @InventoryTracking
 @EditInventoryTracking
 Scenario: Verification of Edit Inventory Tracking process
  	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	 When Select procurement menu
	 And Click Inventory Tracking submenu
	 Then Select the Center/Department as "      JOSKA"
	 And Select the Item Type as "AgriBusiness"
	 Then Select the Item as "Pesticide-Keshet"
	 And Click Get Inventory button
	 Then Click the Edit track icon
	 Then Enter the Received Date
	 And Enter the Received Balance as "50"
	 And Enter the Received Quantity as "10"
	 And Enter the Comment as "Edited Track Record" to save tracking
	 And Click Save the track record icon
	 Then Verify the user intimation after saving tracking details

@procurement
@InventoryTracking
Scenario: Log out the user
 And log out