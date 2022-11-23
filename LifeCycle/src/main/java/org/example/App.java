package org.example;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("cnfg.xml");
        Mango mango = (Mango)applicationContext.getBean("m");
        System.out.println(mango);

        //registering shutdown hook for inform to compiler in our code destroy method is present
        applicationContext.registerShutdownHook();
    }
}
