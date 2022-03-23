package com.automation.steps;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.By;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.utils.excelutil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class NotificationEntrySteps extends BaseClass{
	
	@When("^Click Notification Entry submenu$")
	public void click_Notification_Entry_submenu() throws Throwable {
		helper();
	 notificationEntry.NotificationEntrySubmenu();
	}

	@When("^Click Add Notification button$")
	public void click_Add_Notification_button() throws Throwable {
		notificationEntry.AddNotification();
	}

	@When("^Enter Notification Title$")
	public void enter_Notification_Title() throws Throwable {
		
		notificationEntry.NotificationTitlefn();
	}

	@When("^Enter Notification Description$")
	public void enter_Notification_Description() throws Throwable {
		notificationEntry.NotificationDescriptionfn();
	}

	@When("^Click ChooseFile for any attachment$")
	public void click_ChooseFile_for_any_attachment() throws Throwable {
		notificationEntry.Upload();
	}

	@When("^Select the Roles to display the notification$")
	public void select_the_Roles_to_display_the_notification() throws Throwable {
	    notificationEntry.selectRolefn();
	}

	@When("^Select Is enable checkbox$")
	public void select_Is_enable_checkbox() throws Throwable {
		notificationEntry.isEnablefn();
	}

	@When("^Select Is Mandatory checkbox$")
	public void select_Is_Mandatory_checkbox() throws Throwable {
		notificationEntry.isMandatoryfn();
	}

	@When("^Click Save$")
	public void click_Save() throws Throwable {
		notificationEntry.saveFn();
		Spa.logOutFn();
	}
	
	@And("^Verify the added Notification title got displayed to the corresponding role$")
	public void verify_the_added_Notification_title_got_displayed_to_the_corresponding_role() throws Throwable {
		helper();
		LoginPage lg = new LoginPage();
		String[] role = excelutil.getData(39, 1, 2).split(",");
		String[] roleUserName = excelutil.getData(39, 1, 6).split(",");
		for (int i = 0; i < role.length; i++) {

			lg.excelusername(roleUserName[i]);
			lg.submit();
			lg.secquestion();
			lg.submit();
			lg.password();
			lg.submit();
			notificationEntry.TestNotification();
			notificationEntry.LogoutNotification();
	}
	}
	

	

//Edit Notification
	
	@Given("^Select Edit Notification icon$")
	public void select_Edit_Notification_icon() throws Throwable {
		helper();
		notificationEntry.editNotification();
	}

	@Given("^Edit Notification Title$")
	public void edit_Notification_Title() throws Throwable {
	    notificationEntry.editNotificationTitlefn();
	}

	@Given("^Edit Notification Description$")
	public void edit_Notification_Description() throws Throwable {
		notificationEntry.EditNotificationDescriptionfn();
	}

	@Given("^Click delete to remove the attachment$")
	public void click_delete_to_remove_the_attachment() throws Throwable {
		notificationEntry.DeleteAttachmentFn();
	}

	@Given("^Edit the Roles to display the notification$")
	public void edit_the_Roles_to_display_the_notification() throws Throwable {
		notificationEntry.editSelectRolefn();
	}

	@Given("^Edit Is enable checkbox$")
	public void edit_Is_enable_checkbox() throws Throwable {
		notificationEntry.editIsEnablefn();
	}

	@Given("^Edit Is Mandatory checkbox$")
	public void edit_Is_Mandatory_checkbox() throws Throwable {
		notificationEntry.editIsMandatoryfn();
	}
	
	@And("^Verify the Edited Notification title got displayed to the corresponding role$")
	public void verify_the_Edited_Notification_title_got_displayed_to_the_corresponding_role() throws Throwable {
		helper();
		LoginPage lg = new LoginPage();
		String[] role = excelutil.getData(39, 4, 2).split(",");
		String[] roleUserName = excelutil.getData(39, 4, 6).split(",");
		for (int i = 0; i < role.length; i++) {

			lg.excelusername(roleUserName[i]);
			lg.submit();
			lg.secquestion();
			lg.submit();
			lg.password();
			lg.submit();
			notificationEntry.editTestNotification();
			notificationEntry.editLogoutNotification();
	}
	}


}
