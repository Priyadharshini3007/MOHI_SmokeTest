package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.excelutil;

public class MasterDetailList {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public MasterDetailList() {

		PageFactory.initElements(getDriver(), this);

	}

	/////////////////////////////////////// MasterDetailListPageElements//////////////////////////////////////////

	@FindBy(linkText = "Admin")
	WebElement AdminMenu;

	@FindBy(linkText = "Master Detail List")
	WebElement MasterDetailListSubmenu;

	@FindBy(xpath = "//*[@id='DataCategory' and not(@type='hidden')]")
	WebElement CategoryDropdown;

	@FindBy(xpath = "//*[@class='table-grid grid']")
	WebElement Table;

	@FindBy(xpath = "//*[@id='Name']")
	WebElement Name;

	@FindBy(xpath = "//*[@id='ddlCenters']")
	WebElement center;

	@FindBy(xpath = "//*[@id='ddlClasses']")
	WebElement Class;

	@FindBy(xpath = "//*[@id='ddlSections']")
	WebElement Section;

	@FindBy(xpath = "//*[@id='Code']")
	WebElement Code;

	@FindBy(xpath = "//*[@id='IsSubSubject']")
	WebElement IsSubject;

	@FindBy(xpath = "(//*[@id='ddlSubjects'])[1]")
	WebElement ParentSubject;
	
	@FindBy(xpath = "//*[@id='Filter_ParentSubject']")
	WebElement FilterParentSubject;
	
	@FindBy(xpath = "//*[@id='IsExaminable']")
	WebElement IsExaminable;

	@FindBy(xpath = "//*[@id='ddlSubjects' and @name='SubjectID']")
	WebElement Subject;

	@FindBy(xpath = "//*[@id='SubjectOrder']")
	WebElement SubjectOrder;

	@FindBy(xpath = "//*[@title='Save']")
	WebElement Save;

	@FindBy(xpath = "//*[@class='btn btn-default btn-sm returntolist']")
	WebElement ReturnToList;

	@FindBy(linkText = "Add Master Detail")
	WebElement AddMasterDetailLink;
	
	@FindBy(xpath = "//*[@id='Filter_SubjectOrder']")
	WebElement SubjectOrderFilter;
	
	

	// Edit MAster Details Elements

	@FindBy(linkText = "Master Detail List")
	WebElement MasterDetailListLink;

	@FindBy(xpath = "//*[@id='btnSearch']")
	WebElement Search;

	@FindBy(xpath = "(//*[@class='fa fa-pencil-alt'])[1]")
	WebElement EditButton;

	@FindBy(xpath = "(//*[@class='fa fa-trash red'])[1]")
	WebElement DeleteButton;

	@FindBy(xpath = "//*[@id='flash']")
	WebElement Flashmessage;

	@FindBy(xpath = "//tbody[@class='center']")
	WebElement Row;

	@FindBy(xpath = "//*[@id='btnRefresh']")
	WebElement Refresh;

	@FindBy(xpath = "//*[@id='Filter_CenterID']")
	WebElement FilterCenter;

	@FindBy(xpath = "//*[@id='Filter_Code']")
	WebElement FilterClassCode;

	@FindBy(xpath = "//*[@id='Filter_Name']")
	WebElement FilterName;

	@FindBy(xpath = "//*[@id='Filter_ClassOrder']")
	WebElement FilterClassOrder;
	
	@FindBy(xpath = "//*[@id='Filter_Class']")
	WebElement FilterClass;
	
	

	@FindBy(xpath = "//*[@id='btnSearch']")
	WebElement Searchbutton;

	@FindBy(xpath = "//*[@class='fa fa-angle-right bigger-140 next-page  blue']")
	WebElement Nextbutton;

	@FindBy(xpath = "//*[@class='fa fa-angle-double-right bigger-140 last-page  blue']")
	WebElement DoubleNextbutton;

	@FindBy(xpath = "//*[@class='fa fa-angle-left bigger-140 prev-page  blue']")
	WebElement previousbutton;

	@FindBy(xpath = "//*[@class='fa fa-angle-double-left bigger-140 first-page  blue']")
	WebElement DoublePreviousButton;
	
