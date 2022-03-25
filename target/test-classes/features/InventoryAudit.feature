Feature: To verify inventory audit process

@procurement
@InventoryAudit
 Scenario: To verify procurement menu navigations
 And initiate web browser
 	 And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	 And Enter security answer as "k" And click submit 
	 And Enter password as "Password#123" And click submit
	 When Select procurement menu
	 And Click Inventory Tracking submenu
	 Then Select the Center/Department as "      JOSKA"
	 And Select the Item Type as "AgriBusiness"
	 Then Select the Item as "Absolute"
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
	 And log out
	 And close window
	 And initiate web browser
	 And Enter username as "siteadmin" And click submit 
	 And Enter security answer as "k" And click submit 
	 And Enter password as "Password#123" And click submit
	 When Select procurement menu
	 And Click Inventory Audit submenu
	 Then Select the Center/Department as "      JOSKA"
	 When Click Get Inventory button
	 And Enter the Audit Quantity as "1"
	 And Enter the Audit Date as "31/05/2021"
	 And Enter the Auditor Comments as "test"
	 And Click Save icon
	
@procurement
@InventoryAudit
Scenario: Log out the user
    And log out
    And close window