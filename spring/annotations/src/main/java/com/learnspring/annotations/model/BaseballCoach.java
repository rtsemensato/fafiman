package com.learnspring.annotations.model;

import com.learnspring.annotations.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("baseballCoach")
public class BaseballCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Practice hand launch!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
