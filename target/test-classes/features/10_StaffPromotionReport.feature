Feature: To verify staff promotion report
@SmokeTestReport
@staffpromotionreport
@PromotionReport
Scenario: Verification of promotion report
And Enter username as "siteadmin" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
 When Select employee menu
 And click staff promotion report sub menu
 And Select the report type as "Promotion Report"
 And Select the From Date as "01/01/2020" and End Date as "26/08/2020"
 And Click the View Report button
 And Click Download icon to download as excel
 And Verify the downloaded excel named as "StaffPromotionReport.xlsx"
 And navigate to dashboard page
 
 @SmokeTestReport
 @staffpromotionreport 
@logout
Scenario: Log out the user
 And log out

@staffpromotionreport 
@NonPromotionReport
Scenario: Verification of Non promotion report
And Enter username as "siteadmin" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select employee menu
 And click staff promotion report sub menu
 And Select the report type as "Non Promotion Report"
 And Select the From Date as "01/01/2020" and End Date as "26/08/2020"
 And Click the View Report button
 And Click Download icon to download as excel
 And Verify the downloaded excel named as "StaffPromotionReport.xlsx"
  
  
 @staffpromotionreport 
@logout
Scenario: Log out the user
 And log out