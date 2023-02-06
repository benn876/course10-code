package org.fasttrackit.homework.ex3;

public class MainCompany {
    public static void main(String[] args) {
        Company company = new Company();
        company.employee(new Manager("Mihai",44));
        company.employee(new Manager("George",44));
        company.employee(new Carpenter("Ion",44));
        System.out.println(company.getEmployees());
        System.out.println(company.getPersons("carpenter"));
    }
}
