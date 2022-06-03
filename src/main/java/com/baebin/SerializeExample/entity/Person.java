package com.baebin.SerializeExample.entity;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String sex;
    private int age;

    private transient String password;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String sex, int age, String password) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}