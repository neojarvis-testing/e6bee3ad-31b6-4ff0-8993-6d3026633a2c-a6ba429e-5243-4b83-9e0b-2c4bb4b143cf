package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotAboutUsFooterPageLocator;
import uistore.HomeDepotCreditOffersPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotCreditOffersPage {
    WebDriverHelper helper;
    ExtentTest test;
    public HomeDepotCreditOffersPage(ExtentTest test){
        helper= new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void clickOnCreditOffers(){
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.creditOffers, 10);
            helper.scrollToEnd();
            helper.clickOnElement(HomeDepotCreditOffersPageLocator.creditOffers);
            LoggerHandler.info("Clicked on Credit Offers");
            test.log(Status.PASS, "Clicked on Credit Offers");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Credit Offers");
            test.log(Status.FAIL, "Not Clicked on Credit Offers");
        }
    }
    public void verifyTextForCreditOffers(){
        try {
            Assert.assertEquals(helper.getText(HomeDepotCreditOffersPageLocator.verifyCreditCardServices),"CREDIT CARD SERVICES");
            LoggerHandler.info("Verified text CREDIT CARD SERVICES");
            test.log(Status.PASS, "Verified text CREDIT CARD SERVICES");
        } catch (AssertionError e) {
            LoggerHandler.error("Not Verified text CREDIT CARD SERVICES");
            test.log(Status.FAIL, "Not Verified text CREDIT CARD SERVICES");
        }
    }
    public void clickOnApplyNow(){
        try {
            helper.scrollByValue(0, 1000);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.applyNow, 10);
            helper.clickOnElement(HomeDepotCreditOffersPageLocator.applyNow);
            LoggerHandler.info("Clicked on Apply Now");
            test.log(Status.PASS, "Clicked on Apply Now");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Apply Now");
            test.log(Status.FAIL, "Not Clicked on Apply Now");
        }
    }
    public void sendDataForFirstName(){
        try {
            String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 0, 0);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.firstName, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.firstName,excelData);
            LoggerHandler.info("Data inserted for First Name");
            test.log(Status.PASS, "Data inserted for First Name");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for First Name");
            test.log(Status.FAIL, "Data not inserted for First Name");
        }
    }
    public void sendDataForLastName(){
        try {
            String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 1, 0);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.lastName, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.lastName,excelData);
            LoggerHandler.info("Data inserted for Last Name");
            test.log(Status.PASS, "Data inserted for Last Name");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Last Name");
            test.log(Status.FAIL, "Data not inserted for Last Name");
        }
    }
    public void sendDataForEmailAddress(){
        try {
            String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 2, 0);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.email, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.email,excelData);
            LoggerHandler.info("Data inserted for Email Address");
            test.log(Status.PASS, "Data inserted for Email Address");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Email Address");
            test.log(Status.FAIL, "Data not inserted for Email Address");
        }
    }
    public void sendDataForMobileNumber(){
        try {
            String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 3, 0);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.phoneNumber, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.phoneNumber,excelData);
            LoggerHandler.info("Data inserted for Mobile Number");
            test.log(Status.PASS, "Data inserted for Mobile Number");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Mobile Number");
            test.log(Status.FAIL, "Data not inserted for Mobile Number");
        }
    }
    public void clickOnContinueContact(){
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.continueContact, 10);
            helper.clickOnElement(HomeDepotCreditOffersPageLocator.continueContact);
            LoggerHandler.info("Clicked on Continue");
            test.log(Status.PASS, "Clicked on Continue");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Continue");
            test.log(Status.FAIL, "Not Clicked on Continue");
        }
    }
    public void sendDataForStreetAddress(){
        try {
            String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 4, 0);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.streetAddress, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.streetAddress,excelData);
            LoggerHandler.info("Data inserted for Street Address");
            test.log(Status.PASS, "Data inserted for Street Address");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Street Address");
            test.log(Status.FAIL, "Data not inserted for Street Address");
        }
    }
    public void sendDataForCity(){
        try {
            String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 5, 0);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.city, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.city,excelData);
            LoggerHandler.info("Data inserted for City");
            test.log(Status.PASS, "Data inserted for City");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for City");
            test.log(Status.FAIL, "Data not inserted for City");
        }
    }
    public void sendDataForState(){
        try {
            String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 6, 0);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.state, 10);
            helper.selectFromDropdown(HomeDepotCreditOffersPageLocator.state,excelData);
            LoggerHandler.info("Data inserted for State");
            test.log(Status.PASS, "Data inserted for State");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for State");
            test.log(Status.FAIL, "Data not inserted for State");
        }
    }
    public void sendDataForZipCode(){
        try {
            String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 7, 0);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.zipCode, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.zipCode,excelData);
            LoggerHandler.info("Data inserted for Zip Code");
            test.log(Status.PASS, "Data inserted for Zip Code");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Zip Code");
            test.log(Status.FAIL, "Data not inserted for Zip Code");
        }
    }
    public void clickOnContinueReview(){
        try {
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.continueReview, 10);
            helper.clickOnElement(HomeDepotCreditOffersPageLocator.continueReview);
            LoggerHandler.info("Clicked on Continue");
            test.log(Status.PASS, "Clicked on Continue");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Continue");
            test.log(Status.FAIL, "Not Clicked on Continue");
        }
    }
    public void sendDataForResidentialStatus(){
        try {
            String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 8, 0);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.residentialStatus, 10);
            helper.selectFromDropdown(HomeDepotCreditOffersPageLocator.residentialStatus,excelData);
            LoggerHandler.info("Data inserted for Residential Status");
            test.log(Status.PASS, "Data inserted for Residential Status");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Residential Status");
            test.log(Status.FAIL, "Data not inserted for Residential Status");
        }
    }
    public void sendDataForMonthlyIncome(){
        try {
            String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 9, 0);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.monthlyIncome, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.monthlyIncome,excelData);
            LoggerHandler.info("Data inserted for Monthly Income");
            test.log(Status.PASS, "Data inserted for Monthly Income");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Monthly Income");
            test.log(Status.FAIL, "Data not inserted for Monthly Income");
        }
    }
    public void sendDataForAnnualIncome(){
        try {
            String excelData = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Vansh", 10, 0);
            helper.waitForElementToBeVisible(HomeDepotCreditOffersPageLocator.totalIncome, 10);
            helper.sendData(HomeDepotCreditOffersPageLocator.totalIncome,excelData);
            Thread.sleep(2000);
            Screenshot.captureScreenShot("Annual Income");
            LoggerHandler.info("Data inserted for Total Income");
            test.log(Status.PASS, "Data inserted for Total Income");
        } catch (Exception e) {
            LoggerHandler.error("Data not inserted for Total Income");
            test.log(Status.FAIL, "Data not inserted for Total Income");
        }
    }
    public void creditOffersFlow(){
        clickOnCreditOffers();
        verifyTextForCreditOffers();
        clickOnApplyNow();
        sendDataForFirstName();
        sendDataForLastName();
        sendDataForEmailAddress();
        sendDataForMobileNumber();
        clickOnContinueContact();
        clickOnContinueContact();
        sendDataForStreetAddress();
        sendDataForCity();
        sendDataForState();
        sendDataForZipCode();
        clickOnContinueReview();
        sendDataForResidentialStatus();
        sendDataForMonthlyIncome();
        sendDataForAnnualIncome();
        clickOnContinueReview();
        clickOnContinueReview();
    }
}
