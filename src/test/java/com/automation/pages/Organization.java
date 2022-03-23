package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class Organization {
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public Organization()	{

		PageFactory.initElements(getDriver(), this);

	}
	
	
///////////////////////////////////////Organization Page Elements///////////////////////////////////////////////////////
	
	@FindBy(linkText="Admin")
	WebElement AdminMenu;
	
	@FindBy(linkText="Organization")
	WebElement OrganizationSubmenu;
	
	@FindBy(xpath="(//*[@title='Click here to Add Organization'])[1]")
	WebElement AddOrganizationButton;
	
	@FindBy(xpath="//*[@id='Code']")
	WebElement organizationCode;
	
	@FindBy(xpath="//*[@id='Name']")
	WebElement organizationName;
	
	@FindBy(xpath="//*[@id='OrganizationHierarchyTypeID']")
	WebElement organizationType;
	
	@FindBy(xpath="//*[@id='Comments']")
	WebElement Comments;
	
	@FindBy(xpath="//*[@id='Address1']")
	WebElement Address1;
	
	@FindBy(xpath="//*[@id='Address2']")
	WebElement Address2;
	
	@FindBy(xpath="//*[@id='City']")
	WebElement City;
	
	@FindBy(xpath="//*[@id='State']")
	WebElement State;
	
	@FindBy(xpath="//*[@id='Country']")
	WebElement Country;
	
	@FindBy(xpath="//*[@id='Zip']")
	WebElement zip;
	
	@FindBy(xpath="//*[@id='TimeZone']")
	WebElement TimeZone;
	
	@FindBy(xpath="//*[@id='Phone']")
	WebElement Phone;
	
	@FindBy(xpath="//*[@id='CellPhone']")
	WebElement CellPhone;
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//*[@id='WebSite']")
	WebElement Website;
	
	@FindBy(xpath="//div[contains(@class, 'ui-dialog-buttonset')]//button[contains(@class, 'btn-primary')]")
	WebElement Save;
	
	@FindBy(xpath="//*[@id='flash']")
	WebElement Flashmessage;
	
	@FindBy(xpath="//*[@id='Filter_Name']")
	WebElement SearchByName;
	
	

	//Role Aassigned To The Organisation elements
	
	@FindBy(xpath="//*[@id='Id_Designation']")
	WebElement Designation;
	
	@FindBy(xpath="//*[@id='Id_Role']")
	WebElement Role;
	
	@FindBy(xpath="//*[@id='AddNewOrgRole']")
	WebElement AddNewOrgButton;
	
	@FindBy(xpath="//*[@id='mytable']")
	WebElement Table;
	
	//Add Organization Hierarchy Elements
	
	@FindBy(xpath="//*[@id='ui-id-3']")
	WebElement OrganizationHierarchyTab;
	
	@FindBy(xpath="(//a[contains(@href,'/OrganizationHierarchy/OrganizationHierarchyInfo')])[1]")
	WebElement AddOrganizationHierarchy;
	
	@FindBy(xpath="//*[@id='SortOrder']")
	WebElement SortOrder;

	@FindBy(xpath="//*[@id='IsActive']")
	WebElement IsActive;

	@FindBy(xpath="(//*[@class='table-grid grid'])[2]")
	WebElement organizationHierarchyList;
	
	@FindBy(xpath="//*[@id='Filter_OrganizationHierarchyType']")
	WebElement FilterOrganizationType;
	
	
	@FindBy(xpath="//*[@id='Filter_Code']")
	WebElement FilterCode;
	
	@FindBy(xpath="//*[@id='Filter_SubmitterName']")
	WebElement FilterSubmitterName;
	
	@FindBy(xpath="//*[@title='Find records']")
	WebElement SearchButton;
	
	
	
	
	
//Add Designation Elements
	

	@FindBy(xpath="//*[@id='ui-id-5']")
	WebElement DesignationTab;
	
	@FindBy(xpath="(//a[contains(@href,'/Designation/DesignationInfo')])[1]")
	WebElement AddDesignationButton;
	
//Delete Elements
	
	@FindBy(xpath="//*[@title='Click here to delete this Organization Hierarchy']")
	WebElement Deleteicon;
	
	@FindBy(xpath="//*[@id='OrgHierarchyName']")
	WebElement Searchname;
	
	@FindBy(xpath="//*[@id='DeleteOrgRole']")
	WebElement DeleteRole;
	
	@FindBy(xpath="//*[@id='OrgHierarchyName']")
	WebElement SearchnameinOrganizatonHierarchy;
	
	@FindBy(xpath="//*[@id='DesignationName']")
	WebElement SearchnameinDesignation;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//Add Organization	
	
	public void organizationmenu() throws InterruptedException {
		
		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");
		
		AdminMenu.click();
		OrganizationSubmenu.click();
		
		
	}
	
	public void addButton() throws InterruptedException {
		
		AddOrganizationButton.click();
		
		
	}
	
	public void OraganizationRequiredFields() throws InterruptedException {
		
		organizationCode.sendKeys(excelutil.getData(35, 1, 0));
		
		organizationName.sendKeys(excelutil.getData(35, 1, 1));
		
		Select selectOrganizationHierarchy = new Select(organizationType);
		selectOrganizationHierarchy.selectByVisibleText(excelutil.getData(35, 1, 2));
		
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()",Comments);
		
		Comments.sendKeys(excelutil.getData(35, 1, 3));
		
		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].scrollIntoView()",Address1);
		
		Address1.sendKeys(excelutil.getData(35, 1, 4));
		
		Address2.sendKeys(excelutil.getData(35, 1, 5));
		City.sendKeys(excelutil.getData(35, 1, 6));
		State.sendKeys(excelutil.getData(35, 1, 7));
		Country.sendKeys(excelutil.getData(35, 1, 8));
		zip.sendKeys(excelutil.getData(35, 1, 9));
		
		JavascriptExecutor scrolldown3 = (JavascriptExecutor) getDriver();
		scrolldown3.executeScript("arguments[0].scrollIntoView()",TimeZone);
		
		TimeZone.sendKeys(excelutil.getData(35, 1, 10));
		
		Phone.sendKeys(excelutil.getData(35, 1, 11));
		CellPhone.sendKeys(excelutil.getData(35, 1, 12));
		Email.sendKeys(excelutil.getData(35, 1, 13));
		Website.sendKeys(excelutil.getData(35, 1, 14));
		
	}
	
	
	public void saveOrganization() throws InterruptedException {
		
		
		Save.click();
		System.out.println(Flashmessage.getText());
		
	}
	
