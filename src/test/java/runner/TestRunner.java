package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.cucumber.listener.Reporter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags 	 = "@studententry",
		plugin	 = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
        glue 	 = "com.automation.steps",
        dryRun 	 = false,
        features = "src/test/java/features")

public class TestRunner {
	@BeforeClass
    public static void setup() {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(8/06/2020));
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("cucumber-reports/"+timeStamp.replace(":","_").replace(".","_")+".html");
    }

    @AfterClass
    public static void writeExtentReport() {
    	 Reporter.loadXMLConfig(".\\src\\test\\resources\\extent-config.xml");
//       Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
    }
}
//@LPO,@Requisition,@procurement

//@FeeFrequencyValidation,@PerFamily,@Gender,@Elder,@Fee

//@menunavigation, @EmployeeRecruitment, @emplist,@payroll, @Reports, @CMFEdit, @SponsorUpload, @CMFNumberUpload, @staffprofile, @StaffAge, @adduser, @FamilyVisit_TransferStudentSocialworkerassignment, @EmailTemplateAdd, @MasterDetailEntry, @AddNewMenu, @AddPrevilege, @Bookassignment

//@ct,@examentry,@invigilatorassignment,@examresults, @FamilyVisit, @fast,@specialattendanceuploads , @specialattendance, @AttendanceProcess, @pulloutprocess ,@staffpromotionreport , @readmissionprocess, @Promotion&Transfer 

//@studententry,@sendforclarification,@SendForClarificationToSW,@Denied,@AnnualPhotoSchedule,@StudentDeleteSendForClarificationAndApprovalFeature,@StudentDeleteDeniedFeature,@StudentDisableFeature,@StudentDataBulkUpload