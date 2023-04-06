package org.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryClass {
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	public static WebElement username;
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement login;

}
