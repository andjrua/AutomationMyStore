package com.automationpractice.mystore.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.automationpractice.mystore.tasks.Register;
import com.automationpractice.mystore.tasks.SignIn;

import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CreateAccountStepDefinitions {
	
	@Managed(driver = "chrome")
	WebDriver hisBrowser;
	private Actor Megan = Actor.named("Megan");
	
	@Before
	public void setup() {
		Megan.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@When("^Enter my email to create and account$")
	public void enterMyEmailToCreateAndAccount() {
		Megan.wasAbleTo(
				SignIn.withEmail("fajkk@kfsjk.com")
		);
	}

	@When("^Enter my registration data$")
	public void enterMyRegistrationData() {
		Megan.wasAbleTo(
				Register.with()
		);
	}
}
