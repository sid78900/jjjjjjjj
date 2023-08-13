package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Asseration1 {

	WebDriver driver;
	@Test
	public void testcase1() throws Exception {
		String ExpResult = "Sorry, we don't recognize this email.";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
	String ActualMsg =	driver.findElement(By.id("username-error")).getText();
		
		Assert.assertEquals(ActualMsg, ExpResult);
		System.out.println("error message varified");
		
		Assert.assertFalse(driver.findElement(By.id("username-error")).isSelected());
		System.out.println("false asseartion varified");
		
		Assert.assertFalse(driver.findElement(By.id("username-error")).isDisplayed());
		System.out.println("true assertion variied");
		}
}
