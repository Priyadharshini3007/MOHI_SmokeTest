Feature: To verify Notification Entry Process
@NotificationEntry
@AddNotification
 Scenario: Verification of Add Notification process
	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select Admin menu
	And Click Notification Entry submenu
	And Click Add Notification button
	And Enter Notification Title
	And Enter Notification Description
	And Click ChooseFile for any attachment
	And Select the Roles to display the notification
	And Select Is enable checkbox
	And Select Is Mandatory checkbox
	And Click Save
	And Verify the added Notification title got displayed to the corresponding role
	
@NotificationEntry	
@EditNotificationEntry
 Scenario: Verification of Edit Notification process
 	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select Admin menu
	And Click Notification Entry submenu
	And Select Edit Notification icon
	And Edit Notification Title
	And Edit Notification Description
	And Click delete to remove the attachment
	And Edit the Roles to display the notification
	And Edit Is enable checkbox
	And Edit Is Mandatory checkbox
	And Click Save
	And Verify the Edited Notification title got displayed to the corresponding role
@NotificationEntry	
@EditNotificationEntry
Scenario: Log out the user
 And log out