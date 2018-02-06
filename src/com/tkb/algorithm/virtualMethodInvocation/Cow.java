package com.tkb.algorithm.virtualMethodInvocation;

public class Cow extends Animal {
    public String name = "Cow";
    @Override
    public void feed() {
        System.out.println("Cow is eating grass");
    }
}
