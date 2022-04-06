package com.tg.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreesTest {

    BinarySearchTrees bst = new BinarySearchTrees();

    @Test
    public void find() {
        bst.insert(Integer.valueOf(5), "Five");
        bst.insert(Integer.valueOf(3), "Three");
        bst.insert(Integer.valueOf(7), "Seven");
        bst.insert(Integer.valueOf(2), "Two");
        bst.insert(Integer.valueOf(4), "Four");
        bst.insert(Integer.valueOf(6), "Six");
        bst.insert(Integer.valueOf(8), "Eight");
        assertEquals(7, bst.size());
        assertEquals("Two", bst.find(Integer.valueOf(2)));
        assertEquals("Four", bst.find(Integer.valueOf(4)));
        assertEquals("Six", bst.find(Integer.valueOf(6)));
        assertEquals("Eight", bst.find(Integer.valueOf(8)));



    }

    @Test
    public void insert() {
        bst.insert(Integer.valueOf(5), "Five");
        bst.insert(Integer.valueOf(3), "Three");
        bst.insert(Integer.valueOf(7), "Seven");
        bst.insert(Integer.valueOf(2), "Two");
        bst.insert(Integer.valueOf(4), "Four");
        bst.insert(Integer.valueOf(6), "Six");
        bst.insert(Integer.valueOf(8), "Eight");
        assertEquals(7, bst.size());
        bst.preOrderTraversal();

        System.out.println();

        bst.inOrderTraversal();

        System.out.println();

        bst.postOrderTraversal();
    }
}