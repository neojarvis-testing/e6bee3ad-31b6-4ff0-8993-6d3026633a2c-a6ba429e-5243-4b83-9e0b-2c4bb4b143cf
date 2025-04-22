package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotShopAllLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotShopAll {
    WebDriverHelper helper;
    ExtentTest test;

    public HomeDepotShopAll(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    public void clickOnShopAll() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopAll, 30);
            helper.clickOnElement(HomeDepotShopAllLocators.shopAll);
            test.log(Status.PASS, "Clicked on Shop All");
            LoggerHandler.info("Clicked on Shop All");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Shop All");
            LoggerHandler.error("Failed to click on Shop All");
        }
    }
    
    public void clickOnSavings() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.savings, 30);
            helper.clickOnElement(HomeDepotShopAllLocators.savings);
            test.log(Status.PASS, "Clicked on Savings");
            LoggerHandler.info("Clicked on Savings");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Savings");
            LoggerHandler.error("Failed to click on Savings");
        }
    }

    public void clickOnShopAllSavings() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopAllSavings, 30);
            helper.clickOnElement(HomeDepotShopAllLocators.shopAllSavings);
            test.log(Status.PASS, "Clicked on Shop All Savings");
            LoggerHandler.info("Clicked on Shop All Savings");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Shop All Savings");
            LoggerHandler.error("Failed to click on Shop All Savings");
        }
    }

    public void verifySavingsCenter() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.savingCenter, 30);
            String label = helper.getText(HomeDepotShopAllLocators.savingCenter);
            Assert.assertEquals(label, "SAVINGS CENTER");
            test.log(Status.PASS, "Verified SAVINGS CENTER label");
            LoggerHandler.info("Verified SAVINGS CENTER label");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify SAVINGS CENTER label");
            LoggerHandler.error("Failed to verify SAVINGS CENTER label");
        }
    }

    public void navigateToPreviousPage() {
        try {
            helper.navigateBack();     
            test.log(Status.PASS, "Navigated to previous page");
            LoggerHandler.info("Navigated to previous page");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to navigate to previous page");
            LoggerHandler.error("Failed to navigate to previous page");
        }
    }

    public void verifyShopByDepartmentLabel() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopByDepartment, 30);
            String label = helper.getText(HomeDepotShopAllLocators.shopByDepartment);
            Assert.assertEquals(label, "Shop By Department");
            test.log(Status.PASS, "Verified Shop By Department label");
            LoggerHandler.info("Verified Shop By Department label");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify Shop By Department label");
            LoggerHandler.error("Failed to verify Shop By Department label");
        }
    }
    
    public void clickOnShopByDepartment() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopByDepartment, 30);
            helper.clickOnElement(HomeDepotShopAllLocators.shopByDepartment);
            test.log(Status.PASS, "Clicked on Shop By Department");
            LoggerHandler.info("Clicked on Shop By Department");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Shop By Department");
            LoggerHandler.error("Failed to click on Shop By Department");
        }
    }
    
    public void verifyAppliances() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.appliances, 30);
            String label = helper.getText(HomeDepotShopAllLocators.appliances);
            Assert.assertEquals(label, "Appliances");
            test.log(Status.PASS, "Verified Appliances label");
            LoggerHandler.info("Verified Appliances label");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify Appliances label");
            LoggerHandler.error("Failed to verify Appliances label");
        }
    }
    
    public void clickOnAppliances() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.appliances, 30);
            helper.clickOnElement(HomeDepotShopAllLocators.appliances);
            test.log(Status.PASS, "Clicked on Appliances");
            LoggerHandler.info("Clicked on Appliances");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Appliances");
            LoggerHandler.error("Failed to click on Appliances");
        }
    }
    
    public void verifyShopAllAppliances() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopAllAppliances, 30);
            String label = helper.getText(HomeDepotShopAllLocators.shopAllAppliances);
            Assert.assertEquals(label, "Shop All Appliances");
            test.log(Status.PASS, "Verified Shop All Appliances label");
            LoggerHandler.info("Verified Shop All Appliances label");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify Shop All Appliances label");
            LoggerHandler.error("Failed to verify Shop All Appliances label");
        }
    }

    public void clickOnShopAllAppliances() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.shopAllAppliances, 30);
            helper.clickOnElement(HomeDepotShopAllLocators.shopAllAppliances);
            test.log(Status.PASS, "Clicked on Shop All Appliances");
            LoggerHandler.info("Clicked on Shop All Appliances");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Shop All Appliances");
            LoggerHandler.error("Failed to click on Shop All Appliances");
        }
    }

    public void verifyAppliancesLabel() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.appliancesLabel, 30);
            String label = helper.getText(HomeDepotShopAllLocators.appliancesLabel);
            Assert.assertEquals(label, "APPLIANCES");
            test.log(Status.PASS, "Verified Appliances label");
            LoggerHandler.info("Verified Appliances label");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Failed to verify Appliances label");
            LoggerHandler.error("Failed to verify Appliances label");
        }
    }


    public void clickOnKitchenAppliancesPackages() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.kitchenAppliancesPackages, 30);
            helper.clickOnElement(HomeDepotShopAllLocators.kitchenAppliancesPackages);
            test.log(Status.PASS, "Clicked on Kitchen Appliance Packages");
            LoggerHandler.info("Clicked on Kitchen Appliance Packages");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Kitchen Appliance Packages");
            LoggerHandler.error("Failed to click on Kitchen Appliance Packages");
        }
    }

    public void verifyKitchenAppliancesLabel() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.kitchenAppliancesLabel, 30);
            String label = helper.getText(HomeDepotShopAllLocators.kitchenAppliancesLabel);
            Assert.assertEquals(label, "KITCHEN APPLIANCE PACKAGES");
            test.log(Status.PASS, "Verified KITCHEN APPLIANCE PACKAGES label");
            LoggerHandler.info("Verified KITCHEN APPLIANCE PACKAGES label");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Failed to verify KITCHEN APPLIANCE PACKAGES label");
            LoggerHandler.error("Failed to verify KITCHEN APPLIANCE PACKAGES label");
        }
    }
    
    public void scrollDown() {
        try {
            helper.scrollByValue(0, 500);
            test.log(Status.PASS, "Scroll down the page");
            LoggerHandler.info("Scroll down the page");
        } catch (Exception e) {
            test.log(Status.PASS, "Failed to scroll down the page");
            LoggerHandler.info("Failed to scroll down the page");
        }
    }
    
    public void clickOnViewPackage() {
        try {
            helper.waitForElementToBeVisible(HomeDepotShopAllLocators.viewPackage, 30);
            helper.clickOnElement(HomeDepotShopAllLocators.viewPackage);
            Thread.sleep(3000);
            test.log(Status.PASS, "Clicked on View Package on first product");
            LoggerHandler.info("Clicked on View Package on first product");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on View Package on first product");
            LoggerHandler.error("Failed to click on View Package on first product");
        }
    }
    
    public void takeScreenshot() {
        Screenshot.captureScreenShot("View Package of the first product");
        Reporter.attachScreenshotToReport("View Pack", test, "Packages details of the first product");
        LoggerHandler.info("Took screenshot of View Package of the first product page");

    }
    

    public void homeDepotShopAllTestcases() {
        clickOnShopAll();
        clickOnSavings();
        clickOnShopAllSavings();
        verifySavingsCenter();
        navigateToPreviousPage();
        clickOnShopAll();
        verifyShopByDepartmentLabel();
        clickOnShopByDepartment();
        verifyAppliances();
        clickOnAppliances();
        verifyShopAllAppliances();
        clickOnShopAllAppliances();
        verifyAppliancesLabel();
        clickOnKitchenAppliancesPackages();
        verifyKitchenAppliancesLabel();
        scrollDown();
        clickOnViewPackage();
        takeScreenshot();
    }

    
}
