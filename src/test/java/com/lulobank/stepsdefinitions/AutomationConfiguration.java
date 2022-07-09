package com.lulobank.stepsdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.core.annotations.events.AfterScenario;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

public class AutomationConfiguration {

    private EnvironmentVariables environmentVariables;

    @Before
    public void preConfig() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Cliente");
        String baseURL = environmentVariables.optionalProperty("env.dummy.base.url").orElseThrow(IllegalArgumentException::new);
        OnStage.theActorInTheSpotlight().can(CallAnApi.at(baseURL));
    }

    @AfterScenario
    public void printResponse() {
        SerenityRest.lastResponse().body().prettyPrint();
        SerenityRest.reset();
    }


}
