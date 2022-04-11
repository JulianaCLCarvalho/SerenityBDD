package br.com.portalsegurado.steps;

import br.com.portalsegurado.pages.MainPage;
import net.thucydides.core.annotations.Step;

public class MainSteps {
    MainPage mainPage;

    @Step("^Retorna titulo da pagina inicial$")
    public boolean retornaTituloDaPaginaInicial(){
        return mainPage.retornaTitulo();
    }
}
