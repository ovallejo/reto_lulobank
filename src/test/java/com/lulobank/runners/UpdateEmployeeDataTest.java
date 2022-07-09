package com.lulobank.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/update_employee_data.feature",
        glue = "com.lulobank.stepsdefinitions",
        plugin ={"pretty",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports"}
)
public class UpdateEmployeeDataTest {
}
