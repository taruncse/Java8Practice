package com.tkb.algorithm;

public class Student {
    String name;
    int roll;

    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public String getName(){
        return name;
    }

    public int getRoll(){
        return roll;
    }

    public String toString(){
        return "Name: "+this.name+" Roll: "+this.roll;
    }
}
