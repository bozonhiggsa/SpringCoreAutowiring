package com.springApp.springIoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * This is class for illustration autowiring with config over Java annotation
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Exam3 {

    private String surname;

    @Autowired
    private User1 user1;

    private User2 user2;

    private User2 user2pro;

    @Autowired
    private Exam3(@Qualifier("user2pro") User2 user2pro, String surname) {
        this.user2pro = user2pro;
        this.surname = surname;
        System.out.println("Exam is created");
    }

    @Autowired
    public void setUser2(User2 user2) {
        this.user2 = user2;
    }

    public String getSurname() {
        return surname;
    }

    public User1 getUser1() {
        return user1;
    }

    public User2 getUser2() {
        return user2;
    }

    public User2 getUser2pro() {
        return user2pro;
    }
}
