package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;


public class Reporter extends Base{
    public static TakesScreenshot ts;
    public static ExtentReports report;
    public static ExtentTest test;
    public static ExtentSparkReporter spark;
    
    /* a. Method Name: generateExtentReports
     * b. Author Name: Kushal
     * c. Description: This method generates the report.
     * d. Return Type: ExtentReports.
     * e. Parameters:reportName.
     */
    public static ExtentReports generateExtentReports(String reportName){
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String path = System.getProperty("user.dir")+"/reports/"+reportName+".html";
        File file = new File(path);
        report = new ExtentReports();
        spark = new ExtentSparkReporter(file);
        spark.config().setTheme(Theme.DARK);
        report.attachReporter(spark);
        return report;
    }

    /* a. Method Name: CaptureScreenShot
     * b. Author Name: Kushal
     * c. Description: This method captures the screenshot.
     * d. Return Type: String
     * e. Parameters: filename.
     */
    public static String captureScreenShot(String filename){
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + "_" + timestamp + ".png";
        String destPath = "./"+name;
        ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir")+"/reports");
        File target = new File(screenshotsDir, name);
        try{
            Files.copy(file, target);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return destPath;
    }
    /* a. Method Name: attachScreenshotToReport
     * b. Author Name: Kushal
     * c. Description: This method attaches the screenshot to the report.
     * d. Return Type: void
     * e. Parameters: filename, Extent test, description.
     */
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description){
        try {
            String screenshotPath = captureScreenShot(filename);
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
