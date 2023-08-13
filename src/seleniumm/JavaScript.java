package seleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	
// TYPE CASTING FOR 2 Interface 
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
//LOCATING WEB ELEMENT USING JAVA SCRIPT EXECUTOR

	jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,400)");
	
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,-400)");
	
}




}
