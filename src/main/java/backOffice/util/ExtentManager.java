package backOffice.util;


import java.io.File;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	private static ExtentReports extent;
//	@SuppressWarnings("deprecation")
//	public ExtentManager(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
//		
//        
//			Object ClassObj = Class.forName(className).newInstance();
//			System.out.println("class object is " +ClassObj);
//	
//}
	
	
	public static ExtentReports getInstance() {
//		public void getTestClassName(String className1) {
//			String className1 = this.getClass().getSimpleName();
//		}
//			System.out.println("Class name in Extent manager " +className1);
    
		//System.out.println(CustomProductNew_Test.getClass().getSimpleName());
		if (extent == null) {
			Date d=new Date();
			String fileName=d.toString().replace(":", "_").replace(" ", "_")+".html";
			
		//	System.out.println("file name in Extent manager " +fileName);		
			extent = new ExtentReports(Constants.REPORT_PATH+fileName, true, DisplayOrder.NEWEST_FIRST);

			
			extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
		
			extent.addSystemInfo("Selenium Version", "3.4.0").addSystemInfo(
					"Environment", "QA");
		}
		return extent;
	}
}
