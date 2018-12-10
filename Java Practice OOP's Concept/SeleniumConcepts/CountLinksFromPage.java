package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinksFromPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		List<WebElement> LinksCount1 = driver.findElements(By.xpath("//a"));		
		System.out.println(LinksCount1.size());	
	}

}
