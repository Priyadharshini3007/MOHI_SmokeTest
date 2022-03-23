Feature: To verify supplier creation,edit and delete

@procurement1
@SupplierPage
@SupplierCreation
 Scenario: Verification of supplier creation
 	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click supplier submenu
	And Click Add Supplier icon
	And Enter the Supplier Code as "PRA1"
	And Enter the Supplier Name as "Prathan"
	And Enter the Address as "Hogwards"
	And Enter the City as "Chennai"
	And Enter the Contact Person Name as "Hermoine Granger"
	And Enter the Contact Person Phone as "987654321"
	And Enter the Contact Person Email as "test123@gmail.com"
	And Click the Add Supplier Save button
	And Verify the user intimation after saving supplier details
	
@procurement1
@SupplierPage
@SupplierEdit
 Scenario: Verification of supplier edit
	When Select procurement menu
	And Click supplier submenu
	And Enter the supplier name in search box as "Prathan"
	And Click the edit icon
	And Edit the name field as "Prathanya"
	And Edit the email field as "test1@gmail.com"
	And Click the Add Supplier Save button
	And Verify the user intimation after saving supplier details
	
@procurement1
@SupplierPage
@SupplierDelete
 Scenario: Verification of supplier deletion
	When Select procurement menu
	And Click supplier submenu
	And Enter the supplier name in search box as "Prathanya"	
	And Click the delete icon
	And Verify the user intimation after deleting supplier
	
@procurement1
@SupplierPage
@SupplierList
 Scenario: Verification of supplier list
	When Select procurement menu
	And Click supplier submenu
	And Enter the supplier name in search box as "lucy"
	And Click the Refresh icon
	And Navigate to the next page of the list
	And Navigate to the last page of the list
	And Increase the page size by "200"

@procurement1
@SupplierPage
@logout
Scenario: Log out the user
 And log out 
	