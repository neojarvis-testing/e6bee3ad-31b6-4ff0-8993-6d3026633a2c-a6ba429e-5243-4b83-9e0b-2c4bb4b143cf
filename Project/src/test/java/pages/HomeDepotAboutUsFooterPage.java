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
    public void verifyUrlCareers(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 0, 2);
        try {
            Assert.assertEquals(helper.getUrl(),excelData);
            // Assert.assertEquals(helper.getUrl(),"https://careers.homedepot.com/");
            LoggerHandler.info("Verified url for Careers - "+excelData);
            test.log(Status.PASS, "Verified url for Careers - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Careers - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Careers - "+excelData);
        }
    }
    public void clickOnCorporateInformation(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.corporateInformation, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.corporateInformation);
            // Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/");
            LoggerHandler.info("Clicked on Corporate Information");
            test.log(Status.PASS, "Clicked on Corporate Information");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Corporate Information");
            test.log(Status.FAIL, "Not Clicked on Corporate Information");
        }
    }
    public void verifyUrlCorporateInformation(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 2);
        try {
            Assert.assertEquals(helper.getUrl(),excelData);
            // Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/");
            LoggerHandler.info("Verified url for Corporate Information - "+excelData);
            test.log(Status.PASS, "Verified url for Corporate Information - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Corporate Information - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Corporate Information - "+excelData);
        }
    }
    public void clickOnDigitalNewsroom(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.digitalNewsroom, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.digitalNewsroom);
            LoggerHandler.info("Clicked on Digital Newsroom");
            test.log(Status.PASS, "Clicked on Digital Newsroom");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified url for Digital Newsroom");
            test.log(Status.FAIL, "Not Verified url for Digital Newsroom");
        }
    }
    public void verifyUrlDigitalNewsroom(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 2, 2);
        try {
            Assert.assertEquals(helper.getUrl(),excelData);
            // Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/newsroom");
            // Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/page/newsroom");
            LoggerHandler.info("Verified url for Digital Newsroom - "+excelData);
            test.log(Status.PASS, "Verified url for Digital Newsroom - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Digital Newsroom - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Digital Newsroom - "+excelData);
        }
    }
    public void clickOnHomeDepotFoundation(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.homeDepotFoundation, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.homeDepotFoundation);
            LoggerHandler.info("Clicked on Home Depot Foundation");
            test.log(Status.PASS, "Clicked on Home Depot Foundation");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified url for Home Depot Foundation");
            test.log(Status.FAIL, "Not Verified url for Home Depot Foundation");
        }
    }
    public void verifyUrlHomeDepotFoundation(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 3, 2);
        try {
            Assert.assertEquals(helper.getUrl(),excelData);
            // Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/foundation");
            // Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/page/home-depot-foundation");
            LoggerHandler.info("Verified url for Depot Foundation - "+excelData);
            test.log(Status.PASS, "Verified url for Depot Foundation - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Depot Foundation - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Depot Foundation - "+excelData);
        }
    }
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
    public void verifyUrlInvestorRelation(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 4, 2);
        try {
            Assert.assertEquals(helper.getUrl(),excelData);
            // Assert.assertEquals(helper.getUrl(),"https://ir.homedepot.com/");
            LoggerHandler.info("Verified url for Investor Relations - "+excelData);
            test.log(Status.PASS, "Verified url for Investor Relations - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Investor Relations - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Investor Relations - "+excelData);
        }
    }
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
    public void verifyUrlGovernmentCustomers(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 5, 2);
        try {
            Assert.assertTrue(helper.getUrl().contains(excelData));
            // Assert.assertTrue(helper.getUrl().contains("/c/Government_Customers"));
            LoggerHandler.info("Verified url for Government Customers - "+excelData);
            test.log(Status.PASS, "Verified url for Government Customers - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Government Customers - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Government Customers - "+excelData);
        }
    }
    public void clickOnSupplierProviders(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.suppliersProviders, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.suppliersProviders);
            Assert.assertTrue(helper.getUrl().contains("/c/suppliers_and_providers"));
            LoggerHandler.info("Clicked on Suppliers & Providers");
            test.log(Status.PASS, "Clicked on Suppliers & Providers");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Suppliers & Providers");
            test.log(Status.FAIL, "Not Clicked on Suppliers & Providers");
        }
    }
    public void verifyUrlSupplierProviders(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 6, 2);
        try {
            Assert.assertTrue(helper.getUrl().contains(excelData));
            // Assert.assertTrue(helper.getUrl().contains("/c/suppliers_and_providers"));
            LoggerHandler.info("Verified url for Suppliers & Providers - "+excelData);
            test.log(Status.PASS, "Verified url for Suppliers & Providers - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Suppliers & Providers - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Suppliers & Providers - "+excelData);
        }
    }
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
    public void verifyUrlAffiliateProgram(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 7, 2);
        try {
            Assert.assertTrue(helper.getUrl().contains(excelData));
            // Assert.assertTrue(helper.getUrl().contains("https://www.homedepot.com/c/SF_MS_The_Home_Depot_Affiliate_Program"));
            LoggerHandler.info("Verified url for Affiliate Program - "+excelData);
            test.log(Status.PASS, "Verified url for Affiliate Program - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Affiliate Program - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Affiliate Program - "+excelData);
        }
    }
    public void clickOnEcoActions(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.ecoActions, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.ecoActions);
            // Assert.assertTrue(helper.getUrl().contains("https://ecoactions.homedepot.com/"));
            LoggerHandler.info("Clicked on Eco Actions");
            test.log(Status.PASS, "Clicked on Eco Actions");
            Screenshot.captureScreenShot("Eco Actions");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Eco Actions");
            test.log(Status.FAIL, "Not Clicked on Eco Actions");
        }
    }
    public void verifyUrlEcoActions(){
        String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 8, 2);
        try {
            Assert.assertTrue(helper.getUrl().contains(excelData));
            // Assert.assertTrue(helper.getUrl().contains("https://ecoactions.homedepot.com/"));
            LoggerHandler.info("Verified url for Eco Actions - "+excelData);
            test.log(Status.PASS, "Verified url for Eco Actions - "+excelData);
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Eco Actions - "+excelData);
            test.log(Status.FAIL, "Not Verified url for Eco Actions - "+excelData);
        }
    }
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
