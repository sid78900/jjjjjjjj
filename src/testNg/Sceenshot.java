package testNg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Sceenshot {
	
	WebDriver driver;
	
	public void ss(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE == result.getStatus());
		//create interface ref of takesscreenshot and type casting
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		//use get screenshotas() method tocapture ss in file format
		
		// getscreenshot as() method return type = file
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		
		 //copy file to speciic location
		FileUtils.copyFile(sourcefile, new File("./screenshot/" + result.getName()  + ".png") );
		
		System.out.println(result.getName() + "method() screenshot captured");
	}

}
