Feature: This is the CMF numbers upload feature 
@CMFNumberUpload
Scenario: This is CSC login scenario
And initiate web browser
Given user is on login page
	And Enter username "CSCUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And click sponsorship menu and click CMF upload submenu
	And click download template
	And Enter the file name and choose the file and click upload button

	@CMFNumberUpload
@logout
Scenario: Log out the user
And log out
And close window