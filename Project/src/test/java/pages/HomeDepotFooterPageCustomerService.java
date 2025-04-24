package pages;


import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotFooterLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotFooterPageCustomerService {
    WebDriverHelper helper;
    ExtentTest test;

    public HomeDepotFooterPageCustomerService(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
    /* a. Method Name: clickOnCheckOrderStatus
     * b. Author Name: Kushal
     * c. Description: Clicks on Check Order Status in the footer section
     * d. Return Type: void
     * e. Parameters:  none
     */
    public void clickOnCheckOrderStatus(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.checkOrderStatus, 10);
            helper.clickOnElement(HomeDepotFooterLocator.checkOrderStatus);
            LoggerHandler.info("Clicked on check order status");
            test.log(Status.PASS, "Clicked on check order status");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on check order status");
            test.log(Status.FAIL, "Not clicked on check order status");
        }
    }
    /* a. Method Name: verifyOrderStatus
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Check Order Status.
     * d. Return Type: void
     * e. Parameters:  none
     */
    public void verifyOrderStatus(){
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 0, 1);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /myaccount/guest-order-tracking");
            test.log(Status.PASS, "URL contains /myaccount/guest-order-tracking");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /myaccount/guest-order-tracking");
            test.log(Status.FAIL, "URL doesn't contains /myaccount/guest-order-tracking");
        }
    }
    /* a. Method Name: clickOnPayYourCreditCard
     * b. Author Name: Kushal
     * c. Description: Clicks on Pay Your Credit Card in the footer section
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnPayYourCreditCard(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.payYourCreditCard, 10);
            helper.clickOnElement(HomeDepotFooterLocator.payYourCreditCard);
            LoggerHandler.info("Clicked on Pay your credit card");
            test.log(Status.PASS, "Clicked on Pay your credit card");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Pay your credit card");
            test.log(Status.FAIL, "Not Clicked on Pay your credit card");
        }
    }
    /* a. Method Name: verifyCreditCenter
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Pay Your Credit Card.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyCreditCenter(){
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 1, 1);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/credit-center");
            test.log(Status.PASS, "URL contains /c/credit-center");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/credit-center");
            test.log(Status.FAIL, "URL doesn't contains /c/credit-center");
        }
    }
    /* a. Method Name: clickOnOrderCancellation
     * b. Author Name: Kushal
     * c. Description: Clicks on Order Cancellation in the footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnOrderCancellation(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.orderCancellation, 10);
            helper.clickOnElement(HomeDepotFooterLocator.orderCancellation);
            LoggerHandler.info("Clicked on Order Cancellation");
            test.log(Status.PASS, "Clicked on Order Cancellation");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Order Cancellation");
            test.log(Status.FAIL, "Not Clicked on Order Cancellation");
        }
    }
    /* a. Method Name: verifyCustomerCenter
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Order Cancellation.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyCustomerCenter(){
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 2, 1);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/Customer_Support_Answers#cancel");
            test.log(Status.PASS, "URL contains /c/Customer_Support_Answers#cancel");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/Customer_Support_Answers#cancel");
            test.log(Status.FAIL, "URL doesn't contains /c/Customer_Support_Answers#cancel");
        }
    }
    /* a. Method Name: clickOnReturnPolicy
     * b. Author Name: Kushal
     * c. Description: Clicks on Return Policy in the footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnReturnPolicy(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.returnPolicy, 10);
            helper.clickOnElement(HomeDepotFooterLocator.returnPolicy);
            LoggerHandler.info("Clicked on Return Policy");
            test.log(Status.PASS, "Clicked on Return Policy");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Return Policy");
            test.log(Status.FAIL, "Not Clicked on Return Policy");
        }
    }
    /* a. Method Name: verifyReturnPolicy.
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Return Policy.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyReturnPolicy(){
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 3, 1);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/Return_Policy");
            test.log(Status.PASS, "URL contains /c/Return_Policy");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/Return_Policy");
            test.log(Status.FAIL, "URL doesn't contains /c/Return_Policy");
        }
    }
    /* a. Method Name: clickOnRefundPolicy. 
     * b. Author Name: Kushal
     * c. Description: Clicks on Refund Policy in the footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnRefundPolicy(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.refundPolicy, 10);
            helper.clickOnElement(HomeDepotFooterLocator.refundPolicy);
            LoggerHandler.info("Clicked on Refund Policy");
            test.log(Status.PASS, "Clicked on Refund Policy");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Refund Policy");
            test.log(Status.FAIL, "Not Clicked on Refund Policy");
        }
    }
    /* a. Method Name: verifyRefundPolicy.
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Refund Policy.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyRefundPolicy(){
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 4, 1);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/refund-policy");
            test.log(Status.PASS, "URL contains /c/refund-policy");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/refund-policy");
            test.log(Status.FAIL, "URL doesn't contains /c/refund-policy");
        }
    }
    /* a. Method Name: clickOnShippingAndDelivery. 
     * b. Author Name: Kushal
     * c. Description: Clicks on Shipping & Delivery in the footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnShippingAndDelivery(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.shippingDelivery, 10);
            helper.clickOnElement(HomeDepotFooterLocator.shippingDelivery);
            LoggerHandler.info("Clicked on Shipping & Delivery");
            test.log(Status.PASS, "Clicked on Shipping & Delivery");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Shipping & Delivery");
            test.log(Status.FAIL, "Not clicked on Shipping & Delivery");
        }
    }
    /* a. Method Name: verifyOnlineOrder.
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Shipping & Delivery.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyOnlineOrder(){
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 5, 1);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/About_Your_Online_Order");
            test.log(Status.PASS, "URL contains /c/About_Your_Online_Order");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/About_Your_Online_Order");
            test.log(Status.FAIL, "URL doesn't contains /c/About_Your_Online_Order");
        }
    }
    /* a. Method Name: clickOnProductRecalls. 
     * b. Author Name: Kushal
     * c. Description: Clicks on Product Recalls in the footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnProductRecalls(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.productRecalls, 10);
            helper.clickOnElement(HomeDepotFooterLocator.productRecalls);
            LoggerHandler.info("Clicked on Product Recalls");
            test.log(Status.PASS, "Clicked on Product Recalls");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Product Recalls");
            test.log(Status.FAIL, "Not clicked on Product Recalls");
        }
    }
    /* a. Method Name: verifyProductRecalls.
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Product Recalls.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyProductRecalls(){
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 6, 1);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains /c/Product_Recalls");
            test.log(Status.PASS, "URL contains /c/Product_Recalls");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/Product_Recalls");
            test.log(Status.FAIL, "URL doesn't contains /c/Product_Recalls");
        }
    }
    /* a. Method Name: clickOnMyPreferenceCenter. 
     * b. Author Name: Kushal
     * c. Description: Clicks on Preference Center in the footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnMyPreferenceCenter(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.myPreferenceCenter, 10);
            helper.clickOnElement(HomeDepotFooterLocator.myPreferenceCenter);
            LoggerHandler.info("Clicked on My Preference center");
            test.log(Status.PASS, "Clicked on My Preference center");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on My Preference center");
            test.log(Status.FAIL, "Not clicked on My Preference center");
        }
    }
    /* a. Method Name: verifyMyPreferenceCenter.
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the My Preference Center.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyMyPreferenceCenter(){
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 7, 1);
            Assert.assertTrue(text.contains(expected));
            LoggerHandler.info("URL contains privacy/MyPreferenceCenter");
            test.log(Status.PASS, "URL contains privacy/MyPreferenceCenter");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains privacy/MyPreferenceCenter");
            test.log(Status.FAIL, "URL doesn't contains privacy/MyPreferenceCenter");
        }
    }
    /* a. Method Name: clickOnPrivacyAndSecurityCenter. 
     * b. Author Name: Kushal
     * c. Description: Clicks on Preference Center in the footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnPrivacyAndSecurityCenter(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.privacySecurityCentre, 10);
            helper.clickOnElement(HomeDepotFooterLocator.privacySecurityCentre);
            LoggerHandler.info("Clicked on Privacy Security Center");
            test.log(Status.PASS, "Clicked on Privacy Security Center");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Privacy Security Center");
            test.log(Status.FAIL, "Not clicked on Privacy Security Center");
        }
    }
    /* a. Method Name: verifyPrivacyOverview.
     * b. Author Name: Kushal
     * c. Description: Verifies the URL after clicking on the Privacy And Security Center.
     * d. Return Type: void
     * e. Parameters:  none
     */
    public void verifyPrivacyOverview(){
        try {
            String text = helper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Kushal.xlsx", "Sheet1", 8, 1);
            Assert.assertTrue(text.contains(expected));
            Screenshot.captureScreenShot("Customer Services");
            Reporter.attachScreenshotToReport("Customer Services", test, "Attach");
            LoggerHandler.info("URL contains privacy/overview");
            test.log(Status.PASS, "URL contains privacy/overview");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains privacy/overview");
            test.log(Status.FAIL, "URL doesn't contains privacy/overview");
        }
    }
    public void customerServiceTestCase(){
        clickOnCheckOrderStatus();
        verifyOrderStatus();
        clickOnPayYourCreditCard();
        verifyCreditCenter();
        clickOnOrderCancellation();
        verifyCustomerCenter();
        clickOnReturnPolicy();
        verifyReturnPolicy();
        clickOnRefundPolicy();
        verifyRefundPolicy();
        clickOnShippingAndDelivery();
        verifyOnlineOrder();
        clickOnProductRecalls();
        verifyProductRecalls();
        clickOnMyPreferenceCenter();
        verifyMyPreferenceCenter();
        clickOnPrivacyAndSecurityCenter();
        verifyPrivacyOverview();
    }
}
