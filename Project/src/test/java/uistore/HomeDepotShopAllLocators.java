package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class HomeDepotShopAllLocators {
    public static By shopAll = By.cssSelector("div[class = 'sui-flex sui-justify-around sui-mx-3 sui-my-4 sui-h-fit lg:sui-gap-6 lg:sui-mx-0 lg:sui-my-0'] button:nth-child(1)");
    public static By savings = By.cssSelector("ul[class = '-sui-pt-2'] > div:nth-child(1) > span > div:nth-child(2) > span");
    public static By shopAllSavings = By.cssSelector("ul[class = '-sui-pt-2'] > a:nth-child(1) > span span");
    public static By savingCenter = By.cssSelector("h1[class = 'sui-h1-display sui-uppercase sui-line-clamp-unset sui-font-normal sui-text-primary']");
    public static By shopByDepartment = By.cssSelector("ul[class = '-sui-pt-2'] > div:nth-child(3) > span > div:nth-child(2) > span");
    public static By appliances = By.cssSelector("div[class = 'sui-flex-auto sui-overflow-y-auto sui-bg-primary'] div ul > div:nth-child(1) > span > div span");
    // public static By shopAllAppliances = By.cssSelector("div[class = 'sui-flex-auto sui-overflow-y-auto sui-bg-primary'] div ul > div:nth-child(1) > span > div span");
    public static By shopAllAppliances = By.xpath("//span[text() = 'Shop All Appliances']");
    public static By appliancesLabel = By.cssSelector("h1[class = 'sui-h1-display sui-uppercase sui-line-clamp-unset sui-font-normal sui-text-primary']");
    public static By kitchenAppliancesPackages = By.cssSelector("ul[class = 'sui-list-none sui-m-0 sui-relative sui-px-0 sui-py-2'] > li:nth-child(2) a");
    public static By kitchenAppliancesLabel = By.cssSelector("h1[class = 'sui-h1-display sui-leading-none sui-uppercase sui-line-clamp-unset sui-font-normal sui-text-primary']");
    // public static By viewPackage = By.cssSelector("Hodiv[class = 'sui-grid sui-gap-0 sui-p-0 sui-grid-cols-1 sui-flex-col sui-justify-end'] > div:nth-child(1) a");
    public static By viewPackage = By.xpath("(//a[text() = 'View Package'])[1]");
    
}
