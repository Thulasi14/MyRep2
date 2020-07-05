package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCheck {
	
		public static void login(String username,String password) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

		WebElement uname = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));	
		
		uname.sendKeys(username);
		pass.sendKeys(password);
		
		WebElement loginbtn = driver.findElement(By.id("u_0_b"));
		loginbtn.click();
	}
}
