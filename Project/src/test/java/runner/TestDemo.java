package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomeDepotAboutUsFooterPage;
import pages.HomeDepotCreditOffersPage;
import utils.Base;
import utils.Reporter;

public class TestDemo extends Base{
    ExtentReports report;
    ExtentTest test;
    @BeforeClass
    public void reportGenerate(){
        report = Reporter.generateExtentReports("HomeDepot_Report");
    }

    @BeforeMethod
    public void open(){
        openBrowser();
    }
    @Test(enabled = false)
    public void test1(){
        test = report.createTest("Test1");
        HomeDepotAboutUsFooterPage aboutUsFooterPage = new HomeDepotAboutUsFooterPage(test);
        aboutUsFooterPage.aboutUsFooterFlow();
    }
    @Test(enabled = true)
        public void test2(){
            test = report.createTest("Test2");
            HomeDepotCreditOffersPage homeDepotCreditOffersPage = new HomeDepotCreditOffersPage(test);
            homeDepotCreditOffersPage.creditOffersFlow();
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
    @AfterClass
    public void reportFlush(){
        report.flush();
    }
}
