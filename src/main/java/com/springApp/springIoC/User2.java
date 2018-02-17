package com.springApp.springIoC;

import org.springframework.beans.factory.annotation.Required;

/**
 * Model
 * @author Ihor Savchenko
 * @version 1.0
 */
public class User2 {

    private String name;
    private int age;

    public User2() {
        System.out.println("User2 is created");
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    @Required
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
