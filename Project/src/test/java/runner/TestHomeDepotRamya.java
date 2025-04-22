package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomeDepotDIYWorkShopPage;
import pages.HomeDepotServicesPage;
import utils.Base;
import utils.Reporter;

public class TestHomeDepotRamya extends Base{
    public static ExtentTest test;
    public static ExtentReports report;

    @BeforeClass
    public void generate(){
        report = Reporter.generateExtentReports("reports");
    }

    @BeforeMethod
    public void open(){
        openBrowser(); 
    }

    @Test
    public void test3(){
        test = report.createTest("Test Case 3");
        HomeDepotServicesPage homeDepotServicesPage = new HomeDepotServicesPage(test);
        homeDepotServicesPage.testCase3();
    }

    @Test
    public void test4(){
        test = report.createTest("Test Case 4");
        HomeDepotDIYWorkShopPage homeDepotDIYWorkShopPage = new HomeDepotDIYWorkShopPage(test);
        homeDepotDIYWorkShopPage.testCase4();
    }

    @AfterMethod
    public void close(){
        driver.quit();
    }

    @AfterClass
    public void teardown(){
        report.flush();
    }
}
