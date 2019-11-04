package com.automationpractice.mystore.tasks;

import static com.automationpractice.mystore.userinterfaces.MyStoreHomePage.*;
import static com.automationpractice.mystore.userinterfaces.MyStoreSingInPage.*;

import com.automationpractice.mystore.models.build.LogInBuilder;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LogIn implements Task{
	
	private String password;
	private String email;

	public LogIn(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(SIGNIN),					
				Enter.theValue(email).into(LOGINEMAIL),
				Enter.theValue(password).into(PASSWORD),
				Click.on(SIGNINBUTTON)
		);
	}

	public static LogInBuilder with() {
		return new LogInBuilder();
	}

}
