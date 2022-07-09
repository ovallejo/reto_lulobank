package com.lulobank.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/delete_employee_record.feature",
        glue = "com.lulobank.stepsdefinitions",
        plugin ={"pretty",
                "junit:target/cucumber-reports/cucumber.xml",
                "html:target/cucumber-reports/report-html"}
)
public class DeleteEmployeeRecordTest {
}
