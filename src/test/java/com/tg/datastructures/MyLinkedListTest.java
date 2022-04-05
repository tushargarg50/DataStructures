package com.tg.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {

    MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();

    @Test
    public void put() {
        for (int i = 1; i < 15; i++) {
            integerMyLinkedList.insertLast(i);
        }
        assertEquals(14, integerMyLinkedList.size());
        integerMyLinkedList.removeFirst();
        assertEquals(13, integerMyLinkedList.size());
        integerMyLinkedList.forEach(System.out::println);
    }
}