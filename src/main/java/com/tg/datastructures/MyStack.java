package com.tg.datastructures;

import java.util.Iterator;

public class MyStack<T> implements Iterable<T> {

    private final MyLinkedList<T> myLinkedList;

    protected MyStack() {
        myLinkedList = new MyLinkedList<>();
    }

    void push(T obj) {
        myLinkedList.insertFirst(obj);
    }

    T pop() {
        return myLinkedList.removeFirst();
    }

    T peek() {
        return myLinkedList.getFirst();
    }

    public int size() {
        return myLinkedList.size();
    }


    @Override
    public Iterator<T> iterator() {
        return myLinkedList.iterator();
    }
}
