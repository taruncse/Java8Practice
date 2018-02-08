package com.tkb.algorithm.virtualMethodInvocation;

public class Dog extends Animal {

    @Override
    public void feed() {
        System.out.println("Dog is eating meat");
    }
    public void play(){
        System.out.println("Play with Dog");
    }
}
