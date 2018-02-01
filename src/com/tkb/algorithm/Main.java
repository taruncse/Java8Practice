package com.tkb.algorithm;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*Calculate calculate = new Calculate() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };*/

        /*Calculate lamda = (a,b) -> a+b;

        System.out.println(lamda.sum(5,9));

        Comparator<Integer> comparator =  Integer :: compare;

        System.out.print(comparator.compare(12,10));*/


        /*List<String> name = new ArrayList<String>(){{
            add("Tarun");
            add("barun");
            add("Indro");
        }};*/

        //List<String> title = Arrays.asList("Biswas","Bala");

        /*name.forEach(a -> {
            String c = "";
            c = c+a;
            System.out.print(c);
        });*/

        /*List<String> newName = new ArrayList<>();

        Consumer<String> consumer = s -> System.out.println(s);
        name.forEach(consumer);

        Consumer<String> consumer1 = System.out::println;
        name.forEach(consumer1);

        Consumer<String>consumer2 = s -> newName.add(s);
        //Consumer<String>consumer2 = newName::add;
        name.forEach(consumer1.andThen(consumer2));
        System.out.println("--------------");
        newName.forEach(consumer);*/
        streamAndPredicat();
    }
    interface Calculate{
        int sum (int a, int b);
    }

    void streamAndPredicat(){

        Stream<String> stream = Stream.of("First","Second","Third","Fourth","Fifth");

    }
}
