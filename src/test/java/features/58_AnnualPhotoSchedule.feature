Feature: This is the AnnualPhotoSchedule feature for MOHI
@AnnualPhotoSchedule
Scenario: This is AnnualPhotoSchedule scenario
	Given user is on login page 
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When navigate to center menu and click AnnualPhotoSchedule submenu 
	When update the center photo schedule date and click save 
	And log out
	And Enter username as "josk.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When login as a socialworker and verify the alert in MyAlerts 
 
 @AnnualPhotoSchedule 
  @logout
Scenario: Log out the user
And log out 