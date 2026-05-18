package com.pluralsight.loops;

import com.pluralsight.Person;

import java.util.ArrayList;
import java.util.Scanner;

import static com.pluralsight.Person.demoList;

public class Program {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
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
