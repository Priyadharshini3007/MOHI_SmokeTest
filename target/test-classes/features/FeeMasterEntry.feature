Feature: To verify FeeMasterEntry Functionalities
@FeeFrequencyValidation
@AddNewOneTimeFee
Scenario: To verify Add New Fee with one time Fee Frequency Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Fee Type get reflected in Fee Type Dropdown
@FeeFrequencyValidation 
@AddNewOneTimeFee 
@logout 
Scenario: Log out the user 
	And log out 
	And close window 
@FeeFrequencyValidation
@FeeTypeAssignment
Scenario: To verify one time Fee Frequency Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown
	And Select Academic Year
	And Select Center
	And Select School
	And Select Class
	And Enter the amount
	And Select Fee Frequency
	And Click save
	And Verify the added fee type is assigned to the respective center and class
@FeeFrequencyValidation
@FeeTypeAssignment
@logout
Scenario: Log out the user
And log out
And close window
@FeeFrequencyValidation
@RecruitmentFormOneTimeFee
Scenario: To verify newly added one time fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify the new Fee Type got reflected
	When Enter the student dob
	And Enter the student Gender to verify new fee
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new fee type get reflected or not 
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify new fee type get reflected or not
	When headteacher should navigate to feeinfo page and verify the newly added fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new fee type get reflected or not 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new fee type get reflected or not 
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify one time payment frequency
	And Verify the new added one time fee frequency get reflected in fee page before student active
@FeeFrequencyValidation
@RecruitmentFormOneTimeFee
@logout
Scenario: Log out the user
And log out
And close window
#----------------------------Yearly Fee Frequency------------------------------------#
@FeeFrequencyValidation
@AddNewYearlyFee
Scenario: To verify Add New Fee with Yearly fee frequency Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Yearly Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Yearly frequency Fee Type get reflected in Fee Type Dropdown
@FeeFrequencyValidation
@AddNewYearlyFee
@logout
Scenario: Log out the user
And log out
And close window
@FeeFrequencyValidation
@YearlyFeeTypeAssignment
Scenario: To verify Yearly Fee Frequency Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added Yearly fee type from the FeeType dropdown 
	And Select Academic Year for Yearly Fee Type
	And Select Center for Yearly Fee Type
	And Select School For Yearly Fee Type
	And Select Class For Yearly Fee Type
	And Enter the amount Yearly Fee Type
	And Select Fee Frequency as yearly
	And Click save
	And Verify the added Yearly fee type is assigned to the respective center and class
@FeeFrequencyValidation
@YearlyFeeTypeAssignment
@logout
Scenario: Log out the user
And log out
And close window
@FeeFrequencyValidation
@RecruitmentFormYearlyFee
Scenario: To verify newly added Yearly fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify the new yearly frequency Fee Type got reflected
	When Enter the student dob
	And Enter the student Gender to verify new yearly fee
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new Yearly fee type get reflected or not 
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify new yearly fee type get reflected or not
	When headteacher should navigate to feeinfo page and verify the newly added yearly frequency fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new Yearly fee type get reflected or not 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new Yearly fee type get reflected or not 
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 
	And Enter the Student name to verify Yearly payment frequency
	And Verify the new added yearly fee frequency get reflected in fee page before student active
	
@FeeFrequencyValidation
@RecruitmentFormYearlyFee
@logout
Scenario: Log out the user
And log out 
And close window
#-----------------------------------Monthly Fee Frequency-----------------------------#
@FeeFrequencyValidation
@AddNewMonthlyFee
Scenario: To verify Add New Fee with Monthly fee frequency Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Monthly Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Monthly frequency Fee Type get reflected in Fee Type Dropdown
@FeeFrequencyValidation	
@AddNewMonthlyFee
@logout
Scenario: Log out the user
And log out	
And close window
@FeeFrequencyValidation
@MonthlyFeeTypeAssignment
Scenario: To verify Monthly Fee Frequency Assignment Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown to verify Monthly fee test
	And Select Academic Year for Monthly Fee Type
	And Select Center for Monthly Fee Type
	And Select School For Monthly Fee Type
	And Select Class For Monthly Fee Type
	And Enter the amount Monthly Fee Type
	And Select Fee Frequency as Monthly
	And Click save
	And Verify the added Monthly fee type is assigned to the respective center and class
@FeeFrequencyValidation
@MonthlyFeeTypeAssignment
@logout
Scenario: Log out the user
And log out
And close window
@FeeFrequencyValidation
@RecruitmentFormMonthlyFee
Scenario: To verify newly added Monthly fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
    When Enter the Student name to verify the new monthly frequency Fee Type got reflected
    When Enter the student dob
	And Enter the student Gender to verify new monthly fee
	And Enter the Student details 
	And Enter the sibling details
	And Enter the Family member Info and other details
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new monthly fee type get reflected or not 
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify new monthly fee type get reflected or not
	When headteacher should navigate to feeinfo page and verify the newly added monthly frequency fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new monthly fee type get reflected or not 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new monthly fee type get reflected or not 
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 
	And Enter the Student name to verify Monthly payment frequency
	And Verify the new added monthly fee frequency not get reflected in fee page before student active
	When Click on the student AdmissionFee Deposit icon 
	When Click on save button to do the AdmissionFeeDeposit 
	And log out
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on update photo schedule from my functions 
	When enter the student name to update the photo schedule and click camera icon to verify Monthly fee
	When enter the date and save
	And log out
	And close window
	And initiate web browser
	And Enter username as "laceymontour@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click the student CMF photo scheduled today
	When enter the student name to upload photo and click on the view profile icon to verify Monthly Fee
	When click on upload CMF photo 
	When Click on the choose file and upload button
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 
	And Enter the Student name to verify Monthly payment frequency
	And Verify the new added monthly fee frequency get reflected in fee page after student active
@FeeFrequencyValidation	
@RecruitmentFormMonthlyFee
@logout
Scenario: Log out the user
And log out
And close window
#------------------------------------------Fee Frequency -Termly-------------------------------#
@FeeFrequencyValidation
@AddNewTermlyFee
Scenario: To verify Add New Fee with Termly fee frequency Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Termly Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Termly frequency Fee Type get reflected in Fee Type Dropdown
@FeeFrequencyValidation
@AddNewTermlyFee
@logout
Scenario: Log out the user
And log out
And close window
@FeeFrequencyValidation
@TermlyFeeTypeAssignment
Scenario: To verify Termly Fee Frequency Assignment Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown to verify Termly fee test
	And Select Academic Year for Termly Fee Type
	And Select Center for Termly Fee Type
	And Select School For Termly Fee Type
	And Select Class For Termly Fee Type
	And Enter the amount Termly Fee Type
	And Select Fee Frequency as Termly
	And Click save
	And Verify the added Termly fee type is assigned to the respective center and class
