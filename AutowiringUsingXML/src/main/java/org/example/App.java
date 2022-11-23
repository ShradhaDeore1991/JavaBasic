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

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoconfig.xml");
//        //without typecasting
//        Employee employee = applicationContext.getBean("emp",Employee.class);
        //with typecasting
        Employee employee = (Employee)applicationContext.getBean("emp") ;
        System.out.println(employee);
    }
}
