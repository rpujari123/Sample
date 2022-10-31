package Admin.Rules;


import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.backOffice.varstreet.Keywords;
import com.relevantcodes.extentreports.LogStatus;
import backOffice.util.Constants;
import backOffice.util.DataUtil;
import backOffice.util.Xls_Reader;
import baseBackoffice.BaseTest;

public class Suggestions extends BaseTest{
	
	@BeforeTest
	public void init(){
		
		xls = new Xls_Reader(Constants.Suggestions_XLS);
		testName = "Suggestions_test";
	}
	
	
	@Test(dataProvider="getData")
	public void loginTest(Hashtable<String,String> data) throws InterruptedException{
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, data.toString());
		
		if(DataUtil.isSkip(xls, testName) || data.get("Runmode").equals("N")){
			test.log(LogStatus.SKIP, "Skipping the test as runmode is N");
			throw new SkipException("Skipping the test as runmode is N");
		}
		
		test.log(LogStatus.INFO, "Starting "+testName);		
		app = new Keywords(test);
		test.log(LogStatus.INFO, "Executing keywords");
		app.executeKeywords(testName, xls, data);		
		test.log(LogStatus.PASS, "PASS");
		app.getGenericKeyWords().takeScreenShot();
	}
}