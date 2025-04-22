package pages;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.HomeDepotFooterLinksLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotFooterLinksPage {
    ExtentTest test;
    WebDriverHelper webDriverHelper;
    public HomeDepotFooterLinksPage(ExtentTest test){
        this.test=test;
        webDriverHelper =new WebDriverHelper(Base.driver);
    }
    public void clickOnStoreLocator(){
        try{
            webDriverHelper.scrollToEnd();
            webDriverHelper.waitForElementToBeVisible(HomeDepotFooterLinksLocator.storeLocator,3);
            webDriverHelper.clickOnElement(HomeDepotFooterLinksLocator.storeLocator);
            test.log(Status.PASS, "Click on Store Locator");
            LoggerHandler.info("Click on Store Locator");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot Click on Store Locator");
            LoggerHandler.error("Cannot Click on Store Locator");
        }
    }
    public void verifyStoreLocator(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotFooterLinksLocator.verifyTitle,3);
            String text=webDriverHelper.getText(HomeDepotFooterLinksLocator.verifyTitle);
            Assert.assertTrue(text.contains("Store Locator"));
            test.log(Status.PASS, "verify store locator");
            LoggerHandler.info("verify store locator");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Store Locator");
            LoggerHandler.error("Cannot Verify on Store Locator");
        }
    }
    public void navigateBackToHome(){
        try{
            webDriverHelper.navigateBack();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void clickOnPrivacy(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotFooterLinksLocator.privacySecurity,3);
            webDriverHelper.clickOnElement(HomeDepotFooterLinksLocator.privacySecurity);
            test.log(Status.PASS, "Click on Privacy");
            LoggerHandler.info("Click on Privacy");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on Privacy");
            LoggerHandler.error("Cannot click on Privacy");
        }
    }
    public void verifyPrivacy(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotFooterLinksLocator.verifyPrivacy,3);
            String text=webDriverHelper.getText(HomeDepotFooterLinksLocator.verifyPrivacy);
            Assert.assertTrue(text.contains("Privacy & Security Center"));
            test.log(Status.PASS, "verify Privacy & Security Center");
            LoggerHandler.info("verify Privacy & Security Center");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify Privacy & Security Center");
            LoggerHandler.error("Cannot Verify Privacy & Security Center");
        }
    }
    public void clickOnTerm(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotFooterLinksLocator.terms,3);
            webDriverHelper.clickOnElement(HomeDepotFooterLinksLocator.terms);
            test.log(Status.PASS, "click on terms");
            LoggerHandler.info("click on terms");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on terms");
            LoggerHandler.error("Cannot click on terms");
        }
    }
    public void verifyTerms(){
        try{
            String text=webDriverHelper.getUrl();
            Assert.assertTrue(text.contains("https://www.homedepot.com/c/Terms_of_Use"));
            test.log(Status.PASS, "verify terms");
            LoggerHandler.info("verify terms");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot verify terms");
            LoggerHandler.error("Cannot verify terms");
        }
    }
    public void clickOnPreference(){
        try{
            webDriverHelper.scrollToEnd();
            webDriverHelper.waitForElementToBeVisible(HomeDepotFooterLinksLocator.myPreference,3);
            webDriverHelper.clickOnElement(HomeDepotFooterLinksLocator.myPreference);
            test.log(Status.PASS, "click on preference");
            LoggerHandler.info("click on preference");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on preference");
            LoggerHandler.error("Cannot click on preference");
        }
    }
    public void verifyPreference(){
        try{
            String text=webDriverHelper.getUrl();
            Assert.assertTrue(text.contains("https://www.homedepot.com/privacy/MyPreferenceCenter"));
            test.log(Status.PASS, "verify preference");
            LoggerHandler.info("verify preference");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot verify preference");
            LoggerHandler.error("Cannot verify preference");
        }
    }
    public void clickOnSiteMap(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotFooterLinksLocator.sitemap,3);
            webDriverHelper.clickOnElement(HomeDepotFooterLinksLocator.sitemap);
            test.log(Status.PASS, "click on sitemap");
            LoggerHandler.info("click on sitemap");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on sitemap");
            LoggerHandler.error("Cannot click on sitemap");
        }
    }
    public void verifySiteMap(){
        try{
            String text=webDriverHelper.getUrl();
            Assert.assertTrue(text.contains("https://www.homedepot.com/c/site_map"));
            test.log(Status.PASS, "verify sitemap");
            LoggerHandler.info("verify sitemap");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot verify sitemap");
            LoggerHandler.error("Cannot verify sitemap");
        }
    }
    public void clickOnStoreDirectory(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotFooterLinksLocator.storeDirectory,3);
            webDriverHelper.clickOnElement(HomeDepotFooterLinksLocator.storeDirectory);
            test.log(Status.PASS, "click on StoreDirectory");
            LoggerHandler.info("click on StoreDirectory");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on StoreDirectory");
            LoggerHandler.error("Cannot click on StoreDirectory");
        }
    }
    public void verifyStoreDirectory(){
        try{
            String text=webDriverHelper.getUrl();
            Assert.assertTrue(text.contains("https://www.homedepot.com/l/storeDirectory"));
            test.log(Status.PASS, "verify StoreDirectory");
            LoggerHandler.info("verify StoreDirectory");
            Screenshot.captureScreenShot("store_directory");
            Reporter.attachScreenshotToReport( "store_directory", test,  "store_directory");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot verify StoreDirectory");
            LoggerHandler.error("Cannot verify StoreDirectory");
        }
    }
    public void footerLinks(){
        clickOnStoreLocator();
        verifyStoreLocator();
        navigateBackToHome();
        clickOnPrivacy();
        verifyPrivacy();
        navigateBackToHome();
        clickOnTerm();
        verifyTerms();
        navigateBackToHome();
        clickOnPreference();
        verifyPreference();
        navigateBackToHome();
        clickOnSiteMap();
        verifySiteMap();
        navigateBackToHome();
        clickOnStoreDirectory();
        verifyStoreDirectory();
    }
}
