package org.fasttrackit.homework.ex1;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> fruitsLinked = new LinkedList<>(List.of("mar", "para","mar", "para"));
        Basket basket = new Basket(fruitsLinked);
        System.out.println(basket.getFruits());
        fruitsLinked.add("pruna");
        System.out.println(basket.getFruits());

        Basket basket2 = new Basket(null);
        System.out.println(basket2.getFruits());

        System.out.println(basket.find("mar"));
//        System.out.println(basket.remove("para"));

        System.out.println(basket.distinct());
    }
}
