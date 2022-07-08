package com.lulobank.models;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
@JsonDeserialize(builder = Employee.EmployeeBuilder.class)
public class Employee {
    private int id;
    private String employee_name;
    private double employee_salary;
    private int employee_age;
    private String profile_image;

    @JsonPOJOBuilder(withPrefix="")
    public static class EmployeeBuilder {
    }
}
