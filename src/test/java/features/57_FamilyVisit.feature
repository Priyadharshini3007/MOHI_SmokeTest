Feature: This is the family visit feature
@FamilyVisit
Scenario: This is FamilyVisit scenario 

	And Enter username as "josk.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When navigate to the student menu and click and click family visit submenu 
	When enter the student and fill the family visit form and click save button 
	#When click Yes and click the icon to view history of the family visit form
	When Choose No and click print button 
	########To edit the visit form  ##########
	When navigate to centre menu and click family social worker assignement submenu as sw 
	When enter the student name and click edit the family visit form and click save and gives yes 
	#And log out
	
@FamilyVisit 
@logout 
Scenario: Log out the user 
	And log out 
