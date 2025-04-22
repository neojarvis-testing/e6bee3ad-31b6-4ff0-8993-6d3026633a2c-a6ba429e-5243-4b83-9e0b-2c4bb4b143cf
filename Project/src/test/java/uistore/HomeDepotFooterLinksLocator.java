package uistore;

import org.openqa.selenium.By;

public class HomeDepotFooterLinksLocator {
    public static By storeLocator=By.xpath("//a[contains(text(),'Store Locator')]");
    public static By verifyTitle=By.cssSelector("h1[class='sui-h1-bold sui-line-clamp-unset sui-font-normal sui-text-primary']");
    public static By privacySecurity=By.xpath("//a[contains(text(),'Privacy & Security Statement')]");
    public static By verifyPrivacy=By.xpath("//h2[contains(text(),'Privacy & Security Center')]");
    public static By terms=By.cssSelector("a[title='Terms']");
    public static By myPreference=By.cssSelector("div[class='sui-pt-4'] a[title='My Preference Center']");
    public static By sitemap=By.cssSelector("a[title='Site Map']");
    public static By storeDirectory=By.cssSelector("a[title='Store Directory']");
}
