Feature: To verify Gift Functionalities
@Gift
@CashGiftSuccesfulDeliverable
Scenario: To check whether the Gift is able to add
	And Enter username as "laceymontour@cmfi.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to Active Students
	And Get the CMFID of the Active Student
	And Navigate to student gift
	And Click Add Gift icon
	And Select the Gift type as Cash Gift
	And Pass the CMFID of the Active Student
	And Select Gift from the dropdown
	And Enter the Donor name
	And Enter the Comments for gift
	And Click save to save the gift 
	And log out
	And Enter username as "joice.asuluda@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to student gift
	And Search Child
	And Choose Action CheckBox
	And Click Mark As Processing Button
	And Click Ok for the popup
	And Choose the Status dropdown to Order Processing
	And Verify the latest gift which we processed recently
	And Choose Action CheckBox
	And Click Mark as Ready for pickup button
	And Click Ok for the popup
	And Choose the Status dropdown to Order Ready for Pickup
	And Search Child
	And Choose Action CheckBox
	And click Mark as picked up
	And Click Ok for the popup
	And Verify Store admin receives an alert says xx order as picked up today which is non clickable 
	And log out
	And Enter username as "laceymontour@cmfi.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to student gift
	And Search Child
	And Choose Action CheckBox
	And Click checkout icon
	And Click Ok for the popup
	And Choose the status dropdown to Checked out 
	And Search Child
	And Choose Action CheckBox
	And click download excel 
#	And Search Child
#	And Choose Action CheckBox
#	And click download barcode pdf 
	And Search Child
	And Choose Action CheckBox
	And click Mark as delivered
	And UploadImage
	And Choose status dropdown as delivered 
	And Verify the latest gift which we processed recently
	And Choose Action CheckBox
	And Select Mark Gift as Complete
	And Click Ok for the popup
	And Choose status dropdown as Completed
	And Verify the latest gift which we processed recently	
@Gift
@CashGiftSuccesfulDeliverable
Scenario: Log out the user
	And log out	

@Gift	
@CashGiftUndeliverable
Scenario: To check Gift Processing functionality when student is not available
	And Enter username as "laceymontour@cmfi.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to Active Students
	And Get the CMFID of the Active Student1
	And Navigate to student gift
	And Click Add Gift icon
	And Select the Gift type as Cash Gift
	And Pass the CMFID of the Active Student1
	And Select Gift from the dropdown
	And Enter the Donor name
	And Enter the Comments for gift
	And Click save to save the gift
	And log out 
	And Enter username as "joice.asuluda@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to student gift
	And Search Child1
	And Choose Action CheckBox
	And Click Mark As Processing Button
	And Click Ok for the popup
	And Choose the Status dropdown to Order Processing
	And Verify the latest gift which we processed recently1
	And Choose Action CheckBox
	And Click Mark as Ready for pickup button
	And Click Ok for the popup
	And Choose the Status dropdown to Order Ready for Pickup
	And Search Child1
	And Choose Action CheckBox
	And click Mark as picked up
	And Click Ok for the popup
	And Verify Store admin receives an alert says xx order as picked up today which is non clickable 
	And log out
	And Enter username as "laceymontour@cmfi.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to student gift
	And Search Child1
	And Choose Action CheckBox
	And Click checkout icon
	And Click Ok for the popup
	And Choose the status dropdown to Checked out
	And Search Child1
	And Choose Action CheckBox
	And Click Undelivered
	And Select the Reason
	And Give the comments
	And Save Undelivered
	And Choose Undelivered from the status dropdown
	And Verify the latest gift which we processed recently1
	And Click Comments Icon

@Gift	
@CashGiftUndeliverable
Scenario: Log out the user
	And log out	

