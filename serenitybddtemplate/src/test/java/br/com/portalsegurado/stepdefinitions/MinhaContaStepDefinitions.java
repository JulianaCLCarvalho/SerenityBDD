package br.com.portalsegurado.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import br.com.portalsegurado.steps.LoginSteps;
import br.com.portalsegurado.steps.MinhaContaSteps;


public class MinhaContaStepDefinitions {
	
	@Steps
    LoginSteps loginSteps;
	
	@Steps
	LoginStepDefinitions loginStepDefinitions;

    @Steps
    MinhaContaSteps minhaContaSteps; 
    
    @Given("^o usuário está logado com o cpf '(.*)'e senha '(.*)'$")
    //utilizado como contexto
    public void contexto(String cpf, String senha){
    	loginStepDefinitions.realizarLogin(cpf,senha);		
    }  
    
    @When("^o usuário aciona o botão Minha Conta$")
    public void clicarEmMinhaConta()throws InterruptedException{
    	Thread.sleep(3000);
        minhaContaSteps.clicarBotaoMinhaConta();
        Serenity.takeScreenshot(); 
    }
    
    @Then("^deve ser apresentado o modal com as informações do usuário logado$")
    public void verificarSeUsuarioEstaAutenticado(){
    	Assert.assertTrue(minhaContaSteps.retornaTituloInformacoesPessoais());
    	Assert.assertTrue(minhaContaSteps.retornaNomeUsuarioLogado());
    	Assert.assertTrue(minhaContaSteps.retornaCPFUsuarioLogado());
    	Assert.assertTrue(minhaContaSteps.retornaBotaoTrocarSenha());
    	Assert.assertTrue(minhaContaSteps.retornaBotaoFechar());
    }    
     
}
