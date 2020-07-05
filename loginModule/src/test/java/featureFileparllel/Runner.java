package featureFileparllel;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"./src/test/featurepll/data1.feature"},
		
		glue = {"featureFileparllel"},
		
		//strict = true
		
																																		dryRun=true
		)

public class Runner {

}