	@FindBy(xpath="//*[@class='center' and @ colspan]")
	WebElement errortext;

	// 11393_Ensure that master detail list can be viewed

	public void MasterDetailListmenu() throws InterruptedException {

		com.automation.utils.excelutil.Excelp(".\\Studentdetails.xlsx");

		AdminMenu.click();
		MasterDetailListSubmenu.click();
	}

	public void masterListViewCategory() throws InterruptedException {

		String[] myList = { "Class", "Center, Class & Section Mapping", "Center, Class & Subject Mapping", "Subject",
				"Section", "Sport", "Religion", "Future Aspiration", "Father Career", "Mother Career",
				"Guardian Career", "Fee Type", "City", "Neighbourhood", "Future Career" };
		for (int i = 0; i < myList.length; i++) {

			Select selectCategoryDropdown1 = new Select(CategoryDropdown);
			selectCategoryDropdown1.selectByVisibleText(myList[i]);

			Thread.sleep(2000);

		}
	}

	public void masterListView() throws InterruptedException {

		boolean getValue = getDriver().findElement(By.xpath("//*[@class='table-grid grid']")).isDisplayed();

		Assert.assertEquals(true, getValue);

	}

	// Edit Master Detail List

	public void Categorytoedit() throws InterruptedException {

		Select selectCategoryDropdown = new Select(CategoryDropdown);
		selectCategoryDropdown.selectByVisibleText(excelutil.getData(31, 18, 0));

	}

	public void filterTheRecordToEdit() throws InterruptedException {

		FilterName.sendKeys(excelutil.getData(31, 1, 1));
		Search.click();

	}

	public void editCategory() throws InterruptedException {

		EditButton.click();

		if (Name.isDisplayed()) {
			Name.clear();
			Name.sendKeys(excelutil.getData(31, 18, 1));

		}

		if (center.isDisplayed()) {

			Select selectCenter = new Select(center);
			selectCenter.selectByVisibleText(excelutil.getData(31, 18, 2));

		}

		if (Class.isDisplayed()) {

			Select selectClass = new Select(Class);
			selectClass.selectByVisibleText(excelutil.getData(31, 18, 3));

		}

		if (Section.isDisplayed()) {

			Select selectSection = new Select(Section);
			selectSection.selectByVisibleText(excelutil.getData(31, 18, 4));

		}

		if (Code.isDisplayed()) {

			Code.clear();
			Code.sendKeys(excelutil.getData(31, 18, 5));

		}

		if (Subject.isDisplayed()) {

			Select selectSubject = new Select(Subject);
			selectSubject.selectByVisibleText(excelutil.getData(31, 18, 6));

		}

		if (SubjectOrder.isDisplayed()) {

			SubjectOrder.clear();
			SubjectOrder.sendKeys(excelutil.getData(31, 18, 7));

		}

	}

	public void SaveCategory() throws InterruptedException {

		Save.click();
		System.out.println(Flashmessage.getText());
	}

	// Delete Master Detail

	public void categoryToDelete() throws InterruptedException {

		Select selectCategoryDropdown = new Select(CategoryDropdown);
		selectCategoryDropdown.selectByVisibleText(excelutil.getData(31, 35, 0));

	}
	
	public void categoryToDeleteAssociatedData() throws InterruptedException {

		Select selectCategoryDropdown = new Select(CategoryDropdown);
		selectCategoryDropdown.selectByVisibleText(excelutil.getData(31, 57, 0));
		
		FilterName.sendKeys(excelutil.getData(31, 57, 1));
		Search.click();

	}

	public void filterTheRecordToDelete() throws InterruptedException {

		FilterName.sendKeys(excelutil.getData(31, 18, 1));
		Search.click();

	}

	public void deleteMasterDetailData() throws InterruptedException {

		DeleteButton.click();

		Alert a = getDriver().switchTo().alert();
		System.out.println(a.getText());
		a.accept();

		Alert b = getDriver().switchTo().alert();
		System.out.println(b.getText());
		b.accept();

	}

	// 14349-Ensure that master detail list report contains sort feature

