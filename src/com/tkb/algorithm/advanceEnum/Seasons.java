package com.tkb.algorithm.advanceEnum;

public enum Seasons {
    WINTER("WINTER"), SUMMER("SUMMER"),SPRING("SPRING"),AUTUMN("AUTUMN");
    String nameOfTheSeason;

    // Enum constructor always call once , next time it used previous initialized value.
    Seasons(String name){
       nameOfTheSeason = name;
    }

    public void pringNameOfTheSeason(){
        System.out.println(nameOfTheSeason);
    }
}
