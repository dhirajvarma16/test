package cucumber_Prudential_test.Prudential_test;

import org.junit.runner.RunWith;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(cucumber.api.junit.Cucumber.class)
@CucumberOptions(
		features =  +"\\src\\main\\java\\homepage.feature", //the path of the feature files
		glue={"cucumber_Prudential_test.Prudential_test"}
		)