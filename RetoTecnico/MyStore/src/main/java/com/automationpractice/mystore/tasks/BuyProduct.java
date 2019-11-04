package com.automationpractice.mystore.tasks;

import static com.automationpractice.mystore.userinterfaces.MyStorePurchasePage.*;

import com.automationpractice.mystore.utils.PaymentType;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class BuyProduct implements Task{

	private Target payment;

	public BuyProduct(PaymentType payment) {
		this.payment = payment.getTarget();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(PROCEEDBUY),				
				Click.on(PROCEEDADD),				
				Click.on(CHECKBOX),				
				Click.on(PROCEEDSHIP),	
				Click.on(payment),
				Click.on(CONFIRM)
		);
	}

	public static BuyProduct with(PaymentType payment) {
		return new BuyProduct(payment);
	}

}
