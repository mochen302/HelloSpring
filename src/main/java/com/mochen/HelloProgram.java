package com.mochen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloProgram {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        HelloWorldService service =
                (HelloWorldService) context.getBean("helloWorldService");

        IHelloWorld hw = service.getHelloWorld();
        hw.sayHello();
    }
}