//Edit Organization
	
	public void editOrganization() throws InterruptedException {
		
		WebElement getElement=  getDriver().findElement(By.xpath("//*[normalize-space(text())='"+excelutil.getData(35,2,1)+"']/preceding-sibling::td/a/i"));
		
		getElement.click(); 
		
		organizationCode.clear();
		organizationCode.sendKeys(excelutil.getData(35, 3, 0));
		
		organizationName.clear();
		organizationName.sendKeys(excelutil.getData(35, 3, 1));
		
		Select selectOrganizationHierarchy = new Select(organizationType);
		selectOrganizationHierarchy.selectByVisibleText(excelutil.getData(35, 2, 2));
		
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()",Comments);
		
		Comments.clear();
		Comments.sendKeys(excelutil.getData(35, 2, 3));
		
		JavascriptExecutor scrolldown2 = (JavascriptExecutor) getDriver();
		scrolldown2.executeScript("arguments[0].scrollIntoView()",Address1);
		
		Address1.clear();
		Address1.sendKeys(excelutil.getData(35, 2, 4));
		
		Address2.clear();
		Address2.sendKeys(excelutil.getData(35, 2, 5));
		
		City.clear();
		City.sendKeys(excelutil.getData(35, 2, 6));
		
		State.clear();
		State.sendKeys(excelutil.getData(35, 2, 7));
		
		Country.clear();
		Country.sendKeys(excelutil.getData(35, 2, 8));
		
		zip.clear();
		zip.sendKeys(excelutil.getData(35, 2, 9));
		
		JavascriptExecutor scrolldown3 = (JavascriptExecutor) getDriver();
		scrolldown3.executeScript("arguments[0].scrollIntoView()",TimeZone);
		
		TimeZone.clear();
		TimeZone.sendKeys(excelutil.getData(35, 2, 10));
		
		Phone.clear();
		Phone.sendKeys(excelutil.getData(35, 2, 11));
		
		CellPhone.clear();
		CellPhone.sendKeys(excelutil.getData(35, 2, 12));
		
		Email.clear();
		Email.sendKeys(excelutil.getData(35, 2, 13));
		
		Website.clear();
		Website.sendKeys(excelutil.getData(35, 2, 14));
			
		}

