package com.tg.datastructures;

public class MyArrayList<T> {

    private static final Integer INITIAL_CAPACITY = 10;
    private static final Integer INCREMENT_FACTOR = 2;

    private T[] array;
    private int size;
    private int capacity;

    MyArrayList() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
        capacity = INITIAL_CAPACITY;
    }

    MyArrayList(Integer capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
        this.capacity = capacity;
    }

    void insert(int index, T obj) {
        if (index < capacity) {
            size++;
            array[size - 1] = obj;
        } else {
            throw new RuntimeException("Invalid index!");
        }
    }

    void insert(T obj) {
        if (size < capacity) {
            if (size + 1 >= capacity) {
                increaseArray();
            }
            insert(size + 1, obj);
        } else {
            increaseArray();
            insert(size + 1, obj);
        }
    }

    private void increaseArray() {
        T[] newArr = (T[]) new Object[capacity * INCREMENT_FACTOR];
        for (int i = 0; i < size; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
        capacity = capacity * INCREMENT_FACTOR;
    }

    public int size() {
        return size;
    }

    T delete() {
        return delete(size - 1);
    }

    T delete(int index) {
        T obj = null;
        if (index > size - 1) {
            throw new RuntimeException("Invalid Index!");
        } else {
            obj = array[index];
            for (int i = index; i < size - 2; i++) {
                array[index] = array[index + 1];
            }
            size--;
        }
        return obj;
    }

    public T get(int index) {
        if (index < size - 1)
            return array[index];
        else throw new RuntimeException("Invalid Index!");
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int contains(T obj) {
        int index = -1;
        for(int i=0;i<size;i++) {
            if(array[i]==obj)
                index=i;
        }
        return index;
    }
}
