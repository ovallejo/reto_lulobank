package com.lulobank.utils;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;

import java.util.Locale;

public class EmployeeData {
    private EmployeeData() {
    }

    public static Person getPerson() {
        Fairy fairy = Fairy.create(Locale.forLanguageTag("es"));
        return fairy.person();
    }
}
