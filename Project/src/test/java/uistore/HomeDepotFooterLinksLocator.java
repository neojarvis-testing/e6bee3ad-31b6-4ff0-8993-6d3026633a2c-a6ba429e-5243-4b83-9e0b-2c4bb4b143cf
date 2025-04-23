package uistore;

import org.openqa.selenium.By;

public class HomeDepotFooterLinksLocator {
    /*
     * Author Name: Jahnavi Dasari
     */
    //Store Locator link in the footer section
    public static By storeLocator=By.xpath("//a[contains(text(),'Store Locator')]");
    //verify title of the page
    public static By titleText=By.cssSelector("h1[class='sui-h1-bold sui-line-clamp-unset sui-font-normal sui-text-primary']");
    //Privacy Security link in the footer section
    public static By privacySecurity=By.xpath("//a[contains(text(),'Privacy & Security Statement')]");
    //verify privacy title in the page
    public static By privacyText=By.xpath("//h2[contains(text(),'Privacy & Security Center')]");
    //terms link in the footer section
    public static By terms=By.cssSelector("a[title='Terms']");
    //My Preference link in the footer sectiojn
    public static By myPreference=By.cssSelector("div[class='sui-pt-4'] a[title='My Preference Center']");
    //Site Map link in the footer section
    public static By siteMap=By.cssSelector("a[title='Site Map']");
    //Store Directory link in the footer section
    public static By storeDirectory=By.cssSelector("a[title='Store Directory']");
}
