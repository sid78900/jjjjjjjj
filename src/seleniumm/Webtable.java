package seleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> Wt = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("total companies  "+ Wt.size());
		
		List<WebElement> Wt1 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("current price "+ Wt1.size());
		
	
		String EXP = "RTCL Ltd.";
		
		for(int i=0; i<Wt.size(); i++) {
					if(Wt.get(i).getText().equalsIgnoreCase(EXP)) {
				System.out.println(Wt.get(i).getText() + "====" + Wt1.get(i).getText());
				Wt.get(i).click();
				break;
			}
		}
	}

}
