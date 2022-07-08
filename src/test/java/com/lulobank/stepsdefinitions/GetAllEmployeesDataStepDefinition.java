package com.lulobank.stepsdefinitions;

import com.lulobank.integrations.DummyRestApi;
import com.lulobank.questions.EmployeesMust;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.empty;

public class GetAllEmployeesDataStepDefinition {
    @Given("I want get all employee data")
    public void iWantObtainAllEmployeesData() {
        theActorInTheSpotlight().attemptsTo(DummyRestApi.getAllEmployees());
    }

    @Then("All employees must have an ID")
    public void employeesMustHaveAnID() {
        theActorInTheSpotlight().attemptsTo(EmployeesMust.haveId());
    }

    @And("All employees must have a first and last name")
    public void employeesMustHaveAFirstAndLastName() {
        theActorInTheSpotlight().should(seeThat(EmployeesMust.haveFirstAndLastName(), empty()));

    }

    @And("All employees must be of legal age")
    public void employeesMustBeOfLegalAge() {
        theActorInTheSpotlight().should(seeThat(EmployeesMust.beLegalAge(), empty()));

    }

    @And("All employees must have a salary greater than zero")
    public void employeesMustHaveASalaryGreaterThanZero() {
        theActorInTheSpotlight().attemptsTo(EmployeesMust.haveSalaryGreaterThanZero());
    }

    @Then("Status Code {int} and Message {string}")
    public void statusCodeAndMessage(int statusCode, String message) {
        theActorInTheSpotlight().should(seeThatResponse("Employee Rest Service should be correct",
                response -> response.statusCode(statusCode)
                        .body("message", IsEqual.equalTo(message)))
        );
    }

    @Given("I want get employee data with id {int}")
    public void iWantObtainSingleEmployeeData(int id) {
        theActorInTheSpotlight().attemptsTo(DummyRestApi.getEmployeeData(id));

    }
}
