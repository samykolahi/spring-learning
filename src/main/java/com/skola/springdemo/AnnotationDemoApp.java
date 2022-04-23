package com.skola.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Coach coach = context.getBean("tennisCoach", Coach.class);
            System.out.println(coach.getDailyWorkout());
            context.close();
        } catch (Exception e) {
            System.out.println("Shit happened: " + e.getMessage());
        }

    }
}
