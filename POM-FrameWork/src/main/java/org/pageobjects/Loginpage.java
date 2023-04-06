package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	public static WebElement username1(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='Username']"));

	}
	public static WebElement password(WebDriver driver) {
		
		return driver.findElement(By.xpath("//input[@type='password']"));
	}
	public static WebElement login(WebDriver driver) {
		
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}

}
