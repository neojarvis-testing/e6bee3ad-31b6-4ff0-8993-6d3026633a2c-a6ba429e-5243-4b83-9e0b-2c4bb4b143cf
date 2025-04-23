package uistore;

import org.openqa.selenium.By;

public class HomeDepotDIYWorkShopPageLocator {
    public static By clickDIYIcon = By.cssSelector("button[data-testid='header-button-DIY']");
    //public static By clickFreeWorkShops = By.cssSelector("svg[data-testid='CalendarIcon']");
    public static By clickFreeWorkShops = By.xpath("//span[text()='Free Workshops']");
    public static By verifyFreeWorkShops = By.cssSelector("p[data-testid='header-drawer-title']");
    public static By clickKidsWorkShops= By.cssSelector("a[href='/c/kids']");
    public static By verifyKidsWorkShops = By.xpath("//span[text()='Kids Workshops']");
    public static By clickLearnMore = By.cssSelector("div[class = 'col__12-12 col__12-12--xs col__10-12--sm col__10-12--md col__10-12--lg'] > section a");
    public static By clickRegisterNow = By.cssSelector("a[href='#register']");
    public static By verifyParentFirstName = By.xpath("//label[text()='Parent / Guardian First Name']");
    public static By clickFirstName = By.xpath("//input[@id='sui-5TisgleFCn4is6jJGdBT_']");
    public static By clickLastName = By.xpath("//input[@id='sui-7NfQCI2BXbCK1r-aiokD-']");
    public static By clickEmail = By.cssSelector("input[id='sui-Nd0n1gkAuM2x8bxbXu0jf']");
    public static By clickChooseWorkshop = By.xpath("//button[@id='sui-PBU_0OjYuUUcnsDFZfVjn']");
    public static By clickBirdy = By.xpath("//li[@id='sui-JOVOx5KlZ9ry607neOXzv-[object Object]']");
    public static By clickHearAboutUs = By.cssSelector("button[id='sui-QznEI6mQgAbMHzJdCNR2E']");
    public static By clickFriend =  By.cssSelector("li[id='sui-SA0xNlIhEHfQz7db_qEdV-Friend / Family Member']");
    public static By register = By.cssSelector("button[type='submit']");
    public static By clickClose = By.xpath("//div[10]/div[3]/div/div[1]/div/div[2]/button");
    public static By clickOnDemand = By.xpath("//img[@alt='On-Demand Workshops']");
    public static By clickResources = By.cssSelector("a[href='/wcc/eh/3092587/category/51559/resources']");
    public static By verifyResources = By.cssSelector("h1[class='category-name break-word']");

}
