package org.fasttrackit.code;

import org.fasttrackit.homework.ex3.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Set<String> uniqueNames = new HashSet<>();
        names.add("John");
        names.add("John");

        System.out.println(uniqueNames.add("John"));
        System.out.println(uniqueNames.add("John"));
        System.out.println(uniqueNames);

        names.remove("John");
        System.out.println(names.contains("Mihai"));
        System.out.println(names);
        System.out.println(names.get(0));

        names.addAll(List.of("George", "Alex", "Andrei"));
        System.out.println(names);
        names.removeAll(List.of("Andrei", "George"));
        System.out.println(names);
        System.out.println(names.containsAll(List.of("John", "Alex")));
        System.out.println(names.indexOf("Alex"));
        List<Person> persons = List.of(new Person("Mihai", null, 44), new Person("Adi", null, 22),new Person("Ion", null, 66),new Person("Ana", null, 55));
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        priorityQueue.addAll(persons);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());

        Stack<String> fruits = new Stack<>();
        fruits.add("mar");
        fruits.add("para");
        fruits.add("banana");
        System.out.println(fruits);
        System.out.println(fruits.pop());
        System.out.println(fruits.peek());
        System.out.println(fruits);
    }
}
