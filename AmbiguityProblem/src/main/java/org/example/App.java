package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Addition addition = (Addition) applicationContext.getBean("add");
       // System.out.println(addition);
        addition.doSum();
    }
}