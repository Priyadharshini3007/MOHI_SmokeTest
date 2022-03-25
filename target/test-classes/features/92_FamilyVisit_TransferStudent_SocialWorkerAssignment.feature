Feature: This is the family visit transfer student SocialWorkerAssignment feature for MOHI
@FamilyVisit_TransferStudentSocialworkerassignment
Scenario: This is TransferedstudentFamilyVisit scenario
And initiate web browser
Given user is on login page
And Enter username "HeadTeacher" And click submit 
And Enter security answer And click submit 
And Enter password And click submit
When click the alert and assign social worker when students get transferred to another center
When Search The Student Wth CMF id 
#When search the student to assign social worker and click on the social worker assignment icon
#When select the socialworker from the dropdown and search the transferd student and click assign student family button
When select parent and assigned social worker from the dropdown and click save button and click ok to the alert button
When logout as headteacher for the transfered student
And close window
And initiate web browser
And Enter username "Socialworker" And click submit 
And Enter security answer And click submit 
And Enter password And click submit
When navigate to the student menu and click family visit submenu 
#When enter the student and fill the family visit form and click save button
#When click Yes and click the icon to view history of the family visit form

	
@FamilyVisit_TransferStudentSocialworkerassignment
@logout
Scenario: Log out the user
And log out
And close window