@Gift	
@GiftByMailSuccessfulDelivered
Scenario: To verify Gift By Mail successful delivered Functionality
	And Enter username as "laceymontour@cmfi.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to Active Students
	And Get the CMFID of the Active Student2
	And Navigate to student gift
	And Click Add Gift icon
	And Select the Gift type as Gift by mail
	And Verify the Gift status dropdown defaulted to pickedup
	And Pass the CMFID of the Active Student2
	And Enter the Gift description
	And Enter the Donor name
	And Enter the Comments for gift
	And Click save to save the gift
	And Search Child2
	And Choose Action CheckBox
	And Click checkout icon
	And Click Ok for the popup
	And Choose the status dropdown to Checked out 
	And Search Child2
	And Choose Action CheckBox
	And click Mark as delivered
	And UploadImage
	And Choose status dropdown as delivered 
	And Verify the latest gift which we processed recently2
	And Choose Action CheckBox
	And Select Mark Gift as Complete
	And Click Ok for the popup
	And Choose status dropdown as Completed
	And Verify the latest gift which we processed recently2

@Gift	
@GiftByMailSuccessfulDelivered
Scenario: Log out the user
	And log out	
	
@Gift
@GiftByMailUnDelivered
Scenario: To verify Gift By Mail undeliverd Functionality
	And Enter username as "laceymontour@cmfi.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to Active Students
	And Get the CMFID of the Active Student3
	And Navigate to student gift
	And Click Add Gift icon
	And Select the Gift type as Gift by mail
	And Verify the Gift status dropdown defaulted to pickedup
	And Pass the CMFID of the Active Student3
	And Enter the Gift description
	And Enter the Donor name
	And Enter the Comments for gift
	And Click save to save the gift
	And Search Child3
	And Choose Action CheckBox
	And Click checkout icon
	And Click Ok for the popup
	And Choose the status dropdown to Checked out 
	And Search Child3
	And Choose Action CheckBox
	And Click Undelivered
	And Select the Reason
	And Give the comments
	And Save Undelivered
	And Choose Undelivered from the status dropdown
	And Verify the latest gift which we processed recently3
	And Click Comments Icon

@Gift	
@GiftByMailUnDelivered
Scenario: Log out the user
	And log out	

@Gift	
@GiftByMailBulkUploadSuccesfulDelivered
Scenario: To verify Gift By Mail Bulk Upload Functionality
	And Enter username as "laceymontour@cmfi.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to student gift
	And Click Add Gift icon
	And Select the Toggle button
	And Click Download Button
	And Enter the valid data and upload the file
	And Verify the status dropdown is in picked up state
	And Choose Action CheckBox
	And Get the CMF of the student
	And Click checkout icon
	And Click Ok for the popup
	And Choose the status dropdown to Checked out
	And Pass the Student CMF ID
	And Choose Action CheckBox
	And click Mark as delivered
	And UploadImage
	And Choose status dropdown as delivered 
	And Pass the Student CMF ID
	And Choose Action CheckBox
	And Select Mark Gift as Complete
	And Click Ok for the popup
	And Choose status dropdown as Completed
	And Pass the Student CMF ID
@Gift	
@GiftByMailBulkUploadSuccesfulDelivered	
Scenario: Log out the user
	And log out	
		
@Gift	
@GiftByMailBulkUploadUnDelivered
Scenario: To verify Gift By Mail Bulk Upload undelivered Functionality
	And Enter username as "laceymontour@cmfi.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to student gift
	And Click Add Gift icon
	And Select the Toggle button
	And Click Download Button
	And Enter the valid data and upload the file
	And Verify the status dropdown is in picked up state
	And Choose Action CheckBox
	And Get the CMF of the student
	And Click checkout icon
	And Click Ok for the popup
	And Choose the status dropdown to Checked out
	And Pass the Student CMF ID
	And Choose Action CheckBox
	And Click Undelivered
	And Select the Reason
	And Give the comments
	And Save Undelivered
	And Choose Undelivered from the status dropdown
	And Pass the Student CMF ID
	And Click Comments Icon
