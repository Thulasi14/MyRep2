package taggingDemo;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;


public class ImplementationClass {
	

	  @Given("execution on top of all scenarios {string}") 
	  public void backGroundMethod(String string) {
		  System.out.println(string); 
	  }
	
	@Given("to execute method1 {string}")
	public void to_execute_method1(String string) {
	   System.out.println(string);
	}

	@Given("to execute method2 {string}")
	public void to_execute_method2(String string) {
		System.out.println(string);
	}

	@Given("to execute method3 {string}")
	public void to_execute_method3(String string) {
		System.out.println(string);
	}

	@Given("to execute method4 {string}")
	public void to_execute_method4(String string) {
		System.out.println(string);
	}

	@Given("to execute method5 {string}")
	public void to_execute_method5(String string) {
		System.out.println(string);
	}

	@Given("to execute method6 {string}")
	public void to_execute_method6(String string) {
		System.out.println(string);
	}
	
	@Given("to check the same {string}")
	public void to_check_the_same(String string) {
		System.out.println(string);
	}
	
	

	@Given("to execute method7 {string}")
	public void to_execute_method7(String string) {
		System.out.println(string);
	}

	@Given("to execute method8 {string}")
	public void to_execute_method8(String string) {
		System.out.println(string);
	}

	@Given("to execute method9 {string}")
	public void to_execute_method9(String string) {
		System.out.println(string);
	}

}
