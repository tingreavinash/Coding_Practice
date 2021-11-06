package io.github.tingreavinash.Problems.InterviewProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop implements Comparable<Laptop> {

    private String brand;
    private int price;
    private int ram;

    public Laptop(String brand, int price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }

    @Override
    public int compareTo(Laptop o) {

        if (this.getRam() > o.getRam()) return 1;
        else if (this.getRam() < o.getRam()) return -1;
        else return 0;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Apple", 60000, 8));
        laps.add(new Laptop("Lenovo", 45000, 4));
        laps.add(new Laptop("Dell", 35000, 16));

        Comparator<Laptop> comparator = (o1, o2)-> {
            if (o1.getPrice() > o2.getPrice()) return 1;
            else if (o1.getPrice() < o2.getPrice()) return -1;
            else return 0;
        };

        Collections.sort(laps, comparator);

        for (Laptop lap : laps) {
            System.out.println(lap);
        }
    }
}
