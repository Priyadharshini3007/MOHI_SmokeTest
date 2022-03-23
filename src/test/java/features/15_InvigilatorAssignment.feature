Feature: Invigilator Assignment Entry
		Test file for Invigilator Assignment 

@invigilatorassignment
Scenario: Invigilator Assignment
  And Enter username as "samwel.akweyu@mohiafrica.org" And click submit 
    And Enter security answer as "k" And click submit 
    And Enter password as "Password#123" And click submit
    Given navigate to the Invigilator Assignment page
    And select the center as "JOSK - JOSKA"
    And select the school as "Joska School"
    And select the year as "2021"
    And select the class name as "Grade 3"
    And select the term as "Term-III"
    And select the section as "Blue"
    And select the exam to schedule the dates as "Opener3"
    And select the teacher for invigilation as "J"
    And click on the add button for scheduling the date for individual subjects
    And save the details
    Then verify the text message displayed 
 
@invigilatorassignment
@logout
Scenario: Log out the user
 And log out 