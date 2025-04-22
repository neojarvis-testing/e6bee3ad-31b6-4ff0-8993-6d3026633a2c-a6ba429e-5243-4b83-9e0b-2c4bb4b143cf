package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotCategoryLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotCategory {
    WebDriverHelper helper;
    ExtentTest test;

    public HomeDepotCategory(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    public void clickOnSearchInputBar() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.searchInputBar, 30);
            helper.clickOnElement(HomeDepotCategoryLocators.searchInputBar);
            test.log(Status.PASS, "Clicked on Input Search Bar");
            LoggerHandler.info("Clicked on Input Search Bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Input Search Bar");
            LoggerHandler.error("Failed to click on Input Search Bar");
        }
    }

    public void enterValueOnInputBar() {
        try {
            helper.sendData(HomeDepotCategoryLocators.searchInputBar, "wrench");
            test.log(Status.PASS,  "Entered wrench on Input Search Bar");
            LoggerHandler.info("Entered wrench on Input Search Bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to enter value on Input Search Bar");
            LoggerHandler.error("Failed to enter value on Input Search Bar");
        }
    }

    public void clickOnSearchIcon() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.searchIcon, 30);
            helper.clickOnElement(HomeDepotCategoryLocators.searchIcon);
            test.log(Status.PASS, "Clicked on Search Icon");
            LoggerHandler.info("Clicked On Search Icon");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Search Icon");
            LoggerHandler.error("Failed to click On Search Icon"); 
        }
    }
    
    public void verifyWrenchLabel() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.wrenchLabel, 30);
            String label = helper.getText(HomeDepotCategoryLocators.wrenchLabel);
            Assert.assertEquals(label, "wrench");
            test.log(Status.PASS, "Verified wrench label");
            LoggerHandler.info("Verified wrench label");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify wrench label");
            LoggerHandler.error("Failed to verify wrench label");
        }
    }
    
    public void clickOnCategory() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.category, 30);
            helper.clickOnElement(HomeDepotCategoryLocators.category);
            test.log(Status.PASS, "Clicked on Category");
            LoggerHandler.info("Clicked on Category");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Category");
            LoggerHandler.error("Failed to click on Category");
        }
    }
    
    public void clickOnWrenchSets() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.wrenchSets, 30);
            helper.clickOnElement(HomeDepotCategoryLocators.wrenchSets);
            test.log(Status.PASS, "Clicked on Wrench Sets");
            LoggerHandler.info("Clicked on Wrench Sets");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Wrench Sets");
            LoggerHandler.error("Failed to click on Wrench Sets");
        }
    }
    
    public void verifyWrenchSetsLabel() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.wrenchSetsLabel, 30);
            String label = helper.getText(HomeDepotCategoryLocators.wrenchSetsLabel);
            Assert.assertEquals(label, "Wrench Sets");
            test.log(Status.PASS, "Verified Wrench Sets label");
            LoggerHandler.info("Verified Wrench Sets label");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify Wrench Sets label");
            LoggerHandler.error("Failed to verify Wrench Sets label");
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

    public void clickOnRatchetingWrenches() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.ratchetingWrenches, 30);
            helper.clickOnElement(HomeDepotCategoryLocators.ratchetingWrenches);
            test.log(Status.PASS, "Clicked on Ratcheting Wrenches");
            LoggerHandler.info("Clicked on Ratcheting Wrenches");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Ratcheting Wrenches");
            LoggerHandler.error("Failed to click on Ratcheting Wrenches");
        }
    }
    
    public void verifyRatchetingWrenchesLabel() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.ratchetingWrenchesLabel, 30);
            String label = helper.getText(HomeDepotCategoryLocators.ratchetingWrenchesLabel);
            Assert.assertEquals(label, "Ratcheting Wrenches");
            test.log(Status.PASS, "Verified Ratcheting Wrenches label");
            LoggerHandler.info("Verified Ratcheting Wrenches label");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify Ratcheting Wrenches label");
            LoggerHandler.error("Failed to verify Ratcheting Wrenches label");
        } 
    }

    public void clickOnAdjustableWrenches() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.adjustableWrenches, 30);
            helper.clickOnElement(HomeDepotCategoryLocators.adjustableWrenches);
            test.log(Status.PASS, "Clicked on Adjustable Wrenches");
            LoggerHandler.info("Clicked on Adjustable Wrenches");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Adjustable Wrenches");
            LoggerHandler.error("Failed to click on Adjustable Wrenches");
        }
    }
    
    public void verifyAdjustableWrenchesLabel() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.adjustableWrenchesLabel, 30);
            String label = helper.getText(HomeDepotCategoryLocators.adjustableWrenchesLabel);
            Assert.assertEquals(label, "Adjustable Wrenches");
            test.log(Status.PASS, "Verified Adjustable Wrenches label");
            LoggerHandler.info("Verified Adjustable Wrenches label");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify Adjustable Wrenches label");
            LoggerHandler.error("Failed to verify Adjustable Wrenches label");
        } 
    }

    public void clickOnImpactWrenches() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.impactWrenches, 30);
            helper.clickOnElement(HomeDepotCategoryLocators.impactWrenches);
            test.log(Status.PASS, "Clicked on Adjustable Wrenches");
            LoggerHandler.info("Clicked on Adjustable Wrenches");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Adjustable Wrenches");
            LoggerHandler.error("Failed to click on Adjustable Wrenches");
        }
    }
    
    public void verifyImpactWrenchesLabel() {
        try {
            helper.waitForElementToBeVisible(HomeDepotCategoryLocators.impactWrenchesLabel, 30);
            String label = helper.getText(HomeDepotCategoryLocators.impactWrenchesLabel);
            Assert.assertEquals(label, "Impact Wrenches");
            test.log(Status.PASS, "Verified Impact Wrenches label");
            LoggerHandler.info("Verified Impact Wrenches label");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify Impact Wrenches label");
            LoggerHandler.error("Failed to verify Impact Wrenches label");
        } 
    }
    
    public void takeScreenshot() {
        Screenshot.captureScreenShot("Impact Wrenches");
        Reporter.attachScreenshotToReport("Impact Wrenches", test, "Details of Wrenches");
        LoggerHandler.info("Took screenshot of Impact Wrenches page");
    }

    public void homeDepotCategoryTestcases() {
        clickOnSearchInputBar();
        enterValueOnInputBar();
        clickOnSearchIcon();
        verifyWrenchLabel();
        clickOnCategory();
        clickOnWrenchSets();
        verifyWrenchSetsLabel();
        navigateToPreviousPage();
        navigateToPreviousPage();
        clickOnCategory();
        clickOnRatchetingWrenches();
        verifyRatchetingWrenchesLabel();
        navigateToPreviousPage();
        navigateToPreviousPage();
        clickOnCategory();
        clickOnAdjustableWrenches();
        verifyAdjustableWrenchesLabel();
        navigateToPreviousPage();
        navigateToPreviousPage();
        clickOnCategory();
        clickOnImpactWrenches();
        verifyImpactWrenchesLabel();
        takeScreenshot();
    }
    
}
