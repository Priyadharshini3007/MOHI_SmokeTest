package com.automation.steps;

import com.automation.pages.BaseClass;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClass {
	//LoginPage loginpage=new LoginPage();
	

    @Given("^Navigate to sign-in page$")
    public void verifyuserisonHomepageofapplication() throws Exception{
    	helper();
    	loginpage.verifysigninpage();

}
    @Given("^user is on login page$")
    public void userloginpage(){
    	helper();
    	loginpage.verifysigninpage();
    	
    }
    @And("^Enter the Username \"([^\"]*)\"$")
    public void enterusernme(String UserName){
    	helper();
    	loginpage.enterusername(UserName);
    }
    @Then("^Enter the SecurityKey \"([^\"]*)\"$")
    public void entersecuritykey(String SecurityKey){
    	helper();
    	loginpage.entersecuritykey(SecurityKey);
    }
    @And("^Enter the Password \"([^\"]*)\"$")
    public void enterpassword(String Password){
    	helper();
    	loginpage.enterpassword(Password);
    }
    @Given("^Enter the login credentials for siteadmin$")
    public void username() throws Exception{
    	loginpage.EnterUserNameandpassword();
    }
    
    @When("^Enter username as \"(.*?)\" And click submit$")
	public void enter_username_And_click_submit(String usrname) throws Throwable {
		helper();
		Thread.sleep(1000);
		loginpage.setUsername(usrname);
		loginpage.submit();
		Thread.sleep(2000);
	}
	
	@When("^Enter security answer as \"(.*?)\" And click submit$")
	public void enter_security_answer_as_And_click_submit(String securityAns) throws Throwable {
		Thread.sleep(1000);
		loginpage.setSecurityQn(securityAns);
		loginpage.submit();
		Thread.sleep(2000);
	}

	@When("^Enter password as \"(.*?)\" And click submit$")
	public void enter_password_as_And_click_submit(String pswd) throws Throwable {
		Thread.sleep(1000);
		loginpage.setPassword(pswd);
		loginpage.submit();
		Thread.sleep(2000);
	}
	
	@Given("^Enter username \"([^\"]*)\" And click submit$")
	public void Enter_username_And_click_submit(String uname) throws Throwable {
		    
		helper();
		Thread.sleep(1000);
		loginpage.excelusername(uname);
		loginpage.excelsubmit();
		Thread.sleep(2000);
	}

	@Given("^Enter security answer And click submit$")
	public void Enter_security_answer_And_click_submit() throws Throwable {
		loginpage.excelsecquestion();
		loginpage.excelsubmit();
		Thread.sleep(2000);
	}

	@Given("^Enter password And click submit$")
	public void enter_password_And_click_submit() throws Throwable {
		Thread.sleep(1000);
		loginpage.excelpassword();
		loginpage.excelsubmit();
		Thread.sleep(2000);
	}
}