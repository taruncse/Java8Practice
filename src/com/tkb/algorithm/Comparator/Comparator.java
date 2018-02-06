package com.tkb.algorithm.Comparator;


import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

    int compare(T t1, T t2);

     default Comparator<T> thenComparing (Comparator<T> cmp){

        return (s1,s2) -> compare(s1,s2) == 0 ? cmp.compare(s1,s2): compare(s1,s2);

    }

     default Comparator<T> thenComparing (Function<T,Comparable> f){

        return thenComparing(f);
    }

     static <U>Comparator<U> comparing(Function<U,Comparable> function){

        return (s1,s2)-> function.apply(s1).compareTo(function.apply(s2));

    }
}