	public void codeSortAsc() throws InterruptedException {

		// Father Career, Future Career

		String[] myList = { "Sport", "Religion", "Future Aspiration", "Mother Career", "Guardian Career", "Fee Type",
				"City", "Neighbourhood" };

		for (int i = 0; i < myList.length; i++) {

			Select selectCategoryDropdown1 = new Select(CategoryDropdown);
			selectCategoryDropdown1.selectByVisibleText(myList[i]);

			Thread.sleep(2000);

			// Column name:Code

			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();

			for (int j = 0; j < t; j++) {
				String getValue = getDriver()
						.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (j + 1) + "]"))
						.getText();
				arrlist.add(getValue.toLowerCase());
			}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);

			Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

			Thread.sleep(2000);

		}
	}

	public void nameSortAsc() throws InterruptedException {

		// sport
		// "Fee Type",

		String[] myList = { "Religion", "Future Aspiration", "Mother Career", "Guardian Career", "City",
				"Neighbourhood" };

		for (int i = 0; i < myList.length; i++) {

			Select selectCategoryDropdown1 = new Select(CategoryDropdown);
			selectCategoryDropdown1.selectByVisibleText(myList[i]);

			Thread.sleep(2000);

			// Column name:Name

			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[2]")).size();

			for (int j = 0; j < t; j++) {
				String getValue = getDriver()
						.findElement(By.xpath("(//td[@class='center']/following-sibling::td[2])[" + (j + 1) + "]"))
						.getText();
				arrlist.add(getValue.toLowerCase());
			}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);

			Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

			Thread.sleep(2000);

		}
	}

	public void codeSortDesc() throws InterruptedException {

		// Father Career, Future Career

		String[] myList = { "Father Career", "Future Career", "Sport", "Religion", "Future Aspiration", "Mother Career",
				"Guardian Career", "Fee Type", "City", "Neighbourhood" };

		for (int i = 0; i < myList.length; i++) {

			Select selectCategoryDropdown1 = new Select(CategoryDropdown);
			selectCategoryDropdown1.selectByVisibleText(myList[i]);

			Thread.sleep(2000);

			// Column name:Code

			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();
			Thread.sleep(1000);
			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();

			for (int j = 0; j < t; j++) {
				String getValue = getDriver()
						.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (j + 1) + "]"))
						.getText();
				arrlist.add(getValue.toLowerCase());
			}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);
			Collections.reverse(arrlist);

			Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

			Thread.sleep(2000);

		}
	}

	public void nameSortDesc() throws InterruptedException {

		// sport
		// "Fee Type",

		String[] myList = { "Sport", "Fee Type", "Father Career", "Future Career", "Religion", "Future Aspiration",
				"Mother Career", "Guardian Career", "City", "Neighbourhood" };

		for (int i = 0; i < myList.length; i++) {

			Select selectCategoryDropdown1 = new Select(CategoryDropdown);
			selectCategoryDropdown1.selectByVisibleText(myList[i]);

			Thread.sleep(2000);

			// Column name:Name

			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();
			Thread.sleep(1000);
			getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();
			Thread.sleep(2000);
			ArrayList<String> arrlist = new ArrayList<String>();
			ArrayList<String> arrlistsort = new ArrayList<String>();
			int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[2]")).size();

			for (int j = 0; j < t; j++) {
				String getValue = getDriver()
						.findElement(By.xpath("(//td[@class='center']/following-sibling::td[2])[" + (j + 1) + "]"))
						.getText();
				arrlist.add(getValue.toLowerCase());
			}
			arrlistsort = (ArrayList<String>) arrlist.clone();
			Collections.sort(arrlist);
			Collections.reverse(arrlist);

			Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

			Thread.sleep(2000);

		}
	}

	public void ClassCategoryAsc() throws InterruptedException {

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Class");

		Thread.sleep(2000);

	}

	public void ClasscenterSortAsc() throws InterruptedException {
		// Column name:center

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	public void ClassCodeSortAsc() throws InterruptedException {

		// Column name:Code

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[2]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[2]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[2])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();
	}

	public void ClassNameSortAsc() throws InterruptedException {

		// Column name:Name

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[3]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[3]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[3])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	public void ClassOrderSortAsc() throws InterruptedException {

		// Column name:ClassOrder

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[4]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[4]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[4])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	// Category : Class (In Descending order)

	public void CategoryClassSortdesc() throws InterruptedException {

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Class");

		Thread.sleep(2000);

	}

	public void ClasscenterSortdesc() throws InterruptedException {
		// Column name:center (Desc)

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();

		Thread.sleep(2000);

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);
		Collections.reverse(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	public void ClassCodeSortDesc() throws InterruptedException {

		// Column name:Code

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[2]")).click();

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();
		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[2]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[2])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);
		Collections.reverse(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();
	}

	public void ClassNameSortDesc() throws InterruptedException {

		// Column name:Name

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[3]")).click();

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[3]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[3])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);
		Collections.reverse(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	public void ClassOrderSortDesc() throws InterruptedException {

		// Column name:ClassOrder

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[4]")).click();

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[4]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[4])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);
		Collections.reverse(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	// Category : Section Sort in ascending order

	public void SectionNameSortAsc() throws InterruptedException {

		// Column name:Name

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Section");

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	// Category : Section Sort in ascending order

	public void SectionNameSortDesc() throws InterruptedException {

		// Column name:Name

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Section");

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[1]")).click();

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);
		Collections.reverse(arrlist);
		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	// Category: Center, Class & Section Mapping (ASC)

	public void CenterClassSectionCenterSortAsc() throws InterruptedException {

		// Column name:Center

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Center, Class & Section Mapping");

		this.ClasscenterSortAsc();
	}

	public void CenterClassSectionClassSortAsc() throws InterruptedException {

		// Column name:Class

		this.ClassCodeSortAsc();

	}

	public void CenterClassSectionNameSortAsc() throws InterruptedException {

		// Column name:Name

		this.ClassNameSortAsc();

	}

	// Category: Center, Class & Section Mapping (Desc)

	public void CenterClassSectionCenterSortDesc() throws InterruptedException {

		// Column name:Center

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Center, Class & Section Mapping");

		this.ClasscenterSortdesc();

	}

	public void CenterClassSectionClassSortDesc() throws InterruptedException {

		// Column name:Class

		this.ClassCodeSortDesc();

	}

	public void CenterClassSectionNameSortDesc() throws InterruptedException {

		// Column name:Name
		this.ClassNameSortDesc();

	}

	// Category: Subject (ASC)

	public void subjectCodeSortAsc() throws InterruptedException {

		// Column name:Code

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Subject");

		this.ClasscenterSortAsc();
	}

	public void subjectNameSortAsc() throws InterruptedException {

		// Column name:Name

		this.ClassCodeSortAsc();

	}

	public void parentSubjectSortAsc() throws InterruptedException {

		// Column name:ParentSubject

		this.ClassNameSortAsc();

	}

	public void isExaminableSortAsc() throws InterruptedException {

		// Column name:IsExaminable

		this.ClassOrderSortAsc();

	}

	// Category: Subject (Desc)

	public void SubjectCodeSortDesc() throws InterruptedException {

		// Column name:Code

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Subject");

		this.ClasscenterSortdesc();

	}

	public void SubjectNameSortDesc() throws InterruptedException {

		// Column name:Name

		this.ClassCodeSortDesc();

	}

	public void ParentSubjectSortDesc() throws InterruptedException {

		// Column name:ParentSubject
		this.ClassNameSortDesc();

	}

	public void isExaminableSortDesc() throws InterruptedException {

		// Column name:isExaminable

		this.ClassOrderSortDesc();
	}

	// Category: Center,Class & Subject Mapping (Asc)

	public void CenterClasssubjectCenterSortAsc() throws InterruptedException {

		// Column name:centre

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Center, Class & Subject Mapping");

		this.ClasscenterSortAsc();
	}

	public void CenterClasssubjectClassSortAsc() throws InterruptedException {

		// Column name:Class

		this.ClassCodeSortAsc();

	}

	public void CenterClasssubjectClassNameSortAsc() throws InterruptedException {

		// Column name:Name

		this.ClassNameSortAsc();

	}

	public void CenterClasssubjectClassParentSubjectSortAsc() throws InterruptedException {

		// Column name:ParentSubject

		this.ClassOrderSortAsc();

	}

	public void CenterClasssubjectISExaminableSortAsc() throws InterruptedException {

		// Column name:IsExaminable

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[5]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[5]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[5])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	public void CenterClasssubjectorderSortAsc() throws InterruptedException {

		// Column name:SubjectOrder

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[6]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[6]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[6])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	// Category: Center,Class & Subject Mapping (Desc)

	public void CenterClasssubjectCenterSortDesc() throws InterruptedException {

		// Column name:Center

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Center, Class & Subject Mapping");

		this.ClasscenterSortdesc();

	}

	public void CenterClasssubjectClassSortDesc() throws InterruptedException {

		// Column name:Class

		this.ClassCodeSortDesc();

	}

	public void CenterClasssubjectClassNameSortDesc() throws InterruptedException {

		// Column name:Name
		this.ClassNameSortDesc();

	}

	public void CenterClasssubjectClassParentSubjectSortDesc() throws InterruptedException {

		// Column name:ParentSubject

		this.ClassOrderSortDesc();
	}

	public void CenterClasssubjectISExaminableSortDesc() throws InterruptedException {

		// Column name:IsExaminable

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[5]")).click();

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[5]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[5])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);
		Collections.reverse(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	public void CenterClasssubjectorderSortDesc() throws InterruptedException {

		// Column name:SubjectOrder

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Ascending order'])[6]")).click();

		Thread.sleep(1000);

		getDriver().findElement(By.xpath("(//*[@title='Click to sort in Descending order'])[1]")).click();

		Thread.sleep(2000);
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[6]")).size();

		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[6])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}
		arrlistsort = (ArrayList<String>) arrlist.clone();
		Collections.sort(arrlist);
		Collections.reverse(arrlist);

		Assert.assertArrayEquals(arrlist.toArray(), arrlistsort.toArray());

		Thread.sleep(2000);

		Refresh.click();

	}

	// Tc-14350 -Ensure that master detail list report contains search feature
	
	public void CategoryClassSearch() throws InterruptedException {

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Class");

		FilterCenter.sendKeys(excelutil.getData(37, 2, 0));
		FilterClassCode.sendKeys(excelutil.getData(37, 2, 2));
		FilterName.sendKeys(excelutil.getData(37, 2, 3));
		
		Select selectCategoryDropdown2 = new Select(FilterClassOrder);
		selectCategoryDropdown2.selectByVisibleText(excelutil.getData(37, 2, 4));
		
		Searchbutton.click();
		// FilterName.sendKeys(Keys.ENTER);

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int i = 0; i < t; i++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (i + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).contains(""+excelutil.getData(37, 2, 1).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(i));
			}
		}
		//Assert.assertEquals(arrlistsort.size(), arrlist.size());
		if(arrlistsort.size() > 0)
		{
		Assert.assertEquals(arrlistsort.get(0).toLowerCase() , excelutil.getData(37, 2, 1).toLowerCase());
	}
		else
		{
			String exp="No records found. Please use a different search criteria.".trim();
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
		}
		Refresh.click();
	}
	
	
	
	public void CategorySectionName() throws InterruptedException {

		//Category : Section
		
		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Section");
		
		FilterName.sendKeys(excelutil.getData(37, 5, 0));
		
		Searchbutton.click();

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int i = 0; i < t; i++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (i + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).contains(""+excelutil.getData(37, 5, 0).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(i));
			}
		}
		//Assert.assertEquals(arrlistsort.size(), arrlist.size());
		
		if(arrlistsort.size() > 0)
		{
		Assert.assertEquals(arrlistsort.get(0).toLowerCase() , excelutil.getData(37, 5, 0).toLowerCase());
	}
		else
		{
			String exp="No records found. Please use a different search criteria.".trim();
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
		}
		Refresh.click();
	}

