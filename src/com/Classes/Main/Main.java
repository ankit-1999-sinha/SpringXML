package com.Classes.Main;

import com.Classes.Benas.Student;
import com.Classes.CONFIGFILE.JavaConfigFIle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args){

//        String config_loc = "com/Classes/CONFIGFILE/applicationContext.xml";
//        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
//        Student std = (Student) context.getBean("student");
//        std.display();

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFIle.class);
        Student std = (Student) context.getBean("student");
        std.display();
    }
}

// jar files needed to be downloaded
//1. spring-beans-xxx.jar
//2. spring-core-xxx.jar
//3. spring-context-xxx.jar
//4. common-logging-xxx.jar
//5. spring-expression-xxx.jar


