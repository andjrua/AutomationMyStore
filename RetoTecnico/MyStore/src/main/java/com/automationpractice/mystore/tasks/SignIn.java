package com.automationpractice.mystore.tasks;

import static com.automationpractice.mystore.userinterfaces.MyStoreHomePage.*;
import static com.automationpractice.mystore.userinterfaces.MyStoreSingInPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignIn implements Task{
	
	private String email;

	public SignIn(String email) {
		this.email = email;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(SIGNIN),					
				Enter.theValue(email).into(CREATEEMAIL),
				Click.on(CREATENBUTTON)
		);
	}

	public static SignIn withEmail(String email) {
		return new SignIn(email);
	}

}