//	Category : Center,Class & Section Mapping	(search)	
	
	public void CategorycenterSectionMappingSearch() throws InterruptedException {

	

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Center, Class & Section Mapping");

		Select selectCenter = new Select(FilterCenter);
		selectCenter.selectByVisibleText(excelutil.getData(37, 8, 0));

		Select selectClass = new Select(FilterClass);
		selectClass.selectByVisibleText(excelutil.getData(37, 8, 2));
		
		Searchbutton.click();
		
		Thread.sleep(1000);
		

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int i = 0; i < t; i++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (i + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).contains(""+excelutil.getData(37, 8, 1).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(i));
			}
		}
		//Assert.assertEquals(arrlistsort.size(), arrlist.size());
		if(arrlistsort.size() > 0)
		{
		Assert.assertEquals(arrlistsort.get(0).toLowerCase() , excelutil.getData(37, 8, 1).toLowerCase());
	}
		else
		{
			String exp="No records found. Please use a different search criteria.".trim();
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
		}
		Refresh.click();
	}
	
	
	
//Category: Subject (search)
	
	
	public void CategorySubjectSearch() throws InterruptedException {

		
		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Subject");
		
		FilterClassCode.sendKeys(excelutil.getData(37, 11, 0));
		
		FilterName.sendKeys(excelutil.getData(37, 11, 1));
		
		FilterParentSubject.sendKeys(excelutil.getData(37, 11, 2));
		
		Searchbutton.click();
		
		Thread.sleep(1000);

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int i = 0; i < t; i++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (i + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).contains(""+excelutil.getData(37, 11, 0).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(i));
			}
		}
		//Assert.assertEquals(arrlistsort.size(), arrlist.size());
		if(arrlistsort.size() > 0)
		{
		Assert.assertEquals(arrlistsort.get(0).toLowerCase() , excelutil.getData(37, 11, 0).toLowerCase());
	}
		else
		{
			String exp="No records found. Please use a different search criteria.".trim();
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
		}
		Refresh.click();
	}
	
	
