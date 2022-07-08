package com.lulobank.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/get_employee_data.feature",
        glue = "com.lulobank.stepsdefinitions",
        plugin = "pretty")
public class EmployeeDataTest {
}
