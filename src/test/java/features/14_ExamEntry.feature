Feature: Exam entry 
        Test file for Exam entry

@examentry
Scenario: Scheduling a new exam
  And Enter username as "samwel.akweyu@mohiafrica.org" And click submit 
    And Enter security answer as "k" And click submit 
    And Enter password as "Password#123" And click submit
    Given navigate to the exam entry page
    And enter the examination name as "Opener3"
    And select the year of examination as "2021"
    And select the term of examination as "Term-III"
    And select the class for which exam is scheduled as "Grade 3"
    And click on save button
    Then verify the message

@examentry
@logout
Scenario: Log out the user
 And log out 