package com.tkb.algorithm.Comparator;

import com.tkb.algorithm.Student;

import java.util.function.Function;

public class ComparatorProcessor {

    Comparator<Student> comparatorRoll = (s1,s2)->s1.getRoll() - s2.getRoll();

    Comparator<Student> comparatorName = (s1,s2)->s1.getName().compareTo(s2.getName());

    Function<Student,Integer> functionRoll = s->s.getRoll();
    Function<Student,String> functionName = s->s.getName();

    Comparator<Student> compStudentRoll = Comparator.comparing(s->s.getRoll());

    Comparator<Student> comStudentName = Comparator.comparing(Student::getName);

    Comparator<Student> com = compStudentRoll.thenComparing(comparatorName);

    Comparator<Student>comparator = Comparator.comparing(Student::getName)
            .thenComparing(Student::getRoll);

}
