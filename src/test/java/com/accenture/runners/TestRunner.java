package com.accenture.runners;



import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.accenture.managers.FileReaderManager;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/functionalTests", glue = {
		"com.accenture.stepsdefinitions" }, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" }, 
				monochrome = true, 
				tags= {"@Vehicle_01_OK"})

public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	}
}
