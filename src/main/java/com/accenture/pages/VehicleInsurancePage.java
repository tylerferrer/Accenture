package com.accenture.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.accenture.managers.FileReaderManager;

public class VehicleInsurancePage {
	WebDriver driver;
	public VehicleInsurancePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "entervehicledata")
	public WebElement txt_NomeForm;
	
	@FindBy(how = How.ID, using = "cylindercapacity")
	public WebElement txtbx_Cylinder;
	
	@FindBy(how = How.ID, using = "engineperformance")
	public WebElement txtbx_EnginePerform;
	
	@FindBy(how = How.ID, using = "dateofmanufacture")
	public WebElement txtbx_DateManufacture;
	
	@FindBy(how = How.ID, using = "payload")
	public WebElement txtbx_Payload;
	
	@FindBy(how = How.ID, using = "totalweight")
	public WebElement txtbx_TotalWeight;
	
	@FindBy(how = How.ID, using = "listprice")
	public WebElement txtbx_ListPrice;
	
	@FindBy(how = How.ID, using = "licenseplatenumber")
	public WebElement txtbx_LicensePlate;
	
	@FindBy(how = How.ID, using = "annualmileage")
	public WebElement txtbx_AnnualMileage;
	
	@FindBy(how = How.ID, using = "nextenterinsurantdata")
	public WebElement btn_NextInsurant;
	
	@FindBy(how = How.XPATH, using = "//*/div[7]/p/label[1]/span")
	public WebElement chkbx_1;
	
	@FindBy(how = How.ID, using = "firstname")
	public WebElement txtbx_Nome;
	
	@FindBy(how = How.ID, using = "lastname")
	public WebElement txtbx_Sobrenome;
	
	@FindBy(how = How.ID, using = "birthdate")
	public WebElement txtbx_DataNasc;
	
	@FindBy(how = How.XPATH, using = "//*/div[4]/p/label[1]/span")
	public WebElement chkbx_2;
	
	@FindBy(how = How.ID, using = "streetaddress")
	public WebElement txtbx_Endereco;
	
	@FindBy(how = How.ID, using = "zipcode")
	public WebElement txtbx_CEP;
	
	@FindBy(how = How.ID, using = "city")
	public WebElement txtbx_Cidade;
	
	@FindBy(how = How.XPATH, using = "//*/div[10]/p/label[4]/span")
	public WebElement chkbx_3;
	
	@FindBy(how = How.ID, using = "nextenterproductdata")
	public WebElement btn_NextProduct;
	
	@FindBy(how = How.ID, using = "startdate")
	public WebElement txtbx_DataInicio;

	@FindBy(how = How.XPATH, using = "//*/div[5]/p/label[1]/span")
	public WebElement chkbx_4;
	
	@FindBy(how = How.ID, using = "nextselectpriceoption")
	public WebElement btn_NextPrice;
	
	@FindBy(how = How.XPATH, using = "//*/table/tfoot/tr/th[2]/label[4]/span")
	public WebElement chkbx_price;
	
	@FindBy(how = How.ID, using = "nextsendquote")
	public WebElement btn_NextSend;
	
	@FindBy(how = How.ID, using = "email")
	public WebElement txtbx_Email;
	
	@FindBy(how = How.ID, using = "phone")
	public WebElement txtbx_Tel;
	
	@FindBy(how = How.ID, using = "username")
	public WebElement txtbx_User;
	
	@FindBy(how = How.ID, using = "password")
	public WebElement txtbx_Senha;
	
	@FindBy(how = How.ID, using = "confirmpassword")
	public WebElement txtbx_ConfirmSenha;
	
	@FindBy(how = How.ID, using = "sendemail")
	public WebElement btn_SendEmail;
	
	public void navegar_para_pagina_principal() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public boolean getNomeForm() {
		return txt_NomeForm.isDisplayed();
	}
	
	public String Nome_Form() throws Exception {
		return txt_NomeForm.getText();
	}
	
	public void Select_Marca() {
		WebElement Select_Marca = driver.findElement(By.id("make"));
		Select selectObject = new Select(Select_Marca);
		selectObject.selectByValue("BMW");
	}
	
	public void Select_Modelo() {
		WebElement Select_Modelo = driver.findElement(By.id("model"));
		Select selectObject = new Select(Select_Modelo);
		selectObject.selectByValue("Moped");
	}
	
	public void Select_Assentos() {
		WebElement Select_Assentos = driver.findElement(By.id("numberofseats"));
		Select selectObject = new Select(Select_Assentos);
		selectObject.selectByValue("2");
	}
	
	public void Select_Assentos_Moto() {
		WebElement Select_Assentos_Moto = driver.findElement(By.id("numberofseatsmotorcycle"));
		Select selectObject = new Select(Select_Assentos_Moto);
		selectObject.selectByValue("2");
	}
	
	public void Select_Combustivel() {
		WebElement Select_Combustivel = driver.findElement(By.id("fuel"));
		Select selectObject = new Select(Select_Combustivel);
		selectObject.selectByValue("Diesel");
	}
	
	public void Select_Pais() {
		WebElement Select_Pais = driver.findElement(By.id("country"));
		Select selectObject = new Select(Select_Pais);
		selectObject.selectByValue("Brazil");
	}
	
	public void Select_Ocupacacao() {
		WebElement Select_Ocupacacao = driver.findElement(By.id("occupation"));
		Select selectObject = new Select(Select_Ocupacacao);
		selectObject.selectByValue("Farmer");
	}
	
	public void Select_Soma_Seguro() {
		WebElement Select_Soma_Seguro = driver.findElement(By.id("insurancesum"));
		Select selectObject = new Select(Select_Soma_Seguro);
		selectObject.selectByValue("10000000");
	}
	
	public void Select_Avaliacao() {
		WebElement Select_Avaliacao = driver.findElement(By.id("meritrating"));
		Select selectObject = new Select(Select_Avaliacao);
		selectObject.selectByValue("Bonus 3");
	}
	
	public void Select_Danos() {
		WebElement Select_Danos = driver.findElement(By.id("damageinsurance"));
		Select selectObject = new Select(Select_Danos);
		selectObject.selectByValue("Full Coverage");
	}
	
	public void Select_Cortesia() {
		WebElement Select_Cortesia = driver.findElement(By.id("courtesycar"));
		Select selectObject = new Select(Select_Cortesia);
		selectObject.selectByValue("Yes");
	}
	
	public void Click_Chkbx() {
		chkbx_1.click();
	}
	
	public void Click_Next_Insurant() {
		btn_NextInsurant.click();
	}
	
	public void Insere_Cylinder(String cylinder) {
		txtbx_Cylinder.sendKeys(cylinder);
	}
	
	public void Insere_Engine(String engine) {
		txtbx_EnginePerform.sendKeys(engine);
	}
	
	public void Insere_Payload(String payload) {
		txtbx_Payload.sendKeys(payload);
	}
	
	public void Insere_Weight(String weight) {
		txtbx_TotalWeight.sendKeys(weight);
	}
	
	public void Insere_Date_Manufacture(String manufacture) {
		txtbx_DateManufacture.sendKeys(manufacture);
	}
	
	public void Insere_Price(String price) {
		txtbx_ListPrice.sendKeys(price);
	}
	
	public void Insere_License(String license) {
		txtbx_LicensePlate.sendKeys(license);
	}
	
	public void Insere_Annual(String annual) {
		txtbx_AnnualMileage.sendKeys(annual);
	}
	
	public void Insere_Nome(String nome) {
		txtbx_Nome.sendKeys(nome);
	}
	
	public void Insere_Sobrenome(String sobrenome) {
		txtbx_Sobrenome.sendKeys(sobrenome);
	}
	
	public void Insere_DataNasc(String datanasc) {
		txtbx_DataNasc.sendKeys(datanasc);
	}
	
	public void Insere_Endereco(String endereco) {
		txtbx_Endereco.sendKeys(endereco);
	}
	
	public void Insere_CEP(String CEP) {
		txtbx_CEP.sendKeys(CEP);
	}
	
	public void Insere_Cidade(String cidade) {
		txtbx_Cidade.sendKeys(cidade);
	}
	
	public void Click_Chkbx_2() {
		chkbx_2.click();
	}
	
	public void Click_Chkbx_3() {
		chkbx_3.click();
	}
	
	public void Click_Next_Product() {
		btn_NextProduct.click();
	}
	
	public void Insere_Data_Inicio(String data) {
		txtbx_DataInicio.sendKeys(data);
	}
	
	public void Click_Next_Price() {
		btn_NextPrice.click();
	}
	
	public void Click_Chkbx_4() {
		chkbx_4.click();
	}
	
	public void Click_Chkbx_Price() {
		chkbx_price.click();
	}
	
	public void Click_Next_Send() {
		btn_NextSend.click();
	}
	
	public void Insere_Email(String email) {
		txtbx_Email.sendKeys(email);
	}
	
	public void Insere_Tel(String tel) {
		txtbx_Tel.sendKeys(tel);
	}
	
	public void Insere_User(String username) {
		txtbx_User.sendKeys(username);
	}
	
	public void Insere_Senha(String password) {
		txtbx_Senha.sendKeys(password);
	}
	
	public void Insere_Corfirma_Senha(String confirm) {
		txtbx_ConfirmSenha.sendKeys(confirm);
	}
	
	public void Click_Send() {
		btn_SendEmail.click();
	}
	
	public void Fill_Vehicle_Data() {
		Insere_Cylinder("300");
		Insere_Engine("500");
		Insere_Payload("600");
		Insere_Weight("700");
		Insere_Date_Manufacture("08/27/2020");
		Insere_Price("15000");
		Insere_License("7TYL267");
		Insere_Annual("5000");
	}
	
	public void Fill_Personal() {
		Insere_Nome("Tyler");
		Insere_Sobrenome("Ferreira");
		Insere_DataNasc("07/26/2001");
		Insere_Endereco("Rua da Mata");
		Insere_CEP("33101");
		Insere_Cidade("Miami");
	}
	
	public void Fill_Contact() {
		Insere_Email("tylerlucasferrer@gmail.com");
		Insere_Tel("99999999");
		Insere_User("tyler.test");
		Insere_Senha("Qwe123!@#");
		Insere_Corfirma_Senha("Qwe123!@#");
	}
	
}
