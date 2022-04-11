package br.com.portalsegurado.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.portalsegurado.bases.PageBase;

public class MinhaContaPage extends PageBase {

    //Constructor
    public MinhaContaPage(WebDriver driver){
        super(driver);
    }
    //Mapping
    By titulo = By.xpath("//div[@class = 'modal-header d-flex align-items-center']/h4[1]");
    By nome = By.xpath("//dd[contains(text(), 'Julios Don')]");
    By cpf = By.xpath("//dd[contains(text(), '113.465.097-35')]");
    By alterarSenha = By.xpath("//button[contains(text(), 'trocar senha')]");
    By fechar = By.xpath("//span[contains(@aria-hidden,\"true\")]");

    //Actions
    public boolean retornaTitulo(){
        return  returnIfElementIsDisplayed(titulo);
    }
    
    public boolean retornaNome(){
        return  returnIfElementIsDisplayed(nome);
    }
    
    public boolean retornaCpf(){
        return  returnIfElementIsDisplayed(cpf);
    }
    
    public boolean retornaBotaoTrocarSenha(){
        return  returnIfElementIsDisplayed(alterarSenha);
    }
    
    public boolean retornaBotaoFechar(){
        return  returnIfElementIsDisplayed(fechar);
    }
    
    public void clicarEmTrocarSenha(){
        click(alterarSenha);
    } 
}
