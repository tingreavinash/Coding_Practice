package io.github.tingreavinash.Problems.DataStructureImplementation.LinkedList;


public class Runner {
    public static void main(String[] args) throws Exception {

        SinglyLinkedListImpl l = new SinglyLinkedListImpl();

        l.pushFront(11);
        l.pushFront(5);
        l.pushBack(22);
        l.pushBack(33);
        l.pushBack(44);
        l.popFront();
        l.popBack();
        l.addAfter(l.get(0), 25);
        l.addBefore(l.get(0), 15);
        l.deleteIndex(1);
        l.deleteIndex(3);
        l.deleteIndex(0);
        l.deleteIndex(0);
        l.deleteIndex(0);
        //l.pushBack(44);
        //l.pushBack(44);

        int i = 0;
        while (l.get(i) != null) {
            System.out.print(l.get(i).data + " ");
            i++;
        }
        System.out.println("\nSize: " + l.size());

        System.out.println("Element found at: " + l.find(44));

        System.out.println(l.isEmpty());

    }
}
