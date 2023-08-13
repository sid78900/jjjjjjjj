package seleniumm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		//specify the location o ile
		File src = new File("C:\\Users\\DELL\\Downloads\\trial_Blade_data.xlsx");
		//load file
		FileInputStream fis = new FileInputStream(src);
		//load the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//load the worksheet
		XSSFSheet sh = wb.getSheet("SAW-2");
		
		//prin the loaded sheet name
		System.out.println(sh.getSheetName());
		
		System.out.println(sh.getRow(3).getCell(3).getStringCellValue());
		
		//total number of rows
		System.out.println(sh.getPhysicalNumberOfRows());
		
		//total num of coloumns
		System.out.println(sh.getRow(1).getPhysicalNumberOfCells());
		
		//REAL TIME USING EXCEL FILE
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(sh.getRow(1).getCell(2).getStringCellValue());
		
	}

}
