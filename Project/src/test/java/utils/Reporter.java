package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Reporter extends Base{
    public static TakesScreenshot ts;
    public static ExtentReports report;
    public static ExtentTest test;
    public static ExtentSparkReporter spark;



    public static ExtentReports generateExtentReports(String reportName){
        String path = System.getProperty("user.dir")+"/reports/"+reportName+".html";
        File file = new File(path);

        report = new ExtentReports();
        spark = new ExtentSparkReporter(file);
        spark.config().setTheme(Theme.DARK);
        report.attachReporter(spark);
        return report;
    }

    public static String CaptureScreenShot(String filename){
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";

        String destPath = "./"+name;

        ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir")+"/reports");

        if(!screenshotsDir.exists()){
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try{
            FileUtils.copyFile(file, target);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return destPath;
    }
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description){
        try {
            String screenshotPath = CaptureScreenShot(filename);
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
