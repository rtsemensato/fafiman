package br.com.fafiman.springxmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author fernando
 */
public class MyApp {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Bean theBean = context.getBean("theBean", Bean.class);
        theBean.setName("Ricardo");
        System.out.println("Hello, " + theBean.getName());
        
        Animal cachorro = context.getBean("animal", Animal.class);
        System.out.println(cachorro);
        
        context.close();
    }
}
