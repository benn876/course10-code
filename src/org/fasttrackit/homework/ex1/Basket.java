package org.fasttrackit.homework.ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Basket {
    private final List<String> fruits;

    public Basket(List<String> fruits) {
        if (fruits == null) {
            this.fruits = new ArrayList<>();
        } else {
            this.fruits = new ArrayList<>(fruits);
        }
    }

    public List<String> getFruits() {
        return fruits;
    }

    public boolean find(String fruitName) {
        return fruits.contains(fruitName);
    }

    public boolean remove(String fruitName) {
        return fruits.remove(fruitName);
    }

    public Set<String> distinct() {
        HashSet<String> distinct = new HashSet<>();
        for (String fruit : fruits) {
            distinct.add(fruit);
        }
        return distinct;
    }
}
