package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotAboutUsFooterPageLocator;
import utils.Base;
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
        try {
            Assert.assertEquals(helper.getUrl(),"https://careers.homedepot.com/");
            LoggerHandler.info("Verified url for Careers");
            test.log(Status.PASS, "Verified url for Careers");
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Careers");
            test.log(Status.FAIL, "Not Verified url for Careers");
        }
    }
    public void clickOnCorporateInformation(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.corporateInformation, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.corporateInformation);
            Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/");
            LoggerHandler.info("Clicked on Corporate Information");
            test.log(Status.PASS, "Clicked on Corporate Information");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Corporate Information");
            test.log(Status.FAIL, "Not Clicked on Corporate Information");
        }
    }
    public void verifyUrlCorporateInformation(){
        try {
            Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/");
            LoggerHandler.info("Verified url for Corporate Information");
            test.log(Status.PASS, "Verified url for Corporate Information");
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Corporate Information");
            test.log(Status.FAIL, "Not Verified url for Corporate Information");
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
        try {
            Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/newsroom");
            // Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/page/newsroom");
            LoggerHandler.info("Verified url for Digital Newsroom");
            test.log(Status.PASS, "Verified url for Digital Newsroom");
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Digital Newsroom");
            test.log(Status.FAIL, "Not Verified url for Digital Newsroom");
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
        try {
            Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/foundation");
            // Assert.assertEquals(helper.getUrl(),"https://corporate.homedepot.com/page/home-depot-foundation");
            LoggerHandler.info("Verified url for Depot Foundation");
            test.log(Status.PASS, "Verified url for Depot Foundation");
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Depot Foundation");
            test.log(Status.FAIL, "Not Verified url for Depot Foundation");
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
        try {
            Assert.assertEquals(helper.getUrl(),"https://ir.homedepot.com/");
            LoggerHandler.info("Verified url for Investor Relations");
            test.log(Status.PASS, "Verified url for Investor Relations");
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Investor Relations");
            test.log(Status.FAIL, "Not Verified url for Investor Relations");
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
        try {
            Assert.assertTrue(helper.getUrl().contains("/c/Government_Customers"));
            LoggerHandler.info("Verified url for Government Customers");
            test.log(Status.PASS, "Verified url for Government Customers");
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Government Customers");
            test.log(Status.FAIL, "Not Verified url for Government Customers");
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
        try {
            Assert.assertTrue(helper.getUrl().contains("/c/suppliers_and_providers"));
            LoggerHandler.info("Verified url for Suppliers & Providers");
            test.log(Status.PASS, "Verified url for Suppliers & Providers");
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Suppliers & Providers");
            test.log(Status.FAIL, "Not Verified url for Suppliers & Providers");
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
        try {
            Assert.assertTrue(helper.getUrl().contains("https://www.homedepot.com/c/SF_MS_The_Home_Depot_Affiliate_Program"));
            LoggerHandler.info("Verified url for Affiliate Program");
            test.log(Status.PASS, "Verified url for Affiliate Program");
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Affiliate Program");
            test.log(Status.FAIL, "Not Verified url for Affiliate Program");
        }
    }
    public void clickOnEcoActions(){
        try {
            helper.navigateBack();
            helper.waitForElementToBeVisible(HomeDepotAboutUsFooterPageLocator.ecoActions, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotAboutUsFooterPageLocator.ecoActions);
            Assert.assertTrue(helper.getUrl().contains("https://ecoactions.homedepot.com/"));
            LoggerHandler.info("Clicked on Eco Actions");
            test.log(Status.PASS, "Clicked on Eco Actions");
            Screenshot.captureScreenShot("Eco Actions");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Eco Actions");
            test.log(Status.FAIL, "Not Clicked on Eco Actions");
        }
    }
    public void verifyUrlEcoActions(){
        try {
            Assert.assertTrue(helper.getUrl().contains("https://ecoactions.homedepot.com/"));
            LoggerHandler.info("Verified url for Eco Actions");
            test.log(Status.PASS, "Verified url for Eco Actions");
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified url for Eco Actions");
            test.log(Status.FAIL, "Not Verified url for Eco Actions");
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
