package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotAboutUsFooterPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotAboutUsFooterPage {
    WebDriverHelper helper;
    ExtentTest test;
    public HomeDepotAboutUsFooterPage(ExtentTest test){
        helper= new WebDriverHelper(Base.driver);
        this.test=test;
    }
    /*
    * a. Method Name: clickOnCareers
    * b. Author Name: Vansh Vijay
    * c. Description: This method waits for the 'Careers' link in the footer to be visible, scrolls to it, clicks it, and logs the action.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnCareers(){
        try {
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.careers, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.careers);
            LoggerHandler.info("Clicked on Careers");
            test.log(Status.PASS, "Clicked on Careers");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Careers");
            test.log(Status.FAIL, "Not Clicked on Careers");
        }
    }
    /*
    * a. Method Name: verifyUrlCareers
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads the expected URL for the 'Careers' page from an Excel file and verifies if the current browser URL matches it. Logs the verification result.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void verifyUrlCareers(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 0, 2);
        try {
            Assert.assertEquals(helper.getUrl(),excelData);
            LoggerHandler.info("Verified url for Careers - "+excelData);
            test.log(Status.PASS, "Verified url for Careers - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Careers - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Careers - "+excelData);
        }
    }
    /*
    * a. Method Name: clickOnCorporateInformation
    * b. Author Name: Vansh Vijay
    * c. Description: This method navigates back, waits for the 'Corporate Information' link in the footer, scrolls to it, clicks it, and logs the action.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnCorporateInformation(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.corporateInformation, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.corporateInformation);
            LoggerHandler.info("Clicked on Corporate Information");
            test.log(Status.PASS, "Clicked on Corporate Information");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Corporate Information");
            test.log(Status.FAIL, "Not Clicked on Corporate Information");
        }
    }
    /*
    * a. Method Name: verifyUrlCorporateInformation
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads the expected URL for the 'Corporate Information' page from an Excel file and verifies if the current browser URL matches it. Logs the verification result.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void verifyUrlCorporateInformation(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 2);
        try {
            Assert.assertEquals(helper.getUrl(),excelData);
            LoggerHandler.info("Verified url for Corporate Information - "+excelData);
            test.log(Status.PASS, "Verified url for Corporate Information - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Corporate Information - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Corporate Information - "+excelData);
        }
    }
    /*
    * a. Method Name: clickOnDigitalNewsroom
    * b. Author Name: Vansh Vijay
    * c. Description: This method navigates back, waits for the 'Digital Newsroom' link in the footer, scrolls to it, clicks it, and logs the action.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnDigitalNewsroom(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.digitalNewsroom, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.digitalNewsroom);
            LoggerHandler.info("Clicked on Digital Newsroom");
            test.log(Status.PASS, "Clicked on Digital Newsroom");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Digital Newsroom");
            test.log(Status.FAIL, "Not Clicked on Digital Newsroom");
        }
    }
    /*
    * a. Method Name: verifyUrlDigitalNewsroom
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads the expected URL for the 'Digital Newsroom' page from an Excel file and verifies if the current browser URL matches it. Logs the verification result.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void verifyUrlDigitalNewsroom(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 2, 2);
        try {
            Assert.assertEquals(helper.getUrl(),excelData);
            LoggerHandler.info("Verified url for Digital Newsroom - "+excelData);
            test.log(Status.PASS, "Verified url for Digital Newsroom - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Digital Newsroom - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Digital Newsroom - "+excelData);
        }
    }
    /*
    * a. Method Name: clickOnHomeDepotFoundation
    * b. Author Name: Vansh Vijay
    * c. Description: This method navigates back, waits for the 'Home Depot Foundation' link in the footer, scrolls to it, clicks it, and logs the action.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnHomeDepotFoundation(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.homeDepotFoundation, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.homeDepotFoundation);
            LoggerHandler.info("Clicked on Home Depot Foundation");
            test.log(Status.PASS, "Clicked on Home Depot Foundation");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Home Depot Foundation");
            test.log(Status.FAIL, "Not Clicked on Home Depot Foundation");
        }
    }
    /*
    * a. Method Name: verifyUrlHomeDepotFoundation
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads the expected URL for the 'Home Depot Foundation' page from an Excel file and verifies if the current browser URL matches it. Logs the verification result.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void verifyUrlHomeDepotFoundation(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 3, 2);
        try {
            Assert.assertEquals(helper.getUrl(),excelData);
            LoggerHandler.info("Verified url for Home Depot Foundation - "+excelData);
            test.log(Status.PASS, "Verified url for Home Depot Foundation - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Home Depot Foundation - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Home Depot Foundation - "+excelData);
        }
    }
/*
 * a. Method Name: clickOnInvestorRelation
 * b. Author Name: Vansh Vijay
 * c. Description: This method navigates back, waits for the 'Investor Relations' link in the footer, scrolls to it, clicks it, and logs the action.
 * d. Return Type: void
 * e. Parameters: None
 */
    public void clickOnInvestorRelation(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.investorRelation, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.investorRelation);
            LoggerHandler.info("Clicked on Investor Relations");
            test.log(Status.PASS, "Clicked on Investor Relations");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Investor Relations");
            test.log(Status.FAIL, "Not Clicked on Investor Relations");
        } 
    }
    /*
    * a. Method Name: verifyUrlInvestorRelation
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads the expected URL for the 'Investor Relations' page from an Excel file and verifies if the current browser URL matches it. Logs the verification result.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void verifyUrlInvestorRelation(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 4, 2);
        try {
            Assert.assertEquals(helper.getUrl(),excelData);
            LoggerHandler.info("Verified url for Investor Relations - "+excelData);
            test.log(Status.PASS, "Verified url for Investor Relations - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Investor Relations - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Investor Relations - "+excelData);
        }
    }
    /*
    * a. Method Name: clickOnGovernmentCustomers
    * b. Author Name: Vansh Vijay
    * c. Description: This method navigates back, waits for the 'Government Customers' link in the footer, scrolls to it, clicks it, and logs the action.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnGovernmentCustomers(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.governmentCustomers, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.governmentCustomers);
            LoggerHandler.info("Clicked on Government Customers");
            test.log(Status.PASS, "Clicked on Government Customers");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Government Customers");
            test.log(Status.FAIL, "Not Clicked on Government Customers");
        }
    }
    /*
    * a. Method Name: verifyUrlGovernmentCustomers
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads an expected URL substring for the 'Government Customers' page from an Excel file and verifies if the current browser URL contains it. Logs the verification result.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void verifyUrlGovernmentCustomers(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 5, 2);
        try {
            Assert.assertTrue(helper.getUrl().contains(excelData));
            LoggerHandler.info("Verified url for Government Customers - "+excelData);
            test.log(Status.PASS, "Verified url for Government Customers - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Government Customers - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Government Customers - "+excelData);
        }
    }
    /*
    * a. Method Name: clickOnSupplierProviders
    * b. Author Name: Vansh Vijay
    * c. Description: This method navigates back, waits for the 'Suppliers & Providers' link, scrolls to it, clicks it, verifies the URL contains the expected path, and logs the action.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnSupplierProviders(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.suppliersProviders, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.suppliersProviders);
            LoggerHandler.info("Clicked on Suppliers & Providers");
            test.log(Status.PASS, "Clicked on Suppliers & Providers");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Suppliers & Providers");
            test.log(Status.FAIL, "Not Clicked on Suppliers & Providers");
        }
    }
    /*
    * a. Method Name: verifyUrlSupplierProviders
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads an expected URL substring for the 'Suppliers & Providers' page from an Excel file and verifies if the current browser URL contains it. Logs the verification result.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void verifyUrlSupplierProviders(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 6, 2);
        try {
            Assert.assertTrue(helper.getUrl().contains(excelData));
            LoggerHandler.info("Verified url for Suppliers & Providers - "+excelData);
            test.log(Status.PASS, "Verified url for Suppliers & Providers - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Suppliers & Providers - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Suppliers & Providers - "+excelData);
        }
    }
/*
 * a. Method Name: clickOnAffiliateProgram
 * b. Author Name: Vansh Vijay
 * c. Description: This method navigates back, waits for the 'Affiliate Program' link in the footer, scrolls to it, clicks it, and logs the action.
 * d. Return Type: void
 * e. Parameters: None
 */
    public void clickOnAffiliateProgram(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.affiliateProgram, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.affiliateProgram);            
            LoggerHandler.info("Clicked on Affiliate Program");
            test.log(Status.PASS, "Clicked on Affiliate Program");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Affiliate Program");
            test.log(Status.FAIL, "Not Clicked on Affiliate Program");
        }
    }
    /*
    * a. Method Name: verifyUrlAffiliateProgram
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads an expected URL substring for the 'Affiliate Program' page from an Excel file and verifies if the current browser URL contains it. Logs the verification result.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void verifyUrlAffiliateProgram(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 7, 2);
        try {
            Assert.assertTrue(helper.getUrl().contains(excelData));
            LoggerHandler.info("Verified url for Affiliate Program - "+excelData);
            test.log(Status.PASS, "Verified url for Affiliate Program - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Affiliate Program - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Affiliate Program - "+excelData);
        }
    }
    /*
    * a. Method Name: clickOnEcoActions
    * b. Author Name: Vansh Vijay
    * c. Description: This method navigates back, waits for the 'Eco Actions' link in the footer, scrolls to it, clicks it, logs the action, and takes a screenshot.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnEcoActions(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.ecoActions, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.ecoActions);
            LoggerHandler.info("Clicked on Eco Actions");
            test.log(Status.PASS, "Clicked on Eco Actions");
            Screenshot.captureScreenShot("Eco Actions");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Eco Actions");
            test.log(Status.FAIL, "Not Clicked on Eco Actions");
        }
    }
    /*
    * a. Method Name: verifyUrlEcoActions
    * b. Author Name: Vansh Vijay
    * c. Description: This method reads an expected URL substring for the 'Eco Actions' page from an Excel file and verifies if the current browser URL contains it. Logs the verification result.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void verifyUrlEcoActions(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 8, 2);
        try {
            Assert.assertTrue(helper.getUrl().contains(excelData));
            LoggerHandler.info("Verified url for Eco Actions - "+excelData);
            test.log(Status.PASS, "Verified url for Eco Actions - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Eco Actions - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Eco Actions - "+excelData);
        }
    }
    /*
    * a. Method Name: aboutUsFooterFlow
    * b. Author Name: Vansh Vijay
    * c. Description: This method executes a sequence of actions to test the 'About Us' section links in the footer. It clicks each link and verifies its corresponding URL.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void aboutUsFooterFlow(){
        clickOnCareers();
        verifyUrlCareers();
        clickOnCorporateInformation();
        verifyUrlCorporateInformation();
        clickOnDigitalNewsroom();
        verifyUrlDigitalNewsroom();
        clickOnHomeDepotFoundation();
        verifyUrlHomeDepotFoundation();
        clickOnInvestorRelation();
        verifyUrlInvestorRelation();
        clickOnGovernmentCustomers();
        verifyUrlGovernmentCustomers();
        clickOnSupplierProviders();
        verifyUrlSupplierProviders();
        clickOnAffiliateProgram();
        verifyUrlAffiliateProgram();
        clickOnEcoActions();
        verifyUrlEcoActions();
    }
}
