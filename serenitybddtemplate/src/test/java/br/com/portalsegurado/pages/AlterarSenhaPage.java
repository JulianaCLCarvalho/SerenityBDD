package br.com.portalsegurado.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.portalsegurado.bases.PageBase;

public class AlterarSenhaPage extends PageBase {

    //Constructor
    public AlterarSenhaPage(WebDriver driver){
        super(driver);
    }
    //Mapping
    By titulo = By.xpath("//div[@class = 'modal-header d-flex align-items-center']/h4[contains(text(), 'Alterar Senha')]");
    By campoSenhaAtual = By.id("oldPassword");
    By labelSenhaAtual = By.xpath("//label[@class = 'label-form' and contains(text(), 'Senha Atual')]");
    By campoNovaSenha = By.id("password");
    By labelNovaSenha = By.xpath("//label[@class = 'label-form' and contains(text(), 'Nova senha')]");
    By campoRepetirSenha = By.id("confirmPassword");
    By labelRepetirSenha = By.xpath("//label[@class = 'label-form' and contains(text(), 'Repetir Senha')]");
    By fechar = By.xpath("//span[contains(@aria-hidden,\"true\")]");
    By voltar = By.xpath("//button[@class = 'btn btn-link'and contains(text(), 'voltar')]");
    By salvar = By.xpath("//button[@class = 'btn btn-primary' and @type = 'submit']");
    By informacoes = By.xpath("//p[contains(text(), 'A senha deve conter')]");
    By letraMaiuscula = By.xpath("//li[@class ='d-flex align-items-center']/span[contains(text(), 'Letra maiúscula')]");
    By letraMinuscula = By.xpath("//li[@class ='d-flex align-items-center']/span[contains(text(), 'Letra minúscula')]");
    By peloMenosUmNumero = By.xpath("//li[@class ='d-flex align-items-center']/span[contains(text(), 'Pelo menos um número')]");
    By peloMenosUmCaracter = By.xpath("//li[@class ='d-flex align-items-center']/span[contains(text(), 'Pelo menos um caractere especial')]");
    By noMininoOitoDigitos = By.xpath("//li[@class ='d-flex align-items-center']/span[contains(text(), 'No mínimo 8 dígitos')]");
    By mensagemSucesso = By.xpath("//div[@class = 'col-md-12']/p[contains(text(), 'Senha alterada com sucesso!')]");
        
    //Actions
    public boolean retornaTitulo(){
        return  returnIfElementIsDisplayed(titulo);
    }
    
    public boolean retornaLabelSenhaAtual(){
        return  returnIfElementIsDisplayed(labelSenhaAtual);
    }
    
    public boolean retornaCampoSenhaAtual(){
        return  returnIfElementIsDisplayed(campoSenhaAtual);
    }
    
    public boolean retornaLabelNovaSenha(){
        return  returnIfElementIsDisplayed(labelNovaSenha);
    }
    
    public boolean retornaCampoNovaSenha(){
        return  returnIfElementIsDisplayed(campoNovaSenha);
    }
    
    public boolean retornaLabelRepetirSenha(){
        return  returnIfElementIsDisplayed(labelRepetirSenha);
    }
    
    public boolean retornaCampoRepetirSenha(){
        return  returnIfElementIsDisplayed(campoRepetirSenha);
    }
    
    public boolean retornaBotaoFechar(){
        return  returnIfElementIsDisplayed(fechar);
    }
    
    public boolean retornaBotaoVoltar(){
        return  returnIfElementIsDisplayed(voltar);
    }
    
    public boolean retornaBotaoSalvar(){
        return  returnIfElementIsDisplayed(salvar);
    }   
    public boolean retornaInformações(){
        return  returnIfElementIsDisplayed(informacoes);
    } 
       
    public boolean retornaLetraMaiuscula(){
        return  returnIfElementIsDisplayed(letraMaiuscula);
    }  
    
    public boolean retornaLetraMinúscula(){
        return  returnIfElementIsDisplayed(letraMinuscula);
    }  
      
    public boolean retornaPeloMenosUmNumero(){
        return  returnIfElementIsDisplayed(peloMenosUmNumero);
    }  
    
    public boolean retornaPeloMenosUmCaracter(){
        return  returnIfElementIsDisplayed(peloMenosUmCaracter);
    } 
       
    public boolean retornaNoMininoOitoDigitos(){
        return  returnIfElementIsDisplayed(noMininoOitoDigitos);
    }  
    
    public boolean retornaMensagemDeSucesso(){
        return  returnIfElementIsDisplayed(mensagemSucesso);
    }
    
    public void preencherSenhaAtual(String senhaAntiga){
        sendKeys(campoSenhaAtual, senhaAntiga);
    } 
    
    public void preencherNovaSenha(String senha){
        sendKeys(campoNovaSenha, senha);
    } 
    
    public void preencherRepetirSenha(String senha){
        sendKeys(campoRepetirSenha, senha);
    }
    
    public void clicarEmSalvar(){
        click(salvar);
    } 
}
