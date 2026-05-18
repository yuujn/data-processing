package com.pluralsight.streams;

import com.pluralsight.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static Scanner scan = new Scanner(System.in);

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

        System.out.print("First Name: ");
        String searchFirst = scan.nextLine();

        ArrayList<Person> found = new ArrayList<>();

        for (Person person : demoList) {
            if (person.getFirstName().toLowerCase().contains(searchFirst.toLowerCase())) {
                found.add(person);
            }
        }

        for (Person person : found) {
            System.out.println("Similar: " + person.getFullName());
        }

        double avgAge = 0.0;
        int min = demoList.get(0).getAge();
        int max = demoList.get(0).getAge();
        for (Person person : demoList) {
            avgAge += person.getAge();
            if (person.getAge() < min) {
                min = person.getAge();
            }
            if (person.getAge() > max) {
                max = person.getAge();
            }
        }
        avgAge /= demoList.size();
        System.out.printf("Average age: %.2f%n", avgAge);
        System.out.printf("Lowest age: %d%n", min);
        System.out.printf("Highest age: %d%n", max);
    }
}
