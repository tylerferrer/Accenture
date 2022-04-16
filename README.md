
# Accenture
Projeto feito para automatizar funcionalidades.


# Estrutura

**src/main/java**

 - com.accenture.cucumber
	 - ScenarioContex e TestContext criados para controlar valores e instancias.
 - com.accenture.dataProvider
	 - ConfigFileReader e JsonDataReader criados para leitura de documentos como Customer e Configuration.properties
 - com.accenture.enums
	 - Context, DriverType e EnvironmentType criados para controlar browser e ambiente.
 - com.accenture.managers
	 - FileReadeManager, PageObjectManager e WebDriverManager criados para controlar instancias de objetos.
 - com.accenture.pages
	 - Esses foram criados para utilizar os elementos codificados e produzir as ações dos steps.
 - com.accenture.selenium
	 - Wait criado para gerenciar o uso do método wait do selenium.

**src/test/java**
 - com.accenture.runners
	 - TestRunner criado para gerenciar qual teste executar.
 - com.accenture.stepdefinitions
	 - Hooks criado para implementar os passos de After e Before para definir o que deve ser rodado antes e depois de cada teste, os demais steps são os steps das features.


**src/test/resources**
 - functionalTests
	 - Criada para armazenar as features com o bdd.
 - configs
	 - Configuration.properties e Extent-config.xml foram criados para definir as instâncias e os reports do projeto.

## Para executar
Para realizar a execução do projeto basta apenas abrir o runner e colocar a tag geral desejada para rodar todos ou colocar tag de cada feature para rodar apenas um teste.
