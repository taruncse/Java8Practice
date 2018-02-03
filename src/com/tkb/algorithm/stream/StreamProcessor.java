package com.tkb.algorithm.stream;

import com.tkb.algorithm.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProcessor {
    List<Student> studentList = new ArrayList<Student>(){{

        add(new Student("Tarun",10));
        add(new Student("Dipu",12));
        add(new Student("Barun",3));
        add(new Student("Tulshi",12));
        add(new Student("Ganesh",18));
        add(new Student("Manash",8));
        add(new Student("Jony",11));
        add(new Student("Sachin",10));
        add(new Student("Akhi",19));

        }
    };

    public void process(){
        Stream<Student> stream = studentList.stream();

        Optional<Student> student =
        stream.filter(s -> s.getRoll()>10)
                .min(Comparator.comparing(Student::getRoll));

        System.out.println(student+"");

        Optional<Student> student1 = studentList.stream().max(Comparator.comparing(s->s.getRoll()));
        System.out.println(student1);


        Map<Integer,List<Student>> shortedStudent =
        studentList.stream().collect(Collectors.groupingBy(s->s.getRoll()));
        System.out.println(shortedStudent);

        Map<Integer,Long> shortedStudentCount =
                studentList.stream().collect(Collectors.groupingBy(p->p.getRoll(), Collectors.counting()
                )
        );
        System.out.println(shortedStudentCount);


        Map<Integer,List<String>> shortedStudentName =
                studentList.stream().collect(
                        Collectors.groupingBy(
                                p->p.getRoll(), Collectors.mapping(Student::getName,Collectors.toList())
                        )
                );
        System.out.println(shortedStudentName);

        Map<Integer,Set<String>> shortedStudentSet =
                studentList.stream().collect(
                        Collectors.groupingBy(
                                p->p.getRoll(), Collectors.mapping(Student::getName,Collectors.toCollection(TreeSet::new))
                        )
                );
        System.out.println(shortedStudentSet);

        Map<Integer,String> shortedStudentJoinString=
                studentList.stream().collect(
                        Collectors.groupingBy(
                                p->p.getRoll(), Collectors.mapping(Student::getName,Collectors.joining(","))
                        )
                );
        System.out.println(shortedStudentJoinString);
    }


}
