package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login/login.feature"},
glue = {"StepDefintion"},
tags= "@Login",
dryRun=false,
monochrome=true,
strict=true
//plugin= {"html:testoutput/amrutha.html","junit:testoutput/amrutha.xml","json:testoutput/amrutha.json"}
   )

public class Test_Runner {
	

}