@Gift
@GiftByMailBulkUploadUnDelivered
Scenario: Log out the user
	And log out	

@Gift	
@SwapGift
Scenario: To check whether the Gift is able to Swap
	And Enter username as "laceymontour@cmfi.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to Active Students
	And Get the CMFID of the Active Student4
	And Navigate to student gift
	And Click Add Gift icon
	And Select the Gift type as Cash Gift
	And Pass the CMFID of the Active Student4
	And Select Gift from the dropdown
	And Enter the Donor name
	And Enter the Comments for gift
	And Click save to save the gift 
	And log out
	And Enter username as "joice.asuluda@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to student gift
	And Search Child4
	And Choose Action CheckBox
	And Click Mark As Processing Button
	And Click Ok for the popup
	And Choose the Status dropdown to Order Processing
	And Verify the latest gift which we processed recently4
	And Choose Action CheckBox
	And Click Mark as Ready for pickup button
	And Click Ok for the popup
	And Choose the Status dropdown to Order Ready for Pickup
	And Search Child4
	And Choose Action CheckBox
	And click Mark as picked up
	And Click Ok for the popup
	And Verify Store admin receives an alert says xx order as picked up today which is non clickable 
	And log out
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to student gift
	And Search Child4
	And Click the Swap icon
	And Choose the Gift Action Box
	And Enter the Comments for Gift Swap
	And Save the Swaped Gift
	And Search Child4
	And verify the gift got swaped
	
@Gift	
@SwapGift
Scenario: Log out the user
	And log out	

@Gift	
@HoldGift
Scenario: To check whether the Gift is able to Hold
	And Enter username as "laceymontour@cmfi.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to Active Students
	And Get the CMFID of the Active Student
	And Navigate to student gift
	And Click Add Gift icon
	And Select the Gift type as Cash Gift
	And Pass the CMFID of the Active Student
	And Select Gift from the dropdown
	And Enter the Donor name
	And Enter the Comments for gift
	And Click save to save the gift 
	And log out
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to student gift
	And Choose the Status dropdown to Order Received
	And Choose Action CheckBox
	And Get the CMF of the student
	And Click Hold Student icon
	And Enter the Comments for Gift Hold
	And Save the Holded Gift
	And Choose the Status dropdown to Gift Hold
	And Pass the Student CMF ID
	
@Gift
@HoldGift
Scenario: Log out the user
	And log out	
	
	
@Gift	
@TransferGift
Scenario: To check whether the Gift is able to Transfer
	And Enter username as "laceymontour@cmfi.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to Active Students
	And Get the CMFID of the Active Student
	And Navigate to student gift
	And Click Add Gift icon
	And Select the Gift type as Cash Gift
	And Pass the CMFID of the Active Student
	And Select Gift from the dropdown
	And Enter the Donor name
	And Enter the Comments for gift
	And Click save to save the gift 
	And log out
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	And Navigate to student gift
	And Choose the Status dropdown to Order Received
	And Choose Action CheckBox
	And Get the CMF of the student
	And Click Hold Student icon
	And Enter the Comments for Gift Hold
	And Save the Holded Gift
	And Choose the Status dropdown to Gift Hold	
	And Pass the Student CMF ID
	And Choose Action CheckBox
	And Click Transfer Child Gift Icon
	And Select Child to transfer the gift
	And Enter the comments for transfer gift
	And Save the Transfer gift
	And Choose the status dropdown to Checked out
	And Pass the TransferToChild CMF ID
	
@Gift	 
@TransferGift
Scenario: Log out the user
	And log out		

@Gift	
@GiftHistory
Scenario: To check whether the Gift History is able to view
	And Enter username as "lynn.maringa@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit		
	And Navigate to student report
	And Click Go Button
	And Select Gift icon
	And verify the Gift History is visible
	
@Gift
@GiftHistory
Scenario: Log out the user
	And log out	