package com.automation.pages;

import java.io.File;
import static com.automation.utils.DriverUtils.getDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

import com.automation.utils.Excelutilt;

public class ExamResults {

	
	public ExamResults() {
		
		PageFactory.initElements(getDriver(), this);
	
	}
		
	@FindBy(linkText="Exam")
	WebElement exammenu;
	
	@FindBy(linkText="Exam Results")
	WebElement examresultsentry;	
			
	@FindBy(id="ddlCenters")
	WebElement selectcenter;
	@FindBy(id="ddlSchools")
	WebElement selectschool;
	@FindBy(id="ddlClasses")
	WebElement selectclass;
	@FindBy(id="ddlSections")
	WebElement selectsection;
	@FindBy(id="ddlYears")
	WebElement selectyear;
	@FindBy(id="ddlTerms")
	WebElement selectterm;
	@FindBy(id="ddlExams")
	WebElement selectexam;
	
	@FindBy(id="btnSearchClassRoster")
	WebElement searchroster;

	@FindBy(id="flash")
	WebElement message; 
	
	@FindBy(id="btnSaveExamResult")
	WebElement save;
	
	//String filepath="C:\\Users\\preethi.b\\Desktop\\MOHI\\output";
	String filepath=".\\output";
		
	
	public void navi(){
		exammenu.click();
		examresultsentry.click();
	}
	
	public void select_center(String center) throws InterruptedException{
		selectcenter.click();
		Select select_center = new Select(selectcenter);
		select_center.selectByVisibleText(center);
		Thread.sleep(500);
		}
	
	public void select_school(String school) throws InterruptedException{
		selectschool.click();
		Select select_school = new Select(selectschool);
		select_school.selectByVisibleText(school);
		Thread.sleep(500);
		}
	
	public void select_class(String classname) throws InterruptedException{
		selectclass.click();
		Select select_class = new Select(selectclass);
		select_class.selectByVisibleText(classname);
		Thread.sleep(500);
		}
	
	public void select_section(String section) throws InterruptedException{
		selectsection.click();
		Select select_section = new Select(selectsection);
		select_section.selectByVisibleText(section);
		Thread.sleep(500);
		}
	
	public void select_year(String year) throws InterruptedException{
		selectyear.click();
		Select select_year = new Select(selectyear);
		select_year.selectByVisibleText(year);
		Thread.sleep(500);
		}
	
	public void select_term(String term) throws InterruptedException{
		selectterm.click();
		Select select_term = new Select(selectterm);
		select_term.selectByVisibleText(term);
		Thread.sleep(500);
		}
	
	public void select_exam(String exam) throws InterruptedException{
		selectexam.click();
		Select select_exam = new Select(selectexam);
		select_exam.selectByVisibleText(exam);
		Thread.sleep(500);
		}
	
	public void search() throws InterruptedException{
		searchroster.click();
		Thread.sleep(2000);
	}
		
	public void maths() throws Exception {	
	
		Excelutilt.Excelp(".\\Result entry.xlsx");
			String num=Excelutilt.getData(0, 1, 8);	
			WebElement subj1 = getDriver().findElement(By.xpath("//*[@id='SubjectsList_"+num+"__OutOfMark']"));
	
			subj1.click();
			subj1.clear();
			subj1.sendKeys(Excelutilt.getData(0, 1,0));
			for(int i=1,j=2;i<=9 && j<=10;i++,j++){
				
			String student2=Excelutilt.getData(0, i, 8);	
			WebElement stud = getDriver().findElement(By.xpath("//*[@id='StudentsList_"+student2+"__StudentScores_0__Score']"));
			
			stud.click();
			stud.clear();
			stud.sendKeys(Excelutilt.getData(0, j,0));
			 
			}
		}
	
