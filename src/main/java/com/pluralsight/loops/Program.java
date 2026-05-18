package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> demoList = List.of(new Person[]{
                new Person("John", "N", 25),
                new Person("Johnson", "John", 40),
                new Person("Josephson", "Johnson", 36),
                new Person("Abigail", "Johnson", 43),
                new Person("Johnson", "Abigail", 34),
                new Person("Joan", "Joanson", 44),
                new Person("John", "Joanson", 22),
                new Person("Joan", "Johnson", 56),
                new Person("Harriet", "The Spy", 11),
                new Person("King", "Julian", 1111),
        });

        System.out.println(demoList.size());
    }
}