//	Category : Center,Class & Subject Mapping	(search)
	
	public void CategoryCenterClassSubjectSearch() throws InterruptedException {

		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Center, Class & Subject Mapping");
		
		Select selectCenter = new Select(FilterCenter);
		selectCenter.selectByVisibleText(excelutil.getData(37, 14, 0));
		
		Select selectClass = new Select(FilterClass);
		selectClass.selectByVisibleText(excelutil.getData(37, 14, 2));
		
		FilterName.sendKeys(excelutil.getData(37, 14, 3));
		
		FilterParentSubject.sendKeys(excelutil.getData(37, 14, 4));
		
		Select selectSubjectOrder = new Select(SubjectOrderFilter);
		selectSubjectOrder.selectByVisibleText(excelutil.getData(37, 14, 5));
		
		Searchbutton.click();
		
		Thread.sleep(1000);

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int i = 0; i < t; i++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (i + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).contains(""+excelutil.getData(37, 14, 1).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(i));
			}
		}
		//Assert.assertEquals(arrlistsort.size(), arrlist.size());
		if(arrlistsort.size() > 0)
		{
		Assert.assertEquals(arrlistsort.get(0).toLowerCase() , excelutil.getData(37, 14, 1).toLowerCase());
	}
		else
		{
			String exp="No records found. Please use a different search criteria.".trim();
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
		}
		Refresh.click();
	}
	
	
		
