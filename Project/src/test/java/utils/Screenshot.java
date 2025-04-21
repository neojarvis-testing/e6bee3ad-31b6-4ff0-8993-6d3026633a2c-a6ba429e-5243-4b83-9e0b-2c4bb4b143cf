package utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class Screenshot extends Base{
    public static TakesScreenshot ts;

    /*
     * a. Method Name: captureScreenShot
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Captures a full-page screenshot and saves it with a timestamp.
     * d. Return Type: void
     * e. Parameters: 
     *       - String filename: The name used to save the screenshot file
     */
    public static void captureScreenShot(String filename){
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + "_" + timestamp + ".png";
        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir")+"/screenshots");
        if(!screenshotsDir.exists()){
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: captureHighlightScreenShot
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Highlights a web element and captures a full-page screenshot.
     * d. Return Type: void
     * e. Parameters: 
     *      - String filename: The name used to save the screenshot file
     *      - By locator: locator to find the element on the page.
     */
    public static void captureHighlightScreenShot(String filename, By locator){
        try{
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;

            //Apply yellow background hightlight to the element before capturing full screenshot
            js.executeScript("arguments[0].style.backgroundColor='yellow';", element);
            Thread.sleep(500);

            //Capture full-page screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            BufferedImage img = ImageIO.read(screenshot);

            //Save highlighted screenshot
            File screenshotsDir = new File(System.getProperty("user.dir")+"/screenshots");
            if(!screenshotsDir.exists()){
                screenshotsDir.mkdirs();
            }

            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            File target = new File(screenshotsDir,filename+timestamp+".png");
            ImageIO.write(img, "png", target);

            //Reset element background color to default after screenshot capture
            js.executeScript("arguments[0].style.backgroundColor='';", element);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /*
     * a. Method Name: captureSpecificScreenShot
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Captures a screenshot of a specific web element.
     * d. Return Type: void
     * e. Parameters: 
     *      - String filename: The name used to save the screenshot file
     *      - By locator: locator to find the element on the page.
     */
    public static void captureSpecificScreenShot(String filename, By locator){
        WebElement element = driver.findElement(locator);
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename +"_"+timestamp+".png";
        File file = element.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir")+"/screenshots");
        if(!screenshotsDir.exists()){
            screenshotsDir.mkdirs();
        } 
        File target = new File(screenshotsDir, name);
        try{
            Files.copy(file, target);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
