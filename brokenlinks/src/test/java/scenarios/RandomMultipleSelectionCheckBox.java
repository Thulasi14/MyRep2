package scenarios;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomMultipleSelectionCheckBox {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/home/Desktop/Thulasi%20StudyMaterials/MultiSelectDropdown.html");
		
		WebElement dp = driver.findElement(By.name("cars"));
		
		Select s=new Select(dp);
		
		List<WebElement> all = s.getOptions();
		
		for(int i=0;i<4;i++) {
			
			int randomNumber = ThreadLocalRandom.current().nextInt(0, all.size());
			
			System.out.println(randomNumber);
			
			s.selectByIndex(randomNumber);
		}
	}

}
