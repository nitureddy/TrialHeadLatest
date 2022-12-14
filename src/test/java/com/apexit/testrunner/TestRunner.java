/**
 * 
 */
package com.apexit.testrunner;

/*****updated for github branching******/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apexit.basepage.LaunchBrowser;

import atu.testrecorder.ATUTestRecorder;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "FeaturesTrailHead" }, glue = { "com.apexit.Stepdefinitions" }, plugin = { "summary",
		"json:target/cucumber-reports/cucumber.json", // to generate different kinds of reports
		// "pretty",
		// "html:target/cucumber-html-report",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		// tags="@LoginTrailhead",
		tags = "@CreateConvertLead", monochrome = true) // display output in readable format
// dryRun=true) //to check the feature files are mapped with step definition

public class TestRunner extends AbstractTestNGCucumberTests {

	protected static WebDriver driver;
	protected static ATUTestRecorder recorder;

	@BeforeClass
	public static void setUp() throws Throwable {
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder(System.getProperty("user.dir") + "\\ScriptVideos\\",
				"TestVideo-" + dateFormat.format(date), false);
		recorder.start();
		if (driver == null) {
			LaunchBrowser.getDriver();
			System.out.println("Executing the WebClient Scripts........");
		}
	}

	@BeforeMethod
	public static void beforeMethod() throws Throwable {
		System.out.println("Executing the WebClient Scripts........");
	}

	@AfterMethod
	public static void failedScenario() throws Exception {
		System.out.println("Closing the  scripts........");
	}

	@AfterClass
	public static void tearDown() throws Exception {

		if (driver != null) {
			System.out.println("Closing browser");
			driver.quit();
			recorder.stop();
			

		}
	}
}
