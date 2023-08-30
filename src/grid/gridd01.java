package grid;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gridd01 {
	
	WebDriver driver;
			
			
	@Test
	public void setup() throws MalformedURLException{
		 ChromeOptions opt = new ChromeOptions();
		
		 opt.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
                 UnexpectedAlertBehaviour.IGNORE);
			
			 driver = new RemoteWebDriver(new URL("http://192.168.1.148:7655/wd/hub"),opt);
		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
}}
