package org.pagefactoryTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.pagefactory.PageFactoryClass;
import org.testng.annotations.Test;


public class PageFactoryTestCase {
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\POM-FrameWork\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver,PageFactoryClass.class);
		PageFactoryClass.username.sendKeys("Admin");
		PageFactoryClass.password.sendKeys("admin123");
		PageFactoryClass.login.click();
		System.out.println("PageFactory with @findby");
	
	}


}
