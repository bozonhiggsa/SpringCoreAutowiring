package com.springApp.springIoC;

/**
 * Model
 * @author Ihor Savchenko
 * @version 1.0
 */
public class User1 {

    private String name;
    private int age;

    public User1() {
        System.out.println("User1 is created");
    }

    public void setName(String name) {
        this.name = name;
    }

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
