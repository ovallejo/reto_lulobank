package com.lulobank.integrations;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DummyRestApi {
    private DummyRestApi() {
    }

    public static Performable getAllEmployees() {
        return Task.where("Dummy Get All Employees Rest Service", Get.resource("employees"));
    }

    public static Performable getEmployeeData(int employeeId) {
        return Task.where("Dummy Get Employee Rest Service", Get.resource("employee/{id}").
                with(request -> request.pathParam("id", employeeId)));
    }

    public static Performable createEmployee() {
        return Task.where("Dummy Create Employee Rest Service", Post.to("create")
                .with(request -> request.body(theActorInTheSpotlight().recall("createBody").toString())));
    }

    public static Performable updateEmployee(int employeeId) {
        return Task.where("Dummy Update Employee Data Rest Service", Put.to("update/{id}")
                .with(request -> request.pathParam("id", employeeId)));
    }

    public static Performable deleteEmployee(int employeeId) {
        return Task.where("Dummy Delete Employee Data Rest Service", Delete.from("delete/{id}")
                .with(request -> request.pathParam("id", employeeId)));
    }
}
