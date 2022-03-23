Feature: To Verify the payroll module Functionalities 

@payroll
@createpayrollstructure
Scenario: Creating payroll structure entry
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then Select payroll Structure entry option
	And Create new paystructure
	Then enter the fields
	And select the variable types
	Then select the payslip display section
	And verify the user intimation after saving payroll entry

@payroll
@createpayrollstructure
Scenario: Logout
	And log out

@payroll
@updatepayrollstructure
Scenario: Updating payroll structure entry
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then Select payroll Structure entry option
	And search by paystructure code
	And click on editicon
	And update the Paystructure name as "Testps1" and display order as "5" save
	And search by paystructure name as "Testps1" and clear the data

@payroll
@updatepayrollstructure
Scenario: Logout
	And log out

@payroll
@Manualpayroll
Scenario: To verify the manual payroll process
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select Manual Payroll option
	And select the payroll as "Hold Payroll Process"
	And select the year in manualroll as "2022"
	And select the month as "January"
	And select the values and search as "Jenifa Akumu Ahenda"
#	Then select the organisation name
	And submit the payroll
	Then verify the success message

@payroll
@Manualpayroll
Scenario: Logout
And log out

@payroll
@paystructureupload   
Scenario Outline: To verify the paystructure upload process
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header   
	Then select the paystructure upload link
	And download the template
	Then verify the template "<downloadfile>"
	And choose the file
	Then click on upload

Examples:
|filename|downloadfile|
|Testuploaddocument|PayStructureUploadTemplate.xlsx|

@payroll
@paystructureupload 
Scenario: Logout
	And log out

@payroll
@generatep9aform
Scenario Outline: To verify the p9a form is generated
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the p9aform link
	And select the year "<year>"
	Then fill the staff details "<staffstartnum>" and "<staffnumto>"
	Then generate the p9a form
	And close the p9a form
	And send the email
 
Examples:
 |year|staffstartnum|staffnumto|
 |2020|MOH0018/2007|MOH0118/2008|  
 
@payroll
@generatep9aform
Scenario: Logout
	And log out
 
@payroll
@Bankentry-create
Scenario: To verify the create Bank Entry 
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the bankentry option
	And click the add new bank option
	Then enter all the details for adding new bank

@payroll
@Bankentry-create
Scenario: Logout
	And log out
 
@payroll
@Bankentry-update
Scenario Outline: To verify the update Bank Entry 
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the bankentry option
	Then search the bankname
	And Update required fields "<bankcode>"and"<Address>"and"<phone>" and "<email>"
	Then verify the clearfilter 

Examples:
|bankname|bankcode|Address|phone|email|
|test-bn|Test12346|testaddress|95874125632|test@gmail.com|

@payroll
@Bankentry-update
Scenario: Logout
	And log out
  
@payroll
@payslip-Addchequenum
 Scenario Outline: To add the cheque number for payslips
 	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the payslip link
	When search with payslip
	And select the checkbox for adding cheque no
	Then Enter the chequenumber "<chequenumber>"
	And save the chequenumber
    
Examples:    
  |chequenumber|payslipnum|
  |Test45125 |PS/MOH0100/2007/52021|
  
@payroll
@payslip-Addchequenum
Scenario: Logout
And log out

@payroll
@payslip-Printandemail
Scenario: To verify the print/email option for the selected payslips
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the payslip link
	And select the payslips 
	Then click on Print button to print the selected payslips
	Then Close the print page
	Then click on send email button and verify the email is sent

@payroll
@payslip-Printandemail
Scenario: Logout
	And log out

@payroll
@payslip-Filterandsort
Scenario Outline: To verify the search,clear and sorting functionality
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header 
	Then select the payslip link
	And enter the staffnum "<staffnumber>" and search
	Then verify the clear filter button 
	Then click on payslip number column to check the sorting functionality
	And verify the employeename column to check the sorting

 Examples:
   |staffnumber|
   |STMOH2569/2021|
   
@payroll
@payslip-Filterandsort
Scenario: Logout
And log out

@payroll 
@employeeloanreport-individualloan-true
Scenario Outline: To verify the employee loan report with individualloan-true
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the employee loan report link
	And select the loan component "<loan>"
	When choose the staffrom "<Stafffrom>" and staffto "<Staffto>"
	And select the emploancentre "<Centre>" and designation "<Designation>"
	When click on view report
	Then export the emploan excel report "<downloadfile>"
    
Examples:
 |loan| Stafffrom|Staffto|Centre|Designation|downloadfile|
 |BANK LOAN|MOH0018/2007|MOH0075/2007|All|All|Payroll_LoanSavings.xlsx|
 
@payroll
@employeeloanreport-individualloan-true
Scenario: Logout
	And log out
 
