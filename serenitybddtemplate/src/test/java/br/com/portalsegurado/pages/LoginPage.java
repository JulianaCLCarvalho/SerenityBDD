package br.com.portalsegurado.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.portalsegurado.bases.PageBase;

public class LoginPage extends PageBase {

    //Constructor
    public LoginPage(WebDriver driver){
        super(driver);
    }

    //Mapping
    By campoCpf = By.id("cpf");
    By campoSenha = By.id("password");
    By botaoAvancar = By.id("advance");
    By modalErro = By.xpath("//div[@class = 'modal-body pt-0']/div[@class = 'notifier']/div[@class = 'row']/div[@class = 'col-md-12']/h3");
    By mensagemErroTextCPF = By.xpath("//div[@class = 'row mt-2']/div[@class = 'col-md-12']/p");
    By mensagemErroTextSenha = By.xpath("//p[contains(text(), 'CPF ou senha inválidos, por favor verifique.')]");

    //Actions
    public void preencherCpf(String cpf){
        sendKeys(campoCpf, cpf);
    }

    public void preencherSenha(String senha){
        sendKeys(campoSenha, senha);
    }

    public void clicarEmAvancar(){
        click(botaoAvancar);
    } 
    
    public boolean retornaModalErro(){
        return returnIfElementIsDisplayed(modalErro);
    }   

    public boolean retornaMensagemDeErroCPF(){
        return returnIfElementIsDisplayed(mensagemErroTextCPF);
    }
    
    public boolean retornaMensagemDeErroSenha(){
        return returnIfElementIsDisplayed(mensagemErroTextSenha);
    }
}
