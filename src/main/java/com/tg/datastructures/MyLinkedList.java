package com.tg.datastructures;

import com.tg.datastructures.common.AbstractCollection;

public class MyLinkedList<T> extends AbstractCollection {

    Node<T> head;

    MyLinkedList() {
        super(0);
        head = null;
    }

    void put(T obj) {
        if (size() == 0) {
            head = new Node<>(obj, null);
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(obj, null);
        }
        setSize(size() + 1);
    }

    class Node<T> {
        T data;
        Node<T> next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
