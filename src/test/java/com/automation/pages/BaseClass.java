package com.automation.pages;

import com.automation.pages.PayrollPage;
import com.automation.utils.DriverUtils;

import com.automation.pages.StudentCMFReport;
import com.automation.pages.SubjectGradingReport;

import java.util.ArrayList;

//import com.automation.steps.pageObject;
import com.automation.pages.ClassTeacherReport;

import com.automation.pages.StudentReport;

public class BaseClass extends DriverUtils {

	public PayrollPage payrollpage;
	public AdminPage adminpage;
	public DashboardPage dashboardpage;
	public LoginPage loginpage;
	public UsersPage userspage;
	public LoginPage lp;
	public AllMenuNavigation menunavigation;
	public SpecialAttendance Spa;
	public Attendance At;
	public SpecialAttendanceUpload Spu;
	public PullOutProcess p;
	public ReadmissionProcess R;
	public StaffPromotionReport Spr;
	public StaffProfile Se;
	public FASTPage fastpage;
	public StudentEntry se;
	public Ct ct1;
	public CTReport CtReport;
	public ExamEntry ee;
	public SubjectGrading sg;
	public SubjectGradingReport sgreport;
	public InvigilatorEntry ie;
	public InvigilatorAssignmentReport iar;
	public ExamResults examresults;
	public RankingReport rr;
	public Approvals hta;
	public AnnualPhotoSchedule aps;
	public AdminAssistantFeeDeposit aa;
	public InventoryReport inventoryrep;
	public StudentUpload su;
	public StaffAge staffage;
	public FamilyVisit fv;
	public LpoRequisitionSummaryRep lporequisition;
	public SupplierLinking supplierlink;
	public SupplierCreation suppliercreate;
	public InventoryTracking It;
	public InventoryAudit Ia;	
	public EmployeeRec erec;
	public EmployeeList el;
	public Employeeleave empl;
	public InventoryUpload InvUp;
	public GRNProcess Grn;
	public static String requisitionCode;
	public static String lpoCode;
	public static String lpoAmt;
	public StudentReport sr;
	public ClassTeacherReport ctr;
	public ExamReport er;
	public FamilyVisitSummaryReport fvsr;
	public BookReport br;
	public CenterAndDeptBasedReimbursementCreationAndApproval cadbrcaa;
	public CenterAndDeptBasedRequisitionCreationAndApproval rc;
	public ChildGiftsummaryReport cgsr;
	public FinancialSummaryReport fsr;
	public InterSchoolTransferReport istr;
	public InventoryAdjusmentApproval iaa;
	public InvigilationReport ir;
	public PromotionReport pr;
	public PullOutAndRe_AdmissionReport prr;
	public SocialWorkerFollowupReport swfr;
	public StudentCMFReport scmfr;
	public SubjectGradingReport sgr;
	public ParentContribution pc;
	public CMFEdit cmfe;
	public SponsorUpload spru;
	public CMFNumberUpload cmf;
	public FeeChangeRequest fcr;
	public StudentDelete sd;
	public StudentDisable sde;
	public StudentWorkFlowStatus sws;
	public StudentDataBulkUpload sdbu;
	public EmailTemplate et;
	public MasterDetailEntry mde;
	public Menu menu;
	public Previlege previlege;
	public PromotionPage promotionpage;
	public LeavePage leavepage;
	public MessagePage messagepage;
	public Procurementpage procurementpage;
	public Bookassignment bookassignment;
	public static String Role;
	public static String Designation;
	public MasterDetailList mdl;
	public Organization organization;
	
	public Role role;
	public WorkFlow workflow;
	public FeeMasterEntry feeMasterEntry;
	public NotificationEntry notificationEntry;
	public SizeInfo sizeinfo;
	public AcademicTermEntry academictermentry;
	public static String cmfID;
	public static String classinfo;
	public static ArrayList<String> feeTypelst = new ArrayList<String>();
	public static ArrayList<String> excludefeeTypelst = new ArrayList<String>();
	public static ArrayList<String> readmitlst = new ArrayList<String>();
	public static ArrayList<String> Transferlst = new ArrayList<String>();
	public static ArrayList<String> htlst = new ArrayList<String>();
	public static String transferClass;
	public static String transfercenter;
	public static String TransferSchool;
	public static String TransferSection;
	public static String clsname;
    public Gift gift;
    public static String Child;
    public static String Child1;
    public static String Child2;
    public static String Child3;
    public static String Child4;
    public static String DeleteChild;
    public static String DisableStudent;
    public static String checkoutChild;
    public static String TransferToChild;
    public static String GiftCode;
    public static String tableGiftCode;

