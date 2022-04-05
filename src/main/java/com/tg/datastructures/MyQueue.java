package com.tg.datastructures;

public class MyQueue<T> {

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
}