	public void english() throws Exception {	
		
		//Excelutilt.Excelp("C:\\Users\\preethi.b\\Desktop\\MOHI\\Result entry.xlsx");
		Excelutilt.Excelp(".\\Result entry.xlsx");
			String num=Excelutilt.getData(0, 2, 8);
			WebElement subj2 = getDriver().findElement(By.xpath("//*[@id='SubjectsList_"+num+"__OutOfMark']"));
			subj2.click();
			subj2.clear();
			subj2.sendKeys(Excelutilt.getData(0, 1, 1));
			for(int i=1,j=2;i<=9 && j<=10;i++,j++){
				String student=Excelutilt.getData(0, i, 8);	
				WebElement stud = getDriver().findElement(By.xpath("//*[@id='StudentsList_"+student+"__StudentScores_1__Score']"));
				stud.click();
				stud.clear();
				stud.sendKeys(Excelutilt.getData(0, j,1));
				}
				
	}
	
public void literacy() throws Exception {	
		
		//Excelutilt.Excelp("C:\\Users\\preethi.b\\Desktop\\MOHI\\Result entry.xlsx");
		Excelutilt.Excelp(".\\Result entry.xlsx");
			String num=Excelutilt.getData(0, 3, 8);
			WebElement subj3 = getDriver().findElement(By.xpath("//*[@id='SubjectsList_"+num+"__OutOfMark']"));
			subj3.click();
			subj3.clear();
			subj3.sendKeys(Excelutilt.getData(0, 1, 2));
			for(int i=1,j=2;i<=9 && j<=10;i++,j++){
				String student=Excelutilt.getData(0, i, 8);	
				WebElement stud = getDriver().findElement(By.xpath("//*[@id='StudentsList_"+student+"__StudentScores_2__Score']"));
				stud.click();
				stud.clear();
				stud.sendKeys(Excelutilt.getData(0, j,2));
				}
				
	}

public void Kiswahili() throws Exception {	
	
	//Excelutilt.Excelp("C:\\Users\\preethi.b\\Desktop\\MOHI\\Result entry.xlsx");
	Excelutilt.Excelp(".\\Result entry.xlsx");
		//String num=Excelutilt.getData(0, 4, 8);
		WebElement subj4 = getDriver().findElement(By.xpath("//*[@id='SubjectsList_4__OutOfMark']"));
		subj4.click();
		subj4.clear();
		subj4.sendKeys(Excelutilt.getData(0, 1, 3));
		for(int i=1,j=2;i<=9 && j<=10;i++,j++){
			String student=Excelutilt.getData(0, i, 8);	
			WebElement stud = getDriver().findElement(By.xpath("//*[@id='StudentsList_"+student+"__StudentScores_4__Score']"));
			stud.click();
			stud.clear();
			stud.sendKeys(Excelutilt.getData(0, j,3));
			}
			
}

public void kusoma() throws Exception {	
	
	//Excelutilt.Excelp("C:\\Users\\preethi.b\\Desktop\\MOHI\\Result entry.xlsx");
	Excelutilt.Excelp(".\\Result entry.xlsx");
		//String num=Excelutilt.getData(0, 5, 8);
		WebElement subj5 = getDriver().findElement(By.xpath("//*[@id='SubjectsList_5__OutOfMark']"));
		subj5.click();
		subj5.clear();
		subj5.sendKeys(Excelutilt.getData(0, 1, 4));
		for(int i=1,j=2;i<=9 && j<=10;i++,j++){
			String student=Excelutilt.getData(0, i, 8);	
			WebElement stud = getDriver().findElement(By.xpath("//*[@id='StudentsList_"+student+"__StudentScores_5__Score']"));
			stud.click();
			stud.clear();
			stud.sendKeys(Excelutilt.getData(0, j,4));
			}
			
}

public void ES() throws Exception {	
	
	//Excelutilt.Excelp("C:\\Users\\preethi.b\\Desktop\\MOHI\\Result entry.xlsx");
	Excelutilt.Excelp(".\\Result entry.xlsx");
		//String num=Excelutilt.getData(0, 6, 8);
		WebElement subj6 = getDriver().findElement(By.xpath("//*[@id='SubjectsList_7__OutOfMark']"));
		subj6.click();
		subj6.clear();
		subj6.sendKeys(Excelutilt.getData(0, 1, 5));
		for(int i=1,j=2;i<=9 && j<=10;i++,j++){
			String student=Excelutilt.getData(0, i, 8);	
			WebElement stud = getDriver().findElement(By.xpath("//*[@id='StudentsList_"+student+"__StudentScores_7__Score']"));
			stud.click();
			stud.clear();
			stud.sendKeys(Excelutilt.getData(0, j,5));
			}
			
}

public void HNA() throws Exception {	
	
	//Excelutilt.Excelp("C:\\Users\\preethi.b\\Desktop\\MOHI\\Result entry.xlsx");
	Excelutilt.Excelp(".\\Result entry.xlsx");
		//String num=Excelutilt.getData(0, 7, 8);
		WebElement subj7 = getDriver().findElement(By.xpath("//*[@id='SubjectsList_8__OutOfMark']"));
		subj7.click();
		subj7.clear();
		subj7.sendKeys(Excelutilt.getData(0, 1, 6));
		for(int i=1,j=2;i<=9 && j<=10;i++,j++){
			String student=Excelutilt.getData(0, i, 8);	
			WebElement stud = getDriver().findElement(By.xpath("//*[@id='StudentsList_"+student+"__StudentScores_8__Score']"));
			stud.click();
			stud.clear();
			stud.sendKeys(Excelutilt.getData(0, j,6));
			}
			
}

public void RA() throws Exception {	
	
	//Excelutilt.Excelp("C:\\Users\\preethi.b\\Desktop\\MOHI\\Result entry.xlsx");
	Excelutilt.Excelp(".\\Result entry.xlsx");
	//	String num=Excelutilt.getData(0, 8, 8);
		WebElement subj8 = getDriver().findElement(By.xpath("//*[@id='SubjectsList_9__OutOfMark']"));
		subj8.click();
		subj8.clear();
		subj8.sendKeys(Excelutilt.getData(0, 1, 7));
		for(int i=1,j=2;i<=9 && j<=10;i++,j++){
			String student=Excelutilt.getData(0, i, 8);	
			WebElement stud = getDriver().findElement(By.xpath("//*[@id='StudentsList_"+student+"__StudentScores_9__Score']"));
			stud.click();
			stud.clear();
			stud.sendKeys(Excelutilt.getData(0, j,7));
			}
			
}

/*public void totals(){
	int integerValue;
    int sumValue = 0;
	for(int i=1;i<=9;i++)
    {
		
        //Here enter your Xpath value for the table.
		String student=Excelutilt.getData(0, i, 8);	
        WebElement todaysValue= getDriver().findElement(By.xpath("//*[@id='StudentsList_"+student+"__StudentScores_0__Score']"));
        String Totalsubj1=todaysValue.getText();
        integerValue=Integer.parseInt(Totalsubj1);
        sumValue=sumValue+integerValue;         
    }*/
	
	//System.out.println("Total Sum : "+sumValue); 
	
//}
	public void savedetails() throws InterruptedException {
		
		JavascriptExecutor scrolldown1 = (JavascriptExecutor) getDriver();
		scrolldown1.executeScript("arguments[0].scrollIntoView()", save);
		save.click();
		Thread.sleep(2000);
	}

	public void Checkmessage() throws Exception {
		String message1 = message.getText();
		 String exammsg ="The exam results were saved successfully";
		 
			       
		//Assert.assertEquals("The exam results were saved successfully", message1);
		if(message1==exammsg){
			 JavascriptExecutor js = (JavascriptExecutor)getDriver();
			  js.executeScript("scroll(0, 1000)","");     // if the element is on bottom.
            this.takeSnapShot(getDriver(),filepath+"ExamResults.png") ;
		}
		else{
			 JavascriptExecutor js = (JavascriptExecutor)getDriver();
			  js.executeScript("scroll(1000, 0)","");     // if the element is on top.
			this.takeSnapShot(getDriver(),filepath+"ErrorExamResults.png") ;
		}
      }
    
	
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{   
	       TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	       File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	       File DestFile=new File(fileWithPath);
	       FileUtils.copyFile(SrcFile, DestFile);
	    }

}
