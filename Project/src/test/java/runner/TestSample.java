// package runner;

// import org.testng.annotations.AfterClass;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.Test;

// import com.aventstack.extentreports.ExtentReports;
// import com.aventstack.extentreports.ExtentTest;

// import pages.HomeDepotFooterPageCustomerService;
// import pages.HomeDepotFooterResources;
// import utils.Base;
// import utils.Reporter;

// public class TestSample extends Base{
//     public static ExtentReports report;
//     public static ExtentTest test;



//     @BeforeClass
//     public void report(){
//         report = Reporter.generateExtentReports("Customer Services Report");
//     }


//     @BeforeMethod
//     public void open(){
//         openBrowser();
//     }



//     @Test(enabled = false)
//     public void CustomerService(){
//         test = report.createTest("Customer services");
//         HomeDepotFooterPageCustomerService hdfc = new HomeDepotFooterPageCustomerService(test);
//         hdfc.CustomerService();
//     }

//     @Test(enabled = true)
//     public void Resources(){
//         test = report.createTest("Resources");
//         HomeDepotFooterResources homeDepotFooterResources = new HomeDepotFooterResources(test);
//         homeDepotFooterResources.Resources();
//     }

//     @AfterMethod
//     public void close(){
//         driver.quit();
//     }

//     @AfterClass
//     public void generate(){
//         report.flush();
//     }
// }
