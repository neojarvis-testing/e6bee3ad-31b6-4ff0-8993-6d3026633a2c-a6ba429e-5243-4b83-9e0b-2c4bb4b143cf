package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotServicesPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotServicesPage {
    WebDriverHelper helper;
    ExtentTest test;
    public HomeDepotServicesPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test= test;
    }

    /*
     * a. Method Name: clickOnServicesIcon
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the Services menu icon in the header.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnServicesIcon(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.serviceIcon, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.serviceIcon);
            String actual = helper.getText(HomeDepotServicesPageLocator.serviceIcon);
            String expected = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 0, 0);
            Assert.assertEquals(actual,expected);
            LoggerHandler.info("User clicked on Service Icon");
            test.log(Status.PASS, "User clicked on Service Icon");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Service Icon");
            test.log(Status.FAIL, "User not able to Click on Service Icon");
        }
    }

    /*
     * a. Method Name: verifyServicesText
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the presence of the Services text.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyServicesText(){
        try {
            String actual = helper.getText(HomeDepotServicesPageLocator.services);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 0, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the TextServices");
            test.log(Status.PASS, "Verified the Text Services");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text Services");
            test.log(Status.FAIL, "Unable to verify the Text Services");
        }
    }

    /*
     * a. Method Name: clickOnInstallation
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the Installation & Services option.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnInstallation(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.installation, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.installation);
            String actual = helper.getText(HomeDepotServicesPageLocator.installation);
            String expected = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 1, 0);
            Assert.assertTrue(actual.contains(expected));
            LoggerHandler.info("User Clicked on Installation & Services");
            test.log(Status.PASS, "User Clicked on Installation & Services");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Installation & Services");
            test.log(Status.FAIL, "User not able to Click on Installation & Services");
        }
    }

    /*
     * a. Method Name: clickOnViewAllInstallation
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the View All Installation & Services link.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnViewAllInstallation(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.viewAllInstallation, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.viewAllInstallation);
            String actual = helper.getText(HomeDepotServicesPageLocator.viewAllInstallation);
            String expected = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 2, 0);
            Assert.assertTrue(actual.contains(expected));
            LoggerHandler.info("User Clicked on View All Installation & Services");
            test.log(Status.PASS, "User Clicked on View All Installation & Services");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on View All Installation & Services");
            test.log(Status.FAIL, "User not able to Click on View All Installation & Services");
        }
    }

    /*
     * a. Method Name: verifyHomeServicesText
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the presence of the Home Services text.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyHomeServicesText(){
        try {
            String actual = helper.getText(HomeDepotServicesPageLocator.homeServices);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 0, 1);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the TextHome Services");
            test.log(Status.PASS, "Verified the Text Home Services");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text Home Services");
            test.log(Status.FAIL, "Unable to verify the Text Home Services");
        }
    }

    /*
     * a. Method Name: clickOnFlooring
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the Flooring Installation section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnFlooring(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.flooring, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.flooring);
            String actual = helper.getText(HomeDepotServicesPageLocator.flooring);
            String expected = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 3, 0);
            Assert.assertEquals(actual,expected);
            LoggerHandler.info("User Clicked on Flooring");
            test.log(Status.PASS, "User Clicked on Flooring");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Flooring");
            test.log(Status.FAIL, "User not able to Click on Flooring");
        }
    }
    
    /*
     * a. Method Name: verifyFlooringText
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the presence of the Flooring Installation text.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyFlooringText(){
        try {
            String actual = helper.getText(HomeDepotServicesPageLocator.floorings);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 1, 1);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the TextFlooring Installation");
            test.log(Status.PASS, "Verified the Text Flooring Installation");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text Flooring Installation");
            test.log(Status.FAIL, "Unable to verify the Text Flooring Installation");
        }
    }

    /*
     * a. Method Name: clickOnBathroom
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the Bathroom Installation section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnBathroom(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.bathroom, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.bathroom);
            String actual = helper.getText(HomeDepotServicesPageLocator.bathroom);
            String expected = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 4, 0);
            Assert.assertEquals(actual,expected);
            LoggerHandler.info("User Clicked on Bathroom");
            test.log(Status.PASS, "User Clicked on Bathroom");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Bathroom");
            test.log(Status.FAIL, "User not able to Click on Bathroom");
        }
    }

    /*
     * a. Method Name: verifyBathroomText
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the presence of the Bathroom Installation Services text.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyBathroomText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.bathrooms, 10);
            String actual = helper.getText(HomeDepotServicesPageLocator.bathrooms);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 2, 1);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the TextBathroom Installation Services");
            test.log(Status.PASS, "Verified the Text Bathroom Installation Services");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text Bathroom Installation Services");
            test.log(Status.FAIL, "Unable to verify the Text Bathroom Installation Services");
        }
    }

    /*
     * a. Method Name: clickOnDoorsAndWindows
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the Windows & Doors Installation section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnDoorsAndWindows(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.doorsWindows, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.doorsWindows);
            String actual = helper.getText(HomeDepotServicesPageLocator.doorsWindows);
            String expected = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 5, 0);
            Assert.assertEquals(actual,expected);
            LoggerHandler.info("User Clicked on Doors & Windows");
            test.log(Status.PASS, "User Clicked on Doors & Windows");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Doors & Windows");
            test.log(Status.FAIL, "User not able to Click on Doors & Windows");
        }
    }

    /*
     * a. Method Name: verifyWindowServicesText
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the presence of the Window & Door Services text.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyWindowServicesText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.windowDoorServices, 10);
            String actual = helper.getText(HomeDepotServicesPageLocator.windowDoorServices);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 3, 1);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the TextWindow & Door Services");
            test.log(Status.PASS, "Verified the Text Window & Door Services");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text Window & Door Services");
            test.log(Status.FAIL, "Unable to verify the Text Window & Door Services");
        }
    }

    /*
    * a. Method Name: clickOnHeating
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the HVAC Services section.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void clickOnHeating(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.heating, 10);
            helper.clickOnElement(HomeDepotServicesPageLocator.heating);
            String actual = helper.getText(HomeDepotServicesPageLocator.heating);
            String expected = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 6, 0);
            Assert.assertEquals(actual,expected);
            LoggerHandler.info("User Clicked on Heating & Cooling");
            test.log(Status.PASS, "User Clicked on Heating & Cooling");
        } catch (Exception e) {
            LoggerHandler.error("User not able to Click on Heating & Cooling");
            test.log(Status.FAIL, "User not able to Click on Heating & Cooling");
        }
    }

    /*
     * a. Method Name: verifyHeatingText
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the presence of the HVAC Services text.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyHeatingText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotServicesPageLocator.hvacServices,10);
            String actual = helper.getText(HomeDepotServicesPageLocator.hvacServices);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "Sheet1", 4, 1);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the TextHVAC Services");
            test.log(Status.PASS, "Verified the Text HVAC Services");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text HVAC Services");
            test.log(Status.FAIL, "Unable to verify the Text HVAC Services");
        }
    }

    /*
     * a. Method Name: navigateBackToPreviousPage
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Navigates back to the previous page.
     * d. Return Type: void
     * e. Parameters: none
     */
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

    public void homeDepotServicesPageTestCase(){
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
            Screenshot.captureScreenShot("Screenshot Captured");
            Reporter.attachScreenshotToReport("Test Screenshot", test, "Capture and stored in report");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
