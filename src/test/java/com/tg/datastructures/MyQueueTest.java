package com.tg.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyQueueTest {

    MyQueue<Integer> queue = new MyQueue<>();

    @Test
    public void insert() {
        queue.insert(1);
        assertEquals(1, queue.size());
        queue.insert(2);
        assertEquals(2, queue.size());
    }

    @Test
    public void remove() {
        for (int i = 1; i < 6; i++) {
            queue.insert(i);
        }
        assertEquals(Integer.valueOf(1), queue.remove());
        assertEquals(Integer.valueOf(2), queue.remove());
        assertEquals(Integer.valueOf(3), queue.remove());
        assertEquals(2, queue.size());
    }
}