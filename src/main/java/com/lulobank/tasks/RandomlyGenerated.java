package com.lulobank.tasks;

import com.devskiller.jfairy.producer.person.Person;
import com.google.gson.Gson;
import com.lulobank.models.CreateEmployee;
import com.lulobank.utils.EmployeeData;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.apache.commons.lang3.RandomUtils;

public class RandomlyGenerated {
    private RandomlyGenerated() {
    }

    public static Performable employeeData() {
        return Task.where("Create Employee Date", actor -> {
            Person person = EmployeeData.getPerson();
            CreateEmployee createEmployee = CreateEmployee.builder()
                    .name(person.getFullName())
                    .age(person.getAge())
                    .salary(RandomUtils.nextInt(1, 125000)).build();
            Gson gson = new Gson();
            actor.remember("createBody", gson.toJson(createEmployee));
            actor.remember("createObject", createEmployee);
        });
    }
}
