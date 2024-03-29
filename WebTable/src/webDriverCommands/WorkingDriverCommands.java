package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingDriverCommands {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./WebTable/NewDriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

		WebElement uname = driver.findElement(By.id("email"));
		
		System.out.println(uname.getTagName());
		
		Point pt = uname.getLocation();
		System.out.println(pt.x+" "+pt.y);
		
		Dimension size = uname.getSize();
		System.out.println(size.height+" "+size.width);
		
		Rectangle rect = uname.getRect();
		
		System.out.println(rect.getHeight());	
		
	}
}
