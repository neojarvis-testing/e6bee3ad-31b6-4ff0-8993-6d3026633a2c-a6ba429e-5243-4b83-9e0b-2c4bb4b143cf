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


    /*
     * a. Method Name: openReport
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: To generate the report
     * d. Return Type: void
     * e. Parameters: none
     */
    @BeforeClass
    public void openReport() {
        reports = Reporter.generateExtentReports("HOMEDEPOT_Report");
    }
    
    /*
     * a. Method Name: open
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: To open the browser
     * d. Return Type: void
     * e. Parameters: none
     */
    @BeforeMethod
    public void open() {
        openBrowser();
    }

    /*
     * a. Method Name: categoryTestCase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Home Depot Category TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
    @Test(priority = 10, enabled = true)
    public void categoryTestCase() {
        test = reports.createTest("Category Section TestCase");
        HomeDepotCategory homeDepotCategory = new HomeDepotCategory(test);
        homeDepotCategory.homeDepotCategoryTestCase();
    }

    /*
     * a. Method Name: shopAllTestCase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Home Depot Shop All TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
    @Test(priority = 2, enabled = true)
    public void shopAllTestCase() {
        test = reports.createTest("Shop All TestCase");
        HomeDepotShopAll homeDepotShopAll = new HomeDepotShopAll(test);
        homeDepotShopAll.homeDepotShopAllTestCase();
    }

    @Test(priority = 3, enabled = true)
    public void servicesPageTestCase() {
        test = reports.createTest("Services TestCase");
        HomeDepotServicesPage homeDepotServicesPage = new HomeDepotServicesPage(test);
        homeDepotServicesPage.testServicesFlow();
    }

    @Test(priority = 4, enabled = true)
    public void workshopTestCase() {
        test = reports.createTest("Workshop TestCase");
        HomeDepotDIYWorkShopPage homeDepotDIYWorkShopPage = new HomeDepotDIYWorkShopPage(test);
        homeDepotDIYWorkShopPage.testDIYWorkshops();
    }

    @Test(priority = -3, enabled = true)
    public void CustomerServiceTestCase() {
        test = reports.createTest("Customer Services TestCase");
        HomeDepotFooterPageCustomerService hdfc = new HomeDepotFooterPageCustomerService(test);
        hdfc.CustomerService();
    }

    @Test(priority = -2, enabled = true)
    public void resourcesTestCase() {
        test = reports.createTest("Resources TestCase");
        HomeDepotFooterResources homeDepotFooterResources = new HomeDepotFooterResources(test);
        homeDepotFooterResources.Resources();
    }

    @Test(priority = 7, enabled = true)
    public void aboutUsFooterTestCase() {
        test = reports.createTest("About us Footer TestCase");
        HomeDepotAboutUsFooterPage aboutUsFooterPage = new HomeDepotAboutUsFooterPage(test);
        aboutUsFooterPage.aboutUsFooterFlow();
    }

    @Test(priority = 8, enabled = true)
    public void creditOffersTestCase() {
        test = reports.createTest("Credit Offers TestCase");
        HomeDepotCreditOffersPage homeDepotCreditOffersPage = new HomeDepotCreditOffersPage(test);
        homeDepotCreditOffersPage.creditOffersFlow();
    }

    @Test(priority = 9, enabled = true)
    public void buildingMaterialsTestcases() {
        test = reports.createTest("Building Material Testcases");
        HomeDepotBuildingMaterials homeDepotBuildingMaterials = new HomeDepotBuildingMaterials(test);
        homeDepotBuildingMaterials.buildingMaterialsTestCase();
    }

    @Test(priority = 1, enabled = true)
    public void footerLinksTestcases() {
        test = reports.createTest("Footer Links Testcases");
        HomeDepotFooterLinksPage homeDepotFooterLinksPage = new HomeDepotFooterLinksPage(test);
        homeDepotFooterLinksPage.footerLinksTestCase();
    }

    /*
     * a. Method Name: close
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: To close the browser
     * d. Return Type: void
     * e. Parameters: none
     */
    @AfterMethod
    public void close() {
        driver.quit();
    }

    /*
     * a. Method Name: closeReport
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Finalizes and flushes the report data to the report file
     * d. Return Type: void
     * e. Parameters: none
     */
    @AfterClass
    public void closeReport() {
        reports.flush();
    }
}