@FeeFrequencyValidation
@TermlyFeeTypeAssignment
@logout
Scenario: Log out the user
And log out	
And close window
@FeeFrequencyValidation
@RecruitmentFormTermFee
Scenario: To verify newly added Termly fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
    When Enter the Student name to verify the new Termly frequency Fee Type got reflected
    When Enter the student dob
	And Enter the student Gender to verify new Termly fee
	And Enter the Student details 
	And Enter the sibling details
	And Enter the Family member Info and other details
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new Termly fee type get reflected or not 
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify new Termly fee type get reflected or not
	When headteacher should navigate to feeinfo page and verify the newly added Termly frequency fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new Termly fee type get reflected or not 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new Termly fee type get reflected or not 
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 
	And Enter the Student name to verify Termly payment frequency
	And Verify the new added Termly fee frequency not get reflected in fee page before student active
	When Click on the student AdmissionFee Deposit icon 
	When Click on save button to do the AdmissionFeeDeposit 
	And log out
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on update photo schedule from my functions 
	When enter the student name to update the photo schedule and click camera icon to verify Termly fee
	When enter the date and save
	And log out
	And close window
	And initiate web browser
	And Enter username as "laceymontour@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click the student CMF photo scheduled today
	When enter the student name to upload photo and click on the view profile icon to verify Termly Fee
	When click on upload CMF photo 
	When Click on the choose file and upload button
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 
	And Enter the Student name to verify Termly payment frequency
	And Verify the new added Termly fee frequency get reflected in fee page after student active
	
@FeeFrequencyValidation
@RecruitmentFormTermFee
@logout
Scenario: Log out the user
And log out
And close window
#-----------------------------Per family with one time Fee Frequency-------------------------------#

@PerFamily
@AddNewPerFamilyOneTimeFeeType
Scenario: To verify Add new Per Family Fee Type 
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Per family Fee type
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Per Family Fee Type get reflected in Fee Type Dropdown

@PerFamily	
@AddNewPerFamilyOneTimeFeeType
@logout
Scenario: Log out the user
And log out
And close window
@PerFamily
@PerFamilyOneTimeFeeTypeAssignment
Scenario: To verify Per Family Type Assignment with One Time Fee Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown to verify Per Family fee test
	And Select Academic Year for Per Family Fee Type
	And Select Center for Per Family Fee Type
	And Select School For Per Family Fee Type
	And Select Class For Per Family Fee Type
	And Enter the amountF For Per Family Fee Type
	And Select Per Family Check Box
	And Select Fee Frequency
	And Click save
	And Verify the added Per Family fee type with One Time Frequency is assigned to the respective center and class
@PerFamily
@PerFamilyOneTimeFeeTypeAssignment
@logout
Scenario: Log out the user
And log out	
And close window
@PerFamily
@PerFamilyOneTimeFeePreRequiste
Scenario: Pre Requiste student recruitment to verify PerFamily Fee Type with one time frequency
And initiate web browser
And Enter username as "josk.sw1@mohiafrica.org" And click submit
And Enter security answer as "k" And click submit
And Enter password as "Password#123" And click submit
When Select student menu and click student entry submenu
When Enter the Student name for Pre requiste 
When Enter the student dob
And Enter the student Gender for Pre requiste
And Enter the Student details
And Enter the sibling details
And Enter the Family member Info and other details
And log out
And close window
And initiate web browser
And Enter username as "josk.ht@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When headteacher click on the approval link in the myalerts tab
When headteacher enter the student name for Pre requiste and click on approval icon
When headteacher should navigate to schoolinfo page and save the schoolinfo for Pre requiste
When headteacher should navigate to feeinfo page and verify the newly added per Family One Time frequency fee got reflected
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSC click on the approval link in the myalerts tab
When headteacher enter the student name for Pre requiste and click on approval icon
When CSC should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "AndriaMoushon@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSM click on the approval link in the myalerts tab
When headteacher enter the student name for Pre requiste and click on approval icon
When CSM should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family One Time Fee Frequency get reflected in Fee Page
And Verify the new added Per Familt One Time fee frequency get reflected in fee page before student active

@PerFamily
@PerFamilyOneTimeFeePreRequiste
@logout
Scenario: Log out the user
And log out	
And close window
@PerFamily
@PerFamilyOneTimeFee
Scenario: To verify PerFamily Fee Type with one time frequency
And initiate web browser
And Enter username as "josk.sw1@mohiafrica.org" And click submit
And Enter security answer as "k" And click submit
And Enter password as "Password#123" And click submit
When Select student menu and click student entry submenu
When Enter the Student name to verify PerFamily Fee Type with one time frequency
When Enter the student dob
And Enter the student Gender to verify PerFamily Fee Type with one time frequency
And Enter the Student details
And Enter the sibling details to verify PerFamily Fee Type 
And Enter the Family member Info and other details to verify PerFamily Fee Type
And log out
And close window
And initiate web browser
And Enter username as "josk.ht@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When headteacher click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with one time frequency
When headteacher should navigate to schoolinfo page and save the schoolinfo to verify PerFamily Fee Type with one time frequency
When headteacher should navigate to feeinfo page and verify the newly added per Family One Time frequency not got reflected
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSC click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with one time frequency
When CSC should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "AndriaMoushon@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSM click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with one time frequency
When CSM should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family One Time Fee Frequency not get reflected in Fee Page
And Verify the new added Per Family One Time fee frequency not get reflected in fee page as he has sibling

@PerFamily
@PerFamilyOneTimeFeeTypeAssignment
@logout
Scenario: Log out the user
And log out	
And close window
#-----------------------------Per family with Yearly Fee Frequency-------------------------------#
@PerFamily
@AddNewPerFamilyYearlyFeeType
Scenario: To verify Add new Per Family Fee Type with Yearly Frequency
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Per family Fee type to verify Yearly Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Per Family Fee Type to verify Yearly Frequency get reflected in Fee Type Dropdown
@PerFamily	
@AddNewPerFamilyYearlyFeeType
@logout
Scenario: Log out the user
And log out
And close window
@PerFamily
@PerFamilyYearlyFeeTypeAssignment
Scenario: To verify Per Family Type Assignment with Yearly Fee Frequency Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added Per Family Yearly fee from the FeeType dropdown to verify Per Family fee test
	And Select Academic Year for Per Family Yearly Fee Type
	And Select Center for Per Family Yearly Fee Type
	And Select School For Per Family Yearly Fee Type
	And Select Class For Per Family Yearly Fee Type
	And Enter the amountF For Per Family Yearly Fee Type
	And Select Per Family Check Box
	And Select Fee Frequency as yearly
	And Click save
	And Verify the added Per Family fee type with Yearly Frequency is assigned to the respective center and class
