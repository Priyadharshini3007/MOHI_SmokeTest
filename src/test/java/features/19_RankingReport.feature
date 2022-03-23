Feature: Ranking report
        Test file for Ranking report
@Reports
@rankingreport
Scenario: View the exam results 
	And Enter username as "samwel.akweyu@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	Given navigate to the ranking report 
	And select the parameters for viewing the ranking report 
	Then download the export 
@Reports	
@logout
Scenario: Log out the user
 And log out 