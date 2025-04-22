package uistore;

import org.openqa.selenium.By;

public class HomeDepotCategoryLocators {
    // Search bar input field at the top of the homepage
    // public static By searchInputBar = By.cssSelector("#typehead-container input"); - Not working
    public static By searchInputBar = By.xpath("//input[@type = 'search']");
    // Search icon on the input bar
    public static By searchIcon = By.cssSelector("div[class = 'sui-w-11'] button");
    // wrench label on the top of the page
    public static By wrenchLabel = By.cssSelector("div[class = 'breadcrumb__item sui-inline sui-p-0 sui-float-none'] > span");
    // Catergory dropdown for Wrenches
    public static By category = By.cssSelector("div[class = 'primary-filters'] > div > div:nth-child(2) button");
    // Wrench Sets Type
    public static By wrenchSets = By.cssSelector("ul[class = 'sui-list-none sui-m-0 sui-px-0 sui-py-2 sui-relative'] li:nth-child(1) > span > p > span");
    // Wrench Sets label on the top of the page
    public static By wrenchSetsLabel = By.cssSelector("div[class = 'breadcrumb__item sui-inline sui-p-0 sui-float-none'] > span");
    // Ratcheting Wrenches Type
    public static By ratchetingWrenches = By.cssSelector("ul[class = 'sui-list-none sui-m-0 sui-px-0 sui-py-2 sui-relative'] li:nth-child(3) > span > p > span");
    // Ratcheting Wrenches label on the top of the page
    public static By ratchetingWrenchesLabel = By.cssSelector("div[class = 'breadcrumb__item sui-inline sui-p-0 sui-float-none'] > span");
    // Adjustable Wrenches Type
    public static By adjustableWrenches = By.cssSelector("ul[class = 'sui-list-none sui-m-0 sui-px-0 sui-py-2 sui-relative'] li:nth-child(5) > span > p > span");
    // Adjustable Wrences label on the top of the page
    public static By adjustableWrenchesLabel = By.cssSelector("div[class = 'breadcrumb__item sui-inline sui-p-0 sui-float-none'] > span");
    // Impact Wrenches Type
    // public static By impactWrenches = By.cssSelector("ul[class = 'sui-list-none sui-m-0 sui-px-0 sui-py-2 sui-relative'] li:nth-child(17) > span > p > span"); - Not Working
    public static By impactWrenches = By.xpath("//span[text() = 'Impact Wrenches']");
    // Impact Wrenches label on the top of the page
    public static By impactWrenchesLabel = By.cssSelector("div[class = 'breadcrumb__item sui-inline sui-p-0 sui-float-none'] > span");
}
