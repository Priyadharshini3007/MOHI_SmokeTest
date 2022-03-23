Feature:  Student Report  
@Reports
@StudentReport 
Scenario: This is Student Report scenario 
	Given user is on login page
	And Enter username "AdminAssistant" And click submit
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Select reports menu and select student submenu 
	And click go 
	And select the student profileReport 
	And select the student recruitmentApprovalReport 
	And select the student familVisitReport 
	And select the student pulloutReport 
	And select the student readmissionReport 
	And select the student rankReport 
	And select the student giftReport 
	And select the student feeDepositReport 
	And select the student feeChangeReport 
	And select the student sectionChangeReport 
	And headteacher logout from the page 
	And Enter username "HeadTeacher" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Select reports menu and select student submenu 
	And click go 	
	And Select the student to view the birthcertificatenotgiven report 
	And headteacher logout from the page 
	And Enter username "CSCUsername" And click submit 
	And Enter security answer And click submit 
	And Enter password And click submit 
	And Select reports menu and select student submenu 
	And click go 
	And Select the disablestudent to view the disable report 
	And Select CMF Photo schedule icon to update the CMF Schedule
	
@Reports		
@logout
Scenario: Log out the user
 And log out 
	 
	
	