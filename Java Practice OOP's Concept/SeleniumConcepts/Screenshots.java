package SeleniumConcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dstFile = new File ("c:\\tmp\\screenshot.png");

		FileUtils.copyFile(scrFile, dstFile);
        
        System.out.println("ScreenShot Taken & Saved");
        driver.close();
	}

}
