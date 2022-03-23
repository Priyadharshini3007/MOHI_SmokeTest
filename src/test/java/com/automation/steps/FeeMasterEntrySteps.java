package com.automation.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class FeeMasterEntrySteps extends BaseClass {

	@When("^Select Student menu$")
	public void select_Student_menu() throws Throwable {
		helper();
		feeMasterEntry.Studentmenu();
	}

	@When("^Click Fee Master Entry submenu$")
	public void click_Fee_Master_Entry_submenu() throws Throwable {
		feeMasterEntry.FeeMasterEntrySubMenu();
	}
	
	@When("^Pass the student class value \"([^\"]*)\"$")
	public void Pass_the_student_class_value(String promotionType) throws Throwable {
		feeMasterEntry.getTextForTransfer(promotionType);
	}

	@When("^Click AddFee Button$")
	public void click_AddFee_Button() throws Throwable {
		
		feeMasterEntry.AddFeeButton();
	}

	@When("^Enter the Fee Type name$")
	public void enter_the_Fee_Type_name() throws Throwable {
		
		feeMasterEntry.FeeTypeName();
	}

	@When("^Select Editable$")
	public void select_Editable() throws Throwable {
		
	   feeMasterEntry.IsEditable();
	}
	
	@When("^Click Add Button to add New Fee$")
	public void click_Add_Button_to_add_New_Fee() throws Throwable {
		
	    feeMasterEntry.AddButton();
	}

	@When("^Verify that the New Added Fee Type get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Fee_Type_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		
	    feeMasterEntry.FeeType();
	}
	
	//FeeTypeAssignment
	
	@When("^Select newly added fee from the FeeType dropdown$")
	public void select_newly_added_fee_from_the_FeeType_dropdown() throws Throwable {
		
	    feeMasterEntry.FeeTypedrpdwn();
	}

	@When("^Select Academic Year$")
	public void select_Academic_Year() throws Throwable {
		helper();
		feeMasterEntry.academicYrDrpdwn();
	}

	@When("^Select Center$")
	public void select_Center() throws Throwable {
	
		feeMasterEntry.centerDrpdwn();
	}

	@When("^Select School$")
	public void select_School() throws Throwable {
		
		feeMasterEntry.schoolDrpdwn();
	}

	@When("^Select Class$")
	public void select_Class() throws Throwable {
		
		feeMasterEntry.classDrpdwn();
	}

	@When("^Enter the amount$")
	public void enter_the_amount() throws Throwable {

		feeMasterEntry.enterAmount();
	}

	@When("^Select Fee Frequency$")
	public void select_Fee_Frequency() throws Throwable {
		
		feeMasterEntry.oneTime();
	}

	@When("^Click save$")
	public void click_save() throws Throwable {
	   
		feeMasterEntry.SaveFee();
	}

	@When("^Verify the added fee type is assigned to the respective center and class$")
	public void verify_the_added_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
	
		feeMasterEntry.verifyAddedFee();
	}

//verify new fee get reflected in student recruitment form
	
	@When("^Enter the Student name to verify the new Fee Type got reflected$")
	public void enter_the_Student_name_to_verify_the_new_Fee_Type_got_reflected() throws Throwable {
		helper();
		se.studentNameNewFeeType();
	}

	@And("^Enter the student Gender to verify new fee$")
	public void enter_the_student_Gender_to_verify_new_fee() throws Throwable {
		helper();
		se.genderforNewOneTimeFee();
	}
	@When("^headteacher enter the student name to verify new fee type get reflected or not$")
	public void headteacher_enter_the_student_name_to_verify_new_fee_type_get_reflected_or_not() throws Throwable {
		helper();
		hta.htNewFeeEntryValidation();
	}
	
	@And("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify new fee type get reflected or not$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_new_fee_type_get_reflected_or_not() throws Throwable {
	helper();
	hta.newFeeShoolInfo();
	}
	
	@When("^headteacher should navigate to feeinfo page and verify the newly added fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_fee_got_reflected() throws Throwable {
		feeMasterEntry.NewFeeBox();
		helper();
		hta.feeinfo();
		//hta.verifyFeeInStudentProfile();
		hta.enterswdetails();
	}
	
	@When("^Enter the Student name to verify one time payment frequency$")
	public void enter_the_Student_name_to_verify_one_time_payment_frequency() throws Throwable {
		helper();
		aa.StudentNameForNewFeepayment();
	}
	
	@When("^Verify the new added one time fee frequency get reflected in fee page before student active$")
	public void verify_the_new_added_one_time_fee_frequency_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.newOneTimeFeeInFeePage();
	}
	
	

//Fee Frequency - Yearly
	
	@When("^Enter the Fee Type name for Yearly Frequency$")
	public void enter_the_Fee_Type_name_for_Yearly_Frequency() throws Throwable {
	feeMasterEntry.FeeTypeNameYR();
	}

	@When("^Verify that the New Added Yearly frequency Fee Type get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Yearly_frequency_Fee_Type_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
	feeMasterEntry.FeeTypeYr();
	}
	
	@When("^Select newly added Yearly fee type from the FeeType dropdown$")
	public void select_newly_added_Yearly_fee_type_from_the_FeeType_dropdown() throws Throwable {
	 feeMasterEntry.YrFeeTypedrpdwn();
	}

	@When("^Select Academic Year for Yearly Fee Type$")
	public void select_Academic_Year_for_Yearly_Fee_Type() throws Throwable {
	  feeMasterEntry.yracademicYrDrpdwn(); 
	}

	@When("^Select Center for Yearly Fee Type$")
	public void select_Center_for_Yearly_Fee_Type() throws Throwable {
	   feeMasterEntry.yRcenterDrpdwn();
	}

	@When("^Select School For Yearly Fee Type$")
	public void select_School_For_Yearly_Fee_Type() throws Throwable {
	  feeMasterEntry.yRschoolDrpdwn();
	}

	@When("^Select Class For Yearly Fee Type$")
	public void select_Class_For_Yearly_Fee_Type() throws Throwable {
	 feeMasterEntry.yRclassDrpdwn();
	}

	@When("^Enter the amount Yearly Fee Type$")
	public void enter_the_amount_Yearly_Fee_Type() throws Throwable {
	   feeMasterEntry.yrenterAmount();
	}

	@When("^Select Fee Frequency as yearly$")
	public void select_Fee_Frequency_as_yearly() throws Throwable {
		helper();
	  feeMasterEntry.Yearly();
	}

	@When("^Verify the added Yearly fee type is assigned to the respective center and class$")
	public void verify_the_added_Yearly_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
	   feeMasterEntry.verifyYrlyAddedFee();
	}
	
	//Fee Frequency - Yearly
	
	@When("^Enter the Student name to verify the new yearly frequency Fee Type got reflected$")
	public void enter_the_Student_name_to_verify_the_new_yearly_frequency_Fee_Type_got_reflected() throws Throwable {
		helper();
		se.studentNameNewYrlyFeeType();
	}
	
	@And("^Enter the student Gender to verify new yearly fee$")
	public void enter_the_student_Gender_to_verify_new_yearly_fee() throws Throwable {
		helper();
		se.genderforYearlyTimeFee();
	}

	@When("^headteacher enter the student name to verify new Yearly fee type get reflected or not$")
	public void headteacher_enter_the_student_name_to_verify_new_Yearly_fee_type_get_reflected_or_not() throws Throwable {
	   helper();
		hta.htNewYrlyFeeEntryValidation();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify new yearly fee type get reflected or not$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_new_yearly_fee_type_get_reflected_or_not() throws Throwable {
		helper();
		hta.newYrlyFeeShoolInfo();
	}

	@When("^headteacher should navigate to feeinfo page and verify the newly added yearly frequency fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_yearly_frequency_fee_got_reflected() throws Throwable {
	   feeMasterEntry.NewYrlyFeeBox();
	   helper();
	   hta.feeinfo();
	   hta.enterswdetails();
	}
	
	@And("^Enter the Student name to verify Yearly payment frequency$")
	public void enter_the_Student_name_to_verify_Yearly_payment_frequency() throws Throwable {
		helper();
		aa.StudentNameForNewYrlyFeepayment();
	}

	@And("^Verify the new added yearly fee frequency get reflected in fee page before student active$")
	public void verify_the_new_added_yearly_fee_frequency_get_reflected_in_fee_page_before_student_active() throws Throwable {
	   feeMasterEntry.NewYrlyFeeBoxInFeePage();
	}
	
	//Fee Frequency - Monthly
	
	@When("^Enter the Fee Type name for Monthly Frequency$")
	public void enter_the_Fee_Type_name_for_Monthly_Frequency() throws Throwable {
		
		feeMasterEntry.FeeTypeNameMonth();
	 
	}

	@And("^Verify that the New Added Monthly frequency Fee Type get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Monthly_frequency_Fee_Type_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		 feeMasterEntry.FeeTypeMonth();
	}
	
	//Monthly Fee assignment
	
	@When("^Select newly added fee from the FeeType dropdown to verify Monthly fee test$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Monthly_fee_test() throws Throwable {
	   feeMasterEntry.MonthFeeTypedrpdwn();
	}
	@When("^Select Academic Year for Monthly Fee Type$")
	public void select_Academic_Year_for_Monthly_Fee_Type() throws Throwable {
	   feeMasterEntry.monthlyFeeacademicYrDrpdwn();
	}

	@When("^Select Center for Monthly Fee Type$")
	public void select_Center_for_Monthly_Fee_Type() throws Throwable {
	  feeMasterEntry.monthlyFeecenterDrpdwn();
	}

	@When("^Select School For Monthly Fee Type$")
	public void select_School_For_Monthly_Fee_Type() throws Throwable {
	  feeMasterEntry.monthlySchoolDrpdwn();
	}

	@When("^Select Class For Monthly Fee Type$")
	public void select_Class_For_Monthly_Fee_Type() throws Throwable {
	  feeMasterEntry.montlyFeeclassDrpdwn();
	}

	@When("^Enter the amount Monthly Fee Type$")
	public void enter_the_amount_Monthly_Fee_Type() throws Throwable {
	   feeMasterEntry.monthlyFeeEnterAmount();
	}

	@When("^Select Fee Frequency as Monthly$")
	public void select_Fee_Frequency_as_Monthly() throws Throwable {
	  feeMasterEntry.Monthly();
	}


	@When("^Verify the added Monthly fee type is assigned to the respective center and class$")
	public void verify_the_added_Monthly_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
	   feeMasterEntry.verifyMonthlyAddedFee();
	}
	
	//Monthly-Recruitmentform
	
	@When("^Enter the Student name to verify the new monthly frequency Fee Type got reflected$")
	public void enter_the_Student_name_to_verify_the_new_monthly_frequency_Fee_Type_got_reflected() throws Throwable {
		helper();
		se.studentNameNewMonthlyFeeType();
	}
	
	@And("^Enter the student Gender to verify new monthly fee$")
	public void enter_the_student_Gender_to_verify_new_monthly_fee() throws Throwable {
		helper();
		se.genderforMonthlyTimeFee();
	}
	
	@When("^headteacher enter the student name to verify new monthly fee type get reflected or not$")
	public void headteacher_enter_the_student_name_to_verify_new_monthly_fee_type_get_reflected_or_not() throws Throwable {
	   helper();
		hta.htNewMonthlyFeeEntryValidation();
	}
	
	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify new monthly fee type get reflected or not$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_new_monthly_fee_type_get_reflected_or_not() throws Throwable {
		helper();
		hta.newMonthlyFeeShoolInfo();
	}
	
	@When("^headteacher should navigate to feeinfo page and verify the newly added monthly frequency fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_monthly_frequency_fee_got_reflected() throws Throwable {
	   feeMasterEntry.NewmonthlyFeeBoxinHTPage();
	   helper();
	   hta.feeinfo();
	   hta.enterswdetails();
	}
	
	@And("^Enter the Student name to verify Monthly payment frequency$")
	public void enter_the_Student_name_to_verify_Monthly_payment_frequency() throws Throwable {
		helper();
		aa.StudentNameForNewMonthlyFeepayment();
	}
	
	@And("^Verify the new added monthly fee frequency not get reflected in fee page before student active$")
	public void verify_the_new_added_monthly_fee_frequency_not_get_reflected_in_fee_page_before_student_active() throws Throwable {
	   feeMasterEntry.NewMonthlyFeeBoxInFeePage();
	}
	
	//photoscedule to verify monthly fee
	
	@When("^enter the student name to update the photo schedule and click camera icon to verify Monthly fee$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_Monthly_fee() throws Throwable {
		helper();
		su.ClickTheCameraIconToVerifyMonthlyFee();
	}
	
	@When("^enter the student name to upload photo and click on the view profile icon to verify Monthly Fee$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon() throws Throwable {
		helper();
		su.uploadStnNameToVfyMonthlyFee();
	}


	@And("^Verify the new added monthly fee frequency get reflected in fee page after student active$")
	public void verify_the_new_added_monthly_fee_frequency_get_reflected_in_fee_page_after_student_active() throws Throwable {
	   feeMasterEntry.NewMonthlyFeeBoxInFeePageafterActive();
	}

	//Fee Frequency --Termly
	
	@When("^Enter the Fee Type name for Termly Frequency$")
	public void enter_the_Fee_Type_name_for_Termly_Frequency() throws Throwable {
	   feeMasterEntry.FeeTypeNameTerm();
	}

	@When("^Verify that the New Added Termly frequency Fee Type get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Termly_frequency_Fee_Type_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.FeeTypeTerm();
	}
	
	//Fee Frequency---Termly ----Assignment
	
	@When("^Select newly added fee from the FeeType dropdown to verify Termly fee test$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Termly_fee_test() throws Throwable {
	 feeMasterEntry.termFeeTypedrpdwn();
	}

	@When("^Select Academic Year for Termly Fee Type$")
	public void select_Academic_Year_for_Termly_Fee_Type() throws Throwable {
	   feeMasterEntry.termlyFeeacademicYrDrpdwn();
	}

	@When("^Select Center for Termly Fee Type$")
	public void select_Center_for_Termly_Fee_Type() throws Throwable {
	  feeMasterEntry.termlyFeecenterDrpdwn();
	}

	@When("^Select School For Termly Fee Type$")
	public void select_School_For_Termly_Fee_Type() throws Throwable {
		feeMasterEntry.TermlySchoolDrpdwn();
	}

	@When("^Select Class For Termly Fee Type$")
	public void select_Class_For_Termly_Fee_Type() throws Throwable {
		feeMasterEntry.termlyFeeclassDrpdwn();
	}

	@When("^Enter the amount Termly Fee Type$")
	public void enter_the_amount_Termly_Fee_Type() throws Throwable {
		feeMasterEntry.termlyFeeEnterAmount();
	}

	@When("^Select Fee Frequency as Termly$")
	public void select_Fee_Frequency_as_Termly() throws Throwable {
		feeMasterEntry.Termly();
	}
	
	@When("^Verify the added Termly fee type is assigned to the respective center and class$")
	public void verify_the_added_Termly_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
		feeMasterEntry.verifyTermlyAddedFee();
	}

