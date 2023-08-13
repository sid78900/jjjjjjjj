package seleniumm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMouseSimulation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(	"https://jqueryui.com/droppable/");
			
			List<WebElement> AllFrame = driver.findElements(By.tagName("iframe"));
			System.out.println("total frame  " + AllFrame.size());
			
			driver.switchTo().frame(0);
			WebElement Draggable = driver.findElement(By.id("draggable"));
			
			WebElement Doppable = driver.findElement(By.id("droppable"));
			
			Actions act = new Actions(driver);
			act.dragAndDropBy(Draggable, 40, 100).build().perform();
			act.dragAndDrop(Draggable, Doppable).build().perform();
			
			act.clickAndHold(Draggable).dragAndDropBy(Draggable, 60, 100).build().perform();			

	}

}
