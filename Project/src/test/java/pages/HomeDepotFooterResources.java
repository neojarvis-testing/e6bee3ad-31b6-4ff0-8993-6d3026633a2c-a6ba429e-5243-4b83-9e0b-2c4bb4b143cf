package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotFooterResourcesLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotFooterResources {
    WebDriverHelper helper;
    ExtentTest test;

    public HomeDepotFooterResources(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
    /* a. Method Name: clickOnSpecials&Offers
     * b. Author Name: Kushal
     * c. Description: Clicks on Specials&Offers in the footer section
     * d. Return Type: void
     * e. Parameters:None
     */
    public void clickOnSpecialsOffers() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.specialAndOffers, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.specialAndOffers);
            LoggerHandler.info("Clicked on Specials & Offers");
            test.log(Status.INFO, "Clicked on Special & Offers");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Special & Offers");
            test.log(Status.FAIL, "Not clicked on Special & Offers");
        }
    }
    /* a. Method Name: verifySavingsCenter
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Specials&Offers.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void verifySavingsCenter() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 0, 0);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/Savings_Center");
            test.log(Status.INFO, "URL contains /c/Savings_Center");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/Savings_Center");
            test.log(Status.FAIL, "URL doesn't contains /c/Savings_Center");
        }
    }
    /* a. Method Name: clickOnMilitaryDiscountBenefit
     * b. Author Name: Kushal
     * c. Description: Clicks on Military Discount Benefit in the footer section
     * d. Return Type: void
     * e. Parameters:None
     */
    public void clickOnMilitaryDiscountBenefit() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.militaryDiscountBenefit, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.militaryDiscountBenefit);
            LoggerHandler.info("Clicked on Military Discount Benefit");
            test.log(Status.INFO, "Clicked on Military Discount Benefit");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Military Discount Benefit");
            test.log(Status.FAIL, "Not clicked on Military Discount Benefit");
        }
    }
    /* a. Method Name: verifySavingsCenter
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Military Discount Benefit.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void verifyMilitary() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 1, 0);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/military");
            test.log(Status.INFO, "URL contains /c/military");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/military");
            test.log(Status.FAIL, "URL doesn't contains /c/military");
        }
    }
    /* a. Method Name: clickOnDIYProjectsAndIdeas
     * b. Author Name: Kushal
     * c. Description: Clicks on DIY Projects And Ideas in the footer section
     * d. Return Type: void
     * e. Parameters:None
     */
    public void clickOnDIYProjectsAndIdeas() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.dIYProject, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.dIYProject);
            LoggerHandler.info("Clicked on DIY Projects And Ideas");
            test.log(Status.INFO, "Clicked on DIY Projects And Ideas");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on DIY Projects And Ideas");
            test.log(Status.FAIL, "Not clicked on DIY Projects And Ideas");
        }
    }
    /* a. Method Name: verifyDIYProject
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the DIY Projects And Ideas.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void verifyDIYProject() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 2, 0);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/diy_projects_and_ideas");
            test.log(Status.INFO, "URL contains /c/diy_projects_and_ideas");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/diy_projects_and_ideas");
            test.log(Status.FAIL, "URL doesn't contains /c/diy_projects_and_ideas");
        }
    }
    /* a. Method Name: clickOnTruckAndToolRental
     * b. Author Name: Kushal
     * c. Description: Clicks on Truck And Tool Rental in the footer section
     * d. Return Type: void
     * e. Parameters:None
     */
    public void clickOnTruckAndToolRental() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.truckAndToolRental, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.truckAndToolRental);
            LoggerHandler.info("Clicked on Truck and Tool Rental");
            test.log(Status.INFO, "Clicked on Truck and Tool Rental");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Truck and Tool Rental");
            test.log(Status.FAIL, "Not clicked on Truck and Tool Rental");
        }
    }
    /* a. Method Name: verifyDIYProject
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Truck And Tool Rental.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void verifyToolAndTruck() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 3, 0);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/tool_and_truck_rental");
            test.log(Status.INFO, "URL contains /c/tool_and_truck_rental");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/tool_and_truck_rental");
            test.log(Status.FAIL, "URL doesn't contains /c/tool_and_truck_rental");
        }
    }
    /* a. Method Name: clickOnInstallationAndServices
     * b. Author Name: Kushal
     * c. Description: Clicks on Installation And Services in the footer section
     * d. Return Type: void
     * e. Parameters:None
     */
    public void clickOnInstallationAndServices() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.installationandServices, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.installationandServices);
            LoggerHandler.info("Clicked on Installation & Services");
            test.log(Status.INFO, "Clicked on Installation & Services");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Installation & Services");
            test.log(Status.FAIL, "Not clicked on Installation & Services");
        }
    }
    /* a. Method Name: verifyServices
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Installation And Services.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void verifyServices() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 4, 0);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /services");
            test.log(Status.INFO, "URL contains /services");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /services");
            test.log(Status.FAIL, "URL doesn't contains /services");
        }
    }
    /* a. Method Name: clickOnMovingSuppliesAndRentals
     * b. Author Name: Kushal
     * c. Description: Clicks on Moving Supplies And Rentals in the footer section.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void clickOnMovingSuppliesAndRentals() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.movingSuppliesAndRentals, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.movingSuppliesAndRentals);
            LoggerHandler.info("Clicked on Moving Supplies And Rentals");
            test.log(Status.INFO, "Clicked on Moving Supplies And Rentals");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Moving Supplies And Rentals");
            test.log(Status.FAIL, "Not clicked on Moving Supplies And Rentals");
        }
    }
    /* a. Method Name: verifyServices
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Moving Supplies And Rentals.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void verifyStorageOrganization() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1",5 , 0);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
            test.log(Status.INFO, "URL contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
            test.log(Status.FAIL, "URL doesn't contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
        }
    }
    /* a. Method Name: clickOnProtectionPlans
     * b. Author Name: Kushal
     * c. Description: Clicks on Protection Plans in the footer section.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void clickOnProtectionPlans() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.protectionPlans, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.protectionPlans);
            LoggerHandler.info("Clicked on Protection Plans");
            test.log(Status.INFO, "Clicked on Protection Plans");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Protection Plans");
            test.log(Status.FAIL, "Not clicked on Protection Plans");
        }
    }
    /* a. Method Name: verifyProtectionPlans
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Protection Plans.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void verifyProtectionPlans() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 6, 0);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/The_Home_Depot_Protection_Plans");
            test.log(Status.INFO, "URL contains /c/The_Home_Depot_Protection_Plans");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/The_Home_Depot_Protection_Plans");
            test.log(Status.FAIL, "URL doesn't contains /c/The_Home_Depot_Protection_Plans");
        }
    }
    /* a. Method Name: clickOnRebateCenter
     * b. Author Name: Kushal
     * c. Description: Clicks on Rebate Center in the footer section.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void clickOnRebateCenter(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.rebateCenter, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.rebateCenter);
            LoggerHandler.info("Clicked on Rebate center");
            test.log(Status.INFO, "Clicked on Rebate center");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Rebate center");
            test.log(Status.FAIL, "Not clicked on Rebate center");
        }
    }
    /* a. Method Name: verifyRebate
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on Rebate Center.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void verifyRebate() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 7, 0);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /rebate-center/index.html");
            test.log(Status.INFO, "URL contains /rebate-center/index.html");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /rebate-center/index.html");
            test.log(Status.FAIL, "URL doesn't contains /rebate-center/index.html");
        }
    }
    /* a. Method Name: clickOnGiftCards
     * b. Author Name: Kushal
     * c. Description: Clicks on Gift Cards in the footer section.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void clickOnGiftCards(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.giftCards, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.giftCards);
            LoggerHandler.info("Clicked on Gift Cards");
            test.log(Status.INFO, "Clicked on Gift Cards");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Gift Cards");
            test.log(Status.FAIL, "Not clicked on Gift Cards");
        }
    }
    /* a. Method Name: verifyGiftCard
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on Gift Cards.
     * d. Return Type: void
     * e. Parameters:None
     */
    public void verifyGiftCard() {
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 8, 0);
            Assert.assertTrue(text.contains(expected));
            Screenshot.captureScreenShot("Resources");
            Reporter.attachScreenshotToReport("Resources", test, "Attached");
            LoggerHandler.info("URL contains /c/gift-cards");
            test.log(Status.INFO, "URL contains /c/gift-cards");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/gift-cards");
            test.log(Status.FAIL, "URL doesn't contains /c/gift-cards");
        }
    }
    public void resourcesTestCase(){
        clickOnSpecialsOffers();
        verifySavingsCenter();
        clickOnMilitaryDiscountBenefit();
        verifyMilitary();
        clickOnDIYProjectsAndIdeas();
        verifyDIYProject();
        clickOnTruckAndToolRental();
        verifyToolAndTruck();
        clickOnInstallationAndServices();
        verifyServices();
        clickOnMovingSuppliesAndRentals();
        verifyStorageOrganization();
        clickOnProtectionPlans();
        verifyProtectionPlans();
        clickOnRebateCenter();
        verifyRebate();
        clickOnGiftCards();
        verifyGiftCard();
    }
}
