	package seleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/signup");
	
	List<WebElement> drop = driver.findElements(By.xpath("//select[@id='month']/option"));
	System.out.println(drop.get(2).isEnabled());
	drop.get(3).click();
	
	//Recommend
	WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
	Select month = new Select(bm);
	month.selectByVisibleText("Apr");
	month.selectByValue("10");
	month.selectByIndex(10);
	System.out.println(month.getFirstSelectedOption().getText());
	
	
	WebElement bm2 =  driver.findElement(By.xpath("//select[@id='month']"));
	Select month2 = new Select(bm2);
	
	List<WebElement> dropdown = month2.getOptions();
	for(int i=0; i<dropdown.size(); i++) {
		String dropdownvalues = dropdown.get(i).getText();
        if(dropdownvalues.equalsIgnoreCase(	"Aug")) {
        	dropdown.get(i).click();        }
	}
	
	
}
}
