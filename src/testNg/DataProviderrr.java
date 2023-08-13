package testNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderrr {
	WebDriver driver;
     @BeforeClass
     public void setEnv() {
    	 
    	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
    		 driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.get("https://www.facebook.com/");
     }
      @DataProvider
     public Object[][] dataset() throws Exception {
    		File src = new File("C:\\Users\\DELL\\eclipse-workspace\\Siddu\\Repository\\oject_repo.properties");
    		
    		//file input stream class object to load the file
    		FileInputStream fis = new FileInputStream(src);
    		
    		//create properties class object to read the file 
    		Properties prop = new Properties();
    		prop.load(fis);
    		
    		Object arr[][] = new Object[3][2];
    		
    		arr[0][0] = prop.getProperty("TestData1");	
    		arr[0][1] = prop.getProperty("TestData2");
    		
    		arr[1][0] = "EMAIL2";
    		arr[1][1] = "PASSWORD";
    				
    		arr[2][0]="email3";
    		arr[2][1]="password3";
    				
    		return arr;
     }
      
      @Test(dataProvider = "dataset")
      public void enterdata(String userName, String password) throws Exception{
    	  Thread.sleep(2000);
    	  driver.findElement(By.id("email")).clear();
    	  Thread.sleep(2000);
    	  driver.findElement(By.id("pass")).clear();
    	  Thread.sleep(2000);
    	  driver.findElement(By.id("email")).sendKeys(userName);
    	  driver.findElement(By.id("pass")).sendKeys(password);
    	  Thread.sleep(2000);
    	  driver.findElement(By.name("login")).click();
    	  Thread.sleep(2000);
    	  driver.navigate().back();
    	  
      }
     
}