@PerFamily
@PerFamilyYearlyFeeTypeAssignment
@logout
Scenario: Log out the user
And log out	
And close window
@PerFamily
@PerFamilyYearlyFeePreRequiste
Scenario: Pre Requiste student recruitment to verify PerFamily Fee Type with one time frequency
And initiate web browser
And Enter username as "josk.sw1@mohiafrica.org" And click submit
And Enter security answer as "k" And click submit
And Enter password as "Password#123" And click submit
When Select student menu and click student entry submenu
When Enter the Student name for Pre requiste to verify Per Family with Yearly Fee Frequency 
When Enter the student dob
And Enter the student Gender for Pre requiste to verify Per Family with Yearly Fee Frequency
And Enter the Student details
And Enter the sibling details
And Enter the Family member Info and other details
And log out
And close window
And initiate web browser
And Enter username as "josk.ht@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When headteacher click on the approval link in the myalerts tab
When headteacher enter the student name for Pre requiste to verify Per Family with Yearly Fee Frequency and click on approval icon
When headteacher should navigate to schoolinfo page and save the schoolinfo for Pre requiste to verify Per Family with Yearly Fee Frequency
When headteacher should navigate to feeinfo page and verify the newly added per Family Yearly frequency fee got reflected
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSC click on the approval link in the myalerts tab
When headteacher enter the student name for Pre requiste to verify Per Family with Yearly Fee Frequency and click on approval icon
When CSC should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "AndriaMoushon@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSM click on the approval link in the myalerts tab
When headteacher enter the student name for Pre requiste to verify Per Family with Yearly Fee Frequency and click on approval icon
When CSM should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family Yearly Fee Frequency get reflected in Fee Page
And Verify the new added Per Family Yearly fee frequency get reflected in fee page before student active

@PerFamily
@PerFamilyYearlyFeePreRequiste
@logout
Scenario: Log out the user
And log out
And close window
@PerFamily
@PerFamilyYearlyFee
Scenario: To verify PerFamily Fee Type with Yearly frequency
And initiate web browser
And Enter username as "josk.sw1@mohiafrica.org" And click submit
And Enter security answer as "k" And click submit
And Enter password as "Password#123" And click submit
When Select student menu and click student entry submenu
When Enter the Student name to verify PerFamily Fee Type with Yearly frequency
When Enter the student dob
And Enter the student Gender to verify PerFamily Fee Type with Yearly frequency
And Enter the Student details
And Enter the sibling details to verify PerFamily Fee Type 
And Enter the Family member Info and other details to verify PerFamily Fee Type
And log out
And close window
And initiate web browser
And Enter username as "josk.ht@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When headteacher click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with Yearly frequency
When headteacher should navigate to schoolinfo page and save the schoolinfo to verify PerFamily Fee Type with Yearly frequency
When headteacher should navigate to feeinfo page and verify the newly added per Family Yearly frequency not got reflected
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSC click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with Yearly frequency
When CSC should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "AndriaMoushon@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSM click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with Yearly frequency
When CSM should navigate to finalpage and click Approve
And log out
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family One Time Fee Frequency not get reflected in Fee Page
And Verify the new added Per Family Yearly fee frequency not get reflected in fee page as he has sibling

@PerFamily
@PerFamilyYearlyFee
@logout
Scenario: Log out the user
And log out		
And close window
#-----------------------------Per family with Monthly Fee Frequency-------------------------------#

@PerFamily
@AddNewPerFamilyMonthlyFeeType
Scenario: To verify Add new Per Family Fee Type with Monthly Frequency
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Per family Fee type to verify Monthly Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Per Family Fee Type to verify Monthly Frequency get reflected in Fee Type Dropdown
@PerFamily	
@AddNewPerFamilyMonthlyFeeType
@logout
Scenario: Log out the user
And log out
And close window
@PerFamily
@PerFamilyMonthlyFeeTypeAssignment
Scenario: To verify Per Family Fee Type with Monthly Fee Frequency Assignment Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown to verify Per Family Monthly fee test
	And Select Academic Year to verify Per Family Monthly Fee Type
	And Select Center to verify Per Family Monthly Fee Type
	And Select School to verify Per Family Monthly Fee Type
	And Select Class to verify Per Family Monthly Fee Type
	And Enter the amount to verify Per Family Monthly Fee Type
	And Select Per Family Check Box
	And Select Fee Frequency as Monthly
	And Click save
	And Verify the added Per Family Monthly fee type is assigned to the respective center and class
@PerFamily
@PerFamilyMonthlyFeeTypeAssignment
@logout
Scenario: Log out the user
And log out
And close window
@PerFamily
@PerFamilyMonthlyFeePreRequiste
Scenario: Pre Requiste student recruitment to verify PerFamily Fee Type with Monthly frequency
And initiate web browser
And Enter username as "josk.sw1@mohiafrica.org" And click submit
And Enter security answer as "k" And click submit
And Enter password as "Password#123" And click submit
When Select student menu and click student entry submenu
When Enter the Student name for Pre requiste to verify PerFamily Fee Type with Monthly frequency
When Enter the student dob
And Enter the student Gender for Pre requiste to verify PerFamily Fee Type with Monthly frequency
And Enter the Student details
And Enter the sibling details
And Enter the Family member Info and other details
And log out
And close window
And initiate web browser
And Enter username as "josk.ht@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When headteacher click on the approval link in the myalerts tab
When Enter the student name for Pre requiste and click on approval icon to verify PerFamily Fee Type with Monthly frequency
When headteacher should navigate to schoolinfo page and save the schoolinfo for Pre requiste to verify PerFamily Fee Type with Monthly frequency
When headteacher should navigate to feeinfo page and verify the newly added per Family Month frequency fee got reflected 
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSC click on the approval link in the myalerts tab
When Enter the student name for Pre requiste and click on approval icon to verify PerFamily Fee Type with Monthly frequency
When CSC should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "AndriaMoushon@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSM click on the approval link in the myalerts tab
When Enter the student name for Pre requiste and click on approval icon to verify PerFamily Fee Type with Monthly frequency
When CSM should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family Monthly Fee Frequency not get reflected in Fee Page
And Verify the new added Per Family Monthly fee frequency not get reflected in fee page before student active
When Click on the student AdmissionFee Deposit icon 
When Click on save button to do the AdmissionFeeDeposit 
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit 
When Click on update photo schedule from my functions 
When enter the student name to update the photo schedule and click camera icon to verify PerFamily Monthly fee for Prerequiste
When enter the date and save
And log out
And close window
And initiate web browser
And Enter username as "laceymontour@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit 
When Click the student CMF photo scheduled today
When enter the student name to upload photo and click on the view profile icon to verify PerFamily Monthly fee for Prerequiste
When click on upload CMF photo 
When Click on the choose file and upload button
And log out
And close window
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family Monthly Fee Frequency get reflected in Fee Page
And Verify the new added PerFamily Monthly fee frequency get reflected in fee page after student active

