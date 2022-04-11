package br.com.portalsegurado.steps;

import br.com.portalsegurado.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginPage loginPage;

    @Step("Abrir Portal")
    public void abrirPortal(){
        loginPage.open();
    }

    @Step("^Preencher cpf com'{0}'$")
    public void preencherCpf(String cpf){
        loginPage.preencherCpf(cpf);
    }

    @Step("^Preencher senha com'[0}'$")
    public void preencherSenha(String senha){
        loginPage.preencherSenha(senha);
    }

    @Step("^Clicar em 'Avançar'$")
    public void clicarEmAvancar(){
        loginPage.clicarEmAvancar();
    }
    
    @Step("^Retorna modal de erro$")
    public boolean retornaModalDeErro(){
        return loginPage.retornaModalErro();
    }
    
    @Step("^Retorna mensagem de erro sobre CPF$")
    public boolean retornaMensagemDeErroCPF(){
        return loginPage.retornaMensagemDeErroCPF();
    }
    
    @Step("^Retorna mensagem de erro sobre senha$")
    public boolean retornaMensagemDeErroSenha(){
        return loginPage.retornaMensagemDeErroSenha();
    }

}
