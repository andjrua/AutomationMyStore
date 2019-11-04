package com.automationpractice.mystore.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class MyStoreHomePage extends PageObject{
	
	public static final Target  CONTACTUS = Target.the("Contact us").located(By.id("contact-link"));
	public static final Target  SIGNIN = Target.the("Sign in").located(By.className("login"));
	public static final Target  SEARCH = Target.the("Search").located(By.id("search_query_top"));
	public static final Target  SEARCHBTTN = Target.the("Search button").located(By.name("submit_search"));
	public static final Target  WOMAN = Target.the("Woman").located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	public static final Target  DRESSES = Target.the("Dresses").located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
	public static final Target  TSHIRT = Target.the("T-shirts").located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
	public static final Target  PRICES = Target.the("T-shirts").located(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[1]/span[1]"));

}
