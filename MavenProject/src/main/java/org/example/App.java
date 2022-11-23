package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Colleague colleague  = (Colleague) applicationContext.getBean("call");
       System.out.println(colleague);

        //Address address = (Address) applicationContext.getBean("add1");
       // System.out.println(address);
    }
}
