Feature: To Verify the Promotion Transfer
@Promotion&Transfer
@InSchoolPromotion
     Scenario Outline: Test Case 10432: Ensure the In-school Promotion process
     And initiate web browser
 	And Enter username as "josk.st@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
    When Select Promotion menu
    And Click In-SchoolPromotion sub menu
    Then Select the centrename and Schoolname
    And choose the class and section for "<PromotionType>"
    Given get the students list
    Then Select the student for "<PromotionType>"
    And Submit the student for approval
    Then Verify the user intimation after submission
    And log out
    And close window 
    And initiate web browser
    And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Pass the student class value "<PromotionType>"
	And get the text from the selected class and center
	And log out
	And close window 
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
    Then select the student promotion alert from dashboard
    And Click on promotion approval icon for "<PromotionType>"
    And Verify All the fees related to the transfered class get reflected
    When headteacher should able to enter the fee due date
    And Click approve and send to Next page
    Then Verify the class details after "<PromotionType>" process is approved
   # And log out
Examples:
|PromotionType		|
|InSchoolPromotion	|

@Promotion&Transfer
@InSchoolPromotion
 Scenario: Log out
  	And log out
  	And close window 

@Promotion&Transfer
@SectionChange
 Scenario Outline: Test Case 10433: Ensure the section change process
 And initiate web browser
 	 And Enter username as "josk.st@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
    When Select Promotion menu
    And Click In-SchoolPromotion sub menu
    Then Select the centrename and Schoolname
    And choose the class and section for "<PromotionType>"
    Given get the students list
    Then Select the student for "<PromotionType>"
    And Submit the student for approval
    Then Verify the user intimation after submission
    And log out
    And close window 
    And initiate web browser
 	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
    Then select the student section change alert from dashboard
    And Click on promotion approval icon for "<PromotionType>"
    And Click approve and send to Next page
    Then Verify the class details after "<PromotionType>" process is approved
#    And log out
Examples:
|PromotionType	|
|SectionChange	|

@Promotion&Transfer
@SectionChange
 Scenario: Log out
  	And log out
  	And close window 

#@Promotion&Transfer
@Detainment
 Scenario Outline: Test Case 10434: Ensure the detainment process
 And initiate web browser
 	And Enter username as "josk.st@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
    When Select Promotion menu
    And Click In-SchoolPromotion sub menu
    Then Select the centrename and Schoolname
    And choose the class and section for "<PromotionType>"
    Given get the students list
    Then Select the student for "<PromotionType>"
    And Submit the student for approval
    Then Verify the user intimation after submission
    And log out
    And close window 
    And initiate web browser
    And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Pass the student class value "<PromotionType>"
	And get the text from the selected class and center
	And log out
	And close window 
	And initiate web browser
 	And Enter username as "josk.ht@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
    Then select the student detainment alert from dashboard
    And Click on promotion approval icon for "<PromotionType>"
    And Verify All the fees related to the transfered class get reflected
    When headteacher should able to enter the fee due date
   	And Click approve and send to Next page
    Then Verify the class details after "<PromotionType>" process is approved
    #And log out
Examples:
|PromotionType	|
|Detainment		|

@Promotion&Transfer
@Detainment
 Scenario: Log out
  	And log out
  	And close window 

@Promotion&Transfer  	
@Transfer
Scenario Outline: Test Case 10435: Ensure the transfer process is working properly
And initiate web browser
	And Enter username as "bond.sw1@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
    And Click Transfer Students to another Center link from dashboard
  	And select center name and school to transfer the student
    And choose the class and section for "<PromotionType>"
    Given get the students list
 	Then Select the student for "<PromotionType>"
    And Submit the student for approval
    Then Verify the user intimation after submission
    And log out
    And close window 
    And initiate web browser
 	And Enter username as "bond.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
    Then Select the student transfer alert from dashboard
    And Click on transfer approval icon
	And Select the Centre and schooltype
  	And Choose the headteacher
    And Click approve and send to Next page
    And log out
    And close window 
    And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
    Then Select the student transfer alert from dashboard
    And Click on transfer approval icon
    And Select the school and section
    And get the fees listed in the page
    When headteacher should able to enter the fee due date
    And Click approve and send to Next page
    Then Verify the class details after "<PromotionType>" process is approved
    And log out
    And close window 
    And initiate web browser
    And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Pass the student class value "<PromotionType>"
	And get the text from the selected class and center
	And Verify the new fee structure got reflected
#	And log out
Examples:
|PromotionType	|
|Transfer		|

@Promotion&Transfer
@Transfer
 Scenario: Log out
  	And log out
  	And close window 
  	
@Promotion&Transfer
@HighSchoolPromotion
 Scenario Outline: Test Case 17039: Ensure the high school Promotion process
 And initiate web browser
 	And Enter username as "josk.st@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
    When Select Promotion menu
    And Click In-SchoolPromotion sub menu
    Then Select the centrename and Schoolname
    And choose the class and section for "<PromotionType>"
    Given get the students list
    Then Select the student for "<PromotionType>"
    And Submit the student for approval
    Then Verify the user intimation after submission
    And log out
    And close window 
    And initiate web browser
    And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Pass the student class value "<PromotionType>"
	And get the text from the selected class and center
	And log out
	And close window 
	And initiate web browser
 	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
    Then select the student high school promotion alert from dashboard
    And Click on promotion approval icon for "<PromotionType>"
    And Verify All the fees related to the transfered class get reflected
    When headteacher should able to enter the fee due date
   And Click approve and send to Next page
   Then Verify the class details after "<PromotionType>" process is approved
   #And log out
Examples:
|PromotionType			|
|HighSchoolPromotion	|

@Promotion&Transfer
@HighSchoolPromotion
 Scenario: Log out
  	And log out
And close window 