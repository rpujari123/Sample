package com.backOffice.varstreet;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import java.util.Properties;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import backOffice.util.Constants;

public class GenericKeywords {
	public WebDriver driver;
	public Properties prop;
	public Properties Workflows;
	public String Pwindow;
	public Properties Product_search;
	public Properties Purchase_Order;
	public Properties Store_setup;
	public Properties NewStore_setup;
	public Properties RstoreCustomization;
	public Properties NewstoreCustomization;
	public Properties Approval_Workflow;
	public Properties Activity_Test;
	public Properties Account_Test;
	public Properties Opportunity_Test;
	public Properties Opportunity_Dashboard;
	public Properties Opportunity_listing;
	public Properties Custom_Catlog;
	public Properties Bundle_product;
	public Properties Return_Request;
	public Properties Quote;
	public Properties sales_order;
	public Properties Customer_Contact;
	public Properties Custom_catlog6036;
	public Properties Categories;
	public Properties CustomerCart;
	public Properties MAP_MSRP;
	public Properties Handling_Test_6036;
	public Properties Freight_Test_6036;
	public Properties Discount_Test_6036;
	public Properties Discount_coupon6036;
	public Properties Suggestions;
	public Properties Business_Dashboard;
	public Properties Mail_Server;
	public Properties Calendar;
	public Properties OrderManagement;
	public Properties ViewAllTransaction;
	public Properties Configuration_Test;
	public Properties Store_Messages;
	public Properties Customer_Upload;
	public Properties Invoices6036_Test;
	public Properties More_Favorites;
	public Properties Guest_Cart;
	public Properties Distributor;
	public Properties CC_Authorizer;
	public Properties Password_Policy;
	public Properties Price_List;
	public Properties Login_EmailDomain;
	public Properties Users6036;
	public Properties Business_rule;
	public Properties Tax_setting;
	public Properties Product_Content;
	public Properties Company_profile;
	public Properties Sales_Reports;
	public Properties Purchasing_report;
	public Properties Categories_report;
	public Properties Manufacturer_report;
	public Properties Distributor_report;
	public Properties Ecommerce_report;
	public Properties Backlog_report;
	public Properties Opportunity_Report;
	public Properties StoreCatlog;
	public Properties NotificationTemplate;
	public Properties Contract_Catlog;
	public Properties Email_Template;
	public Properties Notification_Rules;
	public Properties QuickQuote;
	public Properties XeroxData;
	public Properties UDF_Test;
    public Properties FormTemplate;
    public Properties ZivaroQuoteFlow;
    public Properties DeliveryFee;
    public Properties SpecialPricingProfile;
//------------------------------------------------------------------------------------------------------	
    
