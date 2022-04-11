package br.com.portalsegurado.steps;

import br.com.portalsegurado.pages.MainPage;
import br.com.portalsegurado.pages.MinhaContaPage;
import net.thucydides.core.annotations.Step;

public class MinhaContaSteps {

    MinhaContaPage minhaContaPage;
    MainPage mainPage;

    @Step("^Clicar no botão 'Minha Conta'$")
    public void clicarBotaoMinhaConta(){
    	mainPage.clicarEmMinhaConta();
    }
    
    @Step("^Retorna título Informações Pessoais$")
    public boolean retornaTituloInformacoesPessoais(){
        return minhaContaPage.retornaTitulo();
      
    } 
    
    @Step("^Retorna nome do usuário logado$")
    public boolean retornaNomeUsuarioLogado(){
        return minhaContaPage.retornaNome();
      
    }
    
    @Step("^Retorna cpf do usuário logado$")
    public boolean retornaCPFUsuarioLogado(){
        return minhaContaPage.retornaCpf();
      
    }
    
    @Step("^Retorna botão trocar senha$")
    public boolean retornaBotaoTrocarSenha(){
        return minhaContaPage.retornaBotaoTrocarSenha();
      
    }
    
    @Step("^Retorna botão fechar$")
    public boolean retornaBotaoFechar(){
        return minhaContaPage.retornaBotaoFechar();
      
    }

}
