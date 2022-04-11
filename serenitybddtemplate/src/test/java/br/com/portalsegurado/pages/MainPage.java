package br.com.portalsegurado.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.portalsegurado.bases.PageBase;

public class MainPage extends PageBase {

    //Constructor
    public MainPage(WebDriver driver){
        super(driver);
    }
    //Mapping
    By title = By.xpath("//p[contains(text(), ' A seguradora para um mundo em mudança')]");
    By myAccountButton = By.xpath("//a[contains(text(), 'Minha conta')]");

    //Actions
    public boolean retornaTitulo(){
        return  returnIfElementIsDisplayed(title);
    }
    
    public void clicarEmMinhaConta(){
        click(myAccountButton);
    } 
    
}
