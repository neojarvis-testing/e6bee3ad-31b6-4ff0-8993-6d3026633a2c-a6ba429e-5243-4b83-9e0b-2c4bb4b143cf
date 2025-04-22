package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotFooterLocator;
import uistore.HomeDepotFooterResourcesLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotFooterResources {
    public static WebDriverHelper helper;
    public static ExtentTest test;

    public HomeDepotFooterResources(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    public void clickOnSpecialsOffers() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.SpecialandOffers, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.SpecialandOffers);
            LoggerHandler.info("Clicked on Specials & Offers");
            test.log(Status.INFO, "Clicked on Special & Offers");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Special & Offers");
            test.log(Status.FAIL, "Not clicked on Special & Offers");
        }
    }

    public void VerifySavingsCenter() {
        try {
            String text = helper.getUrl();
            Assert.assertTrue(text.contains("/c/Savings_Center"));
            LoggerHandler.info("URL contains /c/Savings_Center");
            test.log(Status.INFO, "URL contains /c/Savings_Center");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/Savings_Center");
            test.log(Status.FAIL, "URL doesn't contains /c/Savings_Center");
        }
    }

    public void clickOnMilitaryDiscountBenefit() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.MilitaryDiscountBenefit, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.MilitaryDiscountBenefit);
            LoggerHandler.info("Clicked on Military Discount Benefit");
            test.log(Status.INFO, "Clicked on Military Discount Benefit");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Military Discount Benefit");
            test.log(Status.FAIL, "Not clicked on Military Discount Benefit");
        }
    }

    public void VerifyMilitary() {
        try {
            String text = helper.getUrl();
            Assert.assertTrue(text.contains("/c/military"));
            LoggerHandler.info("URL contains /c/military");
            test.log(Status.INFO, "URL contains /c/military");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/military");
            test.log(Status.FAIL, "URL doesn't contains /c/military");
        }
    }

    public void clickOnDIYProjectsAndIdeas() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.DIYProject, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.DIYProject);
            LoggerHandler.info("Clicked on DIY Projects And Ideas");
            test.log(Status.INFO, "Clicked on DIY Projects And Ideas");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on DIY Projects And Ideas");
            test.log(Status.FAIL, "Not clicked on DIY Projects And Ideas");
        }
    }

    public void VerifyDIYProject() {
        try {
            String text = helper.getUrl();
            Assert.assertTrue(text.contains("/c/diy_projects_and_ideas"));
            LoggerHandler.info("URL contains /c/diy_projects_and_ideas");
            test.log(Status.INFO, "URL contains /c/diy_projects_and_ideas");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/diy_projects_and_ideas");
            test.log(Status.FAIL, "URL doesn't contains /c/diy_projects_and_ideas");
        }
    }

    public void clickOnTruckAndToolRental() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.TruckAndToolRental, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.TruckAndToolRental);
            LoggerHandler.info("Clicked on Truck and Tool Rental");
            test.log(Status.INFO, "Clicked on Truck and Tool Rental");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Truck and Tool Rental");
            test.log(Status.FAIL, "Not clicked on Truck and Tool Rental");
        }
    }

    public void VerifyToolAndTruck() {
        try {
            String text = helper.getUrl();
            Assert.assertTrue(text.contains("/c/tool-and-equipment-rental"));
            LoggerHandler.info("URL contains /c/tool_and_truck_rental");
            test.log(Status.INFO, "URL contains /c/tool_and_truck_rental");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/tool_and_truck_rental");
            test.log(Status.FAIL, "URL doesn't contains /c/tool_and_truck_rental");
        }
    }

    public void clickOnInstallationAndServices() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.InstallationandServices, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.InstallationandServices);
            LoggerHandler.info("Clicked on Installation & Services");
            test.log(Status.INFO, "Clicked on Installation & Services");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Installation & Services");
            test.log(Status.FAIL, "Not clicked on Installation & Services");
        }
    }

    public void VerifyServices() {
        try {
            String text = helper.getUrl();
            Assert.assertTrue(text.contains("/services"));
            LoggerHandler.info("URL contains /services");
            test.log(Status.INFO, "URL contains /services");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /services");
            test.log(Status.FAIL, "URL doesn't contains /services");
        }
    }

    public void clickOnMovingSuppliesAndRentals() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.MovingSuppliesAndRentals, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.MovingSuppliesAndRentals);
            LoggerHandler.info("Clicked on Moving Supplies And Rentals");
            test.log(Status.INFO, "Clicked on Moving Supplies And Rentals");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Moving Supplies And Rentals");
            test.log(Status.FAIL, "Not clicked on Moving Supplies And Rentals");
        }
    }

    public void VerifyStorageOrganization() {
        try {
            String text = helper.getUrl();
            Assert.assertTrue(text.contains("/b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r"));
            LoggerHandler.info("URL contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
            test.log(Status.INFO, "URL contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
            test.log(Status.FAIL, "URL doesn't contains /b/Storage-Organization-Moving-Supplies/N-5yc1vZc89r");
        }
    }

    public void clickOnProtectionPlans() {
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.ProtectionPlans, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.ProtectionPlans);
            LoggerHandler.info("Clicked on Protection Plans");
            test.log(Status.INFO, "Clicked on Protection Plans");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Protection Plans");
            test.log(Status.FAIL, "Not clicked on Protection Plans");
        }
    }

    public void VerifyProtectionPlans() {
        try {
            String text = helper.getUrl();
            Assert.assertTrue(text.contains("/c/The_Home_Depot_Protection_Plans"));
            LoggerHandler.info("URL contains /c/The_Home_Depot_Protection_Plans");
            test.log(Status.INFO, "URL contains /c/The_Home_Depot_Protection_Plans");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/The_Home_Depot_Protection_Plans");
            test.log(Status.FAIL, "URL doesn't contains /c/The_Home_Depot_Protection_Plans");
        }
    }

    public void clickOnRebateCenter(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.RebateCenter, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.RebateCenter);
            LoggerHandler.info("Clicked on Rebate center");
            test.log(Status.INFO, "Clicked on Rebate center");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Rebate center");
            test.log(Status.FAIL, "Not clicked on Rebate center");
        }
    }
    public void VerifyRebate() {
        try {
            String text = helper.getUrl();
            Assert.assertTrue(text.contains("/rebate-center/index.html"));
            LoggerHandler.info("URL contains /rebate-center/index.html");
            test.log(Status.INFO, "URL contains /rebate-center/index.html");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /rebate-center/index.html");
            test.log(Status.FAIL, "URL doesn't contains /rebate-center/index.html");
        }
    }
    public void clickOnGiftCards(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterResourcesLocators.GiftCards, 10);
            helper.clickOnElement(HomeDepotFooterResourcesLocators.GiftCards);
            LoggerHandler.info("Clicked on Gift Cards");
            test.log(Status.INFO, "Clicked on Gift Cards");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Gift Cards");
            test.log(Status.FAIL, "Not clicked on Gift Cards");
        }
    }
    public void Verifygiftcard() {
        try {
            String text = helper.getUrl();
            Assert.assertTrue(text.contains("/c/gift-cards"));
            Screenshot.captureScreenShot("Resources");
            Reporter.attachScreenshotToReport("Resources", test, "Attached");
            LoggerHandler.info("URL contains /c/gift-cards");
            test.log(Status.INFO, "URL contains /c/gift-cards");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/gift-cards");
            test.log(Status.FAIL, "URL doesn't contains /c/gift-cards");
        }
    }
    public void Resources(){
        clickOnSpecialsOffers();
        VerifySavingsCenter();
        clickOnMilitaryDiscountBenefit();
        VerifyMilitary();
        clickOnDIYProjectsAndIdeas();
        VerifyDIYProject();
        clickOnTruckAndToolRental();
        VerifyToolAndTruck();
        clickOnInstallationAndServices();
        VerifyServices();
        clickOnMovingSuppliesAndRentals();
        VerifyStorageOrganization();
        clickOnProtectionPlans();
        VerifyProtectionPlans();
        clickOnRebateCenter();
        VerifyRebate();
        clickOnGiftCards();
        Verifygiftcard();
    }
}
