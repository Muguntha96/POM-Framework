package org.pagetestcase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.pageobjects.Loginpage;
import org.testng.annotations.Test;


public class LoginTestCase {

	@Test
	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\POM-FrameWork\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		Loginpage.username1(driver).sendKeys("Admin");
		Loginpage.password(driver).sendKeys("admin123");
		Loginpage.login(driver).click();
		System.out.println("Login test without page factory");
	}

}
