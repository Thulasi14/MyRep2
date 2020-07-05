package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		
		features = {"./src/test/resources/AModule.feature"},
		
		glue = {"steps"},
		
		//dryRun = true
		strict = true
		)

public class RunnerClass {

}
