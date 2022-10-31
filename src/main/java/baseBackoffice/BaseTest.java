package baseBackoffice;

import org.testng.annotations.AfterMethod;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import com.backOffice.varstreet.Keywords;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import backOffice.util.DataUtil;
import backOffice.util.ExtentManager;
import backOffice.util.Xls_Reader;


public class BaseTest {
	public String className;
	public ExtentReports rep = ExtentManager.getInstance();
	public ExtentTest test;
	public Keywords app;
	public Xls_Reader xls ;
	public String testName;
	
	
	@AfterMethod
	public void quit(){
		
		if(rep!=null){
			rep.endTest(test);
			rep.flush();
		}
		// quit 
		if(app!=null)
			app.getGenericKeyWords().closeBrowser();
	}
	
	@DataProvider
	public Object[][] getData(){
		return DataUtil.getData(xls, testName);
	}
	
	
	
}
