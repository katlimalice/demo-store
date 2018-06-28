# Desafio DBServer
Desafio de automação de testes realizado para a DBServer.

O script de teste foi desenvolvido para a loja virtual de demonstraçao disponível em [Demo Store](http://demo.cs-cart.com) e apresenta alguns conceitos de automação, tais como:

* TestSuites
* TestCases
* Tasks
* AppObjects
* Framework (ScreenShot)

### Pré requisitos

* Eclipse IDE - [eclipse.org](http://www.eclipse.org/)
* Maven - [maven.apache.org](https://maven.apache.org/)
* JDK 8 - [oracle.com](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)

### Execução

 1. Abra o projeto "desafiodbserver" com o Eclipse IDE
 2. Expandir o pacote "src/main/java" no Package Explorer
 3. Expandir o pacote "testsuite" no Package Explorer
 4. Clique com o botão direito na classe "AddProductsToTheShoppingCartTestCase.java"
 5. Clique no menu "Run As -> JUnit Test" (*ou utilize o atalho Alt+Shift+X,T*)

### Bibliotecas externas

Dependências obtidas através do gerenciador de dependências do Maven.

* Selenium WebDriver - [seleniumhq.org](https://www.seleniumhq.org/)
* WebDriver Manager - [github.com/bonigarcia/webdrivermanager](https://github.com/bonigarcia/webdrivermanager)
* JUnit - [junit.org](https://junit.org/junit5/)