package steps;

import io.cucumber.java.en.Given;

public class StepDef {
	
	@Given("to check the first method")
	public void to_check_the_first_method()
	{
		System.out.println("First Method");
		
	}
	
	@Given("to check the second method")
	public void to_check_the_second_method()
	{
		System.out.println("Second Method");
		
	}

}
