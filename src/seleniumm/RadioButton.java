package seleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/signup");
	
	driver.findElement(By.className("_58mt")).click();
	
	List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println("total radio button : "+ radios.size());
System.out.println(radios.get(2).isSelected());
System.out.println(radios.get(2).isEnabled());

List<WebElement> radios2 = driver.findElements(By.xpath("//label[contains(@class,mt)]"));

System.out.println(radios2.size());

String ExpResult = "Custom";
for (int i=0; i < radios2.size(); i++ ) {
	if(radios2.get(i).getText().equalsIgnoreCase(ExpResult)) {
	radios2.get(i).click();
	Thread.sleep(2000);
	System.out.println(ExpResult + "clicked");
	break;
}
	}

}
}