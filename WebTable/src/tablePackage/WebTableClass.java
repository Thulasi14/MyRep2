package tablePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableClass {
	
	public static void main(String[] args) {
		
		String setProperty = System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\NewMavenWorkspace\\WebTable\\Driver\\chromedriver.exe");
		
		System.out.println(setProperty);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		WebElement table = driver.findElement(By.xpath("//table[@height=\"100%\"]"));
		
		List<WebElement>l=table.findElements(By.tagName("tr"));
		
		System.out.println(l.size());
		
		driver.quit();
	}

}
