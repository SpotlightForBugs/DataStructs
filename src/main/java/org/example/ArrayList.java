package org.example;

public class ArrayList {

//we create an arraylist of any type and lenght
// we have an array of objects that we can use to store any type of data

    private Object[] array;
    private int size;

    public ArrayList() {
        array = new Object[10];
        size = 0;
    }

    public void add(Object o) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = o;
        size++;
    }

    public Object get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void insert(int index, Object o) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = o;
        size++;
    }

    public void set(int index, Object o) {
        array[index] = o;
    }

    public void clear() {
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }




















}
