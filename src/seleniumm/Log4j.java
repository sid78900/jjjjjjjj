package seleniumm;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
		//create logger instance for loggerfile
		Logger logger = Logger.getLogger("Log4j");
		
		//configure logger file
		PropertyConfigurator.configure("C:\\Users\\DELL\\eclipse-workspace\\Siddu\\log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		logger.info("chrome browser instance opened");
		
		driver.manage().window().maximize();
		logger.info("maximized the window");
		
		driver.get("https://www.facebook.com/");
		logger.info("facebook openeed");
		
		//check if webelement is opened
		try {
		driver.findElement(By.id("email")).isDisplayed();
		logger.info("web element displayed");
		}catch(Exception e) {
			logger.info("failure web element not handled");
		}
		

	}

}
