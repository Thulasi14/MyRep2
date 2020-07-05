package scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkHoverAndFetchDataFromNewPage {
	
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();

	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.google.com/search?q=Selenium&rlz=1C1CHBF_enIN848IN848&oq=Selenium&aqs=chrome..69i57j69i59j35i39j69i59j0l4.1748j0j8&sourceid=chrome&ie=UTF-8");

	driver.manage().window().maximize();
	
	WebElement table = driver.findElement(By.xpath("//table[@class='AaVjTc']"));
	
	List<WebElement> rows= table.findElements(By.tagName("tr"));
	
	for(int i=0;i<rows.size();i++) {
		
		List<WebElement> data = table.findElements(By.xpath("//table[@class='AaVjTc']//tr['(i+1)']/td"));
		
		for(int j=0;j<data.size();j++) {
			
			String st = data.get(j).getText();
			
			System.out.println(st);
			
			if(!st.equals("1")){
				
			WebElement wb = driver.findElement(By.linkText(st));
		
			wb.click();
			
			}
		}
	}
	
	//driver.quit();
}
}