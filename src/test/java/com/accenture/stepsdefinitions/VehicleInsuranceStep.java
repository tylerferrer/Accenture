package com.accenture.stepsdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.accenture.cucumber.TestContext;
import com.accenture.pages.VehicleInsurancePage;
import cucumber.api.java.pt.*;

public class VehicleInsuranceStep {
	
	WebDriver driver;
	VehicleInsurancePage Page;
	TestContext Context;

	public VehicleInsuranceStep(TestContext context) {
		Context = context;
		Page = Context.getPageObjectManager().getVehicleInsurancePage();
	}
	
	@Dado("^usuário em questão está pagina inicial$")
	public void usuário_em_questão_está_pagina_inicial() {
		Page.navegar_para_pagina_principal();
	}

	@Dado("^que ao preencher os dados do veiculo$")
	public void que_ao_preencher_os_dados_do_veiculo() {
	    Page.Select_Marca();
	    Page.Select_Modelo();
	    Page.Fill_Vehicle_Data();
	    Page.Select_Assentos();
	    Page.Select_Combustivel();
	    Page.Select_Assentos_Moto();
	}

	@Dado("^ir para a pagina da seguradora$")
	public void ir_para_a_pagina_da_seguradora() throws Exception {
		assertEquals("0", Page.Verificar_Counter_Vehicle());
		Page.Click_Next_Insurant();
	}

	@Entao("^preencher os dados da seguradora$")
	public void preencher_os_dados_da_seguradora()  {
		Page.Fill_Personal();
		Page.Click_Chkbx_2();
		Page.Click_Chkbx_3();
		Page.Select_Pais();
		Page.Select_Ocupacacao();
	}

	@Entao("^ir para a pagina do produto$")
	public void ir_para_a_pagina_do_produto() throws Throwable{
		assertEquals("0", Page.Verificar_Counter_Insurant());
	    Page.Click_Next_Product();
	}

	@Entao("^preencher os dados do produto$")
	public void preencher_os_dados_do_produto() {
		Page.Insere_Data_Inicio("08/15/2022");
		Page.Select_Soma_Seguro();
		Page.Select_Avaliacao();
		Page.Select_Danos();
		Page.Click_Chkbx_4();
		Page.Select_Cortesia();
	}
	
	@Entao("^ir para a pagina do preço$")
	public void ir_para_a_pagina_do_preço() throws Exception {
		assertEquals("0", Page.Verificar_Counter_Product());
	    Page.Click_Next_Price();
	}
	
	@Entao("^selecionar a opção de preço$")
	public void selecionar_a_opção_de_preço() throws Exception {
	    Page.Click_Chkbx_Price();
		
	}
	
	@Entao("^ir para a proxima página$")
	public void ir_para_a_proxima_página() throws Exception {
		assertEquals("0", Page.Verificar_Counter_Price());
		Page.Click_Next_Send();
	}


	@Entao("^preencher os dados para a cotação$")
	public void preencher_os_dados_para_a_cotação() {
	    Page.Fill_Contact();
	}

	@Quando("^clicar em enviar devo receber a mensagem de enviado$")
	public void clicar_em_enviar_devo_receber_a_mensagem_de_enviado() throws Exception  {
		assertEquals("0", Page.Verificar_Counter_Send());
	    Page.Click_Send();
	}


}
