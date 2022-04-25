package com.skola.springdemo;

import com.skola.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

    public static void main(String[] args) {

        try {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
            Coach coach = context.getBean("tennisCoach", Coach.class);
            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getFortune());
            context.close();
        } catch (Exception e) {
            System.out.println("error happened : \n");
            throw e;
        }
    }
}
