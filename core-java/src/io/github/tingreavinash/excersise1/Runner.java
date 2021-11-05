package io.github.tingreavinash.excersise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Apple", 60000, 8));
        laps.add(new Laptop("Lenovo", 45000, 4));
        laps.add(new Laptop("Dell", 35000, 16));

        Comparator<Laptop> comparator = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if (o1.getPrice() > o2.getPrice()) return 1;
                else if (o1.getPrice() < o2.getPrice()) return -1;
                else return 0;
            }
        };

        Collections.sort(laps, comparator);

        for (Laptop lap : laps) {
            System.out.println(lap);
        }
    }
}
