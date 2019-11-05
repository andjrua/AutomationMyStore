package com.automationpractice.mystore.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	features = "src/test/resources/features/CreateAccount.feature",
	glue = "com.automationpractice.mystore.stepdefinitions",
	snippets = SnippetType.CAMELCASE
)
public class CreateAccount {

}
