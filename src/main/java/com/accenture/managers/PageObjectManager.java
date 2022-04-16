package com.accenture.managers;

import org.openqa.selenium.WebDriver;

import com.accenture.pages.*;

public class PageObjectManager {

	private WebDriver driver;

	private VehicleInsurancePage VehicleInsurancePage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public VehicleInsurancePage getVehicleInsurancePage() {
		return (VehicleInsurancePage == null) ? VehicleInsurancePage = new VehicleInsurancePage(driver) : VehicleInsurancePage;
	}

}
