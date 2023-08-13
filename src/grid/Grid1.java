package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid1 {
	
@Test
public void hk() throws MalformedURLException {
		
		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	//cap.setPlatform(Platform.WIN10);
	
	WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.148:7777/wd/hub"),cap);

	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.porn.com/");

		
	}

	}


