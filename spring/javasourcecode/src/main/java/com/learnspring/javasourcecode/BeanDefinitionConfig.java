package com.learnspring.javasourcecode;

import com.learnspring.javasourcecode.model.Coach;
import com.learnspring.javasourcecode.model.VoleiCoach;
import com.learnspring.javasourcecode.service.FortuneService;
import com.learnspring.javasourcecode.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDefinitionConfig {

    @Bean
    public FortuneService getSadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach getVoleiCoach() {
        return new VoleiCoach(getSadFortuneService());
    }
}