@PerFamily
@PerFamilyMonthlyFeePreRequiste
@logout
Scenario: Log out the user
And log out	
And close window
@PerFamily
@PerFamilyMonthlyFee
Scenario: To verify PerFamily Fee Type with Monthly frequency
And initiate web browser
And Enter username as "josk.sw1@mohiafrica.org" And click submit
And Enter security answer as "k" And click submit
And Enter password as "Password#123" And click submit
When Select student menu and click student entry submenu
When Enter the Student name to verify PerFamily Fee Type with Monthly frequency
When Enter the student dob
And Enter the student Gender to verify PerFamily Fee Type with Monthly frequency
And Enter the Student details
And Enter the sibling details to verify PerFamily Fee Type 
And Enter the Family member Info and other details to verify PerFamily Fee Type
And log out
And close window
And initiate web browser
And Enter username as "josk.ht@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When headteacher click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with Monthly frequency
When headteacher should navigate to schoolinfo page and save the schoolinfo to verify PerFamily Fee Type with Monthly frequency
When headteacher should navigate to feeinfo page and verify the newly added per Family Monthly frequency not got reflected
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSC click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with Monthly frequency
When CSC should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "AndriaMoushon@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSM click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with Monthly frequency
When CSM should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family One Time Fee Frequency not get reflected in Fee Page
When Click on the student AdmissionFee Deposit icon 
When Click on save button to do the AdmissionFeeDeposit
And Verify the new added Per Family Monthly fee frequency not get reflected in fee page as he has sibling
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit 
When Click on update photo schedule from my functions 
When enter the student name to update the photo schedule and click camera icon to verify PerFamily Monthly fee 
When enter the date and save
And log out
And close window
And initiate web browser
And Enter username as "laceymontour@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit 
When Click the student CMF photo scheduled today
When enter the student name to upload photo and click on the view profile icon to verify PerFamily Monthly fee 
When click on upload CMF photo 
When Click on the choose file and upload button
And log out
And close window
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family One Time Fee Frequency not get reflected in Fee Page
And Verify the new added PerFamily Monthly fee frequency not get reflected in fee page after student active as he has sibling

@PerFamily
@logout
Scenario: Log out the user
And log out	
And close window

#-----------------------------Per family with Termly Fee Frequency-------------------------------#
@PerFamily
@AddNewPerFamilyTermlyFee
Scenario: To add new fee to verify Per Family with Termly Fee Frequency Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Per Family Termly Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the Newly Added per Family Termly frequency Fee Type get reflected in Fee Type Dropdown

@PerFamily
@AddNewPerFamilyTermlyFee
@logout
Scenario: Log out the user
And log out
And close window
@PerFamily
@PerFamilyTermlyFeeTypeAssignment
Scenario: To verify Per Family Fee Type with Termly Fee Frequency Assignment Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown to verify Per Family Termly fee test
	And Select Academic Year for Per Family Termly Fee Type
	And Select Center for Per Family Termly Fee Type
	And Select School For Per Family Termly Fee Type
	And Select Class For Per Family Termly Fee Type
	And Enter the amount Per Family Termly Fee Type
	And Select Per Family Check Box
	And Select Fee Frequency as Termly
	And Click save
	And Verify the added Per Family Termly fee type is assigned to the respective center and class

@PerFamily
@PerFamilyTermlyFeeTypeAssignment
@logout
Scenario: Log out the user
And log out	
And close window
@PerFamily
@PerFamilyTermlyFeePreRequiste
Scenario: Pre Requiste student recruitment to verify PerFamily Fee Type with Termly frequency
And initiate web browser
And Enter username as "josk.sw1@mohiafrica.org" And click submit
And Enter security answer as "k" And click submit
And Enter password as "Password#123" And click submit
When Select student menu and click student entry submenu
When Enter the Student name for Pre requiste to verify PerFamily Fee Type with Termly frequency
When Enter the student dob
And Enter the student Gender for Pre requiste to verify PerFamily Fee Type with Termly frequency
And Enter the Student details
And Enter the sibling details
And Enter the Family member Info and other details
And log out
And close window
And initiate web browser
And Enter username as "josk.ht@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When headteacher click on the approval link in the myalerts tab
When Enter the student name for Pre requiste and click on approval icon to verify PerFamily Fee Type with Termly frequency
When headteacher should navigate to schoolinfo page and save the schoolinfo for Pre requiste to verify PerFamily Fee Type with Termly frequency
When headteacher should navigate to feeinfo page and verify the newly added per Family Termly frequency fee got reflected 
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSC click on the approval link in the myalerts tab
When Enter the student name for Pre requiste and click on approval icon to verify PerFamily Fee Type with Termly frequency
When CSC should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "AndriaMoushon@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSM click on the approval link in the myalerts tab
When Enter the student name for Pre requiste and click on approval icon to verify PerFamily Fee Type with Termly frequency
When CSM should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family Termly Fee Frequency not get reflected in Fee Page
And Verify the new added Per Family Termly fee frequency not get reflected in fee page before student active
When Click on the student AdmissionFee Deposit icon 
When Click on save button to do the AdmissionFeeDeposit 
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit 
When Click on update photo schedule from my functions 
When enter the student name to update the photo schedule and click camera icon to verify PerFamily Termly fee for Prerequiste
When enter the date and save
And log out
And close window
And initiate web browser
And Enter username as "laceymontour@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit 
When Click the student CMF photo scheduled today
When enter the student name to upload photo and click on the view profile icon to verify PerFamily Termly fee for Prerequiste
When click on upload CMF photo 
When Click on the choose file and upload button
And log out
And close window
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family Termly Fee Frequency get reflected in Fee Page
And Verify the new added PerFamily Termly fee frequency get reflected in fee page after student active

