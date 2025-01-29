package com.Classes;

public class Student {
    private String name;
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
