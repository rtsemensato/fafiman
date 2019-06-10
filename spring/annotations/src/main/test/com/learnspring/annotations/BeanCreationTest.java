package com.learnspring.annotations;

import com.learnspring.annotations.model.Coach;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCreationTest {

    ClassPathXmlApplicationContext context;

    @Before
    public void setup() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testSingletonScope() {
        Coach oneCoach = context.getBean("baseballCoach", Coach.class);
        Coach twoCoach = context.getBean("baseballCoach", Coach.class);
        Coach threeCoach = context.getBean("trackCoach", Coach.class);

        Assert.assertEquals(oneCoach, twoCoach);
        Assert.assertNotEquals(oneCoach, threeCoach);
    }

    @Test
    public void testPrototypeScope() {
        Coach oneCoach = context.getBean("soccerCoach", Coach.class);
        Coach twoCoach = context.getBean("soccerCoach", Coach.class);

        Assert.assertNotEquals(oneCoach, twoCoach);
    }

    @After
    public void tearDown() {
        context.close();
    }
}
