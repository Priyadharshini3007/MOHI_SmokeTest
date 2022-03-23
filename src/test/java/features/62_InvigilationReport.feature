Feature: To verify Invigilator Assignment report
		Test file for Invigilator Assignment report
@Reports
@invigilatorassignmentreport
Scenario: Invigilator Assignment report
  And Enter username as "samwel.akweyu@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given navigate to Invigilator Assignment report page
	And select the center for search as "Gitathuru"
	And select the class name for search as "Grade 3"
	And select the section for search as "8"
	And select subject for search as "All"
	And select the year for search as "2020"
	And select term for search as "Term-II"
	And click on the search button for the details
	
@Reports
@logout
Scenario: Log out the user
 And log out




 