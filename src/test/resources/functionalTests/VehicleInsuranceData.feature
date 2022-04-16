#language:pt
#coding:utf-8
@VehicleData

Funcionalidade: Automatização de preenchimento dos dados do veiculo

Contexto:
	Dado usuário em questão está pagina inicial
	

@Vehicle_01_OK
Cenario: Cliente preenche os dados do veiculo.
	Dado que ao preencher os dados do veiculo
	E ir para a pagina da seguradora
	Entao preencher os dados da seguradora
	E ir para a pagina do produto
	Entao preencher os dados do produto
	E ir para a pagina do preço
	Entao selecionar a opção de preço
	E ir para a proxima página
	Entao preencher os dados para a cotação
	Quando clicar em enviar devo receber a mensagem de enviado