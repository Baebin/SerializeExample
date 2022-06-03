package com.baebin.SerializeExample.manager;

import com.baebin.SerializeExample.entity.Person;

public class PersonManager {
    public static String getData(Person person) {
        StringBuilder builder = new StringBuilder();

        builder.append("[Person Info] " + person.getName());
        builder.append("\n- Sex: " + person.getSex());
        builder.append("\n- Age: " + person.getAge());
        builder.append("\n- Password: " + person.getPassword());

        return builder.toString();
    }
}
