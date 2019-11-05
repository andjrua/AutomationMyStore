package com.automationpractice.mystore.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation")
public class MyStoreCheckInPage extends PageObject{
	
	public static final Target  FIRSTNAME = Target.the("Fist Name").located(By.id("customer_firstname"));  
	public static final Target  LASTNAME = Target.the("Last Name").located(By.id("customer_lastname"));  
	public static final Target  EMAIL = Target.the("Email").located(By.id("email"));
	public static final Target  PASSWORD = Target.the("Password").located(By.id("passwd"));
	public static final Target  BIRTHDAY = Target.the("Day birth date").located(By.id("days"));
	public static final Target  BIRTHMONT = Target.the("Month birth date").located(By.id("months"));
	public static final Target  BIRTHYEAR = Target.the("Year birth date").located(By.id("years"));
	public static final Target  FIRSTNAMEA = Target.the("Fist Name").located(By.id("firstname"));
	public static final Target  LASTNAMEA = Target.the("Last Name").located(By.id("lastname"));
	public static final Target  ADDRESS = Target.the("Address").located(By.id("address1"));
	public static final Target  CITY = Target.the("City").located(By.id("city"));
	public static final Target  STATE = Target.the("State").located(By.id("id_state"));
	public static final Target  ZIPCODE = Target.the("Zip/Postal Code").located(By.id("postcode"));
	public static final Target  MOBILE = Target.the("Mobile").located(By.id("phone_mobile"));
	public static final Target  ALIASADD = Target.the("Alias address").located(By.id("alias"));
	public static final Target  REGISTER = Target.the("Register").located(By.id("submitAccount"));

}
