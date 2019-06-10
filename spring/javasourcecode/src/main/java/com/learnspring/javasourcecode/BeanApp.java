package com.learnspring.javasourcecode;

import com.learnspring.javasourcecode.model.VoleiCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanDefinitionConfig.class);

        VoleiCoach coach = context.getBean("getVoleiCoach", VoleiCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
