package com.lulobank.stepsdefinitions;

import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import org.hamcrest.Matchers;

public class GetEmployeeDataStepDefinition {
    @And("Employee must have an ID")
    public void employeeMustHaveAnID() {
        OnStage.theActorInTheSpotlight().should(ResponseConsequence.seeThatResponse(validatableResponse ->
                validatableResponse.statusCode(200)
                        .body("data.id", Matchers.greaterThan(0))));
    }

    @And("Employee must have a first and last name")
    public void employeeMustHaveAFirstAndLastName() {
        OnStage.theActorInTheSpotlight().should(ResponseConsequence.seeThatResponse(validatableResponse ->
                validatableResponse.statusCode(200)
                        .body("data.employee_name", Matchers.notNullValue())));
    }

    @And("Employee must be of legal age")
    public void employeeMustBeOfLegalAge() {
        OnStage.theActorInTheSpotlight().should(ResponseConsequence.seeThatResponse(validatableResponse ->
                validatableResponse.statusCode(200)
                        .body("data.employee_age", Matchers.greaterThan(17))));
    }

    @And("Employee must have a salary greater than zero")
    public void employeeMustHaveASalaryGreaterThanZero() {
        OnStage.theActorInTheSpotlight().should(ResponseConsequence.seeThatResponse(validatableResponse ->
                validatableResponse.statusCode(200)
                        .body("data.employee_salary", Matchers.greaterThan(0))));
    }
}
