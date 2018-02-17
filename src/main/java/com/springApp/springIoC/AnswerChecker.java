package com.springApp.springIoC;

/**
 * This is implementation for {@link AnswerCheckerInterface} interface
 * @author Ihor Savchenko
 * @version 1.0
 */

public class AnswerChecker implements AnswerCheckerInterface {
    public AnswerChecker() {
        System.out.println("AnswerChecker constructor initiated.");
    }

    public void checkAnswer() {
        //Here should be some business logic...
        System.out.println("Now we are checking answer.");
    }
}
