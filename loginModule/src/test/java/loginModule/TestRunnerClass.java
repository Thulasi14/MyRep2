package loginModule;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//features = {"./src/test/resources/sourcedata.feature"},
		
		features = {"./src/test/resources/scenarioout.feature"},
		
		glue = {"loginModule"},
		
		//dryRun = false,
		
		//strict = true,
		
		monochrome = true,
		
		plugin = {"pretty","html:HTML-Output","junit:XML-Output/index.xml","json:JSON-Output/jsonfile.json"}
		
		//tags = "@Facebook_b"
		)

public class TestRunnerClass {

}
