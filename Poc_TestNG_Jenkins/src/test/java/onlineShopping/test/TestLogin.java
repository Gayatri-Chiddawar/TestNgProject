package onlineShopping.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import onlineShopping.utility.Drivers;
public class TestLogin {
	  WebDriver driver;
	    ExtentSparkReporter sparkReporter;
	    ExtentReports reports;
	    ExtentTest testLog;
	@BeforeTest
	void setup()
	{
		System.out.println("Inside Setup");
		 SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-ms");
	        String filepath = System.getProperty("user.dir")+"/extent-reports/gayatri"+sdf.format(new java.util.Date())+".html";
	        sparkReporter = new ExtentSparkReporter(filepath);
	        reports = new ExtentReports();
	        reports.attachReporter(sparkReporter);
	        driver=Drivers.getDriver("chrome");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
	
	
	@Test(priority = 1)
	void Login()
	{
		System.out.println("Inside Login");
		driver.get("https://www.guru99.com/");
        //Assert.assertEquals(driver.getTitle(), "Home");
	}
	
	@Test(priority = 2)
	void Close()
	{
		System.out.println("Inside Close");
		driver.close();
        reports.flush();
	}
}
