package com.Classes.Main;

import com.Classes.Benas.Student;
import com.Classes.CONFIGFILE.JavaConfigFIle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFIle.class);
        Student student = (Student) context.getBean("stdId");
        student.display();
    }
}

// jar files needed to be downloaded
//1. spring-beans-xxx.jar
//2. spring-core-xxx.jar
//3. spring-context-xxx.jar
//4. common-logging-xxx.jar
//5. spring-expression-xxx.jar


