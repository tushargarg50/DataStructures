package com.tg.datastructures;

public class MyStack<T> {

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


}
