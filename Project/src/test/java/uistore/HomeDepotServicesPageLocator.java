package uistore;

import org.openqa.selenium.By;

public class HomeDepotServicesPageLocator {
    public static By serviceIcon = By.cssSelector("div[class='sui-flex'] svg[class='sui-w-4 sui-h-4 lg:sui-w-6 lg:sui-h-6']");
    public static By verifyServices = By.cssSelector("p[data-testid='header-drawer-title']");

    // public static By clickInstallation = By.cssSelector("svg[data-testid='HomeIcon']");
    public static By clickInstallation = By.xpath("//span[text()='Installation & Services']");

    public static By viewAllInstallation = By.cssSelector("a[href='/services/?vfrom=global-header']");
    public static By verifyHomeServices = By.cssSelector("h1[class='text-hero text-bold m-0']");
    public static By clickFlooring = By.cssSelector("a[href='/services/c/flooring-installation/660eb1d19']");
    public static By verifyFlooring = By.cssSelector("h1[class='TITLE']");
    public static By clickBathroom = By.xpath("//a[@href='/services/c/bathroom-installation/d9843b7cb']");
    public static By verifyBathroom = By.xpath("//h1[text()='Bathroom Installation Services']");
    public static By clickDoorsWindows = By.cssSelector("a[href='/services/h/windows-doors']");
    public static By verifyWindowDoorServices = By.cssSelector("h1[class='TITLE']");
    public static By clickHeating = By.cssSelector("a[href='/services/c/hvac-services/c16fbb4b7']");
    public static By verifyHVACServices = By.cssSelector("h1[class='TITLE']");
    
    
}
