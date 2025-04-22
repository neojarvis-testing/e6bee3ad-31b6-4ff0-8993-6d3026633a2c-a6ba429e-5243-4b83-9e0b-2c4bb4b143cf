package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomeDepotAboutUsFooterPage;
import pages.HomeDepotBuildingMaterials;
import pages.HomeDepotCategory;
import pages.HomeDepotCreditOffersPage;
import pages.HomeDepotDIYWorkShopPage;
import pages.HomeDepotFooterLinksPage;
import pages.HomeDepotFooterPageCustomerService;
import pages.HomeDepotFooterResources;
import pages.HomeDepotServicesPage;
import pages.HomeDepotShopAll;
import utils.Base;
import utils.Reporter;

public class TestHomeDepot extends Base {
    ExtentReports reports;
    ExtentTest test;

    @BeforeClass
    public void openReport() {
        reports = Reporter.generateExtentReports("HOMEDEPOT_Report");
    }

    @BeforeMethod
    public void open() {
        openBrowser();
    }

    @Test(priority = 10, enabled = true)
    public void categoryTestcases() {
        test = reports.createTest("Category Section Testcases");
        HomeDepotCategory page = new HomeDepotCategory(test);
        page.homeDepotCategoryTestcases();
    }

    @Test(priority = 2, enabled = true)
    public void shopAllTestcases() {
        test = reports.createTest("Shop All Testcases");
        HomeDepotShopAll page = new HomeDepotShopAll(test);
        page.homeDepotShopAllTestcases();
    }

    @Test(priority = 3, enabled = true)
    public void servicesPageTestcases() {
        test = reports.createTest("Services Testcases");
        HomeDepotServicesPage homeDepotServicesPage = new HomeDepotServicesPage(test);
        homeDepotServicesPage.testCase3();
    }

    @Test(priority = 4, enabled = true)
    public void workshopTestcases() {
        test = reports.createTest("Workshop Testcases");
        HomeDepotDIYWorkShopPage homeDepotDIYWorkShopPage = new HomeDepotDIYWorkShopPage(test);
        homeDepotDIYWorkShopPage.testCase4();
    }

    @Test(priority = 5, enabled = true)
    public void CustomerServiceTestcases() {
        test = reports.createTest("Customer services Testcases");
        HomeDepotFooterPageCustomerService hdfc = new HomeDepotFooterPageCustomerService(test);
        hdfc.CustomerService();
    }

    @Test(priority = 6, enabled = true)
    public void resourcesTestcases() {
        test = reports.createTest("Resources Testcases");
        HomeDepotFooterResources homeDepotFooterResources = new HomeDepotFooterResources(test);
        homeDepotFooterResources.Resources();
    }

    @Test(priority = 7, enabled = true)
    public void aboutUsFooterTestcases() {
        test = reports.createTest("About us Footer Testcases");
        HomeDepotAboutUsFooterPage aboutUsFooterPage = new HomeDepotAboutUsFooterPage(test);
        aboutUsFooterPage.aboutUsFooterFlow();
    }

    @Test(priority = 8, enabled = true)
    public void creditOffersTestcases() {
        test = reports.createTest("Credit Offers Testcases");
        HomeDepotCreditOffersPage homeDepotCreditOffersPage = new HomeDepotCreditOffersPage(test);
        homeDepotCreditOffersPage.creditOffersFlow();
    }

    @Test(priority = 9, enabled = true)
    public void buildingMaterialsTestcases() {
        test = reports.createTest("Building Material Testcases");
        HomeDepotBuildingMaterials hd = new HomeDepotBuildingMaterials(test);
        hd.buildingMaterials();
    }

    @Test(priority = 1, enabled = true)
    public void footerLinksTestcases() {
        test = reports.createTest("Footer Links Testcases");
        HomeDepotFooterLinksPage hd = new HomeDepotFooterLinksPage(test);
        hd.footerLinks();
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
