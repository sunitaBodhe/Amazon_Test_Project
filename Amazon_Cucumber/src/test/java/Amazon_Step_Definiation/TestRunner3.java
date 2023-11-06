package Amazon_Step_Definiation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"Amazon_Step_Definiation"},
plugin={"pretty","html:target/htmlReports/htmlreport.html"})

public class TestRunner3 {

	

}
