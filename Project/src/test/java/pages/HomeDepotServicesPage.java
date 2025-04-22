package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotServicesPageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotServicesPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public HomeDepotServicesPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test= test;

    }

    public void clickOnServicesIcon(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.serviceIcon, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.serviceIcon);
            LoggerHandler.info("User Clicked on Service Icon");
            test.log(Status.PASS, "User Clicked on Service Icon");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Service Icon");
            test.log(Status.FAIL, "User not able to Click on Service Icon");
        }
    }

    public void verifyServicesText(){
        try {
            String actual = helper.getText(HomeDepotServicesPageLocator.verifyServices);
            String expected  = "Services";
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'Services'");
            test.log(Status.PASS, "Verified the Text 'Services'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'Services'");
            test.log(Status.FAIL, "Unable to verify the Text 'Services'");
        }
    }

    public void clickOnInstallation(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.clickInstallation, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.clickInstallation);
            LoggerHandler.info("User Clicked on Installation & Services");
            test.log(Status.PASS, "User Clicked on Installation & Services");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Installation & Services");
            test.log(Status.FAIL, "User not able to Click on Installation & Services");
        }
    }

    public void clickOnViewAllInstallation(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.viewAllInstallation, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.viewAllInstallation);
            LoggerHandler.info("User Clicked on View All Installation & Services");
            test.log(Status.PASS, "User Clicked on View All Installation & Services");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on View All Installation & Services");
            test.log(Status.FAIL, "User not able to Click on View All Installation & Services");
        }
    }

    public void verifyHomeServicesText(){
        try {
            String actual = helper.getText(HomeDepotServicesPageLocator.verifyHomeServices);
            String expected  = "Home Services";
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'Home Services'");
            test.log(Status.PASS, "Verified the Text 'Home Services'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'Home Services'");
            test.log(Status.FAIL, "Unable to verify the Text 'Home Services'");
        }
    }

    public void clickOnFlooring(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.clickFlooring, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.clickFlooring);
            LoggerHandler.info("User Clicked on Flooring");
            test.log(Status.PASS, "User Clicked on Flooring");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Flooring");
            test.log(Status.FAIL, "User not able to Click on Flooring");
        }
    }
    
    public void verifyFlooringText(){
        try {
            String actual = helper.getText(HomeDepotServicesPageLocator.verifyFlooring);
            String expected  = "Flooring Installation";
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'Flooring Installation'");
            test.log(Status.PASS, "Verified the Text 'Flooring Installation'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'Flooring Installation'");
            test.log(Status.FAIL, "Unable to verify the Text 'Flooring Installation'");
        }
    }

    public void clickOnBathroom(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.clickBathroom, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.clickBathroom);
            LoggerHandler.info("User Clicked on Bathroom");
            test.log(Status.PASS, "User Clicked on Bathroom");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Bathroom");
            test.log(Status.FAIL, "User not able to Click on Bathroom");
        }
    }

    public void verifyBathroomText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.verifyBathroom, 10);
            String actual = helper.getText(HomeDepotServicesPageLocator.verifyBathroom);
            String expected  = "Bathroom Installation Services";
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'Bathroom Installation Services'");
            test.log(Status.PASS, "Verified the Text 'Bathroom Installation Services'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'Bathroom Installation Services'");
            test.log(Status.FAIL, "Unable to verify the Text 'Bathroom Installation Services'");
        }
    }

    public void clickOnDoorsAndWindows(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.clickDoorsWindows, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.clickDoorsWindows);
            LoggerHandler.info("User Clicked on Doors & Windows");
            test.log(Status.PASS, "User Clicked on Doors & Windows");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Doors & Windows");
            test.log(Status.FAIL, "User not able to Click on Doors & Windows");
        }
    }

    public void verifyWindowServicesText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.verifyWindowDoorServices, 10);
            String actual = helper.getText(HomeDepotServicesPageLocator.verifyWindowDoorServices);
            String expected  = "Window & Door Services";
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'Window & Door Services'");
            test.log(Status.PASS, "Verified the Text 'Window & Door Services'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'Window & Door Services'");
            test.log(Status.FAIL, "Unable to verify the Text 'Window & Door Services'");
        }
    }

    public void clickOnHeating(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.clickHeating, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.clickHeating);
            LoggerHandler.info("User Clicked on Heating & Cooling");
            test.log(Status.PASS, "User Clicked on Heating & Cooling");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Heating & Cooling");
            test.log(Status.FAIL, "User not able to Click on Heating & Cooling");
        }
    }

    public void verifyHeatingText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.verifyHVACServices,10);
            String actual = helper.getText(HomeDepotServicesPageLocator.verifyHVACServices);
            String expected  = "HVAC Services";
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'HVAC Services'");
            test.log(Status.PASS, "Verified the Text 'HVAC Services'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'HVAC Services'");
            test.log(Status.FAIL, "Unable to verify the Text 'HVAC Services'");
        }
    }

    public void navigateBackToPreviousPage(){
        try{
            helper.navigateBack();
            LoggerHandler.info("Navigated back to Previous Page");
            test.log(Status.PASS, "Navigated back to Previous Page");
        }catch(Exception e){
            e.printStackTrace();
            LoggerHandler.error("Not able to Navigate back to Previous Page");
            test.log(Status.FAIL, "Not able to Navigate back to Previous Page");
        }
    }

    public void testCase3(){
        try {
            clickOnServicesIcon();
            verifyServicesText();
            clickOnInstallation();
            clickOnViewAllInstallation();
            verifyHomeServicesText();
            clickOnFlooring();
            verifyFlooringText();
            navigateBackToPreviousPage();
            clickOnBathroom();
            verifyBathroomText();
            navigateBackToPreviousPage();
            clickOnDoorsAndWindows();
            verifyWindowServicesText();
            navigateBackToPreviousPage();
            clickOnHeating();
            verifyHeatingText();
            navigateBackToPreviousPage();
            Thread.sleep(3000);
            Screenshot.captureScreenShot("Test Case 3 Screenshot Captured");
            Reporter.attachScreenshotToReport("Report Test Case 3 Screenshot", test, "Capture and stored in report");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
