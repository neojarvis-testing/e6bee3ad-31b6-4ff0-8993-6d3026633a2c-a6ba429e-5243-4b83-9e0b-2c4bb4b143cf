package pages;


import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotFooterLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomeDepotFooterPageCustomerService {
    public static WebDriverHelper helper;
    public static ExtentTest test;

    public HomeDepotFooterPageCustomerService(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
    public void clickOnCheckOrderStatus(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.CheckOrderStatus, 10);
            helper.clickOnElement(HomeDepotFooterLocator.CheckOrderStatus);
            LoggerHandler.info("Clicked on check order status");
            test.log(Status.INFO, "Clicked on check order status");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on check order status");
            test.log(Status.FAIL, "Not clicked on check order status");
        }
    }
    public void VerifyOrderStatus(){
        try {
            String text = Base.driver.getCurrentUrl();
            Assert.assertTrue(text.contains("/myaccount/guest-order-tracking"));
            LoggerHandler.info("URL contains /myaccount/guest-order-tracking");
            test.log(Status.INFO, "URL contains /myaccount/guest-order-tracking");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /myaccount/guest-order-tracking");
            test.log(Status.FAIL, "URL doesn't contains /myaccount/guest-order-tracking");
        }
    }
    public void clickOnPayYourCreditCard(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.PayYourCreditCard, 10);
            helper.clickOnElement(HomeDepotFooterLocator.PayYourCreditCard);
            LoggerHandler.info("Clicked on Pay your credit card");
            test.log(Status.INFO, "Clicked on Pay your credit card");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Pay your credit card");
            test.log(Status.FAIL, "Not Clicked on Pay your credit card");
        }
    }
    public void VerifyCreditCenter(){
        try {
            String text = Base.driver.getCurrentUrl();
            Assert.assertTrue(text.contains("/c/credit-center"));
            LoggerHandler.info("URL contains /c/credit-center");
            test.log(Status.INFO, "URL contains /c/credit-center");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/credit-center");
            test.log(Status.FAIL, "URL doesn't contains /c/credit-center");
        }
    }
    public void clickOnOrderCancellation(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.OrderCancellation, 10);
            helper.clickOnElement(HomeDepotFooterLocator.OrderCancellation);
            LoggerHandler.info("Clicked on Order Cancellation");
            test.log(Status.INFO, "Clicked on Order Cancellation");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Order Cancellation");
            test.log(Status.FAIL, "Not Clicked on Order Cancellation");
        }
    }
    public void VerifyCustomerCenter(){
        try {
            String text = Base.driver.getCurrentUrl();
            Assert.assertTrue(text.contains("/c/Customer_Support_Answers#cancel"));
            LoggerHandler.info("URL contains /c/Customer_Support_Answers#cancel");
            test.log(Status.INFO, "URL contains /c/Customer_Support_Answers#cancel");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/Customer_Support_Answers#cancel");
            test.log(Status.FAIL, "URL doesn't contains /c/Customer_Support_Answers#cancel");
        }
    }
    public void clickOnReturnPolicy(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.ReturnPolicy, 10);
            helper.clickOnElement(HomeDepotFooterLocator.ReturnPolicy);
            LoggerHandler.info("Clicked on Return Policy");
            test.log(Status.INFO, "Clicked on Return Policy");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Return Policy");
            test.log(Status.FAIL, "Not Clicked on Return Policy");
        }
    }
    public void VerifyReturnPolicy(){
        try {
            String text = Base.driver.getCurrentUrl();
            Assert.assertTrue(text.contains("/c/Return_Policy"));
            LoggerHandler.info("URL contains /c/Return_Policy");
            test.log(Status.INFO, "URL contains /c/Return_Policy");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/Return_Policy");
            test.log(Status.FAIL, "URL doesn't contains /c/Return_Policy");
        }
    }
    public void clickOnRefundPolicy(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.RefundPolicy, 10);
            helper.clickOnElement(HomeDepotFooterLocator.RefundPolicy);
            LoggerHandler.info("Clicked on Refund Policy");
            test.log(Status.INFO, "Clicked on Refund Policy");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Refund Policy");
            test.log(Status.FAIL, "Not Clicked on Refund Policy");
        }
    }
    public void VerifyRefundPolicy(){
        try {
            String text = Base.driver.getCurrentUrl();
            Assert.assertTrue(text.contains("/c/refund-policy"));
            LoggerHandler.info("URL contains /c/refund-policy");
            test.log(Status.INFO, "URL contains /c/refund-policy");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/refund-policy");
            test.log(Status.FAIL, "URL doesn't contains /c/refund-policy");
        }
    }
    public void clickOnShippingandDelivery(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.ShippingDelivery, 10);
            helper.clickOnElement(HomeDepotFooterLocator.ShippingDelivery);
            LoggerHandler.info("Clicked on Shipping & Delivery");
            test.log(Status.INFO, "Clicked on Shipping & Delivery");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Shipping & Delivery");
            test.log(Status.FAIL, "Not clicked on Shipping & Delivery");
        }
    }
    public void VerifyOnlineOrder(){
        try {
            String text = Base.driver.getCurrentUrl();
            Assert.assertTrue(text.contains("/c/About_Your_Online_Order"));
            LoggerHandler.info("URL contains /c/About_Your_Online_Order");
            test.log(Status.INFO, "URL contains /c/About_Your_Online_Order");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/About_Your_Online_Order");
            test.log(Status.FAIL, "URL doesn't contains /c/About_Your_Online_Order");
        }
    }
    public void clickOnProductRecalls(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.ProductRecalls, 10);
            helper.clickOnElement(HomeDepotFooterLocator.ProductRecalls);
            LoggerHandler.info("Clicked on Product Recalls");
            test.log(Status.INFO, "Clicked on Product Recalls");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Product Recalls");
            test.log(Status.FAIL, "Not clicked on Product Recalls");
        }
    }
    public void VerifyProductRecalls(){
        try {
            String text = Base.driver.getCurrentUrl();
            Assert.assertTrue(text.contains("/c/Product_Recalls"));
            LoggerHandler.info("URL contains /c/Product_Recalls");
            test.log(Status.INFO, "URL contains /c/Product_Recalls");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains /c/Product_Recalls");
            test.log(Status.FAIL, "URL doesn't contains /c/Product_Recalls");
        }
    }
    public void clickOnMyPreferenceCenter(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.MyPreferenceCenter, 10);
            helper.clickOnElement(HomeDepotFooterLocator.MyPreferenceCenter);
            LoggerHandler.info("Clicked on My Preference center");
            test.log(Status.INFO, "Clicked on My Preference center");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on My Preference center");
            test.log(Status.FAIL, "Not clicked on My Preference center");
        }
    }
    public void VerifyMyPreferenceCenter(){
        try {
            String text = Base.driver.getCurrentUrl();
            Assert.assertTrue(text.contains("privacy/MyPreferenceCenter"));
            LoggerHandler.info("URL contains privacy/MyPreferenceCenter");
            test.log(Status.INFO, "URL contains privacy/MyPreferenceCenter");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains privacy/MyPreferenceCenter");
            test.log(Status.FAIL, "URL doesn't contains privacy/MyPreferenceCenter");
        }
    }
    public void clickOnPrivacyAndSecurityCenter(){
        try {
            helper.scrollToEnd();
            helper.waitForElementToBeVisible(HomeDepotFooterLocator.PrivacySecurityCentre, 10);
            helper.clickOnElement(HomeDepotFooterLocator.PrivacySecurityCentre);
            LoggerHandler.info("Clicked on Privacy Security Center");
            test.log(Status.INFO, "Clicked on Privacy Security Center");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked on Privacy Security Center");
            test.log(Status.FAIL, "Not clicked on Privacy Security Center");
        }
    }
    public void VerifyPrivacyOverview(){
        try {
            String text = Base.driver.getCurrentUrl();
            Assert.assertTrue(text.contains("privacy/overview"));
            LoggerHandler.info("URL contains privacy/overview");
            test.log(Status.INFO, "URL contains privacy/overview");
        } catch (Exception e) {
            LoggerHandler.error("URL doesn't contains privacy/overview");
            test.log(Status.FAIL, "URL doesn't contains privacy/overview");
        }
    }
    public void CustomerService(){
        clickOnCheckOrderStatus();
        VerifyOrderStatus();
        clickOnPayYourCreditCard();
        VerifyCreditCenter();
        clickOnOrderCancellation();
        VerifyCustomerCenter();
        clickOnReturnPolicy();
        VerifyReturnPolicy();
        clickOnRefundPolicy();
        VerifyRefundPolicy();
        clickOnShippingandDelivery();
        VerifyOnlineOrder();
        clickOnProductRecalls();
        VerifyProductRecalls();
        clickOnMyPreferenceCenter();
        VerifyMyPreferenceCenter();
        clickOnPrivacyAndSecurityCenter();
        VerifyPrivacyOverview();
    }
}
