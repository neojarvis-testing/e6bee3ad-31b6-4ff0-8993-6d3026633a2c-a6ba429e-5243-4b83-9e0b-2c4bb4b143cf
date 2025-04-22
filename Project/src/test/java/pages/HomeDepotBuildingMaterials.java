package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomeDepotBuildingMaterialsLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomeDepotBuildingMaterials {
    ExtentTest test;
    WebDriverHelper webDriverHelper;
    public HomeDepotBuildingMaterials(ExtentTest test){
        this.test=test;
        webDriverHelper =new WebDriverHelper(Base.driver);
    }
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
    public void verifyBuildingMaterials(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.verify,3);
            String text=webDriverHelper.getText(HomeDepotBuildingMaterialsLocator.verify);
            Assert.assertTrue(text.contains("BUILDING MATERIALS"));
            test.log(Status.PASS, "Verify on Building Materials");
            LoggerHandler.info("Verify on Building Materials");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Building Materials");
            LoggerHandler.error("Cannot Verify on Building Materials");
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
    public void verifyConcrete(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.verify,3);
            String text=webDriverHelper.getText(HomeDepotBuildingMaterialsLocator.verify);
            Assert.assertTrue(text.contains("CONCRETE"));
            test.log(Status.PASS, "Verify on Concrete");
            LoggerHandler.info("Verify on Concrete");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Concrete");
            LoggerHandler.error("Cannot Verify on Concrete");
        }
    }
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
    public void verifyDecking(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.verify,3);
            String text=webDriverHelper.getText(HomeDepotBuildingMaterialsLocator.verify);
            Assert.assertTrue(text.contains("DECKING"));
            test.log(Status.PASS, "Verify on Decking");
            LoggerHandler.info("Verify on Decking");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Decking");
            LoggerHandler.error("Cannot Verify on Decking");
        }
    }
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
    public void verifyInsulation(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.verify,3);
            String text=webDriverHelper.getText(HomeDepotBuildingMaterialsLocator.verify);
            Assert.assertTrue(text.contains("INSULATION"));
            test.log(Status.PASS, "Verify on Insulation");
            LoggerHandler.info("Verify on Insulation");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Insulation");
            LoggerHandler.error("Cannot Verify on Insulation");
        }
    }
    public void clickOnDrywall(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.drywall,3);
            webDriverHelper.clickOnElement(HomeDepotBuildingMaterialsLocator.drywall);
            test.log(Status.PASS, "Click on drywall");
            LoggerHandler.info("Click on drywall");
        }catch(Exception e){
            test.log(Status.FAIL, "Cannot click on drywall");
            LoggerHandler.error("Cannot click on drywall");
        }
    }
    public void verifyDrywall(){
        try{
            webDriverHelper.waitForElementToBeVisible(HomeDepotBuildingMaterialsLocator.verify,3);
            String text=webDriverHelper.getText(HomeDepotBuildingMaterialsLocator.verify);
            Assert.assertTrue(text.contains("DRYWALL"));
            test.log(Status.PASS, "Verify on Drywall");
            LoggerHandler.info("Verify on Drywall");
        }catch(AssertionError|Exception e){
            test.log(Status.FAIL, "Cannot Verify on Drywall");
            LoggerHandler.error("Cannot Verify on Drywall");
        }
    }
    public void clickOnShopAllDrywall(){
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
    public void buildingMaterials(){
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
        clickOnDrywall();
        verifyDrywall();
        clickOnShopAllDrywall();
        clickOnAllFilters();
    }
}