//	Category : Sports(search)
	
	public void CategorySportsSearch() throws InterruptedException {

		// Column name:Code
		
		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Sport");
		
		FilterClassCode.sendKeys(excelutil.getData(37, 17, 0));
		FilterName.sendKeys(excelutil.getData(37, 17, 1));
		
		Searchbutton.click();
		
		Thread.sleep(1000);

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int i = 0; i < t; i++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (i + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).contains(""+excelutil.getData(37, 17, 0).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(i));
			}
		}
		//Assert.assertEquals(arrlistsort.size(), arrlist.size());
		if(arrlistsort.size() > 0)
		{
		Assert.assertEquals(arrlistsort.get(0).toLowerCase() , excelutil.getData(37, 17, 0).toLowerCase());
	}
		else
		{
			String exp="No records found. Please use a different search criteria.".trim();
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
		}
		Refresh.click();
	}
	
	
//Category : Religion (Search)
	
	
	public void ReligionSearch() throws InterruptedException {

		// Column name:Code
		
		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Religion");
		
		FilterClassCode.sendKeys(excelutil.getData(37, 20, 0));
		
		FilterName.sendKeys(excelutil.getData(37, 20, 1));
		
		Searchbutton.click();
		
		Thread.sleep(1000);

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int i = 0; i < t; i++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (i + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).contains(""+excelutil.getData(37, 20, 0).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(i));
			}
		}
		//Assert.assertEquals(arrlistsort.size(), arrlist.size());
		
		if(arrlistsort.size() > 0)
		{
		Assert.assertEquals(arrlistsort.get(0).toLowerCase() , excelutil.getData(37, 20, 0).toLowerCase());
	}
		else
		{
			String exp="No records found. Please use a different search criteria.".trim();
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
		}
		Refresh.click();
	}
	
	
	
