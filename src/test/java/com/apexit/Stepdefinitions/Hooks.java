package com.apexit.Stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks extends com.apexit.testrunner.TestRunner{
	
		@AfterStep
	public void addScreenshot(Scenario scenario){
		if(scenario.isFailed()) {

	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.attach(screenshot, "image/png", "image"); 
		}
	}

}