@payroll
@employeeloanreport-individualloan-false
 Scenario Outline: To verify the employee loan report with individualloan-false
 	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the employee loan report link
	And select the loan summary
	When choose the staffrom "<Stafffrom>" and staffto "<Staffto>"
	And select the emploancentre "<Centre>" and designation "<Designation>"
	When click on view report
	And download excel report
 
  Examples:
 |Stafffrom|Staffto|Centre|Designation|
 |MOH0018/2007|MOH0075/2007|All|All|
 
@payroll
@employeeloanreport-individualloan-false
Scenario: Logout
	And log out
 
@payroll
@netandgrosspayreport-normal
Scenario Outline: To Verify the netpay and grosspay loan report
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the netpay and grosspay link
	And choose the reqruitment type "<requirmenttype>"
	Then fill the year and month "<month>"
	And enter the Staff numbers from "<Stafffrom>" and "<staffto>"
	And select the netgrosspaycentre "<Centre>" and designation "<Designation>"
	When click on view report
	Then export the netgross excel report "<downloadfile>"
    
Examples:
  |requirmenttype|month|Stafffrom|staffto|Centre|Designation|downloadfile|
  |Short Term|January|MOH0018/2007|MOH0075/2007|All|All|NetAndGrossPay.xlsx|
  
@payroll
@netandgrosspayreport-normal
Scenario: Logout
	And log out
  
@payroll
@netandgrosspay-comparitive
 Scenario Outline: To Verify the netpay and grosspay loan report using comparitive
 	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the netpay and grosspay link
	When click on the report type  
	And choose the reqruitment type "<requirmenttype>"
	Then select the year and month 
	And enter the Staff numbers from "<Stafffrom>" and "<staffto>"
	And select the netgrosspaycentre "<Centre>" and designation "<Designation>"
	When click on view report
	And download excel report
    
Examples:
  |requirmenttype|month|Stafffrom|staffto|Centre|Designation|
  |Long Term|January|MOH0018/2007|MOH0075/2007|All|All|   
  
@payroll
@netandgrosspay-comparitive
Scenario: Logout
	And log out
  
@payroll
@staffagegroupreport
Scenario Outline: TO verify the staff age group report
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then click on the staff age group report link
	And select the centre "<Centre>" and designation "<Designation>"
	Then choose the date 
	When click on view report
	Then export the staffage excel report "<downloadfile>"
     
Examples:
  |Centre|Designation|downloadfile|
  |JOSKA|Head Teacher|StaffAge.xlsx|
  
@payroll
@staffagegroupreport
Scenario: Logout
	And log out
  
@payroll
@Staffcountreport-normal
Scenario Outline: To verify the staffcountreport
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then click on the staff count report link
	And select the filter type "<filtertype>"
	When choose the year "<year>" and month "<month>"
	And select staftcount center "<center>" and designation"<designation>"  
	When click on view report
	Then export the staffcount excel report "<downloadfile>"

Examples:
  |filtertype|year|month|center|designation|downloadfile|
  |Long Term|2019|All|All|All|StaffCount.xlsx|
  
@payroll
@Staffcountreport-normal
 Scenario: Logout
	And log out
  
@payroll
@Staffcountreport-comparitive
Scenario Outline: To verify the staffcount report with comparitive
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then click on the staff count report link
	When choose the report type
	And select the filter type "<filtertype>"
	When choose the year and month
	And select staftcount center "<center>" and designation"<designation>"
	When click on view report
	And download excel report
     
Examples:
|filtertype|center|designation|
|Long Term|All|All|

@payroll
@Staffcountreport-comparitive
Scenario: Logout
	And log out
  
@payroll
@Summaryreportbydesignation
 Scenario Outline: TO verify the summaryreport by designation
 	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	 Given Navigate to payroll header
	 When click on summary report by designation link
	 Then select the year "<year>" and month "<month>"
	 And choose the centre "<centre>" and designation "<designation>"
	 When enter the Staff "<stafffrom>" and staff to "<staffto>"
	 Then select the recruitment type "<recruitmenttype>"
	 When click on view report
	 Then export the designation excel report "<downloadfile>"
 
Examples:
  |year|month|centre|designation|stafffrom|staffto|recruitmenttype|downloadfile|
  |2019|March |JOSKA|ECDE Teacher|MOH0018/2007|MOH0075/2007|Long Term|PayrollSummarybyDesignation.xlsx|
  
@payroll
@Summaryreportbydesignation
Scenario: Logout
	And log out
  
@payroll
@summaryreport-payrollsummary-normal
Scenario Outline: To verify the summary report is getting generated
 	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the summary report link
	And select the summary type "<summarytype>"
	Then select the year "<year>" and "<month>"
	When Fill the staffrom "<Stafffrom>" and "<Staffto>"
	Then select payrollcenter"<center>"and designation "<designation>"
	Then choose the recruitmenttype "<recruitmenttype>"
	And click on view report
	Then export the payrollsummary excel report "<downloadfile>"

