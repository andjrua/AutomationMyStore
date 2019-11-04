package com.automationpractice.mystore.tasks;

import static com.automationpractice.mystore.userinterfaces.MyStoreHomePage.*;
import static com.automationpractice.mystore.userinterfaces.MyStoreSearhPage.PROCEED;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class BrowseBy implements Task{

	private double price=0;
	private double value=0;
	private int row=0;
	private int higherValue=0;
	private List<WebElementFacade> tabs;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(DRESSES)
		);
		tabs = PRICES.resolveAllFor(actor);
		tabs.forEach(
				data ->{
					value= Double.parseDouble(data.getTextValue().replace("$", "").replace("%", ""));
					if(price<value) {
						price=value;
						higherValue=row+1;
					}
					row++;
				}
		);
		actor.attemptsTo(
				Click.on(Target.the("T-shirts").located(By.xpath("//*[@id=\"center_column\"]/ul/li["+higherValue+"]/div/div[2]/div[2]/a[1]"))),
				Click.on(PROCEED)
		);
		
	 
	}

	public static Performable the() {
		return instrumented(BrowseBy.class);
	}

}
