package com.tkb.algorithm.lamda.example2;

import com.tkb.algorithm.lamda.example1.Animal;

import java.util.function.Predicate;

public class FilterPredicate {
    public static void FilterAnimal(Animal animal, Predicate<Animal> predicate){
        if (predicate.test(animal)){
            System.out.println(animal);
        }

    }
}
