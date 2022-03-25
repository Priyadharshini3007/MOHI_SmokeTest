Feature: This is the CMFEdit feature 
@CMFEdit 
Scenario: This is CMF Edit scenario 
	And initiate web browser 
	Given user is on login page 
	And Enter username "CSMUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And click on sponsorshipmenu and click cmf edit submenu 
	And search the student and click remove student CMFID 
	And search new cmf id and click assign cmfid button 
	And when resuable is no 
	#And logout from the page
	
@CMFEdit 
@logout 
Scenario: Log out the user 
	And log out 
	And close window 
	