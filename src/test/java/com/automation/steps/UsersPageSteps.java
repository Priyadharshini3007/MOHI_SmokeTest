package com.automation.steps;
import java.io.IOException;

import com.automation.pages.BaseClass;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UsersPageSteps extends BaseClass {
	//UsersPage userspage=new UsersPage();
	
	@Given("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterfirstnameandlastname(String Firstname,String LastName){
		helper();
		userspage.enteruserdetails(Firstname,LastName);
	}
	
   @And("^Click on Adduser button$")
   public void clickonadduserbutton(){
	   helper();
   	userspage.adduser();
   }
	
	@Then("^Click on Submit button$")
	public void clicksubmitbtn() throws Exception{
		helper();
		userspage.clicksubmitbtn();
		
	}
	@Then("^Click on Edit Submit button$")
	public void clickEditsubmitbtn() throws Exception{
		helper();
		userspage.clickEditsubmitbtn();
		
	}
	
	@And("^Return to user list page$")
	public void returntouserlistpage(){
		helper();
		userspage.backtouserlist();
		
	}
	@And("^Create the social worker user$")
	public void createusers() throws Exception{
		helper();
		userspage.socialworker();		
	}
	@And("^Create the Head Teacher user$")
	public void addheadteacheruser() throws IOException{
		helper();
		userspage.headteacher();
		
	}
	@And("^Create the class Teacher user$")
	public void addclassteacheruser() throws IOException{
		helper();
		userspage.classteacher();
	}
	@And("^Create the senior Teacher user$")
	public void addseniorteacher() throws IOException{
		helper();
		userspage.seniorteacher();
	}
	@And("Create the regional education coordinator user")
	public void addregionaleducationcoordinator() throws IOException{
		helper();
		userspage.RegionalEducationCoordinator();
	}
	@And("^Create the finance manager user$")
	public void addfinancemanager() throws IOException{
		helper();
		userspage.FinanceManager();
	}
	@And("^Create the logistics account assistant user$")
	public void addlogisticsaccountassistant() throws IOException{
		helper();
		userspage.logisticsaccountassistant();
	}
	@And("^Create the child sponsorship coordinator user$")
	public void addchildsponsorship() throws IOException{
		helper();
		userspage.childsponsorhipcoordinator();
	}
	
//Edit Users
	
	@Then("^Edit the social worker user$")
	public void edit_the_social_worker_user() throws Throwable {
		helper();
		
		userspage.editicon();
		
		userspage.Editsocialworker();
		
	}
//Verify Activation Mail Received
	
	@Given("^Verify activation mail received$")
	public void verify_activation_mail_received() throws Throwable {
	  
	}
	
//Unlock the User
	
	@Then("^Filter locked users from the status DropDown$")
	public void filter_locked_users_from_the_status_DropDown() throws Throwable {
		helper();
		userspage.filterUserToUnlock();
	}

	@Then("^Click UnlockUserIcon$")
	public void click_UnlockUserIcon() throws Throwable {
	  
		helper();
		userspage.UnlockUser();
	}
	
//Users Return to List
	
	@Then("^Click Add User and click ReturnToListButton$")
	public void click_Add_User_and_click_ReturnToListButton() throws Throwable {
	   
		helper();
		userspage.addUsersReturnToList();
	}

	@Then("^Click Edit User and click ReturnToListButton$")
	public void click_Edit_User_and_click_ReturnToListButton() throws Throwable {
	   
		helper();
		userspage.editUsersReturnToList();
	}
	
//Delete Users
	

	@Then("^Click Edit icon to delete the user$")
	public void click_Edit_icon_to_delete_the_user() throws Throwable {
		helper();
		userspage.deleteUsers();
	}
	
//Duplicate Mail validation
	
	@Then("^ensure that error message get prompted for the duplicate mail$")
	public void ensure_that_error_message_get_prompted_for_the_duplicate_mail() throws Throwable {
	    
		userspage.saveWithDuplicateMail();
	}

//Default Role get Allocated once the user saved
	
	@Then("^Ensure that default role of that organization will be provided once the user is setup$")
	public void ensure_that_default_role_of_that_organization_will_be_provided_once_the_user_is_setup() throws Throwable {
		
		userspage.defaultRoleValidationForHeadTeacher();
	}
	
//Delete Default Role
	
	@Given("^Ensure that siteadmin is able to delete the default role that has been assigned$")
	public void ensure_that_siteadmin_is_able_to_delete_the_default_role_that_has_been_assigned() throws Throwable {
	
		userspage.deleteDefaultRole();
	}
//New Roles Get Added
	
	@Then("^Ensure that new role get added by Selecting a role from the role drop down$")
	public void ensure_that_new_role_get_added_by_Selecting_a_role_from_the_role_drop_down() throws Throwable {
		
		helper();
		userspage.addNewRole();
	}
	
//Change the Status of the USer
	
	@Then("^Filter the user and click search icon$")
	public void filter_the_user_and_click_search_icon() throws Throwable {
	 
		helper();
		userspage.filterUser();
	}

	@Then("^Click Edit button and change the userStatus$")
	public void click_Edit_button_and_change_the_userStatus() throws Throwable {
		
		userspage.changeStatus();
		userspage.clickEditsubmitbtn();
	 
	}
}
	
