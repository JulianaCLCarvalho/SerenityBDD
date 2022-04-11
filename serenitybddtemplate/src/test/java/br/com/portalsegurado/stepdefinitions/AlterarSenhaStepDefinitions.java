package br.com.portalsegurado.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import br.com.portalsegurado.steps.AlterarSenhaSteps;


public class AlterarSenhaStepDefinitions {
	
	@Steps
    AlterarSenhaSteps alterarSenhaSteps;
	
	@Steps
	LoginStepDefinitions loginStepDefinitions;
    
	@Steps
	MinhaContaStepDefinitions minhaContaStepDefinitions;     
    
    @Given("^o usuário acessa a tela Minha Conta logado com o cpf '(.*)'e senha '(.*)'$")
    //utilizado como contexto
    public void contextoMinhaConta(String cpf, String senha) throws InterruptedException{
    	minhaContaStepDefinitions.contexto(cpf, senha);
    	Thread.sleep(3000);
    	minhaContaStepDefinitions.clicarEmMinhaConta();
    }
    
    @When("^o usuário aciona o botão Alterar senha$")
    public void clicarEmAlterarSenhar() throws InterruptedException{
        Thread.sleep(3000);
    	alterarSenhaSteps.clicarBotaoAlterarSenha();
    	
    }
    
    @And("^informa a senha atual '(.*)'$")
    public void informaSenhaAtual(String senhaAtual) {
    	alterarSenhaSteps.preencherSenhaAtual(senhaAtual);
    }
    
    @And("^informa a nova senha '(.*)'$")
    public void informarNovaSenha(String novaSenha) {
    	alterarSenhaSteps.preencherNovaSenha(novaSenha);
    }
    
    @And("^confirma a nova senha '(.*)'$")
    public void confirmarNovaSenha(String senha) {
    	alterarSenhaSteps.confirmarNovaSenha(senha);
    }
    
    @And("^aciona o botão Salvar$")
    public void acionaBotaoSalvar() {
    	alterarSenhaSteps.clicarBotaoSalvar();
    }

    @Then("^deve ser apresentada a tela com as informações para alteração de senha$")
    public void verificarSeUsuarioEstaAutenticado(){
    	Assert.assertTrue(alterarSenhaSteps.retornaTituloInformacoesPessoais());
    	Assert.assertTrue(alterarSenhaSteps.retornaBotaoFechar());
    	Assert.assertTrue(alterarSenhaSteps.retornaLabelSenhaAtual()); 
    	Assert.assertTrue(alterarSenhaSteps.retornaCampoSenhaAtual()); 
    	Assert.assertTrue(alterarSenhaSteps.retornaLabelNovaSenha());
    	Assert.assertTrue(alterarSenhaSteps.retornaCampoNovaSenha());
    	Assert.assertTrue(alterarSenhaSteps.retornaLabelRepetirSenha());    	
    	Assert.assertTrue(alterarSenhaSteps.retornaCampoRepetirSenha()); 
    	Assert.assertTrue(alterarSenhaSteps.retornaBotaoVoltar()); 
    	Assert.assertTrue(alterarSenhaSteps.retornaBotaoSalvar()); 
    }   
    
    @Then("^será apresentada uma mensagem de sucesso na alteração de senha$")
    public void verificarSeSenhaFoiAlterada() {
    	Assert.assertTrue(alterarSenhaSteps.retornaMensagemSucesso());
    }
     
}
