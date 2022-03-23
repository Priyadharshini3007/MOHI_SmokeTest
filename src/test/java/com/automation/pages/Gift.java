package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.webDriverclick;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.utils.WebElementUtils;
import com.automation.utils.excelutil;

public class Gift {

	public Gift() {

		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(linkText = "Active students")
	WebElement ActiveStudents;

	@FindBy(xpath = "(//span[@title='CMFID'])[10]")
	WebElement CMFID;
	
	@FindBy(xpath = "(//span[@title='CMFID'])[11]")
	WebElement CMFID1;
	
	@FindBy(xpath = "(//span[@title='CMFID'])[12]")
	WebElement CMFID2;
	
	@FindBy(xpath = "(//span[@title='CMFID'])[13]")
	WebElement CMFID3;
	
	@FindBy(xpath = "(//span[@title='CMFID'])[14]")
	WebElement CMFID4;

	@FindBy(linkText = "Student")
	WebElement Student;

	@FindBy(linkText = "Gifts")
	WebElement Gifts;

	@FindBy(xpath = "//button[@class='btn btn-primary right']")
	WebElement AddGiftButton;

	@FindBy(xpath = "//*[@id='ddlGiftType']")
	WebElement GiftType;

	@FindBy(xpath = "//*[@id='select2-ddlChildName-container']")
	WebElement SelectChild;

	@FindBy(xpath = "//*[@class='select2-search__field']")
	WebElement ChildCMF;

	@FindBy(xpath = "//*[@class='multiselect dropdown-toggle btn btn-default']")
	WebElement SelectGift;

	@FindBy(xpath = "//*[@id='txtGiftDesc']")
	WebElement GiftDescription;

	@FindBy(xpath = "//*[@id='txtDonorName']")
	WebElement DonorName;

	@FindBy(xpath = "//*[@id='txtComments']")
	WebElement Comments;

	@FindBy(xpath = "//*[@id='savegift']")
	WebElement save;

	String Child;

	public void ActiveStudent() {

		WebElementUtils.waitForVisible(ActiveStudents);

		ActiveStudents.click();

	}

	public void getStudent() {

		WebElementUtils.waitForVisible(CMFID);
		WebElementUtils.scrolltoview(CMFID);

		BaseClass.Child = CMFID.getText();
		System.out.println(BaseClass.Child);
	}
	
	public void getStudent1() {

		WebElementUtils.waitForVisible(CMFID1);
		WebElementUtils.scrolltoview(CMFID1);

		BaseClass.Child1 = CMFID1.getText();
		System.out.println(BaseClass.Child1);
	}
	
	public void getStudent2() {

		WebElementUtils.waitForVisible(CMFID2);
		WebElementUtils.scrolltoview(CMFID2);

		BaseClass.Child2 = CMFID2.getText();
		System.out.println(BaseClass.Child2);
	}
	
	public void getStudent3() {

		WebElementUtils.waitForVisible(CMFID3);
		WebElementUtils.scrolltoview(CMFID3);

		BaseClass.Child3 = CMFID3.getText();
		System.out.println(BaseClass.Child3);
	}
	
	public void getStudent4() {

		WebElementUtils.waitForVisible(CMFID4);
		WebElementUtils.scrolltoview(CMFID4);

		BaseClass.Child4 = CMFID4.getText();
		System.out.println(BaseClass.Child4);
	}

	public void giftMenu() {

		Student.click();
		Gifts.click();

	}

	public void addGift() {

		WebElementUtils.waitForVisible(AddGiftButton);
		AddGiftButton.click();
	}

	public void giftType() {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		Select selGftType = new Select(GiftType);
		selGftType.selectByVisibleText(excelutil.getData(41, 1, 0));
	}

	public void selectChild() {

		SelectChild.click();
		ChildCMF.sendKeys(BaseClass.Child);
		ChildCMF.sendKeys(Keys.ENTER);

	}
	
	public void selectChild1() {

		SelectChild.click();
		ChildCMF.sendKeys(BaseClass.Child1);
		ChildCMF.sendKeys(Keys.ENTER);

	}
	
	public void selectChild2() {

		SelectChild.click();
		ChildCMF.sendKeys(BaseClass.Child2);
		ChildCMF.sendKeys(Keys.ENTER);

	}
	
	public void selectChild3() {

		SelectChild.click();
		ChildCMF.sendKeys(BaseClass.Child3);
		ChildCMF.sendKeys(Keys.ENTER);

	}
	
	public void selectChild4() {

		SelectChild.click();
		ChildCMF.sendKeys(BaseClass.Child4);
		ChildCMF.sendKeys(Keys.ENTER);

	}

	public void selectGift() {

		SelectGift.click();

		String[] centerChkBox = excelutil.getData(41, 1, 1).split(",");

		for (int i = 0; i < centerChkBox.length; i++) {
			getDriver().findElement(By.xpath("//label[contains(text(),'" + centerChkBox[i] + "')]/input")).click();

		}

	}

	public void giftDescription() {

		com.automation.utils.excelutil.Excelp(".//Studentdetails.xlsx");

		if (GiftDescription.isEnabled()) {

			GiftDescription.sendKeys(excelutil.getData(41, 1, 4));

		}
	}

	public void donarName() {

		DonorName.sendKeys(excelutil.getData(41, 1, 2));

	}

	public void Comments() {

		Comments.sendKeys(excelutil.getData(41, 1, 3));

	}

	public void saveAddedGift() {

		save.click();
	}

	@FindBy(xpath = "//*[@type='search']")
	WebElement searchChild;

	@FindBy(xpath = "(//*[@type='checkbox'])[2]")
	WebElement checkbox;

	@FindBy(xpath = "//button[@id='btnclick']")
	WebElement MarkasProcessing;

	@FindBy(xpath = "(//select[@class='js-example-basic-single dropdown-width select2-hidden-accessible'])[6]")
	WebElement StatusDrpdwn;

	@FindBy(xpath = "//button[@id='Confirmok']")
	WebElement okButton;

	public void searchChild() throws InterruptedException {

		Thread.sleep(3000);
		searchChild.clear();
		searchChild.sendKeys(BaseClass.Child);
	}
	
	public void searchChild1() throws InterruptedException {

		Thread.sleep(3000);
		searchChild.clear();
		searchChild.sendKeys(BaseClass.Child1);
	}
	
	public void searchChild2() throws InterruptedException {

		Thread.sleep(3000);
		searchChild.clear();
		searchChild.sendKeys(BaseClass.Child2);
	}
	
	public void searchChild3() throws InterruptedException {

		Thread.sleep(3000);
		searchChild.clear();
		searchChild.sendKeys(BaseClass.Child3);
	}
	
	public void searchChild4() throws InterruptedException {

		Thread.sleep(3000);
		searchChild.clear();
		searchChild.sendKeys(BaseClass.Child4);
	}

	public void checkBox() throws InterruptedException {
		Thread.sleep(3000);

		checkbox.click();
	}

	public void MarkProcessing() throws InterruptedException {

		Thread.sleep(3000);
		MarkasProcessing.click();
	}

	public void popup() throws InterruptedException {

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", okButton);

		// okButton.click();

	}

	public void StatusDrpDwn() throws InterruptedException {

		Thread.sleep(2000);

		Select selstsdrpdwn = new Select(StatusDrpdwn);
		selstsdrpdwn.selectByVisibleText("Order Processing");

	}

	public void verifyrecentlyaddedGift() throws InterruptedException {

		Thread.sleep(3000);

		searchChild.sendKeys(BaseClass.Child);

		boolean getElement = getDriver().findElements(By.xpath("(//*[@type='checkbox'])[2]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}
	
	public void verifyrecentlyaddedGift1() throws InterruptedException {

		Thread.sleep(3000);

		searchChild.sendKeys(BaseClass.Child1);

		boolean getElement = getDriver().findElements(By.xpath("(//*[@type='checkbox'])[2]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}
	
	public void verifyrecentlyaddedGift2() throws InterruptedException {

		Thread.sleep(3000);

		searchChild.sendKeys(BaseClass.Child2);

		boolean getElement = getDriver().findElements(By.xpath("(//*[@type='checkbox'])[2]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}
	
	public void verifyrecentlyaddedGift3() throws InterruptedException {

		Thread.sleep(3000);

		searchChild.sendKeys(BaseClass.Child3);

		boolean getElement = getDriver().findElements(By.xpath("(//*[@type='checkbox'])[2]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}
	
	public void verifyrecentlyaddedGift4() throws InterruptedException {

		Thread.sleep(3000);

		searchChild.sendKeys(BaseClass.Child4);

		boolean getElement = getDriver().findElements(By.xpath("(//*[@type='checkbox'])[2]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	@FindBy(xpath = "//button[@id='btnclick']")
	WebElement MarkAsReadyForPickup;

	@FindBy(xpath = "//button[@id='btnclick']")
	WebElement MarkAsPickup;

	public void ReadyForPickup() throws InterruptedException {

		Thread.sleep(2000);
		MarkAsReadyForPickup.click();
	}

	public void OrderReadyStatusDrpDwn() throws InterruptedException {

		Thread.sleep(2000);

		Select selstsdrpdwn = new Select(StatusDrpdwn);
		selstsdrpdwn.selectByVisibleText("Order Ready for Pick Up");

	}

	public void markAsPickupbutton() throws InterruptedException {

		Thread.sleep(2000);

		MarkAsPickup.click();

	}

	@FindBy(xpath = "//li//a[@href='/dashboard/index' and @class='nav-link dropdown-toggle']")
	WebElement Dashboard;

	@FindBy(linkText = "My Dashboard")
	WebElement MyDashboard;

	@FindBy(xpath = "//*[@title='Expand Student']")
	WebElement ExpandStudent;

	@FindBy(xpath = "//a[contains(@href,'/Student/GetAllGiftList?Filterstring=Gifts_PickedUP_Today_Alert')]")
	WebElement PickedUpTodayAlert;

	public void VerifyPickedUpTdyAlert() throws InterruptedException {

		Thread.sleep(2000);

		Dashboard.click();
		MyDashboard.click();

		Thread.sleep(2000);

		webDriverclick(ExpandStudent);

		WebElementUtils.waitForVisible(PickedUpTodayAlert);

		boolean getElement = getDriver()
				.findElements(By
						.xpath("//a[contains(@href,'/Student/GetAllGiftList?Filterstring=Gifts_PickedUP_Today_Alert')]"))
				.size() != 0;

		Assert.assertEquals(true, getElement);

	}

	@FindBy(xpath = "//a[@id='checkedout']")
	WebElement CheckOut;

	public void CheckOutButton() throws InterruptedException {

		Thread.sleep(2000);

		CheckOut.click();
	}

	public void checkedOutStatusDrpDwn() throws InterruptedException {

		Thread.sleep(2000);

		Select selstsdrpdwn = new Select(StatusDrpdwn);
		selstsdrpdwn.selectByVisibleText("Checked Out");

	}

	@FindBy(xpath = "(//i[@title='Download Excel'])[1]")
	WebElement Excel;

	public boolean isFileDownloaded(String downloadPath, String fileName) {

		boolean flag = false;
		File dir = new File(downloadPath);
		File[] dir_contents = dir.listFiles();

		for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().toLowerCase().contains(fileName))
				System.out.println(fileName);
			return flag = true;
		}

		return flag;
	}

	String home = System.getProperty("user.home");

	String downloadPath = new File(home + "/Downloads/").getPath();

	public void DwnldExcel() throws InterruptedException {

		Thread.sleep(2000);
		Excel.click();

		Assert.assertTrue("Failed to download Expected document", isFileDownloaded(downloadPath, "Gift"));

	}

	@FindBy(xpath = "//i[@title='Mark as delivered']")
	WebElement MarkAsDelivered;

	@FindBy(xpath = "//input[@class='file-upload']")
	WebElement UploadImage;

	@FindBy(xpath = "//button[@id='savedeliveredgift']")
	WebElement SaveDeliveredGift;

	@FindBy(xpath = "//i[@title='Mark it as gift complete']")
	WebElement MarkGiftAsComplete;

	public void DeliveredButton() throws InterruptedException {

		Thread.sleep(2000);

		MarkAsDelivered.click();
	}

	public void UploadImage() throws InterruptedException {

		// WebElementUtils.waitForVisible(UploadImage);
		Thread.sleep(6000);

		String pathupload = System.getProperty("user.dir");

		String fullPathupload = pathupload + "//Images//student images.jpg";

		System.out.println(fullPathupload);

		UploadImage.sendKeys(fullPathupload);

		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", SaveDeliveredGift);

		Thread.sleep(3000);

	}

	// public void SaveDeliveredGift() throws InterruptedException {
	//
	// WebElementUtils.waitForVisible(SaveDeliveredGift);
	// WebElementUtils.scrolltoview(SaveDeliveredGift);
	//
	// JavascriptExecutor jse = (JavascriptExecutor) getDriver();
	// jse.executeScript("arguments[0].click()", SaveDeliveredGift);
	//
	// //SaveDeliveredGift.click();
	// }

	public void deliveredStatusDrpDwn() throws InterruptedException {

		Thread.sleep(3000);

		Select selstsdrpdwn = new Select(StatusDrpdwn);
		selstsdrpdwn.selectByVisibleText("Delivered");

		Thread.sleep(3000);

	}

	public void MarkComplete() throws InterruptedException {

		Thread.sleep(3000);

		MarkGiftAsComplete.click();

	}

	public void completedStsdp() throws InterruptedException {

		Thread.sleep(3000);

		Select selstsdrpdwn = new Select(StatusDrpdwn);
		selstsdrpdwn.selectByVisibleText("Completed");

	}

	@FindBy(xpath = "(//i[@title='Mark as Undelivered'])[1]")
	WebElement MarkUndelivered;

	@FindBy(xpath = "//select[@class='ddlundelivereddropdown select2-hidden-accessible']")
	WebElement Reason;

	@FindBy(xpath = "//textarea[@style='width:100%;']")
	WebElement Commentss;

	@FindBy(xpath = "//button[@id='saveUndeliveredgift']")
	WebElement saveUndelivered;

	@FindBy(xpath = "//*[@id='GiftTable']/tbody/tr/td[6]")
	WebElement CheckedOutStudent;

	public void getCheckedOutStudent() throws InterruptedException {

		BaseClass.checkoutChild = getDriver().findElement(By.xpath("//*[@id='GiftTable']/tbody/tr/td[6]")).getText()
				.split("\\(")[1].replace(")", "");

	}

	public void uneliverdbutton() throws InterruptedException {

		Thread.sleep(3000);

		MarkUndelivered.click();

	}

	public void Reasondp() throws InterruptedException {

		Thread.sleep(3000);

		Select selstsdrpdwn = new Select(Reason);
		selstsdrpdwn.selectByVisibleText("Absent");

	}

	public void comentss() throws InterruptedException {

		Thread.sleep(3000);

		Commentss.sendKeys("Not Sent");

	}

	public void saveUndelivered() throws InterruptedException {

		Thread.sleep(3000);

		saveUndelivered.click();

	}

	public void undeliveredStsdp() throws InterruptedException {

		Thread.sleep(3000);

		Select selstsdrpdwn = new Select(StatusDrpdwn);
		selstsdrpdwn.selectByVisibleText("Undelivered");

	}

	public void chkoutChild() throws InterruptedException {

		searchChild.sendKeys(BaseClass.checkoutChild);

		Thread.sleep(2000);

		boolean getElement = getDriver().findElements(By.xpath("(//*[@type='checkbox'])[2]")).size() != 0;

		Assert.assertEquals(true, getElement);

	}

	@FindBy(xpath = "(//*[@title='Undelivered Notes'])[1]")
	WebElement UndeliveredNotes;

	@FindBy(xpath = "//textarea[@id='Gifttextarea_comments']")
	WebElement EnterText;

	@FindBy(xpath = "//button[@id='SaveGiftComments']")
	WebElement saveGiftComments;

	public void UndeliveredNotes() throws InterruptedException {

		UndeliveredNotes.click();
		EnterText.sendKeys("Take Care.Get well soon!!");
		Thread.sleep(1000);
		saveGiftComments.click();
		Thread.sleep(2000);
		

	}

	// Gift By Mail

	@FindBy(xpath = "//*[@id='ddlGiftStatusPoP']")
	WebElement GiftByMailDefaultStatusDrpdwn;

	public void giftByMailType() throws InterruptedException {

		Thread.sleep(2000);

		Select selGftType = new Select(GiftType);
		selGftType.selectByVisibleText("Gift by Mail");
	}

	public void giftByMailDefaultGiftStatus() throws InterruptedException {

		Thread.sleep(2000);

		String drpdwn = new Select(GiftByMailDefaultStatusDrpdwn).getFirstSelectedOption().getText();

		String exp = "Picked Up";

		Assert.assertEquals(drpdwn, exp);

	}

	// Gift By Mail Bulk Upload

	@FindBy(xpath = "//*[@class='switch-label']")
	WebElement ToggleSwitch;

	@FindBy(xpath = "//a[contains(@href,'GiftExcelTemplatepath')]")
	WebElement DownloadExcel;

	@FindBy(xpath = "//input[@id='fileUpload']")
	WebElement ChooseFile;

	@FindBy(xpath = "//button[@id='savegift']")
	WebElement SaveUploadedFile;

	public void ToggleSwitch() throws InterruptedException {

		Thread.sleep(2000);

		ToggleSwitch.click();
	}

	public void downloadTemplate() throws InterruptedException {

		DownloadExcel.click();
		Assert.assertTrue("Failed to download Expected document", isFileDownloaded(downloadPath, "GiftTemplate"));

	}

	public void UploadGiftTemplate() throws InterruptedException {

		Thread.sleep(3000);

		String pathupload = System.getProperty("user.dir");

		String fullPathupload = pathupload + "//ExcelFiles//GiftTemplate.xlsx";

		ChooseFile.sendKeys(fullPathupload);

		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", SaveUploadedFile);

		Thread.sleep(3000);

	}

	public void VerifyStatusDefaultedToPickedUp() throws InterruptedException {

		Thread.sleep(2000);

		String drpdwn = new Select(StatusDrpdwn).getFirstSelectedOption().getText();

		String exp = "Picked Up";

		Assert.assertEquals(drpdwn, exp);

	}

	// Swap Gifts

	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[1]")
	WebElement SwapGiftIcon;

	@FindBy(xpath = "(//*[@class='chkswapgift'])[2]")
	WebElement ChkSwapGift;

	@FindBy(xpath = "//textarea[@id='txtswapGift_comment']")
	WebElement SwapGiftComments;

	@FindBy(xpath = "//button[@id='SwapGiftCategoriesSave']")
	WebElement saveswapedGift;

	@FindBy(xpath = "//*[@id='GiftswapCategoriesTable']/tbody/tr[2]/td[1]")
	WebElement GiftCodeGetText;

	// *[@id="GiftTable"]/tbody/tr/td[3]

	public void swapGiftIcon() throws InterruptedException {

		Thread.sleep(2000);
		SwapGiftIcon.click();

	}

	public void swapGiftChkBx() throws InterruptedException {

		Thread.sleep(2000);
		ChkSwapGift.click();
		BaseClass.GiftCode = GiftCodeGetText.getText();
		System.out.println(BaseClass.GiftCode);

	}

	public void swapGiftComments() throws InterruptedException {

		Thread.sleep(2000);
		SwapGiftComments.sendKeys("Wow!!Thank you for swaping my gifts.");

	}

	public void saveSwapGift() throws InterruptedException {

		Thread.sleep(2000);
		saveswapedGift.click();

	}
	
	public void verifyGiftCode() throws InterruptedException {
		
		Thread.sleep(2000);

		BaseClass.tableGiftCode = getDriver().findElement(By.xpath("(//*[@id='GiftTable']/tbody/tr/td[3])[1]")).getText()
				.split("-")[1];
		
		System.out.println(BaseClass.tableGiftCode);
		
		Assert.assertEquals(BaseClass.tableGiftCode, BaseClass.GiftCode);
		
	}

	// Transfer Gift

	@FindBy(xpath = "//*[@title='Hold Student Gift']")
	WebElement HoldStudentIcon;

	@FindBy(xpath = "//*[@id='txtholdGift_comment']")
	WebElement HoldGiftComment;

	@FindBy(xpath = "//*[@id='SaveHoldGift']")
	WebElement saveHoldGift;

	@FindBy(xpath = "(//*[@title='Transfer child gift'])[1]")
	WebElement transferChildGift;

	@FindBy(xpath = "(//*[@title='-- Select Child --'])[2]")
	WebElement TransferToChildDrpdwn;

	@FindBy(xpath = "//*[@class='select2-search__field']")
	WebElement EnterstudentToTransferTheGift;

	@FindBy(xpath = "//*[@id='txtTransferGift_comment']")
	WebElement TransferGiftComment;

	@FindBy(xpath = "//*[@id='SaveTransferGift']")
	WebElement saveTransferGift;

	public void orderReceivedDrpdwn() throws InterruptedException {

		Thread.sleep(2000);

		Select selstsdrpdwn = new Select(StatusDrpdwn);
		selstsdrpdwn.selectByVisibleText("Order Received");

	}

	public void holdStudentIcon() throws InterruptedException {

		Thread.sleep(2000);

		HoldStudentIcon.click();

	}

	public void holdGiftComment() throws InterruptedException {

		Thread.sleep(2000);

		HoldGiftComment.sendKeys("Hold The Gift");

	}

	public void saveHoldGift() throws InterruptedException {

		Thread.sleep(2000);

		saveHoldGift.click();

	}

	public void giftHoldDrpdwn() throws InterruptedException {

		Thread.sleep(2000);

		Select selstsdrpdwn = new Select(StatusDrpdwn);
		selstsdrpdwn.selectByVisibleText("Gift Hold");

	}

	public void transferChildGiftIcon() throws InterruptedException {

		Thread.sleep(2000);
		transferChildGift.click();

	}

	public void enterStudentToTransferTheGift() throws InterruptedException {

		Thread.sleep(2000);
		TransferToChildDrpdwn.click();
		Thread.sleep(2000);
		EnterstudentToTransferTheGift.sendKeys("aa");
		EnterstudentToTransferTheGift.sendKeys(Keys.ENTER);

		BaseClass.TransferToChild = getDriver()
				.findElement(By.xpath("//*[@id='select2-ddlTransferChildName-container']")).getText().split("\\(")[1];

		System.out.println(BaseClass.TransferToChild);

	}

	public void TransferGiftComment() throws InterruptedException {

		Thread.sleep(2000);
		TransferGiftComment.sendKeys("Thanks for transfering the Gifts!!!");

	}

	public void saveTransferGift() throws InterruptedException {

		Thread.sleep(2000);
		saveTransferGift.click();

	}

	public void getTransferToChild() throws InterruptedException {

		searchChild.sendKeys(BaseClass.TransferToChild);

		Thread.sleep(2000);

		boolean getElement = getDriver().findElements(By.xpath("(//*[@type='checkbox'])[2]")).size() != 0;

		Assert.assertEquals(true, getElement);
	}

	// Gift History

	@FindBy(linkText = "Reports")
	WebElement RepMainMenu;

	@FindBy(xpath = "//*[@id='navbar-collapse-nav']//div//a[text()='Student']")
	WebElement StudentSubMenu;

	@FindBy(xpath = "//*[@id='Filter_CMFID']")
	WebElement CMFIDInReport;

	@FindBy(xpath = "(//*[@title='Edit Child Gift Details'])[1]")
	WebElement GiftIcon;

	@FindBy(xpath = "//*[@id='GiftList']/h4")
	WebElement GiftHistory;
	
	@FindBy(xpath = "//*[@id='EmptyRecord']")
	WebElement GiftNotPresent;

	
	public void studentReportNavigation() throws InterruptedException {
		RepMainMenu.click();
		StudentSubMenu.click();

	}

	public void CMFIDInReport() throws InterruptedException {

		CMFIDInReport.sendKeys(BaseClass.TransferToChild);
	}

	public void GiftIcon() throws InterruptedException {

		WebElementUtils.waitForVisible(GiftIcon);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].click()", GiftIcon);

	}

	public void giftHistory() throws InterruptedException {
		
		boolean getElement = getDriver().findElement(By.xpath("//*[@id='GiftList']/h4")).isDisplayed();

		if (getElement == true) {

			Assert.assertEquals(true, getElement);
		}

		else {

			String errorText = GiftNotPresent.getText();

			String exp = "No gift present for the child";

			Assert.assertEquals(errorText, exp);

		}
}
	

}
