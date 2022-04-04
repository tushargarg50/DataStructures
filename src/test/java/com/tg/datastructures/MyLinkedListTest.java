package com.tg.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {

    MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();

    @Test
    public void put() {
        for (int i = 0; i < 15; i++) {
            integerMyLinkedList.put(i);
        }
        assertEquals(15, integerMyLinkedList.size());
    }
}