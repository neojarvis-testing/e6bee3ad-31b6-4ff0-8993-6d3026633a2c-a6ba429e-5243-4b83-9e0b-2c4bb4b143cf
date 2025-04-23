package uistore;

import org.openqa.selenium.By;

public class HomeDepotShopAllLocators {
    /*
     * Author: Jaya vardhan Raju G
     */
    // Shop All button on the navigation bar
    public static By shopAll = By.cssSelector("div[class = 'sui-flex sui-justify-around sui-mx-3 sui-my-4 sui-h-fit lg:sui-gap-6 lg:sui-mx-0 lg:sui-my-0'] button:nth-child(1)");
    // Savings button from the dropdown menu
    public static By savings = By.cssSelector("ul[class = '-sui-pt-2'] > div:nth-child(1) > span > div:nth-child(2) > span");
    // Shop All Savings button in the expanded menu
    public static By shopAllSavings = By.cssSelector("ul[class = '-sui-pt-2'] > a:nth-child(1) > span span");
    // SAVINGS CENTER header label
    public static By savingsCenter = By.cssSelector("h1[class = 'sui-h1-display sui-uppercase sui-line-clamp-unset sui-font-normal sui-text-primary']");
    // Shop By Department from the dropdown menu
    public static By shopByDepartment = By.cssSelector("ul[class = '-sui-pt-2'] > div:nth-child(3) > span > div:nth-child(2) > span");
    // Appliances button in the expanded menu
    public static By appliances = By.cssSelector("div[class = 'sui-flex-auto sui-overflow-y-auto sui-bg-primary'] div ul > div:nth-child(1) > span > div span");
    // Shop All Appliances button in the expanded menu
    public static By shopAllAppliances = By.xpath("//span[text() = 'Shop All Appliances']");
    // APPLIANCES header label
    public static By appliancesLabel = By.cssSelector("h1[class = 'sui-h1-display sui-uppercase sui-line-clamp-unset sui-font-normal sui-text-primary']");
    // Kitchen Appliance Packages button in side menu bar
    public static By kitchenAppliancePackages = By.cssSelector("ul[class = 'sui-list-none sui-m-0 sui-relative sui-px-0 sui-py-2'] > li:nth-child(2) a");
    // KITCHEN APPLIANCE PACKAGES header label
    public static By kitchenAppliancePackagesLabel = By.cssSelector("h1[class = 'sui-h1-display sui-leading-none sui-uppercase sui-line-clamp-unset sui-font-normal sui-text-primary']");
    // View Package button from the first displayed result
    public static By viewPackage = By.xpath("(//a[text() = 'View Package'])[1]");
    
}
