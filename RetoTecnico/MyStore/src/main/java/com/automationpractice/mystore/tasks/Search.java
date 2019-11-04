package com.automationpractice.mystore.tasks;

import static com.automationpractice.mystore.userinterfaces.MyStoreHomePage.SEARCH;
import static com.automationpractice.mystore.userinterfaces.MyStoreHomePage.SEARCHBTTN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task{

	private String search;

	public Search(String search) {
		this.search = search;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(search).into(SEARCH),
				Click.on(SEARCHBTTN),
				Click.on(SEARCHBTTN)
		);
	}

	public static Performable the(String search) {
		return instrumented(Search.class, search);
	}

}
