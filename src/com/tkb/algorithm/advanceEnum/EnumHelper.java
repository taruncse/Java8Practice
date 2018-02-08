package com.tkb.algorithm.advanceEnum;

public class EnumHelper {
    public static void printEnum(){
        Seasons.AUTUMN.pringNameOfTheSeason();
    }

    public static void onlyOnce(){
        Seasons seasons = Seasons.SPRING;
        seasons.pringNameOfTheSeason();

        Seasons seasons2 = Seasons.SPRING;
        seasons2.pringNameOfTheSeason();

    }


    public static void abstractEnum(){
        AbstructEnum.SUMMER.showValue();
    }
}
