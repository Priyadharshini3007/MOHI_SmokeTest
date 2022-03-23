package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.util.concurrent.TimeUnit;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StudentEntry {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public StudentEntry() {

		PageFactory.initElements(getDriver(), this);
	}

	/////////////////////////////// CHILD
	/////////////////////////////// INFO////////////////////////////////////////////////////

	@FindBy(linkText = "Student")
	WebElement studentMainMenu;

	@FindBy(partialLinkText = "Entry")
	WebElement studentEntrySubMenu;

	@FindBy(id = "ChildFirstName")
	WebElement childfirstname;

	@FindBy(id = "ChildMiddleName")
	WebElement childmiddlename;

	@FindBy(id = "ChildLastName")
	WebElement childlastname;

	@FindBy(id = "DOB")
	WebElement dob;

	@FindBy(xpath = "//input[@id='GenderID'and @value='1']")
	WebElement gendermale;

	@FindBy(xpath = "//input[@id='GenderID'and @value='2']")
	WebElement genderfemale;

	@FindBy(xpath = "//input[@id='BirthCertificate'and @value='True']")
	WebElement birthcertificate;

	@FindBy(xpath = "//input[@id='BirthCertificateNo'and @type='text']")
	WebElement birthcertificateno;

	@FindBy(xpath = "//input[@id='BirthCertificate'and @value='False']")
	WebElement nobirthcertificate;

	@FindBy(xpath = "//input[@id='BCRecDate'and @class='newdate input-group']")
	WebElement receiveddate;

	@FindBy(xpath = "//input[@id='HealthConditionID'and @name='HealthConditionID'and @value='3']")
	WebElement healthconditionid;// good

	@FindBy(xpath = "//input[@id='HealthConditionID'and @name='HealthConditionID'and @value='4']")
	WebElement healthconditionid1;// required help

	@FindBy(xpath = "//textarea[@id='HealthConditionComment']")
	WebElement healthconditioncomment;

	@FindBy(xpath = "//input[@id='ChildStatusID' and @value='247']") // orphan
	WebElement orphanchild;

	@FindBy(xpath = "//input[@id='ChildStatusID' and @value='248']") // single
																		// father
	WebElement singlefatherchild;

	@FindBy(xpath = "//input[@id='ChildStatusID' and @value='249']") // single
																		// mother
	WebElement singlemotherchild;

	@FindBy(xpath = "//input[@id='ChildStatusID' and @value='250']") // BothParents
	WebElement bothparentschild;

	@FindBy(xpath = "//input[@id='ChildStatusID' and @value='665']") // Guardian
	WebElement Guardianchild;

	@FindBy(xpath = "//input[@id='PhysicalConditionID' and @value='5']")
	WebElement goodphysicalcondition;// Good

	@FindBy(xpath = "//input[@id='PhysicalConditionID' and @value='6']")
	WebElement requiredhelpphysicalcondition;// Required Help

	@FindBy(xpath = "//textarea[@id='PhysicalConditionComment' and @name='PhysicalConditionComment']")
	WebElement physicalconditioncomment;

	@FindBy(xpath = "//input[@id='PhysicallyDisabled' and @value='True']") // Physically
																			// disable"Yes"
	WebElement physicallydisabled;

	@FindBy(xpath = "//input[@id='PhysicallyDisabled' and @value='False']") // Physically
																			// disable
																			// "No"
	WebElement nophysicallydisabled;

	@FindBy(xpath = "//input[@id='LearningDisability' and @value='True']") // Learning
																			// disability
																			// "Yes"
	WebElement learningdisability;

	@FindBy(xpath = "//input[@id='LearningDisability' and @value='False']") // Learning
																			// disability
																			// "No"
	WebElement nolearningdisability;

	@FindBy(xpath = "//select[@class='Required' and @id='FutureAspirationID']")
	WebElement futureaspirationid;

	@FindBy(id = "FavoriteSubjectID")
	WebElement favouritesubject;

	@FindBy(id = "FavoriteSportActivityID")
	WebElement favouritesport;

	@FindBy(id = "AdditionalInfo")
	WebElement additionalinfo;

	@FindBy(xpath = "//*[@id='ChildInfoSave']/button[2]")
	WebElement saveandgotonext;

	//////////////////////////////////////// FAMILY
	//////////////////////////////////////// INFO///////////////////////////////////////////////////////////

	@FindBy(xpath = "//input[@id='IsSiblingInfo' and @value='true']")
	WebElement issiblingyes;

	@FindBy(xpath = "//*[@id='TxtStudent']")
	WebElement entersib;

	@FindBy(xpath = "//button[@id='btok']")
	WebElement clickok;

	@FindBy(xpath = "//textarea[@id='ParentAddress1']")
	WebElement Address;

	@FindBy(xpath = "//select[@id='ParentCity']")
	WebElement selectcity;

	@FindBy(id = "FamilyReligion")
	WebElement familyreligion;

	@FindBy(xpath = "//input[@id='FamilyBelongsToChurch' and @value='true']")
	WebElement sfamilybelongstochurch;// Yes

	@FindBy(xpath = "//textarea[@id='ChurchInformation']")
	WebElement churchdetail;// church detail

	@FindBy(xpath = "//input[@id='FamilyBelongsToChurch' and @value='false']")
	WebElement familybelongstochurch;// no

	@FindBy(id = "FamilySize")
	WebElement familysize;

	@FindBy(id = "MonthlyIncome")
	WebElement monthlyincome;

	@FindBy(id = "MonthlyExpenditure")
	WebElement monthlyexpenditure;

	@FindBy(id = "NeighborhoodInfo")
	WebElement neighborhoodInfo;

	@FindBy(xpath = "//div[@id='FamilyInfoSave']//button[@value='Save & Go To Next']")
	WebElement saveandgo;

	///////////////////////////////////// FAMILY MEMBER
	///////////////////////////////////// INFO//////////////////////////////////////////////////

	@FindBy(id = "AddParentGuardian")
	WebElement addparent;

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement parentfirstname;

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement guardianfirstname;// if the child is orphan

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement motherfirstname;// if the child is having mother

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement parentlastname;

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement guardianlastname;// if the child is orphan

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement motherlastname;// if the child is having mother alone

	@FindBy(xpath = "//input[@id='GenderID' and @data-item='Male']")
	WebElement parentsmgender;// male

	@FindBy(xpath = "//input[@id='GenderID' and @data-item='Male']")
	WebElement guardianmgender;// if the child is orphan

	@FindBy(xpath = "//input[@id='GenderID' and @data-item='Male']")
	WebElement mothermgender;// if the child is having mother

	@FindBy(xpath = "//input[@id='GenderID' and @data-item='Female']")
	WebElement parentsfgender;// female

	@FindBy(xpath = "//input[@id='GenderID' and @data-item='Female']")
	WebElement motherfgender;// if the child is having mother alone

	@FindBy(xpath = "//input[@id='GenderID' and @data-item='Female']")
	WebElement guardianfgender;// if the child is orphan

	@FindBy(xpath = "//select[@id='FamilyRoleID']")
	WebElement familyrole;

	@FindBy(xpath = "//select[@id='FamilyRoleID']")
	WebElement motherfamilyrole;// if the child is having mother alone

	@FindBy(xpath = "//select[@id='FamilyRoleID']")
	WebElement guardianfamilyrole;// if the child is orphan

	@FindBy(xpath = "//select[@id='ddlCareer']")
	WebElement career;

	@FindBy(xpath = "//select[@id='ddlCareer']")
	WebElement guardiancareer;// if the child is orphan

	@FindBy(xpath = "//select[@id='ddlCareer']")
	WebElement mothercareer;// if the child is having mother alone

	@FindBy(xpath = "//button[@id='btnSaveParent']")
	WebElement save;

	@FindBy(xpath = "//div[@id='FamilyMemberInfoSave']//button[@value='Save & Go To Next']")
	WebElement gotonext;

	/////////////////////////////////////////// SCHOOL
	/////////////////////////////////////////// INFO///////////////////////////////////////////////////

	@FindBy(xpath = "//select[@id='ddlSchools']")
	WebElement schoolname;

	@FindBy(xpath = "//select[@id='ddlSchoolTypes']")
	WebElement schooltype;

	@FindBy(xpath = "//input[@id='StudentStartDate' and @type!='hidden']")
	WebElement startdate;

	@FindBy(xpath = "//input[@id='IsSelfSponsored' and @value='True']")
	WebElement selfsponsored;// yes

	@FindBy(xpath = "//div[@id='SchoolInfoSave']//button[@value='Save & Go To Next']")
	WebElement saveandgo1;

	@FindBy(xpath = "//*[@id='userDropdownMenuLink']")
	WebElement socialworkerlogout;
	@FindBy(xpath = "(//a[@id='PayButton'])[1]")
	WebElement aaAdmissionFeePayment;// for clicking the admissionfee payment

	// Child Info

	public void studentmenu() throws InterruptedException {

		studentMainMenu.click();
		studentEntrySubMenu.click();

	}

	///////////////////////////////// Child Info////////////////////////////
	public void studentname() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(0, 1, 0));

		childmiddlename.sendKeys(excelutil.getData(0, 1, 1));

		childlastname.sendKeys(excelutil.getData(0, 1, 2));

	}

	public void studentnamehtsendforClarification() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(0, 2, 0));

		childmiddlename.sendKeys(excelutil.getData(0, 2, 1));

		childlastname.sendKeys(excelutil.getData(0, 2, 2));

	}

	public void studentnamecscsendforClarification() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(0, 3, 0));

		childmiddlename.sendKeys(excelutil.getData(0, 3, 1));

		childlastname.sendKeys(excelutil.getData(0, 3, 2));

	}

	public void studentnamecscsendforClarificationtosw() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(0, 5, 0));

		childmiddlename.sendKeys(excelutil.getData(0, 5, 1));

		childlastname.sendKeys(excelutil.getData(0, 5, 2));

	}

	public void studentnamecsmsendforClarificationtosw() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(0, 6, 0));

		childmiddlename.sendKeys(excelutil.getData(0, 6, 1));

		childlastname.sendKeys(excelutil.getData(0, 6, 2));

	}

	public void studentnamecsmsendforClarification() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(0, 4, 0));

		childmiddlename.sendKeys(excelutil.getData(0, 4, 1));

		childlastname.sendKeys(excelutil.getData(0, 4, 2));

	}

	public void studentnameHTDenied() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(0, 7, 0));

		childmiddlename.sendKeys(excelutil.getData(0, 7, 1));

		childlastname.sendKeys(excelutil.getData(0, 7, 2));

	}

	public void studentnameCSCDenied() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(0, 8, 0));

		childmiddlename.sendKeys(excelutil.getData(0, 8, 1));

		childlastname.sendKeys(excelutil.getData(0, 8, 2));

	}

	public void studentnameCSMDenied() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(0, 9, 0));

		childmiddlename.sendKeys(excelutil.getData(0, 9, 1));

		childlastname.sendKeys(excelutil.getData(0, 9, 2));

	}

	public void studentNameNewFeeType() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 4, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 4, 1));

		childlastname.sendKeys(excelutil.getData(38, 4, 2));

	}
	
	public void studentNameNewFeeTypeToVerifyEditable() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 93, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 93, 1));

		childlastname.sendKeys(excelutil.getData(38, 93, 2));

	}
	
	public void studentNameNewFeeTypeToVerifyNonEditable() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 97, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 97, 1));

		childlastname.sendKeys(excelutil.getData(38, 97, 2));

	}

	public void studentNameNewYrlyFeeType() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 8, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 8, 1));

		childlastname.sendKeys(excelutil.getData(38, 8, 2));

	}

	public void studentNameNewMonthlyFeeType() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 12, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 12, 1));

		childlastname.sendKeys(excelutil.getData(38, 12, 2));

	}

	public void studentNameNewTermlyFeeType() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 16, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 16, 1));

		childlastname.sendKeys(excelutil.getData(38, 16, 2));

	}
	
	public void studentNamePerFamilyMonthlyPreRequiste() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 32, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 32, 1));

		childlastname.sendKeys(excelutil.getData(38, 32, 2));

	}
	
	public void studentNamePerFamilyTermlyPreRequiste() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 38, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 38, 1));

		childlastname.sendKeys(excelutil.getData(38, 38, 2));

	}
	
	public void studentNamePerFamilyTermly() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 40, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 40, 1));

		childlastname.sendKeys(excelutil.getData(38, 40, 2));

	}
	
	public void maleStudentOneTimeFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 44, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 44, 1));

		childlastname.sendKeys(excelutil.getData(38, 44, 2));

	}
	
	public void maleStudentYearlyFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 50, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 50, 1));

		childlastname.sendKeys(excelutil.getData(38, 50, 2));

	}
	
	public void maleStudentMonthlyFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 56, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 56, 1));

		childlastname.sendKeys(excelutil.getData(38, 56, 2));

	}
	
	public void femaleStudentMonthlyFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 58, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 58, 1));

		childlastname.sendKeys(excelutil.getData(38, 58, 2));

	}
	
	public void femaleStudentTermlyFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 64, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 64, 1));

		childlastname.sendKeys(excelutil.getData(38, 64, 2));

	}
	
	public void elderMonthlyFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 74, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 74, 1));

		childlastname.sendKeys(excelutil.getData(38, 74, 2));

	}
	
	public void youngerMonthlyFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 76, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 76, 1));

		childlastname.sendKeys(excelutil.getData(38, 76, 2));

	}
	
	public void DeleteAllFeevrfy() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 87, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 87, 1));

		childlastname.sendKeys(excelutil.getData(38, 87, 2));

	}
	
	public void ElderOneTimeFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 68, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 68, 1));

		childlastname.sendKeys(excelutil.getData(38, 68, 2));

	}
	
	public void youngerOneTimeFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 70, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 70, 1));

		childlastname.sendKeys(excelutil.getData(38, 70, 2));

	}
	
	public void MaleStudentTermlyFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 62, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 62, 1));

		childlastname.sendKeys(excelutil.getData(38, 62, 2));

	}
	
	public void femaleStudentYearlyFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 52, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 52, 1));

		childlastname.sendKeys(excelutil.getData(38, 52, 2));

	}
	
	public void FemaleStudentOneTimeFee() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 46, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 46, 1));

		childlastname.sendKeys(excelutil.getData(38, 46, 2));

	}

	public void PreRequisteStudent() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 20, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 20, 1));

		childlastname.sendKeys(excelutil.getData(38, 20, 2));

	}
	
	public void PreRequistePerFamilyYearlyFeeStudent() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 26, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 26, 1));

		childlastname.sendKeys(excelutil.getData(38, 26, 2));

	}
	
	public void siblingStudentPerFamilyOneTime() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 22, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 22, 1));

		childlastname.sendKeys(excelutil.getData(38, 22, 2));

	}
	
	public void siblingStudentPerFamilyYearly() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 28, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 28, 1));

		childlastname.sendKeys(excelutil.getData(38, 28, 2));

	}
	
	public void siblingStudentPerFamilyMonthly() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");
		childfirstname.sendKeys(excelutil.getData(38, 34, 0));

		childmiddlename.sendKeys(excelutil.getData(38, 34, 1));

		childlastname.sendKeys(excelutil.getData(38, 34, 2));

	}

	public void studentdob() throws InterruptedException {

		dob.click();

		String date = excelutil.getData(0, 1, 3);
		String monthyear, day;
		String dateArray[] = date.split("-");
		day = dateArray[0];
		monthyear = dateArray[1] + " " + dateArray[2];
		// String month = "July 2010";
		// System.out.println(monthyear);
		// System.out.println(day);

		while (true) {

			String text = getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[2]"))
					.getText();

			if (text.equals(monthyear)) {
				break;
			} else {

				getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
		}
		getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[contains(text()," + day + ")]"))
				.click();

	}

	public void studentgender() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(0, 1, 4);
		genderselect(text1, gender1);
	}

	public void genderforNewOneTimeFee() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 4, 4);
		genderselect(text1, gender1);
	}

	public void genderforYearlyTimeFee() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 8, 4);
		genderselect(text1, gender1);
	}

	public void genderforMonthlyTimeFee() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 12, 4);
		genderselect(text1, gender1);
	}

	public void genderforTermlyFee() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 16, 4);
		genderselect(text1, gender1);
	}
	
	public void genderforPerFamilyMonthlyFeePreRequiste() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 32, 4);
		genderselect(text1, gender1);
	}
	
	public void genderforPerFamilyTermlyFeePreRequiste() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 38, 4);
		genderselect(text1, gender1);
	}
	
	public void genderforPerFamilyTermlyFee() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 40, 4);
		genderselect(text1, gender1);
	}

	
	public void genderMaleforOneTimeFee() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 44, 4);
		genderselect(text1, gender1);
	}
	
	public void genderMaleforyearly() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 50, 4);
		genderselect(text1, gender1);
	}
	
	public void genderMaleformonthly() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 56, 4);
		genderselect(text1, gender1);
	}
	
	public void genderMaleforTermly() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 62, 4);
		genderselect(text1, gender1);
	}
	
	public void genderFemaleformonthly() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 58, 4);
		genderselect(text1, gender1);
	}
	
	public void genderFemaleforTermly() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 64, 4);
		genderselect(text1, gender1);
	}
	
	public void ElderOneTimegender() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 68, 4);
		genderselect(text1, gender1);
	}
	
	public void ElderMonthlygender() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 74, 4);
		genderselect(text1, gender1);
	}
	
	public void youngerMonthlygender() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 76, 4);
		genderselect(text1, gender1);
	}
	
	public void genderToVrfyDeleteAllFee() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 87, 4);
		genderselect(text1, gender1);
	}
	
	public void genderToVrfyEditable() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 93, 4);
		genderselect(text1, gender1);
	}
	
	public void genderToVrfyNonEditable() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 97, 4);
		genderselect(text1, gender1);
	}
	
	public void youngerOneTimegender() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 70, 4);
		genderselect(text1, gender1);
	}
	
	public void genderFemaleforyearly() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 52, 4);
		genderselect(text1, gender1);
	}
	
	public void genderFemaleforMonthy() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 56, 4);
		genderselect(text1, gender1);
	}
	
	public void genderFemaleforOneTimeFee() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 46, 4);
		genderselect(text1, gender1);
	}

	public void genderforPreRequiste() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 20, 4);
		genderselect(text1, gender1);
	}
	
	public void genderforPerFamilyYearlyPreRequiste() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 26, 4);
		genderselect(text1, gender1);
	}

	
	public void genderforSiblingPerFamilyOneTime() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 22, 4);
		genderselect(text1, gender1);
	}
	
	public void genderforSiblingPerFamilyYearly() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 28, 4);
		genderselect(text1, gender1);
	}
	
	public void genderforSiblingPerFamilyMonthly() throws InterruptedException {

		String text1 = "Male";
		String gender1 = excelutil.getData(38, 34, 4);
		genderselect(text1, gender1);
	}

	public void studentdetails() throws InterruptedException {

		String birthcert = "Yes";
		String birthexcel = excelutil.getData(0, 1, 5);
		certificateselect(birthcert, birthexcel);

		JavascriptExecutor scrolldown = (JavascriptExecutor) getDriver();
		scrolldown.executeScript("window.scrollBy(0,1000)");

		String healthcond = "Good";
		String healthcondexcel = excelutil.getData(0, 1, 6);
		healthcondselect(healthcond, healthcondexcel);

		healthconditioncomment.sendKeys(excelutil.getData(0, 1, 9));

		String childstat = "Orphan";
		String childexcel = excelutil.getData(0, 1, 10);
		childstatselect(childstat, childexcel);

		JavascriptExecutor scrollup = (JavascriptExecutor) getDriver();
		scrollup.executeScript("window.scrollBy(0,-1000)");

		String phycond = "Good";
		String phycondexcel = excelutil.getData(0, 1, 11);
		phycondselect(phycond, phycondexcel);

		physicalconditioncomment.sendKeys(excelutil.getData(0, 1, 12));

		String phydisabled = "Yes";
		String phydisabledexcel = excelutil.getData(0, 1, 13);
		phydisableselect(phydisabled, phydisabledexcel);

		String learningdisabled = "Yes";
		String learningdisabledexcel = excelutil.getData(0, 1, 14);
		learndisableselect(learningdisabled, learningdisabledexcel);

		Select selectaspirationid = new Select(futureaspirationid);
		selectaspirationid.selectByVisibleText(excelutil.getData(0, 1, 15));

		Select selectsub = new Select(favouritesubject);
		selectsub.selectByVisibleText(excelutil.getData(0, 1, 16));

		Select favsport = new Select(favouritesport);
		favsport.selectByVisibleText(excelutil.getData(0, 1, 17));

		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("window.scrollBy(0,1000)");

		additionalinfo.sendKeys(excelutil.getData(0, 1, 18));

		saveandgotonext.click();
		

	}

	/////////////////////////////// Family
	/////////////////////////////// info////////////////////////////////////////
	public void Sibling() throws InterruptedException {

		String sib = "Yes";
		String sibexcel = excelutil.getData(1, 1, 0);
		sibselect(sib, sibexcel);
	}

	public void SiblingForPerFamily() throws InterruptedException {

		String sib = "Yes";
		String sibexcel = excelutil.getData(38, 22, 6);
		sibselect(sib, sibexcel);
	}

	// Address.sendKeys(excelutil.getData(1, 1, 2));
	// Select Selectcity = new Select(selectcity);
	// Selectcity.selectByVisibleText(excelutil.getData(1, 1, 3));
	//
	// Select fr = new Select(familyreligion);
	// fr.selectByVisibleText(excelutil.getData(1, 1, 4));
	//
	// String church = "Yes";
	// String churchexcel = excelutil.getData(1, 1, 5);
	// churchselect(church, churchexcel);
	//
	// familysize.sendKeys(excelutil.getData(1, 1, 7));
	//
	// monthlyincome.sendKeys(excelutil.getData(1, 1, 8));
	//
	// monthlyexpenditure.sendKeys(excelutil.getData(1, 1, 9));
	//
	// Select neighbor = new Select(neighborhoodInfo);
	// neighbor.selectByVisibleText(excelutil.getData(1, 1, 10));
	//
	// JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
	// js2.executeScript("window.scrollBy(0,1000)");
	//
	// saveandgo.click();
	//
	// }

	////////////////////////// FamilyMemberInfo
	////////////////////////// ////////////////////////////////////

	// Add parent for orphan
	public void ParentInfo() throws InterruptedException {

		String sib = "Yes";
		String sibexcel = excelutil.getData(1, 1, 0);

		String childexcel1 = excelutil.getData(0, 1, 10);
		String Childstatchk = "Orphan";

		String childexcel2 = excelutil.getData(0, 1, 10);
		String Childstatchk2 = "Single father";

		String childexcel3 = excelutil.getData(0, 1, 10);
		String Childstatchk3 = "Single mother";

		String childexcel4 = excelutil.getData(0, 1, 10);
		String Childstatchk4 = "Both parents";

		if (sib.equals(sibexcel)) {

			WebElementUtils.scrolltoview(gotonext);
			gotonext.click();

		} else if (childexcel1.equals(Childstatchk)) {

			Thread.sleep(2000);
			
			addparent.click();
			
			Thread.sleep(2000);

			guardianfirstname.sendKeys(excelutil.getData(2, 1, 5));

			guardianlastname.sendKeys(excelutil.getData(2, 1, 6));

			String guardgen = " Male";
			String guardgenexcel = excelutil.getData(2, 1, 7);
			guardgenselect(guardgen, guardgenexcel);

			Select gfmr = new Select(guardianfamilyrole);
			gfmr.selectByVisibleText(excelutil.getData(2, 1, 8));

			Select gcr = new Select(guardiancareer);
			gcr.selectByVisibleText(excelutil.getData(2, 1, 9));

			save.click();

			gotonext.click();

		} else if (childexcel2.equals(Childstatchk2)) {

			Thread.sleep(2000);
			addparent.click();
			
			Thread.sleep(2000);
			
			parentfirstname.sendKeys(excelutil.getData(2, 1, 0));

			parentlastname.sendKeys(excelutil.getData(2, 1, 1));
			// parentsgender.click();
			String parentgen = "Male";
			String parengenexcel = excelutil.getData(2, 1, 2);
			parentgenselect(parentgen, parengenexcel);

			Thread.sleep(1000);
			Select fmr = new Select(familyrole);
			fmr.selectByVisibleText(excelutil.getData(2, 1, 3));

			Select cr = new Select(career);
			cr.selectByVisibleText(excelutil.getData(2, 1, 4));

			save.click();

			gotonext.click();

		} else if (childexcel3.equals(Childstatchk3)) {

			Thread.sleep(2000);
			
			addparent.click();
			
			Thread.sleep(2000);

			motherfirstname.sendKeys(excelutil.getData(2, 1, 10));

			motherlastname.sendKeys(excelutil.getData(2, 1, 11));
			// parentsgender.click();
			String mothergen = "Female";
			String mothergenexcel = excelutil.getData(2, 1, 12);
			mothergenselect(mothergen, mothergenexcel);

			Select mfmr = new Select(motherfamilyrole);
			mfmr.selectByVisibleText(excelutil.getData(2, 1, 13));

			Select mcr = new Select(mothercareer);
			mcr.selectByVisibleText(excelutil.getData(2, 1, 14));

			save.click();

			gotonext.click();
		} else if (childexcel4.equals(Childstatchk4)) {

			Thread.sleep(2000);

			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript("arguments[0].click()", addparent);

			Thread.sleep(1000);

			motherfirstname.sendKeys(excelutil.getData(2, 1, 10));

			motherlastname.sendKeys(excelutil.getData(2, 1, 11));
			// parentsgender.click();
			String mothergen = "Female";
			String mothergenexcel = excelutil.getData(2, 1, 12);
			mothergenselect(mothergen, mothergenexcel);

			Select mfmr = new Select(motherfamilyrole);
			mfmr.selectByVisibleText(excelutil.getData(2, 1, 13));

			Select mcr = new Select(mothercareer);
			mcr.selectByVisibleText(excelutil.getData(2, 1, 14));

			save.click();
			
			Thread.sleep(2000);

			addparent.click();
			
			Thread.sleep(2000);

			parentfirstname.sendKeys(excelutil.getData(2, 1, 0));

			parentlastname.sendKeys(excelutil.getData(2, 1, 1));
			// parentsgender.click();
			String parentgen = "Male";
			String parengenexcel = excelutil.getData(2, 1, 2);
			parentgenselect(parentgen, parengenexcel);

			Select fmr = new Select(familyrole);
			fmr.selectByVisibleText(excelutil.getData(2, 1, 3));

			Select cr = new Select(career);
			cr.selectByVisibleText(excelutil.getData(2, 1, 4));

			save.click();

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");

			gotonext.click();
		} else {
			
			Thread.sleep(2000);

			addparent.click();

			Thread.sleep(2000);
			
			guardianfirstname.sendKeys(excelutil.getData(2, 1, 5));

			guardianlastname.sendKeys(excelutil.getData(2, 1, 6));

			String guardgen = " Male";
			String guardgenexcel = excelutil.getData(2, 1, 7);
			guardgenselect(guardgen, guardgenexcel);

			Select gfmr = new Select(guardianfamilyrole);
			gfmr.selectByVisibleText(excelutil.getData(2, 1, 8));

			Select gcr = new Select(guardiancareer);
			gcr.selectByVisibleText(excelutil.getData(2, 1, 9));

			save.click();

			gotonext.click();
		}

		// SchoolType
		

		
		Select sclnm = new Select(schoolname);
		sclnm.selectByVisibleText(excelutil.getData(3, 1, 0));


		Select scltyp = new Select(schooltype);
		scltyp.selectByVisibleText(excelutil.getData(3, 1, 1));
		WebElementUtils.waitForVisible(startdate);
		startdate.click();
		String date1 = excelutil.getData(3, 1, 2);
		String monthyear1, day1;
		String dateArray1[] = date1.split("-");
		day1 = dateArray1[0];
		monthyear1 = dateArray1[1] + " " + dateArray1[2];
		// String month = "July 2010";
		// System.out.println(monthyear);
		// System.out.println(day);

		while (true) {

			String text = getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[2]"))
					.getText();

			if (text.equals(monthyear1)) {
				break;
			} else {

				getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
		}
		getDriver().findElement(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ day1 + "]"))
				.click();

		String selfspons = "Yes";
		String selfsponsexcel = excelutil.getData(3, 1, 3);
		selfsponsselect(selfspons, selfsponsexcel);
		
		saveandgo1.click();
	}

	
	
	public void siblingParentInfo() throws InterruptedException {

		String sib = "Yes";
		String sibexcel = excelutil.getData(38, 22, 6);

		String childexcel1 = excelutil.getData(0, 1, 10);
		String Childstatchk = "Orphan";

		String childexcel2 = excelutil.getData(0, 1, 10);
		String Childstatchk2 = "Single father";

		String childexcel3 = excelutil.getData(0, 1, 10);
		String Childstatchk3 = "Single mother";

		String childexcel4 = excelutil.getData(0, 1, 10);
		String Childstatchk4 = "Both parents";

		if (sib.equals(sibexcel)) {

			WebElementUtils.scrolltoview(gotonext);
			gotonext.click();

		} else if (childexcel1.equals(Childstatchk)) {

			Thread.sleep(2000);
			
			addparent.click();
			
			Thread.sleep(2000);

			guardianfirstname.sendKeys(excelutil.getData(2, 1, 5));

			guardianlastname.sendKeys(excelutil.getData(2, 1, 6));

			String guardgen = " Male";
			String guardgenexcel = excelutil.getData(2, 1, 7);
			guardgenselect(guardgen, guardgenexcel);

			Select gfmr = new Select(guardianfamilyrole);
			gfmr.selectByVisibleText(excelutil.getData(2, 1, 8));

			Select gcr = new Select(guardiancareer);
			gcr.selectByVisibleText(excelutil.getData(2, 1, 9));

			save.click();

			gotonext.click();

		} else if (childexcel2.equals(Childstatchk2)) {
			
			Thread.sleep(2000);

			addparent.click();
			
			Thread.sleep(2000);

			parentfirstname.sendKeys(excelutil.getData(2, 1, 0));

			parentlastname.sendKeys(excelutil.getData(2, 1, 1));
			// parentsgender.click();
			String parentgen = "Male";
			String parengenexcel = excelutil.getData(2, 1, 2);
			parentgenselect(parentgen, parengenexcel);

			Select fmr = new Select(familyrole);
			fmr.selectByVisibleText(excelutil.getData(2, 1, 3));

			Select cr = new Select(career);
			cr.selectByVisibleText(excelutil.getData(2, 1, 4));

			save.click();

			gotonext.click();

		} else if (childexcel3.equals(Childstatchk3)) {
			
			Thread.sleep(2000);

			addparent.click();
			
			Thread.sleep(2000);

			motherfirstname.sendKeys(excelutil.getData(2, 1, 10));

			motherlastname.sendKeys(excelutil.getData(2, 1, 11));
			// parentsgender.click();
			String mothergen = "Female";
			String mothergenexcel = excelutil.getData(2, 1, 12);
			mothergenselect(mothergen, mothergenexcel);

			Select mfmr = new Select(motherfamilyrole);
			mfmr.selectByVisibleText(excelutil.getData(2, 1, 13));

			Select mcr = new Select(mothercareer);
			mcr.selectByVisibleText(excelutil.getData(2, 1, 14));

			save.click();

			gotonext.click();
		} else if (childexcel4.equals(Childstatchk4)) {

			// addparent.click();
			
			Thread.sleep(2000);

			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript("arguments[0].click()", addparent);

			Thread.sleep(1000);

			motherfirstname.sendKeys(excelutil.getData(2, 1, 10));

			motherlastname.sendKeys(excelutil.getData(2, 1, 11));
			// parentsgender.click();
			String mothergen = "Female";
			String mothergenexcel = excelutil.getData(2, 1, 12);
			mothergenselect(mothergen, mothergenexcel);

			Select mfmr = new Select(motherfamilyrole);
			mfmr.selectByVisibleText(excelutil.getData(2, 1, 13));

			Select mcr = new Select(mothercareer);
			mcr.selectByVisibleText(excelutil.getData(2, 1, 14));

			save.click();

			Thread.sleep(2000);
			
			addparent.click();
			
			Thread.sleep(2000);

			parentfirstname.sendKeys(excelutil.getData(2, 1, 0));

			parentlastname.sendKeys(excelutil.getData(2, 1, 1));
			// parentsgender.click();
			String parentgen = "Male";
			String parengenexcel = excelutil.getData(2, 1, 2);
			parentgenselect(parentgen, parengenexcel);

			Select fmr = new Select(familyrole);
			fmr.selectByVisibleText(excelutil.getData(2, 1, 3));

			Select cr = new Select(career);
			cr.selectByVisibleText(excelutil.getData(2, 1, 4));

			save.click();

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,1000)");

			gotonext.click();
		} else {
			
			Thread.sleep(2000);

			addparent.click();
			
			Thread.sleep(2000);

			guardianfirstname.sendKeys(excelutil.getData(2, 1, 5));

			guardianlastname.sendKeys(excelutil.getData(2, 1, 6));

			String guardgen = " Male";
			String guardgenexcel = excelutil.getData(2, 1, 7);
			guardgenselect(guardgen, guardgenexcel);

			Select gfmr = new Select(guardianfamilyrole);
			gfmr.selectByVisibleText(excelutil.getData(2, 1, 8));

			Select gcr = new Select(guardiancareer);
			gcr.selectByVisibleText(excelutil.getData(2, 1, 9));

			save.click();

			gotonext.click();
		}

		// SchoolType
		Select sclnm = new Select(schoolname);
		sclnm.selectByVisibleText(excelutil.getData(3, 1, 0));

		Select scltyp = new Select(schooltype);
		scltyp.selectByVisibleText(excelutil.getData(3, 1, 1));
		WebElementUtils.waitForVisible(startdate);
		startdate.click();
		String date1 = excelutil.getData(3, 1, 2);
		String monthyear1, day1;
		String dateArray1[] = date1.split("-");
		day1 = dateArray1[0];
		monthyear1 = dateArray1[1] + " " + dateArray1[2];
		// String month = "July 2010";
		// System.out.println(monthyear);
		// System.out.println(day);

		while (true) {

			String text = getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[2]"))
					.getText();

			if (text.equals(monthyear1)) {
				break;
			} else {

				getDriver().findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[1]")).click();
			}
		}
		getDriver().findElement(
				By.xpath("/html/body/div[7]/div[1]/table/tbody//tr//td[not(contains(@class, 'disabled')) and text()="
						+ day1 + "]"))
				.click();

		String selfspons = "Yes";
		String selfsponsexcel = excelutil.getData(3, 1, 3);
		selfsponsselect(selfspons, selfsponsexcel);
		
		saveandgo1.click();
	}

	// mother gender selection
	private void mothergenselect(String mothergen, String mothergenexcel) {

		if (mothergen.equals(mothergenexcel)) {
			motherfgender.click();

		} else {
			guardianfgender.click();
		}

	}

	// Guardian gender selection for orphan

	private void guardgenselect(String guardgen, String guardgenexcel) {
		if (guardgen.equals(guardgenexcel)) {
			guardianmgender.click();

		} else {
			guardianfgender.click();
		}

	}

	private void sibselect(String sib, String sibexcel) throws InterruptedException {

		if (sib.equals(sibexcel)) {
			Thread.sleep(2000);
			issiblingyes.click();
			entersib.click();
			//entersib.sendKeys(excelutil.getData(1, 1, 1));
			entersib.sendKeys(BaseClass.cmfID);
			Thread.sleep(1000);
			entersib.sendKeys(Keys.ARROW_DOWN);
			entersib.sendKeys(Keys.ENTER);

			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);

			WebElementUtils.waitForVisible(clickok);

			WebElementUtils.scrolltoview(clickok);

			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript("arguments[0].click()", clickok);

			Thread.sleep(2000);

			js.executeScript("window.scrollBy(0,-1000)");

			String church = "Yes";
			String churchexcel = excelutil.getData(1, 1, 5);
			churchselect(church, churchexcel);
			if (church.equals(churchexcel)) {
				
				JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
				jse1.executeScript("arguments[0].click()", sfamilybelongstochurch);
				
				churchdetail.click();
				churchdetail.clear();
				churchdetail.sendKeys(excelutil.getData(1, 1, 6));

			} else {
				familybelongstochurch.click();
			}

			js.executeScript("window.scrollBy(0,1000)");

			saveandgo.click();

		} else {
		

			Address.sendKeys(excelutil.getData(1, 1, 2));
			Select Selectcity = new Select(selectcity);
			Selectcity.selectByVisibleText(excelutil.getData(1, 1, 3));

			Select fr = new Select(familyreligion);
			fr.selectByVisibleText(excelutil.getData(1, 1, 4));

			String church = "Yes";
			String churchexcel = excelutil.getData(1, 1, 5);
			churchselect(church, churchexcel);

			familysize.sendKeys(excelutil.getData(1, 1, 7));

			monthlyincome.sendKeys(excelutil.getData(1, 1, 8));

			monthlyexpenditure.sendKeys(excelutil.getData(1, 1, 9));

			Select neighbor = new Select(neighborhoodInfo);
			neighbor.selectByVisibleText(excelutil.getData(1, 1, 10));

			JavascriptExecutor js2 = (JavascriptExecutor) getDriver();
			js2.executeScript("window.scrollBy(0,1000)");

			saveandgo.click();

		}

	}

	private void selfsponsselect(String selfspons, String selfsponsexcel) {

		if (selfspons.equals(selfsponsexcel)) {
			selfsponsored.click();

		} else {
			System.out.println("No is selected by default");

		}
	}

	private void parentgenselect(String parentgen, String parengenexcel) {
		if (parentgen.equals(parengenexcel)) {
			parentsmgender.click();

		} else {
			parentsfgender.click();
		}

	}

	public void churchselect(String church, String churchexcel) {
		if (church.equals(churchexcel)) {
			sfamilybelongstochurch.click();
			churchdetail.click();
			churchdetail.sendKeys(excelutil.getData(1, 1, 6));

		} else {
			familybelongstochurch.click();
		}

	}

	private void learndisableselect(String learningdisabled, String learningdisabledexcel) {
		if (learningdisabled.equals(learningdisabledexcel)) {
			learningdisability.click();
		} else {
			nolearningdisability.click();
		}

	}

	private void phydisableselect(String phydisabled, String phydisabledexcel) {

		if (phydisabled.equals(phydisabledexcel)) {
			physicallydisabled.click();
		} else {
			nophysicallydisabled.click();
		}

	}

	private void phycondselect(String phycond, String phycondexcel) {
		if (phycond.equals(phycondexcel)) {
			goodphysicalcondition.click();
		} else {
			requiredhelpphysicalcondition.click();
		}

	}

	public void childstatselect(String childstat, String childexcel) {

		String childstat1 = "Single father";
		String childstat2 = "Single mother";
		String childstat3 = "Both parents";

		if (childstat.equals(childexcel)) {
			orphanchild.click();
		} else if (childstat1.equals(childexcel)) {
			singlefatherchild.click();
		} else if (childstat2.equals(childexcel)) {
			singlemotherchild.click();
		} else if (childstat3.equals(childexcel)) {
			bothparentschild.click();
		} else {
			Guardianchild.click();

		}

	}

	private void healthcondselect(String healthcond, String healthcondexcel) {

		if (healthcond.equals(healthcondexcel)) {
			healthconditionid.click();
		} else {
			healthconditionid1.click();
		}

	}

	private void genderselect(String text1, String gender1) {

		if (text1.equals(gender1)) {
			gendermale.click();
		} else {
			genderfemale.click();
		}

	}

	private void certificateselect(String birthcert, String birthexcel) throws InterruptedException {

		if (birthcert.equals(birthexcel)) {

			birthcertificate.click();

			birthcertificateno.sendKeys(excelutil.getData(0, 1, 7));

		}

		else {

			nobirthcertificate.click();
			getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			receiveddate.click();
			getDriver().findElement(By.xpath("//td[@class='today day']")).click();

		}

	}

}
