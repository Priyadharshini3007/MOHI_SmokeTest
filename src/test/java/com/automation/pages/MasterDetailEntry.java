package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class MasterDetailEntry {
	
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public MasterDetailEntry()	{

		PageFactory.initElements(getDriver(), this);

}
	
////////////////////////////////////////////////MasterDetailEntryElements///////////////////////////////////////////////////////

	
	@FindBy(linkText="Admin")
	WebElement AdminMenu;
	
	@FindBy(linkText="Master Detail Entry")
	WebElement MasterDetailEntrySubmenu;
	
	@FindBy(xpath="//*[@id='DataCategory' and not(@type='hidden')]")
	WebElement CategoryDropdown;
	
	@FindBy(xpath="//*[@id='Name']")
	WebElement Name;
	
	@FindBy(xpath="//*[@id='ddlCenters']")
	WebElement center;
	
	@FindBy(xpath="//*[@id='ddlClasses']")
	WebElement Class;
	
	@FindBy(xpath="//*[@id='ddlSections']")
	WebElement Section;
	
	@FindBy(xpath="//*[@id='Code']")
	WebElement Code;
	
	@FindBy(xpath="//*[@id='IsSubSubject']")
	WebElement IsSubject;
	
	@FindBy(xpath="(//*[@id='ddlSubjects'])[1]")
	WebElement ParentSubject;
	
	@FindBy(xpath="//*[@id='IsExaminable']")
	WebElement IsExaminable;
	
	@FindBy(xpath="//*[@id='ddlSubjects' and @name='SubjectID']")
	WebElement Subject;
	
	@FindBy(xpath="//*[@id='SubjectOrder']")
	WebElement SubjectOrder;
	
	@FindBy(xpath="//*[@title='Save']")
	WebElement Save;
	
	@FindBy(xpath="//*[@class='btn btn-default btn-sm returntolist']")
	WebElement ReturnToList;
	
	@FindBy(linkText="Add Master Detail")
	WebElement AddMasterDetailLink;
	
	
	//Edit MAster Details Elements
	
	@FindBy(linkText="Master Detail List")
	WebElement MasterDetailListLink;
	
	@FindBy(xpath="//*[@id='Filter_Name']")
	WebElement FilterName;
	
	@FindBy(xpath="//*[@id='btnSearch']")
	WebElement Search;
	
	@FindBy(xpath="(//*[@class='fa fa-pencil-alt'])[1]")
	WebElement EditButton;
	
	@FindBy(xpath="(//*[@class='fa fa-trash red'])[1]")
	WebElement DeleteButton;
	
	@FindBy(xpath="//*[@id='flash']")
	WebElement Flashmessage;
	
	@FindBy(xpath="//tbody[@class='center']")
	WebElement Row;
	
	
	
	
	
//Add Master Detail
	
	
	public void MasterDetailEntrymenu() throws InterruptedException {
		
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		
		AdminMenu.click();
		MasterDetailEntrySubmenu.click();
	}
	
	public void Category() throws InterruptedException {
		
		
		
		Select selectCategoryDropdown = new Select(CategoryDropdown);
		selectCategoryDropdown.selectByVisibleText(excelutil.getData(31, 1, 0));
		
		if(Name.isDisplayed()){
			
			Name.sendKeys(excelutil.getData(31, 1, 1));
			
			}
		
		if(center.isDisplayed()){
			
			Select selectCenter= new Select(center);
			selectCenter.selectByVisibleText(excelutil.getData(31, 1, 2));
			
		}
		
		if(Class.isDisplayed()){
			
			Select selectClass= new Select(Class);
			selectClass.selectByVisibleText(excelutil.getData(31, 1, 3));
			
		}
		
		if(Section.isDisplayed()){
			
			Select selectSection= new Select(Section);
			selectSection.selectByVisibleText(excelutil.getData(31, 1, 4));
			
	
			}
		
		if(Code.isDisplayed()){
			
			Code.sendKeys(excelutil.getData(31, 1, 5));
			
		}
		
		
		
		if(IsSubject.isDisplayed()){
			
			IsSubject.click();
			Select selectSubject= new Select(ParentSubject);
			selectSubject.selectByVisibleText(excelutil.getData(31, 1, 8));
			
			
			
		}
		
		if(IsExaminable.isDisplayed()){
			
			IsExaminable.click();
			
			
			
		}
		
		if(Subject.isDisplayed()){
			
			Select selectSubject= new Select(Subject);
			selectSubject.selectByVisibleText(excelutil.getData(31, 1, 6));
			
			//Save.click();
			
		}
		
		if(SubjectOrder.isDisplayed()){
			
			SubjectOrder.sendKeys(excelutil.getData(31, 1, 7));
			
		}
		
	}
	
	public void SaveCategory() throws InterruptedException {
		
		Save.click();
		System.out.println(Flashmessage.getText());
	}
	

	
	
	
	
	//Verify Category Dropdown
	
	public void verifyCategoryDropDown() throws InterruptedException {
		
		
		
		try{
			if(CategoryDropdown.isDisplayed()){
				
				System.out.println("Category Dropdown is displayed");
				

			}
		}
		
		catch(Exception e){
			System.out.println("Category Dropdown is not displayed");
		}
	}

	//Verify Textdata
		
		public void verifyTextData() throws InterruptedException {
			
			
			
			try{
//				//boolean isnameExist=Name.isDisplayed();
//				boolean iscodeExist=Code.isDisplayed();
//			
//				boolean isSectionExist=Section.isDisplayed();
//				boolean isIsSubjectExist=IsSubject.isDisplayed();
//				boolean isIsExaminableExist=IsExaminable.isDisplayed();
//				boolean isSubjectExist=Subject.isDisplayed();
//				boolean isSubjectOrderExist=SubjectOrder.isDisplayed();
//				boolean iscenterExist=center.isDisplayed();
//				boolean isClassExist=Class.isDisplayed();
				
			
				
				if(excelutil.getData(31, 15, 0).toString().equals("Section")){
					Select selectCategoryDropdown = new Select(CategoryDropdown);
					selectCategoryDropdown.selectByVisibleText(excelutil.getData(31, 15, 0));
					
					Thread.sleep(2000);
					boolean isnameExist=Name.isDisplayed();
					if(isnameExist)
					{
						System.out.println("Expected Section Elements Get Displayed");
						
					}
					else
					{
						System.out.println("Some Section Element missed");
					}
					
					

				}
				 String[] myList = {"Sport","Religion","Future Aspiration","Father Career","Mother Career","Guardian Career","Fee Type","City","Neighbourhood","Future Career"};
				 for (int i = 0; i < myList.length; i++) {
					 	
					 	Select selectCategoryDropdown1 = new Select(CategoryDropdown);
						selectCategoryDropdown1.selectByVisibleText(myList[i]);
						
						Thread.sleep(2000);
						boolean isnameExist1=Name.isDisplayed();
						boolean iscodeExist1=Code.isDisplayed();
						
							if(isnameExist1 && iscodeExist1)
							{
								System.out.println( ""+myList[i]+ "Elements is displayed");
								
							}
							else
							{
								System.out.println( ""+myList[i]+ "Elements not is displayed");
							}
							
							
			      }
              
				
               if(excelutil.getData(31, 2, 0).toString().equals("Center, Class & Section Mapping")){
            	   Select selectCategoryDropdown1 = new Select(CategoryDropdown);
					selectCategoryDropdown1.selectByVisibleText(excelutil.getData(31, 2, 0));
					
					Thread.sleep(2000);
					boolean iscenterExist2=center.isDisplayed();
					boolean isClassExist2=Class.isDisplayed();
					boolean isSectionExist2=Section.isDisplayed();
					
					if(iscenterExist2 && isClassExist2 && isSectionExist2)
					{
						System.out.println("Expected Center, Class & Section Mapping Elements get displayed");
						
					}
					else
					{
						System.out.println("Element Missing");
					}
					
					}
               
               
               
               
			
			
			if(excelutil.getData(31, 3, 0).toString().equals("Subject")){
				 Select selectCategoryDropdown1 = new Select(CategoryDropdown);
					selectCategoryDropdown1.selectByVisibleText(excelutil.getData(31, 3, 0));
					
					Thread.sleep(2000);
					boolean isnameExist3=Name.isDisplayed();
					boolean iscodeExist3=Code.isDisplayed();
					boolean isIsSubjectExist3=IsSubject.isDisplayed();
					boolean isIsExaminableExist3=IsExaminable.isDisplayed();
				if(isnameExist3 && iscodeExist3 && isIsSubjectExist3 && isIsExaminableExist3)
				{
					System.out.println("Expected subject Elements get displayed");
					
				}
				else
				{
					System.out.println("Some Subject Element Missing");
				}
				
				}
           
           

			if(excelutil.getData(31, 4, 0).toString().equals("Center, Class & Subject Mapping")){
				
				Select selectCategoryDropdown1 = new Select(CategoryDropdown);
				selectCategoryDropdown1.selectByVisibleText(excelutil.getData(31, 4, 0));
				
				Thread.sleep(2000);
				boolean isSubjectExist4=Subject.isDisplayed();
				boolean isSubjectOrderExist4=SubjectOrder.isDisplayed();
				boolean iscenterExist4=center.isDisplayed();
				boolean isClassExist4=Class.isDisplayed();
				if(iscenterExist4 && isClassExist4 && isSubjectExist4 && isSubjectOrderExist4)
				{
					System.out.println("Expected Center, Class & Subject Mapping Elements get displayed");
					
				}
				else
				{
					System.out.println("Some Center, Class & Subject Mapping Element Missing");
				}
				
				} 
           
		}
			
			
			
			
			catch(Exception e){
				System.out.println("Category Dropdown is not displayed");
			}
			

			
}
		
//Verification of Newly Added Section Mapped To The Appropriate Center&Class
		
		public void sectionCategory() throws InterruptedException {
			
			Select selectCategoryDropdown = new Select(CategoryDropdown);
			selectCategoryDropdown.selectByVisibleText(excelutil.getData(31, 51, 0));
			
			Name.sendKeys(excelutil.getData(31, 51, 1));
			
			
		}
		
		public void clickAddMasterDetailLink() throws InterruptedException {
			
			AddMasterDetailLink.click();
			
			Select selectCategoryDropdown = new Select(CategoryDropdown);
			selectCategoryDropdown.selectByVisibleText(excelutil.getData(31, 52, 0));
			

		}
	
		public void selectNewlyAddedSection() throws InterruptedException {
			
			Select selectCenter= new Select(center);
			selectCenter.selectByVisibleText(excelutil.getData(31, 52, 2));
								
			Select selectClass= new Select(Class);
			selectClass.selectByVisibleText(excelutil.getData(31, 52, 3));
						
			Select selectSection= new Select(Section);
			selectSection.selectByVisibleText(excelutil.getData(31, 52, 4));
			
		}
		
		public void filterTheRecordToVerify() throws InterruptedException {
			
			FilterName.sendKeys(excelutil.getData(31,52,4));
			Search.click();
			
			System.out.println(Row.getText());
			
			
		}
		
		
//Verify Return To List
		
		public void masterDetailListLink() throws InterruptedException {
			
			MasterDetailListLink.click();
			

		}
		
		public void selCategory() throws InterruptedException {
			
			
		Select selectCategoryDropdown = new Select(CategoryDropdown);
		selectCategoryDropdown.selectByVisibleText(excelutil.getData(31,54, 0));
			
			
		}
		
		public void selEditAndReturnToList() throws InterruptedException {
			
			EditButton.click();
			ReturnToList.click();
			
			
		}
		
		public void selAddMasterDetailAndReturnToList() throws InterruptedException {
			
			AddMasterDetailLink.click();
			ReturnToList.click();
			
			
		}
		
		
	
	
}