@PerFamily
@PerFamilyTermlyFeePreRequiste
@logout
Scenario: Log out the user
And log out	
And close window
@PerFamily
@PerFamilyTermlyFee
Scenario: To verify PerFamily Fee Type with Termly frequency
And initiate web browser
And Enter username as "josk.sw1@mohiafrica.org" And click submit
And Enter security answer as "k" And click submit
And Enter password as "Password#123" And click submit
When Select student menu and click student entry submenu
When Enter the Student name to verify PerFamily Fee Type with Termly frequency
When Enter the student dob
And Enter the student Gender to verify PerFamily Fee Type with Termly frequency
And Enter the Student details
And Enter the sibling details to verify PerFamily Fee Type 
And Enter the Family member Info and other details to verify PerFamily Fee Type
And log out
And close window
And initiate web browser
And Enter username as "josk.ht@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When headteacher click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with Termly frequency
When headteacher should navigate to schoolinfo page and save the schoolinfo to verify PerFamily Fee Type with Termly frequency
When headteacher should navigate to feeinfo page and verify the newly added per Family Termly frequency not got reflected
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSC click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with Termly frequency
When CSC should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "AndriaMoushon@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSM click on the approval link in the myalerts tab
When headteacher enter the student name to verify PerFamily Fee Type with Termly frequency
When CSM should navigate to finalpage and click Approve
And log out
And close window
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family Termly Frequency not get reflected in Fee Page
When Click on the student AdmissionFee Deposit icon 
When Click on save button to do the AdmissionFeeDeposit
And Verify the new added Per Family Termly fee frequency not get reflected in fee page as he has sibling
And log out
And close window
And initiate web browser
And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit 
When Click on update photo schedule from my functions 
When enter the student name to update the photo schedule and click camera icon to verify PerFamily Termly fee 
When enter the date and save
And log out
And close window
And initiate web browser
And Enter username as "laceymontour@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit 
When Click the student CMF photo scheduled today
When enter the student name to upload photo and click on the view profile icon to verify PerFamily Termly fee 
When click on upload CMF photo 
When Click on the choose file and upload button
And log out
And close window
And initiate web browser
And Enter username as "fwamacaroline@yahoo.com" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When Select student menu and click Fee Deposit submenu 
And Enter the Student name to verify Per Family Termly Frequency not get reflected in Fee Page
And Verify the new added PerFamily Termly fee frequency not get reflected in fee page after student active as he has sibling

@PerFamily
@PerFamilyTermlyFee
@logout
Scenario: Log out the user
And log out	
And close window
#---------------------------------------Gender - OneTimeFee--------------------------------------#

@Gender
@AddNewGenderOneTimeFee
Scenario: To add new fee to verify Gender with One Time Fee Frequency Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Gender One Time Fee Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the Newly Added Gender One Time fee frequency get reflected in Fee Type Dropdown

@Gender
@AddNewGenderOneTimeFee
@logout
Scenario: Log out the user
And log out
And close window
@Gender
@GenderOneTimeFeeAssignment
Scenario: To verify Gender Fee Type with OneTime Fee Frequency Assignment Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown to verify Gender One Time fee test
	And Select Academic Year for Gender One Time Fee Type
	And Select Center for Gender One Time Fee Type
	And Select School For Gender One Time Fee Type
	And Select Class For Gender One Time Fee Type
	And Select Is Gender Check Box
	And Enter the amount for Male
	And Enter the amount for Female
	And Select Fee Frequency
	And Click save
	And Verify the added Gender One Time fee type is assigned to the respective center and class

@Gender
@GenderOneTimeFeeAssignment
@logout
Scenario: Log out the user
And log out	
And close window
@Gender
@MaleStudentOneTimeFeeRecruitment
Scenario: To verify newly added Male Amount with one time fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Male One Time Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Male One Time Fee got reflected
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male One Time Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Male One Time Fee got reflected
	When headteacher should navigate to feeinfo page to verify Male One Time Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male One Time Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male One Time Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Male One Time Fee got reflected in fee page
	And Verify the newly added Male with one time fee frequency get reflected in fee page before student active

@Gender	
@MaleStudentOneTimeFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window

@Gender
@FemaleStudentOneTimeFeeRecruitment
Scenario: To verify newly added Female Amount with one time fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Female One Time Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Female One Time Fee got reflected
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female One Time Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Female One Time Fee got reflected
	When headteacher should navigate to feeinfo page to verify Female One Time Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female One Time Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female One Time Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Female One Time Fee got reflected in fee page
	And Verify the newly added Female with one time fee frequency get reflected in fee page before student active
@Gender	
@FemaleStudentOneTimeFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window
#---------------------------------------Gender - Yearly Fee--------------------------------------#

@Gender
@AddNewGenderYearlyFee
Scenario: To verify Add New gender Fee with Yearly fee frequency Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Gender Yearly Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the Newly Added gender Yearly frequency Fee Type get reflected in Fee Type Dropdown
@Gender	
@AddNewGenderYearlyFee
@logout
Scenario: Log out the user
And log out
And close window
@Gender
@GenderYearlyFeeAssignment
Scenario: To verify Gender Fee Type with Yearly Fee Frequency Assignment Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown to verify Gender Yearly fee test
	And Select Academic Year for Gender Yearly Fee Type
	And Select Center for Gender Yearly Fee Type
	And Select School For Gender Yearly Fee Type
	And Select Class For Gender Yearly Fee Type
	And Select Is Gender Check Box
	And Enter the amount for Male to verify yearly fee
	And Enter the amount for Female to verify yearly fee
	And Select Fee Frequency as yearly
	And Click save
	And Verify the added Gender Yearly fee type is assigned to the respective center and class
@Gender
@GenderYearlyFeeAssignment
@logout
Scenario: Log out the user
And log out	
And close window
@Gender
@MaleStudentYearlyFeeRecruitment
Scenario: To verify newly added Male Amount with yearly fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Male Yearly Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Male Yearly Fee got reflected
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male Yearly Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Male Yearly Fee got reflected
	When headteacher should navigate to feeinfo page to verify Male Yearly Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male Yearly Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male Yearly Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Male Yearly Fee got reflected in fee page
	And Verify the newly added Male with Yearly fee frequency get reflected in fee page before student active

@Gender	
@MaleStudentYearlyFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window
@Gender
@FemaleStudentYearlyFeeRecruitment
Scenario: To verify newly added Female Amount with yearly fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Female Yearly Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Female Yearly Fee got reflected
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female Yearly Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Female Yearly Fee got reflected
	When headteacher should navigate to feeinfo page to verify Female Yearly Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female Yearly Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female Yearly Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Female Yearly Fee got reflected in fee page
	And Verify the newly added Female with Yearly fee frequency get reflected in fee page before student active

@Gender	
@FemaleStudentYearlyFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window
#---------------------------------------Gender - Monthly Fee--------------------------------------#

@Gender
@AddNewGenderMonthlyFeeType
Scenario: To verify Add new Gender Fee Type with Monthly Frequency
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Gender Fee type to verify Monthly Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Gender Fee Type to verify Monthly Frequency get reflected in Fee Type Dropdown
@Gender
@AddNewGenderMonthlyFeeType
@logout
Scenario: Log out the user
And log out
And close window
@Gender
@GenderMonthlyFeeAssignment
Scenario: To verify Gender Fee Type with Monthly Fee Frequency Assignment Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown to verify Gender Monthly fee test
	And Select Academic Year for Gender Monthly Fee Type
	And Select Center for Gender Monthly Fee Type
	And Select School For Gender Monthly Fee Type
	And Select Class For Gender Monthly Fee Type
	And Select Is Gender Check Box
	And Enter the amount for Male to verify Monthly fee
	And Enter the amount for Female to verify Monthly fee
	And Select Fee Frequency as Monthly
	And Click save
	And Verify the added Gender Monthly fee type is assigned to the respective center and class

