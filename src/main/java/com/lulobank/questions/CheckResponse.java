package com.lulobank.questions;

import com.lulobank.models.CreateEmployee;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import static org.hamcrest.Matchers.*;

public class CheckResponse {
    private CheckResponse() {
    }

    public static ResponseConsequence createEmployee() {
        CreateEmployee createEmployee = OnStage.theActorInTheSpotlight().recall("createObject");
        return ResponseConsequence.seeThatResponse(response -> response
                .statusCode(200)
                .body("status", is(equalTo("success")))
                .body("message", equalTo("Successfully! Record has been added."))
                .body("data.name", equalTo(createEmployee.getName()))
                .body("data.salary", equalTo(createEmployee.getSalary()))
                .body("data.id", isA(Integer.class)));
    }
}
