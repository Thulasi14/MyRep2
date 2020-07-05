package taggingDemo;

import io.cucumber.java.*;

public class Hooks {
	
	@Before
	public void beforeMethod() {
		
		System.out.println("Hooks Before Scenarios");		
		
	}
	
	@After
	public void afterMethod() {
		
		System.out.println("Hooks After Scenarios");		
		
	}
	
	@BeforeStep
	public void beforeStepMEthod(){
		
		System.out.println("Hooks Before every Steps in Scenarios");
	}
	
	@AfterStep
	public void afterStepMEthod(){
		
		System.out.println("Hooks After every Steps in Scenarios");
	}
	
	@Before("@Smoke")
		public void beforeSmoke() {
		
		System.out.println("Before Smoke");
		
	}
	
	@After("@Smoke")
	public void afterSmoke() {
	
	System.out.println("After Smoke");
	
}
		
	}


