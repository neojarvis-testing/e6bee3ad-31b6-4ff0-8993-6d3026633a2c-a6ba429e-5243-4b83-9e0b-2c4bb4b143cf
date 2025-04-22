package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomeDepotCategory;
import pages.HomeDepotShopAll;
import utils.Base;
import utils.Reporter;

public class TestHomeDepot extends Base {
    ExtentReports reports;
    ExtentTest test;

    @BeforeClass
    public void openReport() {
        reports = Reporter.generateExtentReports("HomeDepot_Application");
    }

    @BeforeMethod
    public void open() {
        openBrowser();
    }

    @Test
    public void categoryTestcases() {
        test = reports.createTest("Category Section Testcases");
        HomeDepotCategory page = new HomeDepotCategory(test);
        page.homeDepotCategoryTestcases();
    }

    @Test
    public void shopAllTestcases() {
        test = reports.createTest("Shop All Testcases");
        HomeDepotShopAll page = new HomeDepotShopAll(test);
        page.homeDepotShopAllTestcases();
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }

    @AfterClass
    public void closeReport() {
        reports.flush();
    }
}
