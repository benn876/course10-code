package org.fasttrackit.code.files;

import org.fasttrackit.homework.ex3.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ObjectFromFile {
    public static void main(String[] args) throws IOException {
        List<Person> persons = readPersonsFromFile();
        System.out.println(persons);
        writeReport(persons);
    }

    private static void writeReport(List<Person> persons) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/report.txt"));
        for (Person person : persons) {
            bufferedWriter.write(personToLine(person));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    private static String personToLine(Person person) {
        return "%s has age %s and position %s".formatted(person.getName(), person.getAge(), person.getPosition());
    }

    private static List<Person> readPersonsFromFile() throws FileNotFoundException {
        List<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(new File("files", "persons.txt"));

        while (scanner.hasNext()) {
            persons.add(personFromLine(scanner.nextLine()));
        }
        return persons;
    }

    private static Person personFromLine(String line) {
        String[] values = line.split(Pattern.quote("|"));
        return new Person(values[0], values[2], Integer.parseInt(values[1]));
    }
}
