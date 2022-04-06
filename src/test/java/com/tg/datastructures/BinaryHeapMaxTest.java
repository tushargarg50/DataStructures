package com.tg.datastructures;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryHeapMaxTest {

    BinaryHeapMax bhm = new BinaryHeapMax();

    @Test
    public void extract() {
        bhm.insert(81);
        bhm.insert(89);
        bhm.insert(9);
        bhm.insert(11);
        bhm.insert(14);
        bhm.insert(76);
        bhm.insert(54);
        bhm.insert(22);
        assertEquals(89, bhm.extract());
        assertEquals(81, bhm.extract());
        assertEquals(76, bhm.extract());
        assertEquals(54, bhm.extract());
        assertEquals(22, bhm.extract());
        assertEquals(14, bhm.extract());
        assertEquals(11, bhm.extract());
        assertEquals(9, bhm.extract());


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

    @Test
    public void testHeapSort() {
        bhm.insert(81);
        bhm.insert(89);
        bhm.insert(9);
        bhm.insert(11);
        bhm.insert(14);
        bhm.insert(76);
        bhm.insert(54);
        bhm.insert(22);
        int[] sortedArray = bhm.heapSort();
        int[] modelSortedArray = new int[]{9, 11, 14, 22, 54, 76, 81, 89};
        for(int i = 0; i < 8;i++) {
            assertEquals(modelSortedArray[i], sortedArray[i]);
        }

    }
}