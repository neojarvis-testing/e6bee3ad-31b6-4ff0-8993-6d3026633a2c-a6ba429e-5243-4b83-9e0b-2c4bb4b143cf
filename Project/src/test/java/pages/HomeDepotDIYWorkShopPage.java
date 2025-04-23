package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotDIYWorkShopPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomeDepotDIYWorkShopPage {
    WebDriverHelper helper;
    ExtentTest test;
    public HomeDepotDIYWorkShopPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test= test;
    }

    /*
     * a. Method Name: clickOnDIYIcon
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the DIY menu icon in the header.
     * d. Return Type: void
     * e. Parameters: n
     */
    public void clickOnDIYIcon(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.diyIcon, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.diyIcon);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.diyIcon);
            String expected = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 0, 0);
            Assert.assertEquals(actual,expected);
            LoggerHandler.info("Clicked on DIY Icon");
            test.log(Status.PASS,"Clicked on DIY Icon");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on DIY Icon");
            test.log(Status.FAIL,"Not able to click on DIY Icon");
        }
    }

    /*
     * a. Method Name: clickOnFreeWorkShops
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the Free Workshops section.
     * d. Return Type: void
     * e. Parameters: n
     */
    public void clickOnFreeWorkShops(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.freeWorkShop, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.freeWorkShop);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.freeWorkShop);
            String expected = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 1, 0);
            Assert.assertTrue(actual.contains(expected));
            LoggerHandler.info("Clicked on Free WorkShops");
            test.log(Status.PASS,"Clicked on Free WorkShops");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Free WorkShops");
            test.log(Status.FAIL,"Not able to click on Free WorkShops");
        }
    }

    /*
     * a. Method Name: verifyFreeWorkShopsText
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the presence of the Free Workshops text.
     * d. Return Type: void
     * e. Parameters: n
     */
    public void verifyFreeWorkShopsText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.freeWorkShops,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.freeWorkShops);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 1, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the TextFree Workshops");
            test.log(Status.PASS, "Verified the Text Free Workshops");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text Free Workshops");
            test.log(Status.FAIL, "Unable to verify the Text Free Workshops");
        }
    }

    /*
     * a. Method Name: clickOnKidsWorkShops
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the Kids Workshops section.
     * d. Return Type: void
     * e. Parameters: n
     */
    public void clickOnKidsWorkShops(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.kidsWorkShop, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.kidsWorkShop);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.kidsWorkShop);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 2, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on Kids Workshops");
            test.log(Status.PASS,"Clicked on Kids Workshops");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Kids Workshops");
            test.log(Status.FAIL,"Not able to click on Kids Workshops");
        }
    }

    /*
     * a. Method Name: verifyKidsWorkShopsText
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the presence of the Kids Workshops text.
     * d. Return Type: void
     * e. Parameters: n
     */
    public void verifyKidsWorkShopsText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.kidsWorkShops,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.kidsWorkShops);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 2, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the TextKids Workshops");
            test.log(Status.PASS, "Verified the Text Kids Workshops");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text Kids Workshops");
            test.log(Status.FAIL, "Unable to verify the Text Kids Workshops");
        }
    }

    /*
     * a. Method Name: clickOnLearnMore
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the Learn More link.
     * d. Return Type: void
     * e. Parameters: n
     */
    public void clickOnLearnMore(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.learnMore, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.learnMore);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.learnMore);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 3, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on Learn More");
            test.log(Status.PASS,"Clicked on Learn More");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Learn More");
            test.log(Status.FAIL,"Not able to click on Learn More");
        }
    }

    /*
     * a. Method Name: verifyThePageTitle
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the page title to ensure correct navigation.
     * d. Return Type: void
     * e. Parameters: n
     */
    public void verifyThePageTitle(){
        try {
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.titlePage);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 6, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Page TitleFree DIY Workshops & Classes");
            test.log(Status.PASS, "Verified the Page Title Free DIY Workshops & Classes");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Page Title Free DIY Workshops & Classes");
            test.log(Status.FAIL, "Unable to verify the Page Title Free DIY Workshops & Classes");
        }
    }

    /*
     * a. Method Name: clickOnRegisterNow
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the Register Now button.
     * d. Return Type: void
     * e. Parameters: n
     */
    public void clickOnRegisterNow(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.registerNow, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.registerNow);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.registerNow);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 4, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on Register Now");
            test.log(Status.PASS,"Clicked on Register Now");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Register Now");
            test.log(Status.FAIL,"Not able to click on Register Now");
        }
    }

    /*
    * a. Method Name: verifyParentNameText
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Verifies the presence of the Parent / Guardian First Name text from test data.
    * d. Return Type: void
    * e. Parameters: n
    */
    public void verifyParentNameText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.parentName,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.parentName);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 7, 0);
            Assert.assertTrue(actual.contains(expected));
            LoggerHandler.info("Verified the TextParent / Guardian First Name");
            test.log(Status.PASS, "Verified the Text Parent / Guardian First Name");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text Parent / Guardian First Name");
            test.log(Status.FAIL, "Unable to verify the Text Parent / Guardian First Name");
        }
    }

    /*
    * a. Method Name: clickOnFirstName
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the Parent / Guardian First Name input field and verifies it.
    * d. Return Type: void
    * e. Parameters: n
    */
    public void clickOnFirstName(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.firstName, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.firstName);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.firstName);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 8, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on Parent / Guardian First Name");
            test.log(Status.PASS,"Clicked on Parent / Guardian First Name");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Parent / Guardian First Name");
            test.log(Status.FAIL,"Not able to click on Parent / Guardian First Name");
        }
    }

    /*
    * a. Method Name: enterFirstName
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Enters the Parent / Guardian First Name retrieved from test data.
    * d. Return Type: void
    * e. Parameters: n
    */
    public void enterFirstName(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.firstName, 10);
            helper.sendData(HomeDepotDIYWorkShopPageLocator.firstName, ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 9, 0));
            LoggerHandler.info("Entered Data on Parent / Guardian First Name");
            test.log(Status.PASS,"Entered Data on Parent / Guardian First Name");
        } catch (Exception e) {
            LoggerHandler.error("Not able to enter data on Parent / Guardian First Name");
            test.log(Status.FAIL,"Not able to enter data on Parent / Guardian First Name");
        }
    }


    /*
    * a. Method Name: clickEmailArea
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the Email input field and verifies the expected value.
    * d. Return Type: void
    * e. Parameters: n
    */
    public void clickEmailArea(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.email, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.email);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.email);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 10, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on Email");
            test.log(Status.PASS,"Clicked on Email");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Email");
            test.log(Status.FAIL,"Not able to click on Email");
        }
    }

    /*
    * a. Method Name: enterEmail
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Enters the email address retrieved from test data.
    * d. Return Type: void
    * e. Parameters: n
    */
    public void enterEmail(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.email, 10);
            helper.sendData(HomeDepotDIYWorkShopPageLocator.email, ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 11, 0));
            LoggerHandler.info("Entered Data on Email");
            test.log(Status.PASS,"Entered Data on Email");
        } catch (Exception e) {
            LoggerHandler.error("Not able to enter data on Email");
            test.log(Status.FAIL,"Not able to enter data on Email");
        }
    }

    /*
    * a. Method Name: clickOnHearAboutUs
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the Hear About Us dropdown and verifies the expected value.
    * d. Return Type: void
    * e. Parameters: n
    */
    public void clickOnHearAboutUs(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.hearAboutUs, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.hearAboutUs);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.hearAboutUs);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 12, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on Hear About Us");
            test.log(Status.PASS,"Clicked on Hear About Us");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Hear About Us");
            test.log(Status.FAIL,"Not able to click on Hear About Us");
        }
    }

    /*
    * a. Method Name: clickOnFriendsAndFamily
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the Friend / Family Member option from the dropdown.
    * d. Return Type: void
    * e. Parameters: n
    */
    public void clickOnFriendsAndFamily(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.friend, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.friend);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.friend);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 13, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on Friend / Family Member");
            test.log(Status.PASS,"Clicked on Friend / Family Member");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Friend / Family Member");
            test.log(Status.FAIL,"Not able to click on Friend / Family Member");
        }
    }

    /*
    * a. Method Name: clickOnRegisterSubmitButton
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the Register button and verifies the expected value.
    * d. Return Type: void
    * e. Parameters: n
    */
    public void clickOnRegisterSubmitButton(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.register, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.register);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.register);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 14, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on Register");
            test.log(Status.PASS,"Clicked on Register");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Register");
            test.log(Status.FAIL,"Not able to click on Register");
        }
    }

    /*
    * a. Method Name: clickOnTheDemands
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the On-Demand Workshops section and verifies the expected value.
    * d. Return Type: void
    * e. Parameters: n
    */
    public void clickOnTheDemands(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.onDemand, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.onDemand);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.onDemand);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 15, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on On-Demand Workshops");
            test.log(Status.PASS,"Clicked on On-Demand Workshops");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on On-Demand Workshops");
            test.log(Status.FAIL,"Not able to click on On-Demand Workshops");
        }
    }

    /*
    * a. Method Name: clickOnResources
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the Resources section and verifies the expected value.
    * d. Return Type: void
    * e. Parameters: n
    */
    public void clickOnResources(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.resource, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.resource);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.resource);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 16, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on RESOURCES");
            test.log(Status.PASS,"Clicked on RESOURCES");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on RESOURCES");
            test.log(Status.FAIL,"Not able to click on RESOURCES");
        }

    }

    /*
    * a. Method Name: verifyTheResources
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Verifies the presence of the Resources text retrieved from test data.
    * d. Return Type: void
    * e. Parameters: none
    */
    public void verifyTheResources(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.resources,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.resources);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 17, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the TextRESOURCES");
            test.log(Status.PASS, "Verified the Text RESOURCES");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text RESOURCES");
            test.log(Status.FAIL, "Unable to verify the Text RESOURCES");
        }
    }

    public void homeDepotDIYWorkShopPageTestCase(){
        clickOnDIYIcon();
        clickOnFreeWorkShops();
        verifyFreeWorkShopsText();
        clickOnKidsWorkShops();
        verifyKidsWorkShopsText();
        clickOnLearnMore();
        //verifyThePageTitle();
        clickOnRegisterNow();
        // verifyParentNameText();
        // clickOnFirstName();
        // enterFirstName();
        // clickEmailArea();
        // enterEmail();
        // clickOnHearAboutUs();
        // clickOnFriendsAndFamily();
        // clickOnTheDemands();
        // clickOnResources();
        // verifyTheResources();
    }
}
