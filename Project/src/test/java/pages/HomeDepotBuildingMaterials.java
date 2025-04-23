package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotBuildingMaterialsLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotBuildingMaterials {
    ExtentTest test;
    WebDriverHelper webDriverHelper;
    /*
     * a. Method Name: HomeDepotBuildingMaterials
     * b. Author Name: Jahnavi Dasari
     * c. Description: Constructor for the HomeDepotBuildingMaterials initalize the WebDriverHelper and assign ExtentTest
     * d. Return Type: void
     * e. Parameters: 
     * ExtentTest test- For logging test steps
     */
    public HomeDepotBuildingMaterials(ExtentTest test){
        this.test=test;
        webDriverHelper =new WebDriverHelper(Base.driver);
    }
    /*
     * a. Method Name: scrollToShopByCategory
     * b. Author Name: Jahnavi Dasari
     * c. Description: Scroll to Shop By Category in the home page.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void scrollToShopByCategory(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.shopByCategory,3);
            webDriverHelper.scrollToElement(HomeDepotBuildingMaterialsLocator.shopByCategory);
            test.log(Status.PASS, "Scroll to Shop By Category");
            LoggerHandler.info("Scroll to Shop By Category");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot Scroll to Shop By Category");
            LoggerHandler.error("Cannot Scroll to Shop By Category");
        }
    }
    /*
     * a. Method Name: clickOnBuildingMaterials
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on Building Materials button in Shop By Category.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnBuildingMaterials(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.buildingMaterials,3);
            webDriverHelper.clickOnElement(HomeDepotBuildingMaterialsLocator.buildingMaterials);
            test.log(Status.PASS, "Click on Building Materials");
            LoggerHandler.info("Click on Building Materials");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot Click on Building Materials");
            LoggerHandler.error("Cannot Click on Building Materials");
        }
    }
    /*
     * a. Method Name: verifyBuildingMaterials
     * b. Author Name: Jahnavi Dasari
     * c. Description: Verify the Building Materials button in Shop By Category.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyBuildingMaterials(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.titleText,3);
            String text=webDriverHelper.getText(HomeDepotBuildingMaterialsLocator.titleText);
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/jahnavi.xlsx", "Sheet1", 0, 0);
            Assert.assertTrue(text.contains(expected));
            test.log(Status.PASS, "Verify on Building Materials");
            LoggerHandler.info("Verify on Building Materials");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Building Materials");
            LoggerHandler.error("Cannot Verify on Building Materials");
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
     * a. Method Name: clickOnConcrete
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on Concrete link in Building Materials.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnConcrete(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.concrete,3);
            webDriverHelper.clickOnElement(HomeDepotBuildingMaterialsLocator.concrete);
            test.log(Status.PASS, "Click on concrete");
            LoggerHandler.info("Click on concrete");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on concrete");
            LoggerHandler.error("Cannot click on concrete");
        }
    }
    /*
     * a. Method Name: verifyConcrete
     * b. Author Name: Jahnavi Dasari
     * c. Description: Verify the Concrete link in Building Materials.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyConcrete(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.titleText,3);
            String text=webDriverHelper.getText(HomeDepotBuildingMaterialsLocator.titleText);
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/jahnavi.xlsx", "Sheet1", 1, 0);
            Assert.assertTrue(text.contains(expected));
            test.log(Status.PASS, "Verify on Concrete");
            LoggerHandler.info("Verify on Concrete");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Concrete");
            LoggerHandler.error("Cannot Verify on Concrete");
        }
    }
    /*
     * a. Method Name: clickOnDecking
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on Decking link in Building Materials.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnDecking(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.decking,3);
            webDriverHelper.clickOnElement(HomeDepotBuildingMaterialsLocator.decking);
            test.log(Status.PASS, "Click on decking");
            LoggerHandler.info("Click on decking");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on decking");
            LoggerHandler.error("Cannot click on decking");
        }
    }
    /*
     * a. Method Name: verifyDecking
     * b. Author Name: Jahnavi Dasari
     * c. Description: Verify the Decking link in Building Materials.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyDecking(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.titleText,3);
            String text=webDriverHelper.getText(HomeDepotBuildingMaterialsLocator.titleText);
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/jahnavi.xlsx", "Sheet1", 2, 0);
            Assert.assertTrue(text.contains(expected));
            test.log(Status.PASS, "Verify on Decking");
            LoggerHandler.info("Verify on Decking");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Decking");
            LoggerHandler.error("Cannot Verify on Decking");
        }
    }
    /*
     * a. Method Name: clickOnInsulation
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on Insulation link in Building Materials.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnInsulation(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.insulation,3);
            webDriverHelper.clickOnElement(HomeDepotBuildingMaterialsLocator.insulation);
            test.log(Status.PASS, "Click on insulation");
            LoggerHandler.info("Click on insulation");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on insulation");
            LoggerHandler.error("Cannot click on insulation");
        }
    }
    /*
     * a. Method Name: verifyInsulation
     * b. Author Name: Jahnavi Dasari
     * c. Description: Verify the Insulation link in Building Materials.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyInsulation(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.titleText,3);
            String text=webDriverHelper.getText(HomeDepotBuildingMaterialsLocator.titleText);
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/jahnavi.xlsx", "Sheet1", 3, 0);
            Assert.assertTrue(text.contains(expected));
            test.log(Status.PASS, "Verify on Insulation");
            LoggerHandler.info("Verify on Insulation");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Insulation");
            LoggerHandler.error("Cannot Verify on Insulation");
        }
    }
    /*
     * a. Method Name: clickOnDrywall
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on Drywall link in Building Materials.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnDryWall(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.dryWall,3);
            webDriverHelper.clickOnElement(HomeDepotBuildingMaterialsLocator.dryWall);
            test.log(Status.PASS, "Click on drywall");
            LoggerHandler.info("Click on drywall");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on drywall");
            LoggerHandler.error("Cannot click on drywall");
        }
    }
    /*
     * a. Method Name: verifyDrywall
     * b. Author Name: Jahnavi Dasari
     * c. Description: Verify the Drywall link in Building Materials.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void verifyDryWall(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.titleText,3);
            String text=webDriverHelper.getText(HomeDepotBuildingMaterialsLocator.titleText);
            String expected=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/jahnavi.xlsx", "Sheet1", 4, 0);
            Assert.assertTrue(text.contains(expected));
            test.log(Status.PASS, "Verify on Drywall");
            LoggerHandler.info("Verify on Drywall");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Drywall");
            LoggerHandler.error("Cannot Verify on Drywall");
        }
    }
    /*
     * a. Method Name: clickOnShopAllDrywall
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on Shop All Drywall in Drywall.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnShopAllDryWall(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.shopAllDrywall,3);
            webDriverHelper.clickOnElement(HomeDepotBuildingMaterialsLocator.shopAllDrywall);
            test.log(Status.PASS, "Click on shop all drywall");
            LoggerHandler.info("Click on shop all drywall");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on shop all drywall");
            LoggerHandler.error("Cannot click on shop all drywall");
        }
    }
    /*
     * a. Method Name: clickOnAllFilters
     * b. Author Name: Jahnavi Dasari
     * c. Description: Clicks on AllFilters in Shop All Drywall.
     * d. Return Type: void
     * e. Parameters: none
     */
    public void clickOnAllFilters(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.allFilters,3);
            webDriverHelper.clickOnElement(HomeDepotBuildingMaterialsLocator.allFilters);
            test.log(Status.PASS, "Click on allFilters");
            LoggerHandler.info("Click on allFilters");
            Screenshot.captureScreenShot("Drywall");
            Reporter.attachScreenshotToReport("Drywall", test, "Drywall");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on allFilters");
            LoggerHandler.error("Cannot click on allFilters");
        }
    }
    public void buildingMaterialsTestCase(){
        scrollToShopByCategory();
        clickOnBuildingMaterials();
        verifyBuildingMaterials();
        navigateBackToHome();
        clickOnBuildingMaterials();
        clickOnConcrete();
        verifyConcrete();
        navigateBackToHome();
        clickOnDecking();
        verifyDecking();
        navigateBackToHome();
        clickOnInsulation();
        verifyInsulation();
        navigateBackToHome();
        clickOnDryWall();
        verifyDryWall();
        clickOnShopAllDryWall();
        clickOnAllFilters();
    }
}
