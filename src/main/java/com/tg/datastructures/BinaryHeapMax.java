package com.tg.datastructures;

import java.util.Arrays;
import java.util.function.Function;

public class BinaryHeapMax {

    private static final int INITIAL_CAPACITY = 10;
    public static final int INCREMENT_FACTOR = 2;

    private int[] heap;
    private int size;
    private int capacity;

    BinaryHeapMax() {
        size = 0;
        capacity = INITIAL_CAPACITY;
        heap = new int[INITIAL_CAPACITY];
    }

    BinaryHeapMax(int capacity) {
        size = 0;
        this.capacity = capacity;
        heap = new int[capacity];
    }

    private final Function<Integer, Integer> parentIndex = x -> (x - 1) / 2;
    private final Function<Integer, Integer> leftChildIndex = x -> 2 * x + 1;
    private final Function<Integer, Integer> rightChildIndex = x -> 2 * x + 2;

    private final Function<Integer, Integer> parentValue = x -> heap[parentIndex.apply(x)];
    private final Function<Integer, Integer> leftChildValue = x -> heap[leftChildIndex.apply(x)];
    private final Function<Integer, Integer> rightChildValue = x -> heap[rightChildIndex.apply(x)];

    int extract() {
        if (size > 0) {
            int temp = swapAndGet(0, size - 1);
            size--;
            heapifyDown(0);
            return temp;
        }
        return -1;
    }

    private void heapifyDown(int index) {
        int leftChildVal = -1, rightChildVal = -1;
        if (leftChildIndex.apply(index) < size) {
            leftChildVal = leftChildValue.apply(index);
        }
        if (rightChildIndex.apply(index) < size) {
            rightChildVal = rightChildValue.apply(index);
        }
        if (leftChildVal > rightChildVal && leftChildVal != -1) {
            swapAndGet(index, leftChildIndex.apply(index));
            heapifyDown(leftChildIndex.apply(index));
        } else if (rightChildVal != -1) {
            swapAndGet(index, rightChildIndex.apply(index));
            heapifyDown(rightChildIndex.apply(index));
        }

    }

    private int swapAndGet(int x, int y) {
        int temp = heap[x];
        heap[x] = heap[y];
        heap[y] = temp;
        return temp;
    }


    void insert(int value) {
        increaseArraySizeIfRequired();
        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    private void heapifyUp(int index) {
        if (parentIndex.apply(index) >= 0 && heap[index] > parentValue.apply(index)) {
            swapAndGet(parentIndex.apply(index), index);
            heapifyUp(parentIndex.apply(index));
        }
    }

    private void increaseArraySizeIfRequired() {
        if (size >= capacity) {
            capacity = capacity * INCREMENT_FACTOR;
            heap = Arrays.copyOf(heap, capacity);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(i).append("[").append(heap[i]).append("]\n");
        }

        return builder.toString();
    }
}
