
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/features"
		,strict = true
		,glue={"stepdefinitions"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	
	
	
	
}