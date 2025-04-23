package uistore;

import org.openqa.selenium.By;

public class HomeDepotFooterLocator {
    //Customer Service Center button on the footer section.
    public static By customerServiceCenter = By.cssSelector("div[class='sui-w-full sui-flex sui-grid sui-grid-cols-4 sui-gap-3'] > div:nth-child(1)>ul>li:nth-child(1)>a");
    //Check Order Status button on the footer section.
    public static By checkOrderStatus = By.cssSelector("div[class='sui-w-full sui-flex sui-grid sui-grid-cols-4 sui-gap-3'] > div:nth-child(1)>ul>li:nth-child(2)>a");
    //Pay Your Credit Card button on the footer section.
    public static By payYourCreditCard = By.cssSelector("div[class='sui-w-full sui-flex sui-grid sui-grid-cols-4 sui-gap-3'] > div:nth-child(1)>ul>li:nth-child(3)>a");
    //Order Cancellation button on the footer section.
    public static By orderCancellation = By.cssSelector("div[class='sui-w-full sui-flex sui-grid sui-grid-cols-4 sui-gap-3'] > div:nth-child(1)>ul>li:nth-child(4)>a");
    //Return Policy button on the footer section.
    public static By returnPolicy = By.cssSelector("div[class='sui-w-full sui-flex sui-grid sui-grid-cols-4 sui-gap-3'] > div:nth-child(1)>ul>li:nth-child(5)>a");
    //Refund Policy button on the footer section.
    public static By refundPolicy = By.cssSelector("div[class='sui-w-full sui-flex sui-grid sui-grid-cols-4 sui-gap-3'] > div:nth-child(1)>ul>li:nth-child(6)>a");
    //Shipping Delivery button on the footer section.
    public static By shippingDelivery = By.cssSelector("div[class='sui-w-full sui-flex sui-grid sui-grid-cols-4 sui-gap-3'] > div:nth-child(1)>ul>li:nth-child(7)>a");
    //Product Recalls button on the footer section.
    public static By productRecalls = By.cssSelector("div[class='sui-w-full sui-flex sui-grid sui-grid-cols-4 sui-gap-3'] > div:nth-child(1)>ul>li:nth-child(8)>a");
    //My Preference Center button on the footer section.
    public static By myPreferenceCenter = By.cssSelector("div[class='sui-w-full sui-flex sui-grid sui-grid-cols-4 sui-gap-3'] > div:nth-child(1)>ul>li:nth-child(9)>a");
    //Privacy Security Center button on the footer section.
    public static By privacySecurityCentre = By.cssSelector("div[class='sui-w-full sui-flex sui-grid sui-grid-cols-4 sui-gap-3'] > div:nth-child(1)>ul>li:nth-child(10)>a");
}
