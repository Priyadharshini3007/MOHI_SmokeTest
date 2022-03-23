Feature: To verify the Admin Login
  @Smoke
 @Login
  Scenario Outline: Login to MOHI as Admin User
    Given Navigate to sign-in page
    And Enter the Username "<UserName>"
    Then Enter the SecurityKey "<SecurityKey>"
    And Enter the Password "<Password>"
     
 Examples:
 |UserName|SecurityKey|Password|    
 |siteadmin|k|Password#123|  
 
  @HRlogin
  Scenario Outline: To verify the admin Menu functionality
    Given Navigate to sign-in page
    And Enter the Username "<UserName>"
    Then Enter the SecurityKey "<SecurityKey>"
    And Enter the Password "<Password>"
   # Given Click on the Admin menu
 Examples:   
 |UserName|SecurityKey|Password|    
 |julius.mwangi@mohiafrica.org|k|Password#123|
 
 
  @Smoke  
  @Test1
  Scenario: Login to MOHI
   #Given Navigate to sign-in page
   Given Enter the login credentials for siteadmin
  
   