//Fee Frequency -  Recruitment Form
	
	@When("^Enter the Student name to verify the new Termly frequency Fee Type got reflected$")
	public void enter_the_Student_name_to_verify_the_new_Termly_frequency_Fee_Type_got_reflected() throws Throwable {
		helper();
		se.studentNameNewTermlyFeeType();
	}

	@When("^Enter the student Gender to verify new Termly fee$")
	public void enter_the_student_Gender_to_verify_new_Termly_fee() throws Throwable {
		helper();
		se.genderforTermlyFee();
	}

	@When("^headteacher enter the student name to verify new Termly fee type get reflected or not$")
	public void headteacher_enter_the_student_name_to_verify_new_Termly_fee_type_get_reflected_or_not() throws Throwable {
		 helper();
		hta.htNewTermlyFeeEntryValidation();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify new Termly fee type get reflected or not$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_new_Termly_fee_type_get_reflected_or_not() throws Throwable {
		helper();
		hta.newTermlyFeeShoolInfo();
	}

	@When("^headteacher should navigate to feeinfo page and verify the newly added Termly frequency fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_Termly_frequency_fee_got_reflected() throws Throwable {
		  feeMasterEntry.NewTermlyFeeBoxinHTPage();
		   helper();
		   hta.feeinfo();
		   hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Termly payment frequency$")
	public void enter_the_Student_name_to_verify_Termly_payment_frequency() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the new added Termly fee frequency not get reflected in fee page before student active$")
	public void verify_the_new_added_Termly_fee_frequency_not_get_reflected_in_fee_page_before_student_active() throws Throwable {
		 feeMasterEntry.NewTermlyFeeBoxInFeePage();
	}

	@When("^enter the student name to update the photo schedule and click camera icon to verify Termly fee$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_Termly_fee() throws Throwable {
		helper();
		su.ClickTheCameraIconToVerifyTermlyFee();
	}

	@When("^enter the student name to upload photo and click on the view profile icon to verify Termly Fee$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon_to_verify_Termly_Fee() throws Throwable {
		helper();
		su.uploadStnNameToVfyTermlyFee();
	}

	@When("^Verify the new added Termly fee frequency get reflected in fee page after student active$")
	public void verify_the_new_added_Termly_fee_frequency_get_reflected_in_fee_page_after_student_active() throws Throwable {
		 feeMasterEntry.NewTermlyFeeBoxInFeePageafterActive();
	}

//Add New Fee Type to validate (Per Family)
	
	@When("^Enter the Fee Type name for Per family Fee type$")
	public void enter_the_Fee_Type_name_for_Per_family_Fee_type() throws Throwable {
		 feeMasterEntry.FeeTypeNamePerFamily();
	}

	@When("^Verify that the New Added Per Family Fee Type get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Per_Family_Fee_Type_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.FeeTypePerFamily();
	}
	
// Assign class,center,School and One Time Fee Frequency to validate (Per Family)
	
	@When("^Select newly added fee from the FeeType dropdown to verify Per Family fee test$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Per_Family_fee_test() throws Throwable {
		 feeMasterEntry.perFamilyFeeTypedrpdwn();
	}

	@When("^Select Academic Year for Per Family Fee Type$")
	public void select_Academic_Year_for_Per_Family_Fee_Type() throws Throwable {
		 feeMasterEntry.perFamilyFeeacademicYrDrpdwn();
	}

	@When("^Select Center for Per Family Fee Type$")
	public void select_Center_for_Per_Family_Fee_Type() throws Throwable {
		 feeMasterEntry.PerFamilyFeecenterDrpdwn();
	}

	@When("^Select School For Per Family Fee Type$")
	public void select_School_For_Per_Family_Fee_Type() throws Throwable {
		feeMasterEntry.perFamilySchoolDrpdwn();
	}

	@When("^Select Class For Per Family Fee Type$")
	public void select_Class_For_Per_Family_Fee_Type() throws Throwable {
		feeMasterEntry.perFamilyFeeclassDrpdwn();
	}

	@When("^Enter the amountF For Per Family Fee Type$")
	public void enter_the_amountF_For_Per_Family_Fee_Type() throws Throwable {
		feeMasterEntry.perFamilyFeeEnterAmount();
	}

	@When("^Select Per Family Check Box$")
	public void select_Per_Family_Check_Box() throws Throwable {
		feeMasterEntry.PerFamilychkbox();
	}

	@When("^Verify the added Per Family fee type with One Time Frequency is assigned to the respective center and class$")
	public void verify_the_added_Per_Family_fee_type_with_One_Time_Frequency_is_assigned_to_the_respective_center_and_class() throws Throwable {
		feeMasterEntry.verifyPerFamilyAddedFee();
	}
	
	//Pre Requiste student for Per Family scenario
	
	@When("^Enter the Student name for Pre requiste$")
	public void enter_the_Student_name_for_Pre_requiste() throws Throwable {
		helper();
		se.PreRequisteStudent();
	}

	@When("^Enter the student Gender for Pre requiste$")
	public void enter_the_student_Gender_for_Pre_requiste() throws Throwable {
		helper();
		se.genderforPreRequiste();
	}

	@When("^headteacher enter the student name for Pre requiste and click on approval icon$")
	public void headteacher_enter_the_student_name_for_Pre_requiste_and_click_on_approval_icon() throws Throwable {
		 helper();
		 hta.preRequisteStudent();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo for Pre requiste$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_for_Pre_requiste() throws Throwable {
		helper();
		hta.preRequisteShoolInfo();
	}
	
	@When("^headteacher should navigate to feeinfo page and verify the newly added per Family One Time frequency fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_per_Family_One_Time_frequency_fee_got_reflected() throws Throwable {
		  feeMasterEntry.NewPerFamilyFeeBoxinHTPage();
		   helper();
		   hta.feeinfo();
		   hta.enterswdetails();
	}
	
	@When("^Enter the Student name to verify Per Family One Time Fee Frequency get reflected in Fee Page$")
	public void enter_the_Student_name_to_verify_Per_Family_One_Time_Fee_Frequency_get_reflected_in_Fee_Page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
		
	}

	@When("^Verify the new added Per Familt One Time fee frequency get reflected in fee page before student active$")
	public void verify_the_new_added_Per_Familt_One_Time_fee_frequency_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.newPerFamilyOneTimeFeeTypeInFeePage();
	}

	//Student recruitment with sibling to verify Per Family One Time Fee Frequency
	
	
	@When("^Enter the Student name to verify PerFamily Fee Type with one time frequency$")
	public void enter_the_Student_name_to_verify_PerFamily_Fee_Type_with_one_time_frequency() throws Throwable {
		helper();
		se.siblingStudentPerFamilyOneTime();
	}

	@When("^Enter the student Gender to verify PerFamily Fee Type with one time frequency$")
	public void enter_the_student_Gender_to_verify_PerFamily_Fee_Type_with_one_time_frequency() throws Throwable {
		helper();
		se.genderforSiblingPerFamilyOneTime();
	}

	@When("^Enter the sibling details to verify PerFamily Fee Type$")
	public void enter_the_sibling_details_to_verify_PerFamily_Fee_Type() throws Throwable {
		helper();
		se.SiblingForPerFamily();
	}

	@When("^Enter the Family member Info and other details to verify PerFamily Fee Type$")
	public void enter_the_Family_member_Info_and_other_details_to_verify_PerFamily_Fee_Type() throws Throwable {
		se.siblingParentInfo();
	}

	@When("^headteacher enter the student name to verify PerFamily Fee Type with one time frequency$")
	public void headteacher_enter_the_student_name_to_verify_PerFamily_Fee_Type_with_one_time_frequency() throws Throwable {
		 helper();
		 hta.perFamilyOneTimestudent();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify PerFamily Fee Type with one time frequency$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_PerFamily_Fee_Type_with_one_time_frequency() throws Throwable {
		helper();
		hta.PerFamilyOneTimeFeeShoolInfo();
	}

	@When("^headteacher should navigate to feeinfo page and verify the newly added per Family One Time frequency not got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_per_Family_One_Time_frequency_not_got_reflected() throws Throwable {
		 feeMasterEntry.oneTimePerFamilyFeeBoxinHTPage();
		   helper();
		   hta.feeinfo();
		   hta.perFamilyenterswdetails();
	}

	@When("^Enter the Student name to verify Per Family One Time Fee Frequency not get reflected in Fee Page$")
	public void enter_the_Student_name_to_verify_Per_Family_One_Time_Fee_Frequency_not_get_reflected_in_Fee_Page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the new added Per Family One Time fee frequency not get reflected in fee page as he has sibling$")
	public void verify_the_new_added_Per_Family_One_Time_fee_frequency_not_get_reflected_in_fee_page_as_he_has_sibling() throws Throwable {
		feeMasterEntry.oneTimePerFamilyFeeBoxinHTPage();
	}
	
// Per Family Fee Type with Yearly Fee Frequency
	
	
	@When("^Enter the Fee Type name for Per family Fee type to verify Yearly Frequency$")
	public void enter_the_Fee_Type_name_for_Per_family_Fee_type_to_verify_Yearly_Frequency() throws Throwable {
		feeMasterEntry.FeeTypeNamePerFamilyYearly();
	}

	@When("^Verify that the New Added Per Family Fee Type to verify Yearly Frequency get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Per_Family_Fee_Type_to_verify_Yearly_Frequency_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.PerFamilyYearly();
	}
	
// Per Family fee Type Assignment to verify Yearly Fee Frequency
	
	@When("^Select newly added Per Family Yearly fee from the FeeType dropdown to verify Per Family fee test$")
	public void select_newly_added_Per_Family_Yearly_fee_from_the_FeeType_dropdown_to_verify_Per_Family_fee_test() throws Throwable {
		 feeMasterEntry.perFamilyYrFeeTypedrpdwn();
	}

	@When("^Select Academic Year for Per Family Yearly Fee Type$")
	public void select_Academic_Year_for_Per_Family_Yearly_Fee_Type() throws Throwable {
		 feeMasterEntry.perFamilyYrlyacademicYrDrpdwn(); 
	}

	@When("^Select Center for Per Family Yearly Fee Type$")
	public void select_Center_for_Per_Family_Yearly_Fee_Type() throws Throwable {
		 feeMasterEntry.PerFamilyyRcenterDrpdwn();
	}

	@When("^Select School For Per Family Yearly Fee Type$")
	public void select_School_For_Per_Family_Yearly_Fee_Type() throws Throwable {
		feeMasterEntry.PerFamilyyRschoolDrpdwn();
	}

	@When("^Select Class For Per Family Yearly Fee Type$")
	public void select_Class_For_Per_Family_Yearly_Fee_Type() throws Throwable {
		feeMasterEntry.PerFamilyyRclassDrpdwn();
	}

	@When("^Enter the amountF For Per Family Yearly Fee Type$")
	public void enter_the_amountF_For_Per_Family_Yearly_Fee_Type() throws Throwable {
		feeMasterEntry.PerFamilyYrenterAmount();
	}

	@When("^Verify the added Per Family fee type with Yearly Frequency is assigned to the respective center and class$")
	public void verify_the_added_Per_Family_fee_type_with_Yearly_Frequency_is_assigned_to_the_respective_center_and_class() throws Throwable {
		feeMasterEntry.verifyPerFamilyYrlyAddedFee();
	}
	
	// Per Family pre requiste to verify Per Family Feetype with yearly fee frequency
	
	
	@When("^Enter the Student name for Pre requiste to verify Per Family with Yearly Fee Frequency$")
	public void enter_the_Student_name_for_Pre_requiste_to_verify_Per_Family_with_Yearly_Fee_Frequency() throws Throwable {
		helper();
		se.PreRequistePerFamilyYearlyFeeStudent();
	}

	@When("^Enter the student Gender for Pre requiste to verify Per Family with Yearly Fee Frequency$")
	public void enter_the_student_Gender_for_Pre_requiste_to_verify_Per_Family_with_Yearly_Fee_Frequency() throws Throwable {
		helper();
		se.genderforPerFamilyYearlyPreRequiste();
	}

	@When("^headteacher enter the student name for Pre requiste to verify Per Family with Yearly Fee Frequency and click on approval icon$")
	public void headteacher_enter_the_student_name_for_Pre_requiste_to_verify_Per_Family_with_Yearly_Fee_Frequency_and_click_on_approval_icon() throws Throwable {
		 helper();
		 hta.preRequistePderFamilyYearlyStudent();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo for Pre requiste to verify Per Family with Yearly Fee Frequency$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_for_Pre_requiste_to_verify_Per_Family_with_Yearly_Fee_Frequency() throws Throwable {
		helper();
		hta.preRequistePerFamilyYrShoolInfo();
	}

	@When("^headteacher should navigate to feeinfo page and verify the newly added per Family Yearly frequency fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_per_Family_Yearly_frequency_fee_got_reflected() throws Throwable {
		 feeMasterEntry.NewPerFamilyYRFeeBoxinHTPage();
		   helper();
		   hta.feeinfo();
		   hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Per Family Yearly Fee Frequency get reflected in Fee Page$")
	public void enter_the_Student_name_to_verify_Per_Family_Yearly_Fee_Frequency_get_reflected_in_Fee_Page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the new added Per Family Yearly fee frequency get reflected in fee page before student active$")
	public void verify_the_new_added_Per_Family_Yearly_fee_frequency_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.newPerFamilyYrlyFeeTypeInFeePage();
	}
	
	//PerFamily Fee Type with Yearly Fee Frequency
	
	@When("^Enter the Student name to verify PerFamily Fee Type with Yearly frequency$")
	public void enter_the_Student_name_to_verify_PerFamily_Fee_Type_with_Yearly_frequency() throws Throwable {
		helper();
		se.siblingStudentPerFamilyYearly();
	}

	@When("^Enter the student Gender to verify PerFamily Fee Type with Yearly frequency$")
	public void enter_the_student_Gender_to_verify_PerFamily_Fee_Type_with_Yearly_frequency() throws Throwable {
		helper();
		se.genderforSiblingPerFamilyYearly();
	}


	@When("^headteacher enter the student name to verify PerFamily Fee Type with Yearly frequency$")
	public void headteacher_enter_the_student_name_to_verify_PerFamily_Fee_Type_with_Yearly_frequency() throws Throwable {
		 helper();
		 hta.perFamilyYearlystudent();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify PerFamily Fee Type with Yearly frequency$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_PerFamily_Fee_Type_with_Yearly_frequency() throws Throwable {
		helper();
		hta.PerFamilyYearlyFeeShoolInfo();
	}

	@When("^headteacher should navigate to feeinfo page and verify the newly added per Family Yearly frequency not got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_per_Family_Yearly_frequency_not_got_reflected() throws Throwable {
		 feeMasterEntry.yearlyPerFamilyFeeBoxinHTPage();
		   helper();
		   hta.feeinfo();
		   hta.perFamilyenterswdetails();
	}

	@When("^Verify the new added Per Family Yearly fee frequency not get reflected in fee page as he has sibling$")
	public void verify_the_new_added_Per_Family_Yearly_fee_frequency_not_get_reflected_in_fee_page_as_he_has_sibling() throws Throwable {
		feeMasterEntry.yearlyPerFamilyFeeBoxinFeePage();
	}

//Per Family Fee With Monthly Fee Frequency
	
	@When("^Enter the Fee Type name for Per family Fee type to verify Monthly Frequency$")
	public void enter_the_Fee_Type_name_for_Per_family_Fee_type_to_verify_Monthly_Frequency() throws Throwable {
		feeMasterEntry.PerFamilyFeeTypeNameMonth();
	}

	@When("^Verify that the New Added Per Family Fee Type to verify Monthly Frequency get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Per_Family_Fee_Type_to_verify_Monthly_Frequency_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		 feeMasterEntry.PerFamilyFeeTypeMonth();
	}
	
// Per Family Fee with Monthly Fee Frequency Assignment
	
	@When("^Select newly added fee from the FeeType dropdown to verify Per Family Monthly fee test$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Per_Family_Monthly_fee_test() throws Throwable {
		 feeMasterEntry.PerFamilyMonthFeeTypedrpdwn();
	}

	@When("^Select Academic Year to verify Per Family Monthly Fee Type$")
	public void select_Academic_Year_to_verify_Per_Family_Monthly_Fee_Type() throws Throwable {
		feeMasterEntry.PerFamilymonthlyFeeacademicYrDrpdwn();
	}

	@When("^Select Center to verify Per Family Monthly Fee Type$")
	public void select_Center_to_verify_Per_Family_Monthly_Fee_Type() throws Throwable {
		feeMasterEntry.PerFamilymonthlyFeecenterDrpdwn();
	}

	@When("^Select School to verify Per Family Monthly Fee Type$")
	public void select_School_to_verify_Per_Family_Monthly_Fee_Type() throws Throwable {
		  feeMasterEntry.PerFamilymonthlySchoolDrpdwn();
	}

	@When("^Select Class to verify Per Family Monthly Fee Type$")
	public void select_Class_to_verify_Per_Family_Monthly_Fee_Type() throws Throwable {
		 feeMasterEntry.PerFamilymontlyFeeclassDrpdwn();
	}

	@When("^Enter the amount to verify Per Family Monthly Fee Type$")
	public void enter_the_amount_to_verify_Per_Family_Monthly_Fee_Type() throws Throwable {
		 feeMasterEntry.PerFamilymonthlyFeeEnterAmount();
	}

	@When("^Verify the added Per Family Monthly fee type is assigned to the respective center and class$")
	public void verify_the_added_Per_Family_Monthly_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
		feeMasterEntry.verifyPerFamilyMonthlyAddedFee();
	}
	
//Per Family Monthly Fee Type Frequency	 Pre requiste
	
	@When("^Enter the Student name for Pre requiste to verify PerFamily Fee Type with Monthly frequency$")
	public void enter_the_Student_name_for_Pre_requiste_to_verify_PerFamily_Fee_Type_with_Monthly_frequency() throws Throwable {
		helper();
		se.studentNamePerFamilyMonthlyPreRequiste();
	}

	@When("^Enter the student Gender for Pre requiste to verify PerFamily Fee Type with Monthly frequency$")
	public void enter_the_student_Gender_for_Pre_requiste_to_verify_PerFamily_Fee_Type_with_Monthly_frequency() throws Throwable {
		helper();
		se.genderforPerFamilyMonthlyFeePreRequiste();
	}

	@When("^Enter the student name for Pre requiste and click on approval icon to verify PerFamily Fee Type with Monthly frequency$")
	public void enter_the_student_name_for_Pre_requiste_and_click_on_approval_icon_to_verify_PerFamily_Fee_Type_with_Monthly_frequency() throws Throwable {
		 helper();
		hta.PerFamilyMonthlyPreRequiste();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo for Pre requiste to verify PerFamily Fee Type with Monthly frequency$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_for_Pre_requiste_to_verify_PerFamily_Fee_Type_with_Monthly_frequency() throws Throwable {
		helper();
		hta.PerFamilyMonthlyPreRequisteClass();
	}

	@When("^headteacher should navigate to feeinfo page and verify the newly added per Family Month frequency fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_per_Family_Month_frequency_fee_got_reflected() throws Throwable {
		  feeMasterEntry.PerFamilyMonthlyPreRequisteFeeBoxinHTPage();
		   helper();
		   hta.feeinfo();
		   hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Per Family Monthly Fee Frequency not get reflected in Fee Page$")
	public void enter_the_Student_name_to_verify_Per_Family_Monthly_Fee_Frequency_not_get_reflected_in_Fee_Page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the new added Per Family Monthly fee frequency not get reflected in fee page before student active$")
	public void verify_the_new_added_Per_Family_Monthly_fee_frequency_not_get_reflected_in_fee_page_before_student_active() throws Throwable {
		 feeMasterEntry.PerFamilyMnthlyPreRequisteFeeBoxInFeePage();
	}

	@When("^enter the student name to update the photo schedule and click camera icon to verify PerFamily Monthly fee for Prerequiste$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_PerFamily_Monthly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.uploadToVerifyPerFamilyMonthlyPreRequiste();
	}

	@When("^enter the student name to upload photo and click on the view profile icon to verify PerFamily Monthly fee for Prerequiste$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon_to_verify_PerFamily_Monthly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.uploadStnNameToVfyPerFamilyMonthlyFeePreRequiste();
	}

	@When("^Enter the Student name to verify Per Family Monthly Fee Frequency get reflected in Fee Page$")
	public void enter_the_Student_name_to_verify_Per_Family_Monthly_Fee_Frequency_get_reflected_in_Fee_Page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the new added PerFamily Monthly fee frequency get reflected in fee page after student active$")
	public void verify_the_new_added_PerFamily_Monthly_fee_frequency_get_reflected_in_fee_page_after_student_active() throws Throwable {
		feeMasterEntry.PerFamilyFeeBoxInFeePageafterActivePreRequiste();
		
	}
	
	//Per Family Monthly Fee Frequency
	
	@When("^Enter the Student name to verify PerFamily Fee Type with Monthly frequency$")
	public void enter_the_Student_name_to_verify_PerFamily_Fee_Type_with_Monthly_frequency() throws Throwable {
		helper();
		se.siblingStudentPerFamilyMonthly();
	}

	@When("^Enter the student Gender to verify PerFamily Fee Type with Monthly frequency$")
	public void enter_the_student_Gender_to_verify_PerFamily_Fee_Type_with_Monthly_frequency() throws Throwable {
		helper();
		se.genderforSiblingPerFamilyMonthly();
	}

	@When("^headteacher enter the student name to verify PerFamily Fee Type with Monthly frequency$")
	public void headteacher_enter_the_student_name_to_verify_PerFamily_Fee_Type_with_Monthly_frequency() throws Throwable {
		 helper();
		 hta.perFamilyMonthlystudent();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify PerFamily Fee Type with Monthly frequency$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_PerFamily_Fee_Type_with_Monthly_frequency() throws Throwable {
		helper();
		hta.PerFamilyMonthlyFeeShoolInfo();
	}

	@When("^headteacher should navigate to feeinfo page and verify the newly added per Family Monthly frequency not got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_per_Family_Monthly_frequency_not_got_reflected() throws Throwable {
		 feeMasterEntry.monthlyPerFamilyFeeBoxinHTPage();
		   helper();
		   hta.feeinfo();
		   hta.perFamilyenterswdetails();
	}

	@When("^Verify the new added Per Family Monthly fee frequency not get reflected in fee page as he has sibling$")
	public void verify_the_new_added_Per_Family_Monthly_fee_frequency_not_get_reflected_in_fee_page_as_he_has_sibling() throws Throwable {
		 feeMasterEntry.perFamilyMonthlyInFeePage();
	}

	@When("^enter the student name to update the photo schedule and click camera icon to verify PerFamily Monthly fee$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_PerFamily_Monthly_fee() throws Throwable {
		helper();
		su.ClickTheCameraIconToVerifyPerFamilyMonthlyFee();
	}

	@When("^enter the student name to upload photo and click on the view profile icon to verify PerFamily Monthly fee$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon_to_verify_PerFamily_Monthly_fee() throws Throwable {
		helper();
		su.uploadStnNameToVfyPerFamilyMonthlyFee();
	}

	@When("^Verify the new added PerFamily Monthly fee frequency not get reflected in fee page after student active as he has sibling$")
	public void verify_the_new_added_PerFamily_Monthly_fee_frequency_not_get_reflected_in_fee_page_after_student_active_as_he_has_sibling() throws Throwable {
		 feeMasterEntry.PerFAmilyMonthlyInFeePageafterActivesibling();
	}
	
	// Per Family with Termly Fee Frequency
	
	@When("^Enter the Fee Type name for Per Family Termly Frequency$")
	public void enter_the_Fee_Type_name_for_Per_Family_Termly_Frequency() throws Throwable {
		   feeMasterEntry.PerFamilyTerm();
	}

	@When("^Verify that the Newly Added per Family Termly frequency Fee Type get reflected in Fee Type Dropdown$")
	public void verify_that_the_Newly_Added_per_Family_Termly_frequency_Fee_Type_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.PerFamilyFeeTypeTerm();
	}
	
	//Per Family -Termly Fee Frequency assignment
	
	@When("^Select newly added fee from the FeeType dropdown to verify Per Family Termly fee test$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Per_Family_Termly_fee_test() throws Throwable {
		 feeMasterEntry.PerFamilyTermlyFeeTypedrpdwn();
	}

	@When("^Select Academic Year for Per Family Termly Fee Type$")
	public void select_Academic_Year_for_Per_Family_Termly_Fee_Type() throws Throwable {
		feeMasterEntry.PerFamilyTermlyFeeacademicYrDrpdwn();
	}

	@When("^Select Center for Per Family Termly Fee Type$")
	public void select_Center_for_Per_Family_Termly_Fee_Type() throws Throwable {
		feeMasterEntry.PerFamilyTermlyFeecenterDrpdwn();
	}

	@When("^Select School For Per Family Termly Fee Type$")
	public void select_School_For_Per_Family_Termly_Fee_Type() throws Throwable {
		 feeMasterEntry.PerFamilyTermlySchoolDrpdwn();
	}

	@When("^Select Class For Per Family Termly Fee Type$")
	public void select_Class_For_Per_Family_Termly_Fee_Type() throws Throwable {
		 feeMasterEntry.PerFamilyTermlyFeeclassDrpdwn();
	}

	@When("^Enter the amount Per Family Termly Fee Type$")
	public void enter_the_amount_Per_Family_Termly_Fee_Type() throws Throwable {
		feeMasterEntry.PerFamilyTermlyFeeEnterAmount();
	}

	@When("^Verify the added Per Family Termly fee type is assigned to the respective center and class$")
	public void verify_the_added_Per_Family_Termly_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
		feeMasterEntry.verifyPerFamilyTermlyAddedFee();
	}
	
	// Per Family Pre-Requiste  to verify Termly Fee Frequency
	
	@When("^Enter the Student name for Pre requiste to verify PerFamily Fee Type with Termly frequency$")
	public void enter_the_Student_name_for_Pre_requiste_to_verify_PerFamily_Fee_Type_with_Termly_frequency() throws Throwable {
		helper();
		se.studentNamePerFamilyTermlyPreRequiste();
	}

	@When("^Enter the student Gender for Pre requiste to verify PerFamily Fee Type with Termly frequency$")
	public void enter_the_student_Gender_for_Pre_requiste_to_verify_PerFamily_Fee_Type_with_Termly_frequency() throws Throwable {
		helper();
		se.genderforPerFamilyTermlyFeePreRequiste();
	}

	@When("^Enter the student name for Pre requiste and click on approval icon to verify PerFamily Fee Type with Termly frequency$")
	public void enter_the_student_name_for_Pre_requiste_and_click_on_approval_icon_to_verify_PerFamily_Fee_Type_with_Termly_frequency() throws Throwable {
		 helper();
		 hta.PerFamilyTermlyPreRequiste();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo for Pre requiste to verify PerFamily Fee Type with Termly frequency$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_for_Pre_requiste_to_verify_PerFamily_Fee_Type_with_Termly_frequency() throws Throwable {
		helper();
		hta.PerFamilyTermlyClass();
	}

	@When("^headteacher should navigate to feeinfo page and verify the newly added per Family Termly frequency fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_per_Family_Termly_frequency_fee_got_reflected() throws Throwable {
		 feeMasterEntry.PerFamilyTermlyPreRequisteFeeBoxinHTPage();
		   helper();
		   hta.feeinfo();
		   hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Per Family Termly Fee Frequency not get reflected in Fee Page$")
	public void enter_the_Student_name_to_verify_Per_Family_Termly_Fee_Frequency_not_get_reflected_in_Fee_Page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the new added Per Family Termly fee frequency not get reflected in fee page before student active$")
	public void verify_the_new_added_Per_Family_Termly_fee_frequency_not_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.PerFamilyTermlyPreRequisteFeeBoxInFeePage();
	}

	@When("^enter the student name to update the photo schedule and click camera icon to verify PerFamily Termly fee for Prerequiste$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_PerFamily_Termly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.updateToVerifyPerFamilyTermlyPreRequiste();
	}

	@When("^enter the student name to upload photo and click on the view profile icon to verify PerFamily Termly fee for Prerequiste$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon_to_verify_PerFamily_Termly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.uploadStnNameToVfyPerFamilyTermlyFeePreRequiste();
	}

	@When("^Enter the Student name to verify Per Family Termly Fee Frequency get reflected in Fee Page$")
	public void enter_the_Student_name_to_verify_Per_Family_Termly_Fee_Frequency_get_reflected_in_Fee_Page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the new added PerFamily Termly fee frequency get reflected in fee page after student active$")
	public void verify_the_new_added_PerFamily_Termly_fee_frequency_get_reflected_in_fee_page_after_student_active() throws Throwable {
		feeMasterEntry.PerFamilyTermlyFeeBoxInFeePageafterActivePreRequiste();
	}
	
	//Per Family with Termly Fee Frequency
	
	@When("^Enter the Student name to verify PerFamily Fee Type with Termly frequency$")
	public void enter_the_Student_name_to_verify_PerFamily_Fee_Type_with_Termly_frequency() throws Throwable {
		helper();
		se.studentNamePerFamilyTermly();
	}

	@When("^Enter the student Gender to verify PerFamily Fee Type with Termly frequency$")
	public void enter_the_student_Gender_to_verify_PerFamily_Fee_Type_with_Termly_frequency() throws Throwable {
		helper();
		se.genderforPerFamilyTermlyFee();
	}

	@When("^headteacher enter the student name to verify PerFamily Fee Type with Termly frequency$")
	public void headteacher_enter_the_student_name_to_verify_PerFamily_Fee_Type_with_Termly_frequency() throws Throwable {
		 helper();
		 hta.PerFamilyTermly();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify PerFamily Fee Type with Termly frequency$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_PerFamily_Fee_Type_with_Termly_frequency() throws Throwable {
		helper();
		hta.PerFamilyTermlyClass();
	}

	@When("^headteacher should navigate to feeinfo page and verify the newly added per Family Termly frequency not got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_and_verify_the_newly_added_per_Family_Termly_frequency_not_got_reflected() throws Throwable {
		 feeMasterEntry.PerFamilyTermlyFeeBoxinHTPage();
		   helper();
		   hta.feeinfo();
		   hta.perFamilyenterswdetails();
	}

	@When("^Enter the Student name to verify Per Family Termly Frequency not get reflected in Fee Page$")
	public void enter_the_Student_name_to_verify_Per_Family_Termly_Frequency_not_get_reflected_in_Fee_Page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the new added Per Family Termly fee frequency not get reflected in fee page as he has sibling$")
	public void verify_the_new_added_Per_Family_Termly_fee_frequency_not_get_reflected_in_fee_page_as_he_has_sibling() throws Throwable {
		feeMasterEntry.PerFamilyTermlyFeeBoxInFeePage();
	}

	@When("^enter the student name to update the photo schedule and click camera icon to verify PerFamily Termly fee$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_PerFamily_Termly_fee() throws Throwable {
		helper();
		su.updateToVerifyPerFamilyTermly();
	}

	@When("^enter the student name to upload photo and click on the view profile icon to verify PerFamily Termly fee$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon_to_verify_PerFamily_Termly_fee() throws Throwable {
		helper();
		su.uploadStnNameToVfyPerFamilyTermlyFee();
	}

	@When("^Verify the new added PerFamily Termly fee frequency not get reflected in fee page after student active as he has sibling$")
	public void verify_the_new_added_PerFamily_Termly_fee_frequency_not_get_reflected_in_fee_page_after_student_active_as_he_has_sibling() throws Throwable {
		feeMasterEntry.PerFamilyTermlyFeeBoxInFeePageafterActive();
	}
	
	//Gender New Fee 
	
	@When("^Enter the Fee Type name for Gender One Time Fee Frequency$")
	public void enter_the_Fee_Type_name_for_Gender_One_Time_Fee_Frequency() throws Throwable {
		  feeMasterEntry.GenderOneTime();
	}

	@When("^Verify that the Newly Added Gender One Time fee frequency get reflected in Fee Type Dropdown$")
	public void verify_that_the_Newly_Added_Gender_One_Time_fee_frequency_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.GenderFeeTypeOneTime();
	}
	
	// Gender One Time New Fee Assignment
	
	@When("^Select newly added fee from the FeeType dropdown to verify Gender One Time fee test$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Gender_One_Time_fee_test() throws Throwable {
		 feeMasterEntry.genderOneTimeFeeTypedrpdwn();
	}

	@When("^Select Academic Year for Gender One Time Fee Type$")
	public void select_Academic_Year_for_Gender_One_Time_Fee_Type() throws Throwable {
		feeMasterEntry.GenderOneTimeFeeacademicYrDrpdwn();
	}

	@When("^Select Center for Gender One Time Fee Type$")
	public void select_Center_for_Gender_One_Time_Fee_Type() throws Throwable {
		feeMasterEntry.genderOneTimeFeecenterDrpdwn();
	}

	@When("^Select School For Gender One Time Fee Type$")
	public void select_School_For_Gender_One_Time_Fee_Type() throws Throwable {
		feeMasterEntry.genderOneTimeSchoolDrpdwn();
	}

	@When("^Select Class For Gender One Time Fee Type$")
	public void select_Class_For_Gender_One_Time_Fee_Type() throws Throwable {
		 feeMasterEntry.genderOneTimeFeeclassDrpdwn();
	}

	@When("^Select Is Gender Check Box$")
	public void select_Is_Gender_Check_Box() throws Throwable {
		feeMasterEntry.isGenderchkbox();
	}

	@When("^Enter the amount for Male$")
	public void enter_the_amount_for_Male() throws Throwable {
		feeMasterEntry.maleFee();
	}

	@When("^Enter the amount for Female$")
	public void enter_the_amount_for_Female() throws Throwable {
		feeMasterEntry.FemaleFee();
	}

	@When("^Verify the added Gender One Time fee type is assigned to the respective center and class$")
	public void verify_the_added_Gender_One_Time_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
		feeMasterEntry.GenderOneTimeAddedFee();
	}
	
	//Male Student Recruitment with one time fee frequency
	
	@When("^Enter the Student name to verify Male One Time Fee got reflected$")
	public void enter_the_Student_name_to_verify_Male_One_Time_Fee_got_reflected() throws Throwable {
		helper();
		se.maleStudentOneTimeFee();
	}

	@When("^Enter the student Gender to verify Male One Time Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Male_One_Time_Fee_got_reflected() throws Throwable {
		helper();
		se.genderMaleforOneTimeFee();
	}

	@When("^headteacher enter the student name to verify Male One Time Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Male_One_Time_Fee_got_reflected() throws Throwable {
		 helper();
		 hta.GenderMaleOneTime();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Male One Time Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Male_One_Time_Fee_got_reflected() throws Throwable {
		helper();
		hta.genderMaleOneTimeFee();
	}

	@When("^headteacher should navigate to feeinfo page to verify Male One Time Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Male_One_Time_Fee_got_reflected() throws Throwable {
		 feeMasterEntry.IsGenderMaleFeeInHTPage();
		 feeMasterEntry.maleAmtVerificationInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.enterswdetails();
		  
	}
	
	@When("^Enter the Student name to verify Male One Time Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Male_One_Time_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Male with one time fee frequency get reflected in fee page before student active$")
	public void verify_the_newly_added_Male_with_one_time_fee_frequency_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.GenderMaleOneTimeInFeePageB4Active();
	}
	
	//Female Student Recruitment to verify Is Gender fee type with one time fee frequency
	
	@When("^Enter the Student name to verify Female One Time Fee got reflected$")
	public void enter_the_Student_name_to_verify_Female_One_Time_Fee_got_reflected() throws Throwable {
		helper();
		se.FemaleStudentOneTimeFee();
	}

	@When("^Enter the student Gender to verify Female One Time Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Female_One_Time_Fee_got_reflected() throws Throwable {
		helper();
		se.genderFemaleforOneTimeFee();
	}

	@When("^headteacher enter the student name to verify Female One Time Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Female_One_Time_Fee_got_reflected() throws Throwable {
		 helper();
		 hta.GenderFemaleOneTime();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Female One Time Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Female_One_Time_Fee_got_reflected() throws Throwable {
		helper();
		hta.genderFemaleOneTimeFee();
		
	}

	@When("^headteacher should navigate to feeinfo page to verify Female One Time Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Female_One_Time_Fee_got_reflected() throws Throwable {
		 feeMasterEntry.IsGenderMaleFeeInHTPage();
		 feeMasterEntry.FemaleAmtVerificationInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Female One Time Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Female_One_Time_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Female with one time fee frequency get reflected in fee page before student active$")
	public void verify_the_newly_added_Female_with_one_time_fee_frequency_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.GenderMaleOneTimeInFeePageB4Active();
	}
	
	//New Yearly fee frequency to verify Gender
	
	@When("^Enter the Fee Type name for Gender Yearly Frequency$")
	public void enter_the_Fee_Type_name_for_Gender_Yearly_Frequency() throws Throwable {
		 feeMasterEntry.GenderYearlyFee();
	}

	@When("^Verify that the Newly Added gender Yearly frequency Fee Type get reflected in Fee Type Dropdown$")
	public void verify_that_the_Newly_Added_gender_Yearly_frequency_Fee_Type_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.GenderFeeTypeYearly();
	}
	
	//Gender Yearly Fee Assignment
	
	@When("^Select newly added fee from the FeeType dropdown to verify Gender Yearly fee test$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Gender_Yearly_fee_test() throws Throwable {
		 feeMasterEntry.genderYearlyFeeTypedrpdwn();
	}

	@When("^Select Academic Year for Gender Yearly Fee Type$")
	public void select_Academic_Year_for_Gender_Yearly_Fee_Type() throws Throwable {
		feeMasterEntry.GenderYearlyFeeacademicYrDrpdwn();
	}

	@When("^Select Center for Gender Yearly Fee Type$")
	public void select_Center_for_Gender_Yearly_Fee_Type() throws Throwable {
		feeMasterEntry.genderYearlyFeecenterDrpdwn();
	}

	@When("^Select School For Gender Yearly Fee Type$")
	public void select_School_For_Gender_Yearly_Fee_Type() throws Throwable {
		feeMasterEntry.genderYearlySchoolDrpdwn();
	}

	@When("^Select Class For Gender Yearly Fee Type$")
	public void select_Class_For_Gender_Yearly_Fee_Type() throws Throwable {
		feeMasterEntry.genderYearlyFeeclassDrpdwn();
	}
	
	@When("^Enter the amount for Male to verify yearly fee$")
	public void enter_the_amount_for_Male_to_verify_yearly_fee() throws Throwable {
		feeMasterEntry.YearlymaleFee();
	}

	@When("^Enter the amount for Female to verify yearly fee$")
	public void enter_the_amount_for_Female_to_verify_yearly_fee() throws Throwable {
		feeMasterEntry.YearlyFemaleFee();
	}

	@When("^Verify the added Gender Yearly fee type is assigned to the respective center and class$")
	public void verify_the_added_Gender_Yearly_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
		feeMasterEntry.GenderYearlyAddedFee();
	}
	
	//Male Student Recruitment to verify yearly fee frequency
	
	@When("^Enter the Student name to verify Male Yearly Fee got reflected$")
	public void enter_the_Student_name_to_verify_Male_Yearly_Fee_got_reflected() throws Throwable {
		helper();
		se.maleStudentYearlyFee();
	}

	@When("^Enter the student Gender to verify Male Yearly Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Male_Yearly_Fee_got_reflected() throws Throwable {
		helper();
		se.genderMaleforyearly();
	}

	@When("^headteacher enter the student name to verify Male Yearly Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Male_Yearly_Fee_got_reflected() throws Throwable {
		 helper();
		 hta.GenderMaleYearly();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Male Yearly Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Male_Yearly_Fee_got_reflected() throws Throwable {
		helper();
		hta.genderMaleYearlyFee();
	}

	@When("^headteacher should navigate to feeinfo page to verify Male Yearly Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Male_Yearly_Fee_got_reflected() throws Throwable {
		 feeMasterEntry.IsGenderMaleYearlyFeeInHTPage();
		 feeMasterEntry.maleYrlyAmtVerificationInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Male Yearly Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Male_Yearly_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Male with Yearly fee frequency get reflected in fee page before student active$")
	public void verify_the_newly_added_Male_with_Yearly_fee_frequency_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.GenderMaleYearlyInFeePageB4Active();
	}
	
	//Female yearly fee frequency verification
	
	@When("^Enter the Student name to verify Female Yearly Fee got reflected$")
	public void enter_the_Student_name_to_verify_Female_Yearly_Fee_got_reflected() throws Throwable {
		helper();
		se.femaleStudentYearlyFee();
	}

	@When("^Enter the student Gender to verify Female Yearly Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Female_Yearly_Fee_got_reflected() throws Throwable {
		helper();
		se.genderFemaleforyearly();
	}

	@When("^headteacher enter the student name to verify Female Yearly Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Female_Yearly_Fee_got_reflected() throws Throwable {
		 helper();
		 hta.GenderfemaleYearly();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Female Yearly Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Female_Yearly_Fee_got_reflected() throws Throwable {
		helper();
		hta.genderFemaleYearlyFee();
	}

	@When("^headteacher should navigate to feeinfo page to verify Female Yearly Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Female_Yearly_Fee_got_reflected() throws Throwable {
		 feeMasterEntry.IsGenderMaleYearlyFeeInHTPage();
		 feeMasterEntry.FemaleYrlyAmtVerificationInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Female Yearly Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Female_Yearly_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Female with Yearly fee frequency get reflected in fee page before student active$")
	public void verify_the_newly_added_Female_with_Yearly_fee_frequency_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.GenderMaleYearlyInFeePageB4Active();
	}
	
	//Gender fee type with monthly frequency
	
	@When("^Enter the Fee Type name for Gender Fee type to verify Monthly Frequency$")
	public void enter_the_Fee_Type_name_for_Gender_Fee_type_to_verify_Monthly_Frequency() throws Throwable {
		 feeMasterEntry.GenderMonthlyFee();
	}

	@When("^Verify that the New Added Gender Fee Type to verify Monthly Frequency get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Gender_Fee_Type_to_verify_Monthly_Frequency_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.GenderFeeTypeMonthly();
	}
	
	//Gender Monthly fee assignment
	
	@When("^Select newly added fee from the FeeType dropdown to verify Gender Monthly fee test$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Gender_Monthly_fee_test() throws Throwable {
		feeMasterEntry.genderMonthlylyFeeTypedrpdwn();
	}

	@When("^Select Academic Year for Gender Monthly Fee Type$")
	public void select_Academic_Year_for_Gender_Monthly_Fee_Type() throws Throwable {
		feeMasterEntry.GenderMonthlyFeeacademicYrDrpdwn();
	}

	@When("^Select Center for Gender Monthly Fee Type$")
	public void select_Center_for_Gender_Monthly_Fee_Type() throws Throwable {
		feeMasterEntry.genderMonthlyFeecenterDrpdwn();
	}

	@When("^Select School For Gender Monthly Fee Type$")
	public void select_School_For_Gender_Monthly_Fee_Type() throws Throwable {
		feeMasterEntry.genderMonthlySchoolDrpdwn();
	}

	@When("^Select Class For Gender Monthly Fee Type$")
	public void select_Class_For_Gender_Monthly_Fee_Type() throws Throwable {
		feeMasterEntry.genderMonthlyFeeclassDrpdwn();
	}

	@When("^Enter the amount for Male to verify Monthly fee$")
	public void enter_the_amount_for_Male_to_verify_Monthly_fee() throws Throwable {
		feeMasterEntry.MonthlymaleFee();
	}

	@When("^Enter the amount for Female to verify Monthly fee$")
	public void enter_the_amount_for_Female_to_verify_Monthly_fee() throws Throwable {
		feeMasterEntry.MonthlyFemaleFee();
	}

	@When("^Verify the added Gender Monthly fee type is assigned to the respective center and class$")
	public void verify_the_added_Gender_Monthly_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
		feeMasterEntry.GenderMonthlyAddedFee();
	}
	
	//Gender with monthly fee frequency
	
	@When("^Enter the Student name to verify Male Monthly Fee got reflected$")
	public void enter_the_Student_name_to_verify_Male_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		se.maleStudentMonthlyFee();
	}

	@When("^Enter the student Gender to verify Male Monthly Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Male_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		se.genderMaleformonthly();
	}

	@When("^headteacher enter the student name to verify Male Monthly Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Male_Monthly_Fee_got_reflected() throws Throwable {
		 helper();
		 hta.GenderMaleMonthly();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Male Monthly Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Male_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		hta.genderMaleMonthlyFee();
	}

	@When("^headteacher should navigate to feeinfo page to verify Male Monthly Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Male_Monthly_Fee_got_reflected() throws Throwable {
		 feeMasterEntry.IsGenderMaleMonthlyFeeInHTPage();
		 feeMasterEntry.maleMonthlyAmtVerificationInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Male Monthly Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Male_Monthly_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Male with Monthly fee frequency not get reflected in fee page before student active$")
	public void verify_the_newly_added_Male_with_Monthly_fee_frequency_not_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.GenderMaleMonthlylyInFeePageB4Active();
	}

	@When("^enter the student name to update the photo schedule and click camera icon to verify Male Monthly fee for Prerequiste$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_Male_Monthly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.updateToVerifyMaleMonthly();
	}

	@When("^enter the student name to upload photo and click on the view profile icon to verify Male Monthly fee for Prerequiste$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon_to_verify_Male_Monthly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.uploadStnNameToVfyMaleMonthlyFee();
	}

	@When("^Verify the new added gender Monthly fee frequency get reflected in fee page after student active$")
	public void verify_the_new_added_gender_Monthly_fee_frequency_get_reflected_in_fee_page_after_student_active() throws Throwable {
		feeMasterEntry.GenderMonthlyFeeBoxInFeePageafterActive();
	}
	
	
	//Female with monthly fee frequency
	
	@When("^Enter the Student name to verify Female Monthly Fee got reflected$")
	public void enter_the_Student_name_to_verify_Female_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		se.femaleStudentMonthlyFee();
	}

	@When("^Enter the student Gender to verify Female Monthly Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Female_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		se.genderFemaleformonthly();
	}

	@When("^headteacher enter the student name to verify Female Monthly Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Female_Monthly_Fee_got_reflected() throws Throwable {
		 helper();
		 hta.GenderFemaleMonthly();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Female Monthly Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Female_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		hta.genderFemaleMonthlyFee();
	}

	@When("^headteacher should navigate to feeinfo page to verify Female Monthly Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Female_Monthly_Fee_got_reflected() throws Throwable {
		 feeMasterEntry.IsGenderMaleMonthlyFeeInHTPage();
		 feeMasterEntry.FemaleMonthlyAmtVerificationInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Female Monthly Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Female_Monthly_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Female with Monthly fee frequency not get reflected in fee page before student active$")
	public void verify_the_newly_added_Female_with_Monthly_fee_frequency_not_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.GenderMaleMonthlylyInFeePageB4Active();
	}

	@When("^enter the student name to update the photo schedule and click camera icon to verify Female Monthly fee for Prerequiste$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_Female_Monthly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.updateToVerifyFemaleMonthly();
	}

	@When("^enter the student name to upload photo and click on the view profile icon to verify Female Monthly fee for Prerequiste$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon_to_verify_Female_Monthly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.uploadStnNameToVfyFemaleMonthlyFee();
	}

	@When("^Verify the new added Female Monthly fee frequency get reflected in fee page after student active$")
	public void verify_the_new_added_Female_Monthly_fee_frequency_get_reflected_in_fee_page_after_student_active() throws Throwable {
		feeMasterEntry.GenderMonthlyFeeBoxInFeePageafterActive();
	}
	
	//Gender with Termly Fee Frequency
	
	@When("^Enter the Fee Type name for Gender Fee type to verify Termly Frequency$")
	public void enter_the_Fee_Type_name_for_Gender_Fee_type_to_verify_Termly_Frequency() throws Throwable {
		 feeMasterEntry.GenderTermlyFee();
	}

	@When("^Verify that the New Added Gender Fee Type to verify Termly Frequency get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Gender_Fee_Type_to_verify_Termly_Frequency_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.GenderFeeTypeTermly();
	}
	
	//Gender Termly Fee Assignment
	
	@When("^Select newly added fee from the FeeType dropdown to verify Gender Termly fee test$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Gender_Termly_fee_test() throws Throwable {
		feeMasterEntry.genderTermlyFeeTypedrpdwn();
	}

	@When("^Select Academic Year for Gender Termly Fee Type$")
	public void select_Academic_Year_for_Gender_Termly_Fee_Type() throws Throwable {
		feeMasterEntry.GenderTermlyFeeacademicYrDrpdwn();
	}

	@When("^Select Center for Gender Termly Fee Type$")
	public void select_Center_for_Gender_Termly_Fee_Type() throws Throwable {
		feeMasterEntry.genderTermlyFeecenterDrpdwn();
	}

	@When("^Select School For Gender Termly Fee Type$")
	public void select_School_For_Gender_Termly_Fee_Type() throws Throwable {
		feeMasterEntry.genderTermlySchoolDrpdwn();
	}

	@When("^Select Class For Gender Termly Fee Type$")
	public void select_Class_For_Gender_Termly_Fee_Type() throws Throwable {
		feeMasterEntry.genderTermlyFeeclassDrpdwn();
	}

	@When("^Enter the amount for Male to verify Termly fee$")
	public void enter_the_amount_for_Male_to_verify_Termly_fee() throws Throwable {
		feeMasterEntry.TermlymaleFee();
	}

	@When("^Enter the amount for Female to verify Termly fee$")
	public void enter_the_amount_for_Female_to_verify_Termly_fee() throws Throwable {
		feeMasterEntry.TermlyFemaleFee();
	}

	@When("^Verify the added Gender Termly fee type is assigned to the respective center and class$")
	public void verify_the_added_Gender_Termly_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
		feeMasterEntry.GenderTermlyAddedFee();
	}
	
	//Male student with termly fee frequency
	
	@When("^Enter the Student name to verify Male Termly Fee got reflected$")
	public void enter_the_Student_name_to_verify_Male_Termly_Fee_got_reflected() throws Throwable {
		helper();
		se.MaleStudentTermlyFee();
	}

	@When("^Enter the student Gender to verify Male Termly Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Male_Termly_Fee_got_reflected() throws Throwable {
		helper();
		se.genderMaleforTermly();
	}

	@When("^headteacher enter the student name to verify Male Termly Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Male_Termly_Fee_got_reflected() throws Throwable {
		 helper();
		 hta.GenderMaleTermly();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Male Termly Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Male_Termly_Fee_got_reflected() throws Throwable {
		helper();
		hta.genderMaleTermlyFee();
	}

	@When("^headteacher should navigate to feeinfo page to verify Male Termly Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Male_Termly_Fee_got_reflected() throws Throwable {
		 feeMasterEntry.IsGenderMaleTermlyFeeInHTPage();
		 feeMasterEntry.maleTermlyAmtVerificationInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Male Termly Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Male_Termly_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Male with Termly fee frequency not get reflected in fee page before student active$")
	public void verify_the_newly_added_Male_with_Termly_fee_frequency_not_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.GenderMaleTermlyInFeePageB4Active();
	}

	@When("^enter the student name to update the photo schedule and click camera icon to verify Male Termly fee for Prerequiste$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_Male_Termly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.updateToVerifyMaleTermly();
	}

	@When("^enter the student name to upload photo and click on the view profile icon to verify Male Termly fee for Prerequiste$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon_to_verify_Male_Termly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.uploadStnNameToVfyMaleTermlyFee();
	}

	@When("^Verify the new added gender Termly fee frequency get reflected in fee page after student active$")
	public void verify_the_new_added_gender_Termly_fee_frequency_get_reflected_in_fee_page_after_student_active() throws Throwable {
		feeMasterEntry.GenderTermlyFeeBoxInFeePageafterActive();
	}
	
	//Female recruitment with termly fee frequency
	
	@When("^Enter the Student name to verify Female Termly Fee got reflected$")
	public void enter_the_Student_name_to_verify_Female_Termly_Fee_got_reflected() throws Throwable {
		helper();
		se.femaleStudentTermlyFee();
	}

	@When("^Enter the student Gender to verify Female Termly Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Female_Termly_Fee_got_reflected() throws Throwable {
		helper();
		se.genderFemaleforTermly();
	}

	@When("^headteacher enter the student name to verify Female Termly Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Female_Termly_Fee_got_reflected() throws Throwable {
		helper();
		 hta.GenderFemaleTermly();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Female Termly Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Female_Termly_Fee_got_reflected() throws Throwable {
		helper();
		hta.genderFemaleTermlyFee();
	}

	@When("^headteacher should navigate to feeinfo page to verify Female Termly Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Female_Termly_Fee_got_reflected() throws Throwable {
		 feeMasterEntry.IsGenderMaleTermlyFeeInHTPage();
		 feeMasterEntry.FemaleTermlyAmtVerificationInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Female Termly Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Female_Termly_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Female with Termly fee frequency not get reflected in fee page before student active$")
	public void verify_the_newly_added_Female_with_Termly_fee_frequency_not_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.GenderMaleTermlyInFeePageB4Active();
	}

	@When("^enter the student name to update the photo schedule and click camera icon to verify Female Termly fee for Prerequiste$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_Female_Termly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.updateToVerifyFemaleTermly();
	}

	@When("^enter the student name to upload photo and click on the view profile icon to verify Female Termly fee for Prerequiste$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon_to_verify_Female_Termly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.uploadStnNameToVfyFemaleTermlyFee();
	}

	@When("^Verify the new added Female Termly fee frequency get reflected in fee page after student active$")
	public void verify_the_new_added_Female_Termly_fee_frequency_get_reflected_in_fee_page_after_student_active() throws Throwable {
		feeMasterEntry.GenderTermlyFeeBoxInFeePageafterActive();
	}
	
	//Elder fee type
	
	@When("^Enter the Fee Type name for Elder Fee type to verify One Time Frequency$")
	public void enter_the_Fee_Type_name_for_Elder_Fee_type_to_verify_One_Time_Frequency() throws Throwable {
		 feeMasterEntry.ElderOneTimeFee();
	}

	@When("^Verify that the New Added Elder Fee Type to verify one Time Frequency get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Elder_Fee_Type_to_verify_one_Time_Frequency_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.ElderoneTime();
	}
	
	//Elder One Time Fee Assignment
	
	@When("^Select newly added fee from the FeeType dropdown to verify Elder One Time fee test$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Elder_One_Time_fee_test() throws Throwable {
		feeMasterEntry.ElderOneTimeFeeTypedrpdwn();
	}

	@When("^Select Academic Year for Elder One Time Fee Type$")
	public void select_Academic_Year_for_Elder_One_Time_Fee_Type() throws Throwable {
		feeMasterEntry.ElderOneTimeFeeacademicYrDrpdwn();
	}

	@When("^Select Center for Elder One Time Fee Type$")
	public void select_Center_for_Elder_One_Time_Fee_Type() throws Throwable {
		feeMasterEntry.elderOneTimeFeecenterDrpdwn();
	}

	@When("^Select School For Elder One Time Fee Type$")
	public void select_School_For_Elder_One_Time_Fee_Type() throws Throwable {
		feeMasterEntry.elderOneTimeSchoolDrpdwn();
	}

	@When("^Select Class For Elder One Time Fee Type$")
	public void select_Class_For_Elder_One_Time_Fee_Type() throws Throwable {
		feeMasterEntry.elderOneTimeFeeclassDrpdwn();
	}

	@When("^Select Is Elder Check Box$")
	public void select_Is_Elder_Check_Box() throws Throwable {
		feeMasterEntry.elderchkbox();
	}

	@When("^Enter the amount for Elder to verify One Time fee$")
	public void enter_the_amount_for_Elder_to_verify_One_Time_fee() throws Throwable {
		feeMasterEntry.ElderFee();
	}

	@When("^Enter the amount for Younger to verify One Time fee$")
	public void enter_the_amount_for_Younger_to_verify_One_Time_fee() throws Throwable {
		feeMasterEntry.YoungerFee();
	}

	@When("^Verify the added Elder One Time fee type is assigned to the respective center and class$")
	public void verify_the_added_Elder_One_Time_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
		feeMasterEntry.ElderOneTimeAddedFee();
	}
	
	//Elder Fee Recruitment
	
	
	@When("^Enter the Student name to verify Elder OneTime Fee got reflected$")
	public void enter_the_Student_name_to_verify_Elder_OneTime_Fee_got_reflected() throws Throwable {
		helper();
		se.ElderOneTimeFee();
	}

	@When("^Enter the student Gender to verify Elder OneTime Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Elder_OneTime_Fee_got_reflected() throws Throwable {
		helper();
		se.ElderOneTimegender();
	}

	@When("^headteacher enter the student name to verify Elder OneTime Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Elder_OneTime_Fee_got_reflected() throws Throwable {
		helper();
		 hta.HTElderOneTime();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Elder OneTime Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Elder_OneTime_Fee_got_reflected() throws Throwable {
		helper();
		hta.ElderclassFee();
	}

	@When("^headteacher should navigate to feeinfo page to verify Elder OneTime Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Elder_OneTime_Fee_got_reflected() throws Throwable {
		feeMasterEntry.GenderOneTimeFeeInHTPage();
		 feeMasterEntry.ElderFeeOneTimeFeeVrfyInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Elder OneTime Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Elder_OneTime_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Elder with OneTime fee frequency get reflected in fee page before student active$")
	public void verify_the_newly_added_Elder_with_OneTime_fee_frequency_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.ElderOneTimeAmtInFeePageB4Active();
	}

	//Younger One time Fee
	
	@When("^Enter the Student name to verify Younger OneTime Fee got reflected$")
	public void enter_the_Student_name_to_verify_Younger_OneTime_Fee_got_reflected() throws Throwable {
		helper();
		se.youngerOneTimeFee();
	}

	@When("^Enter the student Gender to verify Younger OneTime Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Younger_OneTime_Fee_got_reflected() throws Throwable {
		helper();
		se.youngerOneTimegender();
	}

	@When("^headteacher enter the student name to verify Younger OneTime Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Younger_OneTime_Fee_got_reflected() throws Throwable {
		helper();
		 hta.HTYoungerOneTime();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Younger OneTime Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Younger_OneTime_Fee_got_reflected() throws Throwable {
		helper();
		hta.youngerClassFee();
	}

	@When("^headteacher should navigate to feeinfo page to verify Younger OneTime Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Younger_OneTime_Fee_got_reflected() throws Throwable {
		feeMasterEntry.GenderOneTimeFeeInHTPage();
		 feeMasterEntry.youngerFeeOneTimeFeeVrfyInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.perFamilyenterswdetails();
	}

	@When("^Enter the Student name to verify Younger OneTime Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Younger_OneTime_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Younger with OneTime fee frequency get reflected in fee page before student active$")
	public void verify_the_newly_added_Younger_with_OneTime_fee_frequency_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.ElderOneTimeAmtInFeePageB4Active();
	}
	
	//Elder Monthly fee
	
	@When("^Enter the Fee Type name for Elder Fee type to verify Monthly Frequency$")
	public void enter_the_Fee_Type_name_for_Elder_Fee_type_to_verify_Monthly_Frequency() throws Throwable {
		 feeMasterEntry.ElderMonthlyFee();
	}

	@When("^Verify that the New Added Elder Fee Type to verify Monthly Frequency get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Elder_Fee_Type_to_verify_Monthly_Frequency_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.ElderMonthly();
	}
//Elder Monthly Fee Assignment
	
	@When("^Select newly added fee from the FeeType dropdown to verify Elder Monthly fee test$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Elder_Monthly_fee_test() throws Throwable {
		feeMasterEntry.ElderMonthlyTypedrpdwn();
	}

	@When("^Select Academic Year for Elder Monthly Fee Type$")
	public void select_Academic_Year_for_Elder_Monthly_Fee_Type() throws Throwable {
		feeMasterEntry.ElderMonthlyFeeacademicYrDrpdwn();
	}

	@When("^Select Center for Elder Monthly Fee Type$")
	public void select_Center_for_Elder_Monthly_Fee_Type() throws Throwable {
		feeMasterEntry.elderMonthlyFeecenterDrpdwn();
	}

	@When("^Select School For Elder Monthly Fee Type$")
	public void select_School_For_Elder_Monthly_Fee_Type() throws Throwable {
		feeMasterEntry.elderMonthlySchoolDrpdwn();
	}

	@When("^Select Class For Elder Monthly Fee Type$")
	public void select_Class_For_Elder_Monthly_Fee_Type() throws Throwable {
		feeMasterEntry.elderMonthlyFeeclassDrpdwn();
	}

	@When("^Enter the amount for Elder to verify Monthly fee$")
	public void enter_the_amount_for_Elder_to_verify_Monthly_fee() throws Throwable {
		feeMasterEntry.ElderMonthFee();
	}

	@When("^Enter the amount for Younger to verify Monthly fee$")
	public void enter_the_amount_for_Younger_to_verify_Monthly_fee() throws Throwable {
		feeMasterEntry.YoungerMonthFee();
	}

	@When("^Verify the added Elder Monthly fee type is assigned to the respective center and class$")
	public void verify_the_added_Elder_Monthly_fee_type_is_assigned_to_the_respective_center_and_class() throws Throwable {
		feeMasterEntry.ElderMonthAddedFee();
	}

//Elder Monthly Fee frequency student recruitment
	
	@When("^Enter the Student name to verify Elder Monthly Fee got reflected$")
	public void enter_the_Student_name_to_verify_Elder_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		se.elderMonthlyFee();
	}

	@When("^Enter the student Gender to verify Elder Monthly Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Elder_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		se.ElderMonthlygender();
	}

	@When("^headteacher enter the student name to verify Elder Monthly Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Elder_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		 hta.HTElderMonthly();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Elder Monthly Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Elder_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		hta.ElderMonthlyclassFee();
	}

	@When("^headteacher should navigate to feeinfo page to verify Elder Monthly Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Elder_Monthly_Fee_got_reflected() throws Throwable {
		feeMasterEntry.ElderMonthlyFeeInHTPage();
		 feeMasterEntry.ElderMonthlyFeeVrfyInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.enterswdetails();
	}

	@When("^Enter the Student name to verify Elder Monthly Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Elder_Monthly_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Elder with Monthly fee frequency not get reflected in fee page before student active$")
	public void verify_the_newly_added_Elder_with_Monthly_fee_frequency_not_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.ElderMonthlyAmtInFeePageB4Active();
	}

	@When("^enter the student name to update the photo schedule and click camera icon to verify Elder Monthly fee for Prerequiste$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_Elder_Monthly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.updateToVerifyElderMonthly();
	}

	@When("^enter the student name to upload photo and click on the view profile icon to verify Elder Monthly fee for Prerequiste$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon_to_verify_Elder_Monthly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.uploadStnNameToVfyElderMonthlyFee();
	}

	@When("^Verify the new added Elder Monthly fee frequency get reflected in fee page after student active$")
	public void verify_the_new_added_Elder_Monthly_fee_frequency_get_reflected_in_fee_page_after_student_active() throws Throwable {
		feeMasterEntry.ElderMonthlyFeeBoxInFeePageafterActive();
	}
	
	//Younger Recruitment to verify monthly fee
	
	@When("^Enter the Student name to verify Younger Monthly Fee got reflected$")
	public void enter_the_Student_name_to_verify_Younger_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		se.youngerMonthlyFee();
	}

	@When("^Enter the student Gender to verify Younger Monthly Fee got reflected$")
	public void enter_the_student_Gender_to_verify_Younger_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		se.youngerMonthlygender();
	}

	@When("^headteacher enter the student name to verify Younger Monthly Fee got reflected$")
	public void headteacher_enter_the_student_name_to_verify_Younger_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		 hta.HTyoungerrMonthly();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify Younger Monthly Fee got reflected$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_Younger_Monthly_Fee_got_reflected() throws Throwable {
		helper();
		hta.youngerMonthlyclassFee();
	}

	@When("^headteacher should navigate to feeinfo page to verify Younger Monthly Fee got reflected$")
	public void headteacher_should_navigate_to_feeinfo_page_to_verify_Younger_Monthly_Fee_got_reflected() throws Throwable {
		feeMasterEntry.ElderMonthlyFeeInHTPage();
		 feeMasterEntry.youngerMonthlyFeeVrfyInHTPage();
		  helper();
		  hta.feeinfo();
		  hta.perFamilyenterswdetails();
	}

	@When("^Enter the Student name to verify Younger Monthly Fee got reflected in fee page$")
	public void enter_the_Student_name_to_verify_Younger_Monthly_Fee_got_reflected_in_fee_page() throws Throwable {
		helper();
		aa.StudentNameForNewTermlyFeepayment();
	}

	@When("^Verify the newly added Younger with Monthly fee frequency not get reflected in fee page before student active$")
	public void verify_the_newly_added_Younger_with_Monthly_fee_frequency_not_get_reflected_in_fee_page_before_student_active() throws Throwable {
		feeMasterEntry.ElderMonthlyAmtInFeePageB4Active();
	}

	@When("^enter the student name to update the photo schedule and click camera icon to verify Younger Monthly fee for Prerequiste$")
	public void enter_the_student_name_to_update_the_photo_schedule_and_click_camera_icon_to_verify_Younger_Monthly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.updateToVerifyYoungerMonthly();
	}

	@When("^enter the student name to upload photo and click on the view profile icon to verify Younger Monthly fee for Prerequiste$")
	public void enter_the_student_name_to_upload_photo_and_click_on_the_view_profile_icon_to_verify_Younger_Monthly_fee_for_Prerequiste() throws Throwable {
		helper();
		su.uploadStnNameToVfyYoungerMonthlyFee();
	}

	@When("^Verify the new added Younger Monthly fee frequency get reflected in fee page after student active$")
	public void verify_the_new_added_Younger_Monthly_fee_frequency_get_reflected_in_fee_page_after_student_active() throws Throwable {
		feeMasterEntry.ElderMonthlyFeeBoxInFeePageafterActive();
	}
	
	//Delete fee from fee type list page
	
	@When("^Enter the Fee Type name to verify delete functionality$")
	public void enter_the_Fee_Type_name_to_verify_delete_functionality() throws Throwable {
		 feeMasterEntry.DeleteFeefrmListPage();
	}

	@When("^Verify that the New Added Fee Type for delete functionality get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Fee_Type_for_delete_functionality_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.deleteFrmListPage();
	}

	@When("^Navigate to the fee type list page$")
	public void navigate_to_the_fee_type_list_page() throws Throwable {
		feeMasterEntry.FeeTypeListPageNavigaion();
	}

	@When("^search the fee type to delete$")
	public void search_the_fee_type_to_delete() throws Throwable {
		feeMasterEntry.FeeTypeListSearch();
	}

	@When("^click delete button to delete the fee from FeeTypeList Page$")
	public void click_delete_button_to_delete_the_fee_from_FeeTypeList_Page() throws Throwable {
		feeMasterEntry.deleteFeeTypeListSearch();
	}
	
	@And("^Verify the Fee got deleted from the Fee List Page$")
	public void verify_the_Fee_got_deleted_from_the_Fee_List_Page() throws Throwable {
		feeMasterEntry.deleteFeeTypeListVrfy();
	}

	//Delete from Master Fee page 

	@When("^Enter the Fee Type name to verify Master Page Delete func$")
	public void enter_the_Fee_Type_name_to_verify_Master_Page_Delete_func() throws Throwable {
		feeMasterEntry.DeleteFeefrmMasterPage();
	}

	@When("^Select newly added fee from the FeeType dropdown to verify Master Page Delete func$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_Master_Page_Delete_func() throws Throwable {
		feeMasterEntry.selectFeeTypedrpdwn();
	}

	@When("^Select Academic Year to verify Master Page Delete func$")
	public void select_Academic_Year_to_verify_Master_Page_Delete_func() throws Throwable {
		feeMasterEntry.selAcademicYrDrpdwn();
	}

	@When("^Select Center to verify Master Page Delete func$")
	public void select_Center_to_verify_Master_Page_Delete_func() throws Throwable {
		feeMasterEntry.selFeecenterDrpdwn();
	}

	@When("^Select School to verify Master Page Delete func$")
	public void select_School_to_verify_Master_Page_Delete_func() throws Throwable {
		feeMasterEntry.selSchoolDrpdwn();
	}

	@When("^Select Class to verify Master Page Delete func$")
	public void select_Class_to_verify_Master_Page_Delete_func() throws Throwable {
		feeMasterEntry.selFeeclassDrpdwn();
	}

	@When("^Filter the fee type for the respective class and center to delete$")
	public void filter_the_fee_type_for_the_respective_class_and_center_to_delete() throws Throwable {
		feeMasterEntry.filterToDeleteFee();
	}

	@When("^select delete button$")
	public void select_delete_button() throws Throwable {
		feeMasterEntry.deleteFeeTypeMasterPage();
	}

	@When("^verify the fee got deleted for the corresponding class and center$")
	public void verify_the_fee_got_deleted_for_the_corresponding_class_and_center() throws Throwable {
		feeMasterEntry.deleteFeeTypevrfyMasterPage();
	}
	
	//Edit Master List Fee Page
	
	@When("^Enter the Fee Type name to verify List Page Edit func$")
	public void enter_the_Fee_Type_name_to_verify_List_Page_Edit_func() throws Throwable {
		feeMasterEntry.editFeefrmListPage();
	}

	@When("^Verify that the New Added Fee Type for edit functionality get reflected in Fee Type Dropdown$")
	public void verify_that_the_New_Added_Fee_Type_for_edit_functionality_get_reflected_in_Fee_Type_Dropdown() throws Throwable {
		feeMasterEntry.editFrmListPage();
	}

	@When("^search the fee type to edit$")
	public void search_the_fee_type_to_edit() throws Throwable {
		feeMasterEntry.FeeTypeListSearchToEdit();
	}

	@When("^Select edit button to edit the fee type$")
	public void select_edit_button_to_edit_the_fee_type() throws Throwable {
		feeMasterEntry.editFeeTypeListSearch();
	}
	
	

	@When("^search the edited fee type$")
	public void search_the_edited_fee_type() throws Throwable {
		feeMasterEntry.srchEditedFeeTypeListVrfy();
	}

	@When("^verify the edited fee tyope got reflected in the List page$")
	public void verify_the_edited_fee_tyope_got_reflected_in_the_List_page() throws Throwable {
		feeMasterEntry.editedFeeTypeListVrfy();
	}
	
	@When("^Verify the new fee structure got reflected$")
	public void verify_the_new_fee_structure_got_reflected() throws Throwable {
		feeMasterEntry.verifynewstructurefee();
	}
	
	//Delete All fee across centre
	
	@When("^Select Centre name to delete all the existing fee related to the centre$")
	public void select_Centre_name_to_delete_all_the_existing_fee_related_to_the_centre() throws Throwable {
		feeMasterEntry.testCentreToDeleteAllFee();
	}
	
	@When("^Verify for the existing fee and delete all fee$")
	public void verify_for_the_existing_fee_and_delete_all_fee() throws Throwable {
		feeMasterEntry.verifyExistingFee();
	}

	@When("^Enter the Student name to verify single Fee is present else unable to submit the recruitment form$")
	public void enter_the_Student_name_to_verify_single_Fee_is_present_else_unable_to_submit_the_recruitment_form() throws Throwable {
		helper();
		se.DeleteAllFeevrfy();
	}

	@When("^Enter the student Gender to verify single Fee is present else unable to submit the recruitment form$")
	public void enter_the_student_Gender_to_verify_single_Fee_is_present_else_unable_to_submit_the_recruitment_form() throws Throwable {
		helper();
		se.genderToVrfyDeleteAllFee();
	}

	@When("^headteacher enter the student name to verify single Fee is present else unable to submit the recruitment form$")
	public void headteacher_enter_the_student_name_to_verify_single_Fee_is_present_else_unable_to_submit_the_recruitment_form() throws Throwable {
		helper();
		 hta.EnterStdntToVerifyDeleteAllFee();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify single Fee is present else unable to submit the recruitment form$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_single_Fee_is_present_else_unable_to_submit_the_recruitment_form() throws Throwable {
		helper();
		hta.EnterClassToVerifyDeleteAllFee();
	}

	@When("^verify Without any fee HT should not allow to submit the form$")
	public void verify_Without_any_fee_HT_should_not_allow_to_submit_the_form() throws Throwable {
		feeMasterEntry.verifyHTSubmitForm();
	}
	
//Added new fee type got reflected to all centres
	
	@When("^Enter the Fee Type name to add for all centres$")
	public void enter_the_Fee_Type_name_to_add_for_all_centres() throws Throwable {
		feeMasterEntry.NewFeeNmetovrfyAllCentres();
	}

	
	@When("^Select newly added fee from the FeeType dropdown to allocate for all centres$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_allocate_for_all_centres() throws Throwable {
		 feeMasterEntry.NewFeeForAllCentre();
	}

	@When("^Select Center as All$")
	public void select_Center_as_All() throws Throwable {
		feeMasterEntry.selectAllCentre();
	}

	@When("^Select School as All$")
	public void select_School_as_All() throws Throwable {
	   feeMasterEntry.selectAllSchool();
	}

	@When("^Select Class as All$")
	public void select_Class_as_All() throws Throwable {
	  feeMasterEntry.selectAllClass();
	}

	@When("^Verify the added fee type is assigned to the all center$")
	public void verify_the_added_fee_type_is_assigned_to_the_all_center() throws Throwable {
	  feeMasterEntry.verifyAddedFeeAcrossAllCentre();
	  feeMasterEntry.verifyFeeAddedForAllCentre();
	}
	
	//New Fee
	
	@When("^Enter the Fee Type name to verify editable$")
	public void enter_the_Fee_Type_name_to_verify_editable() throws Throwable {
		feeMasterEntry.NewFeeNmetovrfyEditable();
	}
	
	@When("^Select newly added fee from the FeeType dropdown to verify editable$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_editable() throws Throwable {
		 feeMasterEntry.NewFeeAddedEditable();
	}

	@When("^Select Center to verify editable$")
	public void select_Center_to_verify_editable() throws Throwable {
		feeMasterEntry.selFeecenterToVerifyEditable();
	}

	@When("^Select School to verify editable$")
	public void select_School_to_verify_editable() throws Throwable {
		feeMasterEntry.selSchoolDrpdwnToVerifyEditable();
	}

	@When("^Select Class to verify editable$")
	public void select_Class_to_verify_editable() throws Throwable {
		feeMasterEntry.classDrpdwnToVerifyEditable();
	}

	@When("^Enter the Student name to verify the new Fee Type got reflected and editable$")
	public void enter_the_Student_name_to_verify_the_new_Fee_Type_got_reflected_and_editable() throws Throwable {
		helper();
		se.studentNameNewFeeTypeToVerifyEditable();
	}

	@When("^Enter the student Gender to verify new fee is editable$")
	public void enter_the_student_Gender_to_verify_new_fee_is_editable() throws Throwable {
		helper();
		se.genderToVrfyEditable();
	}

	@When("^headteacher enter the student name to verify new fee type get reflected or not and editable$")
	public void headteacher_enter_the_student_name_to_verify_new_fee_type_get_reflected_or_not_and_editable() throws Throwable {
		helper();
		 hta.EnterStdntToVerifyEditable();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify new fee type get reflected or not and editable$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_new_fee_type_get_reflected_or_not_and_editable() throws Throwable {
		helper();
		hta.EnterClassToVerifyEditable();
	}

	@When("^Verify that the New Added Fee Type get reflected in Fee Type Dropdown to verify editable$")
	public void verify_that_the_New_Added_Fee_Type_get_reflected_in_Fee_Type_Dropdown_to_verify_editable() throws Throwable {
		feeMasterEntry.NewFeeEditable();
		  
	}
	
	//Non Editable Fee Check
	
	@When("^Enter the Fee Type name to verify non editable$")
	public void enter_the_Fee_Type_name_to_verify_non_editable() throws Throwable {
		feeMasterEntry.NewFeeNmetovrfyNonEditable();
	}

	@When("^Select newly added fee from the FeeType dropdown to verify non editable$")
	public void select_newly_added_fee_from_the_FeeType_dropdown_to_verify_non_editable() throws Throwable {
		 feeMasterEntry.NewFeeAddedNonEditable();
	}

	@When("^Select Center to verify non editable$")
	public void select_Center_to_verify_non_editable() throws Throwable {
		feeMasterEntry.selFeecenterToVerifyNonEditable();
	}

	@When("^Select School to verify non editable$")
	public void select_School_to_verify_non_editable() throws Throwable {
		feeMasterEntry.selSchoolDrpdwnToVerifyNonEditable();
	}

	@When("^Select Class to verify non editable$")
	public void select_Class_to_verify_non_editable() throws Throwable {
		feeMasterEntry.classDrpdwnToVerifyNonEditable();
	}

	@When("^Enter the Student name to verify the new Fee Type got reflected and non editable$")
	public void enter_the_Student_name_to_verify_the_new_Fee_Type_got_reflected_and_non_editable() throws Throwable {
		helper();
		se.studentNameNewFeeTypeToVerifyNonEditable();
	}

	@When("^Enter the student Gender to verify new fee is non editable$")
	public void enter_the_student_Gender_to_verify_new_fee_is_non_editable() throws Throwable {
		helper();
		se.genderToVrfyNonEditable();
	}

	@When("^headteacher enter the student name to verify new fee type get reflected or not and non editable$")
	public void headteacher_enter_the_student_name_to_verify_new_fee_type_get_reflected_or_not_and_non_editable() throws Throwable {
		helper();
		hta.EnterStdntToVerifyNonEditable();
	}

	@When("^headteacher should navigate to schoolinfo page and save the schoolinfo to verify new fee type get reflected and non editable$")
	public void headteacher_should_navigate_to_schoolinfo_page_and_save_the_schoolinfo_to_verify_new_fee_type_get_reflected_and_non_editable() throws Throwable {
		helper();
		hta.EnterClassToVerifyNonEditable();
	}

	@When("^Verify that the New Added Fee Type get reflected in Fee Type Dropdown to verify non editable$")
	public void verify_that_the_New_Added_Fee_Type_get_reflected_in_Fee_Type_Dropdown_to_verify_non_editable() throws Throwable {
		feeMasterEntry.NewFeeNonEditable();
	}
//Toast message verification
	
	@When("^Select any Existing Fee type$")
	public void select_any_Existing_Fee_type() throws Throwable {
		feeMasterEntry.ExistingFeeType();
	}

	@When("^verify Toast fee message got dispalyed$")
	public void verify_Toast_fee_message_got_dispalyed() throws Throwable {
		feeMasterEntry.ToastMessageVerification();
		feeMasterEntry.closeScreen();
	}
	
//Fee Assignment checkbox verification
	
	@When("^Select ISElder Check Box$")
	public void select_ISElder_Check_Box() throws Throwable {
		feeMasterEntry.ElderCheckBox();
	}

	@When("^Select IsGender Check Box$")
	public void select_IsGender_Check_Box() throws Throwable {
		feeMasterEntry.GenderCheckBox();
	}

	@When("^Select PerFamily CheckBox$")
	public void select_PerFamily_CheckBox() throws Throwable {
		feeMasterEntry.perFamilyCheckBox();
	}
	
	@When("^Select OneTime CheckBox$")
	public void select_OneTime_CheckBox() throws Throwable {
		feeMasterEntry.OneTimeCheckBox();
	}

	@When("^Select Monthly CheckBox$")
	public void select_Monthly_CheckBox() throws Throwable {
		feeMasterEntry.monthlyCheckBox();
	}

	@When("^Select Yearly CheckBox$")
	public void select_Yearly_CheckBox() throws Throwable {
		feeMasterEntry.yearlyCheckBox();
	}

	@When("^Select Termly$")
	public void select_Termly() throws Throwable {
		feeMasterEntry.termlyCheckBox();
		feeMasterEntry.closeScreen();
	}
	
	// Excess Fee Validation
	
	
	
	@And("^Select All Students From My Report$")
	public void select_All_Students_From_My_Report() throws Throwable {
		helper();
		feeMasterEntry.AllStudentLink();
	}

	@And("^Select the status as Approved$")
	public void select_the_status_as_Approved() throws Throwable {
	   feeMasterEntry.Statusdrpdwn();
	}

	@And("^click search button$")
	public void click_search_button() throws Throwable {
		helper();
	    feeMasterEntry.search();
	}

	@And("^Click Student fee deposit icon$")
	public void click_Student_fee_deposit_icon() throws Throwable {
	   feeMasterEntry.FeeDepositIcon();
	}

	@And("^Click Pay amount icon To pay the fee$")
	public void click_Pay_amount_icon_To_pay_the_fee() throws Throwable {
	   feeMasterEntry.PayAmt();
	   feeMasterEntry.ExcessAmt();
	}

	@And("^enter the Excess amout and verify not allowed$")
	public void enter_the_Excess_amout_and_verify_not_allowed() throws Throwable {
	    feeMasterEntry.ErrorMsg();
	}
	

}
