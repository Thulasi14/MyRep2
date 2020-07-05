package scenarios;

import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.javafx.tk.Toolkit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://demo.guru99.com/test/upload/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.className("upload_txt"));
		
		upload.click();
		
		//upload.sendKeys("C:\\Users\\home\\Desktop\\Thulasi StudyMaterials\\Study Materials\\WebDriver Commands.txt");
		
		
		driver.findElement(By.className("field_check")).click();
		
		driver.findElement(By.id("submitbutton")).click();*/
		
		
		
		
	}

}