//Assign Role to Organization
	
	public void RoleToOrganization() throws InterruptedException {
		
		WebElement getElement=  getDriver().findElement(By.xpath("//*[normalize-space(text())='"+excelutil.getData(35,8,2)+"']/following-sibling::td[4]/a[3]"));
		
		getElement.click();
	}
	
	
	
	public void addNewRole() throws InterruptedException {
		
		Select selectDesignation = new Select(Designation);
		selectDesignation.selectByVisibleText(excelutil.getData(35, 8, 0));
		
		BaseClass.Designation = excelutil.getData(35, 8, 0);
		
		
		
		Select selectRole = new Select(Role);
		selectRole.selectByVisibleText(excelutil.getData(35, 8, 1));
		
		BaseClass.Role = excelutil.getData(35, 8, 1);
		
		AddNewOrgButton.click();
		
		
		WebElement getElement=  getDriver().findElement(By.xpath("//td[normalize-space(text())='"+BaseClass.Designation+"']"));
		
		getElement.getText();
		
		WebElement getElement1=  getDriver().findElement(By.xpath("//td[normalize-space(text())='"+BaseClass.Role+"']"));
		
		getElement1.getText();
		
		System.out.println(getElement.getText());
		
		System.out.println(getElement1.getText());
	}
	
	
//Organization List can be Viewed
	
	public void organizationListCanBeViewed() throws InterruptedException {
		
		if(Table.isDisplayed()){
			
			System.out.println("Organization List can able to View");
			
		}
		
		else
		{
			System.out.println("Organization List unable to View");
		}
		}

	
//To Add Organization Hierarchy
	
		public void addOrganizationHierarchyTab() throws InterruptedException {
			
			OrganizationHierarchyTab.click();
		}
		
		
		public void addOrganizationHierarchyRequiredDetails() throws InterruptedException {
			
			AddOrganizationHierarchy.click();
			
			organizationName.sendKeys(excelutil.getData(35, 13, 0));
			
			organizationCode.sendKeys(excelutil.getData(35, 13, 1));
			
			SortOrder.clear();
			SortOrder.sendKeys(excelutil.getData(35, 13, 2));
			
			IsActive.click();
			
		
		
	}
		

//To Edit Organization Hierarchy
		
		
	
		
		public void editOrganizationHierarchyRequiredDetails() throws InterruptedException {
			
			WebElement getElement=  getDriver().findElement(By.xpath("//*[normalize-space(text())='"+excelutil.getData(35,14,0)+"']/preceding-sibling::td"));
			
			getElement.click();
			
			
			organizationName.clear();
			organizationName.sendKeys(excelutil.getData(35, 15, 0));
			
			SortOrder.clear();
			SortOrder.sendKeys(excelutil.getData(35, 15, 2));
			
			IsActive.click();
			
		
		
	}
	
	
//Organization Hierarchy List can be Viewed
	
		public void organizationHierarchyListCanBeViewed() throws InterruptedException {
			
			OrganizationHierarchyTab.click();
			
			if(organizationHierarchyList.isDisplayed()){
				
				System.out.println("Organization Hierarchy List can able to View");
				
			}
			
			else
			{
				System.out.println("Organization Hierarchy List unable to View");
			}
			}

		
// To Delete Organization Hierarchy
		
		public void searchNameToDelete() throws InterruptedException {
		
			Searchname.sendKeys(excelutil.getData(35, 16, 0));
			Searchname.sendKeys(Keys.ENTER);
			
		}
		
		
		public void deleteOrganizationHierarchy() throws InterruptedException {
			
			Deleteicon.click();
			System.out.println(Flashmessage.getText());
			
			
		
			
		}
		
		
//Add Designation
		
		public void designationTab() throws InterruptedException {
			
			DesignationTab.click();
		
			}
		
		
		public void addDesignation() throws InterruptedException {
			
			AddDesignationButton.click();
			
			organizationName.sendKeys(excelutil.getData(35, 20, 0));
			

		}
		
//Search And Sort Order
		
		public void organizationHierarchySortAsc() throws InterruptedException {
			
			// Column : Name
			
			Thread.sleep(2000);
			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();
			
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[1]")).size();
			for (int i = 0; i < t; i++) {
			String getValue = getDriver().findElement(By.xpath("(//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[1])["+(i+1)+"]")).getText();
			arrlist.add(getValue.toLowerCase());
				}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);
			Assert.assertArrayEquals(arrlist.toArray() , arrlistsort.toArray());