@Gender
@GenderMonthlyFeeAssignment
@logout
Scenario: Log out the user
And log out	
And close window
@Gender
@MaleStudentMonthlyFeeRecruitment
Scenario: To verify newly added Male Amount with Monthly fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Male Monthly Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Male Monthly Fee got reflected
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male Monthly Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Male Monthly Fee got reflected
	When headteacher should navigate to feeinfo page to verify Male Monthly Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male Monthly Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male Monthly Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Male Monthly Fee got reflected in fee page
	And Verify the newly added Male with Monthly fee frequency not get reflected in fee page before student active
	When Click on the student AdmissionFee Deposit icon 
    When Click on save button to do the AdmissionFeeDeposit 
	And log out
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on update photo schedule from my functions 
	When enter the student name to update the photo schedule and click camera icon to verify Male Monthly fee for Prerequiste
	When enter the date and save
	And log out
	And close window
	And initiate web browser
	And Enter username as "laceymontour@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click the student CMF photo scheduled today
	When enter the student name to upload photo and click on the view profile icon to verify Male Monthly fee for Prerequiste
	When click on upload CMF photo 
	When Click on the choose file and upload button
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 
	And Enter the Student name to verify Male Monthly Fee got reflected in fee page
	And Verify the new added gender Monthly fee frequency get reflected in fee page after student active
	
@Gender	
@MaleStudentMonthlyFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window
@Gender
@FemaleStudentMonthlyFeeRecruitment
Scenario: To verify newly added Female Amount with Monthly fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Female Monthly Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Female Monthly Fee got reflected
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female Monthly Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Female Monthly Fee got reflected
	When headteacher should navigate to feeinfo page to verify Female Monthly Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female Monthly Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female Monthly Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Female Monthly Fee got reflected in fee page
	And Verify the newly added Female with Monthly fee frequency not get reflected in fee page before student active
	When Click on the student AdmissionFee Deposit icon 
    When Click on save button to do the AdmissionFeeDeposit 
	And log out
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on update photo schedule from my functions 
	When enter the student name to update the photo schedule and click camera icon to verify Female Monthly fee for Prerequiste
	When enter the date and save
	And log out
	And close window
	And initiate web browser
	And Enter username as "laceymontour@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click the student CMF photo scheduled today
	When enter the student name to upload photo and click on the view profile icon to verify Female Monthly fee for Prerequiste
	When click on upload CMF photo 
	When Click on the choose file and upload button
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 
	And Enter the Student name to verify Female Monthly Fee got reflected in fee page
	And Verify the new added Female Monthly fee frequency get reflected in fee page after student active
	
@Gender	
@FemaleStudentMonthlyFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window
#---------------------------------------Gender - Termly Fee--------------------------------------#
@Gender
@AddNewGenderTermlyFeeType
Scenario: To verify Add new Gender Fee Type with Monthly Frequency
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Gender Fee type to verify Termly Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Gender Fee Type to verify Termly Frequency get reflected in Fee Type Dropdown
@Gender
@AddNewGenderTermlyFeeType
@logout
Scenario: Log out the user
And log out
And close window
@Gender
@GenderTermlyFeeAssignment
Scenario: To verify Gender Fee Type with Termly Fee Frequency Assignment Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown to verify Gender Termly fee test
	And Select Academic Year for Gender Termly Fee Type
	And Select Center for Gender Termly Fee Type
	And Select School For Gender Termly Fee Type
	And Select Class For Gender Termly Fee Type
	And Select Is Gender Check Box
	And Enter the amount for Male to verify Termly fee
	And Enter the amount for Female to verify Termly fee
	And Select Fee Frequency as Termly
	And Click save
	And Verify the added Gender Termly fee type is assigned to the respective center and class
@Gender
@GenderTermlyFeeAssignment
@logout
Scenario: Log out the user
And log out	
And close window
@Gender
@MaleStudentTermlyFeeRecruitment
Scenario: To verify newly added Male Amount with Termly fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Male Termly Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Male Termly Fee got reflected
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male Termly Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Male Termly Fee got reflected
	When headteacher should navigate to feeinfo page to verify Male Termly Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male Termly Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Male Termly Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Male Termly Fee got reflected in fee page
	And Verify the newly added Male with Termly fee frequency not get reflected in fee page before student active
	When Click on the student AdmissionFee Deposit icon 
    When Click on save button to do the AdmissionFeeDeposit 
	And log out
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on update photo schedule from my functions 
	When enter the student name to update the photo schedule and click camera icon to verify Male Termly fee for Prerequiste
	When enter the date and save
	And log out
	And close window
	And initiate web browser
	And Enter username as "laceymontour@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click the student CMF photo scheduled today
	When enter the student name to upload photo and click on the view profile icon to verify Male Termly fee for Prerequiste
	When click on upload CMF photo 
	When Click on the choose file and upload button
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 
	And Enter the Student name to verify Male Termly Fee got reflected in fee page
	And Verify the new added gender Termly fee frequency get reflected in fee page after student active
	
@Gender	
@MaleStudentTermlyFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window
@Gender
@FemaleStudentTermlyFeeRecruitment
Scenario: To verify newly added Female Amount with Termly fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Female Termly Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Female Termly Fee got reflected
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female Termly Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Female Termly Fee got reflected
	When headteacher should navigate to feeinfo page to verify Female Termly Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female Termly Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Female Termly Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Female Termly Fee got reflected in fee page
	And Verify the newly added Female with Termly fee frequency not get reflected in fee page before student active
	When Click on the student AdmissionFee Deposit icon 
    When Click on save button to do the AdmissionFeeDeposit 
	And log out
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on update photo schedule from my functions 
	When enter the student name to update the photo schedule and click camera icon to verify Female Termly fee for Prerequiste
	When enter the date and save
	And log out
	And close window
	And initiate web browser
	And Enter username as "laceymontour@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click the student CMF photo scheduled today
	When enter the student name to upload photo and click on the view profile icon to verify Female Termly fee for Prerequiste
	When click on upload CMF photo 
	When Click on the choose file and upload button
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 
	And Enter the Student name to verify Female Termly Fee got reflected in fee page
	And Verify the new added Female Termly fee frequency get reflected in fee page after student active
	
@Gender	
@FemaleStudentTermlyFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window
#-------------------------------------------Is Elder-One Time Fee----------------------------#
@Elder
@AddNewIsElderOneTimeFeeType
Scenario: To verify Add new IsElder Fee Type with One Time Frequency
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Elder Fee type to verify One Time Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Elder Fee Type to verify one Time Frequency get reflected in Fee Type Dropdown
@Elder
@AddNewIsElderOneTimeFeeType
@logout
Scenario: Log out the user
And log out
And close window
@Elder
@ElderOneTimeFeeAssignment
Scenario: To verify Elder Fee Type with OneTime Fee Frequency Assignment Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown to verify Elder One Time fee test
	And Select Academic Year for Elder One Time Fee Type
	And Select Center for Elder One Time Fee Type
	And Select School For Elder One Time Fee Type
	And Select Class For Elder One Time Fee Type
	And Select Is Elder Check Box
	And Enter the amount for Elder to verify One Time fee
	And Enter the amount for Younger to verify One Time fee
	And Select Fee Frequency
	And Click save
	And Verify the added Elder One Time fee type is assigned to the respective center and class
