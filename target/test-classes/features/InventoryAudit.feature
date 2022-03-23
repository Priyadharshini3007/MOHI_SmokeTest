Feature: To verify inventory audit process

@procurement
@InventoryAudit
 Scenario: To verify procurement menu navigations
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click Inventory Audit submenu
	Then Select the Center/Department as "      JOSKA"
	When Click Get Inventory button
	And Enter the Audit Quantity as "30"
	And Enter the Audit Date as "31/05/2021"
	And Enter the Auditor Comments as "test"
	And Click Save icon
	Then Verify the user intimation after saving audit details
	
@procurement
@InventoryAudit
Scenario: Log out the user
And log out