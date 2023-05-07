package allFeatures_Modules;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

monochrome=true,
//dryRun= true

features= {"src\\test\\resources\\all_features_file"},
glue ={"allFeatures_Modules"},
plugin= {"pretty","html:target/cucumber-htmlreport.html",
		"json:target/cucumber-report.json"})

public class Test_register_login {

}
