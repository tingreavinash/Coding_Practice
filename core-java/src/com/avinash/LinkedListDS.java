package com.avinash;

class Node {
    int data;
    Node next;
}

class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    MyLinkedList() {
        head = tail = null;

        size = 0;
    }

    public void pushFront(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void popFront() throws Exception {
        if (head == null) {
            throw new Exception("Empty list");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            size--;
        }
    }

    public void pushBack(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void popBack() throws Exception {
        if (head == null) {
            throw new Exception("Empty list");
        } else if (head == tail) {
            head = tail = null;
            size--;
        } else {
            Node p = head;
            while (p.next.next != null) {
                p = p.next;
            }
            p.next = null;
            tail = p;
            size--;
        }

    }

    public void addAfter(Node node, int data) {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = node.next;
        node.next = new_node;
        if (tail == node) {
            tail = new_node;
        }
        size++;
    }

    public void addBefore(Node node, int data) throws Exception {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = node;

        if (head == null) {
            throw new Exception("empty list");
        } else if (head == node) {
            head = new_node;
            size++;
        } else {
            Node p = head;
            while (p.next != node) {
                p = p.next;
            }
            p.next = new_node;
            size++;
        }
    }

    public Node get(int index) {
        if (index == 0) {
            return head;
        } else if (index < 0) {
            return null;
        } else {

            Node p = head;
            int i = 1;
            while (i <= index) {
                p = p.next;
                i++;
            }
            return p;
        }
    }

    public int size() {
        return size;
    }


}

public class LinkedListDS {
    public static void main(String[] args) throws Exception {

        MyLinkedList l = new MyLinkedList();

        l.pushFront(11);
        l.pushFront(5);
        l.pushBack(22);
        l.pushBack(33);
        l.pushBack(44);
        l.popFront();
        l.popBack();
        l.addAfter(l.get(0), 25);
        l.addBefore(l.get(0), 15);

        int i = 0;
        while (l.get(i) != null) {
            System.out.print(l.get(i).data + " ");
            i++;
        }
        System.out.println("\nSize: " + l.size());

    }
}
