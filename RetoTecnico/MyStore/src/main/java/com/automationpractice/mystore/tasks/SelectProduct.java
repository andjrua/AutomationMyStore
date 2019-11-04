package com.automationpractice.mystore.tasks;

import static com.automationpractice.mystore.userinterfaces.MyStoreSearhPage.*;

import com.automationpractice.mystore.utils.SortBy;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectProduct implements Task{

	private Target target;

	public SelectProduct(SortBy sortBy) {
		this.target = sortBy.getTarget();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(SORTBY),
				Click.on(target),
				Click.on(FIRST),
				Click.on(PROCEED)				
		);
	}

	public static SelectProduct with(SortBy sortBy) {
		return Tasks.instrumented(SelectProduct.class, sortBy);
	}

}
