package com.baebin.SerializeExample;

import com.baebin.SerializeExample.entity.Person;
import com.baebin.SerializeExample.manager.PersonManager;
import com.baebin.SerializeExample.util.SerializeUtil;

public class Main {
    public static void main(String[] args) {
        Person bin = new Person("Baebin", "Male", 19, "BB0505");
        p(PersonManager.getData(bin));

        String data = SerializeUtil.serialize(bin);
        p("data: " + data);

        Person person = (Person) SerializeUtil.desrialize(data);
        p(PersonManager.getData(person));
    }

    public static void p(String msg) {
        System.out.println(msg + "\n");
    }
}