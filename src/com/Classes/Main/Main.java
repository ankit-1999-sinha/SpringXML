package com.Classes.Main;

import com.Classes.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        String config_loc = "com/Classes/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
        Student std = (Student) context.getBean("stdId");
        std.display();
    }
}

// jar files needed to be downloaded
//1. spring-beans-xxx.jar
//2. spring-core-xxx.jar
//3. spring-context-xxx.jar
//4. common-logging-xxx.jar
//5. spring-expression-xxx.jar


