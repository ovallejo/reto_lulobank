package com.lulobank.stepsdefinitions;

import com.lulobank.integrations.DummyRestApi;
import com.lulobank.questions.CheckResponse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import org.apache.commons.lang3.RandomUtils;

public class DeleteEmployeeRecordStepDefinition {
    @Given("Delete Employee Record")
    public void deleteEmployeeRecord() {
        OnStage.theActorInTheSpotlight().attemptsTo(DummyRestApi.deleteEmployee(String.valueOf(RandomUtils.nextInt(1, 125000))));
    }

    @Then("Check Delete Record Request")
    public void checkDeleteRecordRequest() {
        OnStage.theActorInTheSpotlight().should(CheckResponse.deleteEmployee());
    }
}
