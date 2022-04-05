package com.tg.datastructures;

import com.tg.datastructures.common.AbstractCollection;

public class MyStack<T> extends AbstractCollection {

    private MyLinkedList<T> myLinkedList;

    protected MyStack() {
        super(0);
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

    @Override
    public int size() {
        return myLinkedList.size();
    }


}
