package com.tg.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryHeapMaxTest {

    BinaryHeapMax bhm = new BinaryHeapMax();

    @Test
    public void extract() {
    }

    @Test
    public void insert() {
        bhm.insert(42);
        bhm.insert(29);
        bhm.insert(18);
        bhm.insert(35);
        assertEquals(42, bhm.extract());
        assertEquals(35, bhm.extract());
        assertEquals(29, bhm.extract());
        assertEquals(18, bhm.extract());
    }
}