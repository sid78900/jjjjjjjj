package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Screenshot2 {
	Sceenshot t1 = new Sceenshot();
	@Test
	public void dologin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		
		t1.driver.get("https://www.facebook.com/");
		t1.driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		t1.driver.findElement(By.id("pass")).sendKeys("1234");
		
		//wrong id
		t1.driver.findElement(By.id("wrong id ")).click();
	}
 @AfterMethod
 public void takeScreenShot(ITestResult result2) throws Exception {
	 t1.ss(result2);
 }
 
}
