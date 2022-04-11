package br.com.portalsegurado.steps;

import br.com.portalsegurado.pages.AlterarSenhaPage;
import br.com.portalsegurado.pages.MinhaContaPage;
import net.thucydides.core.annotations.Step;

public class AlterarSenhaSteps {

    MinhaContaPage minhaContaPage;
    AlterarSenhaPage alterarSenhaPage;

    @Step("^Clicar no botão 'Alterar Senha'$")
    public void clicarBotaoAlterarSenha(){
    	minhaContaPage.clicarEmTrocarSenha();
    }
    
    @Step("^Retorna título Alterar Senha$")
    public boolean retornaTituloInformacoesPessoais(){
        return alterarSenhaPage.retornaTitulo();
      
    } 
    
    @Step("^Retorna label Senha Atual$")
    public boolean retornaLabelSenhaAtual(){
    	return alterarSenhaPage.retornaLabelSenhaAtual();
      
    }
    
    @Step("^Retorna label Nova Senha$")
    public boolean retornaLabelNovaSenha(){
    	return alterarSenhaPage.retornaLabelNovaSenha();
      
    }
    
    @Step("^Retorna label Senha Atual$")
    public boolean retornaLabelRepetirSenha(){
    	return alterarSenhaPage.retornaLabelRepetirSenha();
      
    }  
    
    @Step("^Retorna campo Senha Atual$")
    public boolean retornaCampoSenhaAtual(){
    	return alterarSenhaPage.retornaCampoSenhaAtual();
      
    }
    
    @Step("^Retorna campo Nova Senha$")
    public boolean retornaCampoNovaSenha(){
    	return alterarSenhaPage.retornaCampoNovaSenha();
      
    }
    
    @Step("^Retorna campo Repetir Senha$")
    public boolean retornaCampoRepetirSenha(){
    	return alterarSenhaPage.retornaCampoRepetirSenha();    
    }
    
    @Step("^Retorna informações$")
    public boolean retornaInformacoesASenhaDeveConter(){
    	return alterarSenhaPage.retornaInformações();    
    }
    
    @Step("^Retorna Letra Maiúscula$")
    public boolean retornaLetraMaiuscula(){
    	return alterarSenhaPage.retornaLetraMaiuscula();    
    }
    
    @Step("^Retorna Letra Minúscula$")
    public boolean retornaLetraMinuscula(){
    	return alterarSenhaPage.retornaLetraMinúscula();    
    }
    
    @Step("^Retorna Pelo menos um número$")
    public boolean retornaPeloMenosUmNumero(){
    	return alterarSenhaPage.retornaPeloMenosUmNumero();    
    }   
    
    @Step("^Retorna Pelo menos um caracter$")
    public boolean retornaPeloMenosUmCaracter(){
    	return alterarSenhaPage.retornaPeloMenosUmCaracter();    
    }
    
    @Step("^Retorna No mínimo Oito Dígitos$")
    public boolean retornaNoMinimoOitoDigitos(){
    	return alterarSenhaPage.retornaNoMininoOitoDigitos();    
    }
    
    @Step("^Retorna botão Fechar$")
    public boolean retornaBotaoFechar(){
    	return alterarSenhaPage.retornaBotaoFechar();    
    }
    
    @Step("^Retorna botão Salvar$")
    public boolean retornaBotaoSalvar(){
    	return alterarSenhaPage.retornaBotaoSalvar();    
    }
    
    @Step("^Retorna botão Voltar$")
    public boolean retornaBotaoVoltar(){
    	return alterarSenhaPage.retornaBotaoVoltar();    
    }
    
    @Step("^Preencher Senha Atual '[0}'$")
    public void preencherSenhaAtual(String senhaAtual){
    	alterarSenhaPage.preencherSenhaAtual(senhaAtual);    
    }
    
    @Step("^Preencher Nova Senha '[0}'$")
    public void preencherNovaSenha(String novaSenha){
    	alterarSenhaPage.preencherNovaSenha(novaSenha);    
    }
    
    @Step("^Confirmar Nova Senha '[0}'$")
    public void confirmarNovaSenha(String senha){
    	alterarSenhaPage.preencherRepetirSenha(senha);    
    }
    
    @Step("^Clicar no botão 'Salvar'$")
    public void clicarBotaoSalvar(){
    	alterarSenhaPage.clicarEmSalvar();
    }
    
    @Step("^Retorna mensagem de sucesso$")
    public boolean retornaMensagemSucesso(){
    	return alterarSenhaPage.retornaMensagemDeSucesso();    
    }
    
    
    
    
    
    
}
