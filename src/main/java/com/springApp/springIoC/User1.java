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
        System.out.println("Setter for name from User1 is used");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Setter for age from User1 is used");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
