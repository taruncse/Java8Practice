package com.tkb.algorithm.lamda.example1;

public class FilterAnimal {

    public String doFilter (Animal animal, Filter filter){
        if (filter.Test(animal)){
            return animal.toString();
        }else {
            return "No animal is available";
        }
    }
}
