package com.learnspring.javasourcecode;

import com.learnspring.javasourcecode.model.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        //read Spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Coach oneCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println(oneCoach.getDailyWorkout());
        System.out.println(oneCoach.getDailyFortune());

        Coach twoCoach = context.getBean("trackCoach", Coach.class);
        System.out.println(twoCoach.getDailyWorkout());
        System.out.println(twoCoach.getDailyFortune());

        Coach threeCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(threeCoach.getDailyWorkout());
        System.out.println(threeCoach.getDailyFortune());

        Coach fourCoach = context.getBean("soccerCoach", Coach.class);
        System.out.println(fourCoach.getDailyWorkout());
        System.out.println(fourCoach.getDailyFortune());

        context.close();
    }
}
