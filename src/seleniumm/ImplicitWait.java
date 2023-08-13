package seleniumm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			 driver.findElement(By.name("q")).sendKeys("how stuff works");
			 
			 // HANDLING AUTO SUGGESTION 
			 
			 List<WebElement> allSuggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
			 System.out.println("total suggestion ; "+ allSuggestion.size());
			 
			 for(int i=0; i<allSuggestion.size(); i++) {
				 String ExpResult = "how stuff works computer";
				 if(allSuggestion.get(i).getText().equalsIgnoreCase(ExpResult)) {
					 allSuggestion.get(i).click();
					 break;
					 }
			 }

		}

	}


