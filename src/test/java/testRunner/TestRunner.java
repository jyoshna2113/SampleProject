package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features="src\\test\\java\\Features\\Feature2.feature",
		glue= {"Stepdefinition"},
		dryRun=false,
		monochrome= true,
		
		tags= {"@sanity"}
		
		)


public class TestRunner {

}
