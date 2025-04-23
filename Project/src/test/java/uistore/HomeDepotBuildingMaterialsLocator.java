package uistore;

import org.openqa.selenium.By;

public class HomeDepotBuildingMaterialsLocator {
    /*
     * Author Name: Jahnavi Dasari
     */
    // Shop By Category in home page
    public static By shopByCategory=By.cssSelector("div[class='sui-grid sui-p-2'] h2[class='sui-h2-bold sui-line-clamp-unset sui-font-normal sui-text-primary']");
    //Building Materials button in Shop By Category
    public static By buildingMaterials=By.cssSelector("div[data-contentful-entry-id='3LUdms9lNmXTUdypIaoImm'] [class='sui-flex-auto sui-text-xs sui-leading-normal sui-font-bold']");
    //verify title of the page in the Building Materials 
    public static By titleText=By.cssSelector("h1[class='sui-h1-display sui-uppercase sui-line-clamp-unset sui-font-normal sui-text-primary']");
    //concrete link in Building Materials
    public static By concrete=By.xpath("//a[text()='Concrete, Cement & Masonry']");
    //decking link in Building Materials
    public static By decking=By.xpath("//a[text()='Decking']");
    //insulation link in Building Materials 
    public static By insulation=By.xpath("//a[text()='Insulation']");
    //drywall link in Building Materials
    public static By dryWall=By.xpath("//a[text()='Drywall']");
    //Shop All Drywall link in drywall
    public static By shopAllDrywall=By.xpath("//a[text()='Shop All Drywall']");
    //allFilters button in Shop All Drywall
    public static By allFilters=By.xpath("//p[text()='All Filters']");
}
