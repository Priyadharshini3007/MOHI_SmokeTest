Feature: To verify Employee Recruitment 
  Navigate and use Employee details for recruitment

@EmployeeRecruitment
Scenario: Navigate and enter details
    And initiate web browser
    Given Navigate to Employee recruitment page 
    And Enter details in Personal Info page
    And close window
    Given Login as HR Manager 
    And Complete the Approval process
      
    
@EmployeeRecruitment
@logout
Scenario: Log out the user
 And log out
 And close window