Feature: To verify supplier linking 

@procurement 
@SupplierLinking 
Scenario: Verification of supplier linking 
	And initiate web browser 
	And Enter username as "daniel.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Select procurement menu 
	And Click supplier linking submenu 
	And Select the Supplier name as "Benard Wainaina" 
	And Select the Item Type as "Book" to link 
	And Click Get Suplier Linking button 
	And Select the Item Information 
	And Click Save button 
	And Verify the user intimation after saving supplier linking 
	
@procurement 
@SupplierLinking 
Scenario: Log out the user 
	And log out 
	And close window