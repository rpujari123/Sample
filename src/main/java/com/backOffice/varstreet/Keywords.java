package com.backOffice.varstreet;

import java.util.Hashtable;

import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import backOffice.util.Constants;
import backOffice.util.Xls_Reader;

public class Keywords {

	ExtentTest test;
	AppKeywords app;
	
	public Keywords(ExtentTest test) {
		this.test=test;
	}

	public void executeKeywords(
			String testUnderExecution,
			Xls_Reader xls,
			Hashtable<String,String> testData) {
		
		app = new AppKeywords(test);
		int rows = xls.getRowCount(Constants.KEYWORDS_SHEET);
		
		for(int rNum=2;rNum<=rows;rNum++){
			String tcid  = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.TCID_COL, rNum);
			if(tcid.equals(testUnderExecution)){
				String keyword  = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.KEYWORD_COL, rNum);
				String object  = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.OBJECT_COL, rNum);
				String key  = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.DATA_COL, rNum);
				String value=xls.getCellData(Constants.KEYWORDS_SHEET, Constants.VALUE_COL, rNum);
				String data = testData.get(key);
				
				test.log(LogStatus.INFO,tcid+" -- "+ keyword +" -- "+object+" --- "+data+" --- "+value);
				
				String result="";
				if(keyword.equals("openBrowser"))
					result=app.openBrowser(value);
				else if(keyword.equals("navigate"))
					result=app.navigate(object);
				else if(keyword.equals("windowHandle"))
					result=app.windowHandle();
				else if(keyword.equals("windowHandleClose"))
					result=app.windowHandleClose();
				else if(keyword.equals("closeWindow"))
					result=app.closeWindow();
				else if(keyword.equals("dropdownint"))
					result=app.dropdownint(object, value);
				else if(keyword.equals("Refresh"))
					result=app.Refresh();
				else if(keyword.equals("ArrayListExample"))
					result=app.ArrayListExample(object);
				else if(keyword.equals("verifyText"))
					result=app.verifyText(object, value);
				else if(keyword.equals("verifySpclyInputText"))
					result=app.verifySpclyInputText(object, value);
				else if(keyword.equals("dropdownValue"))
					result=app.dropdownValue(object, value);
				else if(keyword.equals("dropdownText"))
					result=app.dropdownText(object, value);
				else if(keyword.equals("DefaulContent"))
					result=app.DefaulContent();
				else if(keyword.equals("Actions"))
					result=app.Actions(object);
				else if(keyword.equals("click"))
					result=app.click(object);
				else if(keyword.equals("clear"))
					result=app.clear(object);
				else if(keyword.equals("Upload"))
					result=app.Upload(object,value);
				else if(keyword.equals("input"))
					result=app.input(object,value);
				else if(keyword.equals("alert"))
					result=app.alert();
				else if(keyword.equals("switchToalert"))
					result=app.switchToalert();
				else if(keyword.equals("pressEnter"))
					result=app.pressEnter();
				else if(keyword.equals("doubleClick"))
					result=app.doubleClick(object);
				else if(keyword.equals("checkCheckBox"))
					result=app.checkCheckBox(object);
				else if(keyword.equals("unCheckCheckBox"))
					result=app.unCheckCheckBox(object,data);
				else if(keyword.equals("mousehover"))
					result=app.mousehover(object);
				else if(keyword.equals("closeBrowser"))
					result=app.closeBrowser();
				else if(keyword.equals("verifyElementPresent"))
					result=app.verifyElementPresent(object);
				else if(keyword.equals("verifydropdown"))
					result=app.verifydropdown(object);
				else if(keyword.equals("wait"))
					result=app.wait(key);
				else if(keyword.equals("scrollTo"))
					result=app.scrollTo(object);
				else if(keyword.equals("ScrollDown"))
					result=app.ScrollDown();
				else if(keyword.equals("ScrollUp"))
					result=app.ScrollUp();
				else if(keyword.equals("Description"))
					result=app.Description();
				else if(keyword.equals("defaultContent"))
					result=app.defaultContent();
				else if(keyword.equals("pressTAB"))
					result=app.pressTAB();
				else if(keyword.equals("maximize"))
					result=app.maximize();
				else if(keyword.equals("HorizontalScroll"))
					result=app.HorizontalScroll();
				else if(keyword.equals("takeScreenShot"))
					result=app.takeScreenShot();
				else if(keyword.equals("MouseClick"))
					result=app.MouseClick(object);
				else if(keyword.equals("frame"))
					result=app.frame();
				else if(keyword.equals("Captcha"))
					result=app.Captcha();
				else if(keyword.equals("navigateback"))
					result=app.navigateback();
				else if(keyword.equals("DragnDrop2"))
					result=app.DragnDrop2(object);
				
				if(result.equals(Constants.FAIL)){
					app.reportFailure(result);
					Assert.fail(result);
				}
			}
		}
		
		}
	
	public AppKeywords getGenericKeyWords(){
		return app;
	}
	
	
}




