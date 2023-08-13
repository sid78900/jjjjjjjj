package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class gridd01 {
	@Test
	public void hkk() throws MalformedURLException {
			
			
			DesiredCapabilities cap =  DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
		//	cap.setPlatform(Platform.WIN10);
			
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.148:7778/wd/hub"),cap);
		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
}}
