package uistore;

import org.openqa.selenium.By;

public class HomeDepotDIYWorkShopPageLocator {
    /*
     * Author Name: Sri Ramya Paladi
     */

    //DIY menu button in the header.
    public static By clickDIYIcon = By.xpath("//p[text()='DIY']");
    //Free Workshops section
    public static By clickFreeWorkShops = By.xpath("//span[text()='Free Workshops']");
    //Free Workshops header text
    public static By verifyFreeWorkShops = By.cssSelector("p[data-testid='header-drawer-title']");
    //Kids Workshops section
    public static By clickKidsWorkShops= By.xpath("//span[text()='Kids Workshops']");
    //Kids Workshops header text
    public static By verifyKidsWorkShops = By.xpath("//span[text()='Kids Workshops']");
    //Learn More link in the workshop section
    public static By clickLearnMore = By.xpath("//a[text()='Learn More']");
    //Register Now button
    public static By clickRegisterNow = By.xpath("//a[@href='#register']");
    //Parent / Guardian First Name field
    public static By verifyParentName = By.xpath("//label[text()='Parent / Guardian First Name']");
    //Entering the Parent / Guardian First Name
    public static By clickFirstName = By.xpath("//input[@id='sui-5TisgleFCn4is6jJGdBT_']");
    //Email input field
    public static By clickEmail = By.cssSelector("input[id='sui-Nd0n1gkAuM2x8bxbXu0jf']");
    //How the user heard about the workshop
    public static By clickHearAboutUs = By.cssSelector("button[id='sui-QznEI6mQgAbMHzJdCNR2E']");
    //'Friend / Family Member' as the source
    public static By clickFriend =  By.cssSelector("li[id='sui-SA0xNlIhEHfQz7db_qEdV-Friend / Family Member']");
    //Registration button to submit the form
    public static By register = By.cssSelector("button[type='submit']");
    //On-Demand Workshops
    public static By clickOnDemand = By.xpath("//img[@alt='On-Demand Workshops']");
    //Resources section
    public static By clickResources = By.cssSelector("a[href='/wcc/eh/3092587/category/51559/resources']");
    //Resources page header
    public static By verifyResources = By.cssSelector("h1[class='category-name break-word']");
    //Title of the Page
    public static By titlePage = By.xpath("//title[text()='Free DIY Workshops & Classes']");
}
