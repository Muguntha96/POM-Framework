package org.nofindbytestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.pagefactory.withoutfindby.NoFindBy;
import org.testng.annotations.Test;

public class NoFindByTestCase {
@Test
	public void login1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\POM-FrameWork\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver,NoFindBy.class);
		NoFindBy.username.sendKeys("Muguntha");
		NoFindBy.password.sendKeys("Ramkumar@89");
		NoFindBy.signon.click();
		System.out.println("page factory without annoation");
	}
}
