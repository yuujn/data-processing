package com.pluralsight.streams;

import com.pluralsight.Person;

import java.util.List;
import java.util.Scanner;

import static com.pluralsight.Person.demoList;

public class Program {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("First Name: ");
        String searchFirst = scan.nextLine();

        List<Person> found = demoList.stream().filter(x -> {
            String lower = x.getFirstName().toLowerCase();
            String search = searchFirst.toLowerCase();
            return lower.contains(search);
        }).toList();
        found.forEach(x -> System.out.println("Similar: " + x.getFullName()));

        double avgAge = demoList.stream()
                .mapToDouble(Person::getAge)
                .sum() / demoList.size();
        List<Integer> ages = demoList.stream().map(Person::getAge).sorted().toList();
        int min = ages.get(0);
        int max = ages.get(ages.size() - 1);
        System.out.printf("Average age: %.2f%n", avgAge);
        System.out.printf("Lowest age: %d%n", min);
        System.out.printf("Highest age: %d%n", max);
    }
}
