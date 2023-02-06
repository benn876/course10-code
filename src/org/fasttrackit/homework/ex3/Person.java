package org.fasttrackit.homework.ex3;

public class Person {
    private String name;
    private String position;
    private Integer age;

    public Person(String name, String position, Integer age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person with position:%s , name:%s , age:%s".formatted(position, name, age);
    }
}
