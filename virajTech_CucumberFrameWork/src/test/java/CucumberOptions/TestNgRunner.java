package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features" , glue="featureStepDefinitions",monochrome = true,plugin= {"pretty","html:target/cucumber.html"})
public class TestNgRunner extends AbstractTestNGCucumberTests {

}
