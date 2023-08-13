package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	
	WebElement Electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(Electro).build().perform();
	Thread.sleep(2000);
	
	act.contextClick().build().perform();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	act.sendKeys(Keys.ENTER).build().perform();
	System.out.println("enter clickred");
	
	WebElement home = driver.findElement(By.xpath("//*[text()='Home']"));
	act.sendKeys(home, Keys.ENTER).build().perform();
	}

}
