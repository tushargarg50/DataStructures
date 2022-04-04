package com.tg.datastructures.common;

public abstract class AbstractCollection implements Collection {

    private int size;

    protected AbstractCollection(int size) {
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
