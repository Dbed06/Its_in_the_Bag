package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T> {

    private ArrayList<T> container;

    public Bag(Object container) {
        this.container = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return container.isEmpty();
    }

    @Override
    public int size() {
        return container.size();
    }

    @Override
    public void add(T item) {
        container.add(item);

    }
    @Override
    public Iterator<T> iterator() {
        return container.iterator();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bag{");
        sb.append("container=").append(container);
        sb.append('}');
        return sb.toString();
    }
}
