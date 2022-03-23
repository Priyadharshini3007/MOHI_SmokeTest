Feature: This is the student entry feature 
@studententry
Scenario: This is student entry scenario
And Enter username as "josk.sw1@mohiafrica.org" And click submit
And Enter security answer as "k" And click submit
And Enter password as "Password#123" And click submit
When Select student menu and click student entry submenu
When Enter the Student name 
When Enter the student dob
And Enter the student Gender
And Enter the Student details
And Enter the sibling details
And Enter the Family member Info and other details
And log out 

@studententry
@HeadteacherApproval
Scenario: This is Headteacher Approval scenario

And Enter username as "josk.ht@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When headteacher click on the approval link in the myalerts tab
When headteacher enter the student name and click on approval icon
When headteacher should navigate to schoolinfo page and save the schoolinfo
When headteacher should navigate to feeinfo page and save the feeinfo
When headteacher should navigate to finalpage and click Approve
And log out

@studententry
@CSCApproval
Scenario: This is CSC Approval scenario

And Enter username as "lynn.maringa@mohiafrica.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSC click on the approval link in the myalerts tab
When CSC enter the student name and click on approval icon
When CSC should navigate to finalpage and click Approve
And log out


@studententry
@CSMApproval
Scenario: This is CSM Approval scenario

And Enter username as "AndriaMoushon@cmfi.org" And click submit 
And Enter security answer as "k" And click submit 
And Enter password as "Password#123" And click submit
When CSM click on the approval link in the myalerts tab
When CSM enter the student name and click on approval icon
When CSM should navigate to finalpage and click Approve

@studententry
@logout
Scenario: Log out the user
And log out 