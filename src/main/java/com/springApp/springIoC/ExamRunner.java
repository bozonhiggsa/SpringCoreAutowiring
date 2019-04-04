package com.springApp.springIoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * entry point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        System.out.println("-------------------------------");
        System.out.println("Context is created");
        System.out.println("-------------------------------");

        Exam exam = context.getBean("exam", Exam.class);
        exam.examCheck();
        System.out.println(exam.getSubject());

        Exam2 exam2 = (Exam2) context.getBean("exam2");
        exam2.examCheck();

        Exam3 exam3 = (Exam3) context.getBean("exam3");
        System.out.println(exam3.getUser1().getName() + " : " + exam3.getUser1().getAge());
        System.out.println(exam3.getUser2().getName() + " : " + exam3.getUser2().getAge());
        System.out.println(exam3.getUser2pro().getName() + " : " + exam3.getUser2pro().getAge());
        System.out.println(exam3.getSurname());
    }
}
