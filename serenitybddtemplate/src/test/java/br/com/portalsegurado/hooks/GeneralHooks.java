package br.com.portalsegurado.hooks;

import br.com.portalsegurado.steps.LoginSteps;
import io.cucumber.java.Before;
import net.thucydides.core.annotations.Steps;

public class GeneralHooks {
    
    @Steps
    LoginSteps loginSteps;

    @Before
    public void beforeScenario(){
        //código a ser executado antes de cada cenário
        loginSteps.abrirPortal();
    }   
      
}