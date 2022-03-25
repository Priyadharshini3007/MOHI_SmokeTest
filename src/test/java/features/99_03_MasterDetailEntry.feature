Feature: This is the Master Detail Entry feature 
@MasterDetailEntry
@AddMasterDetailEntry
Scenario: 11396_This is Master Detail Entry Scenario
And initiate web browser
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail Entry submenu
	And Select the Category
	And Click save button to save the details
@MasterDetailEntry	
@AddMasterDetailEntry
@logout
Scenario: Log out the user
And log out
And close window




@MasterDetailEntry
@verifyCategoryDropDown
Scenario: 14352_To verify the Category dropdown in MasterDetail Entry Scenario
And initiate web browser
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail Entry submenu
	And Verify Category Dropdown 
@MasterDetailEntry	
@verifyCategoryDropDown
@logout
Scenario: Log out the user
And log out
And close window

@MasterDetailEntry
@verifyTextboxes
Scenario: 14353_This is Verification of textboxes in MasterDetail Entry Scenario
And initiate web browser
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail Entry submenu
	And Select the category Dropdown and verify the textboxes 
@MasterDetailEntry	
@verifyTextboxes
@logout
Scenario: Log out the user
And log out
And close window

@MasterDetailEntry
@VerifySectionMapping
Scenario: 14354_This is Verification of Newly Added Section Mapped To The Appropriate Center&Class Scenario
And initiate web browser
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail Entry submenu
	And Select Section category from the Dropdown and add new section and Click Save
	And Click Add MasterDetail Link and select category as Center, Class & Section Mapping
	And Select Center,Class and newly added section and click save
	And Filter the newly added record and verify added new section got mapped
@MasterDetailEntry	
@VerifySectionMapping
@logout
Scenario: Log out the user
And log out
And close window

@MasterDetailEntry
@VerifyReturnToList
Scenario: 14367_This is Master Detail entry Return To List Scenario
And initiate web browser
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail Entry submenu
	And Click Master Detail List Link
	And Select the category from the drop down
	And Click Edit button and click Return To Report
	And Click Add Master Detail link and click Return To Report
	
@MasterDetailEntry	
@VerifyReturnToList
@logout
Scenario: Log out the user
And log out
And close window
















