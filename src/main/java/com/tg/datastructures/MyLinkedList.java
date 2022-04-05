package com.tg.datastructures;

import com.tg.datastructures.common.AbstractCollection;

public class MyLinkedList<T> extends AbstractCollection {

    Node<T> head;

    MyLinkedList() {
        super(0);
        head = null;
    }

    void clear() {
        head = null;
        setSize(0);
    }

    T removeLast() {
        if (size() == 0) {
            throw new RuntimeException("Linked List Empty!");
        } else {
            Node<T> currentNode = head;
            for (int i = 0; i < size() - 1; i++) {
                currentNode = currentNode.next;
            }
            T data = currentNode.next.data;
            currentNode.next = null;
            return data;
        }
    }

    T removeFirst() {
        if (size() == 0) {
            throw new RuntimeException("Linked List Empty!");
        } else {
            T data = head.data;
            if (head.next != null) {
                head = head.next;
            } else {
                head = null;
            }
            setSize(size()-1);
            return data;
        }
    }

    T getFirst() {
        if (size() == 0) {
            throw new RuntimeException("Linked List Empty!");
        } else {
            return head.data;
        }
    }

    T getLast() {
        if (size() == 0) {
            throw new RuntimeException("Linked List Empty!");
        } else {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }
    }

    void insertFirst(T obj) {
        if (size() == 0) {
            head = new Node<>(obj, null);
        } else {
            Node newNode = new Node(obj, head);
            head = newNode;
        }
        setSize(size() + 1);
    }

    void insertLast(T obj) {
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

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
