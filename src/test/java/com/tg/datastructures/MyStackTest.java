package com.tg.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyStackTest {

    MyStack<Integer> stack = new MyStack<>();

    @Test
    public void push() {
        stack.push(1);
        assertEquals(1, stack.size());
        stack.push(2);
        assertEquals(2, stack.size());
        assertEquals(Integer.valueOf(2), stack.peek());
    }

    @Test
    public void pop() {
        for (int i = 1; i < 6; i++) {
            stack.push(i);
        }
        assertEquals(Integer.valueOf(5), stack.pop());
        assertEquals(Integer.valueOf(4), stack.pop());
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertEquals(0, stack.size());
    }

    @Test
    public void peek() {
        for (int i = 1; i < 6; i++) {
            stack.push(i);
        }
        assertEquals(Integer.valueOf(5), stack.peek());
        assertEquals(5, stack.size());
    }
}