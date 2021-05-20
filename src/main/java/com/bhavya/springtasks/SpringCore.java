package com.bhavya.springtasks;

import com.bhavya.springtasks.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCore {
    public static void main(String[] args) {
        ApplicationContext apc = new ClassPathXmlApplicationContext("application_properties.xml");  // IOC -

        Person person  = (Person)apc.getBean("helloBean");
       // person.setName("ABCD");
       // person.passMyMsg("INDIA");
       System.out.println("-->"+person);


        person.display();
    }
}

// IOC 1. Identify beans   2. Resolves the dependencies between the beans. 3. relate the dependencies and controls the bean life cycle.