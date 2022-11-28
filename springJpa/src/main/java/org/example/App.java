package org.example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
