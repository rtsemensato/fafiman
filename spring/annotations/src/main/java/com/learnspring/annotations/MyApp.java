package com.learnspring.annotations;

import com.learnspring.annotations.model.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        //read Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

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
