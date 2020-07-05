package loginModule;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class steps {

	WebDriver driver;

	@Given("user launches the url {string}")
	public void user_launches_the_url(String urlValue) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(urlValue);
	}

	@When("user inputs the credentials {string} {string}")
	public void user_inputs_the_credentials(String uvalue, String pvalue) {

	  WebElement uname=driver.findElement(By.id("email")); uname.sendKeys(uvalue);
	  WebElement password=driver.findElement(By.id("pass"));
	  password.sendKeys(pvalue);
	  }

	@And("user clicks login")
	public void user_clicks_login() {

		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
	}

	@Then("user verifies the login page")
	public void user_verifies_the_login_page() {

		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}
	
	/*
	 * @When("user inputs the credentials") 
	 * public void user_inputs_the_credentials(DataTable table) {
	 * 
	 * List<String> cred=table.asList();
	 * 
	 * String uvalue=cred.get(0); 
	 * String pvalue=cred.get(1);
	 * 
	 * WebElement uname=driver.findElement(By.id("email")); 
	 * uname.sendKeys(uvalue);
	 * WebElement password=driver.findElement(By.id("pass"));
	 * password.sendKeys(pvalue); }
	 */

	/*
	 * @When("user inputs the credentials") public void
	 * user_inputs_the_credentials(DataTable table) {
	 * 
	 * List<List<String>> cred=table.asLists();
	 * 
	 * String uvalue=cred.get(2).get(0); 
	 * String pvalue=cred.get(2).get(1);
	 * 
	 * WebElement uname=driver.findElement(By.id("email")); uname.sendKeys(uvalue);
	 * WebElement password=driver.findElement(By.id("pass"));
	 * password.sendKeys(pvalue); }
	 */

	/*
	 * @When("user inputs the credentials") public void
	 * user_inputs_the_credentials(DataTable table) {
	 * 
	 * List<Map<String,String>> cred=table.asMaps(String.class, String.class);
	 * 
	 * String uvalue=cred.get(1).get("UserName"); String
	 * pvalue=cred.get(1).get("Password");
	 * 
	 * WebElement uname=driver.findElement(By.id("email")); uname.sendKeys(uvalue);
	 * WebElement password=driver.findElement(By.id("pass"));
	 * password.sendKeys(pvalue); }
	 */

	

}
