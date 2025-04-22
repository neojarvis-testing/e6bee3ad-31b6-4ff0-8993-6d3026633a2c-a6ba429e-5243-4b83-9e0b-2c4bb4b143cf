package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotDIYWorkShopPageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomeDepotDIYWorkShopPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public HomeDepotDIYWorkShopPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test= test;
    }

    public void clickOnDIY(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickDIYIcon, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickDIYIcon);
            LoggerHandler.info("Clicked on DIY Icon");
            test.log(Status.PASS,"Clicked on DIY Icon");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on DIY Icon");
            test.log(Status.FAIL,"Not able to click on DIY Icon");
        }
    }

    public void clickOnFreeWorkShops(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickFreeWorkShops, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickFreeWorkShops);
            LoggerHandler.info("Clicked on 'Free WorkShops'");
            test.log(Status.PASS,"Clicked on 'Free WorkShops'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Free WorkShops'");
            test.log(Status.FAIL,"Not able to click on 'Free WorkShops'");
        }
    }

    public void verifyFreeWorkShopsText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.verifyFreeWorkShops,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.verifyFreeWorkShops);
            String expected  = "Free Workshops";
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'Free Workshops'");
            test.log(Status.PASS, "Verified the Text 'Free Workshops'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'Free Workshops'");
            test.log(Status.FAIL, "Unable to verify the Text 'Free Workshops'");
        }
    }

    public void clickOnKidsWorkShops(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickKidsWorkShops, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickKidsWorkShops);
            LoggerHandler.info("Clicked on 'Kids Workshops'");
            test.log(Status.PASS,"Clicked on 'Kids Workshops'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Kids Workshops'");
            test.log(Status.FAIL,"Not able to click on 'Kids Workshops'");
        }
    }

    public void verifyKidsWorkShopsText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.verifyKidsWorkShops,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.verifyKidsWorkShops);
            String expected  = "Kids Workshops";
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'Kids Workshops'");
            test.log(Status.PASS, "Verified the Text 'Kids Workshops'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'Kids Workshops'");
            test.log(Status.FAIL, "Unable to verify the Text 'Kids Workshops'");
        }
    }

    public void clickOnLearnMore(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickLearnMore, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickLearnMore);
            LoggerHandler.info("Clicked on 'Learn More'");
            test.log(Status.PASS,"Clicked on 'Learn More'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Learn More'");
            test.log(Status.FAIL,"Not able to click on 'Learn More'");
        }
    }

    public void verifyThePageTitle(){
        try {
            String actual = Base.driver.getTitle();
            String expected  = "Free DIY Workshops & Classes";
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Page Title'Free DIY Workshops & Classes'");
            test.log(Status.PASS, "Verified the Page Title 'Free DIY Workshops & Classes'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Page Title 'Free DIY Workshops & Classes'");
            test.log(Status.FAIL, "Unable to verify the Page Title 'Free DIY Workshops & Classes'");
        }
    }

    public void clickOnRegisterNow(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickRegisterNow, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickRegisterNow);
            LoggerHandler.info("Clicked on 'Register Now'");
            test.log(Status.PASS,"Clicked on 'Register Now'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Register Now'");
            test.log(Status.FAIL,"Not able to click on 'Register Now'");
        }
    }

    public void verifyParentFirstNameText(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.verifyParentFirstName,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.verifyParentFirstName);
            String expected  = "Parent / Guardian First Name";
            Assert.assertTrue(actual.contains(expected));
            LoggerHandler.info("Verified the Text'Parent / Guardian First Name'");
            test.log(Status.PASS, "Verified the Text 'Parent / Guardian First Name'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'Parent / Guardian First Name'");
            test.log(Status.FAIL, "Unable to verify the Text 'Parent / Guardian First Name'");
        }
    }

    public void clickOnFirstName(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickFirstName, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickFirstName);
            LoggerHandler.info("Clicked on 'Parent / Guardian First Name'");
            test.log(Status.PASS,"Clicked on 'Parent / Guardian First Name'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Parent / Guardian First Name'");
            test.log(Status.FAIL,"Not able to click on 'Parent / Guardian First Name'");
        }
    }

    public void enterFirstName(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickFirstName, 10);
            helper.sendData(HomeDepotDIYWorkShopPageLocator.clickFirstName, "alphatest");
            LoggerHandler.info("Send Data on 'Parent / Guardian First Name'");
            test.log(Status.PASS,"Send Data on 'Parent / Guardian First Name'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to send data on 'Parent / Guardian First Name'");
            test.log(Status.FAIL,"Not able to send data on 'Parent / Guardian First Name'");
        }
    }

    public void clickOnLastName(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickLastName, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickLastName);
            LoggerHandler.info("Clicked on 'Parent / Guardian Last Name'");
            test.log(Status.PASS,"Clicked on 'Parent / Guardian Last Name'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Parent / Guardian Last Name'");
            test.log(Status.FAIL,"Not able to click on 'Parent / Guardian Last Name'");
        }
    }

    public void enterLastName(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickLastName, 10);
            helper.sendData(HomeDepotDIYWorkShopPageLocator.clickLastName, "alphatest");
            LoggerHandler.info("Send Data on 'Parent / Guardian Last Name'");
            test.log(Status.PASS,"Send Data on 'Parent / Guardian Last Name'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to send data on 'Parent / Guardian Last Name'");
            test.log(Status.FAIL,"Not able to send data on 'Parent / Guardian Last Name'");
        }
    }

    public void clickEmailArea(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickEmail, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickEmail);
            LoggerHandler.info("Clicked on 'Email'");
            test.log(Status.PASS,"Clicked on 'Email'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Email'");
            test.log(Status.FAIL,"Not able to click on 'Email'");
        }
    }

    public void enterEmail(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickEmail, 10);
            helper.sendData(HomeDepotDIYWorkShopPageLocator.clickEmail, "test@gmail.com");
            LoggerHandler.info("Send Data on 'Email'");
            test.log(Status.PASS,"Send Data on 'Email'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to send data on 'Email'");
            test.log(Status.FAIL,"Not able to send data on 'Email'");
        }
    }

    public void clickOnHearAboutUs(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickHearAboutUs, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickHearAboutUs);
            LoggerHandler.info("Clicked on 'Hear About Us'");
            test.log(Status.PASS,"Clicked on 'Hear About Us'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Hear About Us'");
            test.log(Status.FAIL,"Not able to click on 'Hear About Us'");
        }
    }

    public void clickOnFriendsAndFamily(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickFriend, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickFriend);
            LoggerHandler.info("Clicked on 'Friend / Family Member'");
            test.log(Status.PASS,"Clicked on 'Friend / Family Member'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Friend / Family Member'");
            test.log(Status.FAIL,"Not able to click on 'Friend / Family Member'");
        }
    }

    public void clickOnRegisterSubmitButton(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.register, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.register);
            LoggerHandler.info("Clicked on 'Register'");
            test.log(Status.PASS,"Clicked on 'Register'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Register'");
            test.log(Status.FAIL,"Not able to click on 'Register'");
        }
    }

    public void clickOnCloseButton(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickClose, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickClose);
            LoggerHandler.info("Clicked on 'Close'");
            test.log(Status.PASS,"Clicked on 'Close'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'Close'");
            test.log(Status.FAIL,"Not able to click on 'Close'");
        }
    }

    public void clickOnTheDemands(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickOnDemand, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickOnDemand);
            LoggerHandler.info("Clicked on 'On-Demand Workshops'");
            test.log(Status.PASS,"Clicked on 'On-Demand Workshops'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'On-Demand Workshops'");
            test.log(Status.FAIL,"Not able to click on 'On-Demand Workshops'");
        }
    }

    public void clickOnResources(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.clickResources, 10);
            helper.clickOnElement(HomeDepotDIYWorkShopPageLocator.clickResources);
            LoggerHandler.info("Clicked on 'RESOURCES'");
            test.log(Status.PASS,"Clicked on 'RESOURCES'");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on 'RESOURCES'");
            test.log(Status.FAIL,"Not able to click on 'RESOURCES'");
        }

    }

    public void verifyTheResources(){
        try {
            helper.waitForElementToBeVisible(HomeDepotDIYWorkShopPageLocator.verifyResources,10);
            String actual = helper.getText(HomeDepotDIYWorkShopPageLocator.verifyResources);
            String expected  = "RESOURCES";
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified the Text'RESOURCES'");
            test.log(Status.PASS, "Verified the Text 'RESOURCES'");
        } catch (Exception e) {
            LoggerHandler.error("Unable to verify the Text 'RESOURCES'");
            test.log(Status.FAIL, "Unable to verify the Text 'RESOURCES'");
        }
    }



    public void testCase4(){
        clickOnDIY();
        clickOnFreeWorkShops();
        verifyFreeWorkShopsText();
        clickOnKidsWorkShops();
        verifyKidsWorkShopsText();
        clickOnLearnMore();
        verifyThePageTitle();
        clickOnRegisterNow();
        // verifyParentFirstNameText();
        // clickOnFirstName();
        // enterFirstName();
        // clickOnLastName();
        // enterLastName();
        // clickEmailArea();
        // enterEmail();
        // clickOnHearAboutUs();
        // clickOnFriendsAndFamily();
        // clickOnCloseButton();
        // clickOnTheDemands();
        // clickOnResources();
        // verifyTheResources();


    }
}
