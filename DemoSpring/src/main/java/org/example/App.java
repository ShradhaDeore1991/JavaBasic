package org.example;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

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
        StudentBean studentBean = (StudentBean) applicationContext.getBean("st");
        System.out.println(studentBean);


        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("config.xml");
        StudentBean studentBean2 = (StudentBean) applicationContext2.getBean("st");
        System.out.println(studentBean2);
    }
}
