Feature: This is the Sponsor upload feature 
@SponsorUpload
Scenario: This is CSC login scenario
Given user is on login page
	And Enter username "CSCUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And click sponsorship menu and click Sponsor upload submenu
	And click sponsor download template
	And Enter the sponsor file name and choose the file and click upload button
	
	
	@SponsorUpload
@logout
Scenario: Log out the user
And log out