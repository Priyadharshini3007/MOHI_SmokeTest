Feature: To verify the fast Page Functionalities

@fast
@AssessmentGeneration
Scenario: To check whether the Assessment generation is able to submit
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select FAST menu
	And click Assessment Generation sub menu
	Then Search the student by name or CMF ID
	When Select the visit date
	And enter the family visit information
	Then select family status
	And fill the findings and recommendations
	Then select the actual assessment date
	And select the family together values
	Then submit the assessment values
	And add the action plan
	And click on the View Assessment form Details icon
	And verify the print page
	And log out
	And close window 
	And initiate web browser
	And Enter username as "josk.ht@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select FAST menu
  	And click Assessment Analysis Report sub menu
 	Then search the assessment code
  	And add the assessment comment
  	And verify the completed status
  	
@fast
@Assessmentreport
Scenario: Log out the user
	And log out
	And close window 

@fast
@Assessmentreport
  Scenario: To verify the Assessment report
  And initiate web browser
 	 And Enter username as "josk.ht@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select FAST menu
	And click Assessment Report sub menu
	Then search the assessment code
	And click on the View Assessment form Details icon
	And verify the print page
@fast
@Assessmentreport
Scenario: Log out the user
	And log out
	And close window 
  
@fast   
@Assessmentschedulereport
Scenario: To Check whether the Assessment schedule report is getting generated
And initiate web browser
	And Enter username as "josk.sw1@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select FAST menu
	And click Assessment Schedules Report sub menu
	And click on generate assessment icon
 	When Select the visit date
	And enter the family visit information
	Then select family status
	And fill the findings and recommendations
	Then select the actual assessment date
	And select the family together values
	Then submit the assessment values
	And add the action plan
@fast
@Assessmentschedulereport
Scenario: Log out the user
	And log out
	And close window 
	
@fast
  @Assessmentanalysisreport
  Scenario: To verify the assessment analysis report
  And initiate web browser
  	And Enter username as "josk.ht@mohiafrica.org" And click submit
	And Enter security answer as "k" And click submit
	And Enter password as "Password#123" And click submit
	When Select FAST menu
	And click Assessment Analysis Report sub menu
	Then select the from date
	And pick the to date
 	Then search the assessment code
	And add the assessment comment
	And verify the completed status
	Then select metric category and metric criteria
	And select the score
	Then click on go button
	And click the toggle button
	Then verify the filtered category values
  
@fast
  @Assessmentchartsendemail
  Scenario: To verify the assessment chart
	When Select FAST menu
	And click Assessment Chart sub menu
	Then select the Assessment from date
	And select the assessment to date
	Then click on the go button
	And proceed to send email
	Then enter the email fields
	And click on sendemail button
 
@fast
@Assessmentchartexportexcel
  Scenario: To verify the assessment chart
	When Select FAST menu
	And click Assessment Chart sub menu
	Then select the Assessment from date
	And select the assessment to date
	Then click on the go button
	And click the export to excel button
	And verify the downloaded excel for Assesment chart

@fast
@Fastactivityreport
 Scenario Outline: To verify the fast activity report
	When Select FAST menu
	And click Fast Activity Report sub menu
	Then select the centre "<centre>" and social worker "<Socialworker>"
	And choose the from date and to date
	Then submit the View report
	And click the export to excel button for fast activity report
	And verify the downloaded excel for fast activity report
  Examples:
  |centre	|Socialworker	|
  |JOSKA	|All			|
  
@fast
Scenario: Log out the user
	And log out
	And close window 