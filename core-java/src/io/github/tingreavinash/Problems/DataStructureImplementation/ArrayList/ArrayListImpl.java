package io.github.tingreavinash.Problems.DataStructureImplementation.ArrayList;

public class ArrayListImpl {
    private int size;
    private int capacity;

    private int[] arr;

    ArrayListImpl() {
        arr = new int[5];
        capacity = 5;
        size = 0;
    }

    public void insertAt(int index, int val) {
        if (size == capacity) {
            resize(2 * capacity);
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = val;
        size++;
    }

    public int capacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(int n) {
        if (size == capacity) {
            this.resize(2 * capacity);
        }
        arr[size] = n;
        size = size + 1;
    }

    private void resize(int new_capacity) {
        int[] new_arr = new int[new_capacity];
        for (int i = 0; i < this.size; i++) {
            new_arr[i] = arr[i];
        }
        this.arr = new_arr;
        this.capacity = 2 * capacity;
    }

    public int get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bounds..");
        }

        return arr[index];
    }

    public void set(int index, int val) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bounds..");
        }
        arr[index] = val;
    }

    // Delete element from given index
    public void delete(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bounds..");
        }

        for (int i = index; i < this.size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size = size - 1;

    }

    // Searches given element in array, if found, it will delete that index.
    public void removeElement(int val) throws Exception {
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) {
                this.delete(i);
            }
        }

    }

    public int find(int val) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public void pop() {
        size = size - 1;
    }

}
