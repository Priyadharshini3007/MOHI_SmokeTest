Feature: To Verify Promotion Report 
@Reports
@PromotionReprt
Scenario: This is promotion report scenario
	Given user is on login page 
	And Enter username "CSCUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And click report and promotion submenu 
	And select the year 
	And select the center 
	And select the school 
	And select the class 
	And select view report 
@Reports	
@logout
Scenario: Log out the user
 And log out