// category : Future Aspiration
	
	
	public void futureAspirationSearch() throws InterruptedException {

		// Column name:Code
		
		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Future Aspiration");
		
		FilterClassCode.sendKeys(excelutil.getData(37, 23, 0));
		
		FilterName.sendKeys(excelutil.getData(37, 23, 1));
		
		Searchbutton.click();
		
		Thread.sleep(1000);

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int i = 0; i < t; i++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (i + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).contains(""+excelutil.getData(37, 23, 0).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(i));
			}
		}
		//Assert.assertEquals(arrlistsort.size(), arrlist.size());
		if(arrlistsort.size() > 0)
		{
		Assert.assertEquals(arrlistsort.get(0).toLowerCase() , excelutil.getData(37, 23, 0).toLowerCase());
	}
		else
		{
			String exp="No records found. Please use a different search criteria.".trim();
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
		}
		Refresh.click();
	}
	
//Category : Fee Type
	
		public void feeTypeSearch() throws InterruptedException {

		
		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Fee Type");
		
		FilterClassCode.sendKeys(excelutil.getData(37, 26, 0));
		
		FilterName.sendKeys(excelutil.getData(37, 26, 1));
		
		Searchbutton.click();
		
		Thread.sleep(1000);

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int i = 0; i < t; i++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (i + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).contains(""+excelutil.getData(37, 26, 0).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(i));
			}
		}
		//Assert.assertEquals(arrlistsort.size(), arrlist.size());
		if(arrlistsort.size() > 0)
		{
		Assert.assertEquals(arrlistsort.get(0).toLowerCase() , excelutil.getData(37, 26, 0).toLowerCase());
	}
		else
		{
			String exp="No records found. Please use a different search criteria.".trim();
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
		}
		Refresh.click();
	}
	
	
	
//Category :  City
	
	

	public void citySearch() throws InterruptedException {

	
		
		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("City");
		
		FilterClassCode.sendKeys(excelutil.getData(37, 29, 0));
		
		FilterName.sendKeys(excelutil.getData(37, 29, 1));
		
		Searchbutton.click();
		
		Thread.sleep(1000);

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int i = 0; i < t; i++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (i + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).contains(""+excelutil.getData(37, 29, 0).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(i));
			}
		}
		//Assert.assertEquals(arrlistsort.size(), arrlist.size());
		if(arrlistsort.size() > 0)
		{
		Assert.assertEquals(arrlistsort.get(0).toLowerCase() , excelutil.getData(37, 29, 0).toLowerCase());
	}
		else
		{
			String exp="No records found. Please use a different search criteria.".trim();
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
		}
		Refresh.click();
	}
	
	
	
