Feature: To Verify Inter School Transfer Report 
@Reports 
@InterSchoolTransferReport 
Scenario: This is FamilyVisit Summary report scenario 
	And initiate web browser 
	Given user is on login page 
	And Enter username "CSCUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And click report menu and click InterSchoolTransfer submenu 
	And report can be filtered based on the From center,From School,To Center,To School,Transfer type, WorkFlow Step,Awaiting for Approval,From date,To Date and CMFID 
	And click on view report to view the transfer report 
	And click download to dowload the transfer report in specified format 
	
@Reports 
@logout 
Scenario: Log out the user 
	And log out 
	And close window 