	package seleniumm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefctory {
	WebDriver driver;
	@FindBy(xpath = "//input[@id='email']")
	WebElement EmailorPhone;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement Password;
	//constructor 
	public Pagefctory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void enterEmail() {
		EmailorPhone.sendKeys("abc@gmai.com");
	}
	public void password() {
		Password.sendKeys("abcd");
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		//class object
		Pagefctory pfc = new Pagefctory(driver);
		pfc.enterEmail();
		pfc.password();
	}
}