Examples:
|summarytype|year|month| Stafffrom|Staffto|recruitmenttype|center|designation|downloadfile|
|Payroll Summary|2020|All| MOH0018/2007 |MOH0075/2007|All|All|All|PayrollSummaryReport.xlsx|

@payroll
@summaryreport-payrollsummary-normal
Scenario: Logout
And log out

@payroll
@summaryreport-payrollsummary-comparitive
  Scenario Outline: To verify the summary report is getting generated using comparitive type
  	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the summary report link
	And select the summary type "<summarytype>"
	When click on report type 
	Then select the month
	When Fill the staffrom "<Stafffrom>" and "<Staffto>" 
	Then select payrollcenter"<center>"and designation "<designation>"
	Then choose the recruitmenttype "<recruitmenttype>"
	And click on view report
	And download excel report

Examples:
|summarytype|Stafffrom|Staffto|recruitmenttype|center|designation|
|Payroll Summary| MOH0018/2007 |MOH0075/2007|All|All|All|

@payroll
@summaryreport-payrollsummary-comparitive
Scenario: Logout
	And log out
  
@payroll
@summaryreport-Statutoryreport
Scenario Outline: To verify the Statutory summary report
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the summary report link
	And select the summary type "<summarytype>"
	When Fill the staffrom "<Stafffrom>" and "<Staffto>"
	Then select payrollcenter"<center>"and designation "<designation>"
	Then choose the recruitmenttype "<recruitmenttype>"
	And click on view report
	And download excel report

Examples:
|summarytype|Stafffrom|Staffto|recruitmenttype|center|designation|
|Statutory Summary| MOH0018/2007 |MOH0075/2007|All|All|All|

@payroll
@summaryreport-Statutoryreport
Scenario: Logout
	And log out
  
@payroll
@summaryreport-Deductionreport
Scenario Outline: To verify the Deduction summary report
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the summary report link
	And select the summary type "<summarytype>"
	When Fill the staffrom "<Stafffrom>" and "<Staffto>"
	Then select payrollcenter"<center>"and designation "<designation>"
	Then choose the recruitmenttype "<recruitmenttype>"
	And click on view report
	And download excel report

Examples:
|summarytype| Stafffrom|Staffto|recruitmenttype|center|designation|
|Deduction Summary| MOH0018/2007 |MOH0075/2007|All|All|All|

@payroll
@summaryreport-Deductionreport
Scenario: Logout
	And log out

@payroll
@summaryreport-Statutoryanddeductions
Scenario Outline: To verify the Statutory and Deduction summary report
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the summary report link
	And select the summary type "<summarytype>"
	And select the statutory component
	When Fill the staffrom "<Stafffrom>" and "<Staffto>"
	Then select payrollcenter"<center>"and designation "<designation>"
	Then choose the recruitmenttype "<recruitmenttype>"
	And click on view report
	And download excel report
 
Examples:
|summarytype| Stafffrom|Staffto|recruitmenttype|center|designation|
|Statutory and Deductions| MOH0018/2007 |MOH0075/2007|All|All|All|

@payroll
@summaryreport-Statutoryanddeductions
Scenario: Logout
	And log out

@payroll
@summaryreport-BankTransfer
Scenario Outline: To verify the Bank summary report
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the summary report link
	And select the summary type "<summarytype>"
	And select bank "<bank>" and branch "<branch>"
	When Fill the staffrom "<Stafffrom>" and "<Staffto>"
	Then select payrollcenter"<center>"and designation "<designation>"
	Then choose the recruitmenttype "<recruitmenttype>"
	And click on view report
	And download excel report
 
Examples:
|bank|branch|summarytype|Stafffrom|Staffto|recruitmenttype|center|designation|
|BANK OF BARODA|CITY SQUARE|Bank Transfer| MOH0018/2007 |MOH0075/2007|All|All|All|

@payroll
@summaryreport-BankTransfer
Scenario: Logout
	And log out

@payroll
@BDSsummaryReport
Scenario Outline: To verify the BDS summary report
	And Enter username as "julius.mwangi@mohiafrica.org" And click submit 
	And Enter security answer as "k" And click submit 
	And Enter password as "Password#123" And click submit
	Given Navigate to payroll header
	Then select the BDS summary report link
	And select yearand month "<year>" and "<month>"
	Then enterstafffrom and staffto "<Stafffrom>" and "<Staffto>"
	And slect bds "<center>" "<designation>"and"<recruitmenttype>"
	And click on view report
	Then export the BDS excel report "<downloadfile>"

Examples:
|year|month|Stafffrom|Staffto|center|designation|recruitmenttype|downloadfile|
|2019|January|MOH0018/2007 |MOH0075/2007|All|All|All|Payroll_BDSreport.xlsx|
  
@payroll
@BDSsummaryReport
Scenario: Logout
	And log out