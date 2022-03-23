Feature: To verify inventory report

@procurement
@InventoryReport
@AddItemType
 Scenario: Verification of adding new item type 
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click Inventory Report submenu
	Then Select the Center/Department as "      JOSKA"
	And Click Add new item type icon
	Then Enter the Item Type Code as "Prathu"
	And Enter the Item Type Name as "Prathu"
	Then Enter the Description as "Prathu"
	And Select the Quantity Unit
	And Click Save Button
	Then Verify the user intimation after saving the item type

@procurement
@InventoryReport
@EditItemType
 Scenario: Verification of editing item type 
    And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click Inventory Report submenu
	Then Select the Center/Department as "      JOSKA"
	And Select the Item Type as "Prathu"
	Then Click the Edit icon of the selected item type
	Then Edit the Item Type name as "Saran"
	And Click Save Button
	Then Verify the user intimation after saving the item type
	
@procurement
@InventoryReport
@AddQuantityUnit
 Scenario: Verification of adding new quantity unit
	When Select procurement menu
	And Click Inventory Report submenu
	Then Select the Center/Department as "      JOSKA"
	And Select the Item Type as "Saran"
	Then Click the Edit icon of the selected item type
	And Click the Add Quantity Unit icon
	Then Enter the Quantity Unit as "Saran123"
	And Click Save icon of Quantity Unit
	
@procurement
@InventoryReport
@EditQuantityUnit
 Scenario: Verification of editing quantity unit
	When Select procurement menu
	And Click Inventory Report submenu
	Then Select the Center/Department as "      JOSKA"
	And Select the Item Type as "Saran"
	Then Click the Edit icon of the selected item type
	And Click the Edit Quantity Unit icon
	Then Edit the Quantity Unit as "Saran1234"
	And Click Save icon of Quantity Unit
	
@procurement
@InventoryReport
@AddItem
 Scenario: Verification of adding new item
	When Select procurement menu
	And Click Inventory Report submenu
	Then Select the Center/Department as "      JOSKA"
	And Select the Item Type as "Saran"
	Then Click Add item icon
	And Enter the Item Name as "Turmeric"
	Then Enter the Item Description as "Good For Skin"
	And Select the Supplier as "Ann Njeri"
	And Click Save Button
	Then Verify the user intimation after saving the item
	
@procurement
@InventoryReport
@DisableItem
 Scenario: Verification of disabling the item
	When Select procurement menu
	And Click Inventory Report submenu
	Then Select the Center/Department as "      JOSKA"
	And Select the Item Type as "Saran"
	Then Search the Item Name as "Turmeric"
	And Click Get Inventory button
	Then Click Disable item icon
	And Verify that the item is disabled
		
@procurement
@InventoryReport
@EnableItem
 Scenario: Verification of enabling the item
	When Select procurement menu
	And Click Inventory Report submenu
	Then Select the Center/Department as "      JOSKA"
	And Select the Item Type as "Saran"
	Then Search the Item Name as "Turmeric"
	And Click Get Inventory button
	Then Click Enable item icon
	And Verify that the item is enabled
	
@procurement
@InventoryReport
@EditItem
 Scenario: Verification of editing item
	When Select procurement menu
	And Click Inventory Report submenu
	Then Select the Center/Department as "      JOSKA"
	And Select the Item Type as "Saran"
	Then Search the Item Name as "Turmeric"
	And Click Get Inventory button
	Then Click Edit item icon
	And Edit the Item Name as "Vicco Turmeric"
	Then Enter the Item Description as "Double shine to your skin"
	And Select the Supplier as "Ann Njeri"
	And Click Save Button
	Then Verify the user intimation after saving the item
	
#@procurement	
#@InventoryReport
# @logout
#Scenario: Log out the user
# And log out 
	