@Elder
@ElderOneTimeFeeAssignment
@logout
Scenario: Log out the user
And log out
And close window
@Elder
@ElderOneTimeFeeRecruitment
Scenario: To verify newly added Elder Amount with OneTime fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Elder OneTime Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Elder OneTime Fee got reflected
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Elder OneTime Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Elder OneTime Fee got reflected
	When headteacher should navigate to feeinfo page to verify Elder OneTime Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Elder OneTime Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Elder OneTime Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Elder OneTime Fee got reflected in fee page
	And Verify the newly added Elder with OneTime fee frequency get reflected in fee page before student active

@Elder	
@ElderOneTimeFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window

@Elder
@YoungerOneTimeFeeRecruitment
Scenario: To verify newly added Younger Amount with OneTime fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Younger OneTime Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Younger OneTime Fee got reflected
	And Enter the Student details
	And Enter the sibling details to verify PerFamily Fee Type
	And Enter the Family member Info and other details to verify PerFamily Fee Type 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Younger OneTime Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Younger OneTime Fee got reflected
	When headteacher should navigate to feeinfo page to verify Younger OneTime Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Younger OneTime Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Younger OneTime Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Younger OneTime Fee got reflected in fee page
	And Verify the newly added Younger with OneTime fee frequency get reflected in fee page before student active

@Elder	
@YoungerOneTimeFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window

#-------------------------------------------Is Elder-Monthly----------------------------#

@Elder
@AddNewIsElderMonthlyFeeType
Scenario: To verify Add new IsElder Fee Type with Monthly Frequency
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name for Elder Fee type to verify Monthly Frequency
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Elder Fee Type to verify Monthly Frequency get reflected in Fee Type Dropdown
@Elder
@AddNewIsElderMonthlyFeeType
@logout
Scenario: Log out the user
And log out
And close window
@Elder
@ElderMonthlyFeeAssignment
Scenario: To verify Elder Fee Type with Monthly Fee Frequency Assignment Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select newly added fee from the FeeType dropdown to verify Elder Monthly fee test
	And Select Academic Year for Elder Monthly Fee Type
	And Select Center for Elder Monthly Fee Type
	And Select School For Elder Monthly Fee Type
	And Select Class For Elder Monthly Fee Type
	And Select Is Elder Check Box
	And Enter the amount for Elder to verify Monthly fee
	And Enter the amount for Younger to verify Monthly fee
	And Select Fee Frequency as Monthly
	And Click save
	And Verify the added Elder Monthly fee type is assigned to the respective center and class
@Elder
@ElderMonthlyFeeAssignment
@logout
Scenario: Log out the user
And log out
And close window
@Elder
@ElderMonthlyFeeRecruitment
Scenario: To verify newly added Elder Amount with Monthly fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Elder Monthly Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Elder Monthly Fee got reflected
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Elder Monthly Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Elder Monthly Fee got reflected
	When headteacher should navigate to feeinfo page to verify Elder Monthly Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Elder Monthly Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Elder Monthly Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Elder Monthly Fee got reflected in fee page
	And Verify the newly added Elder with Monthly fee frequency not get reflected in fee page before student active
	When Click on the student AdmissionFee Deposit icon 
    When Click on save button to do the AdmissionFeeDeposit 
	And log out
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on update photo schedule from my functions 
	When enter the student name to update the photo schedule and click camera icon to verify Elder Monthly fee for Prerequiste
	When enter the date and save
	And log out
	And close window
	And initiate web browser
	And Enter username as "laceymontour@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click the student CMF photo scheduled today
	When enter the student name to upload photo and click on the view profile icon to verify Elder Monthly fee for Prerequiste
	When click on upload CMF photo 
	When Click on the choose file and upload button
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 
	And Enter the Student name to verify Elder Monthly Fee got reflected in fee page
	And Verify the new added Elder Monthly fee frequency get reflected in fee page after student active

@Elder
@ElderMonthlyFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window
@Elder
@YoungerMonthlyFeeRecruitment
Scenario: To verify newly added Younger Amount with Monthly fee frequency got reflected in recruitment form Functionality
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify Younger Monthly Fee got reflected
	When Enter the student dob
	And Enter the student Gender to verify Younger Monthly Fee got reflected
	And Enter the Student details
	And Enter the sibling details to verify PerFamily Fee Type
	And Enter the Family member Info and other details to verify PerFamily Fee Type 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Younger Monthly Fee got reflected
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify Younger Monthly Fee got reflected
	When headteacher should navigate to feeinfo page to verify Younger Monthly Fee got reflected
	And log out 
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSC click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Younger Monthly Fee got reflected 
	When CSC should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "AndriaMoushon@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When CSM click on the approval link in the myalerts tab
	When headteacher enter the student name to verify Younger Monthly Fee got reflected
	When CSM should navigate to finalpage and click Approve
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 	
	And Enter the Student name to verify Younger Monthly Fee got reflected in fee page
	And Verify the newly added Younger with Monthly fee frequency not get reflected in fee page before student active
	When Click on the student AdmissionFee Deposit icon 
    When Click on save button to do the AdmissionFeeDeposit 
	And log out
	And close window
	And initiate web browser
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click on update photo schedule from my functions 
	When enter the student name to update the photo schedule and click camera icon to verify Younger Monthly fee for Prerequiste
	When enter the date and save
	And log out
	And close window
	And initiate web browser
	And Enter username as "laceymontour@cmfi.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit 
	When Click the student CMF photo scheduled today
	When enter the student name to upload photo and click on the view profile icon to verify Younger Monthly fee for Prerequiste
	When click on upload CMF photo 
	When Click on the choose file and upload button
	And log out
	And close window
	And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When Select student menu and click Fee Deposit submenu 
	And Enter the Student name to verify Younger Monthly Fee got reflected in fee page
	And Verify the new added Younger Monthly fee frequency get reflected in fee page after student active

@Elder
@YoungerMonthlyFeeRecruitment
@logout
Scenario: Log out the user
And log out
And close window
#----------------------------------Delete Scenarios-------------------------------#

@Fee
@DeleteFromListPage
Scenario: To verify delete from Fee Type list page functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name to verify delete functionality
	And Select Editable 
	And Click Add Button to add New Fee
	And Verify that the New Added Fee Type for delete functionality get reflected in Fee Type Dropdown
	And Navigate to the fee type list page
	And search the fee type to delete
	And click delete button to delete the fee from FeeTypeList Page
	And Verify the Fee got deleted from the Fee List Page
