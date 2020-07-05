package scenarios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithGrid {
	
	public static void main(String[] args) throws MalformedURLException {	
		
	URL u=new URL("http://localhost:4444/wd/hub");
	
	DesiredCapabilities cap=new DesiredCapabilities();
	
	////cap.setPlatform(Platform.WIN10);
	//cap.setAcceptInsecureCerts(acceptInsecureCerts);
	
	//cap.setBrowserName("chrome");

	WebDriver driver=new RemoteWebDriver(u,cap);
	driver.get("https://www.facebook.com");

	WebElement uname = driver.findElement(By.id("email"));
	uname.sendKeys("Thulasi");

	}
}