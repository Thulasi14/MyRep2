package featureFileparllel;

import io.cucumber.java.en.Given;

public class Step {
	
	
	@Given("to check first output")
	public void to_check_first_output()
	{
		
		System.out.println("First Output");
	}

}
