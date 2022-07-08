package com.lulobank.models;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class CreateEmployee {
    private String name;
    private int salary;
    private int age;
}
