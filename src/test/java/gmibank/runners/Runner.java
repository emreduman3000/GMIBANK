package gmibank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources",
        glue="gmibank/stepdefinitions",
<<<<<<< HEAD
        tags ="@AllStates",
=======
        tags ="@customerDataTest",
>>>>>>> api
        dryRun=false

)

public class Runner {

}




