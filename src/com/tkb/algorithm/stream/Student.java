package com.tkb.algorithm.stream;

public class Student {
    String name;
    int roll;

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    String getName(){
        return name;
    }

    int getRoll(){
        return roll;
    }

    public String toString(){
        return "Name: "+this.name+" Roll: "+this.roll;
    }
}
