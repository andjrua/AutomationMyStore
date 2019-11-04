package com.automationpractice.mystore.utils;

import static com.automationpractice.mystore.userinterfaces.MyStorePurchasePage.*;

import net.serenitybdd.screenplay.targets.Target;

public enum PaymentType {

	PAYBANK_WIRE(PAYBANKWIRE),
	PAY_CHECK(PAYCHECK);
	
	private Target payment;
	
	private PaymentType(Target payment) {
		this.payment = payment;
	}
	
	public Target getTarget() {
		return payment;
	}
}
