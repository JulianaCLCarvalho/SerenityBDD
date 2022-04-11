package br.com.portalsegurado.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import br.com.portalsegurado.steps.LoginSteps;
import br.com.portalsegurado.steps.MainSteps;


public class LoginStepDefinitions {
    @Steps
    LoginSteps loginSteps;

    @Steps
    MainSteps mainSteps;
    
    @When("^o usuário realiza o login com o cpf '(.*)'e senha '(.*)'$")
    public void realizarLogin(String cpf,String senha){
        Serenity.setSessionVariable("cpf").to(cpf);
        Serenity.setSessionVariable("senha").to(senha);
        loginSteps.preencherCpf(cpf);
        loginSteps.preencherSenha(senha);
        loginSteps.clicarEmAvancar();
    }

    @Then("^o usuário deve ser autenticado com sucesso$")
    public void verificarSeUsuarioEstaAutenticado(){
    	Assert.assertTrue(mainSteps.retornaTituloDaPaginaInicial());
    }
    
    @Then("^é apresentada uma mensagem de erro relacionada ao CPF$")
    public void verificarMensagemDeErroCPF(){
    	Assert.assertTrue(loginSteps.retornaModalDeErro());
    	Assert.assertTrue(loginSteps.retornaMensagemDeErroCPF());
    }
    
    @Then("^é apresentada uma mensagem de erro relacionada a senha$")
    public void verificarMensagemDeErroSenha(){
    	Assert.assertTrue(loginSteps.retornaModalDeErro());
    	Assert.assertTrue(loginSteps.retornaMensagemDeErroSenha());
    }
    
}