    ExtentTest test;
	public GenericKeywords(ExtentTest test){
		this.test=test;
		prop = new Properties();
		Product_search = new Properties();
		Purchase_Order = new Properties();
		Store_setup = new Properties();
		NewStore_setup = new Properties();
		RstoreCustomization = new Properties();
		NewstoreCustomization = new Properties();
		Approval_Workflow = new Properties();
		Activity_Test = new Properties();
		Account_Test = new Properties();
		Opportunity_Test = new Properties();
		Opportunity_Dashboard  = new Properties();
		Opportunity_listing  = new Properties();
		Custom_Catlog  = new Properties();
		Bundle_product = new Properties();
		Return_Request = new Properties();
		Quote = new Properties();
		sales_order  = new Properties();
		Customer_Contact = new Properties();
		Custom_catlog6036 = new Properties();
		Categories = new Properties();
		CustomerCart = new Properties();
		MAP_MSRP = new Properties();
		Handling_Test_6036 = new Properties();
		Freight_Test_6036 = new Properties();
		Discount_Test_6036  = new Properties();
		Discount_coupon6036 = new Properties();
		Suggestions = new Properties();
		Business_Dashboard = new Properties();
		Mail_Server = new Properties();
		Calendar = new Properties();
		OrderManagement = new Properties();
		ViewAllTransaction = new Properties();
		Configuration_Test = new Properties();
		Store_Messages  = new Properties();
		Customer_Upload = new Properties();
		Invoices6036_Test = new Properties();
		More_Favorites = new Properties();
		Guest_Cart = new Properties();
		Distributor  = new Properties();
		CC_Authorizer = new Properties();
		Password_Policy  = new Properties();
		Price_List = new Properties();
		Login_EmailDomain = new Properties();
		Users6036 = new Properties();
		Business_rule = new Properties();
		Tax_setting = new Properties();
		Product_Content = new Properties();
		Company_profile = new Properties();
		Sales_Reports = new Properties();
		Purchasing_report = new Properties();
		Categories_report = new Properties();
		Manufacturer_report = new Properties();
		Distributor_report = new Properties();
		Ecommerce_report = new Properties();
		Backlog_report = new Properties();
		Opportunity_Report = new Properties();
		StoreCatlog = new Properties();
		NotificationTemplate = new Properties();
		Contract_Catlog = new Properties();
		Email_Template = new Properties();
		Notification_Rules =  new Properties();
		QuickQuote  =  new Properties();
		XeroxData =  new Properties();
		UDF_Test  = new Properties();
		FormTemplate = new Properties();
		ZivaroQuoteFlow = new Properties();
		DeliveryFee = new Properties();
		SpecialPricingProfile = new Properties();
//----------------------- ------------------------------------------------------------------------------------------------				
		try {
		
			
			FileInputStream Product_search_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Home//Product_search//Product_search.properties");   
			FileInputStream Purchase_Order_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Purchasing//Purchase_Order.properties");   
			FileInputStream Store_setup_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Ecommerce//Setup//Store_setup.properties");   
			FileInputStream NewStore_setup_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Ecommerce//Setup//NewStore_setup.properties");  
			FileInputStream NewStore_customization = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Ecommerce//Newstorecustomization//NewstoreCustomization.properties");  
			FileInputStream RStore_Customization  = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Ecommerce//Rstorecustomization//RstoreCustomization.properties");  
			FileInputStream Approval_Workflow_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Workflows//Approval_Workflow.properties");  
			FileInputStream Activity_6036_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM_Activity//Activity_Test.properties");   
			FileInputStream Account_6036_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM_Accounts//Account_Test.properties");   
			FileInputStream Opportunity_6036_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM_Opportunity//Opportunity_Test.properties");   
			FileInputStream Opportunity_Dashboard_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM_Opportunity//Opportunity_Dashboard.properties");   
			FileInputStream Opportunity_listing_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM_Opportunity//Opportunity_listing.properties");  
			FileInputStream Custom_Catlog_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Home//Custom_Catlog//Custom_Catlog.properties");
			FileInputStream Bundle_product_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Home//Custom_Catlog//Bundle_product.properties");
			FileInputStream Return_Request_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Sales//Return//Return_Request.properties");
			FileInputStream Quote_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Sales//Quotes//Quote.properties");
			FileInputStream sales_order_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Sales//SO//sales_order.properties");
			FileInputStream Customer_Contact_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Home//Customer_Contact//Customer_Contact.properties");
			FileInputStream Custom_catlog6036_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//All_Uploads//Custom_catlog6036.properties");
			FileInputStream Categories_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Home//Custom_Catlog//Categories.properties");
			FileInputStream CustomerCart_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Ecommerce//CustomerCart//CustomerCart.properties");  
			FileInputStream MAP_MSRP_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//priceprofle//MAP_MSRP.properties");  
			FileInputStream Handling6036_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Rules//Handling_Test_6036.properties");  
			FileInputStream Freight6036_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Rules//Freight_Test_6036.properties");  
			FileInputStream DiscountTest6036  = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Rules//Discount_Test_6036.properties");  
			FileInputStream DiscountCoupon6036 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Rules//Discount_coupon6036.properties"); 
			FileInputStream Suggestions_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Rules//Suggestions.properties"); 
			FileInputStream Business_Dashboard_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Home//Product_search//Business_Dashboard.properties"); 
			FileInputStream Mail_Server_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Accountprofile//Mail_Server.properties"); 
			FileInputStream Calendar_Test  = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Home//Product_search//Calendar.properties"); 
			FileInputStream OrderManagement_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Home//Product_search//OrderManagement.properties"); 
			FileInputStream ViewAllTransaction_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Home//Product_search//ViewAllTransaction.properties"); 
			FileInputStream Configuration_Prod_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Home//Configurations//Configuration_Test.properties");
			FileInputStream Store_Messages_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Ecommerce//Setup//Store_Messages.properties"); 
			FileInputStream Customer_Upload_Test   = new FileInputStream(System.getProperty("user.dir")+"//src//test//java///All_Uploads//Customer_Upload.properties");
			FileInputStream Invoices = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Sales//Quotes//Invoices6036_Test.properties");
			FileInputStream More_Favorites_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Sales//Quotes//More_Favorites.properties");
			FileInputStream Guest_Cart_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Ecommerce//CustomerCart//Guest_Cart.properties");  
			FileInputStream Distributor_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Accountprofile//Distributor.properties"); 
			FileInputStream CC_Authorizer_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Accountprofile//CC_Authorizer.properties"); 
			FileInputStream Password_PolicyTest = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Account//Settings//Password_Policy.properties"); 
			FileInputStream Price_List_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//priceprofle//Price_List.properties");  
			//FileInputStream Price_List_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//priceprofle//Price_List.properties");  
			FileInputStream Login_EmailDomain_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Email_Domain//Login_EmailDomain.properties");  
			FileInputStream Users6036_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Accountprofile//Users6036.properties"); 
			FileInputStream Business_rule_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Account//Settings//Business_rule.properties"); 
			FileInputStream Tax_setting_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Account//Settings//Tax_setting.properties"); 
			FileInputStream Product_Content_Test= new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Marketing//Product_Content.properties"); 
			FileInputStream Company_profile_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Accountprofile//Company_profile.properties"); 
			FileInputStream SalesReports_Test  = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Reports//Sales_Reports.properties"); 
			FileInputStream PurchasingReport_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Reports//Purchasing_report.properties"); 
			FileInputStream CategoriesReport_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Reports//Categories_report.properties"); 
			FileInputStream ManufacturerReport_Test  = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Reports//Manufacturer_report.properties"); 
			FileInputStream DistributorReport_Test= new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Reports//Distributor_report.properties");  
			FileInputStream EcommerceReport_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Reports//Ecommerce_report.properties");  
			FileInputStream BacklogReport_Test  = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Zivaro_Reports//Backlog_report.properties");  
			FileInputStream OpportunityReport_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Zivaro_Reports//Opportunity_Report.properties");  
			FileInputStream StoreCatlog_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Ecommerce//StoreCatlog//StoreCatlog.properties");   
			FileInputStream NotificationTemplate_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM//Setup//NotificationTemplate.properties");    
			FileInputStream ContractCatlogTest = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Home//Contract//Contract_Catlog.properties");    
			FileInputStream Email_Template_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Account//Settings//Email_Template.properties"); 
			FileInputStream Notification_Rules_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Workflows//Notification_Rules.properties");  
			FileInputStream QuickQuote_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Sales//Quotes//QuickQuote.properties");  
			
			FileInputStream XeroxTest_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//XeroxData//XeroxData.properties");  
			FileInputStream FormTemplate_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM//Setup//FormTemplate.properties");
			FileInputStream UDF_readTest = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM//Setup//UDF_Test.properties");
			FileInputStream ZivaroQuoteFlow_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Sales//Quotes//ZivaroQuoteFlow.properties");
			FileInputStream DeliveryFee_test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Rules//DeliveryFee.properties");  
			FileInputStream SpecialPricingProfile_Test = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//priceprofle//SpecialPricingProfile.properties");           
			
			
			//---------	-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------								
			XeroxData.load(XeroxTest_Test);
			Product_search.load(Product_search_Test);					
			Purchase_Order.load(Purchase_Order_Test);
			Store_setup.load(Store_setup_test);
			NewStore_setup.load(NewStore_setup_test);
			NewstoreCustomization.load(NewStore_customization);
			RstoreCustomization.load(RStore_Customization);
			Approval_Workflow.load(Approval_Workflow_test);
			Activity_Test.load(Activity_6036_Test);	
			Account_Test.load(Account_6036_Test);	
			Opportunity_Test.load(Opportunity_6036_Test);
			Opportunity_Dashboard.load(Opportunity_Dashboard_Test);
			Opportunity_listing.load(Opportunity_listing_Test);
			Custom_Catlog.load(Custom_Catlog_test);
			Bundle_product.load(Bundle_product_test);
			Return_Request.load(Return_Request_Test);
			Quote.load(Quote_Test);
			sales_order.load(sales_order_Test);
			Customer_Contact.load(Customer_Contact_Test);
			Custom_catlog6036.load(Custom_catlog6036_Test);
			Categories.load(Categories_test);
			CustomerCart.load(CustomerCart_Test);
			MAP_MSRP.load(MAP_MSRP_Test);
			Handling_Test_6036.load(Handling6036_test);
			Freight_Test_6036.load(Freight6036_test);
			Discount_Test_6036.load(DiscountTest6036);
			Discount_coupon6036.load(DiscountCoupon6036);
			Suggestions.load(Suggestions_test);
			Business_Dashboard.load(Business_Dashboard_Test);
			Mail_Server.load(Mail_Server_Test);
			Calendar.load(Calendar_Test);
			OrderManagement.load(OrderManagement_Test);
			ViewAllTransaction.load(ViewAllTransaction_Test);
			Configuration_Test.load(Configuration_Prod_Test);
			Store_Messages.load(Store_Messages_test);
			Customer_Upload.load(Customer_Upload_Test);
			Invoices6036_Test.load(Invoices);
			More_Favorites.load(More_Favorites_Test);
			Guest_Cart.load(Guest_Cart_Test);
			Distributor.load(Distributor_Test);
			CC_Authorizer.load(CC_Authorizer_Test);
			Password_Policy.load(Password_PolicyTest);
			Price_List.load(Price_List_Test);
			Login_EmailDomain.load(Login_EmailDomain_Test);
			Users6036.load(Users6036_Test);
			Business_rule.load(Business_rule_Test);
			Tax_setting.load(Tax_setting_Test);
			Product_Content.load(Product_Content_Test);
			Company_profile.load(Company_profile_Test);
			Sales_Reports.load(SalesReports_Test);
			Purchasing_report.load(PurchasingReport_Test);
			Categories_report.load(CategoriesReport_Test);
			Manufacturer_report.load(ManufacturerReport_Test);
			Distributor_report.load(DistributorReport_Test);
			Ecommerce_report.load(EcommerceReport_Test);
			Backlog_report.load(BacklogReport_Test);
			Opportunity_Report.load(OpportunityReport_Test);
			StoreCatlog.load(StoreCatlog_test);
			NotificationTemplate.load(NotificationTemplate_Test);
			Contract_Catlog.load(ContractCatlogTest);
			Email_Template.load(Email_Template_Test);
			Notification_Rules.load(Notification_Rules_test);
			QuickQuote.load(QuickQuote_Test);
			FormTemplate.load(FormTemplate_Test);
			UDF_Test.load(UDF_readTest);
			ZivaroQuoteFlow.load(ZivaroQuoteFlow_Test);
			DeliveryFee.load(DeliveryFee_test);
			SpecialPricingProfile.load(SpecialPricingProfile_Test);
//--------------------------------------------------------------------------------------------------------------------------------------						
			
			
//================================== Put properties===================================================================================================================
			prop.putAll(XeroxData);
			prop.putAll(Product_search);		
			prop.putAll(Purchase_Order);
			prop.putAll(Store_setup);
			prop.putAll(NewStore_setup);
			prop.putAll(NewstoreCustomization);
		    prop.putAll(RstoreCustomization);
		    prop.putAll(Approval_Workflow);
		    prop.putAll(Activity_Test);
			prop.putAll(Account_Test);
			prop.putAll(Opportunity_Test);
			prop.putAll(Opportunity_listing);
			prop.putAll(Opportunity_Dashboard);
			prop.putAll(Custom_Catlog);
			prop.putAll(Bundle_product);
			prop.putAll(Return_Request);
			prop.putAll(Quote);
			prop.putAll(sales_order);
			prop.putAll(Customer_Contact);
			prop.putAll(Custom_catlog6036);
			prop.putAll(Categories);
			prop.putAll(CustomerCart);
			prop.putAll(MAP_MSRP);
			prop.putAll(Handling_Test_6036);
			prop.putAll(Freight_Test_6036);
			prop.putAll(Discount_Test_6036);
			prop.putAll(Discount_coupon6036);
			prop.putAll(Suggestions);
			prop.putAll(Business_Dashboard);
			prop.putAll(Mail_Server);
			prop.putAll(Calendar);
			prop.putAll(OrderManagement);
		    prop.putAll(ViewAllTransaction);
		    prop.putAll(Configuration_Test);
		    prop.putAll(Store_Messages);
		    prop.putAll(Customer_Upload);
		    prop.putAll(Invoices6036_Test);
		    prop.putAll(More_Favorites);
		    prop.putAll(Guest_Cart);
		    prop.putAll(Distributor);
		    prop.putAll(CC_Authorizer);
		    prop.putAll(Password_Policy);
		    prop.putAll(Price_List);
		    prop.putAll(Login_EmailDomain);
		    prop.putAll(Users6036);
		    prop.putAll(Business_rule);
			prop.putAll(Tax_setting);
			prop.putAll(Product_Content);
			prop.putAll(Company_profile);
			prop.putAll(Sales_Reports);
			prop.putAll(Purchasing_report);
			prop.putAll(Categories_report);
			prop.putAll(Manufacturer_report);
			prop.putAll(Distributor_report);
			prop.putAll(Ecommerce_report);
			prop.putAll(Backlog_report);
			prop.putAll(Opportunity_Report);
			prop.putAll(StoreCatlog);
			prop.putAll(NotificationTemplate);
			prop.putAll(Contract_Catlog);
			prop.putAll(Email_Template);
			prop.putAll(Notification_Rules);
			prop.putAll(QuickQuote);
			prop.putAll(UDF_Test);
			prop.putAll(FormTemplate);
			prop.putAll(ZivaroQuoteFlow);
			prop.putAll(DeliveryFee);
			prop.putAll(SpecialPricingProfile);
//================================================================================================================================			
			
			
			
	} 
	
	        catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	    public String openBrowser(String browserType){
		test.log(LogStatus.INFO, "Opening Browser");
		if(prop.getProperty("grid").equals("Y")){
			DesiredCapabilities cap=null;
			if(browserType.equals("Mozilla")){
				cap = DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setJavascriptEnabled(true);
				cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
				
			}else if(browserType.equals("Chrome")){
				 cap = DesiredCapabilities.chrome();
				 cap.setBrowserName("chrome");
				 cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			}
			
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{		
				if(browserType.equals("ie")){
					driver = new InternetExplorerDriver();
				}else if(browserType.equals("Chrome")){
					//String user_agent = "Mozilla/5.0+(Linux;+Android+7.1.2;+Redmi+4+Build/N2G47H;+wv)+AppleWebKit/537.36+(KHTML,+like+Gecko)+Version/4.0+Chrome/73.0.3683.90+Mobile+Safari/537.36";
					//ChromeOptions options = new ChromeOptions();
					//options.addArguments("disable-infobars");
					//options.addArguments("headless");
					//options.addArguments(+user_agent);
					//WebDriver driver = new ChromeDriver();
					System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
					driver =  new ChromeDriver();
				}else if(browserType.equals("Mozilla")){
					System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
					driver =  new FirefoxDriver();
				}
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return Constants.PASS;
	}
	
	public String navigate(String urlKey){
		test.log(LogStatus.INFO, "Navigating to "+ prop.getProperty(urlKey));
		driver.get(prop.getProperty(urlKey));
		return Constants.PASS;
	}
	
	public String navigateback()
	{
		driver.navigate().back();
		return Constants.PASS;
	}
	
	public String Description_default_content(){
		driver.switchTo().frame(0);
		driver.findElement(By.id("tinymce")).sendKeys("Description for this product");
		driver.switchTo().defaultContent();
		return Constants.PASS;
	}
	
	public String Description(String locatorKey, String data){
		if(locatorKey.contains("2"))
		driver.switchTo().frame(2);
		if(locatorKey.contains("1"))
		driver.switchTo().frame(1);
		else
		driver.switchTo().frame(0);
		WebElement e = getElement(locatorKey);
		e.sendKeys(data);
		driver.switchTo().defaultContent();
		return Constants.PASS;
	}
	
	
	public String click(String locatorKey){
		//test.log(LogStatus.INFO,"Clicking on "+ prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		e.click();
		return Constants.PASS;
		}
	
	public String input(String locatorKey, String data){
		//test.log(LogStatus.INFO,"Typing in "+ prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		e.sendKeys(data);
		return Constants.PASS;
	}

	public String alert() {
		String alertTitle = driver.switchTo().alert().getText();
		test.log(LogStatus.WARNING,alertTitle );
		driver.switchTo().alert().accept();
		return Constants.PASS;
	} 
	
	
	
	public String switchToalert() {
		String alertTitle = driver.switchTo().alert().getText();
		test.log(LogStatus.WARNING,alertTitle );
		driver.switchTo().alert();
		return Constants.PASS;
	} 
	
	public String pressEnter(){
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    robot.delay(200);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Constants.PASS;
	}
		
	public String Actions(String locatorKey){
		test.log(LogStatus.INFO,"Clicking on "+ prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
	    Actions action =    new Actions(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        action.click(e).perform();
		return Constants.PASS;
	}

	public String Description(){
		driver.switchTo().frame(0);
		driver.findElement(By.id("tinymce")).sendKeys("Description");
		driver.switchTo().defaultContent();
		return Constants.PASS;
	}
	
    public String defaultContent(){
	driver.switchTo().defaultContent();
	return Constants.PASS;
    }
    
    public String frame(){
    	driver.switchTo().frame(0);
        return Constants.PASS;
    }
    
    
    public String clear(String locatorKey){
		//test.log(LogStatus.INFO,"Clicking on "+ prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		e.clear();
		return Constants.PASS;
	}
	
	public String dropdownint(String locatorKey, String value){
		test.log(LogStatus.INFO,"Selecting  "+prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		Select dropdown = new Select(e);
		dropdown.selectByIndex(Integer.parseInt(value));
		return Constants.PASS;	
		}
	
    public String dropdownText(String locatorKey, String value){
		
		test.log(LogStatus.INFO,"Selecting  "+prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		Select dropdown = new Select(e);
		dropdown.selectByVisibleText(value);
		return Constants.PASS;	
		}
    
    public String dropdownValue(String locatorKey, String value){
		test.log(LogStatus.INFO,"Selecting  "+prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		Select dropdown = new Select(e);
		dropdown.selectByValue(value);
		return Constants.PASS;	
		}
	
	public String closeBrowser() {
		test.log(LogStatus.INFO,"Closing browser");
		driver.quit();
		return Constants.PASS;
		
	}
	public String closeWindow(){
		driver.close();
		return Constants.PASS;
	}
	
	/***************************Validation keywords*********************************/
	
	public String verifyText(String locatorKey, String d){
		WebElement e = getElement(locatorKey);
		String actualText = e.getText();
 		System.out.println(actualText);
 		System.out.println("Verify string"+d);
		if(actualText.equals(d)){
			test.log(LogStatus.INFO,"Text is "+ prop.getProperty(locatorKey));
			test.log(LogStatus.PASS, locatorKey+"verified successfully");
			test.log(LogStatus.INFO,actualText);
			return Constants.PASS;
			}
		
		else
			test.log(LogStatus.INFO,actualText);
		test.log(LogStatus.INFO, prop.getProperty(locatorKey));
		test.log(LogStatus.WARNING, locatorKey+" Need to verify Manually ");
		return Constants.WARNING+" - Could not verify "+ locatorKey;
	}
	
	public String ArrayListExample(String locatorKey) {
		WebElement e = getElement(locatorKey);
		//String actualText = e.getText();
	        // Size of the
	        // ArrayList
	        int n = 5;
	 
	        // Declaring the ArrayList with
	        // initial size n
	        ArrayList<Integer> actualText = new ArrayList<Integer>();
	 
	        // Appending new elements at
	        // the end of the list
	        for (int i = 1; i <= n; i++)
	        	actualText.add(i);
	 
	        // Printing elements
	        System.out.println(actualText);
	 
	        
	 
	        // Displaying the ArrayList
	        // after deletion
	       // System.out.println(actualText);
	 
	        // Printing elements one by one
	        for (int i = 0; i < actualText.size(); i++)
	            System.out.print(actualText.get(i) + "  ");
			//return actualText;
			return locatorKey;
			
	    }
	
	
	public String verifyServerText(String locatorKey, String d){
		WebElement e = getElement(locatorKey);
		String actualText = e.getText();
 		System.out.println("Actual text to verify is"+actualText);
 		System.out.println("String to verify is"+d);
		if(actualText.equals(d)){
			test.log(LogStatus.INFO,"Text is "+ prop.getProperty(locatorKey));
			//test.log(LogStatus.INFO,"Test is"+actualText);
			test.log(LogStatus.INFO, locatorKey+"VSBO");
			return Constants.PASS;
			}
		
		else
			test.log(LogStatus.INFO,"Text is "+ prop.getProperty(locatorKey));
			//test.log(LogStatus.INFO,"Test is"+actualText);
		 	test.log(LogStatus.INFO, locatorKey+" VSBO ");
		return Constants.PASS;
	}
	public String verifydropdown(String locatorKey){
		WebElement drpdn = getElement(locatorKey);
    	System.out.println("Clicking on the drop down");
    	Select se = new Select(drpdn);
    	List<WebElement> opt = se.getOptions();
    	System.out.println("The total number of options in the dropdown is : " +opt.size());
    	
    	//Iterate through the list of options
    	System.out.println("The dropdown values are--- ");
    	for(WebElement options : opt){
          	System.out.println(options.getText());
          	test.log(LogStatus.INFO,options.getText());
    	}
		return Constants.PASS;
	}

	
	
	public String verifySpclyInputText(String locatorKey, String value){
		WebElement e = getElement(locatorKey);
		String actualText = e.getAttribute("value");
		System.out.println(actualText);
		if(actualText.equals(value)){
			test.log(LogStatus.INFO, locatorKey+"verified successfully");
			return Constants.PASS;
		}	
		else
			test.log(LogStatus.WARNING, locatorKey+"Need to verify Manually");
		  return Constants.WARNING+" - Could not verify"+ locatorKey;
	}
	public String verifyElementPresent(String locatorKey){
		boolean result= isElementPresent(locatorKey);
		if(result)
			return Constants.PASS;
		else
			return Constants.FAIL+" - Could not find Element "+ locatorKey;
	}
	
	public String verifyElementNotPresent(String locatorKey){
		boolean result= isElementPresent(locatorKey);
		if(!result)
			return Constants.PASS;
		else
			return Constants.FAIL+" - Could find Element "+ locatorKey;
	}
	
	public String pressTAB(){	
		Robot robot;		
		try {robot = new Robot();	
		robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    robot.delay(200);
	    } 
		catch (AWTException e) {
			e.printStackTrace();
		}		
		return Constants.PASS;	}
	

	public String maximize(){
		driver.manage().window().maximize();
		return Constants.PASS;
      }
	public String ScrollUp(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,700)", "");
		jse.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		return Constants.PASS;	
		}

	public String HorizontalScroll(){
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(1400,0)", "");
		test.log(LogStatus.INFO, "Successfully scroll");
		return Constants.PASS;	
		}
	
	public String ScrollDown(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)", "");
		return Constants.PASS;	
		}

	public String scrollTo(String locatorKey){
		int y = getElement(locatorKey).getLocation().y;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,"+(y)+")");
		return Constants.PASS; 
	}
	
	
	public String wait(String timeout) {
		
		try {
		Thread.sleep(Integer.parseInt(timeout));
		} catch (Exception  e) {
		
		e.printStackTrace();
		}
		return Constants.PASS;
	}
	
	
	
	/************************Utility Functions********************************/
	public WebElement getElement(String locatorKey){
		WebElement e = null;
	
		try{
			if(locatorKey.endsWith("_id"))
				e = driver.findElement(By.id(prop.getProperty(locatorKey)));
			else if(locatorKey.endsWith("_xpath"))
				e = driver.findElement(By.xpath(prop.getProperty(locatorKey)));
			else if(locatorKey.endsWith("_name"))
				e = driver.findElement(By.name(prop.getProperty(locatorKey)));
			else if(locatorKey.endsWith("_linkText"))
				e = driver.findElement(By.linkText(prop.getProperty(locatorKey)));
			else if(locatorKey.endsWith("_cssSelector"))
				e = driver.findElement(By.cssSelector(prop.getProperty(locatorKey)));			
			
		}
			catch (UnhandledAlertException f) { 
				   
					Alert alert = driver.switchTo().alert();       
					String alertText = alert.getText(); 
					
					System.out.println("Alert data: " + alertText);        
					alert.accept(); 
					}
		catch (Exception ex) {
			reportFailure("Failure in Element Extraction - "+ locatorKey);			
			Assert.fail("Failure in Element Extraction - "+ locatorKey);
			    
			}
		return e;
	
	}
	

	public String Upload(String locatorKey, String value){
		WebElement e = getElement(locatorKey);
		e.sendKeys(value);
		driver.manage().window().maximize();
		return Constants.PASS;
		
	}
	
	
	
	public String doubleClick(String locatorkey){
		WebElement e = getElement(locatorkey);
		Actions action = new Actions(driver);
		action.doubleClick(e).build().perform();
		return Constants.PASS;
	}
	
	
	public String Refresh(){
		driver.navigate().refresh();
		return Constants.PASS;
	}
	
	
	public String mousehover(String locatorkey){
		WebElement e = getElement(locatorkey);
		Actions builder=new Actions(driver);
		builder.moveToElement(e).build().perform();
		return Constants.PASS;
	}
	
	public  String checkCheckBox(String locatorKey){
		test.log(LogStatus.INFO,"Checking checkbox ");

			WebElement e = getElement(locatorKey);
			String checked=e.getAttribute("checked");
			if(checked==null)
				e.click();
		   return Constants.PASS;
		
	}
	
	public String unCheckCheckBox(String locatorKey,String data){
		
		test.log(LogStatus.INFO,"Unchecking checkbox ");
		WebElement e = getElement(locatorKey);
			String checked=e.getAttribute("checked");
			if(checked!=null)
				e.click();
			return Constants.PASS;
		
	}
	
	public String windowHandle(){
		Pwindow=driver.getWindowHandle();
		for(String child: driver.getWindowHandles()){
		driver.switchTo().window(child);
		}
	  return Constants.PASS;
		
	}
	public String MouseClick(String locatorKey){
		 WebElement e = getElement(locatorKey);
		 Actions build = new Actions(driver); //
		 build.moveToElement(e).build().perform();
		 e.click();
		 return Constants.PASS;
	}
	
	public String Captcha(){
	List<WebElement> frames = driver.findElements(By.xpath("//*[@id='login']/form/dl[2]/div/div/div/iframe"));
	String winHanaleBefore = driver.getWindowHandle();
	driver.switchTo().frame(0);
	driver.findElement(By.id("recaptcha-anchor")).click();
	driver.switchTo().window(winHanaleBefore);
	return Constants.PASS;
	
	}
	
	public String windowHandleClose(){
		driver.switchTo().window(Pwindow);
		return Constants.PASS;
		
	}
	public String DefaulContent(){
		driver.switchTo().defaultContent();
		return Constants.PASS;
		
	}
	
	public String DragnDrop2(String locatorKey){
		Actions act = new Actions(driver);
		WebElement src = getElement(locatorKey);
		Point p = src.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println("Coordinates of an element is : " + x + " and " + y);
		//ssdriver.switchTo().frame(0);
		//System.out.println("in drag frame");
		act.dragAndDropBy(src,p.getX()+37,p.getY()+370).perform();
		System.out.println("dragged successfully");
		return Constants.PASS;
	}
	
	public boolean isElementPresent(String locatorKey){
		List<WebElement> e = null;
		
		if(locatorKey.endsWith("_id"))
			e = driver.findElements(By.id(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_xpath"))
			e = driver.findElements(By.xpath(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_name"))
			e = driver.findElements(By.name(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_linkText"))
			e = driver.findElements(By.linkText(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_cssSelector"))
			e = driver.findElements(By.cssSelector(prop.getProperty(locatorKey)));
		
	
		
		if(e.size()==0)
			return false;
		else 
			return true;
	}
	/******************************Reporting functions******************************/
		
	public void reportFailure(String failureMessage){
		takeScreenShot();
		test.log(LogStatus.FAIL,failureMessage);
	}
	
	public String takeScreenShot(){
		Date d = new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ","_")+".png";
		String path=Constants.SCREENSHOT_PATH+screenshotFile;
	
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(path));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		test.log(LogStatus.INFO, test.addScreenCapture(path));
		return Constants.PASS;
	}
	
	
}
