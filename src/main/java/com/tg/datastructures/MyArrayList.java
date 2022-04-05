package com.tg.datastructures;

import com.tg.datastructures.common.AbstractCollection;

import java.util.Iterator;

public class MyArrayList<T> extends AbstractCollection implements Iterable {

    private static final Integer INITIAL_CAPACITY = 10;
    private static final Integer INCREMENT_FACTOR = 2;

    private T[] array;
    private int capacity;

    MyArrayList() {
        super(0);
        array = (T[]) new Object[INITIAL_CAPACITY];
        capacity = INITIAL_CAPACITY;
    }

    MyArrayList(Integer capacity) {
        super(0);
        array = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    void insert(int index, T obj) {
        if (index < capacity) {
            setSize(size() + 1);
            array[size() - 1] = obj;
        } else {
            throw new RuntimeException("Invalid index!");
        }
    }

    void insert(T obj) {
        if (size() < capacity) {
            if (size() + 1 >= capacity) {
                increaseArray();
            }
            insert(size() + 1, obj);
        } else {
            increaseArray();
            insert(size() + 1, obj);
        }
    }

    private void increaseArray() {
        T[] newArr = (T[]) new Object[capacity * INCREMENT_FACTOR];
        for (int i = 0; i < size(); i++) {
            newArr[i] = array[i];
        }
        array = newArr;
        capacity = capacity * INCREMENT_FACTOR;
    }

    T delete() {
        return delete(size() - 1);
    }

    T delete(int index) {
        T obj = null;
        if (index > size() - 1) {
            throw new RuntimeException("Invalid Index!");
        } else {
            obj = array[index];
            for (int i = index; i < size() - 2; i++) {
                array[index] = array[index + 1];
            }
            setSize(size() - 1);
        }
        return obj;
    }

    public T get(int index) {
        if (index < size() - 1)
            return array[index];
        else throw new RuntimeException("Invalid Index!");
    }

    public int contains(T obj) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (array[i] == obj)
                index = i;
        }
        return index;
    }

    @Override
    public Iterator iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return array[index] != null && index < size();
            }

            @Override
            public T next() {
                return array[index++];
            }
        };
    }


}
