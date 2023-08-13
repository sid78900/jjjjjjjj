package seleniumm;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> AllWindowId = driver.getWindowHandles();
		System.out.println(AllWindowId);
		System.out.println(AllWindowId.size());
		
		Iterator<String> abc = AllWindowId.iterator();
		
		String window1 = abc.next();
		String window2 = abc.next();
		
		//print the title of window
		driver.switchTo().window(window2);
		
		System.out.println(window2);
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		//title of parent window
		driver.switchTo().window(window1);
	
		System.out.println(window1);
		System.out.println(driver.getTitle());
		
		

	}

}
