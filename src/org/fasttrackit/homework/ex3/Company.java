package org.fasttrackit.homework.ex3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> employees = new ArrayList<>();

    public Person getManager() {
        for (Person employee : employees) {
            if (employee != null && "manager".equals(employee.getPosition())) {
                return employee;
            }
        }
        return null;
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public void employee(Person newEmployee) {
        if (hasManager() && "manager".equals(newEmployee.getPosition())) {
            System.out.println("Cannot add another manager");
        } else {
            this.employees.add(newEmployee);
        }
    }

    private boolean hasManager() {
        for (Person employee : employees) {
            if ("manager".equals(employee.getPosition())) {
                return true;
            }
        }
        return false;
    }

    public List<Person> getPersons(String position) {
        List<Person> result = new ArrayList<>();
        for (Person employee : employees) {
            if (position.equals(employee.getPosition())) {
                result.add(employee);
            }
        }
        return result;
    }
}
