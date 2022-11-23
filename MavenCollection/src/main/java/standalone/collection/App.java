package standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone/collection/aloneconfig.xml");
        Person person=(Person) context.getBean("p");
        System.out.println(person);
    }
}
