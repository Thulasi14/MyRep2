package scenarios;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		Iterator<WebElement> it= li.iterator();
		
		while(it.hasNext()) {
			
			String url=it.next().getAttribute("href");
			
			System.out.println(url);
			
			if(url==null || url.isEmpty()) {
				
				System.out.println("Link is not specified");
			}
		
			//driver.findElement(By.linkText(it.next().getAttribute("innerText"))).click();
			
		}
		
		//driver.quit();
	}
}
