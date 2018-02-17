package com.springApp.springIoC;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * This is class for illustration autowiring with config over Java annotation
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Exam2 {
    private AnswerCheckerInterface answerChecker;

    /**
     * Annotation for constructor
     * @param answerChecker
     */
    @Autowired
    public Exam2(AnswerCheckerInterface answerChecker) {
        this.answerChecker = answerChecker;
    }

    public AnswerCheckerInterface getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerCheckerInterface answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("We've just set answerChecker using setter.");
    }

    public void examCheck() {
        answerChecker.checkAnswer();
    }
}
