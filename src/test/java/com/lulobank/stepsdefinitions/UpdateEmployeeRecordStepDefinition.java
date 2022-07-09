package com.lulobank.stepsdefinitions;

import com.lulobank.integrations.DummyRestApi;
import com.lulobank.questions.CheckResponse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import org.apache.commons.lang3.RandomUtils;

public class UpdateEmployeeRecordStepDefinition {
    @Given("Update Employee Record")
    public void updateEmployeeRecord() {
        OnStage.theActorInTheSpotlight().attemptsTo(DummyRestApi.updateEmployee(String.valueOf(RandomUtils.nextInt(1, 125000))));
    }

    @Then("Check Update Record Request")
    public void checkUpdateRecordRequest() {
        OnStage.theActorInTheSpotlight().should(CheckResponse.updateEmployeeRecord());
    }
}
