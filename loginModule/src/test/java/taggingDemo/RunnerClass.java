package taggingDemo;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"./src/test/featureFolder"},
		
		glue = {"taggingDemo"},
		
		tags = {"@Messengers"}
		
		
		)

public class RunnerClass {

}
