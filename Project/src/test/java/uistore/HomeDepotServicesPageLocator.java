package uistore;

import org.openqa.selenium.By;

public class HomeDepotServicesPageLocator {
    /*
     * Author Name: Sri Ramya Paladi
     */

    // Services menu icon in the header
    public static By serviceIcon = By.xpath("//p[text()='Services']");
    // Services section in the header drawer
    public static By verifyServices = By.cssSelector("p[data-testid='header-drawer-title']");
    // Installation & Services label
    public static By clickInstallation = By.xpath("//div[@class='sui-flex-auto sui-my-1 sui-block']//span[text()='Installation & Services']");
    // View all installation services label 
    public static By viewAllInstallation = By.xpath("//span[text()='View All Installation & Services']");
    //Home Services Button
    public static By verifyHomeServices = By.cssSelector("h1[class='text-hero text-bold m-0']");
    //Flooring Installation section
    public static By clickFlooring = By.xpath("//a[text()=' Flooring ']");
    //Flooring Installation section header
    public static By verifyFlooring = By.cssSelector("h1[class='TITLE']");
    //Bathroom Installation section
    public static By clickBathroom = By.xpath("//a[@href='/services/c/bathroom-installation/d9843b7cb']");
    //Bathroom Installation section header
    public static By verifyBathroom = By.xpath("//h1[text()='Bathroom Installation Services']");
    //Windows & Doors Installation section
    public static By clickDoorsWindows = By.xpath("//a[@href='/services/h/windows-doors']");
    //Windows & Doors Installation section header
    public static By verifyWindowDoorServices = By.cssSelector("h1[class='TITLE']");
    //HVAC Services section
    public static By clickHeating = By.xpath("//a[@href='/services/c/hvac-services/c16fbb4b7']");
    //HVAC Services section header
    public static By verifyHVACServices = By.cssSelector("h1[class='TITLE']");
}
