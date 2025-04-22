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
     * e. Parameters: None
     */
    public void clickOnDIYIcon(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickDIYIcon, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickDIYIcon);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.clickDIYIcon);
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
     * c. Description: Clicks on the 'Free Workshops' section.
     * d. Return Type: void
     * e. Parameters: None
     */
    public void clickOnFreeWorkShops(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickFreeWorkShops, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickFreeWorkShops);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.clickFreeWorkShops);
            String expected = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 1, 0);
            Assert.assertTrue(actual.contains(expected));
            LoggerHandler.info("Clicked on 'Free WorkShops'");
            test.log(Status.PASS,"Clicked on 'Free WorkShops'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Free WorkShops'");
            test.log(Status.FAIL,"Not able to click on 'Free WorkShops'");
        }
    }

    /*
     * a. Method Name: verifyFreeWorkShopsText
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the presence of the 'Free Workshops' text.
     * d. Return Type: void
     * e. Parameters: None
     */
    public void verifyFreeWorkShopsText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.verifyFreeWorkShops,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.verifyFreeWorkShops);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 1, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'Free Workshops'");
            test.log(Status.PASS, "Verified the Text 'Free Workshops'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'Free Workshops'");
            test.log(Status.FAIL, "Unable to verify the Text 'Free Workshops'");
        }
    }

    /*
     * a. Method Name: clickOnKidsWorkShops
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the 'Kids Workshops' section.
     * d. Return Type: void
     * e. Parameters: None
     */
    public void clickOnKidsWorkShops(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickKidsWorkShops, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickKidsWorkShops);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.clickKidsWorkShops);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 2, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on 'Kids Workshops'");
            test.log(Status.PASS,"Clicked on 'Kids Workshops'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Kids Workshops'");
            test.log(Status.FAIL,"Not able to click on 'Kids Workshops'");
        }
    }

    /*
     * a. Method Name: verifyKidsWorkShopsText
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the presence of the 'Kids Workshops' text.
     * d. Return Type: void
     * e. Parameters: None
     */
    public void verifyKidsWorkShopsText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.verifyKidsWorkShops,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.verifyKidsWorkShops);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 2, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'Kids Workshops'");
            test.log(Status.PASS, "Verified the Text 'Kids Workshops'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'Kids Workshops'");
            test.log(Status.FAIL, "Unable to verify the Text 'Kids Workshops'");
        }
    }

    /*
     * a. Method Name: clickOnLearnMore
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the 'Learn More' link.
     * d. Return Type: void
     * e. Parameters: None
     */
    public void clickOnLearnMore(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickLearnMore, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickLearnMore);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.clickLearnMore);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 3, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on 'Learn More'");
            test.log(Status.PASS,"Clicked on 'Learn More'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Learn More'");
            test.log(Status.FAIL,"Not able to click on 'Learn More'");
        }
    }

    /*
     * a. Method Name: verifyThePageTitle
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Verifies the page title to ensure correct navigation.
     * d. Return Type: void
     * e. Parameters: None
     */
    public void verifyThePageTitle(){
        try {
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.titlePage);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 6, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Page Title'Free DIY Workshops & Classes'");
            test.log(Status.PASS, "Verified the Page Title 'Free DIY Workshops & Classes'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Page Title 'Free DIY Workshops & Classes'");
            test.log(Status.FAIL, "Unable to verify the Page Title 'Free DIY Workshops & Classes'");
        }
    }

    /*
     * a. Method Name: clickOnRegisterNow
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Clicks on the 'Register Now' button.
     * d. Return Type: void
     * e. Parameters: None
     */
    public void clickOnRegisterNow(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickRegisterNow, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickRegisterNow);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.clickRegisterNow);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 4, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on 'Register Now'");
            test.log(Status.PASS,"Clicked on 'Register Now'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Register Now'");
            test.log(Status.FAIL,"Not able to click on 'Register Now'");
        }
    }

    /*
    * a. Method Name: verifyParentNameText
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Verifies the presence of the 'Parent / Guardian First Name' text from test data.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void verifyParentNameText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.verifyParentName,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.verifyParentName);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 7, 0);
            Assert.assertTrue(actual.contains(expected));
            LoggerHandler.info("Verified the Text'Parent / Guardian First Name'");
            test.log(Status.PASS, "Verified the Text 'Parent / Guardian First Name'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'Parent / Guardian First Name'");
            test.log(Status.FAIL, "Unable to verify the Text 'Parent / Guardian First Name'");
        }
    }

    /*
    * a. Method Name: clickOnFirstName
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the 'Parent / Guardian First Name' input field and verifies it.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnFirstName(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickFirstName, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickFirstName);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.clickFirstName);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 8, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on 'Parent / Guardian First Name'");
            test.log(Status.PASS,"Clicked on 'Parent / Guardian First Name'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Parent / Guardian First Name'");
            test.log(Status.FAIL,"Not able to click on 'Parent / Guardian First Name'");
        }
    }

    /*
    * a. Method Name: enterFirstName
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Enters the 'Parent / Guardian First Name' retrieved from test data.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void enterFirstName(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickFirstName, 10);
            helper.sendData(HomeDepotDIYWorkShopPageLocator.clickFirstName, ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 9, 0));
            LoggerHandler.info("Send Data on 'Parent / Guardian First Name'");
            test.log(Status.PASS,"Send Data on 'Parent / Guardian First Name'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to send data on 'Parent / Guardian First Name'");
            test.log(Status.FAIL,"Not able to send data on 'Parent / Guardian First Name'");
        }
    }


    /*
    * a. Method Name: clickEmailArea
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the 'Email' input field and verifies the expected value.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickEmailArea(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickEmail, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickEmail);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.clickEmail);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 10, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on 'Email'");
            test.log(Status.PASS,"Clicked on 'Email'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Email'");
            test.log(Status.FAIL,"Not able to click on 'Email'");
        }
    }

    /*
    * a. Method Name: enterEmail
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Enters the email address retrieved from test data.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void enterEmail(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickEmail, 10);
            helper.sendData(HomeDepotDIYWorkShopPageLocator.clickEmail, ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 11, 0));
            LoggerHandler.info("Send Data on 'Email'");
            test.log(Status.PASS,"Send Data on 'Email'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to send data on 'Email'");
            test.log(Status.FAIL,"Not able to send data on 'Email'");
        }
    }

    /*
    * a. Method Name: clickOnHearAboutUs
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the 'Hear About Us' dropdown and verifies the expected value.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnHearAboutUs(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickHearAboutUs, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickHearAboutUs);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.clickHearAboutUs);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 12, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on 'Hear About Us'");
            test.log(Status.PASS,"Clicked on 'Hear About Us'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Hear About Us'");
            test.log(Status.FAIL,"Not able to click on 'Hear About Us'");
        }
    }

    /*
    * a. Method Name: clickOnFriendsAndFamily
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the 'Friend / Family Member' option from the dropdown.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnFriendsAndFamily(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickFriend, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickFriend);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.clickFriend);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 13, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on 'Friend / Family Member'");
            test.log(Status.PASS,"Clicked on 'Friend / Family Member'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Friend / Family Member'");
            test.log(Status.FAIL,"Not able to click on 'Friend / Family Member'");
        }
    }

    /*
    * a. Method Name: clickOnRegisterSubmitButton
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the 'Register' button and verifies the expected value.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnRegisterSubmitButton(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.register, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.register);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.register);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 14, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on 'Register'");
            test.log(Status.PASS,"Clicked on 'Register'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Register'");
            test.log(Status.FAIL,"Not able to click on 'Register'");
        }
    }

    /*
    * a. Method Name: clickOnTheDemands
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the 'On-Demand Workshops' section and verifies the expected value.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnTheDemands(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickOnDemand, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickOnDemand);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.clickOnDemand);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 15, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on 'On-Demand Workshops'");
            test.log(Status.PASS,"Clicked on 'On-Demand Workshops'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'On-Demand Workshops'");
            test.log(Status.FAIL,"Not able to click on 'On-Demand Workshops'");
        }
    }

    /*
    * a. Method Name: clickOnResources
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Clicks on the 'Resources' section and verifies the expected value.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void clickOnResources(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickResources, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickResources);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.clickResources);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 16, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Clicked on 'RESOURCES'");
            test.log(Status.PASS,"Clicked on 'RESOURCES'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'RESOURCES'");
            test.log(Status.FAIL,"Not able to click on 'RESOURCES'");
        }

    }

    /*
    * a. Method Name: verifyTheResources
    * b. Author Name: Sri Ramya Paladi
    * c. Description: Verifies the presence of the 'Resources' text retrieved from test data.
    * d. Return Type: void
    * e. Parameters: None
    */
    public void verifyTheResources(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.verifyResources,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.verifyResources);
            String expected  = ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ServicesExcel.xlsx", "sheet5", 17, 0);
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'RESOURCES'");
            test.log(Status.PASS, "Verified the Text 'RESOURCES'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'RESOURCES'");
            test.log(Status.FAIL, "Unable to verify the Text 'RESOURCES'");
        }
    }

    public void testDIYWorkshops(){
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
