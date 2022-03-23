Feature: This is the Master Detail List feature 
@MasterDetailListView
Scenario: 11393_This is to Ensure that master detail list can be viewed
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail List submenu
	And Select the Category to view the Master List
	And Ensure the Master Detail List can be viewed
	
@MasterDetailListView
@logout
Scenario: Log out the user
And log out


@MasterDetailListEdit
Scenario: 11395_This is Master Detail List Edit Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail List submenu
	And Select the Category to edit
	And Filter the records by Name and Search Button
	And Click edit button to edit the details
	And Click save button to save the Edited details
	
@MasterDetailListEdit
@logout
Scenario: Log out the user
And log out



@MasterDetailListDelete
Scenario: 14344_This is Master Detail List Delete Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail List submenu
	And Select the Category to delete
	And Filter the records by Name and Search Button to delete the record
	And Click delete button to delete the details

	
@MasterDetailListDelete
@logout
Scenario: Log out the user
And log out




@MasterDetailListNotDelete
Scenario: 14344_This is to verify that master data will not be deleted when it is associated with any other system details
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail List submenu
	And Select the Category to delete Associated Data
	#And Filter the records by Name and Search Button to delete the Associated record
	And Click delete button to delete the details

	
@MasterDetailListNotDelete
@logout
Scenario: Log out the user
And log out





@MasterDetailListSort
Scenario: 14349_This is Master Detail List Sort Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail List submenu
	And Select the Category to Sort
	And Select the center in Class Category
	And Select Section Category to sort in Ascending order	
	And Select Center class And SectionMapping Category to sort in Ascending order	
	And Select Subject Category to sort in Ascending order
	And Select Center class And Subject Mapping Category to sort in Ascending order	
@MasterDetailListSort
@logout
Scenario: Log out the user
And log out

@MasterDetailListSortDesc
Scenario: 14349_This is Master Detail List decending order Sort Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail List submenu
	And Select the Category to Sort in decending order
	And Select Class Category to sort in descending order
	And Select Section Category to sort in Descending order
	And Select Center class And SectionMapping Category to sort in Descending order
	And Select Subject Category to sort in Descending order
	And Select Center class And Subject Mapping Category to sort in Descending order
	
@MasterDetailListSortDesc
@logout
Scenario: Log out the user
And log out



@MasterDetailListSearch
Scenario: 14350_This is Master Detail List Search Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail List submenu
	And Ensure that all columns in Class Category search functionality working properly
	And Ensure that all columns in Section Category search functionality working properly
	And Ensure that all columns in Center class Section mapping Category search functionality working properly
	And Ensure that all columns in Subject Category search functionality working properly
	And Ensure that all columns in Center class Subject mapping Category search functionality working properly
	And Ensure that all columns in Sports Category search functionality working properly
	And Ensure that all columns in Religion Category search functionality working properly
	And Ensure that all columns in Future Aspiration Category search functionality working properly
	And Ensure that all columns in Fee Type Category search functionality working properly
	And Ensure that all columns in City Category search functionality working properly
	And Ensure that all columns in Neighbourhood Category search functionality working properly
	And Ensure that all columns in Careers Category search functionality working properly
	
@MasterDetailListSearch
@logout
Scenario: Log out the user
And log out


@MasterDetailListPagingFeature
Scenario: 14351_This is Master Detail List Paging Feature Scenario
Given user is on login page
	And Enter username "siteadmin" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit
	And Navigate to Admin and Click Master Detail List submenu
	And Ensure that Paging Feature Working Properly
	
	
@MasterDetailListPagingFeature
@logout
Scenario: Log out the user
And log out




