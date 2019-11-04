package com.automationpractice.mystore.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class MyStorePurchasePage extends PageObject{
	
	public static final Target  PROCEEDBUY = Target.the("Proceed to checkout").located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
	public static final Target  PROCEEDADD = Target.the("Proceed to checkout address").located(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
	public static final Target  PROCEEDSHIP = Target.the("Proceed to checkout shipping").located(By.xpath("//*[@id=\"form\"]/p/button"));
	public static final Target  CHECKBOX = Target.the("Terms of service").located(By.id("cgv"));
	public static final Target  PAYBANKWIRE = Target.the("Pay by bank wire").located(By.className("bankwire"));
	public static final Target  PAYCHECK = Target.the("Pay by check").located(By.className("cheque"));
	public static final Target  CONFIRM = Target.the("I confirm my order").located(By.xpath("//*[@id=\"cart_navigation\"]/button"));
	public static final Target  COMPLETE = Target.the("Your order on My Store is complete").located(By.xpath("//*[@id=\"center_column\"]/div/p/strong"));
	public static final Target  CONFIRMATION = Target.the("Order confirmation").located(By.className("box"));

}
