package com.lulobank.questions;

import com.lulobank.models.CreateEmployee;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.*;

public class CheckResponse {
    private static final String MESSAGE = "message";

    private CheckResponse() {
    }

    public static ResponseConsequence createEmployee() {
        CreateEmployee createEmployee = OnStage.theActorInTheSpotlight().recall("createObject");
        return ResponseConsequence.seeThatResponse(response -> response
                .statusCode(200)
                .body("status", is(equalTo("success")))
                .body(MESSAGE, equalTo("Successfully! Record has been added."))
                .body("data.name", equalTo(createEmployee.getName()))
                .body("data.salary", equalTo(createEmployee.getSalary()))
                .body("data.id", isA(Integer.class)));
    }

    public static ResponseConsequence getAllEmployeesData(int statusCode, String message) {

        return seeThatResponse("Employee Rest Service should be correct",
                response -> response.statusCode(statusCode)
                        .body(MESSAGE, IsEqual.equalTo(message)));
    }

    public static Question<Boolean> statusCodeResponse(int statusCode) {
        return actor -> statusCode == SerenityRest.lastResponse().statusCode();
    }

    public static ResponseConsequence deleteEmployee() {
        String employeeId = OnStage.theActorInTheSpotlight().recall("deleteEmpId");
        return ResponseConsequence.seeThatResponse(response -> response
                .statusCode(200)
                .body("status", is(equalTo("success")))
                .body(MESSAGE, equalTo("Successfully! Record has been deleted"))
                .body("data", equalTo(employeeId))
        );
    }

    public static ResponseConsequence updateEmployeeRecord() {
        CreateEmployee createEmployee = OnStage.theActorInTheSpotlight().recall("createObject");
        return ResponseConsequence.seeThatResponse(response -> response
                .statusCode(200)
                .body("status", is(equalTo("success")))
                .body(MESSAGE, equalTo("Successfully! Record has been updated."))
                .body("data.name", equalTo(createEmployee.getName()))
                .body("data.salary", equalTo(createEmployee.getSalary()))
        );
    }
}
