package com.lulobank.questions;

import com.lulobank.models.Employee;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeesMust {
    private static final List<Employee> employeeList = SerenityRest.lastResponse()
            .body().jsonPath().getList("data", Employee.class);
    private EmployeesMust() {
    }

    public static Performable haveId() {
        return Task.where("All Employees must have an ID", actor -> actor.attemptsTo(
                Ensure.that(employeeList.stream()
                        .filter(emp -> emp.getId() <= 0).collect(Collectors.toList())).hasSize(0)));
    }

    public static Performable haveSalaryGreaterThanZero() {
        return Task.where("All Employees must have an ID", actor ->
                actor.attemptsTo(Ensure.that(employeeList.stream()
                        .filter(emp -> emp.getEmployee_salary() <= 0)
                        .collect(Collectors.toList())).hasSize(0)));
    }

    public static Question<List<Employee>> beLegalAge() {
        return actor -> employeeList.stream().filter(emp -> emp.getEmployee_age() < 18).collect(Collectors.toList());

    }

    public static Question<List<Employee>> haveFirstAndLastName() {
        return actor -> employeeList.stream().filter(emp -> StringUtils.split(emp.getEmployee_name()).length < 2)
                .collect(Collectors.toList());

    }
}
