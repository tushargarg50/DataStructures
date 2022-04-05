package com.tg.datastructures;

import java.util.Iterator;

public class MyQueue<T> implements Iterable<T> {

    private final MyLinkedList<T> list;

    MyQueue() {
        list = new MyLinkedList<>();
    }

    public int size() {
        return list.size();
    }

    void insert(T obj) {
        list.insertLast(obj);
    }

    T remove() {
        return list.removeFirst();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