//			if(arrlist.get(0).equals(arrlistsort.get(0)))
//				{
//				System.out.println("organizationHierarchysorted");
//				}
//			else
//			{
//				System.out.println("organizationHierarchynotsorted");
//			}
		}
		
		
		
		public void organizationHierarchySortDesc() throws InterruptedException {
			
			// Column : Name
			
			Thread.sleep(2000);
			//getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();
			
			Thread.sleep(2000);
			
			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();
			
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[1]")).size();
			for (int i = 0; i < t; i++) {
			String getValue = getDriver().findElement(By.xpath("(//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[1])["+(i+1)+"]")).getText();
			arrlist.add(getValue.toLowerCase());
				}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);
			Collections.reverse(arrlist);
			
			Assert.assertArrayEquals(arrlist.toArray() , arrlistsort.toArray());
		
		}
		
		
		public void organizationHierarchyCodeSortAsc() throws InterruptedException {
			
			// Column : Code
			
			Thread.sleep(2000);
			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();
			
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[2]")).size();
			for (int i = 0; i < t; i++) {
			String getValue = getDriver().findElement(By.xpath("(//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[2])["+(i+1)+"]")).getText();
			arrlist.add(getValue.toLowerCase());
				}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);
			Assert.assertArrayEquals(arrlist.toArray() , arrlistsort.toArray());	
			
		}
		
		
		
		public void organizationHierarchyCodeSortDesc() throws InterruptedException {
			
			// Column : Code
			
			Thread.sleep(2000);
			//getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();
			
			//Thread.sleep(2000);
			
			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();
			
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[2]")).size();
			for (int i = 0; i < t; i++) {
			String getValue = getDriver().findElement(By.xpath("(//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[2])["+(i+1)+"]")).getText();
			arrlist.add(getValue.toLowerCase());
				}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);
			Collections.reverse(arrlist);
			
			Assert.assertArrayEquals(arrlist.toArray() , arrlistsort.toArray());
		
		}
		

		public void organizationHierarchySortOrderSortAsc() throws InterruptedException {
			
			// Column : SortOrder
			
			Thread.sleep(2000);
			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[2]")).click();
			
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[3]")).size();
			for (int i = 0; i < t; i++) {
			String getValue = getDriver().findElement(By.xpath("(//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[3])["+(i+1)+"]")).getText();
			arrlist.add(getValue.toLowerCase());
				}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);
			Assert.assertArrayEquals(arrlist.toArray() , arrlistsort.toArray());	
			
		}
		
		public void organizationHierarchySortOrderSortDesc() throws InterruptedException {
			
			// Column : SortOrder
			
			Thread.sleep(2000);
			//getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();
			
			//Thread.sleep(2000);
			
			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();
			
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[3]")).size();
			for (int i = 0; i < t; i++) {
			String getValue = getDriver().findElement(By.xpath("(//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[3])["+(i+1)+"]")).getText();
			arrlist.add(getValue.toLowerCase());
				}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);
			Collections.reverse(arrlist);
			
			Assert.assertArrayEquals(arrlist.toArray() , arrlistsort.toArray());
		
		}
		
	
		
		
		
		
		public void designationSortAsc() throws InterruptedException {
			
			DesignationTab.click();
			
			Thread.sleep(2000);
			
			getDriver().findElement(By.xpath("//*[@id='DesList'] //*[@title='Click to sort in Ascending order']")).click();
			
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//*[@id='DesList'] //td[@class='center']/following-sibling::td[1]")).size();
			for (int i = 0; i < t; i++) {
			String getValue = getDriver().findElement(By.xpath("(//*[@id='DesList'] //td[@class='center']/following-sibling::td[1])["+(i+1)+"]")).getText();
			arrlist.add(getValue.toLowerCase());
				}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);
			Assert.assertArrayEquals(arrlist.toArray() , arrlistsort.toArray());
//			if(arrlist.get(0).equals(arrlistsort.get(0)))
//				{
//				System.out.println("Designation Tab sorted");
//				}
//			else
//			{
//				System.out.println("Designation Tab sorted");
//			}
		}
		
		
			public void designationSortDesc() throws InterruptedException {
			
			DesignationTab.click();
			
			Thread.sleep(2000);
			
			getDriver().findElement(By.xpath("//*[@id='DesList'] //*[@title='Click to sort in Ascending order']")).click();
			
			Thread.sleep(1000);
			
			getDriver().findElement(By.xpath("//*[@id='DesList'] //*[@title='Click to sort in Descending order']")).click();
			
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//*[@id='DesList'] //td[@class='center']/following-sibling::td[1]")).size();
			for (int i = 0; i < t; i++) {
			String getValue = getDriver().findElement(By.xpath("(//*[@id='DesList'] //td[@class='center']/following-sibling::td[1])["+(i+1)+"]")).getText();
			arrlist.add(getValue.toLowerCase());
				}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);
			Collections.reverse(arrlist);
			
			Assert.assertArrayEquals(arrlist.toArray() , arrlistsort.toArray());
			}
