package com.tkb.algorithm;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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



        //streamAndPredicat();

        flatMap();
    }
    interface Calculate{
        int sum (int a, int b);
    }

    static void streamAndPredicat(){

        Stream<String> stream = Stream.of("One","Two","Three","Four","Five");

        //Printing all values
        //stream.forEach(s -> System.out.println(s));

        Predicate<String> predicate1 = s -> s.contains("Two");
        Predicate<String> predicate2 = s -> s.contains("Three");

        //Consumer<String> consumer = s -> System.out.println(s);

        //stream.filter(predicate1.or(predicate2)).forEach(consumer);

        ///Intermediary operation using peek
        List<String> newList = new ArrayList<>();
        stream.peek(System.out::println)//Peek will return the statement as intermediary
                .filter(predicate1.or(predicate2))
                .forEach(newList::add);// final operation new list is created and print.
    }

    public static void flatMap(){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(3,4,5);
        List<Integer> list3 = Arrays.asList(6,7,8,9);

        List<List<Integer>> lists = Arrays.asList(list1,list2,list3);
        System.out.print(lists);

        Stream<List<Integer>> stream = lists.stream();

        /*stream.map(l->l.size())
                .forEach(System.out::println);*/

        Function<List<?>,Integer> function = List::size;

        Function<List<Integer>,Stream<Integer>> flatStream = l->l.stream();

        /*stream.map(flatStream)
                .forEach(System.out::println);*/
        //we can use flat map instead of stream
        stream.flatMap(flatStream)
                .forEach(System.out::println);

    }
}
