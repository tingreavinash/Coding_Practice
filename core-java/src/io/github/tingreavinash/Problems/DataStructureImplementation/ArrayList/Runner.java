package io.github.tingreavinash.Problems.DataStructureImplementation.ArrayList;


public class Runner {
    public static void main(String[] args) throws Exception {
        ArrayListImpl arr = new ArrayListImpl();

        arr.push(10);
        arr.push(20);
        arr.push(30);
        arr.push(40);
        arr.push(50);

        arr.set(0, 100);
        arr.push(60);
        arr.set(3, 400);
        //arr.delete(3);
        //arr.delete(4);
        //arr.delete(0);
        //arr.pop();
        arr.push(20);
        //arr.removeElement(20);
        arr.delete(6);
        arr.insertAt(1, 99);

        System.out.println(arr.get(1));
        System.out.println("Array size: " + arr.size());

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
