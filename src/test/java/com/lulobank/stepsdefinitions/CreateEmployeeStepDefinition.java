package com.lulobank.stepsdefinitions;

import com.lulobank.integrations.DummyRestApi;
import com.lulobank.questions.CheckResponse;
import com.lulobank.tasks.RandomlyGenerated;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class CreateEmployeeStepDefinition {
    @Given("Create Employee Random Data")
    public void createEmployeeRandomData() {
        OnStage.theActorInTheSpotlight().attemptsTo(RandomlyGenerated.employeeData());
    }

    @When("Create Employee")
    public void createEmployee() {
        OnStage.theActorInTheSpotlight().attemptsTo(DummyRestApi.createEmployee());
    }

    @Then("Check Request")
    public void checkRequest() {
        OnStage.theActorInTheSpotlight().should(CheckResponse.createEmployee());
    }
}