@Fee   
@DeleteFromListPage
@logout
Scenario: Log out the user
And log out
And close window
@Fee
@DeleteFromFeeMasterPage
Scenario: To verify delete from Fee Master page functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name to verify Master Page Delete func
	And Select Editable 
	And Click Add Button to add New Fee
	And Select newly added fee from the FeeType dropdown to verify Master Page Delete func
	And Select Academic Year to verify Master Page Delete func
	And Select Center to verify Master Page Delete func
	And Select School to verify Master Page Delete func
	And Select Class to verify Master Page Delete func
	And Enter the amount
	And Select Fee Frequency
	And Click save
	And Filter the fee type for the respective class and center to delete 
	And select delete button
	And verify the fee got deleted for the corresponding class and center  

@Fee	
@DeleteFromFeeMasterPage
@logout
Scenario: Log out the user
And log out
And close window
#---------------------------------Edit Fee Type List Page------------------------#

@Fee
@EditFeeTypeListPage
Scenario: To verify edit Fee Master list page functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name to verify List Page Edit func
	And Select Editable 
	And Click Add Button to add New Fee
  	And Verify that the New Added Fee Type for edit functionality get reflected in Fee Type Dropdown
  	And Navigate to the fee type list page 
  	And search the fee type to edit
  	And Select edit button to edit the fee type
  	And search the edited fee type
  	And verify the edited fee tyope got reflected in the List page
@Fee 	
@EditFeeTypeListPage
@logout
Scenario: Log out the user
And log out
And close window
#------------------------------Delete all fee available for a particular center/school/class---------------------#

@Fee
@DeleteAllFeeAcrossCentre
Scenario: To verify Single Fee is present else unable to submit the recruitment form
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Select Centre name to delete all the existing fee related to the centre
    And Verify for the existing fee and delete all fee
	And log out
	And close window
	And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
   	When Select student menu and click student entry submenu
	When Enter the Student name to verify single Fee is present else unable to submit the recruitment form
	When Enter the student dob
	And Enter the student Gender to verify single Fee is present else unable to submit the recruitment form
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify single Fee is present else unable to submit the recruitment form
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify single Fee is present else unable to submit the recruitment form
	And verify Without any fee HT should not allow to submit the form

@Fee	
@DeleteAllFeeAcrossCentre
@logout
Scenario: Log out the user
And log out	 
And close window
#------------------------------Ensure added new fee type can be placed a fee master entry--------------------#

@Fee
@AddedFeeReflectedToAllCentres
Scenario: To verify added fee get reflected to all centres when All centres are selected from the dropdown
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name to add for all centres
	And Select Editable 
	And Click Add Button to add New Fee
	And Select newly added fee from the FeeType dropdown to allocate for all centres
	And Select Academic Year
	And Select Center as All
	And Select School as All
	And Select Class as All
	And Enter the amount
	And Select Fee Frequency
	And Click save
	And Verify the added fee type is assigned to the all center

@Fee
@AddedFeeReflectedToAllCentres
@logout
Scenario: Log out the user
And log out
And close window
#-----------------------------Ensure fee editable reflect in student form--------------------#
@Fee
@EditableCheck
Scenario: To verify  fee editable reflect in student form Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name to verify editable
	And Select Editable 
	And Click Add Button to add New Fee
	And Select newly added fee from the FeeType dropdown to verify editable
	And Select Academic Year
	And Select Center to verify editable
	And Select School to verify editable
	And Select Class to verify editable
	And Enter the amount
	And Select Fee Frequency
	And Click save
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify the new Fee Type got reflected and editable
	When Enter the student dob
	And Enter the student Gender to verify new fee is editable
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new fee type get reflected or not and editable
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify new fee type get reflected or not and editable
	And Verify that the New Added Fee Type get reflected in Fee Type Dropdown to verify editable
@Fee	
@EditableCheck
@logout
Scenario: Log out the user
And log out
And close window

#------------------------------Ensure fee is non-editable and reflect in student form ---------------#

@Fee
@NonEditableCheck
Scenario: To verify  fee non editable fee reflect in student form Functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Enter the Fee Type name to verify non editable
	And Click Add Button to add New Fee
	And Select newly added fee from the FeeType dropdown to verify non editable
	And Select Academic Year
	And Select Center to verify non editable
	And Select School to verify non editable
	And Select Class to verify non editable
	And Enter the amount
	And Select Fee Frequency
	And Click save
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
    When Select student menu and click student entry submenu
	When Enter the Student name to verify the new Fee Type got reflected and non editable
	When Enter the student dob
	And Enter the student Gender to verify new fee is non editable
	And Enter the Student details
	And Enter the sibling details
	And Enter the Family member Info and other details 
	And log out 
	And close window
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	When headteacher click on the approval link in the myalerts tab
	When headteacher enter the student name to verify new fee type get reflected or not and non editable
	And headteacher should navigate to schoolinfo page and save the schoolinfo to verify new fee type get reflected and non editable
	And Verify that the New Added Fee Type get reflected in Fee Type Dropdown to verify non editable

#@Fee	
#@NonEditableCheck
#@logout
#Scenario: Log out the user
#And log out

#--------------------To verify Mandatory option in the fee statutory--------------------------#

@Fee
@ToastMessage
Scenario: To verify mandatory toast message display functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select any Existing Fee type
	And Select Academic Year
	And Select Center to verify non editable
	And Select School to verify non editable
	And Select Class to verify non editable
	And Enter the amount
	And Click save
	And verify Toast fee message got dispalyed
@Fee	
@ToastMessage
@logout
Scenario: Log out the user
And log out	
And close window
#-------------------------- check box verification-----------#
@Fee
@CheckBoxValidation
Scenario: To verify Checkbox functionality
And initiate web browser
	And Enter username as "siteadmin" And click submit
    And Enter security answer as "k" And click submit
    And Enter password as "Password#123" And click submit
	When Select Student menu
	And Click Fee Master Entry submenu
	And Click AddFee Button
	And Select ISElder Check Box
	And Select IsGender Check Box
	And Select PerFamily CheckBox
	And Select OneTime CheckBox
	And Select Monthly CheckBox
	And Select Yearly CheckBox
	And Select Termly
@Fee	
@CheckBoxValidation
@logout
Scenario: Log out the user
And log out	
And close window
#-------------------------Excess fee Validation-------------#

@Fee
@ExcessFeeValidation
Scenario: To verify Excess functionality
And initiate web browser
	And Enter username as "fwamacaroline@yahoo.com" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	And Select All Students From My Report
	And Select the status as Approved
	And click search button
	And Click Student fee deposit icon
	And Click Pay amount icon To pay the fee
	And enter the Excess amout and verify not allowed
	
	
@Fee	
@ExcessFeeValidation
@logout
Scenario: Log out the user
And log out		
And close window