//Category : Neighbourhood
	
	public void neighbourhoodSearch() throws InterruptedException {

		// Column name:Code
		
		Select selectCategoryDropdown1 = new Select(CategoryDropdown);
		selectCategoryDropdown1.selectByVisibleText("Neighbourhood");
		
		FilterClassCode.sendKeys(excelutil.getData(37, 32, 0));
		
		FilterName.sendKeys(excelutil.getData(37, 32, 1));
		
		Searchbutton.click();
		
		Thread.sleep(1000);

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int i = 0; i < t; i++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (i + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).contains(""+excelutil.getData(37, 32, 0).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(i));
			}
		}
		//Assert.assertEquals(arrlistsort.size(), arrlist.size());
		if(arrlistsort.size() > 0)
		{
		Assert.assertEquals(arrlistsort.get(0).toLowerCase() , excelutil.getData(37, 29, 0).toLowerCase());
	}
		else
		{
			String exp="No records found. Please use a different search criteria.".trim();
			  String text=errortext.getText();
			   Assert.assertEquals(text,exp);
		}
		Refresh.click();
	}
		
	
//		Category : Father Career, Mother Career, Future Career,Guardian career
	
	
	public void CareersSearch() throws InterruptedException {

	
		
		
		String[] myList = { "Father Career", "Mother Career", "Guardian Career","Future Career" };
		for (int i = 0; i < myList.length; i++) {

			Select selectCategoryDropdown1 = new Select(CategoryDropdown);
			selectCategoryDropdown1.selectByVisibleText(myList[i]);

			Thread.sleep(2000);
		
	
		
		FilterClassCode.sendKeys(excelutil.getData(37, 35, 0));
		
		FilterName.sendKeys(excelutil.getData(37, 35, 1));
		
		Searchbutton.click();
		
		Thread.sleep(1000);

		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlistsort = new ArrayList<String>();
		int t = getDriver().findElements(By.xpath("//td[@class='center']/following-sibling::td[1]")).size();
		for (int j = 0; j < t; j++) {
			String getValue = getDriver()
					.findElement(By.xpath("(//td[@class='center']/following-sibling::td[1])[" + (j + 1) + "]"))
					.getText();
			arrlist.add(getValue.toLowerCase());
		}

		for (int j = 0; j < arrlist.size(); j++) {
			if (arrlist.get(j).contains(""+excelutil.getData(37, 35, 0).toLowerCase()+"")) {
				arrlistsort.add(arrlist.get(j));
			}
		}
		Assert.assertEquals(arrlistsort.size(), arrlist.size());
		
		Refresh.click();
		}
	}

	
// MasterDetailListPagingFeature

	public void MasterDetailListPagingFeature() throws InterruptedException {

		String[] myList = { "Class", "Center, Class & Section Mapping", "Center, Class & Subject Mapping", "Subject",
				"Sport", "Religion", "Future Aspiration", "Father Career", "Mother Career", "Guardian Career",
				"Fee Type", "City", "Neighbourhood", "Future Career" };
		for (int i = 0; i < myList.length; i++) {

			Select selectCategoryDropdown1 = new Select(CategoryDropdown);
			selectCategoryDropdown1.selectByVisibleText(myList[i]);

			Thread.sleep(2000);
			
			
			boolean nextbutton = getDriver().findElements(By.xpath("//*[@class='fa fa-angle-right bigger-140 next-page  blue']")).size()!=0;
			boolean Doublenextbutton = getDriver().findElements(By.xpath("//*[@class='fa fa-angle-double-right bigger-140 last-page  blue']")).size()!=0;
			boolean Previousbutton = getDriver().findElements(By.xpath("//*[@class='fa fa-angle-left bigger-140 prev-page  blue']")).size()!=0;
			boolean Doublepreviousbutton = getDriver().findElements(By.xpath("//*[@class='fa fa-angle-double-left bigger-140 first-page  blue']")).size()!=0;
			
			if (nextbutton) {

				JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
				scrolldown1.executeScript("arguments[0].scrollIntoView()", Nextbutton);

				Nextbutton.click();

			}

			if (Doublenextbutton) {

				JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
				scrolldown1.executeScript("arguments[0].scrollIntoView()", DoubleNextbutton);

				DoubleNextbutton.click();

			}

			if (Previousbutton) {

				JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
				scrolldown1.executeScript("arguments[0].scrollIntoView()", previousbutton);

				previousbutton.click();

			}

			if (Doublepreviousbutton) {

				JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
				scrolldown1.executeScript("arguments[0].scrollIntoView()", DoublePreviousButton);

				DoublePreviousButton.click();

			}

		}
	}
}
