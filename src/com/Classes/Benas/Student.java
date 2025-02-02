package com.Classes.Benas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Ankit")
    private String name;
    @Value("2")
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void display(){
        System.out.println("name" + name);
        System.out.println("RollNo"+ rollNo);
    }
}
