// package runner;

// import org.testng.annotations.AfterClass;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.Test;

// import com.aventstack.extentreports.ExtentReports;
// import com.aventstack.extentreports.ExtentTest;

// import pages.HomeDepotBuildingMaterials;
// import pages.HomeDepotFooterLinksPage;
// import utils.Base;
// import utils.Reporter;

// public class TestRunner extends Base{
//     ExtentReports report;
//     ExtentTest test;
//     @BeforeClass
//     public void generateReport(){
//         report=Reporter.generateExtentReports("jahnavi");
//     }
//     @BeforeMethod
//     public void open(){
//         openBrowser();
//     }
//     @Test
//     public void buildingMaterialsFunctionality(){
//         test=report.createTest("building materials");
//         HomeDepotBuildingMaterials hd=new HomeDepotBuildingMaterials(test);
//         hd.buildingMaterials();
//     }
    
//     @Test
//     public void footerLinksFunctinality(){
//         test=report.createTest("footer links");
//         HomeDepotFooterLinksPage hd=new HomeDepotFooterLinksPage(test);
//         hd.footerLinks();
//     }

//     @AfterMethod
//     public void close(){
//         driver.quit();
//     }
//     @AfterClass
//     public void flush(){
//         report.flush();
//     }
// }
