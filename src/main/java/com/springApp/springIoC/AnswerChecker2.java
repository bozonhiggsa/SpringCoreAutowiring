package com.springApp.springIoC;

/**
 * This is implementation for {@link AnswerCheckerInterface} interface
 * @author Ihor Savchenko
 * @version 1.0
 */

public class AnswerChecker2 implements AnswerCheckerInterface {
    public AnswerChecker2() {
        System.out.println("AnswerChecker2 constructor initiated");
    }

    public void checkAnswer() {
        //Here should be some business logic...
        System.out.println("Now we are checking answer from AnswerChecker2");
    }
}