//Organization search
		
		public void organizationSearch() throws InterruptedException {
			
			SearchByName.sendKeys(excelutil.getData(35, 27, 0));
			
			FilterOrganizationType.sendKeys(excelutil.getData(35, 27, 1));
			FilterCode.sendKeys(excelutil.getData(35, 27, 2));
			FilterSubmitterName.sendKeys(excelutil.getData(35, 27, 3));
			SearchButton.click();
			
			//SearchByName.sendKeys(Keys.ENTER);
			
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//span[contains(@class, 'collapse')]/parent::td")).size();
			for (int i = 0; i < t; i++) {
			String getValue = getDriver().findElement(By.xpath("(//span[contains(@class, 'collapse')]/parent::td)["+(i+1)+"]")).getText();
			arrlist.add(getValue.toLowerCase());
				}
			
			for (int i = 0; i < arrlist.size(); i++) {
				if(arrlist.get(i).contains(""+excelutil.getData(35,27,0).toLowerCase()+""))
				{
				 arrlistsort.add(arrlist.get(i).toLowerCase());
				}
			}
			Assert.assertEquals(arrlistsort.get(0) , excelutil.getData(35, 27, 0).toLowerCase());	
//			if(arrlistsort.size() == arrlist.size())
//			{
//				System.out.println("Organization tab matched");
//			}
//			else
//			{
//				System.out.println("Organization tab unmatched");
//			}
//			
		}
		
		
		public void organizationHierarchySearch() throws InterruptedException {
			
			OrganizationHierarchyTab.click();
			
			SearchnameinOrganizatonHierarchy.sendKeys(excelutil.getData(35, 27, 0));
			
			
			SearchnameinOrganizatonHierarchy.sendKeys(Keys.ENTER);
			
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[1]")).size();
			for (int i = 0; i < t; i++) {
			String getValue = getDriver().findElement(By.xpath("(//*[@id='OrgHList'] //td[@class='center']/following-sibling::td[1])["+(i+1)+"]")).getText();
			arrlist.add(getValue.toLowerCase());
				}
			
			for (int i = 0; i < arrlist.size(); i++) {
				if(arrlist.get(i).contains(""+excelutil.getData(35,27,0)+""))
				{
				 arrlistsort.add(arrlist.get(i));
				}
			}
			Assert.assertEquals(arrlistsort.size() , arrlist.size());	
//			if(arrlistsort.size() == arrlist.size())
//			{
//				System.out.println("Organization Hierarchy Tab matched");
//			}
//			else
//			{
//				System.out.println("Organization Hierarchy Tab unmatched");
//			}
			
		}
		
		
		public void designationSearch() throws InterruptedException {
			
			DesignationTab.click();
			
			SearchnameinDesignation.sendKeys(excelutil.getData(35, 27, 0));
			SearchnameinDesignation.sendKeys(Keys.ENTER);
			
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//*[@id='DesList'] //td[@class='center']/following-sibling::td[1]")).size();
			for (int i = 0; i < t; i++) {
			String getValue = getDriver().findElement(By.xpath("(//*[@id='DesList'] //td[@class='center']/following-sibling::td[1])["+(i+1)+"]")).getText();
			arrlist.add(getValue.toLowerCase());
				}
			
			for (int i = 0; i < arrlist.size(); i++) {
				if(arrlist.get(i).contains(""+excelutil.getData(35,27,0)+""))
				{
				 arrlistsort.add(arrlist.get(i));
				}
			}
			Assert.assertEquals(arrlistsort.size() , arrlist.size());	
//			if(arrlistsort.size() == arrlist.size())
//			{
//				System.out.println("Designation Tab matched");
//			}
//			else
//			{
//				System.out.println("Designation Tab unmatched");
//			}
			
		}
		
		
		
//Remove mapping between the organization and the role
		

		public void deleteRole() throws InterruptedException {
			
			WebElement getElement=  getDriver().findElement(By.xpath("//*[normalize-space(text())='"+excelutil.getData(35,8,2)+"']/following-sibling::td[4]/a[3]"));
			
			getElement.click();

			
			getDriver().findElement(By.xpath("//*[ normalize-space(text())='"+excelutil.getData(35,8,0)+"']/following-sibling:: td[normalize-space(text())='"+excelutil.getData(35,8,1)+"']/following-sibling::td/button")).click();
			
		
			System.out.println("DeletedSuccessfully");
				
				
			}
		
			}
		

