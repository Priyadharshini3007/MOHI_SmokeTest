Feature: To verify the Leave Page Functionalities
@Holidays
Scenario Outline: To verify the holidays 
And initiate web browser 
   And Enter username as "peter.muroncia@mohiafrica.org" And click submit 
  And Enter security answer as "k" And click submit 
  And Enter password as "Password#123" And click submit
  When Select Leave menu
  And click Holidays sub menu
  When select the addnewicon
  Then enter the holiday name "<holidayname>"
  And select the from date "<Fromdate>"
  Then select the to date "<Todate>"
  And click repeat checkbox
  Then save the Holiday
  And log out
  And close window 

Examples:
|holidayname|Fromdate|Todate|
|TestHoliday|12/02/2018|10/02/2019|