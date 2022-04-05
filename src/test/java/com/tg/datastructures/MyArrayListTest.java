package com.tg.datastructures;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {

    MyArrayList<Integer> integerMyArrayList = new MyArrayList<>();

    @Test
    public void insert() {
        for (int i = 1; i < 15; i++) {
            integerMyArrayList.insert(i);
        }
        assertEquals(14, integerMyArrayList.size());
    }

    @Test
    public void delete() {
        for (int i = 1; i < 15; i++) {
            integerMyArrayList.insert(i);
        }
        integerMyArrayList.delete();
        assertEquals(13, integerMyArrayList.size());
        integerMyArrayList.delete(5);
        assertEquals(Long.valueOf(7), Long.valueOf(integerMyArrayList.get(5)));
        assertEquals(12, integerMyArrayList.size());
    }

    @Test
    public void iterationTest() {
        for (int i = 1; i < 15; i++) {
            integerMyArrayList.insert(i);
        }
        assertEquals(14, integerMyArrayList.size());
        Iterator<Integer> iterator = integerMyArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        integerMyArrayList.delete();
        assertEquals(13, integerMyArrayList.size());
        System.out.println("");
        integerMyArrayList.forEach(System.out::println);
    }

}