	public void helper(){
		payrollpage		=	new PayrollPage();
		adminpage		=	new AdminPage();
		dashboardpage	=	new DashboardPage();
		loginpage		=	new LoginPage();
		userspage		=	new UsersPage();
		menunavigation	=	new AllMenuNavigation();
		lp				=	new LoginPage();
		erec			=	new EmployeeRec();
		el				=	new EmployeeList();
		empl			=	new Employeeleave();
		lporequisition 	=	new LpoRequisitionSummaryRep();
		se				=	new StudentEntry();
		staffage		=	new StaffAge();
		hta				=	new Approvals();
		aa				=	new AdminAssistantFeeDeposit();
		su				=	new StudentUpload();
		fv				=	new FamilyVisit();
		supplierlink	=	new SupplierLinking();
		suppliercreate	=	new SupplierCreation();
		Spa				=	new SpecialAttendance();
		aps				=	new AnnualPhotoSchedule();
		inventoryrep	= 	new InventoryReport();
		At				=	new Attendance();
		Spu				=	new SpecialAttendanceUpload();
		p				=	new PullOutProcess();
		R				=	new ReadmissionProcess();
		Spr				=	new StaffPromotionReport();
		Se				=	new StaffProfile();
		fastpage		=	new FASTPage();
		ct1 			= 	new Ct();
		CtReport		= 	new CTReport();
		ee 				= 	new ExamEntry();	
		sg 				= 	new SubjectGrading();
		sgreport 		=	new SubjectGradingReport();
		ie 				= 	new InvigilatorEntry();
		iar 			= 	new InvigilatorAssignmentReport();
		examresults 	= 	new ExamResults();
		rr 				=	new RankingReport();
		sr 				=	new StudentReport();
		ctr 			= 	new ClassTeacherReport();
		er 				= 	new ExamReport();
		fvsr 			= 	new FamilyVisitSummaryReport();
		br				=	new BookReport();
		cadbrcaa 		= 	new CenterAndDeptBasedReimbursementCreationAndApproval();
		rc 				= 	new CenterAndDeptBasedRequisitionCreationAndApproval();
		cgsr 			= 	new ChildGiftsummaryReport();
		fsr 			= 	new FinancialSummaryReport();
		istr 			= 	new InterSchoolTransferReport();
		iaa 			= 	new InventoryAdjusmentApproval();
		ir 				= 	new InvigilationReport();
		pr 				= 	new PromotionReport();
		prr 			= 	new PullOutAndRe_AdmissionReport();
		swfr 			= 	new SocialWorkerFollowupReport();
		scmfr 			= 	new  StudentCMFReport();
		sgr 			= 	new SubjectGradingReport();
		pc 				= 	new ParentContribution();
		cmfe 			= 	new CMFEdit();
		spru			=	new SponsorUpload();
		cmf				=	new CMFNumberUpload();
		fcr 			= 	new FeeChangeRequest();
		sd 				= 	new StudentDelete();
		sde 			= 	new StudentDisable();
		sws 			= 	new StudentWorkFlowStatus();
		sdbu 			= 	new StudentDataBulkUpload();
		et 				= 	new EmailTemplate();
		mde 			= 	new MasterDetailEntry();
		menu 			= 	new Menu();
		previlege 		= 	new Previlege();
		leavepage		=	new LeavePage();
		promotionpage  	=   new PromotionPage();
		messagepage		=	new MessagePage();
		procurementpage	= 	new Procurementpage();
		Grn 			= 	new GRNProcess ();
		Ia 				= 	new InventoryAudit();
		It 				= 	new InventoryTracking();
		InvUp 			= 	new InventoryUpload();
        bookassignment	=	new Bookassignment();
        mdl             =   new MasterDetailList();
        organization    =   new Organization();
        role            =   new Role();
        workflow        =   new WorkFlow();
        feeMasterEntry  =   new FeeMasterEntry();
       notificationEntry=  new NotificationEntry();
        sizeinfo        =   new SizeInfo();
       academictermentry=  new AcademicTermEntry();
       gift             = new Gift();
	}
}
