package uistore;

import org.openqa.selenium.By;

public class HomeDepotBuildingMaterialsLocator {
    public static By shopByCategory=By.cssSelector("div[class='sui-grid sui-p-2'] h2[class='sui-h2-bold sui-line-clamp-unset sui-font-normal sui-text-primary']");
    public static By buildingMaterials=By.cssSelector("div[data-contentful-entry-id='3LUdms9lNmXTUdypIaoImm'] [class='sui-flex-auto sui-text-xs sui-leading-normal sui-font-bold']");
    public static By verify=By.cssSelector("h1[class='sui-h1-display sui-uppercase sui-line-clamp-unset sui-font-normal sui-text-primary']");
    public static By concrete=By.xpath("//a[text()='Concrete, Cement & Masonry']");
    public static By decking=By.xpath("//a[text()='Decking']");
    public static By insulation=By.xpath("//a[text()='Insulation']");
    public static By drywall=By.xpath("//a[text()='Drywall']");
    public static By shopAllDrywall=By.xpath("//a[text()='Shop All Drywall']");
    public static By allFilters=By.xpath("//p[text()='All Filters']");


}
