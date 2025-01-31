package com.Classes.CONFIGFILE;

import com.Classes.Benas.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigFIle {

    @Bean
    public Student stdId(){
        Student student = new Student();
        student.setName("Ankit");
        student.setRollNo(2);
        return student;
    }
}
