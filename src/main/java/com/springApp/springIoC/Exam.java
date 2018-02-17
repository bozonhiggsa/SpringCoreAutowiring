package com.springApp.springIoC;

/**
 * This is class for illustration autowiring with config over .xml
 * @author Ihor Savchenko
 * @version 1.0
 */

public class Exam {
    private AnswerCheckerInterface answerChecker;
    private String subject;

    public Exam(AnswerCheckerInterface answerChecker, String subject) {
        this.answerChecker = answerChecker;
        this.subject = subject;
        System.out.println("Exam constructor is initiated.");
    }

    public AnswerCheckerInterface getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerCheckerInterface answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("We've just set answerChecker using setter.");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void examCheck() {
        answerChecker.checkAnswer();
    }
}
