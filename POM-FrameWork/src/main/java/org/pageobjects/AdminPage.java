package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {
	
	
	public static WebElement admin(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='Admin']"));
	}
	public static WebElement username(WebDriver driver) {
	return driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));

	}
	public static WebElement search(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='submit']"));

	}
	
}
