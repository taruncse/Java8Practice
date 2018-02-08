package com.tkb.algorithm.advanceEnum;

public enum Seasons {
    WINTER("WINTER"), SUMMER("SUMMER"),SPRING("SPRING"),AUTUMN("AUTUMN");
    String nameOfTheSeason;
    Seasons(String name){
       nameOfTheSeason = name;
    }

    public void pringNameOfTheSeason(){
        System.out.println(nameOfTheSeason);
    }
}
