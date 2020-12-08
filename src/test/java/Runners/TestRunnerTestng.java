package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features = "E:\\javaselenium\\DemoWebShopMaven\\src\\test\\java\\features" // path of feature file
,glue={"StepDefinitions"}  //path of step definition class
//,tags={"@SuccessfulLogin"} 

,monochrome=true// console output is much more readable
,plugin = {"json:target/cucumber.json"}


)

public class TestRunnerTestng extends AbstractTestNGCucumberTests{

}
