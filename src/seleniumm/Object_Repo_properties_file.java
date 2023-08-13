package seleniumm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_Repo_properties_file {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\DELL\\eclipse-workspace\\Siddu\\Repository\\oject_repo.properties");
		
		//file input stream class object to load the file
		FileInputStream fis = new FileInputStream(src);
		
		//create properties class object to read the file 
		Properties prop = new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.xpath(prop.getProperty("Email"))).sendKeys(prop.getProperty("TestData1"));
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(prop.getProperty("TestData2"));
		
	}

}
