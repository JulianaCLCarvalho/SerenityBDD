package br.com.portalsegurado.tests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
		tags = "@Login",
        glue = {"classpath:br.com.portalsegurado.stepdefinitions",
        		"classpath:br.com.portalsegurado.hooks"})

public class LoginTests {
}
