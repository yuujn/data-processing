package com.pluralsight;

import java.util.List;

public class Person {
    public static List<Person> demoList = List.of(new Person[]{
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

    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }
}
