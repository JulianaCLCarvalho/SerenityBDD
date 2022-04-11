## Testes automatizados Web com Serenity BDD

- Arquitetura Projeto
	- Linguagem		- [Java JDK 8](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)
	- IDE - [Eclipse 4.22.0](https://www.eclipse.org/eclipse/news/4.22)
	- Compilador - [Maven 3.8.1](https://mvnrepository.com/artifact/org.apache.maven/maven-plugin-api/3.8.1")
	- Orquestrador de testes - [Junit 4.12](https://mvnrepository.com/artifact/junit/junit/4.12")
	- Relatório de testes automatizados - [Serenity 3.2.0](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-core/3.2.0")
	- Biblioteca para testes Web - [Selenium ](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium")
	- Framework para criação de cenários de testes em BDD - [Serenity Cucumber Integration 3.2.0 ](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-cucumber/3.2.0")   

## Metas

- [x]	1) Implementar 3 cenários de testes que manipulem uma aplicação web. 
Todos os testes podem ser vistos na pasta tests e nas respectivas subpastas: 

```
AlterarSenhaTests
LoginTests
MinhaContaTests

```
 
- [x]	2)Todos os cenários de testes em escritos em BDD podem ser vistos na pasta features e nas suas respectivas subpastas .

```
AlterarSenha
Login
MinhaConta

```

- [x]	3) Executar os testes com sucesso
Os testes serão executados podem ser executados através do `Eclipse | Run As | Run Configuration | Goals|clean verify `
ou através do Prompt de comando acessando o diretório do projeto e executando o comando `clean verify`.

- [x]	4) O projeto deverá gerar um relatório de testes automaticamente.
O relatório sempre será gerado na pasta raiz do projeto em arquivo html com nome `index`.
```
 \target\site\serenity
 
```

- [x]	5) Devem ser realizadas capturas de telas referentes aos testes executados para que sirvam de evidência.
Para realizar as capturas de tela foi utilizada a propriedade `serenity.take.screenshots=FOR_EACH_ACTION` no arquivo `serenity.properties`.
Obs: As capturas de telas serão apresentadas no relatório.



