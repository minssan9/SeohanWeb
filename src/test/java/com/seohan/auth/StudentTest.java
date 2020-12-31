package com.seohan.auth;

import org.junit.Test;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

    @Test
    public void studentSortTest() {
        List<Student> list = new ArrayList<Student>();

        list.add(new Student("e", 5));
        list.add(new Student("d", 10));
        list.add(new Student("c", 1));
        list.add(new Student("b", 52));
        list.add(new Student("a", 23));

        Collections.sort(list);

        list.forEach(student -> System.out.println(student.name));

        Comparator<Student> cp = new Comparator<Student>() {
            @Override
            public int compare(@NotNull Student o1, Student o2) {
                return o2.name.compareTo(o1.name) ;
            }
        };
        Collections.sort(list, cp);
        list.forEach(student -> System.out.println(student.name));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getScore() < s2.getScore()) {
                    return -1;
                } else if (s1.getScore() > s2.getScore()) {
                    return 1;
                }
                return 0;
            }
        });
        list.forEach(student -> System.out.println(student.name));
    }

}


class Student implements Comparable<Student> {
    String name;
    int score;


    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public int compareTo(Student s) {
        if (this.score < s.getScore()) {
            return -1;
        } else if (this.score > s.getScore()) {
            return 1;
        }
        return 0;
    }

//        list.add(new Student("e", 5));
//        list.add(new Student("d", 10));
//        list.add(new Student("c", 1));
//        list.add(new Student("b", 52));
//        list.add(new Student("a", 23));
}
