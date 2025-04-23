package pages;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.HomeDepotFooterLinksLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotFooterLinksPage {
    ExtentTest test;
    WebDriverHelper webDriverHelper;
    /*
     * a. Method Name: HomeDepotFooterLinksPage
     * b. Author Name: Jahnavi Dasari
     * c. Description: Constructor for the HomeDepotFooterLinksPage initalize the WebDriverHelper and assign ExtentTest
     * d. Return Type: void
     * e. Parameters: 
     * ExtentTest test- For logging test steps
     */
    public HomeDepotFooterLinksPage(ExtentTest test){
        this.test=test;
        webDriverHelper =new WebDriverHelper(Base.driver);
    }
    /*
     * a. Method Name: clickOnStoreLocator
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on Store Locator link in footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
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
    /*
     * a. Method Name: verifyStoreLocator
     * b. Author Name: Jahnavi Dasari
     * c. Description: Verify on Store Locator title in the page.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyStoreLocator(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotFooterLinksLocator.titleText,3);
            String text=webDriverHelper.getText(HomeDepotFooterLinksLocator.titleText);
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/jahnavi.xlsx", "Sheet1", 0, 1);
            Assert.assertTrue(text.contains(expected));
            test.log(Status.PASS, "verify store locator");
            LoggerHandler.info("verify store locator");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Store Locator");
            LoggerHandler.error("Cannot Verify on Store Locator");
        }
    }
    /*
     * a. Method Name: navigateBackToHome
     * b. Author Name: Jahnavi Dasari
     * c. Description: Navigate back to previous page.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void navigateBackToHome(){
        try{
            webDriverHelper.navigateBack();
            test.log(Status.PASS, "navigate back to the previous page");
            LoggerHandler.info("navigate back to the previous page");
        }
        catch(Exception e){
            test.log(Status.FAIL, "cannot navigate back to the previous page");
            LoggerHandler.error("cannot navigate back to the previous page");
        }
    }
    /*
     * a. Method Name: clickOnPrivacy
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on Privacy link in footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
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
    /*
     * a. Method Name: verifyPrivacy
     * b. Author Name: Jahnavi Dasari
     * c. Description: Verify on Privacy title in the page.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyPrivacy(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotFooterLinksLocator.privacyText,3);
            String text=webDriverHelper.getText(HomeDepotFooterLinksLocator.privacyText);
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/jahnavi.xlsx", "Sheet1", 1, 1);
            Assert.assertTrue(text.contains(expected));
            test.log(Status.PASS, "verify Privacy & Security Center");
            LoggerHandler.info("verify Privacy & Security Center");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify Privacy & Security Center");
            LoggerHandler.error("Cannot Verify Privacy & Security Center");
        }
    }
    /*
     * a. Method Name: clickOnTerm
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on Term link in footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
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
    /*
     * a. Method Name: verifyTerms
     * b. Author Name: Jahnavi Dasari
     * c. Description: Verify on Terms link in the page.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyTerms(){
        try{
            String text=webDriverHelper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/jahnavi.xlsx", "Sheet1", 2, 1);
            Assert.assertTrue(text.contains(expected));
            test.log(Status.PASS, "verify terms");
            LoggerHandler.info("verify terms");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot verify terms");
            LoggerHandler.error("Cannot verify terms");
        }
    }
    /*
     * a. Method Name: clickOnPreference
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on Preference link in footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
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
    /*
     * a. Method Name: verifyPreference
     * b. Author Name: Jahnavi Dasari
     * c. Description: Verify on Preference link in the page.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyPreference(){
        try{
            String text=webDriverHelper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/jahnavi.xlsx", "Sheet1", 3, 1);
            Assert.assertTrue(text.contains(expected));
            test.log(Status.PASS, "verify preference");
            LoggerHandler.info("verify preference");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot verify preference");
            LoggerHandler.error("Cannot verify preference");
        }
    }
    /*
     * a. Method Name: clickOnSiteMap
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on SiteMap link in footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnSiteMap(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotFooterLinksLocator.siteMap,3);
            webDriverHelper.clickOnElement(HomeDepotFooterLinksLocator.siteMap);
            test.log(Status.PASS, "click on sitemap");
            LoggerHandler.info("click on sitemap");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on sitemap");
            LoggerHandler.error("Cannot click on sitemap");
        }
    }
    /*
     * a. Method Name: verifySiteMap
     * b. Author Name: Jahnavi Dasari
     * c. Description: Verify on SiteMap link in the page.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifySiteMap(){
        try{
            String text=webDriverHelper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/jahnavi.xlsx", "Sheet1", 4, 1);
            Assert.assertTrue(text.contains(expected));
            test.log(Status.PASS, "verify sitemap");
            LoggerHandler.info("verify sitemap");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot verify sitemap");
            LoggerHandler.error("Cannot verify sitemap");
        }
    }
    /*
     * a. Method Name: clickOnStoreDirectory
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on Store Directory link in footer section.
     * d. Return Type: void
     * e. Parameters: none
     */
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
    /*
     * a. Method Name: verifyStoreDirectory
     * b. Author Name: Jahnavi Dasari
     * c. Description: Verify on Store Directory link in the page.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyStoreDirectory(){
        try{
            String text=webDriverHelper.getUrl();
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/jahnavi.xlsx", "Sheet1", 5, 1);
            Assert.assertTrue(text.contains(expected));
            test.log(Status.PASS, "verify StoreDirectory");
            LoggerHandler.info("verify StoreDirectory");
            Screenshot.captureScreenShot("store_directory");
            Reporter.attachScreenshotToReport( "store_directory", test,  "store_directory");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot verify StoreDirectory");
            LoggerHandler.error("Cannot verify StoreDirectory");
        }
    }
    public void footerLinksTestCase(){
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
