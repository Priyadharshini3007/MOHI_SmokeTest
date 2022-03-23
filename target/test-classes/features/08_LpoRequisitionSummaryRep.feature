Feature: To verify LPO Requisition Summary Report

@SmokeTestReport
@procurement
@procurementSummaryRep
 Scenario: Verification of LPO Requisition Summary Report
   	And Enter username as "siteadmin" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select procurement menu
	And Click LPO Requisition Summary Report submenu
	And Select the center as "All"
	And Select the Month as "All"
	And Select the Year as "2020"
	And Click the LPO Requisition Summary View Report button
	And Click Download icon to download as excel
	And Verify the downloaded excel named as "LpoRequisition.xlsx"
	
@SmokeTestReport	
@procurement
@procurementSummaryRep
Scenario: Log out the user
 And log out