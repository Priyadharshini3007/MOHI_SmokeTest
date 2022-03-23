Feature: To verify the Book Assignment Functionalities


@Bookassignment 
Scenario Outline: To  check whether the Book assignment functionality
    Given user is on login page
    And Enter username as "josk.st@mohiafrica.org" And click submit 
    And Enter security answer as "k" And click submit 
    And Enter password as "Password#123" And click submit
    When Select Book menu
    And click Book Assignment sub menu
    Then Choose the centre "<centre>"
    And select the classname "<class>"
    Then select the class section "<classsection>"
    Then select the subject "<subject>"
    #And choose the child subject "<childsubject>"
    When search with the bookname "<bookname>"
    Then enter the bookratio for the books
    And click on assign book
    
 Examples:
    |centre       |class        |classsection|subject|bookname|
    |JOSK - JOSKA|Joska School - Grade 1|Blue        |Life Skills|English Aid by J.B.P     |
    
@Bookassignment
  Scenario: Log out scenario
  And log out