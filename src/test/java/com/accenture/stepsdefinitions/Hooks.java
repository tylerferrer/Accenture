package com.accenture.stepsdefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.accenture.cucumber.TestContext;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext Context;

	public Hooks(TestContext context) {
		Context = context;
	}

	@Before
	public void BeforeSteps() {
		/*What all you can perform here
			Starting a webdriver
			Setting up DB connections
			Setting up test data
			Setting up browser cookies
			Navigating to certain page
			or anything before the test
		*/
	}
	
	@After(order = 1)
	 public void afterScenario(Scenario scenario) {
	 String screenshotName = scenario.getName().replaceAll(" ", "_");
	 try {
	 File sourcePath = ((TakesScreenshot) Context.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
	 
	 File destinationPath = new File(System.getProperty("user.dir") + "/target/screenshots/" + screenshotName + ".png");
	 
	 Files.copy(sourcePath, destinationPath);   
	 
	 Reporter.addScreenCaptureFromPath(destinationPath.toString());
	 } catch (IOException e) {
	 } 
	 }

//	@After(order = 0)
//	public void AfterSteps() {
//		Context.getWebDriverManager().closeDriver();
//	}
}
